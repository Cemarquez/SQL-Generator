package generator.model;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;

import sql_abstracts.Column;
import sql_abstracts.ModelFactory;
import sql_abstracts.Schema;
import sql_abstracts.Table;

public class TransformationM2T_SQL {
	
	private ModelFactory modelFactory;
	private JFileChooser chooser = new JFileChooser();
	private File path;
	public TransformationM2T_SQL(ModelFactory modelFactory) {
		this.modelFactory = modelFactory;
	}

	public String transformarM2T() {
		
		String mensaje = "Se ha realziado la transformaci�n M2T SQL";
		
		for(Schema s : modelFactory.getLstSchema()) {
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			String nombreProyecto = s.getName();
			int returnVal = chooser.showOpenDialog(null);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		    	path =  chooser.getSelectedFile();
		    	crearSchema(s);
		    	
		    	
		    }else {
		    	mensaje = "Debe seleccionar una ubicaci�n para continuar!";
		    }
		}
		
		
		return mensaje;
	}

	private void crearSchema(Schema s) {
		StringBuilder textCodigo = new StringBuilder();
		textCodigo.append("CREATE DATABASE " + s.getName() +";\n");
		textCodigo.append("USE " + s.getName() +";\n");
		for(Table t : s.getLstTables()) {
			
			textCodigo.append(crearTables(t));
		}
		
		guardarArchivo(textCodigo.toString(),path.getPath() , s.getName());
		
	}

	private String crearTables(Table t) {
		String table ="";
		table+="CREATE TABLE " + t.getName() +"(\n";
		
		for(Column c : t.getLstColumns())
			table+=crearColumns(c);
		
		table+=");\n\n";
		return table;
	}

	private String crearColumns(Column c) {
		String col = "";
		return col;
	}
	
	
	
	
	
	
	private void guardarArchivo(String cadena, String ruta , String nombre) {
		try
		{
			//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
			
			File archivo=new File(ruta);
			//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
			FileWriter escribir=new FileWriter(archivo+"/"+nombre+".txt",true);
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
	
	

}