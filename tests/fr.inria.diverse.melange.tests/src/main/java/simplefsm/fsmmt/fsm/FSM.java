/**
 */
package simplefsm.fsmmt.fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplefsm.fsmmt.fsm.FSM#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link simplefsm.fsmmt.fsm.FSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link simplefsm.fsmmt.fsm.FSM#getFinalState <em>Final State</em>}</li>
 * </ul>
 *
 * @see simplefsm.fsmmt.fsm.FsmPackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' containment reference list.
	 * The list contents are of type {@link simplefsm.fsmmt.fsm.State}.
	 * It is bidirectional and its opposite is '{@link simplefsm.fsmmt.fsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' containment reference list.
	 * @see simplefsm.fsmmt.fsm.FsmPackage#getFSM_OwnedState()
	 * @see simplefsm.fsmmt.fsm.State#getOwningFSM
	 * @model opposite="owningFSM" containment="true"
	 * @generated
	 */
	EList<State> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see simplefsm.fsmmt.fsm.FsmPackage#getFSM_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link simplefsm.fsmmt.fsm.FSM#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' reference list.
	 * The list contents are of type {@link simplefsm.fsmmt.fsm.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' reference list.
	 * @see simplefsm.fsmmt.fsm.FsmPackage#getFSM_FinalState()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getFinalState();

} // FSM
