/**
 */
package finitestatemachinestimed;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link finitestatemachinestimed.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link finitestatemachinestimed.StateMachine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see finitestatemachinestimed.FinitestatemachinestimedPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link finitestatemachinestimed.State}.
	 * It is bidirectional and its opposite is '{@link finitestatemachinestimed.State#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see finitestatemachinestimed.FinitestatemachinestimedPackage#getStateMachine_States()
	 * @see finitestatemachinestimed.State#getStateMachine
	 * @model opposite="stateMachine" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link finitestatemachinestimed.Transition}.
	 * It is bidirectional and its opposite is '{@link finitestatemachinestimed.Transition#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see finitestatemachinestimed.FinitestatemachinestimedPackage#getStateMachine_Transitions()
	 * @see finitestatemachinestimed.Transition#getStateMachine
	 * @model opposite="stateMachine" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // StateMachine
