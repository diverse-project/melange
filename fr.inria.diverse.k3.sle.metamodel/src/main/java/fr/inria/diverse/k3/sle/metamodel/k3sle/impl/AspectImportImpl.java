/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle.impl;

import fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport;
import fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage;

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
 * An implementation of the model object '<em><b>Aspect Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.AspectImportImpl#getAspectRef <em>Aspect Ref</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.AspectImportImpl#getAspectedClass <em>Aspected Class</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.AspectImportImpl#getEcoreFragment <em>Ecore Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectImportImpl extends MinimalEObjectImpl.Container implements AspectImport {
	/**
	 * The cached value of the '{@link #getAspectRef() <em>Aspect Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectRef()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference aspectRef;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K3slePackage.Literals.ASPECT_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getAspectRef() {
		return aspectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAspectRef(JvmTypeReference newAspectRef, NotificationChain msgs) {
		JvmTypeReference oldAspectRef = aspectRef;
		aspectRef = newAspectRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K3slePackage.ASPECT_IMPORT__ASPECT_REF, oldAspectRef, newAspectRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectRef(JvmTypeReference newAspectRef) {
		if (newAspectRef != aspectRef) {
			NotificationChain msgs = null;
			if (aspectRef != null)
				msgs = ((InternalEObject)aspectRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K3slePackage.ASPECT_IMPORT__ASPECT_REF, null, msgs);
			if (newAspectRef != null)
				msgs = ((InternalEObject)newAspectRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K3slePackage.ASPECT_IMPORT__ASPECT_REF, null, msgs);
			msgs = basicSetAspectRef(newAspectRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.ASPECT_IMPORT__ASPECT_REF, newAspectRef, newAspectRef));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K3slePackage.ASPECT_IMPORT__ASPECTED_CLASS, oldAspectedClass, aspectedClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.ASPECT_IMPORT__ASPECTED_CLASS, oldAspectedClass, aspectedClass));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K3slePackage.ASPECT_IMPORT__ECORE_FRAGMENT, oldEcoreFragment, newEcoreFragment);
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
				msgs = ((InternalEObject)ecoreFragment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K3slePackage.ASPECT_IMPORT__ECORE_FRAGMENT, null, msgs);
			if (newEcoreFragment != null)
				msgs = ((InternalEObject)newEcoreFragment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K3slePackage.ASPECT_IMPORT__ECORE_FRAGMENT, null, msgs);
			msgs = basicSetEcoreFragment(newEcoreFragment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.ASPECT_IMPORT__ECORE_FRAGMENT, newEcoreFragment, newEcoreFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K3slePackage.ASPECT_IMPORT__ASPECT_REF:
				return basicSetAspectRef(null, msgs);
			case K3slePackage.ASPECT_IMPORT__ECORE_FRAGMENT:
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
			case K3slePackage.ASPECT_IMPORT__ASPECT_REF:
				return getAspectRef();
			case K3slePackage.ASPECT_IMPORT__ASPECTED_CLASS:
				if (resolve) return getAspectedClass();
				return basicGetAspectedClass();
			case K3slePackage.ASPECT_IMPORT__ECORE_FRAGMENT:
				return getEcoreFragment();
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
			case K3slePackage.ASPECT_IMPORT__ASPECT_REF:
				setAspectRef((JvmTypeReference)newValue);
				return;
			case K3slePackage.ASPECT_IMPORT__ASPECTED_CLASS:
				setAspectedClass((EClass)newValue);
				return;
			case K3slePackage.ASPECT_IMPORT__ECORE_FRAGMENT:
				setEcoreFragment((EPackage)newValue);
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
			case K3slePackage.ASPECT_IMPORT__ASPECT_REF:
				setAspectRef((JvmTypeReference)null);
				return;
			case K3slePackage.ASPECT_IMPORT__ASPECTED_CLASS:
				setAspectedClass((EClass)null);
				return;
			case K3slePackage.ASPECT_IMPORT__ECORE_FRAGMENT:
				setEcoreFragment((EPackage)null);
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
			case K3slePackage.ASPECT_IMPORT__ASPECT_REF:
				return aspectRef != null;
			case K3slePackage.ASPECT_IMPORT__ASPECTED_CLASS:
				return aspectedClass != null;
			case K3slePackage.ASPECT_IMPORT__ECORE_FRAGMENT:
				return ecoreFragment != null;
		}
		return super.eIsSet(featureID);
	}

} //AspectImportImpl
