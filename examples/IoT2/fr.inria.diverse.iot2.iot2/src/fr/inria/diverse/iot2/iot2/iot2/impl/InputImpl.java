/**
 */
package fr.inria.diverse.iot2.iot2.iot2.impl;

import fr.inria.diverse.iot2.iot2.iot2.Input;
import fr.inria.diverse.iot2.iot2.iot2.InputValue;
import fr.inria.diverse.iot2.iot2.iot2.Iot2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.InputImpl#getInputValues <em>Input Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends EObjectImpl implements Input {
	/**
	 * The cached value of the '{@link #getInputValues() <em>Input Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValues()
	 * @generated
	 * @ordered
	 */
	protected EList<InputValue> inputValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iot2Package.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputValue> getInputValues() {
		if (inputValues == null) {
			inputValues = new EObjectContainmentEList<InputValue>(InputValue.class, this, Iot2Package.INPUT__INPUT_VALUES);
		}
		return inputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iot2Package.INPUT__INPUT_VALUES:
				return ((InternalEList<?>)getInputValues()).basicRemove(otherEnd, msgs);
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
			case Iot2Package.INPUT__INPUT_VALUES:
				return getInputValues();
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
			case Iot2Package.INPUT__INPUT_VALUES:
				getInputValues().clear();
				getInputValues().addAll((Collection<? extends InputValue>)newValue);
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
			case Iot2Package.INPUT__INPUT_VALUES:
				getInputValues().clear();
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
			case Iot2Package.INPUT__INPUT_VALUES:
				return inputValues != null && !inputValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputImpl
