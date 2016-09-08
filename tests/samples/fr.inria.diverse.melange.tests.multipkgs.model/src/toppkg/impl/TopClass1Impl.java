/**
 */
package toppkg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import toppkg.TopClass1;
import toppkg.TopClass2;
import toppkg.ToppkgPackage;

import toppkg.subpkg1.Subpkg1Class1;

import toppkg.subpkg2.Subpkg2Class1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Class1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toppkg.impl.TopClass1Impl#getMyTopClass2 <em>My Top Class2</em>}</li>
 *   <li>{@link toppkg.impl.TopClass1Impl#getMySubPkg1Class1 <em>My Sub Pkg1 Class1</em>}</li>
 *   <li>{@link toppkg.impl.TopClass1Impl#getMySubpkg2Class1 <em>My Subpkg2 Class1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopClass1Impl extends MinimalEObjectImpl.Container implements TopClass1 {
	/**
	 * The cached value of the '{@link #getMyTopClass2() <em>My Top Class2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyTopClass2()
	 * @generated
	 * @ordered
	 */
	protected EList<TopClass2> myTopClass2;

	/**
	 * The cached value of the '{@link #getMySubPkg1Class1() <em>My Sub Pkg1 Class1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMySubPkg1Class1()
	 * @generated
	 * @ordered
	 */
	protected EList<Subpkg1Class1> mySubPkg1Class1;

	/**
	 * The cached value of the '{@link #getMySubpkg2Class1() <em>My Subpkg2 Class1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMySubpkg2Class1()
	 * @generated
	 * @ordered
	 */
	protected EList<Subpkg2Class1> mySubpkg2Class1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopClass1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToppkgPackage.Literals.TOP_CLASS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopClass2> getMyTopClass2() {
		if (myTopClass2 == null) {
			myTopClass2 = new EObjectContainmentWithInverseEList<TopClass2>(TopClass2.class, this, ToppkgPackage.TOP_CLASS1__MY_TOP_CLASS2, ToppkgPackage.TOP_CLASS2__MY_TOP_CLASS1);
		}
		return myTopClass2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subpkg1Class1> getMySubPkg1Class1() {
		if (mySubPkg1Class1 == null) {
			mySubPkg1Class1 = new EObjectContainmentEList<Subpkg1Class1>(Subpkg1Class1.class, this, ToppkgPackage.TOP_CLASS1__MY_SUB_PKG1_CLASS1);
		}
		return mySubPkg1Class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subpkg2Class1> getMySubpkg2Class1() {
		if (mySubpkg2Class1 == null) {
			mySubpkg2Class1 = new EObjectContainmentEList<Subpkg2Class1>(Subpkg2Class1.class, this, ToppkgPackage.TOP_CLASS1__MY_SUBPKG2_CLASS1);
		}
		return mySubpkg2Class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToppkgPackage.TOP_CLASS1__MY_TOP_CLASS2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMyTopClass2()).basicAdd(otherEnd, msgs);
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
			case ToppkgPackage.TOP_CLASS1__MY_TOP_CLASS2:
				return ((InternalEList<?>)getMyTopClass2()).basicRemove(otherEnd, msgs);
			case ToppkgPackage.TOP_CLASS1__MY_SUB_PKG1_CLASS1:
				return ((InternalEList<?>)getMySubPkg1Class1()).basicRemove(otherEnd, msgs);
			case ToppkgPackage.TOP_CLASS1__MY_SUBPKG2_CLASS1:
				return ((InternalEList<?>)getMySubpkg2Class1()).basicRemove(otherEnd, msgs);
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
			case ToppkgPackage.TOP_CLASS1__MY_TOP_CLASS2:
				return getMyTopClass2();
			case ToppkgPackage.TOP_CLASS1__MY_SUB_PKG1_CLASS1:
				return getMySubPkg1Class1();
			case ToppkgPackage.TOP_CLASS1__MY_SUBPKG2_CLASS1:
				return getMySubpkg2Class1();
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
			case ToppkgPackage.TOP_CLASS1__MY_TOP_CLASS2:
				getMyTopClass2().clear();
				getMyTopClass2().addAll((Collection<? extends TopClass2>)newValue);
				return;
			case ToppkgPackage.TOP_CLASS1__MY_SUB_PKG1_CLASS1:
				getMySubPkg1Class1().clear();
				getMySubPkg1Class1().addAll((Collection<? extends Subpkg1Class1>)newValue);
				return;
			case ToppkgPackage.TOP_CLASS1__MY_SUBPKG2_CLASS1:
				getMySubpkg2Class1().clear();
				getMySubpkg2Class1().addAll((Collection<? extends Subpkg2Class1>)newValue);
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
			case ToppkgPackage.TOP_CLASS1__MY_TOP_CLASS2:
				getMyTopClass2().clear();
				return;
			case ToppkgPackage.TOP_CLASS1__MY_SUB_PKG1_CLASS1:
				getMySubPkg1Class1().clear();
				return;
			case ToppkgPackage.TOP_CLASS1__MY_SUBPKG2_CLASS1:
				getMySubpkg2Class1().clear();
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
			case ToppkgPackage.TOP_CLASS1__MY_TOP_CLASS2:
				return myTopClass2 != null && !myTopClass2.isEmpty();
			case ToppkgPackage.TOP_CLASS1__MY_SUB_PKG1_CLASS1:
				return mySubPkg1Class1 != null && !mySubPkg1Class1.isEmpty();
			case ToppkgPackage.TOP_CLASS1__MY_SUBPKG2_CLASS1:
				return mySubpkg2Class1 != null && !mySubpkg2Class1.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TopClass1Impl
