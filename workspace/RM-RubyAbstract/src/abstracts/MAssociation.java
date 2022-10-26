/**
 */
package abstracts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAssociation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracts.MAssociation#getSource <em>Source</em>}</li>
 *   <li>{@link abstracts.MAssociation#getTarget <em>Target</em>}</li>
 *   <li>{@link abstracts.MAssociation#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link abstracts.MAssociation#getMultiplicitySource <em>Multiplicity Source</em>}</li>
 *   <li>{@link abstracts.MAssociation#getMultiplicityTarget <em>Multiplicity Target</em>}</li>
 *   <li>{@link abstracts.MAssociation#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link abstracts.MAssociation#getTargetRole <em>Target Role</em>}</li>
 * </ul>
 *
 * @see abstracts.AbstractsPackage#getMAssociation()
 * @model
 * @generated
 */
public interface MAssociation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MClass)
	 * @see abstracts.AbstractsPackage#getMAssociation_Source()
	 * @model
	 * @generated
	 */
	MClass getSource();

	/**
	 * Sets the value of the '{@link abstracts.MAssociation#getSource <em>Source</em>}' reference.
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
	 * @see abstracts.AbstractsPackage#getMAssociation_Target()
	 * @model
	 * @generated
	 */
	MClass getTarget();

	/**
	 * Sets the value of the '{@link abstracts.MAssociation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MClass value);

	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see #setRelationshipType(String)
	 * @see abstracts.AbstractsPackage#getMAssociation_RelationshipType()
	 * @model
	 * @generated
	 */
	String getRelationshipType();

	/**
	 * Sets the value of the '{@link abstracts.MAssociation#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Source</em>' attribute.
	 * @see #setMultiplicitySource(String)
	 * @see abstracts.AbstractsPackage#getMAssociation_MultiplicitySource()
	 * @model
	 * @generated
	 */
	String getMultiplicitySource();

	/**
	 * Sets the value of the '{@link abstracts.MAssociation#getMultiplicitySource <em>Multiplicity Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Source</em>' attribute.
	 * @see #getMultiplicitySource()
	 * @generated
	 */
	void setMultiplicitySource(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Target</em>' attribute.
	 * @see #setMultiplicityTarget(String)
	 * @see abstracts.AbstractsPackage#getMAssociation_MultiplicityTarget()
	 * @model
	 * @generated
	 */
	String getMultiplicityTarget();

	/**
	 * Sets the value of the '{@link abstracts.MAssociation#getMultiplicityTarget <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Target</em>' attribute.
	 * @see #getMultiplicityTarget()
	 * @generated
	 */
	void setMultiplicityTarget(String value);

	/**
	 * Returns the value of the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role</em>' attribute.
	 * @see #setSourceRole(String)
	 * @see abstracts.AbstractsPackage#getMAssociation_SourceRole()
	 * @model
	 * @generated
	 */
	String getSourceRole();

	/**
	 * Sets the value of the '{@link abstracts.MAssociation#getSourceRole <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role</em>' attribute.
	 * @see #getSourceRole()
	 * @generated
	 */
	void setSourceRole(String value);

	/**
	 * Returns the value of the '<em><b>Target Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Role</em>' attribute.
	 * @see #setTargetRole(String)
	 * @see abstracts.AbstractsPackage#getMAssociation_TargetRole()
	 * @model
	 * @generated
	 */
	String getTargetRole();

	/**
	 * Sets the value of the '{@link abstracts.MAssociation#getTargetRole <em>Target Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Role</em>' attribute.
	 * @see #getTargetRole()
	 * @generated
	 */
	void setTargetRole(String value);

} // MAssociation
