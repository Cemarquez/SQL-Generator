/**
 */
package abstracts.impl;

import abstracts.AbstractsPackage;
import abstracts.MAssociation;
import abstracts.MAttribute;
import abstracts.MClass;
import abstracts.MContainment;
import abstracts.MFunction;
import abstracts.MInheritance;

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
 * An implementation of the model object '<em><b>MClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracts.impl.MClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstracts.impl.MClassImpl#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link abstracts.impl.MClassImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link abstracts.impl.MClassImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstracts.impl.MClassImpl#getLstMAssoctiation <em>Lst MAssoctiation</em>}</li>
 *   <li>{@link abstracts.impl.MClassImpl#getLstMInheritance <em>Lst MInheritance</em>}</li>
 *   <li>{@link abstracts.impl.MClassImpl#getLstMContainment <em>Lst MContainment</em>}</li>
 *   <li>{@link abstracts.impl.MClassImpl#getLstAttributes <em>Lst Attributes</em>}</li>
 *   <li>{@link abstracts.impl.MClassImpl#getLstFunction <em>Lst Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MClassImpl extends EObjectImpl implements MClass {
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
	 * The default value of the '{@link #getAccessModifier() <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessModifier() <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifier()
	 * @generated
	 * @ordered
	 */
	protected String accessModifier = ACCESS_MODIFIER_EDEFAULT;

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
	 * The cached value of the '{@link #getLstMAssoctiation() <em>Lst MAssoctiation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMAssoctiation()
	 * @generated
	 * @ordered
	 */
	protected EList<MAssociation> lstMAssoctiation;

	/**
	 * The cached value of the '{@link #getLstMInheritance() <em>Lst MInheritance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMInheritance()
	 * @generated
	 * @ordered
	 */
	protected EList<MInheritance> lstMInheritance;

	/**
	 * The cached value of the '{@link #getLstMContainment() <em>Lst MContainment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMContainment()
	 * @generated
	 * @ordered
	 */
	protected EList<MContainment> lstMContainment;

	/**
	 * The cached value of the '{@link #getLstAttributes() <em>Lst Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MAttribute> lstAttributes;

	/**
	 * The cached value of the '{@link #getLstFunction() <em>Lst Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<MFunction> lstFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsPackage.Literals.MCLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MCLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessModifier() {
		return accessModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessModifier(String newAccessModifier) {
		String oldAccessModifier = accessModifier;
		accessModifier = newAccessModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MCLASS__ACCESS_MODIFIER, oldAccessModifier, accessModifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MCLASS__COMMENTS, oldComments, comments));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MCLASS__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MAssociation> getLstMAssoctiation() {
		if (lstMAssoctiation == null) {
			lstMAssoctiation = new EObjectContainmentEList<MAssociation>(MAssociation.class, this, AbstractsPackage.MCLASS__LST_MASSOCTIATION);
		}
		return lstMAssoctiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MInheritance> getLstMInheritance() {
		if (lstMInheritance == null) {
			lstMInheritance = new EObjectContainmentEList<MInheritance>(MInheritance.class, this, AbstractsPackage.MCLASS__LST_MINHERITANCE);
		}
		return lstMInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MContainment> getLstMContainment() {
		if (lstMContainment == null) {
			lstMContainment = new EObjectContainmentEList<MContainment>(MContainment.class, this, AbstractsPackage.MCLASS__LST_MCONTAINMENT);
		}
		return lstMContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MAttribute> getLstAttributes() {
		if (lstAttributes == null) {
			lstAttributes = new EObjectContainmentEList<MAttribute>(MAttribute.class, this, AbstractsPackage.MCLASS__LST_ATTRIBUTES);
		}
		return lstAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MFunction> getLstFunction() {
		if (lstFunction == null) {
			lstFunction = new EObjectContainmentEList<MFunction>(MFunction.class, this, AbstractsPackage.MCLASS__LST_FUNCTION);
		}
		return lstFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractsPackage.MCLASS__LST_MASSOCTIATION:
				return ((InternalEList<?>)getLstMAssoctiation()).basicRemove(otherEnd, msgs);
			case AbstractsPackage.MCLASS__LST_MINHERITANCE:
				return ((InternalEList<?>)getLstMInheritance()).basicRemove(otherEnd, msgs);
			case AbstractsPackage.MCLASS__LST_MCONTAINMENT:
				return ((InternalEList<?>)getLstMContainment()).basicRemove(otherEnd, msgs);
			case AbstractsPackage.MCLASS__LST_ATTRIBUTES:
				return ((InternalEList<?>)getLstAttributes()).basicRemove(otherEnd, msgs);
			case AbstractsPackage.MCLASS__LST_FUNCTION:
				return ((InternalEList<?>)getLstFunction()).basicRemove(otherEnd, msgs);
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
			case AbstractsPackage.MCLASS__NAME:
				return getName();
			case AbstractsPackage.MCLASS__ACCESS_MODIFIER:
				return getAccessModifier();
			case AbstractsPackage.MCLASS__COMMENTS:
				return getComments();
			case AbstractsPackage.MCLASS__PATH:
				return getPath();
			case AbstractsPackage.MCLASS__LST_MASSOCTIATION:
				return getLstMAssoctiation();
			case AbstractsPackage.MCLASS__LST_MINHERITANCE:
				return getLstMInheritance();
			case AbstractsPackage.MCLASS__LST_MCONTAINMENT:
				return getLstMContainment();
			case AbstractsPackage.MCLASS__LST_ATTRIBUTES:
				return getLstAttributes();
			case AbstractsPackage.MCLASS__LST_FUNCTION:
				return getLstFunction();
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
			case AbstractsPackage.MCLASS__NAME:
				setName((String)newValue);
				return;
			case AbstractsPackage.MCLASS__ACCESS_MODIFIER:
				setAccessModifier((String)newValue);
				return;
			case AbstractsPackage.MCLASS__COMMENTS:
				setComments((String)newValue);
				return;
			case AbstractsPackage.MCLASS__PATH:
				setPath((String)newValue);
				return;
			case AbstractsPackage.MCLASS__LST_MASSOCTIATION:
				getLstMAssoctiation().clear();
				getLstMAssoctiation().addAll((Collection<? extends MAssociation>)newValue);
				return;
			case AbstractsPackage.MCLASS__LST_MINHERITANCE:
				getLstMInheritance().clear();
				getLstMInheritance().addAll((Collection<? extends MInheritance>)newValue);
				return;
			case AbstractsPackage.MCLASS__LST_MCONTAINMENT:
				getLstMContainment().clear();
				getLstMContainment().addAll((Collection<? extends MContainment>)newValue);
				return;
			case AbstractsPackage.MCLASS__LST_ATTRIBUTES:
				getLstAttributes().clear();
				getLstAttributes().addAll((Collection<? extends MAttribute>)newValue);
				return;
			case AbstractsPackage.MCLASS__LST_FUNCTION:
				getLstFunction().clear();
				getLstFunction().addAll((Collection<? extends MFunction>)newValue);
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
			case AbstractsPackage.MCLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractsPackage.MCLASS__ACCESS_MODIFIER:
				setAccessModifier(ACCESS_MODIFIER_EDEFAULT);
				return;
			case AbstractsPackage.MCLASS__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case AbstractsPackage.MCLASS__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractsPackage.MCLASS__LST_MASSOCTIATION:
				getLstMAssoctiation().clear();
				return;
			case AbstractsPackage.MCLASS__LST_MINHERITANCE:
				getLstMInheritance().clear();
				return;
			case AbstractsPackage.MCLASS__LST_MCONTAINMENT:
				getLstMContainment().clear();
				return;
			case AbstractsPackage.MCLASS__LST_ATTRIBUTES:
				getLstAttributes().clear();
				return;
			case AbstractsPackage.MCLASS__LST_FUNCTION:
				getLstFunction().clear();
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
			case AbstractsPackage.MCLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractsPackage.MCLASS__ACCESS_MODIFIER:
				return ACCESS_MODIFIER_EDEFAULT == null ? accessModifier != null : !ACCESS_MODIFIER_EDEFAULT.equals(accessModifier);
			case AbstractsPackage.MCLASS__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case AbstractsPackage.MCLASS__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractsPackage.MCLASS__LST_MASSOCTIATION:
				return lstMAssoctiation != null && !lstMAssoctiation.isEmpty();
			case AbstractsPackage.MCLASS__LST_MINHERITANCE:
				return lstMInheritance != null && !lstMInheritance.isEmpty();
			case AbstractsPackage.MCLASS__LST_MCONTAINMENT:
				return lstMContainment != null && !lstMContainment.isEmpty();
			case AbstractsPackage.MCLASS__LST_ATTRIBUTES:
				return lstAttributes != null && !lstAttributes.isEmpty();
			case AbstractsPackage.MCLASS__LST_FUNCTION:
				return lstFunction != null && !lstFunction.isEmpty();
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
		result.append(", accessModifier: ");
		result.append(accessModifier);
		result.append(", comments: ");
		result.append(comments);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //MClassImpl
