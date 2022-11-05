/**
 */
package sql_abstracts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql_abstracts.ForeignKey#getReferPrimaryKey <em>Refer Primary Key</em>}</li>
 *   <li>{@link sql_abstracts.ForeignKey#isNullable <em>Nullable</em>}</li>
 *   <li>{@link sql_abstracts.ForeignKey#getType <em>Type</em>}</li>
 *   <li>{@link sql_abstracts.ForeignKey#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see sql_abstracts.Sql_abstractsPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Refer Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refer Primary Key</em>' reference.
	 * @see #setReferPrimaryKey(PrimaryKey)
	 * @see sql_abstracts.Sql_abstractsPackage#getForeignKey_ReferPrimaryKey()
	 * @model
	 * @generated
	 */
	PrimaryKey getReferPrimaryKey();

	/**
	 * Sets the value of the '{@link sql_abstracts.ForeignKey#getReferPrimaryKey <em>Refer Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refer Primary Key</em>' reference.
	 * @see #getReferPrimaryKey()
	 * @generated
	 */
	void setReferPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see sql_abstracts.Sql_abstractsPackage#getForeignKey_Nullable()
	 * @model
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link sql_abstracts.ForeignKey#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sql_abstracts.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sql_abstracts.Type
	 * @see #setType(Type)
	 * @see sql_abstracts.Sql_abstractsPackage#getForeignKey_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link sql_abstracts.ForeignKey#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sql_abstracts.Type
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
	 * @see sql_abstracts.Sql_abstractsPackage#getForeignKey_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link sql_abstracts.ForeignKey#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

} // ForeignKey
