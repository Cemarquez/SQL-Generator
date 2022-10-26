/**
 */
package concrete.impl;

import concrete.ConcretePackage;
import concrete.MClass;
import concrete.MContainment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MContainment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concrete.impl.MContainmentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link concrete.impl.MContainmentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link concrete.impl.MContainmentImpl#getMultiplicityTarget <em>Multiplicity Target</em>}</li>
 *   <li>{@link concrete.impl.MContainmentImpl#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link concrete.impl.MContainmentImpl#getTargetRole <em>Target Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MContainmentImpl extends EObjectImpl implements MContainment {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MClass source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected MClass target;

	/**
	 * The default value of the '{@link #getMultiplicityTarget() <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicityTarget() <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityTarget()
	 * @generated
	 * @ordered
	 */
	protected String multiplicityTarget = MULTIPLICITY_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceRole() <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRole()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRole() <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRole()
	 * @generated
	 * @ordered
	 */
	protected String sourceRole = SOURCE_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetRole() <em>Target Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRole()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRole() <em>Target Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRole()
	 * @generated
	 * @ordered
	 */
	protected String targetRole = TARGET_ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MContainmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.MCONTAINMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MClass getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (MClass)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretePackage.MCONTAINMENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(MClass newSource) {
		MClass oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCONTAINMENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MClass getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (MClass)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretePackage.MCONTAINMENT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(MClass newTarget) {
		MClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCONTAINMENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultiplicityTarget() {
		return multiplicityTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicityTarget(String newMultiplicityTarget) {
		String oldMultiplicityTarget = multiplicityTarget;
		multiplicityTarget = newMultiplicityTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCONTAINMENT__MULTIPLICITY_TARGET, oldMultiplicityTarget, multiplicityTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceRole() {
		return sourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceRole(String newSourceRole) {
		String oldSourceRole = sourceRole;
		sourceRole = newSourceRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCONTAINMENT__SOURCE_ROLE, oldSourceRole, sourceRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetRole() {
		return targetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetRole(String newTargetRole) {
		String oldTargetRole = targetRole;
		targetRole = newTargetRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCONTAINMENT__TARGET_ROLE, oldTargetRole, targetRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretePackage.MCONTAINMENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ConcretePackage.MCONTAINMENT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ConcretePackage.MCONTAINMENT__MULTIPLICITY_TARGET:
				return getMultiplicityTarget();
			case ConcretePackage.MCONTAINMENT__SOURCE_ROLE:
				return getSourceRole();
			case ConcretePackage.MCONTAINMENT__TARGET_ROLE:
				return getTargetRole();
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
			case ConcretePackage.MCONTAINMENT__SOURCE:
				setSource((MClass)newValue);
				return;
			case ConcretePackage.MCONTAINMENT__TARGET:
				setTarget((MClass)newValue);
				return;
			case ConcretePackage.MCONTAINMENT__MULTIPLICITY_TARGET:
				setMultiplicityTarget((String)newValue);
				return;
			case ConcretePackage.MCONTAINMENT__SOURCE_ROLE:
				setSourceRole((String)newValue);
				return;
			case ConcretePackage.MCONTAINMENT__TARGET_ROLE:
				setTargetRole((String)newValue);
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
			case ConcretePackage.MCONTAINMENT__SOURCE:
				setSource((MClass)null);
				return;
			case ConcretePackage.MCONTAINMENT__TARGET:
				setTarget((MClass)null);
				return;
			case ConcretePackage.MCONTAINMENT__MULTIPLICITY_TARGET:
				setMultiplicityTarget(MULTIPLICITY_TARGET_EDEFAULT);
				return;
			case ConcretePackage.MCONTAINMENT__SOURCE_ROLE:
				setSourceRole(SOURCE_ROLE_EDEFAULT);
				return;
			case ConcretePackage.MCONTAINMENT__TARGET_ROLE:
				setTargetRole(TARGET_ROLE_EDEFAULT);
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
			case ConcretePackage.MCONTAINMENT__SOURCE:
				return source != null;
			case ConcretePackage.MCONTAINMENT__TARGET:
				return target != null;
			case ConcretePackage.MCONTAINMENT__MULTIPLICITY_TARGET:
				return MULTIPLICITY_TARGET_EDEFAULT == null ? multiplicityTarget != null : !MULTIPLICITY_TARGET_EDEFAULT.equals(multiplicityTarget);
			case ConcretePackage.MCONTAINMENT__SOURCE_ROLE:
				return SOURCE_ROLE_EDEFAULT == null ? sourceRole != null : !SOURCE_ROLE_EDEFAULT.equals(sourceRole);
			case ConcretePackage.MCONTAINMENT__TARGET_ROLE:
				return TARGET_ROLE_EDEFAULT == null ? targetRole != null : !TARGET_ROLE_EDEFAULT.equals(targetRole);
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
		result.append(" (multiplicityTarget: ");
		result.append(multiplicityTarget);
		result.append(", sourceRole: ");
		result.append(sourceRole);
		result.append(", targetRole: ");
		result.append(targetRole);
		result.append(')');
		return result.toString();
	}

} //MContainmentImpl
