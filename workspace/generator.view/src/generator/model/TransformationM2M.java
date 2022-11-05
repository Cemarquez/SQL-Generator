package generator.model;

import java.util.ArrayList;
import java.util.List;

import abstracts.AbstractsFactory;
import abstracts.Type;

public class TransformationM2M {
	private abstracts.ModelFactory modelFactoryAbstracta;
	private concrete.ModelFactory modelFactoryConcreta;
	
	/**
	 * Método constructor
	 * @param modelFactoryConcreta
	 * @param modelFactoryAbstracta
	 */
	public TransformationM2M(concrete.ModelFactory modelFactoryConcreta, abstracts.ModelFactory modelFactoryAbstracta) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
		this.modelFactoryConcreta = modelFactoryConcreta;
	}
	
	
	
	/**
	 * Método principal, desde el cual se llama a los demás
	 * @return
	 */
	public String transformarM2M() {
		String mensaje = "Se ha realziado la transformación M2M";
		for(concrete.MClassDiagram dConcreta : modelFactoryConcreta.getLstMDiagrams()) {
			modelFactoryAbstracta.setNombre(dConcreta.getName());
			//crear los paquetes
			for(concrete.MPackage p : dConcreta.getLstMPackage()) {
				crearPaquete(p);
			}
			
			for(concrete.MClass c : dConcreta.getLstMClass()) {
				crearClase(c);
			}
			
			for(concrete.MAssociation r : dConcreta.getLstMAssoctiation() ) {
				crearAssociation(r);
			}
			
			for(concrete.MInheritance r : dConcreta.getLstMInheritance() ) {
//				crearAssociation(r);
				crearHerencia(r);
			}
			
			for(concrete.MContainment c : dConcreta.getLstMContainment()) {
				crearContainment(c);
			}
			
		}
		
		return mensaje;
	}
	
	/**
	 * Método que verifica la existencia de una clase, crea una copia de tipo abstracto y la guarda
	 * @param c clase concreta
	 */
	private void crearClase(concrete.MClass c) {
		String path = c.getPath();
		abstracts.MPackage p = buscarPaqueteParent(path);
		abstracts.MClass cl = buscarClase(path, c.getName(), p);
		if(cl==null) {
			abstracts.MClass newClass = AbstractsFactory.eINSTANCE.createMClass();
			newClass.setPath(c.getPath());
			newClass.setName(c.getName());
			newClass.setComments(c.getComments());
			newClass.setAccessModifier(c.getAccessModifier());
			newClass.getLstFunction().addAll(crearFunciones(c));
			newClass.getLstAttributes().addAll(crearAtributos(c));
			p.getLstMClass().add(newClass);
			modelFactoryAbstracta.getLstAllClass().add(newClass);
		}
		
	}

	/**
	 * Método que verifica la existencia de una funcion, crea una copia de tipo abstracto y la guarda
	 * @param c clase concreta
	 */
	private List<abstracts.MFunction> crearFunciones(concrete.MClass cClass){
		List<abstracts.MFunction> funciones = new ArrayList<>();
		for(concrete.MFunction f : cClass.getLstMFunction()) {
			abstracts.MFunction newFunction = AbstractsFactory.eINSTANCE.createMFunction();
			newFunction.setAccessModifier(f.getAccessModifier());
			newFunction.setComments(f.getComments());
			newFunction.setName(f.getName());
			newFunction.setParameters(f.getParameters());
			newFunction.setSemantics(f.getSemantics());
			funciones.add(newFunction);
		}
		return funciones;
	}
	
	/**
	 * Método que verifica la existencia de una relación de tipo herencia, crea una copia de tipo abstracto y la guarda
	 * @param c clase concreta
	 */
	private void crearHerencia(concrete.MInheritance relacion) {
		abstracts.MPackage pSource = buscarPaqueteParent(relacion.getSource().getPath());
		abstracts.MClass clSource = buscarClase(relacion.getSource().getPath(), relacion.getSource().getName(), pSource);
		
		abstracts.MPackage pTarget = buscarPaqueteParent(relacion.getTarget().getPath());
		abstracts.MClass clTarget = buscarClase(relacion.getTarget().getPath(), relacion.getTarget().getName(), pTarget);
		
		abstracts.MInheritance h = AbstractsFactory.eINSTANCE.createMInheritance();
		h.setSource(clSource);
		h.setTarget(clTarget);
		clSource.getLstMInheritance().add(h);
	}
	
	/**
	 * Método que verifica la existencia de una relación de tipo asociación, crea una copia de tipo abstracto y la guarda
	 * @param c clase concreta
	 */
	private void crearAssociation(concrete.MAssociation relacion) {
		abstracts.MPackage pSource = buscarPaqueteParent(relacion.getSource().getPath());
		abstracts.MClass clSource = buscarClase(relacion.getSource().getPath(), relacion.getSource().getName(), pSource);
		
		abstracts.MPackage pTarget = buscarPaqueteParent(relacion.getTarget().getPath());
		abstracts.MClass clTarget = buscarClase(relacion.getTarget().getPath(), relacion.getTarget().getName(), pTarget);
		
		abstracts.MAssociation anewS = AbstractsFactory.eINSTANCE.createMAssociation();
		anewS.setMultiplicitySource(relacion.getMultiplicitySource());
		anewS.setMultiplicityTarget(relacion.getMultiplicityTarget());
		anewS.setSource(clSource);
		anewS.setTarget(clTarget);
		anewS.setSourceRole(relacion.getSourceRole());
		anewS.setTargetRole(relacion.getTargetRole());
		clSource.getLstMAssoctiation().add(anewS);
		
		if(relacion.isBidirectional()) {
			abstracts.MAssociation anewT = AbstractsFactory.eINSTANCE.createMAssociation();
			anewT.setMultiplicitySource(relacion.getMultiplicityTarget());
			anewT.setMultiplicityTarget(relacion.getMultiplicitySource());
			anewT.setSource(clTarget);
			anewT.setTarget(clSource);
			anewT.setSourceRole(relacion.getTargetRole());
			anewT.setTargetRole(relacion.getSourceRole());
			clTarget.getLstMAssoctiation().add(anewT);
		}
	
		
		
	}
	
	/**
	 * Método que verifica la existencia de una relación de tipo containment, crea una copia de tipo abstracto y la guarda
	 * @param c clase concreta
	 */
	private void crearContainment(concrete.MContainment relacion) {
		abstracts.MPackage pSource = buscarPaqueteParent(relacion.getSource().getPath());
		abstracts.MClass clSource = buscarClase(relacion.getSource().getPath(), relacion.getSource().getName(), pSource);
		
		abstracts.MPackage pTarget = buscarPaqueteParent(relacion.getTarget().getPath());
		abstracts.MClass clTarget = buscarClase(relacion.getTarget().getPath(), relacion.getTarget().getName(), pTarget);
		
		abstracts.MContainment anewS = AbstractsFactory.eINSTANCE.createMContainment();
		anewS.setSource(clSource);
		anewS.setTarget(clTarget);
		anewS.setMultiplicityTarget(relacion.getMultiplicityTarget());
		anewS.setSourceRole(relacion.getSourceRole());
		anewS.setTargetRole(relacion.getTargetRole());
		clTarget.getLstMContainment().add(anewS);
		
	}
	
	/**
	 * Método que verifica la existencia de un atributo, crea una copia de tipo abstracto y la guarda
	 * @param c clase concreta
	 */
	private List<abstracts.MAttribute> crearAtributos(concrete.MClass cClass){
		List<abstracts.MAttribute> atributos = new ArrayList<>();
		for(concrete.MAttribute a : cClass.getLstMAttribute()) {
			abstracts.MAttribute newAttribute = AbstractsFactory.eINSTANCE.createMAttribute();
			newAttribute.setComments(a.getComments());
			newAttribute.setConstant(a.isConstant());
			newAttribute.setDefaultValue(a.getDefaultValue());
			newAttribute.setName(a.getName());
			newAttribute.setRemoveToInit(a.isRemoveToInit());
			newAttribute.setType(Type.getByName(a.getType().toString()));
			if(newAttribute.getType() == Type.NUMERIC)
				newAttribute.setSize(null);
			else
				newAttribute.setSize(a.getSize());
			newAttribute.setPrimaryKey(a.isPrimaryKey());
			newAttribute.setNullable(a.isNullable());
			newAttribute.setForeignKey(a.isForeignKey());
			atributos.add(newAttribute);
		}
		
		return atributos;
	}
	
	/**
	 * Método que verifica la existencia de un paquete dentro de la sintaxis abstracta 
	 * @param path
	 */
	private abstracts.MPackage buscarPaqueteParent(String path){
		abstracts.MPackage mpF = null;
		for(abstracts.MPackage mp : modelFactoryAbstracta.getLstPackages()) {
			if(mp.getName().equals(path)) {
				return mp;
			}else {
				mpF = buscarPaquete(path, mp);
			}
			if(mpF!=null) 
				return mpF;
		}
		return null;
	}
	
	/**
	 * Método que verifica la existencia de un paquete dentro de la sintaxis abstracta 
	 * @param path, parent
	 */
	private abstracts.MPackage buscarPaquete(String path, abstracts.MPackage parent) {
		for (abstracts.MPackage p : parent.getLstMPackage()) {
			if((p.getPath()+p.getName()).equals(path)) {
				return p;
			}
			if(!p.getLstMPackage().isEmpty()) {
				abstracts.MPackage paquete = buscarPaquete(path, p);
				if(paquete!=null) {
					return paquete;
				}
			}
		}
		
		
		return null;
	
	}
	
	/**
	 * Método que verifica la existencia de una clase dentro de la sintaxis abstracta
	 * @param path
	 * @param name
	 * @param mp
	 * @return
	 */
	private abstracts.MClass buscarClase(String path, String name, abstracts.MPackage mp) {
		for(abstracts.MClass c : mp.getLstMClass()) {
			if(c.getName().equals(name) && c.getPath().equals(path)) {
				return c;
			}
		}
		
		return null;
	}

		
	

	/**
	 * Método que verifica la existencia de un paquete, crea una copia de tipo abstracto y la guarda
	 * @param paquete
	 */
	private void crearPaquete(concrete.MPackage paquete) {
		String ruta = "";
		String[] split = null;
		if(paquete.getPath()==null) {
			ruta = paquete.getName();
			split = new String[1];
			split[0] = ruta;
		}else {
			ruta = paquete.getPath()+paquete.getName();
			split = ruta.split("/");
		}
		abstracts.MPackage paqueteParent = null;
		
		String nuevaRuta="";
		for(int i=0;i<split.length;i++) {
			String nombrePaquete = split[i];
			paqueteParent = obtenerPaqueteAbstracta(nombrePaquete, nuevaRuta, paqueteParent);
			nuevaRuta += split[i]+"/";
			
		}
	}
	

	
	private abstracts.MPackage obtenerPaqueteAbstracta(String nombrePaquete, String nuevaRuta,
			abstracts.MPackage paqueteParent) {
		
		if(paqueteParent == null) {
			for (int i = 0; i < modelFactoryAbstracta.getLstPackages().size(); i++) {
				if(modelFactoryAbstracta.getLstPackages().get(i).getName().equals(nombrePaquete)) {
					return modelFactoryAbstracta.getLstPackages().get(i);
				}
			}
			abstracts.MPackage nuevoPackage = AbstractsFactory.eINSTANCE.createMPackage();
			nuevoPackage.setName(nombrePaquete);
			nuevoPackage.setPath(nuevaRuta);
			modelFactoryAbstracta.getLstPackages().add(nuevoPackage);
			modelFactoryAbstracta.getLstAllPackage().add(nuevoPackage);
			return nuevoPackage;

		}else {
			for (int i = 0; i < paqueteParent.getLstMPackage().size(); i++) {
				if(paqueteParent.getLstMPackage().get(i).getName().equals(nombrePaquete)) {
					if(paqueteParent.getLstMPackage().get(i).getPath().equals(nuevaRuta))
					{
						return paqueteParent.getLstMPackage().get(i);
					}
				}
			}
		}
		
		abstracts.MPackage nuevoPackage = AbstractsFactory.eINSTANCE.createMPackage();
		nuevoPackage.setName(nombrePaquete);
		nuevoPackage.setPath(nuevaRuta);
		paqueteParent.getLstMPackage().add(nuevoPackage);
		modelFactoryAbstracta.getLstAllPackage().add(nuevoPackage);
		return nuevoPackage;
	}
	
}
