/**
 */
package abstracts.util;

import abstracts.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see abstracts.AbstractsPackage
 * @generated
 */
public class AbstractsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AbstractsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractsSwitch<Adapter> modelSwitch =
		new AbstractsSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactory(ModelFactory object) {
				return createModelFactoryAdapter();
			}
			@Override
			public Adapter caseMPackage(MPackage object) {
				return createMPackageAdapter();
			}
			@Override
			public Adapter caseMClassDiagram(MClassDiagram object) {
				return createMClassDiagramAdapter();
			}
			@Override
			public Adapter caseMClass(MClass object) {
				return createMClassAdapter();
			}
			@Override
			public Adapter caseMAssociation(MAssociation object) {
				return createMAssociationAdapter();
			}
			@Override
			public Adapter caseMInheritance(MInheritance object) {
				return createMInheritanceAdapter();
			}
			@Override
			public Adapter caseMContainment(MContainment object) {
				return createMContainmentAdapter();
			}
			@Override
			public Adapter caseMAttribute(MAttribute object) {
				return createMAttributeAdapter();
			}
			@Override
			public Adapter caseMFunction(MFunction object) {
				return createMFunctionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link abstracts.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracts.ModelFactory
	 * @generated
	 */
	public Adapter createModelFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracts.MPackage <em>MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracts.MPackage
	 * @generated
	 */
	public Adapter createMPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracts.MClassDiagram <em>MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracts.MClassDiagram
	 * @generated
	 */
	public Adapter createMClassDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracts.MClass <em>MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracts.MClass
	 * @generated
	 */
	public Adapter createMClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracts.MAssociation <em>MAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracts.MAssociation
	 * @generated
	 */
	public Adapter createMAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracts.MInheritance <em>MInheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracts.MInheritance
	 * @generated
	 */
	public Adapter createMInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracts.MContainment <em>MContainment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracts.MContainment
	 * @generated
	 */
	public Adapter createMContainmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracts.MAttribute <em>MAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracts.MAttribute
	 * @generated
	 */
	public Adapter createMAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracts.MFunction <em>MFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracts.MFunction
	 * @generated
	 */
	public Adapter createMFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AbstractsAdapterFactory
