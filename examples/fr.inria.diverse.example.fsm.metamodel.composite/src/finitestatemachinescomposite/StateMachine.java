/**
 */
package finitestatemachinescomposite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link finitestatemachinescomposite.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link finitestatemachinescomposite.StateMachine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see finitestatemachinescomposite.FinitestatemachinescompositePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link finitestatemachinescomposite.State}.
	 * It is bidirectional and its opposite is '{@link finitestatemachinescomposite.State#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see finitestatemachinescomposite.FinitestatemachinescompositePackage#getStateMachine_States()
	 * @see finitestatemachinescomposite.State#getStateMachine
	 * @model opposite="stateMachine" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link finitestatemachinescomposite.Transition}.
	 * It is bidirectional and its opposite is '{@link finitestatemachinescomposite.Transition#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see finitestatemachinescomposite.FinitestatemachinescompositePackage#getStateMachine_Transitions()
	 * @see finitestatemachinescomposite.Transition#getStateMachine
	 * @model opposite="stateMachine" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // StateMachine
