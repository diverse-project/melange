/**
 */
package extended.toppkg.subpkg2.impl;

import extended.toppkg.subpkg2.Subpkg2Class2;
import extended.toppkg.subpkg2.Subpkg2Package;

import extended.toppkg.subpkg2.subpkg3.Subpkg3Class1;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extended.toppkg.subpkg2.impl.Subpkg2Class2Impl#getMySubpkg3Class1 <em>My Subpkg3 Class1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Subpkg2Class2Impl extends MinimalEObjectImpl.Container implements Subpkg2Class2 {
	/**
	 * The cached value of the '{@link #getMySubpkg3Class1() <em>My Subpkg3 Class1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMySubpkg3Class1()
	 * @generated
	 * @ordered
	 */
	protected EList<Subpkg3Class1> mySubpkg3Class1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Subpkg2Class2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subpkg2Package.Literals.SUBPKG2_CLASS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subpkg3Class1> getMySubpkg3Class1() {
		if (mySubpkg3Class1 == null) {
			mySubpkg3Class1 = new EObjectContainmentEList<Subpkg3Class1>(Subpkg3Class1.class, this, Subpkg2Package.SUBPKG2_CLASS2__MY_SUBPKG3_CLASS1);
		}
		return mySubpkg3Class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subpkg2Package.SUBPKG2_CLASS2__MY_SUBPKG3_CLASS1:
				return ((InternalEList<?>)getMySubpkg3Class1()).basicRemove(otherEnd, msgs);
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
			case Subpkg2Package.SUBPKG2_CLASS2__MY_SUBPKG3_CLASS1:
				return getMySubpkg3Class1();
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
			case Subpkg2Package.SUBPKG2_CLASS2__MY_SUBPKG3_CLASS1:
				getMySubpkg3Class1().clear();
				getMySubpkg3Class1().addAll((Collection<? extends Subpkg3Class1>)newValue);
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
			case Subpkg2Package.SUBPKG2_CLASS2__MY_SUBPKG3_CLASS1:
				getMySubpkg3Class1().clear();
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
			case Subpkg2Package.SUBPKG2_CLASS2__MY_SUBPKG3_CLASS1:
				return mySubpkg3Class1 != null && !mySubpkg3Class1.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Subpkg2Class2Impl
