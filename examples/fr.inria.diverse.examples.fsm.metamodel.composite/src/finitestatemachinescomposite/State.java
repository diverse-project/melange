/**
 */
package finitestatemachinescomposite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link finitestatemachinescomposite.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link finitestatemachinescomposite.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link finitestatemachinescomposite.State#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link finitestatemachinescomposite.State#getInitialTime <em>Initial Time</em>}</li>
 *   <li>{@link finitestatemachinescomposite.State#getFinalTime <em>Final Time</em>}</li>
 *   <li>{@link finitestatemachinescomposite.State#getParentState <em>Parent State</em>}</li>
 * </ul>
 * </p>
 *
 * @see finitestatemachinescomposite.FinitestatemachinescompositePackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link finitestatemachinescomposite.Transition}.
	 * It is bidirectional and its opposite is '{@link finitestatemachinescomposite.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see finitestatemachinescomposite.FinitestatemachinescompositePackage#getState_Outgoing()
	 * @see finitestatemachinescomposite.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link finitestatemachinescomposite.Transition}.
	 * It is bidirectional and its opposite is '{@link finitestatemachinescomposite.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see finitestatemachinescomposite.FinitestatemachinescompositePackage#getState_Incoming()
	 * @see finitestatemachinescomposite.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' reference.
	 * @see #setStateMachine(StateMachine)
	 * @see finitestatemachinescomposite.FinitestatemachinescompositePackage#getState_StateMachine()
	 * @model
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link finitestatemachinescomposite.State#getStateMachine <em>State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' reference.
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
	 * @see finitestatemachinescomposite.FinitestatemachinescompositePackage#getState_InitialTime()
	 * @model
	 * @generated
	 */
	int getInitialTime();

	/**
	 * Sets the value of the '{@link finitestatemachinescomposite.State#getInitialTime <em>Initial Time</em>}' attribute.
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
	 * @see finitestatemachinescomposite.FinitestatemachinescompositePackage#getState_FinalTime()
	 * @model
	 * @generated
	 */
	int getFinalTime();

	/**
	 * Sets the value of the '{@link finitestatemachinescomposite.State#getFinalTime <em>Final Time</em>}' attribute.
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
	 * @see finitestatemachinescomposite.FinitestatemachinescompositePackage#getState_ParentState()
	 * @model
	 * @generated
	 */
	CompositeState getParentState();

	/**
	 * Sets the value of the '{@link finitestatemachinescomposite.State#getParentState <em>Parent State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent State</em>' reference.
	 * @see #getParentState()
	 * @generated
	 */
	void setParentState(CompositeState value);

} // State
