/**
 */
package sql_abstracts.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sql_abstracts.Column;
import sql_abstracts.ForeignKey;
import sql_abstracts.PrimaryKey;
import sql_abstracts.Sql_abstractsPackage;
import sql_abstracts.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql_abstracts.impl.TableImpl#getLstColumns <em>Lst Columns</em>}</li>
 *   <li>{@link sql_abstracts.impl.TableImpl#getLstPrimaryKeys <em>Lst Primary Keys</em>}</li>
 *   <li>{@link sql_abstracts.impl.TableImpl#getLstForeignKeys <em>Lst Foreign Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends ModelElementImpl implements Table {
	/**
	 * The cached value of the '{@link #getLstColumns() <em>Lst Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> lstColumns;

	/**
	 * The cached value of the '{@link #getLstPrimaryKeys() <em>Lst Primary Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPrimaryKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryKey> lstPrimaryKeys;

	/**
	 * The cached value of the '{@link #getLstForeignKeys() <em>Lst Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> lstForeignKeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sql_abstractsPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getLstColumns() {
		if (lstColumns == null) {
			lstColumns = new EObjectContainmentEList<Column>(Column.class, this, Sql_abstractsPackage.TABLE__LST_COLUMNS);
		}
		return lstColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrimaryKey> getLstPrimaryKeys() {
		if (lstPrimaryKeys == null) {
			lstPrimaryKeys = new EObjectContainmentEList<PrimaryKey>(PrimaryKey.class, this, Sql_abstractsPackage.TABLE__LST_PRIMARY_KEYS);
		}
		return lstPrimaryKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForeignKey> getLstForeignKeys() {
		if (lstForeignKeys == null) {
			lstForeignKeys = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, Sql_abstractsPackage.TABLE__LST_FOREIGN_KEYS);
		}
		return lstForeignKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sql_abstractsPackage.TABLE__LST_COLUMNS:
				return ((InternalEList<?>)getLstColumns()).basicRemove(otherEnd, msgs);
			case Sql_abstractsPackage.TABLE__LST_PRIMARY_KEYS:
				return ((InternalEList<?>)getLstPrimaryKeys()).basicRemove(otherEnd, msgs);
			case Sql_abstractsPackage.TABLE__LST_FOREIGN_KEYS:
				return ((InternalEList<?>)getLstForeignKeys()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Sql_abstractsPackage.TABLE__LST_COLUMNS:
				return getLstColumns();
			case Sql_abstractsPackage.TABLE__LST_PRIMARY_KEYS:
				return getLstPrimaryKeys();
			case Sql_abstractsPackage.TABLE__LST_FOREIGN_KEYS:
				return getLstForeignKeys();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Sql_abstractsPackage.TABLE__LST_COLUMNS:
				getLstColumns().clear();
				getLstColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case Sql_abstractsPackage.TABLE__LST_PRIMARY_KEYS:
				getLstPrimaryKeys().clear();
				getLstPrimaryKeys().addAll((Collection<? extends PrimaryKey>)newValue);
				return;
			case Sql_abstractsPackage.TABLE__LST_FOREIGN_KEYS:
				getLstForeignKeys().clear();
				getLstForeignKeys().addAll((Collection<? extends ForeignKey>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Sql_abstractsPackage.TABLE__LST_COLUMNS:
				getLstColumns().clear();
				return;
			case Sql_abstractsPackage.TABLE__LST_PRIMARY_KEYS:
				getLstPrimaryKeys().clear();
				return;
			case Sql_abstractsPackage.TABLE__LST_FOREIGN_KEYS:
				getLstForeignKeys().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Sql_abstractsPackage.TABLE__LST_COLUMNS:
				return lstColumns != null && !lstColumns.isEmpty();
			case Sql_abstractsPackage.TABLE__LST_PRIMARY_KEYS:
				return lstPrimaryKeys != null && !lstPrimaryKeys.isEmpty();
			case Sql_abstractsPackage.TABLE__LST_FOREIGN_KEYS:
				return lstForeignKeys != null && !lstForeignKeys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
