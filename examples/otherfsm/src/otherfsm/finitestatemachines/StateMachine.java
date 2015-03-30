/**
 */
package otherfsm.finitestatemachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link otherfsm.finitestatemachines.StateMachine#getStates2 <em>States2</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.StateMachine#getTransitions2 <em>Transitions2</em>}</li>
 * </ul>
 * </p>
 *
 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>States2</b></em>' containment reference list.
	 * The list contents are of type {@link otherfsm.finitestatemachines.State2}.
	 * It is bidirectional and its opposite is '{@link otherfsm.finitestatemachines.State2#getStateMachine2 <em>State Machine2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States2</em>' containment reference list.
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getStateMachine_States2()
	 * @see otherfsm.finitestatemachines.State2#getStateMachine2
	 * @model opposite="stateMachine2" containment="true"
	 * @generated
	 */
	EList<State2> getStates2();

	/**
	 * Returns the value of the '<em><b>Transitions2</b></em>' containment reference list.
	 * The list contents are of type {@link otherfsm.finitestatemachines.Transition2}.
	 * It is bidirectional and its opposite is '{@link otherfsm.finitestatemachines.Transition2#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions2</em>' containment reference list.
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getStateMachine_Transitions2()
	 * @see otherfsm.finitestatemachines.Transition2#getStateMachine
	 * @model opposite="stateMachine" containment="true"
	 * @generated
	 */
	EList<Transition2> getTransitions2();

} // StateMachine
