/**
 */
package toppkg.subpkg2.subpkg3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import toppkg.subpkg2.subpkg3.Subpkg3Class1;
import toppkg.subpkg2.subpkg3.Subpkg3Class2;
import toppkg.subpkg2.subpkg3.Subpkg3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toppkg.subpkg2.subpkg3.impl.Subpkg3Class1Impl#getMySubpkg3Class2 <em>My Subpkg3 Class2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Subpkg3Class1Impl extends MinimalEObjectImpl.Container implements Subpkg3Class1 {
	/**
	 * The cached value of the '{@link #getMySubpkg3Class2() <em>My Subpkg3 Class2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMySubpkg3Class2()
	 * @generated
	 * @ordered
	 */
	protected EList<Subpkg3Class2> mySubpkg3Class2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Subpkg3Class1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subpkg3Package.Literals.SUBPKG3_CLASS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subpkg3Class2> getMySubpkg3Class2() {
		if (mySubpkg3Class2 == null) {
			mySubpkg3Class2 = new EObjectContainmentEList<Subpkg3Class2>(Subpkg3Class2.class, this, Subpkg3Package.SUBPKG3_CLASS1__MY_SUBPKG3_CLASS2);
		}
		return mySubpkg3Class2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subpkg3Package.SUBPKG3_CLASS1__MY_SUBPKG3_CLASS2:
				return ((InternalEList<?>)getMySubpkg3Class2()).basicRemove(otherEnd, msgs);
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
			case Subpkg3Package.SUBPKG3_CLASS1__MY_SUBPKG3_CLASS2:
				return getMySubpkg3Class2();
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
			case Subpkg3Package.SUBPKG3_CLASS1__MY_SUBPKG3_CLASS2:
				getMySubpkg3Class2().clear();
				getMySubpkg3Class2().addAll((Collection<? extends Subpkg3Class2>)newValue);
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
			case Subpkg3Package.SUBPKG3_CLASS1__MY_SUBPKG3_CLASS2:
				getMySubpkg3Class2().clear();
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
			case Subpkg3Package.SUBPKG3_CLASS1__MY_SUBPKG3_CLASS2:
				return mySubpkg3Class2 != null && !mySubpkg3Class2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Subpkg3Class1Impl
