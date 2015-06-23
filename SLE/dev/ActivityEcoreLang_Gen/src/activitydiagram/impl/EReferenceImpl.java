/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.EAttribute;
import activitydiagram.EReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagram.impl.EReferenceImpl#isContainment <em>Containment</em>}</li>
 *   <li>{@link activitydiagram.impl.EReferenceImpl#isContainer <em>Container</em>}</li>
 *   <li>{@link activitydiagram.impl.EReferenceImpl#isResolveProxies <em>Resolve Proxies</em>}</li>
 *   <li>{@link activitydiagram.impl.EReferenceImpl#getEOpposite <em>EOpposite</em>}</li>
 *   <li>{@link activitydiagram.impl.EReferenceImpl#getEReferenceType <em>EReference Type</em>}</li>
 *   <li>{@link activitydiagram.impl.EReferenceImpl#getEKeys <em>EKeys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EReferenceImpl extends EStructuralFeatureImpl implements EReference {
	/**
	 * The default value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean containment = CONTAINMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isResolveProxies() <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolveProxies()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVE_PROXIES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isResolveProxies() <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolveProxies()
	 * @generated
	 * @ordered
	 */
	protected boolean resolveProxies = RESOLVE_PROXIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEOpposite() <em>EOpposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOpposite()
	 * @generated
	 * @ordered
	 */
	protected EReference eOpposite;

	/**
	 * The cached value of the '{@link #getEKeys() <em>EKeys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> eKeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.EREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(boolean newContainment) {
		boolean oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.EREFERENCE__CONTAINMENT, oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainer() {
		// TODO: implement this method to return the 'Container' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolveProxies() {
		return resolveProxies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolveProxies(boolean newResolveProxies) {
		boolean oldResolveProxies = resolveProxies;
		resolveProxies = newResolveProxies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.EREFERENCE__RESOLVE_PROXIES, oldResolveProxies, resolveProxies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOpposite() {
		if (eOpposite != null && eOpposite.eIsProxy()) {
			InternalEObject oldEOpposite = (InternalEObject)eOpposite;
			eOpposite = (EReference)eResolveProxy(oldEOpposite);
			if (eOpposite != oldEOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.EREFERENCE__EOPPOSITE, oldEOpposite, eOpposite));
			}
		}
		return eOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetEOpposite() {
		return eOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEOpposite(EReference newEOpposite) {
		EReference oldEOpposite = eOpposite;
		eOpposite = newEOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.EREFERENCE__EOPPOSITE, oldEOpposite, eOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activitydiagram.EClass getEReferenceType() {
		activitydiagram.EClass eReferenceType = basicGetEReferenceType();
		return eReferenceType != null && eReferenceType.eIsProxy() ? (activitydiagram.EClass)eResolveProxy((InternalEObject)eReferenceType) : eReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activitydiagram.EClass basicGetEReferenceType() {
		// TODO: implement this method to return the 'EReference Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getEKeys() {
		if (eKeys == null) {
			eKeys = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, ActivitydiagramPackage.EREFERENCE__EKEYS);
		}
		return eKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramPackage.EREFERENCE__CONTAINMENT:
				return isContainment();
			case ActivitydiagramPackage.EREFERENCE__CONTAINER:
				return isContainer();
			case ActivitydiagramPackage.EREFERENCE__RESOLVE_PROXIES:
				return isResolveProxies();
			case ActivitydiagramPackage.EREFERENCE__EOPPOSITE:
				if (resolve) return getEOpposite();
				return basicGetEOpposite();
			case ActivitydiagramPackage.EREFERENCE__EREFERENCE_TYPE:
				if (resolve) return getEReferenceType();
				return basicGetEReferenceType();
			case ActivitydiagramPackage.EREFERENCE__EKEYS:
				return getEKeys();
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
			case ActivitydiagramPackage.EREFERENCE__CONTAINMENT:
				setContainment((Boolean)newValue);
				return;
			case ActivitydiagramPackage.EREFERENCE__RESOLVE_PROXIES:
				setResolveProxies((Boolean)newValue);
				return;
			case ActivitydiagramPackage.EREFERENCE__EOPPOSITE:
				setEOpposite((EReference)newValue);
				return;
			case ActivitydiagramPackage.EREFERENCE__EKEYS:
				getEKeys().clear();
				getEKeys().addAll((Collection<? extends EAttribute>)newValue);
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
			case ActivitydiagramPackage.EREFERENCE__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case ActivitydiagramPackage.EREFERENCE__RESOLVE_PROXIES:
				setResolveProxies(RESOLVE_PROXIES_EDEFAULT);
				return;
			case ActivitydiagramPackage.EREFERENCE__EOPPOSITE:
				setEOpposite((EReference)null);
				return;
			case ActivitydiagramPackage.EREFERENCE__EKEYS:
				getEKeys().clear();
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
			case ActivitydiagramPackage.EREFERENCE__CONTAINMENT:
				return containment != CONTAINMENT_EDEFAULT;
			case ActivitydiagramPackage.EREFERENCE__CONTAINER:
				return isContainer() != CONTAINER_EDEFAULT;
			case ActivitydiagramPackage.EREFERENCE__RESOLVE_PROXIES:
				return resolveProxies != RESOLVE_PROXIES_EDEFAULT;
			case ActivitydiagramPackage.EREFERENCE__EOPPOSITE:
				return eOpposite != null;
			case ActivitydiagramPackage.EREFERENCE__EREFERENCE_TYPE:
				return basicGetEReferenceType() != null;
			case ActivitydiagramPackage.EREFERENCE__EKEYS:
				return eKeys != null && !eKeys.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (containment: ");
		result.append(containment);
		result.append(", resolveProxies: ");
		result.append(resolveProxies);
		result.append(')');
		return result.toString();
	}

} //EReferenceImpl
