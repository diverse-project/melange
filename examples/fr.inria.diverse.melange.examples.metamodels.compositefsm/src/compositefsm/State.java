/**
 */
package compositefsm;

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
 *   <li>{@link compositefsm.State#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link compositefsm.State#getName <em>Name</em>}</li>
 *   <li>{@link compositefsm.State#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link compositefsm.State#getIncomingTransition <em>Incoming Transition</em>}</li>
 *   <li>{@link compositefsm.State#getSubStates <em>Sub States</em>}</li>
 *   <li>{@link compositefsm.State#getSuperState <em>Super State</em>}</li>
 * </ul>
 * </p>
 *
 * @see compositefsm.CompositefsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compositefsm.FSM#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning FSM</em>' container reference.
	 * @see #setOwningFSM(FSM)
	 * @see compositefsm.CompositefsmPackage#getState_OwningFSM()
	 * @see compositefsm.FSM#getOwnedState
	 * @model opposite="ownedState" required="true" transient="false"
	 * @generated
	 */
	FSM getOwningFSM();

	/**
	 * Sets the value of the '{@link compositefsm.State#getOwningFSM <em>Owning FSM</em>}' container reference.
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
	 * @see compositefsm.CompositefsmPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link compositefsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transition</b></em>' containment reference list.
	 * The list contents are of type {@link compositefsm.Transition}.
	 * It is bidirectional and its opposite is '{@link compositefsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transition</em>' containment reference list.
	 * @see compositefsm.CompositefsmPackage#getState_OutgoingTransition()
	 * @see compositefsm.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoingTransition();

	/**
	 * Returns the value of the '<em><b>Incoming Transition</b></em>' reference list.
	 * The list contents are of type {@link compositefsm.Transition}.
	 * It is bidirectional and its opposite is '{@link compositefsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transition</em>' reference list.
	 * @see compositefsm.CompositefsmPackage#getState_IncomingTransition()
	 * @see compositefsm.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransition();

	/**
	 * Returns the value of the '<em><b>Sub States</b></em>' reference list.
	 * The list contents are of type {@link compositefsm.State}.
	 * It is bidirectional and its opposite is '{@link compositefsm.State#getSuperState <em>Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub States</em>' reference list.
	 * @see compositefsm.CompositefsmPackage#getState_SubStates()
	 * @see compositefsm.State#getSuperState
	 * @model opposite="superState"
	 * @generated
	 */
	EList<State> getSubStates();

	/**
	 * Returns the value of the '<em><b>Super State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link compositefsm.State#getSubStates <em>Sub States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super State</em>' reference.
	 * @see #setSuperState(State)
	 * @see compositefsm.CompositefsmPackage#getState_SuperState()
	 * @see compositefsm.State#getSubStates
	 * @model opposite="subStates"
	 * @generated
	 */
	State getSuperState();

	/**
	 * Sets the value of the '{@link compositefsm.State#getSuperState <em>Super State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super State</em>' reference.
	 * @see #getSuperState()
	 * @generated
	 */
	void setSuperState(State value);

} // State
