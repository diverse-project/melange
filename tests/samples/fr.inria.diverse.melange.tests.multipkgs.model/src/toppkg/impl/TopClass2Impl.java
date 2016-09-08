/**
 */
package toppkg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import toppkg.TopClass1;
import toppkg.TopClass2;
import toppkg.ToppkgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Class2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toppkg.impl.TopClass2Impl#getMyTopClass1 <em>My Top Class1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopClass2Impl extends MinimalEObjectImpl.Container implements TopClass2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopClass2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToppkgPackage.Literals.TOP_CLASS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopClass1 getMyTopClass1() {
		if (eContainerFeatureID() != ToppkgPackage.TOP_CLASS2__MY_TOP_CLASS1) return null;
		return (TopClass1)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyTopClass1(TopClass1 newMyTopClass1, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMyTopClass1, ToppkgPackage.TOP_CLASS2__MY_TOP_CLASS1, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyTopClass1(TopClass1 newMyTopClass1) {
		if (newMyTopClass1 != eInternalContainer() || (eContainerFeatureID() != ToppkgPackage.TOP_CLASS2__MY_TOP_CLASS1 && newMyTopClass1 != null)) {
			if (EcoreUtil.isAncestor(this, newMyTopClass1))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMyTopClass1 != null)
				msgs = ((InternalEObject)newMyTopClass1).eInverseAdd(this, ToppkgPackage.TOP_CLASS1__MY_TOP_CLASS2, TopClass1.class, msgs);
			msgs = basicSetMyTopClass1(newMyTopClass1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToppkgPackage.TOP_CLASS2__MY_TOP_CLASS1, newMyTopClass1, newMyTopClass1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToppkgPackage.TOP_CLASS2__MY_TOP_CLASS1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMyTopClass1((TopClass1)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToppkgPackage.TOP_CLASS2__MY_TOP_CLASS1:
				return basicSetMyTopClass1(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ToppkgPackage.TOP_CLASS2__MY_TOP_CLASS1:
				return eInternalContainer().eInverseRemove(this, ToppkgPackage.TOP_CLASS1__MY_TOP_CLASS2, TopClass1.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToppkgPackage.TOP_CLASS2__MY_TOP_CLASS1:
				return getMyTopClass1();
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
			case ToppkgPackage.TOP_CLASS2__MY_TOP_CLASS1:
				setMyTopClass1((TopClass1)newValue);
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
			case ToppkgPackage.TOP_CLASS2__MY_TOP_CLASS1:
				setMyTopClass1((TopClass1)null);
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
			case ToppkgPackage.TOP_CLASS2__MY_TOP_CLASS1:
				return getMyTopClass1() != null;
		}
		return super.eIsSet(featureID);
	}

} //TopClass2Impl
