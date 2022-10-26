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

} // PrimaryKey
