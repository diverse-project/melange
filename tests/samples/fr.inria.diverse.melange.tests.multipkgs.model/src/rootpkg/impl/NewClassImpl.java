/**
 */
package rootpkg.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import root.impl.ClassImpl;

import rootpkg.NewClass;
import rootpkg.RootpkgPackage;

import toppkg.subpkg2.Subpkg2Class1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rootpkg.impl.NewClassImpl#getToSubpkg2Class1 <em>To Subpkg2 Class1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewClassImpl extends ClassImpl implements NewClass {
	/**
	 * The cached value of the '{@link #getToSubpkg2Class1() <em>To Subpkg2 Class1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSubpkg2Class1()
	 * @generated
	 * @ordered
	 */
	protected Subpkg2Class1 toSubpkg2Class1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootpkgPackage.Literals.NEW_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg2Class1 getToSubpkg2Class1() {
		if (toSubpkg2Class1 != null && toSubpkg2Class1.eIsProxy()) {
			InternalEObject oldToSubpkg2Class1 = (InternalEObject)toSubpkg2Class1;
			toSubpkg2Class1 = (Subpkg2Class1)eResolveProxy(oldToSubpkg2Class1);
			if (toSubpkg2Class1 != oldToSubpkg2Class1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootpkgPackage.NEW_CLASS__TO_SUBPKG2_CLASS1, oldToSubpkg2Class1, toSubpkg2Class1));
			}
		}
		return toSubpkg2Class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg2Class1 basicGetToSubpkg2Class1() {
		return toSubpkg2Class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToSubpkg2Class1(Subpkg2Class1 newToSubpkg2Class1) {
		Subpkg2Class1 oldToSubpkg2Class1 = toSubpkg2Class1;
		toSubpkg2Class1 = newToSubpkg2Class1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootpkgPackage.NEW_CLASS__TO_SUBPKG2_CLASS1, oldToSubpkg2Class1, toSubpkg2Class1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootpkgPackage.NEW_CLASS__TO_SUBPKG2_CLASS1:
				if (resolve) return getToSubpkg2Class1();
				return basicGetToSubpkg2Class1();
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
			case RootpkgPackage.NEW_CLASS__TO_SUBPKG2_CLASS1:
				setToSubpkg2Class1((Subpkg2Class1)newValue);
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
			case RootpkgPackage.NEW_CLASS__TO_SUBPKG2_CLASS1:
				setToSubpkg2Class1((Subpkg2Class1)null);
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
			case RootpkgPackage.NEW_CLASS__TO_SUBPKG2_CLASS1:
				return toSubpkg2Class1 != null;
		}
		return super.eIsSet(featureID);
	}

} //NewClassImpl
