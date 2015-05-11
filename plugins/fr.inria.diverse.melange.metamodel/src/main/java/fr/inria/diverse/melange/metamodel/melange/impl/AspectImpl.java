/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.AspectImpl#getAspectTypeRef <em>Aspect Type Ref</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.AspectImpl#getAspectedClass <em>Aspected Class</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.AspectImpl#getEcoreFragment <em>Ecore Fragment</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.AspectImpl#getAspectWildcardImport <em>Aspect Wildcard Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectImpl extends MinimalEObjectImpl.Container implements Aspect {
	/**
	 * The cached value of the '{@link #getAspectTypeRef() <em>Aspect Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectTypeRef()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference aspectTypeRef;

	/**
	 * The cached value of the '{@link #getAspectedClass() <em>Aspected Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectedClass()
	 * @generated
	 * @ordered
	 */
	protected EClass aspectedClass;

	/**
	 * The cached value of the '{@link #getEcoreFragment() <em>Ecore Fragment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreFragment()
	 * @generated
	 * @ordered
	 */
	protected EPackage ecoreFragment;

	/**
	 * The default value of the '{@link #getAspectWildcardImport() <em>Aspect Wildcard Import</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectWildcardImport()
	 * @generated
	 * @ordered
	 */
	protected static final String ASPECT_WILDCARD_IMPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAspectWildcardImport() <em>Aspect Wildcard Import</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectWildcardImport()
	 * @generated
	 * @ordered
	 */
	protected String aspectWildcardImport = ASPECT_WILDCARD_IMPORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelangePackage.Literals.ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getAspectTypeRef() {
		return aspectTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAspectTypeRef(JvmTypeReference newAspectTypeRef, NotificationChain msgs) {
		JvmTypeReference oldAspectTypeRef = aspectTypeRef;
		aspectTypeRef = newAspectTypeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MelangePackage.ASPECT__ASPECT_TYPE_REF, oldAspectTypeRef, newAspectTypeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectTypeRef(JvmTypeReference newAspectTypeRef) {
		if (newAspectTypeRef != aspectTypeRef) {
			NotificationChain msgs = null;
			if (aspectTypeRef != null)
				msgs = ((InternalEObject)aspectTypeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MelangePackage.ASPECT__ASPECT_TYPE_REF, null, msgs);
			if (newAspectTypeRef != null)
				msgs = ((InternalEObject)newAspectTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MelangePackage.ASPECT__ASPECT_TYPE_REF, null, msgs);
			msgs = basicSetAspectTypeRef(newAspectTypeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.ASPECT__ASPECT_TYPE_REF, newAspectTypeRef, newAspectTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspectedClass() {
		if (aspectedClass != null && aspectedClass.eIsProxy()) {
			InternalEObject oldAspectedClass = (InternalEObject)aspectedClass;
			aspectedClass = (EClass)eResolveProxy(oldAspectedClass);
			if (aspectedClass != oldAspectedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MelangePackage.ASPECT__ASPECTED_CLASS, oldAspectedClass, aspectedClass));
			}
		}
		return aspectedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetAspectedClass() {
		return aspectedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectedClass(EClass newAspectedClass) {
		EClass oldAspectedClass = aspectedClass;
		aspectedClass = newAspectedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.ASPECT__ASPECTED_CLASS, oldAspectedClass, aspectedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getEcoreFragment() {
		return ecoreFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEcoreFragment(EPackage newEcoreFragment, NotificationChain msgs) {
		EPackage oldEcoreFragment = ecoreFragment;
		ecoreFragment = newEcoreFragment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MelangePackage.ASPECT__ECORE_FRAGMENT, oldEcoreFragment, newEcoreFragment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreFragment(EPackage newEcoreFragment) {
		if (newEcoreFragment != ecoreFragment) {
			NotificationChain msgs = null;
			if (ecoreFragment != null)
				msgs = ((InternalEObject)ecoreFragment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MelangePackage.ASPECT__ECORE_FRAGMENT, null, msgs);
			if (newEcoreFragment != null)
				msgs = ((InternalEObject)newEcoreFragment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MelangePackage.ASPECT__ECORE_FRAGMENT, null, msgs);
			msgs = basicSetEcoreFragment(newEcoreFragment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.ASPECT__ECORE_FRAGMENT, newEcoreFragment, newEcoreFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAspectWildcardImport() {
		return aspectWildcardImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectWildcardImport(String newAspectWildcardImport) {
		String oldAspectWildcardImport = aspectWildcardImport;
		aspectWildcardImport = newAspectWildcardImport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.ASPECT__ASPECT_WILDCARD_IMPORT, oldAspectWildcardImport, aspectWildcardImport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MelangePackage.ASPECT__ASPECT_TYPE_REF:
				return basicSetAspectTypeRef(null, msgs);
			case MelangePackage.ASPECT__ECORE_FRAGMENT:
				return basicSetEcoreFragment(null, msgs);
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
			case MelangePackage.ASPECT__ASPECT_TYPE_REF:
				return getAspectTypeRef();
			case MelangePackage.ASPECT__ASPECTED_CLASS:
				if (resolve) return getAspectedClass();
				return basicGetAspectedClass();
			case MelangePackage.ASPECT__ECORE_FRAGMENT:
				return getEcoreFragment();
			case MelangePackage.ASPECT__ASPECT_WILDCARD_IMPORT:
				return getAspectWildcardImport();
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
			case MelangePackage.ASPECT__ASPECT_TYPE_REF:
				setAspectTypeRef((JvmTypeReference)newValue);
				return;
			case MelangePackage.ASPECT__ASPECTED_CLASS:
				setAspectedClass((EClass)newValue);
				return;
			case MelangePackage.ASPECT__ECORE_FRAGMENT:
				setEcoreFragment((EPackage)newValue);
				return;
			case MelangePackage.ASPECT__ASPECT_WILDCARD_IMPORT:
				setAspectWildcardImport((String)newValue);
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
			case MelangePackage.ASPECT__ASPECT_TYPE_REF:
				setAspectTypeRef((JvmTypeReference)null);
				return;
			case MelangePackage.ASPECT__ASPECTED_CLASS:
				setAspectedClass((EClass)null);
				return;
			case MelangePackage.ASPECT__ECORE_FRAGMENT:
				setEcoreFragment((EPackage)null);
				return;
			case MelangePackage.ASPECT__ASPECT_WILDCARD_IMPORT:
				setAspectWildcardImport(ASPECT_WILDCARD_IMPORT_EDEFAULT);
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
			case MelangePackage.ASPECT__ASPECT_TYPE_REF:
				return aspectTypeRef != null;
			case MelangePackage.ASPECT__ASPECTED_CLASS:
				return aspectedClass != null;
			case MelangePackage.ASPECT__ECORE_FRAGMENT:
				return ecoreFragment != null;
			case MelangePackage.ASPECT__ASPECT_WILDCARD_IMPORT:
				return ASPECT_WILDCARD_IMPORT_EDEFAULT == null ? aspectWildcardImport != null : !ASPECT_WILDCARD_IMPORT_EDEFAULT.equals(aspectWildcardImport);
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
		result.append(" (aspectWildcardImport: ");
		result.append(aspectWildcardImport);
		result.append(')');
		return result.toString();
	}

} //AspectImpl
