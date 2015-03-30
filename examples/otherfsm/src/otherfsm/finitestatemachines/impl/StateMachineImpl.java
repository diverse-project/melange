/**
 */
package otherfsm.finitestatemachines.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import otherfsm.finitestatemachines.FinitestatemachinesPackage;
import otherfsm.finitestatemachines.State2;
import otherfsm.finitestatemachines.StateMachine;
import otherfsm.finitestatemachines.Transition2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link otherfsm.finitestatemachines.impl.StateMachineImpl#getStates2 <em>States2</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.StateMachineImpl#getTransitions2 <em>Transitions2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends NamedElementImpl implements StateMachine {
	/**
	 * The cached value of the '{@link #getStates2() <em>States2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates2()
	 * @generated
	 * @ordered
	 */
	protected EList<State2> states2;

	/**
	 * The cached value of the '{@link #getTransitions2() <em>Transitions2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions2()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition2> transitions2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinitestatemachinesPackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State2> getStates2() {
		if (states2 == null) {
			states2 = new EObjectContainmentWithInverseEList<State2>(State2.class, this, FinitestatemachinesPackage.STATE_MACHINE__STATES2, FinitestatemachinesPackage.STATE2__STATE_MACHINE2);
		}
		return states2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition2> getTransitions2() {
		if (transitions2 == null) {
			transitions2 = new EObjectContainmentWithInverseEList<Transition2>(Transition2.class, this, FinitestatemachinesPackage.STATE_MACHINE__TRANSITIONS2, FinitestatemachinesPackage.TRANSITION2__STATE_MACHINE);
		}
		return transitions2;
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
			case FinitestatemachinesPackage.STATE_MACHINE__STATES2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates2()).basicAdd(otherEnd, msgs);
			case FinitestatemachinesPackage.STATE_MACHINE__TRANSITIONS2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions2()).basicAdd(otherEnd, msgs);
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
			case FinitestatemachinesPackage.STATE_MACHINE__STATES2:
				return ((InternalEList<?>)getStates2()).basicRemove(otherEnd, msgs);
			case FinitestatemachinesPackage.STATE_MACHINE__TRANSITIONS2:
				return ((InternalEList<?>)getTransitions2()).basicRemove(otherEnd, msgs);
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
			case FinitestatemachinesPackage.STATE_MACHINE__STATES2:
				return getStates2();
			case FinitestatemachinesPackage.STATE_MACHINE__TRANSITIONS2:
				return getTransitions2();
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
			case FinitestatemachinesPackage.STATE_MACHINE__STATES2:
				getStates2().clear();
				getStates2().addAll((Collection<? extends State2>)newValue);
				return;
			case FinitestatemachinesPackage.STATE_MACHINE__TRANSITIONS2:
				getTransitions2().clear();
				getTransitions2().addAll((Collection<? extends Transition2>)newValue);
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
			case FinitestatemachinesPackage.STATE_MACHINE__STATES2:
				getStates2().clear();
				return;
			case FinitestatemachinesPackage.STATE_MACHINE__TRANSITIONS2:
				getTransitions2().clear();
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
			case FinitestatemachinesPackage.STATE_MACHINE__STATES2:
				return states2 != null && !states2.isEmpty();
			case FinitestatemachinesPackage.STATE_MACHINE__TRANSITIONS2:
				return transitions2 != null && !transitions2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateMachineImpl
