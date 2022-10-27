/**
 */
package sql_abstracts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql_abstracts.PrimaryKey#getLstReferForeignKeys <em>Lst Refer Foreign Keys</em>}</li>
 *   <li>{@link sql_abstracts.PrimaryKey#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see sql_abstracts.Sql_abstractsPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends Column {
	/**
	 * Returns the value of the '<em><b>Lst Refer Foreign Keys</b></em>' reference list.
	 * The list contents are of type {@link sql_abstracts.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Refer Foreign Keys</em>' reference list.
	 * @see sql_abstracts.Sql_abstractsPackage#getPrimaryKey_LstReferForeignKeys()
	 * @model
	 * @generated
	 */
	EList<ForeignKey> getLstReferForeignKeys();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(String)
	 * @see sql_abstracts.Sql_abstractsPackage#getPrimaryKey_Table()
	 * @model
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link sql_abstracts.PrimaryKey#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

} // PrimaryKey
