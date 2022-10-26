/**
 */
package sql_abstracts.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sql_abstracts.ForeignKey;
import sql_abstracts.PrimaryKey;
import sql_abstracts.Sql_abstractsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql_abstracts.impl.ForeignKeyImpl#getReferPrimaryKey <em>Refer Primary Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends ModelElementImpl implements ForeignKey {
	/**
	 * The cached value of the '{@link #getReferPrimaryKey() <em>Refer Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey referPrimaryKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sql_abstractsPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryKey getReferPrimaryKey() {
		if (referPrimaryKey != null && referPrimaryKey.eIsProxy()) {
			InternalEObject oldReferPrimaryKey = (InternalEObject)referPrimaryKey;
			referPrimaryKey = (PrimaryKey)eResolveProxy(oldReferPrimaryKey);
			if (referPrimaryKey != oldReferPrimaryKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Sql_abstractsPackage.FOREIGN_KEY__REFER_PRIMARY_KEY, oldReferPrimaryKey, referPrimaryKey));
			}
		}
		return referPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetReferPrimaryKey() {
		return referPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferPrimaryKey(PrimaryKey newReferPrimaryKey) {
		PrimaryKey oldReferPrimaryKey = referPrimaryKey;
		referPrimaryKey = newReferPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql_abstractsPackage.FOREIGN_KEY__REFER_PRIMARY_KEY, oldReferPrimaryKey, referPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Sql_abstractsPackage.FOREIGN_KEY__REFER_PRIMARY_KEY:
				if (resolve) return getReferPrimaryKey();
				return basicGetReferPrimaryKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Sql_abstractsPackage.FOREIGN_KEY__REFER_PRIMARY_KEY:
				setReferPrimaryKey((PrimaryKey)newValue);
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
			case Sql_abstractsPackage.FOREIGN_KEY__REFER_PRIMARY_KEY:
				setReferPrimaryKey((PrimaryKey)null);
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
			case Sql_abstractsPackage.FOREIGN_KEY__REFER_PRIMARY_KEY:
				return referPrimaryKey != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl
