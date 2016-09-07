/**
 */
package extended.toppkg.impl;

import extended.toppkg.ClassA;
import extended.toppkg.ToppkgPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extended.toppkg.impl.ClassAImpl#getToClassA <em>To Class A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassAImpl extends MinimalEObjectImpl.Container implements ClassA {
	/**
	 * The cached value of the '{@link #getToClassA() <em>To Class A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToClassA()
	 * @generated
	 * @ordered
	 */
	protected extended.toppkg.subpkg2.subpkg3.ClassA toClassA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToppkgPackage.Literals.CLASS_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public extended.toppkg.subpkg2.subpkg3.ClassA getToClassA() {
		if (toClassA != null && toClassA.eIsProxy()) {
			InternalEObject oldToClassA = (InternalEObject)toClassA;
			toClassA = (extended.toppkg.subpkg2.subpkg3.ClassA)eResolveProxy(oldToClassA);
			if (toClassA != oldToClassA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToppkgPackage.CLASS_A__TO_CLASS_A, oldToClassA, toClassA));
			}
		}
		return toClassA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public extended.toppkg.subpkg2.subpkg3.ClassA basicGetToClassA() {
		return toClassA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToClassA(extended.toppkg.subpkg2.subpkg3.ClassA newToClassA) {
		extended.toppkg.subpkg2.subpkg3.ClassA oldToClassA = toClassA;
		toClassA = newToClassA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToppkgPackage.CLASS_A__TO_CLASS_A, oldToClassA, toClassA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToppkgPackage.CLASS_A__TO_CLASS_A:
				if (resolve) return getToClassA();
				return basicGetToClassA();
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
			case ToppkgPackage.CLASS_A__TO_CLASS_A:
				setToClassA((extended.toppkg.subpkg2.subpkg3.ClassA)newValue);
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
			case ToppkgPackage.CLASS_A__TO_CLASS_A:
				setToClassA((extended.toppkg.subpkg2.subpkg3.ClassA)null);
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
			case ToppkgPackage.CLASS_A__TO_CLASS_A:
				return toClassA != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassAImpl
