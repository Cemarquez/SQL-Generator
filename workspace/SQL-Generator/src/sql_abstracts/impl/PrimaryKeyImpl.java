/**
 */
package sql_abstracts.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sql_abstracts.ForeignKey;
import sql_abstracts.PrimaryKey;
import sql_abstracts.Sql_abstractsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql_abstracts.impl.PrimaryKeyImpl#getLstReferForeignKeys <em>Lst Refer Foreign Keys</em>}</li>
 *   <li>{@link sql_abstracts.impl.PrimaryKeyImpl#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryKeyImpl extends ColumnImpl implements PrimaryKey {
	/**
	 * The cached value of the '{@link #getLstReferForeignKeys() <em>Lst Refer Foreign Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstReferForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> lstReferForeignKeys;

	/**
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected String table = TABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sql_abstractsPackage.Literals.PRIMARY_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForeignKey> getLstReferForeignKeys() {
		if (lstReferForeignKeys == null) {
			lstReferForeignKeys = new EObjectResolvingEList<ForeignKey>(ForeignKey.class, this, Sql_abstractsPackage.PRIMARY_KEY__LST_REFER_FOREIGN_KEYS);
		}
		return lstReferForeignKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTable(String newTable) {
		String oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql_abstractsPackage.PRIMARY_KEY__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Sql_abstractsPackage.PRIMARY_KEY__LST_REFER_FOREIGN_KEYS:
				return getLstReferForeignKeys();
			case Sql_abstractsPackage.PRIMARY_KEY__TABLE:
				return getTable();
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
			case Sql_abstractsPackage.PRIMARY_KEY__LST_REFER_FOREIGN_KEYS:
				getLstReferForeignKeys().clear();
				getLstReferForeignKeys().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case Sql_abstractsPackage.PRIMARY_KEY__TABLE:
				setTable((String)newValue);
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
			case Sql_abstractsPackage.PRIMARY_KEY__LST_REFER_FOREIGN_KEYS:
				getLstReferForeignKeys().clear();
				return;
			case Sql_abstractsPackage.PRIMARY_KEY__TABLE:
				setTable(TABLE_EDEFAULT);
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
			case Sql_abstractsPackage.PRIMARY_KEY__LST_REFER_FOREIGN_KEYS:
				return lstReferForeignKeys != null && !lstReferForeignKeys.isEmpty();
			case Sql_abstractsPackage.PRIMARY_KEY__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (table: ");
		result.append(table);
		result.append(')');
		return result.toString();
	}

} //PrimaryKeyImpl
