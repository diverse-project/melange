/**
 */
package finitestatemachinestimedcomposite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link finitestatemachinestimedcomposite.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link finitestatemachinestimedcomposite.StateMachine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see finitestatemachinestimedcomposite.FinitestatemachinestimedcompositePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link finitestatemachinestimedcomposite.State}.
	 * It is bidirectional and its opposite is '{@link finitestatemachinestimedcomposite.State#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see finitestatemachinestimedcomposite.FinitestatemachinestimedcompositePackage#getStateMachine_States()
	 * @see finitestatemachinestimedcomposite.State#getStateMachine
	 * @model opposite="stateMachine" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link finitestatemachinestimedcomposite.Transition}.
	 * It is bidirectional and its opposite is '{@link finitestatemachinestimedcomposite.Transition#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see finitestatemachinestimedcomposite.FinitestatemachinestimedcompositePackage#getStateMachine_Transitions()
	 * @see finitestatemachinestimedcomposite.Transition#getStateMachine
	 * @model opposite="stateMachine" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // StateMachine
