package generator.model;

import abstracts.MAssociation;
import abstracts.MAttribute;
import abstracts.MClass;
import abstracts.MContainment;
import abstracts.MInheritance;
import sql_abstracts.Column;
import sql_abstracts.ForeignKey;
import sql_abstracts.PrimaryKey;
import sql_abstracts.Schema;
import sql_abstracts.Sql_abstractsFactory;
import sql_abstracts.Table;
import sql_abstracts.Type;

public class TransformationM2M_SQL {

	
	private abstracts.ModelFactory modelFactoryAbstracta; 
	private sql_abstracts.ModelFactory modelFactorySQL;
	
	public TransformationM2M_SQL(abstracts.ModelFactory modelFactoryAbstracta, sql_abstracts.ModelFactory modelFactorySQL) {
		this.modelFactoryAbstracta = modelFactoryAbstracta;
		this.modelFactorySQL = modelFactorySQL;
	}

	public String transformarM2MSQL() {
		Schema schema = Sql_abstractsFactory.eINSTANCE.createSchema();
		schema.setName(modelFactoryAbstracta.getNombre());
		modelFactorySQL.getLstSchema().add(schema);
		String mensaje ="La transformación M2M SQL se ha realizado";
		for(MClass cl : modelFactoryAbstracta.getLstAllClass()) {
			Table t = Sql_abstractsFactory.eINSTANCE.createTable();
			t.setName(cl.getName());
			schema.getLstTables().add(t);
			
			crearColumnas(cl, t);
			
		}
		
		for(MClass cl : modelFactoryAbstracta.getLstAllClass()) {
			crearForeignKey(cl);
			
		}
		
		
		
		
		
		
		return mensaje;
	}
	
	public String crearColumnas(MClass cl, Table t) {
		String mensaje ="Columnas generadas";
		for(MAttribute a : cl.getLstAttributes()) {
			if(!a.isForeignKey()) {
				if(!a.isPrimaryKey()) {
					Column c = Sql_abstractsFactory.eINSTANCE.createColumn();
					c.setType(Type.getByName(a.getType().toString()));
					c.setSize(a.getSize());
					c.setName(a.getName());
					c.setNullable(a.isNullable());
					c.setComments(a.getComments());
					t.getLstColumns().add(c);
				}else {
					PrimaryKey c = Sql_abstractsFactory.eINSTANCE.createPrimaryKey();
					c.setType(Type.getByName(a.getType().toString()));
					c.setSize(a.getSize());
					c.setName(a.getName());
					c.setNullable(false);
					c.setTable(t.getName());
					t.getLstPrimaryKeys().add(c);
					
				}
			}
			
			
			
		}
		return mensaje;
	}
	
	public void crearForeignKey(MClass cl) {
		
		for(MContainment a : cl.getLstMContainment()) {
			for(MAttribute at : a.getTarget().getLstAttributes()) {
				if(at.isForeignKey()) {
					Table tTarget = buscarTabla(a.getTarget().getName());
					PrimaryKey pk = buscarPK(a.getSource().getName(), at.getName());
					ForeignKey f = Sql_abstractsFactory.eINSTANCE.createForeignKey();
					f.setName(at.getName());
					f.setNullable(at.isNullable());
					f.setType(pk.getType());
					f.setReferPrimaryKey(pk);
					pk.getLstReferForeignKeys().add(f);
					tTarget.getLstForeignKeys().add(f);
				}
			}
		}
		
		for(MAssociation a : cl.getLstMAssoctiation()) {
			if(a.getMultiplicitySource().equals("1") && a.getMultiplicityTarget().equals("n")) {
				for(MAttribute at : a.getTarget().getLstAttributes()) {
					if(at.isForeignKey()) {
						Table tTarget = buscarTabla(a.getTarget().getName());
						PrimaryKey pk = buscarPK(a.getSource().getName(), at.getName());
						ForeignKey f = Sql_abstractsFactory.eINSTANCE.createForeignKey();
						f.setName(at.getName());
						f.setNullable(at.isNullable());
						f.setType(pk.getType());
						f.setSize(pk.getSize());
						f.setReferPrimaryKey(pk);
						pk.getLstReferForeignKeys().add(f);
						tTarget.getLstForeignKeys().add(f);
					}
				}
			}
			

			crearIntermedias(a);
		}
		
		for(MInheritance a : cl.getLstMInheritance()) {
			Table t= Sql_abstractsFactory.eINSTANCE.createTable();
			t.setName(a.getTarget().getName());
			modelFactorySQL.getLstSchema().get(0).getLstTables().add(t);
			for(MAttribute at : a.getTarget().getLstAttributes()) {
				
				if(at.isPrimaryKey()) {
					PrimaryKey pk = Sql_abstractsFactory.eINSTANCE.createPrimaryKey();
					pk.setName(at.getName());
					pk.setTable(a.getTarget().getName());
					pk.setType(Type.getByName(at.getType().toString()));
					pk.setSize(at.getSize());
					pk.setNullable(false);
					t.getLstPrimaryKeys().add(pk);
					
				}else if(at.isForeignKey()) {
					PrimaryKey pk = buscarPK(a.getSource().getName(), at.getName());
					ForeignKey f = Sql_abstractsFactory.eINSTANCE.createForeignKey();
					f.setName(at.getName());
					f.setNullable(at.isNullable());
					f.setType(pk.getType());
					f.setSize(pk.getSize());
					f.setReferPrimaryKey(pk);
					pk.getLstReferForeignKeys().add(f);
					t.getLstForeignKeys().add(f);
					
				}else {
					Column c = Sql_abstractsFactory.eINSTANCE.createColumn();
					c.setType(Type.getByName(at.getType().toString()));
					c.setSize(at.getSize());
					c.setName(at.getName());
					c.setNullable(at.isNullable());
					c.setComments(at.getComments());
					t.getLstColumns().add(c);
				}
			}
			
			for(MAttribute at : a.getTarget().getLstAttributes()) {
				if(at.isPrimaryKey()) {
					PrimaryKey pk = Sql_abstractsFactory.eINSTANCE.createPrimaryKey();
					pk.setName(at.getName());
					pk.setTable(a.getTarget().getName());
					pk.setType(Type.getByName(at.getType().toString()));
					pk.setSize(at.getSize());
					pk.setNullable(false);
					t.getLstPrimaryKeys().add(pk);
					
				}else if(at.isForeignKey()) {
					PrimaryKey pk = buscarPK(a.getSource().getName(), at.getName());
					ForeignKey f = Sql_abstractsFactory.eINSTANCE.createForeignKey();
					f.setName(at.getName());
					f.setNullable(at.isNullable());
					f.setType(pk.getType());
					f.setSize(pk.getSize());
					f.setReferPrimaryKey(pk);
					pk.getLstReferForeignKeys().add(f);
					t.getLstForeignKeys().add(f);
					
				}else {
					Column c = Sql_abstractsFactory.eINSTANCE.createColumn();
					c.setType(Type.getByName(at.getType().toString()));
					c.setSize(at.getSize());
					c.setName(at.getName());
					c.setNullable(at.isNullable());
					c.setComments(at.getComments());
					t.getLstColumns().add(c);
				}
			}
		}
		
	}
	
