/**
 */
package sql_abstracts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql_abstracts.Table#getLstColumns <em>Lst Columns</em>}</li>
 *   <li>{@link sql_abstracts.Table#getLstPrimaryKeys <em>Lst Primary Keys</em>}</li>
 *   <li>{@link sql_abstracts.Table#getLstForeignKeys <em>Lst Foreign Keys</em>}</li>
 * </ul>
 *
 * @see sql_abstracts.Sql_abstractsPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Lst Columns</b></em>' containment reference list.
	 * The list contents are of type {@link sql_abstracts.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Columns</em>' containment reference list.
	 * @see sql_abstracts.Sql_abstractsPackage#getTable_LstColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getLstColumns();

	/**
	 * Returns the value of the '<em><b>Lst Primary Keys</b></em>' containment reference list.
	 * The list contents are of type {@link sql_abstracts.PrimaryKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Primary Keys</em>' containment reference list.
	 * @see sql_abstracts.Sql_abstractsPackage#getTable_LstPrimaryKeys()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimaryKey> getLstPrimaryKeys();

	/**
	 * Returns the value of the '<em><b>Lst Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link sql_abstracts.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Foreign Keys</em>' containment reference list.
	 * @see sql_abstracts.Sql_abstractsPackage#getTable_LstForeignKeys()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getLstForeignKeys();

} // Table
