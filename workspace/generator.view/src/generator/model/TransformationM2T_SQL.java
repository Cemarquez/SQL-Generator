package generator.model;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;

import sql_abstracts.Column;
import sql_abstracts.ForeignKey;
import sql_abstracts.ModelFactory;
import sql_abstracts.PrimaryKey;
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
		
		String mensaje = "Se ha realziado la transformación M2T SQL";
		
		for(Schema s : modelFactory.getLstSchema()) {
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int returnVal = chooser.showOpenDialog(null);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		    	path =  chooser.getSelectedFile();
		    	crearSchema(s);
		    	
		    	
		    }else {
		    	mensaje = "Debe seleccionar una ubicación para continuar!";
		    }
		}
		
		
		return mensaje;
	}

	private void crearSchema(Schema s) {
		StringBuilder textCodigo = new StringBuilder();
		textCodigo.append("CREATE DATABASE " + s.getName() +";\n\n");
		textCodigo.append("USE " + s.getName() +";\n\n");
		
		textCodigo.append("-- Creación de las tablas \n\n");
		for(Table t : s.getLstTables()) {
			
			textCodigo.append(crearTables(t));
		}
		
		for(Table t : s.getLstTables()) {
			for(ForeignKey fk : t.getLstForeignKeys()) {
				textCodigo.append(crearForeignKey(fk, t));
			}
		}
		
		
		textCodigo.append("\n-- Creación de los disparadores \n");
		for(Table t : s.getLstTables()) {
			textCodigo.append(crearTriggersInsert(t));
			textCodigo.append(crearTriggersUpdate(t));
			textCodigo.append(crearTriggersDelete(t));
			textCodigo.append("\n");
		}
		
		
		
		guardarArchivo(textCodigo.toString(),path.getPath() , s.getName());
		
	}

	private String crearTables(Table t) {
		String table ="";
		table+="CREATE TABLE " + t.getName() +" (\n";
		int variables = t.getLstColumns().size()+t.getLstForeignKeys().size()+t.getLstPrimaryKeys().size();
		int cont=0;
		String nullable="";
		String size ="";
		for(Column c : t.getLstColumns()) {
			nullable="";
			if(!c.isNullable()) 
				nullable = " NOT NULL";
			
			if(c.getSize() != null)
				size = "("+c.getSize()+")";
			
			if(cont==variables-1)
			table+="\t" + c.getName() + "\t" + c.getType().toString().toUpperCase()+size+ nullable+"\n";
			else {
			table+="\t" + c.getName() + "\t" + c.getType().toString().toUpperCase()+size+ nullable+",\n";
			cont++;
			}
		}
		
		for(PrimaryKey c : t.getLstPrimaryKeys()) {
			nullable="";
			size ="";
			if(!c.isNullable())
				nullable = " NOT NULL";
			
			if(c.getSize() != null)
				size = "("+c.getSize()+")";
			
			if(cont==variables-1)
				table+="\t" + c.getName() + "\t" + c.getType().toString().toUpperCase()+size+ nullable+"\n";
				else {
				table+="\t" + c.getName() + "\t" + c.getType().toString().toUpperCase()+size+ nullable+",\n";
				cont++;
				}
		}
		
		for(ForeignKey c : t.getLstForeignKeys()) {
			nullable="";
			size ="";
			if(!c.isNullable()) 
				nullable = " NOT NULL";
			
			if(c.getSize() != null)
				size = "("+c.getSize()+")";
			
			if(cont==variables-1)
				table+="\t" + c.getName() + "\t" + c.getType().toString().toUpperCase()+size+ nullable+"\n";
				else {
				table+="\t" + c.getName() + "\t" + c.getType().toString().toUpperCase()+size+ nullable+",\n";
				cont++;
				}
		}
		
		
		table+=");\n\n";
		
		for(PrimaryKey pk : t.getLstPrimaryKeys())
			table+="ALTER TABLE " + t.getName() + " ADD CONSTRAINT " +"pk"+ pk.getName() + " PRIMARY KEY ( "+ pk.getName() +" ); \n\n";
		
		return table;
	}

	
	private String crearForeignKey(ForeignKey fk, Table t) {
		String f ="ALTER TABLE " +t.getName() +"\n";
		f+= "\tADD CONSTRAINT " +"fk" + fk.getName()+ " FOREIGN KEY ( " + fk.getName() + " ) \n";
		f+= "\t\tREFERENCES " + fk.getReferPrimaryKey().getTable()+ " ( " + fk.getReferPrimaryKey().getName() + " ); \n";
		
		
		return f;
	}
	
	private String crearTriggersInsert(Table t){
		
		String trigger ="\n";
		trigger+= "CREATE TRIGGER " + "d_" + t.getName()+"Insert\n";
		
		trigger+="\tBEFORE INSERT\n";
		trigger+="\t\tON " + t.getName()+" FOR EACH ROW\n";
		trigger+="BEGIN\n\n";
		trigger+="END;\n";
		
		  return trigger;
	}
	
	private String crearTriggersUpdate(Table t){
		
		String trigger ="\n";
		trigger+= "CREATE TRIGGER " + "d_" + t.getName()+"Update\n";
		
		trigger+="\tBEFORE UPDATE\n";
		trigger+="\t\tON " + t.getName()+" FOR EACH ROW\n";
		trigger+="BEGIN\n\n";
		trigger+="END;\n";
		
		  return trigger;
	}
	
	private String crearTriggersDelete(Table t){
		
		String trigger ="\n";
		trigger+= "CREATE TRIGGER " + "d_" + t.getName()+"Delete\n";
		
		trigger+="\tBEFORE DELETE\n";
		trigger+="\t\tON " + t.getName()+" FOR EACH ROW\n";
		trigger+="BEGIN\n\n";
		trigger+="END;\n";
		
		  return trigger;
	}
	
	private void guardarArchivo(String cadena, String ruta , String nombre) {
		try{
			File archivo=new File(ruta);
			FileWriter escribir=new FileWriter(archivo+"/"+nombre+".txt",true);
			escribir.write(cadena);
			escribir.close();
		}catch(Exception e){
			System.out.println("Error al Guardar");
		}

	}
	
	

}