	private void crearIntermedias(MAssociation a){
		if(a.getMultiplicitySource().equalsIgnoreCase("n") && a.getMultiplicityTarget().equalsIgnoreCase("n")) {
			Table t = Sql_abstractsFactory.eINSTANCE.createTable();
			t.setName(a.getSource().getName() + a.getTarget().getName());
			PrimaryKey pk = Sql_abstractsFactory.eINSTANCE.createPrimaryKey();
			pk.setName(t.getName()+"_ID");
			pk.setNullable(false);
			pk.setTable(t.getName());
			pk.setType(Type.NUMERIC);
			PrimaryKey pkOrigen=null;
			PrimaryKey pkDestino=null;
			
			for(MAttribute at : a.getSource().getLstAttributes()) 
				if(at.isPrimaryKey()) {
					pkOrigen = buscarPK(a.getSource().getName(), at.getName());
					break;
				}
				
			for(MAttribute at : a.getTarget().getLstAttributes()) 
				if(at.isPrimaryKey()) {
					pkDestino = buscarPK(a.getTarget().getName(), at.getName());
					break;
				}
		
			ForeignKey fkOrigen = Sql_abstractsFactory.eINSTANCE.createForeignKey();
			fkOrigen.setName(pkOrigen.getName());
			fkOrigen.setNullable(true);
			fkOrigen.setReferPrimaryKey(pkOrigen);
			fkOrigen.setType(pkOrigen.getType());
			fkOrigen.setSize(pkOrigen.getSize());
			
			ForeignKey fkDestino = Sql_abstractsFactory.eINSTANCE.createForeignKey();
			fkDestino.setName(pkDestino.getName());
			fkDestino.setNullable(true);
			fkDestino.setReferPrimaryKey(pkDestino);
			fkDestino.setType(pkDestino.getType());
			fkDestino.setSize(pkDestino.getSize());
			
			t.getLstPrimaryKeys().add(pk);
			t.getLstForeignKeys().add(fkDestino);
			t.getLstForeignKeys().add(fkOrigen);
			modelFactorySQL.getLstSchema().get(0).getLstTables().add(t);
			
		}
	}
	
	private Table buscarTabla(String name) {
		for(Table t : modelFactorySQL.getLstSchema().get(0).getLstTables()) {
			if(t.getName().equals(name))
				return t;
		}
		
		return null;
	}
	public PrimaryKey buscarPK(String tName, String pkName) {
		for(Table t : modelFactorySQL.getLstSchema().get(0).getLstTables()) {
			if(tName.equalsIgnoreCase(t.getName())) {
				for(PrimaryKey pk : t.getLstPrimaryKeys()) {
					System.out.println(pk.getName());
					if(pk.getName().equals(pkName))
						return pk;
				}
			}
		}
		
		return null;
	}
	
	
}
	
	
	
	
	