/**
 */
package toppkg.subpkg2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import toppkg.subpkg2.Subpkg2Class1;
import toppkg.subpkg2.Subpkg2Class2;
import toppkg.subpkg2.Subpkg2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link toppkg.subpkg2.impl.Subpkg2Class1Impl#getMySubpkg2Class2 <em>My Subpkg2 Class2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Subpkg2Class1Impl extends MinimalEObjectImpl.Container implements Subpkg2Class1 {
	/**
	 * The cached value of the '{@link #getMySubpkg2Class2() <em>My Subpkg2 Class2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMySubpkg2Class2()
	 * @generated
	 * @ordered
	 */
	protected EList<Subpkg2Class2> mySubpkg2Class2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Subpkg2Class1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subpkg2Package.Literals.SUBPKG2_CLASS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subpkg2Class2> getMySubpkg2Class2() {
		if (mySubpkg2Class2 == null) {
			mySubpkg2Class2 = new EObjectContainmentEList<Subpkg2Class2>(Subpkg2Class2.class, this, Subpkg2Package.SUBPKG2_CLASS1__MY_SUBPKG2_CLASS2);
		}
		return mySubpkg2Class2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subpkg2Package.SUBPKG2_CLASS1__MY_SUBPKG2_CLASS2:
				return ((InternalEList<?>)getMySubpkg2Class2()).basicRemove(otherEnd, msgs);
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
			case Subpkg2Package.SUBPKG2_CLASS1__MY_SUBPKG2_CLASS2:
				return getMySubpkg2Class2();
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
			case Subpkg2Package.SUBPKG2_CLASS1__MY_SUBPKG2_CLASS2:
				getMySubpkg2Class2().clear();
				getMySubpkg2Class2().addAll((Collection<? extends Subpkg2Class2>)newValue);
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
			case Subpkg2Package.SUBPKG2_CLASS1__MY_SUBPKG2_CLASS2:
				getMySubpkg2Class2().clear();
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
			case Subpkg2Package.SUBPKG2_CLASS1__MY_SUBPKG2_CLASS2:
				return mySubpkg2Class2 != null && !mySubpkg2Class2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Subpkg2Class1Impl
