package generator.model;

import abstracts.MAssociation;
import abstracts.MAttribute;
import abstracts.MClass;
import abstracts.MContainment;
import sql_abstracts.Column;
import sql_abstracts.ForeignKey;
import sql_abstracts.PrimaryKey;
import sql_abstracts.Schema;
import sql_abstracts.Sql_abstractsFactory;
import sql_abstracts.Table;

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
					c.setType(a.getType());
					c.setName(a.getName());
					c.setNullable(a.isNullable());
					c.setComments(a.getComments());
					t.getLstColumns().add(c);
				}else {
					PrimaryKey c = Sql_abstractsFactory.eINSTANCE.createPrimaryKey();
					c.setType(a.getType());
					c.setName(a.getName());
					c.setNullable(false);
					c.setTable(t.getName());
					c.setComments(a.getComments());
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
	}
	
	public Table buscarTabla(String name) {
		for(Table t : modelFactorySQL.getLstSchema().get(0).getLstTables()) {
			if(t.getName().equals(name))
				return t;
		}
		
		return null;
	}
	public PrimaryKey buscarPK(String tName, String pkName) {
		for(Table t : modelFactorySQL.getLstSchema().get(0).getLstTables()) {
			if(tName.equalsIgnoreCase(t.getName())) {
				System.out.println(t.getName());
				System.out.println(t.getLstPrimaryKeys().size());
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
	
	
	
	
	