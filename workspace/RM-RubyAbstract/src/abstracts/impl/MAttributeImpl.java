/**
 */
package abstracts.impl;

import abstracts.AbstractsPackage;
import abstracts.MAttribute;

import abstracts.Type;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracts.impl.MAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstracts.impl.MAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link abstracts.impl.MAttributeImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link abstracts.impl.MAttributeImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link abstracts.impl.MAttributeImpl#isRemoveToInit <em>Remove To Init</em>}</li>
 *   <li>{@link abstracts.impl.MAttributeImpl#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link abstracts.impl.MAttributeImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link abstracts.impl.MAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link abstracts.impl.MAttributeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link abstracts.impl.MAttributeImpl#isForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MAttributeImpl extends EObjectImpl implements MAttribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoveToInit() <em>Remove To Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveToInit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_TO_INIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveToInit() <em>Remove To Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveToInit()
	 * @generated
	 * @ordered
	 */
	protected boolean removeToInit = REMOVE_TO_INIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean primaryKey = PRIMARY_KEY_EDEFAULT;

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
	 * The default value of the '{@link #isForeignKey() <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForeignKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOREIGN_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForeignKey() <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForeignKey()
	 * @generated
	 * @ordered
	 */
	protected boolean foreignKey = FOREIGN_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsPackage.Literals.MATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MATTRIBUTE__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MATTRIBUTE__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRemoveToInit() {
		return removeToInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveToInit(boolean newRemoveToInit) {
		boolean oldRemoveToInit = removeToInit;
		removeToInit = newRemoveToInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MATTRIBUTE__REMOVE_TO_INIT, oldRemoveToInit, removeToInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryKey(boolean newPrimaryKey) {
		boolean oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MATTRIBUTE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MATTRIBUTE__NULLABLE, oldNullable, nullable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MATTRIBUTE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MATTRIBUTE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isForeignKey() {
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForeignKey(boolean newForeignKey) {
		boolean oldForeignKey = foreignKey;
		foreignKey = newForeignKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MATTRIBUTE__FOREIGN_KEY, oldForeignKey, foreignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractsPackage.MATTRIBUTE__NAME:
				return getName();
			case AbstractsPackage.MATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
			case AbstractsPackage.MATTRIBUTE__COMMENTS:
				return getComments();
			case AbstractsPackage.MATTRIBUTE__CONSTANT:
				return isConstant();
			case AbstractsPackage.MATTRIBUTE__REMOVE_TO_INIT:
				return isRemoveToInit();
			case AbstractsPackage.MATTRIBUTE__PRIMARY_KEY:
				return isPrimaryKey();
			case AbstractsPackage.MATTRIBUTE__NULLABLE:
				return isNullable();
			case AbstractsPackage.MATTRIBUTE__TYPE:
				return getType();
			case AbstractsPackage.MATTRIBUTE__SIZE:
				return getSize();
			case AbstractsPackage.MATTRIBUTE__FOREIGN_KEY:
				return isForeignKey();
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
			case AbstractsPackage.MATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case AbstractsPackage.MATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case AbstractsPackage.MATTRIBUTE__COMMENTS:
				setComments((String)newValue);
				return;
			case AbstractsPackage.MATTRIBUTE__CONSTANT:
				setConstant((Boolean)newValue);
				return;
			case AbstractsPackage.MATTRIBUTE__REMOVE_TO_INIT:
				setRemoveToInit((Boolean)newValue);
				return;
			case AbstractsPackage.MATTRIBUTE__PRIMARY_KEY:
				setPrimaryKey((Boolean)newValue);
				return;
			case AbstractsPackage.MATTRIBUTE__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case AbstractsPackage.MATTRIBUTE__TYPE:
				setType((Type)newValue);
				return;
			case AbstractsPackage.MATTRIBUTE__SIZE:
				setSize((String)newValue);
				return;
			case AbstractsPackage.MATTRIBUTE__FOREIGN_KEY:
				setForeignKey((Boolean)newValue);
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
			case AbstractsPackage.MATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractsPackage.MATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case AbstractsPackage.MATTRIBUTE__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case AbstractsPackage.MATTRIBUTE__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case AbstractsPackage.MATTRIBUTE__REMOVE_TO_INIT:
				setRemoveToInit(REMOVE_TO_INIT_EDEFAULT);
				return;
			case AbstractsPackage.MATTRIBUTE__PRIMARY_KEY:
				setPrimaryKey(PRIMARY_KEY_EDEFAULT);
				return;
			case AbstractsPackage.MATTRIBUTE__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case AbstractsPackage.MATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AbstractsPackage.MATTRIBUTE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case AbstractsPackage.MATTRIBUTE__FOREIGN_KEY:
				setForeignKey(FOREIGN_KEY_EDEFAULT);
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
			case AbstractsPackage.MATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractsPackage.MATTRIBUTE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case AbstractsPackage.MATTRIBUTE__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case AbstractsPackage.MATTRIBUTE__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
			case AbstractsPackage.MATTRIBUTE__REMOVE_TO_INIT:
				return removeToInit != REMOVE_TO_INIT_EDEFAULT;
			case AbstractsPackage.MATTRIBUTE__PRIMARY_KEY:
				return primaryKey != PRIMARY_KEY_EDEFAULT;
			case AbstractsPackage.MATTRIBUTE__NULLABLE:
				return nullable != NULLABLE_EDEFAULT;
			case AbstractsPackage.MATTRIBUTE__TYPE:
				return type != TYPE_EDEFAULT;
			case AbstractsPackage.MATTRIBUTE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case AbstractsPackage.MATTRIBUTE__FOREIGN_KEY:
				return foreignKey != FOREIGN_KEY_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", comments: ");
		result.append(comments);
		result.append(", constant: ");
		result.append(constant);
		result.append(", removeToInit: ");
		result.append(removeToInit);
		result.append(", primaryKey: ");
		result.append(primaryKey);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(", type: ");
		result.append(type);
		result.append(", size: ");
		result.append(size);
		result.append(", foreignKey: ");
		result.append(foreignKey);
		result.append(')');
		return result.toString();
	}

} //MAttributeImpl
