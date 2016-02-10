/**
 */
package timedcompositefsm.fsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link timedcompositefsm.fsm.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link timedcompositefsm.fsm.StateMachine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see timedcompositefsm.fsm.FsmPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link timedcompositefsm.fsm.State}.
	 * It is bidirectional and its opposite is '{@link timedcompositefsm.fsm.State#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see timedcompositefsm.fsm.FsmPackage#getStateMachine_States()
	 * @see timedcompositefsm.fsm.State#getStateMachine
	 * @model opposite="stateMachine" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link timedcompositefsm.fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link timedcompositefsm.fsm.Transition#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see timedcompositefsm.fsm.FsmPackage#getStateMachine_Transitions()
	 * @see timedcompositefsm.fsm.Transition#getStateMachine
	 * @model opposite="stateMachine" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // StateMachine
