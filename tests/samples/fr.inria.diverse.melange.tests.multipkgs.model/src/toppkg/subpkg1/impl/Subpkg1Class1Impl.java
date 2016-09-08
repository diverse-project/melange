/**
 */
package toppkg.subpkg1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import toppkg.subpkg1.Subpkg1Class1;
import toppkg.subpkg1.Subpkg1Class2;
import toppkg.subpkg1.Subpkg1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toppkg.subpkg1.impl.Subpkg1Class1Impl#getMySubpkg1Class2 <em>My Subpkg1 Class2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Subpkg1Class1Impl extends MinimalEObjectImpl.Container implements Subpkg1Class1 {
	/**
	 * The cached value of the '{@link #getMySubpkg1Class2() <em>My Subpkg1 Class2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMySubpkg1Class2()
	 * @generated
	 * @ordered
	 */
	protected EList<Subpkg1Class2> mySubpkg1Class2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Subpkg1Class1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subpkg1Package.Literals.SUBPKG1_CLASS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subpkg1Class2> getMySubpkg1Class2() {
		if (mySubpkg1Class2 == null) {
			mySubpkg1Class2 = new EObjectContainmentEList<Subpkg1Class2>(Subpkg1Class2.class, this, Subpkg1Package.SUBPKG1_CLASS1__MY_SUBPKG1_CLASS2);
		}
		return mySubpkg1Class2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subpkg1Package.SUBPKG1_CLASS1__MY_SUBPKG1_CLASS2:
				return ((InternalEList<?>)getMySubpkg1Class2()).basicRemove(otherEnd, msgs);
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
			case Subpkg1Package.SUBPKG1_CLASS1__MY_SUBPKG1_CLASS2:
				return getMySubpkg1Class2();
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
			case Subpkg1Package.SUBPKG1_CLASS1__MY_SUBPKG1_CLASS2:
				getMySubpkg1Class2().clear();
				getMySubpkg1Class2().addAll((Collection<? extends Subpkg1Class2>)newValue);
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
			case Subpkg1Package.SUBPKG1_CLASS1__MY_SUBPKG1_CLASS2:
				getMySubpkg1Class2().clear();
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
			case Subpkg1Package.SUBPKG1_CLASS1__MY_SUBPKG1_CLASS2:
				return mySubpkg1Class2 != null && !mySubpkg1Class2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Subpkg1Class1Impl
