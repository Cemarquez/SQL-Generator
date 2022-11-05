/**
 */
package abstracts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracts.MAttribute#getName <em>Name</em>}</li>
 *   <li>{@link abstracts.MAttribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link abstracts.MAttribute#getComments <em>Comments</em>}</li>
 *   <li>{@link abstracts.MAttribute#isConstant <em>Constant</em>}</li>
 *   <li>{@link abstracts.MAttribute#isRemoveToInit <em>Remove To Init</em>}</li>
 *   <li>{@link abstracts.MAttribute#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link abstracts.MAttribute#isNullable <em>Nullable</em>}</li>
 *   <li>{@link abstracts.MAttribute#getType <em>Type</em>}</li>
 *   <li>{@link abstracts.MAttribute#getSize <em>Size</em>}</li>
 *   <li>{@link abstracts.MAttribute#isForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 *
 * @see abstracts.AbstractsPackage#getMAttribute()
 * @model
 * @generated
 */
public interface MAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see abstracts.AbstractsPackage#getMAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstracts.MAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see abstracts.AbstractsPackage#getMAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link abstracts.MAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see abstracts.AbstractsPackage#getMAttribute_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link abstracts.MAttribute#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see abstracts.AbstractsPackage#getMAttribute_Constant()
	 * @model
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link abstracts.MAttribute#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Remove To Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove To Init</em>' attribute.
	 * @see #setRemoveToInit(boolean)
	 * @see abstracts.AbstractsPackage#getMAttribute_RemoveToInit()
	 * @model
	 * @generated
	 */
	boolean isRemoveToInit();

	/**
	 * Sets the value of the '{@link abstracts.MAttribute#isRemoveToInit <em>Remove To Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove To Init</em>' attribute.
	 * @see #isRemoveToInit()
	 * @generated
	 */
	void setRemoveToInit(boolean value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see #setPrimaryKey(boolean)
	 * @see abstracts.AbstractsPackage#getMAttribute_PrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isPrimaryKey();

	/**
	 * Sets the value of the '{@link abstracts.MAttribute#isPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #isPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see abstracts.AbstractsPackage#getMAttribute_Nullable()
	 * @model
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link abstracts.MAttribute#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link abstracts.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see abstracts.Type
	 * @see #setType(Type)
	 * @see abstracts.AbstractsPackage#getMAttribute_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link abstracts.MAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see abstracts.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see abstracts.AbstractsPackage#getMAttribute_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link abstracts.MAttribute#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' attribute.
	 * @see #setForeignKey(boolean)
	 * @see abstracts.AbstractsPackage#getMAttribute_ForeignKey()
	 * @model
	 * @generated
	 */
	boolean isForeignKey();

	/**
	 * Sets the value of the '{@link abstracts.MAttribute#isForeignKey <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' attribute.
	 * @see #isForeignKey()
	 * @generated
	 */
	void setForeignKey(boolean value);

} // MAttribute
