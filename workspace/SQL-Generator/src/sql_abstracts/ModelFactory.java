/**
 */
package sql_abstracts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql_abstracts.ModelFactory#getLstSchema <em>Lst Schema</em>}</li>
 * </ul>
 *
 * @see sql_abstracts.Sql_abstractsPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Schema</b></em>' containment reference list.
	 * The list contents are of type {@link sql_abstracts.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Schema</em>' containment reference list.
	 * @see sql_abstracts.Sql_abstractsPackage#getModelFactory_LstSchema()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getLstSchema();

} // ModelFactory
