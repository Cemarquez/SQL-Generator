package generator.model;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import abstracts.MClass;
import abstracts.MContainment;
import abstracts.MInheritance;

public class TransformationM2T {
	private abstracts.ModelFactory modelFactoryAbstracta;
	private JFileChooser chooser = new JFileChooser();
	
	public TransformationM2T(abstracts.ModelFactory modelFactoryAbstracta) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
	}
	
	/**
	 * Método principal que llama a los demás
	 * @return
	 */
	public String transformarM2T() {
		
		String mensaje = "Se ha realziado la transformación M2T";
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		String nombreProyecto ="RubyGeneration";
		int returnVal = chooser.showOpenDialog(null);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	    	File f =  chooser.getSelectedFile();
	    	limpiarTexto(f.getPath()+"/"+nombreProyecto);
	    	f = new File(f.getPath()+"/"+nombreProyecto);
	    	System.out.println("Creacion de paquetes:");
	    	crearCarpetas(f.getPath());
	    	
	    	System.out.println();
	    	System.out.println("Creacion de clases:");
			for (abstracts.MClass cl : modelFactoryAbstracta.getLstAllClass()) {
				 System.out.println(crearClase(f.getPath(), cl));
			}
	    	
	    }else {
	    	
	    	mensaje = "Debe seleccionar una ubicación para continuar!";
	    }
	   
	    
		return mensaje;
	}
	
	/**
	 * Método que crea una clase, con sus atributos, funciones, relaciones y guarda el archivo.
	 * @param path
	 * @param cl
	 * @return
	 */
	private String crearClase(String path, MClass cl) {
		StringBuilder textoCodigo = new StringBuilder();
		MClass classTarget = obtenerHerencia(cl);
		textoCodigo.append("=begin\n");
		if(cl.getComments() == null) {
			textoCodigo.append("Auto-generated code");
		}else {
			textoCodigo.append(cl.getComments());
		}
		
		textoCodigo.append("\n=end\n");
		
		if(classTarget!=null) {
			textoCodigo.append("class "+cl.getName() + " < "+classTarget.getName()+"\n");
		}else {
			textoCodigo.append("class "+cl.getName() + "\n");
		}
		
		
		//Creación de atributos
		textoCodigo.append(crearAtributos(cl)+"\n");
		
		
		//Creación de constructor
		textoCodigo.append(crearConstructor(cl, classTarget) +"\n");
		
		if(!cl.getLstMContainment().isEmpty()) {
			textoCodigo.append(crearConstructorVacio() +"\n");
			textoCodigo.append(crearContainment(cl) +"\n");
		}
		
		//Creación de funciones
		textoCodigo.append(crearFunciones(cl));
		
		
		
		textoCodigo.append("end");
		
		
		
		guardarArchivo(textoCodigo.toString(), path, cl.getPath()+"/"+cl.getName());
		
		return "Se ha generado la clase "+cl.getName();
		
	}
	
	/**
	 * Método que verifica la existencia de una herencia en la clase
	 * @param cl
	 * @return
	 */
	private MClass obtenerHerencia(MClass cl) {
		for(MInheritance h : cl.getLstMInheritance()) {
			if(h.getSource().getPath().equals(cl.getPath()) && h.getSource().getName().equals(cl.getName())) {
				return h.getTarget();
			}
		}
		
		return null;
	}
	
	/**
	 * Método que crea los atributos de una clase
	 * @param cl
	 * @return
	 */
	private String crearAtributos(abstracts.MClass cl) {
		//Creación de atributos
		String attr ="";
				if(!cl.getLstAttributes().isEmpty()) {
					attr ="\tattr_accessor ";
					for(int i=0;i<cl.getLstAttributes().size();i++) {
						abstracts.MAttribute a = cl.getLstAttributes().get(i);
						if(i<cl.getLstAttributes().size()-1) {
							attr += ":" + a.getName() + ", ";
						}else {
							attr += ":" + a.getName();
						}
					}
					
					for(int i=0;i<cl.getLstMContainment().size();i++) {
						abstracts.MContainment mc = cl.getLstMContainment().get(i);
							attr += ", :" + mc.getSourceRole();
					}
					
					for(int i=0;i<cl.getLstMAssoctiation().size();i++) {
						abstracts.MAssociation ma = cl.getLstMAssoctiation().get(i);
						attr += ", :" + ma.getTargetRole();
						
					}
					attr+="\n";
		
				}
				return attr;
	}
	
	/**
	 * Método que crea la relación de containment de una clase
	 * @param cl
	 * @return
	 */
	private String crearContainment(abstracts.MClass cl) {
		String cont="";
		for(MContainment c : cl.getLstMContainment()) {
			cont+= "\tdef create"+c.getSource().getName() + "()\n";
			cont+= "\t\treturn " + c.getSource().getName()+".new()\n" ;
			cont+= "\tend\n";
		}
		
		return cont;
	}
	
	/**
	 * Método que genera un constructor vacío
	 * @return
	 */
	private String crearConstructorVacio() {
		String constructor ="\tdef initialize()\n";
		constructor +="\t\tsuper()\n";
		constructor +="\tend\n";
		
		return constructor;
	}
	/**
	 * Método que crea las funciones de una clase
	 * @param cl
	 * @return
	 */
	private String crearFunciones(abstracts.MClass cl) {
		String funciones = "";
		
		for(abstracts.MFunction mf : cl.getLstFunction()) {
			if(mf.getComments()!=null) 
				funciones += "\t#"+ mf.getComments() +"\n";
				
			funciones += "\tdef "+mf.getName()+"("+mf.getParameters()+")"+"\n";
			if(mf.getSemantics()==null) {
				funciones += "\t\t" + "#TODO Auto-generated method stub"+"\n";
			}else {

				funciones += "\t\t" + mf.getSemantics()+"\n";
			}
			funciones+= "\tend\n";
		}
		return funciones;
	}
	
	
	/**
	 * Método que verifica la herencia y crea el constructor de la clase
	 * @param cl
	 * @param clTarget
	 * @return
	 */
	private String crearConstructor(abstracts.MClass cl, abstracts.MClass clTarget ) {
		String constructor ="\tdef initialize(";
		if(!cl.getLstAttributes().isEmpty() || clTarget!=null) {
			String semantic = "\t\tsuper(";
			
			//Herencia
			if(clTarget!=null)
			for(int i=0;i<clTarget.getLstAttributes().size();i++) {
				abstracts.MAttribute a = clTarget.getLstAttributes().get(i); 
				if(!a.isRemoveToInit()) {
					constructor += a.getName() + ", ";
					if(i<clTarget.getLstAttributes().size()-1) {
						semantic += a.getName() + ", ";
						
					}else {
						semantic += a.getName();
					}
				}
				
			}
			semantic+=") \n";
			
			//Propios
			for(int i=0;i<cl.getLstAttributes().size();i++) {
				abstracts.MAttribute a = cl.getLstAttributes().get(i); 
				if(!a.isRemoveToInit()) {
					semantic+= "\t\tself."+a.getName() +" = " + a.getName() +"\n";
					if(i<cl.getLstAttributes().size()-1) {
						constructor += a.getName() + ", ";
					}else {
						constructor += a.getName();
					}
				}
			}
			
			
			if(constructor.charAt(constructor.length()-2) ==',') {
				constructor = replaceLast(constructor, ", ", "");
			}
			
			constructor+=") \n";
			constructor+= semantic +"\n";

		}else {
			constructor+=") \n\t\tsuper(); \n";
		}
		
		return constructor +"\tend \n";
	}
	
	/**
	 * Método que remplaza la última ocurrencia de un String
	 * @param text
	 * @param regex
	 * @param replacement
	 * @return
	 */
	public String replaceLast(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)(.*)" + regex, "$1" + replacement);
    }

	
	/**
	 * Método que guarda el archivo en una ruta especificada
	 * @param cadena
	 * @param ruta
	 * @param nombre
	 */
	private void guardarArchivo(String cadena, String ruta , String nombre) {
		try
		{
			//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
			
			File archivo=new File(ruta);
			//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
			FileWriter escribir=new FileWriter(archivo+"/"+nombre+".rb",true);
			//Escribimos en el archivo con el metodo write 
			escribir.write(cadena);

			//Cerramos la conexion
			escribir.close();
		}

		//Si existe un problema al escribir cae aqui
		catch(Exception e)
		{
			System.out.println("Error al Guardar");
		}

	}

	/**
	 * Método que crea las carpetas
	 * @param parentPath
	 */
	private void crearCarpetas(String parentPath) {
		for(abstracts.MPackage mp : modelFactoryAbstracta.getLstAllPackage()) {
			File f = new File(parentPath+"/"+mp.getPath()+"/"+mp.getName());
			if(!f.exists()) {
				f.mkdirs();
				System.out.println("creada la carpeta: " + f.getName());
			}
		}
	}
	
	private void limpiarTexto(String sDirectorio) {
		File f = new File(sDirectorio);
		if(!f.exists()) {
			f.mkdirs();
		}else {
			if (f.delete())
				 System.out.println("Proyecto limpiado!");
				else
				 System.out.println("No se pudo limpiar!");
		}
	
	}
}
