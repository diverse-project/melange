/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle.impl;

import fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage;
import fr.inria.diverse.k3.sle.metamodel.k3sle.KomprenSlicer;

import kompren.Slicer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kompren Slicer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.KomprenSlicerImpl#getSlicer <em>Slicer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KomprenSlicerImpl extends TransformationImpl implements KomprenSlicer {
	/**
	 * The cached value of the '{@link #getSlicer() <em>Slicer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlicer()
	 * @generated
	 * @ordered
	 */
	protected Slicer slicer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KomprenSlicerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K3slePackage.Literals.KOMPREN_SLICER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slicer getSlicer() {
		return slicer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlicer(Slicer newSlicer, NotificationChain msgs) {
		Slicer oldSlicer = slicer;
		slicer = newSlicer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K3slePackage.KOMPREN_SLICER__SLICER, oldSlicer, newSlicer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlicer(Slicer newSlicer) {
		if (newSlicer != slicer) {
			NotificationChain msgs = null;
			if (slicer != null)
				msgs = ((InternalEObject)slicer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K3slePackage.KOMPREN_SLICER__SLICER, null, msgs);
			if (newSlicer != null)
				msgs = ((InternalEObject)newSlicer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K3slePackage.KOMPREN_SLICER__SLICER, null, msgs);
			msgs = basicSetSlicer(newSlicer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.KOMPREN_SLICER__SLICER, newSlicer, newSlicer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K3slePackage.KOMPREN_SLICER__SLICER:
				return basicSetSlicer(null, msgs);
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
			case K3slePackage.KOMPREN_SLICER__SLICER:
				return getSlicer();
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
			case K3slePackage.KOMPREN_SLICER__SLICER:
				setSlicer((Slicer)newValue);
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
			case K3slePackage.KOMPREN_SLICER__SLICER:
				setSlicer((Slicer)null);
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
			case K3slePackage.KOMPREN_SLICER__SLICER:
				return slicer != null;
		}
		return super.eIsSet(featureID);
	}

} //KomprenSlicerImpl
