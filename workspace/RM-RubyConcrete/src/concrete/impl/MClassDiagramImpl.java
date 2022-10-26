/**
 */
package concrete.impl;

import concrete.ConcretePackage;
import concrete.MAssociation;
import concrete.MClass;
import concrete.MClassDiagram;
import concrete.MContainment;
import concrete.MInheritance;
import concrete.MPackage;

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
 * An implementation of the model object '<em><b>MClass Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concrete.impl.MClassDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link concrete.impl.MClassDiagramImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link concrete.impl.MClassDiagramImpl#getLstMPackage <em>Lst MPackage</em>}</li>
 *   <li>{@link concrete.impl.MClassDiagramImpl#getLstMClass <em>Lst MClass</em>}</li>
 *   <li>{@link concrete.impl.MClassDiagramImpl#getLstMAssoctiation <em>Lst MAssoctiation</em>}</li>
 *   <li>{@link concrete.impl.MClassDiagramImpl#getLstMInheritance <em>Lst MInheritance</em>}</li>
 *   <li>{@link concrete.impl.MClassDiagramImpl#getLstMContainment <em>Lst MContainment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MClassDiagramImpl extends EObjectImpl implements MClassDiagram {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getLstMClass() <em>Lst MClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMClass()
	 * @generated
	 * @ordered
	 */
	protected EList<MClass> lstMClass;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MClassDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.MCLASS_DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCLASS_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCLASS_DIAGRAM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MPackage> getLstMPackage() {
		if (lstMPackage == null) {
			lstMPackage = new EObjectContainmentEList<MPackage>(MPackage.class, this, ConcretePackage.MCLASS_DIAGRAM__LST_MPACKAGE);
		}
		return lstMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MClass> getLstMClass() {
		if (lstMClass == null) {
			lstMClass = new EObjectContainmentEList<MClass>(MClass.class, this, ConcretePackage.MCLASS_DIAGRAM__LST_MCLASS);
		}
		return lstMClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MAssociation> getLstMAssoctiation() {
		if (lstMAssoctiation == null) {
			lstMAssoctiation = new EObjectContainmentEList<MAssociation>(MAssociation.class, this, ConcretePackage.MCLASS_DIAGRAM__LST_MASSOCTIATION);
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
			lstMInheritance = new EObjectContainmentEList<MInheritance>(MInheritance.class, this, ConcretePackage.MCLASS_DIAGRAM__LST_MINHERITANCE);
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
			lstMContainment = new EObjectContainmentEList<MContainment>(MContainment.class, this, ConcretePackage.MCLASS_DIAGRAM__LST_MCONTAINMENT);
		}
		return lstMContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretePackage.MCLASS_DIAGRAM__LST_MPACKAGE:
				return ((InternalEList<?>)getLstMPackage()).basicRemove(otherEnd, msgs);
			case ConcretePackage.MCLASS_DIAGRAM__LST_MCLASS:
				return ((InternalEList<?>)getLstMClass()).basicRemove(otherEnd, msgs);
			case ConcretePackage.MCLASS_DIAGRAM__LST_MASSOCTIATION:
				return ((InternalEList<?>)getLstMAssoctiation()).basicRemove(otherEnd, msgs);
			case ConcretePackage.MCLASS_DIAGRAM__LST_MINHERITANCE:
				return ((InternalEList<?>)getLstMInheritance()).basicRemove(otherEnd, msgs);
			case ConcretePackage.MCLASS_DIAGRAM__LST_MCONTAINMENT:
				return ((InternalEList<?>)getLstMContainment()).basicRemove(otherEnd, msgs);
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
			case ConcretePackage.MCLASS_DIAGRAM__NAME:
				return getName();
			case ConcretePackage.MCLASS_DIAGRAM__DESCRIPTION:
				return getDescription();
			case ConcretePackage.MCLASS_DIAGRAM__LST_MPACKAGE:
				return getLstMPackage();
			case ConcretePackage.MCLASS_DIAGRAM__LST_MCLASS:
				return getLstMClass();
			case ConcretePackage.MCLASS_DIAGRAM__LST_MASSOCTIATION:
				return getLstMAssoctiation();
			case ConcretePackage.MCLASS_DIAGRAM__LST_MINHERITANCE:
				return getLstMInheritance();
			case ConcretePackage.MCLASS_DIAGRAM__LST_MCONTAINMENT:
				return getLstMContainment();
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
			case ConcretePackage.MCLASS_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case ConcretePackage.MCLASS_DIAGRAM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ConcretePackage.MCLASS_DIAGRAM__LST_MPACKAGE:
				getLstMPackage().clear();
				getLstMPackage().addAll((Collection<? extends MPackage>)newValue);
				return;
			case ConcretePackage.MCLASS_DIAGRAM__LST_MCLASS:
				getLstMClass().clear();
				getLstMClass().addAll((Collection<? extends MClass>)newValue);
				return;
			case ConcretePackage.MCLASS_DIAGRAM__LST_MASSOCTIATION:
				getLstMAssoctiation().clear();
				getLstMAssoctiation().addAll((Collection<? extends MAssociation>)newValue);
				return;
			case ConcretePackage.MCLASS_DIAGRAM__LST_MINHERITANCE:
				getLstMInheritance().clear();
				getLstMInheritance().addAll((Collection<? extends MInheritance>)newValue);
				return;
			case ConcretePackage.MCLASS_DIAGRAM__LST_MCONTAINMENT:
				getLstMContainment().clear();
				getLstMContainment().addAll((Collection<? extends MContainment>)newValue);
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
			case ConcretePackage.MCLASS_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretePackage.MCLASS_DIAGRAM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ConcretePackage.MCLASS_DIAGRAM__LST_MPACKAGE:
				getLstMPackage().clear();
				return;
			case ConcretePackage.MCLASS_DIAGRAM__LST_MCLASS:
				getLstMClass().clear();
				return;
			case ConcretePackage.MCLASS_DIAGRAM__LST_MASSOCTIATION:
				getLstMAssoctiation().clear();
				return;
			case ConcretePackage.MCLASS_DIAGRAM__LST_MINHERITANCE:
				getLstMInheritance().clear();
				return;
			case ConcretePackage.MCLASS_DIAGRAM__LST_MCONTAINMENT:
				getLstMContainment().clear();
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
			case ConcretePackage.MCLASS_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretePackage.MCLASS_DIAGRAM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ConcretePackage.MCLASS_DIAGRAM__LST_MPACKAGE:
				return lstMPackage != null && !lstMPackage.isEmpty();
			case ConcretePackage.MCLASS_DIAGRAM__LST_MCLASS:
				return lstMClass != null && !lstMClass.isEmpty();
			case ConcretePackage.MCLASS_DIAGRAM__LST_MASSOCTIATION:
				return lstMAssoctiation != null && !lstMAssoctiation.isEmpty();
			case ConcretePackage.MCLASS_DIAGRAM__LST_MINHERITANCE:
				return lstMInheritance != null && !lstMInheritance.isEmpty();
			case ConcretePackage.MCLASS_DIAGRAM__LST_MCONTAINMENT:
				return lstMContainment != null && !lstMContainment.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MClassDiagramImpl
