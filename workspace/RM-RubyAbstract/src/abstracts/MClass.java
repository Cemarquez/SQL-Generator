/**
 */
package abstracts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracts.MClass#getName <em>Name</em>}</li>
 *   <li>{@link abstracts.MClass#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link abstracts.MClass#getComments <em>Comments</em>}</li>
 *   <li>{@link abstracts.MClass#getPath <em>Path</em>}</li>
 *   <li>{@link abstracts.MClass#getLstMAssoctiation <em>Lst MAssoctiation</em>}</li>
 *   <li>{@link abstracts.MClass#getLstMInheritance <em>Lst MInheritance</em>}</li>
 *   <li>{@link abstracts.MClass#getLstMContainment <em>Lst MContainment</em>}</li>
 *   <li>{@link abstracts.MClass#getLstAttributes <em>Lst Attributes</em>}</li>
 *   <li>{@link abstracts.MClass#getLstFunction <em>Lst Function</em>}</li>
 * </ul>
 *
 * @see abstracts.AbstractsPackage#getMClass()
 * @model
 * @generated
 */
public interface MClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see abstracts.AbstractsPackage#getMClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstracts.MClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Modifier</em>' attribute.
	 * @see #setAccessModifier(String)
	 * @see abstracts.AbstractsPackage#getMClass_AccessModifier()
	 * @model
	 * @generated
	 */
	String getAccessModifier();

	/**
	 * Sets the value of the '{@link abstracts.MClass#getAccessModifier <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifier</em>' attribute.
	 * @see #getAccessModifier()
	 * @generated
	 */
	void setAccessModifier(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see abstracts.AbstractsPackage#getMClass_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link abstracts.MClass#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see abstracts.AbstractsPackage#getMClass_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link abstracts.MClass#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Lst MAssoctiation</b></em>' containment reference list.
	 * The list contents are of type {@link abstracts.MAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MAssoctiation</em>' containment reference list.
	 * @see abstracts.AbstractsPackage#getMClass_LstMAssoctiation()
	 * @model containment="true"
	 * @generated
	 */
	EList<MAssociation> getLstMAssoctiation();

	/**
	 * Returns the value of the '<em><b>Lst MInheritance</b></em>' containment reference list.
	 * The list contents are of type {@link abstracts.MInheritance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MInheritance</em>' containment reference list.
	 * @see abstracts.AbstractsPackage#getMClass_LstMInheritance()
	 * @model containment="true"
	 * @generated
	 */
	EList<MInheritance> getLstMInheritance();

	/**
	 * Returns the value of the '<em><b>Lst MContainment</b></em>' containment reference list.
	 * The list contents are of type {@link abstracts.MContainment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MContainment</em>' containment reference list.
	 * @see abstracts.AbstractsPackage#getMClass_LstMContainment()
	 * @model containment="true"
	 * @generated
	 */
	EList<MContainment> getLstMContainment();

	/**
	 * Returns the value of the '<em><b>Lst Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link abstracts.MAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Attributes</em>' containment reference list.
	 * @see abstracts.AbstractsPackage#getMClass_LstAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MAttribute> getLstAttributes();

	/**
	 * Returns the value of the '<em><b>Lst Function</b></em>' containment reference list.
	 * The list contents are of type {@link abstracts.MFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Function</em>' containment reference list.
	 * @see abstracts.AbstractsPackage#getMClass_LstFunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<MFunction> getLstFunction();

} // MClass
