/**
 */
package sql_abstracts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql_abstracts.Schema#getLstTables <em>Lst Tables</em>}</li>
 * </ul>
 *
 * @see sql_abstracts.Sql_abstractsPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Lst Tables</b></em>' containment reference list.
	 * The list contents are of type {@link sql_abstracts.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Tables</em>' containment reference list.
	 * @see sql_abstracts.Sql_abstractsPackage#getSchema_LstTables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getLstTables();

} // Schema
