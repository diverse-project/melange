/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle.impl;

import fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport;
import fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K3slePackage.ASPECT_IMPORT__ASPECT_REF:
				return basicSetAspectRef(null, msgs);
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
		}
		return super.eIsSet(featureID);
	}

} //AspectImportImpl
