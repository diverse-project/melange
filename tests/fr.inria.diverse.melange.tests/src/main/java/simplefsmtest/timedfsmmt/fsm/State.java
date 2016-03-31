/**
 */
package simplefsmtest.timedfsmmt.fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simplefsmtest.timedfsmmt.fsm.State#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link simplefsmtest.timedfsmmt.fsm.State#getName <em>Name</em>}</li>
 *   <li>{@link simplefsmtest.timedfsmmt.fsm.State#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link simplefsmtest.timedfsmmt.fsm.State#getIncomingTransition <em>Incoming Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see simplefsmtest.timedfsmmt.fsm.FsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplefsmtest.timedfsmmt.fsm.FSM#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning FSM</em>' container reference.
	 * @see #setOwningFSM(FSM)
	 * @see simplefsmtest.timedfsmmt.fsm.FsmPackage#getState_OwningFSM()
	 * @see simplefsmtest.timedfsmmt.fsm.FSM#getOwnedState
	 * @model opposite="ownedState" required="true" transient="false"
	 * @generated
	 */
	FSM getOwningFSM();

	/**
	 * Sets the value of the '{@link simplefsmtest.timedfsmmt.fsm.State#getOwningFSM <em>Owning FSM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning FSM</em>' container reference.
	 * @see #getOwningFSM()
	 * @generated
	 */
	void setOwningFSM(FSM value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplefsmtest.timedfsmmt.fsm.FsmPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplefsmtest.timedfsmmt.fsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transition</b></em>' containment reference list.
	 * The list contents are of type {@link simplefsmtest.timedfsmmt.fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link simplefsmtest.timedfsmmt.fsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transition</em>' containment reference list.
	 * @see simplefsmtest.timedfsmmt.fsm.FsmPackage#getState_OutgoingTransition()
	 * @see simplefsmtest.timedfsmmt.fsm.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoingTransition();

	/**
	 * Returns the value of the '<em><b>Incoming Transition</b></em>' reference list.
	 * The list contents are of type {@link simplefsmtest.timedfsmmt.fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link simplefsmtest.timedfsmmt.fsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transition</em>' reference list.
	 * @see simplefsmtest.timedfsmmt.fsm.FsmPackage#getState_IncomingTransition()
	 * @see simplefsmtest.timedfsmmt.fsm.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransition();

} // State
