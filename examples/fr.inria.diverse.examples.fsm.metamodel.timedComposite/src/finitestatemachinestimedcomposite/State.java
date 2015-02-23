/**
 */
package finitestatemachinestimedcomposite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link finitestatemachinestimedcomposite.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link finitestatemachinestimedcomposite.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link finitestatemachinestimedcomposite.State#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link finitestatemachinestimedcomposite.State#getInitialTime <em>Initial Time</em>}</li>
 *   <li>{@link finitestatemachinestimedcomposite.State#getFinalTime <em>Final Time</em>}</li>
 *   <li>{@link finitestatemachinestimedcomposite.State#getParentState <em>Parent State</em>}</li>
 * </ul>
 * </p>
 *
 * @see finitestatemachinestimedcomposite.FinitestatemachinestimedcompositePackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link finitestatemachinestimedcomposite.Transition}.
	 * It is bidirectional and its opposite is '{@link finitestatemachinestimedcomposite.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see finitestatemachinestimedcomposite.FinitestatemachinestimedcompositePackage#getState_Outgoing()
	 * @see finitestatemachinestimedcomposite.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link finitestatemachinestimedcomposite.Transition}.
	 * It is bidirectional and its opposite is '{@link finitestatemachinestimedcomposite.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see finitestatemachinestimedcomposite.FinitestatemachinestimedcompositePackage#getState_Incoming()
	 * @see finitestatemachinestimedcomposite.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link finitestatemachinestimedcomposite.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(StateMachine)
	 * @see finitestatemachinestimedcomposite.FinitestatemachinestimedcompositePackage#getState_StateMachine()
	 * @see finitestatemachinestimedcomposite.StateMachine#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link finitestatemachinestimedcomposite.State#getStateMachine <em>State Machine</em>}' container reference.
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
	 * @see finitestatemachinestimedcomposite.FinitestatemachinestimedcompositePackage#getState_InitialTime()
	 * @model
	 * @generated
	 */
	int getInitialTime();

	/**
	 * Sets the value of the '{@link finitestatemachinestimedcomposite.State#getInitialTime <em>Initial Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Time</em>' attribute.
	 * @see #getInitialTime()
	 * @generated
	 */
	void setInitialTime(int value);

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
	 * @see finitestatemachinestimedcomposite.FinitestatemachinestimedcompositePackage#getState_FinalTime()
	 * @model
	 * @generated
	 */
	int getFinalTime();

	/**
	 * Sets the value of the '{@link finitestatemachinestimedcomposite.State#getFinalTime <em>Final Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Time</em>' attribute.
	 * @see #getFinalTime()
	 * @generated
	 */
	void setFinalTime(int value);

	/**
	 * Returns the value of the '<em><b>Parent State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent State</em>' reference.
	 * @see #setParentState(CompositeState)
	 * @see finitestatemachinestimedcomposite.FinitestatemachinestimedcompositePackage#getState_ParentState()
	 * @model
	 * @generated
	 */
	CompositeState getParentState();

	/**
	 * Sets the value of the '{@link finitestatemachinestimedcomposite.State#getParentState <em>Parent State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent State</em>' reference.
	 * @see #getParentState()
	 * @generated
	 */
	void setParentState(CompositeState value);

} // State
