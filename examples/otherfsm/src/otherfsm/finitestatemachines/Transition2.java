/**
 */
package otherfsm.finitestatemachines;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link otherfsm.finitestatemachines.Transition2#getTarget <em>Target</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.Transition2#getSource <em>Source</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.Transition2#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.Transition2#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.Transition2#getInitialTime <em>Initial Time</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.Transition2#getFinalTime2 <em>Final Time2</em>}</li>
 * </ul>
 * </p>
 *
 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getTransition2()
 * @model
 * @generated
 */
public interface Transition2 extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link otherfsm.finitestatemachines.State2#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State2)
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getTransition2_Target()
	 * @see otherfsm.finitestatemachines.State2#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	State2 getTarget();

	/**
	 * Sets the value of the '{@link otherfsm.finitestatemachines.Transition2#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State2 value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link otherfsm.finitestatemachines.State2#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State2)
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getTransition2_Source()
	 * @see otherfsm.finitestatemachines.State2#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	State2 getSource();

	/**
	 * Sets the value of the '{@link otherfsm.finitestatemachines.Transition2#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State2 value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(Trigger2)
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getTransition2_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	Trigger2 getTrigger();

	/**
	 * Sets the value of the '{@link otherfsm.finitestatemachines.Transition2#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Trigger2 value);

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link otherfsm.finitestatemachines.StateMachine#getTransitions2 <em>Transitions2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(StateMachine)
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getTransition2_StateMachine()
	 * @see otherfsm.finitestatemachines.StateMachine#getTransitions2
	 * @model opposite="transitions2" required="true" transient="false"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link otherfsm.finitestatemachines.Transition2#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Initial Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Time</em>' attribute.
	 * @see #setInitialTime(int)
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getTransition2_InitialTime()
	 * @model
	 * @generated
	 */
	int getInitialTime();

	/**
	 * Sets the value of the '{@link otherfsm.finitestatemachines.Transition2#getInitialTime <em>Initial Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Time</em>' attribute.
	 * @see #getInitialTime()
	 * @generated
	 */
	void setInitialTime(int value);

	/**
	 * Returns the value of the '<em><b>Final Time2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Time2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Time2</em>' attribute.
	 * @see #setFinalTime2(int)
	 * @see otherfsm.finitestatemachines.FinitestatemachinesPackage#getTransition2_FinalTime2()
	 * @model
	 * @generated
	 */
	int getFinalTime2();

	/**
	 * Sets the value of the '{@link otherfsm.finitestatemachines.Transition2#getFinalTime2 <em>Final Time2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Time2</em>' attribute.
	 * @see #getFinalTime2()
	 * @generated
	 */
	void setFinalTime2(int value);

} // Transition2
