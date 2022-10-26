/**
 */
package concrete;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MInheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concrete.MInheritance#getSource <em>Source</em>}</li>
 *   <li>{@link concrete.MInheritance#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see concrete.ConcretePackage#getMInheritance()
 * @model annotation="gmf.link source='source' target='target' style='solid' width='1' target.decoration='closedarrow' color='255,0,0'"
 * @generated
 */
public interface MInheritance extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MClass)
	 * @see concrete.ConcretePackage#getMInheritance_Source()
	 * @model
	 * @generated
	 */
	MClass getSource();

	/**
	 * Sets the value of the '{@link concrete.MInheritance#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MClass value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(MClass)
	 * @see concrete.ConcretePackage#getMInheritance_Target()
	 * @model
	 * @generated
	 */
	MClass getTarget();

	/**
	 * Sets the value of the '{@link concrete.MInheritance#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MClass value);

} // MInheritance
