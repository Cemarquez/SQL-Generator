/**
 */
package abstracts.impl;

import abstracts.AbstractsPackage;
import abstracts.MClass;
import abstracts.MPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracts.impl.MPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstracts.impl.MPackageImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstracts.impl.MPackageImpl#getLstMClass <em>Lst MClass</em>}</li>
 *   <li>{@link abstracts.impl.MPackageImpl#getLstMPackage <em>Lst MPackage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MPackageImpl extends EObjectImpl implements MPackage {
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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstMClass() <em>Lst MClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMClass()
	 * @generated
	 * @ordered
	 */
	protected EList<MClass> lstMClass;

	/**
	 * The cached value of the '{@link #getLstMPackage() <em>Lst MPackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<MPackage> lstMPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsPackage.Literals.MPACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MPACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MPACKAGE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MClass> getLstMClass() {
		if (lstMClass == null) {
			lstMClass = new EObjectContainmentEList<MClass>(MClass.class, this, AbstractsPackage.MPACKAGE__LST_MCLASS);
		}
		return lstMClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MPackage> getLstMPackage() {
		if (lstMPackage == null) {
			lstMPackage = new EObjectContainmentEList<MPackage>(MPackage.class, this, AbstractsPackage.MPACKAGE__LST_MPACKAGE);
		}
		return lstMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractsPackage.MPACKAGE__LST_MCLASS:
				return ((InternalEList<?>)getLstMClass()).basicRemove(otherEnd, msgs);
			case AbstractsPackage.MPACKAGE__LST_MPACKAGE:
				return ((InternalEList<?>)getLstMPackage()).basicRemove(otherEnd, msgs);
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
			case AbstractsPackage.MPACKAGE__NAME:
				return getName();
			case AbstractsPackage.MPACKAGE__PATH:
				return getPath();
			case AbstractsPackage.MPACKAGE__LST_MCLASS:
				return getLstMClass();
			case AbstractsPackage.MPACKAGE__LST_MPACKAGE:
				return getLstMPackage();
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
			case AbstractsPackage.MPACKAGE__NAME:
				setName((String)newValue);
				return;
			case AbstractsPackage.MPACKAGE__PATH:
				setPath((String)newValue);
				return;
			case AbstractsPackage.MPACKAGE__LST_MCLASS:
				getLstMClass().clear();
				getLstMClass().addAll((Collection<? extends MClass>)newValue);
				return;
			case AbstractsPackage.MPACKAGE__LST_MPACKAGE:
				getLstMPackage().clear();
				getLstMPackage().addAll((Collection<? extends MPackage>)newValue);
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
			case AbstractsPackage.MPACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractsPackage.MPACKAGE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractsPackage.MPACKAGE__LST_MCLASS:
				getLstMClass().clear();
				return;
			case AbstractsPackage.MPACKAGE__LST_MPACKAGE:
				getLstMPackage().clear();
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
			case AbstractsPackage.MPACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractsPackage.MPACKAGE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractsPackage.MPACKAGE__LST_MCLASS:
				return lstMClass != null && !lstMClass.isEmpty();
			case AbstractsPackage.MPACKAGE__LST_MPACKAGE:
				return lstMPackage != null && !lstMPackage.isEmpty();
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
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //MPackageImpl
