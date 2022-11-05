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
import sql_abstracts.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql_abstracts.impl.ForeignKeyImpl#getReferPrimaryKey <em>Refer Primary Key</em>}</li>
 *   <li>{@link sql_abstracts.impl.ForeignKeyImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link sql_abstracts.impl.ForeignKeyImpl#getType <em>Type</em>}</li>
 *   <li>{@link sql_abstracts.impl.ForeignKeyImpl#getSize <em>Size</em>}</li>
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
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.NUMERIC;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

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
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql_abstractsPackage.FOREIGN_KEY__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql_abstractsPackage.FOREIGN_KEY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql_abstractsPackage.FOREIGN_KEY__SIZE, oldSize, size));
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
			case Sql_abstractsPackage.FOREIGN_KEY__NULLABLE:
				return isNullable();
			case Sql_abstractsPackage.FOREIGN_KEY__TYPE:
				return getType();
			case Sql_abstractsPackage.FOREIGN_KEY__SIZE:
				return getSize();
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
			case Sql_abstractsPackage.FOREIGN_KEY__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case Sql_abstractsPackage.FOREIGN_KEY__TYPE:
				setType((Type)newValue);
				return;
			case Sql_abstractsPackage.FOREIGN_KEY__SIZE:
				setSize((String)newValue);
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
			case Sql_abstractsPackage.FOREIGN_KEY__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case Sql_abstractsPackage.FOREIGN_KEY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Sql_abstractsPackage.FOREIGN_KEY__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case Sql_abstractsPackage.FOREIGN_KEY__NULLABLE:
				return nullable != NULLABLE_EDEFAULT;
			case Sql_abstractsPackage.FOREIGN_KEY__TYPE:
				return type != TYPE_EDEFAULT;
			case Sql_abstractsPackage.FOREIGN_KEY__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
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
		result.append(" (nullable: ");
		result.append(nullable);
		result.append(", type: ");
		result.append(type);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //ForeignKeyImpl
