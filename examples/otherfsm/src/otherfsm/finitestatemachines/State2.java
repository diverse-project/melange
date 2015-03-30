/**
 */
package otherfsm.finitestatemachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link otherfsm.finitestatemachines.State2#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.State2#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.State2#getStateMachine2 <em>State Machine2</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.State2#getInitialTime2 <em>Initial Time2</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.State2#getFinalTime <em>Final Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getState2()
 * @model
 * @generated
 */
public interface State2 extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link otherfsm.finitestatemachines.Transition2}.
	 * It is bidirectional and its opposite is '{@link otherfsm.finitestatemachines.Transition2#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getState2_Outgoing()
	 * @see otherfsm.finitestatemachines.Transition2#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition2> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link otherfsm.finitestatemachines.Transition2}.
	 * It is bidirectional and its opposite is '{@link otherfsm.finitestatemachines.Transition2#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getState2_Incoming()
	 * @see otherfsm.finitestatemachines.Transition2#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition2> getIncoming();

	/**
	 * Returns the value of the '<em><b>State Machine2</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link otherfsm.finitestatemachines.StateMachine#getStates2 <em>States2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine2</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine2</em>' container reference.
	 * @see #setStateMachine2(StateMachine)
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getState2_StateMachine2()
	 * @see otherfsm.finitestatemachines.StateMachine#getStates2
	 * @model opposite="states2" transient="false"
	 * @generated
	 */
	StateMachine getStateMachine2();

	/**
	 * Sets the value of the '{@link otherfsm.finitestatemachines.State2#getStateMachine2 <em>State Machine2</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine2</em>' container reference.
	 * @see #getStateMachine2()
	 * @generated
	 */
	void setStateMachine2(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Initial Time2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Time2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Time2</em>' attribute.
	 * @see #setInitialTime2(int)
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getState2_InitialTime2()
	 * @model
	 * @generated
	 */
	int getInitialTime2();

	/**
	 * Sets the value of the '{@link otherfsm.finitestatemachines.State2#getInitialTime2 <em>Initial Time2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Time2</em>' attribute.
	 * @see #getInitialTime2()
	 * @generated
	 */
	void setInitialTime2(int value);

	/**
	 * Returns the value of the '<em><b>Final Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Time</em>' attribute.
	 * @see #setFinalTime(int)
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getState2_FinalTime()
	 * @model
	 * @generated
	 */
	int getFinalTime();

	/**
	 * Sets the value of the '{@link otherfsm.finitestatemachines.State2#getFinalTime <em>Final Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Time</em>' attribute.
	 * @see #getFinalTime()
	 * @generated
	 */
	void setFinalTime(int value);

} // State2
