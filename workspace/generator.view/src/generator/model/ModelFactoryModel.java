package generator.model;

import abstracts.AbstractsFactory;
import concrete.ConcretePackage;
import concrete.MClassDiagram;
import sql_abstracts.Sql_abstractsFactory;

public class ModelFactoryModel {

	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder { 
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	//------------------------------  Singleton ------------------------------------------------
//	ModelFactory modelFactory = ConcreteFactory.eINSTANCE.createModelFactory();
	private abstracts.ModelFactory modelFactoryAbstracta;
	private concrete.ModelFactory modelFactoryConcreta;
	private sql_abstracts.ModelFactory modelFactorySQL;

	public ModelFactoryModel() {
	
	}

	
	public abstracts.ModelFactory cargarAbstracta() {
		abstracts.ModelFactory modelFactory = null;

		ConcretePackage whoownmePackage =  ConcretePackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/model/src/model/model.abstracts");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (abstracts.ModelFactory)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
		return modelFactory;
		
	
	}
	
	public sql_abstracts.ModelFactory cargarSQL() {
		sql_abstracts.ModelFactory modelFactory = null;

		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/model/src/model/model2.sql_abstracts");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (sql_abstracts.ModelFactory)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
		return modelFactory;
		
	
	}
	

	public concrete.ModelFactory cargarConcreta() {
		concrete.ModelFactory modelFactory = null;

		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/model/src/model/model.concrete");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (concrete.ModelFactory)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
	return modelFactory;
	}


	public void salvarAbstracta() {
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/model/src/model/model.abstracts");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryAbstracta);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}

		return;

}
	
	
	public void salvarAbstractaSQL() {
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/model/src/model/model2.sql_abstracts");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactorySQL);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}

		return;

}


	public void generarModelToModel() {
		modelFactoryAbstracta = cargarAbstracta();
		modelFactoryConcreta = cargarConcreta();
		TransformationM2M tM2M = new TransformationM2M(modelFactoryConcreta, modelFactoryAbstracta);
		tM2M.transformarM2M();
		salvarAbstracta();
		
	}
	
	public void generarModelToModelSQL() {
		modelFactoryAbstracta = cargarAbstracta();
		modelFactorySQL = cargarSQL();
		TransformationM2M_SQL m2m = new TransformationM2M_SQL(modelFactoryAbstracta, modelFactorySQL);
		m2m.transformarM2MSQL();
		salvarAbstractaSQL();
		
	}


	public void limpiarProduccion() {
		modelFactoryAbstracta =  AbstractsFactory.eINSTANCE.createModelFactory();
		salvarAbstracta();
		
		modelFactorySQL = Sql_abstractsFactory.eINSTANCE.createModelFactory();
		salvarAbstractaSQL();
			
			
		
	}

	
	public void generarModelToTextSQL() {
		modelFactorySQL = cargarSQL();
		TransformationM2T_SQL tM2T = new TransformationM2T_SQL(modelFactorySQL);
		tM2T.transformarM2T();
	}

	public void generarModelToText() {
		modelFactoryAbstracta = cargarAbstracta();
		TransformationM2T tM2T = new TransformationM2T(modelFactoryAbstracta);
		tM2T.transformarM2T();
		
	}

}
	

