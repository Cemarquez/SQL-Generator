/**
 */
package abstracts.impl;

import abstracts.AbstractsPackage;
import abstracts.MClass;
import abstracts.MPackage;
import abstracts.ModelFactory;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracts.impl.ModelFactoryImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracts.impl.ModelFactoryImpl#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracts.impl.ModelFactoryImpl#getLstPackages <em>Lst Packages</em>}</li>
 *   <li>{@link abstracts.impl.ModelFactoryImpl#getLstAllClass <em>Lst All Class</em>}</li>
 *   <li>{@link abstracts.impl.ModelFactoryImpl#getLstAllPackage <em>Lst All Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryImpl extends EObjectImpl implements ModelFactory {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected String ruta = RUTA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstPackages() <em>Lst Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<MPackage> lstPackages;

	/**
	 * The cached value of the '{@link #getLstAllClass() <em>Lst All Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAllClass()
	 * @generated
	 * @ordered
	 */
	protected EList<MClass> lstAllClass;

	/**
	 * The cached value of the '{@link #getLstAllPackage() <em>Lst All Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAllPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<MPackage> lstAllPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsPackage.Literals.MODEL_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MODEL_FACTORY__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuta() {
		return ruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuta(String newRuta) {
		String oldRuta = ruta;
		ruta = newRuta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MODEL_FACTORY__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MPackage> getLstPackages() {
		if (lstPackages == null) {
			lstPackages = new EObjectContainmentEList<MPackage>(MPackage.class, this, AbstractsPackage.MODEL_FACTORY__LST_PACKAGES);
		}
		return lstPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MClass> getLstAllClass() {
		if (lstAllClass == null) {
			lstAllClass = new EObjectResolvingEList<MClass>(MClass.class, this, AbstractsPackage.MODEL_FACTORY__LST_ALL_CLASS);
		}
		return lstAllClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MPackage> getLstAllPackage() {
		if (lstAllPackage == null) {
			lstAllPackage = new EObjectResolvingEList<MPackage>(MPackage.class, this, AbstractsPackage.MODEL_FACTORY__LST_ALL_PACKAGE);
		}
		return lstAllPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractsPackage.MODEL_FACTORY__LST_PACKAGES:
				return ((InternalEList<?>)getLstPackages()).basicRemove(otherEnd, msgs);
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
			case AbstractsPackage.MODEL_FACTORY__NOMBRE:
				return getNombre();
			case AbstractsPackage.MODEL_FACTORY__RUTA:
				return getRuta();
			case AbstractsPackage.MODEL_FACTORY__LST_PACKAGES:
				return getLstPackages();
			case AbstractsPackage.MODEL_FACTORY__LST_ALL_CLASS:
				return getLstAllClass();
			case AbstractsPackage.MODEL_FACTORY__LST_ALL_PACKAGE:
				return getLstAllPackage();
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
			case AbstractsPackage.MODEL_FACTORY__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractsPackage.MODEL_FACTORY__RUTA:
				setRuta((String)newValue);
				return;
			case AbstractsPackage.MODEL_FACTORY__LST_PACKAGES:
				getLstPackages().clear();
				getLstPackages().addAll((Collection<? extends MPackage>)newValue);
				return;
			case AbstractsPackage.MODEL_FACTORY__LST_ALL_CLASS:
				getLstAllClass().clear();
				getLstAllClass().addAll((Collection<? extends MClass>)newValue);
				return;
			case AbstractsPackage.MODEL_FACTORY__LST_ALL_PACKAGE:
				getLstAllPackage().clear();
				getLstAllPackage().addAll((Collection<? extends MPackage>)newValue);
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
			case AbstractsPackage.MODEL_FACTORY__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractsPackage.MODEL_FACTORY__RUTA:
				setRuta(RUTA_EDEFAULT);
				return;
			case AbstractsPackage.MODEL_FACTORY__LST_PACKAGES:
				getLstPackages().clear();
				return;
			case AbstractsPackage.MODEL_FACTORY__LST_ALL_CLASS:
				getLstAllClass().clear();
				return;
			case AbstractsPackage.MODEL_FACTORY__LST_ALL_PACKAGE:
				getLstAllPackage().clear();
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
			case AbstractsPackage.MODEL_FACTORY__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractsPackage.MODEL_FACTORY__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
			case AbstractsPackage.MODEL_FACTORY__LST_PACKAGES:
				return lstPackages != null && !lstPackages.isEmpty();
			case AbstractsPackage.MODEL_FACTORY__LST_ALL_CLASS:
				return lstAllClass != null && !lstAllClass.isEmpty();
			case AbstractsPackage.MODEL_FACTORY__LST_ALL_PACKAGE:
				return lstAllPackage != null && !lstAllPackage.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", ruta: ");
		result.append(ruta);
		result.append(')');
		return result.toString();
	}

} //ModelFactoryImpl
