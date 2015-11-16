/**
 */
package simplefsm.timedfsmmt.timedfsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplefsm.timedfsmmt.timedfsm.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link simplefsm.timedfsmmt.timedfsm.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link simplefsm.timedfsmmt.timedfsm.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link simplefsm.timedfsmmt.timedfsm.Transition#getOutput <em>Output</em>}</li>
 *   <li>{@link simplefsm.timedfsmmt.timedfsm.Transition#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see simplefsm.timedfsmmt.timedfsm.TimedfsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplefsm.timedfsmmt.timedfsm.State#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(State)
	 * @see simplefsm.timedfsmmt.timedfsm.TimedfsmPackage#getTransition_Source()
	 * @see simplefsm.timedfsmmt.timedfsm.State#getOutgoingTransition
	 * @model opposite="outgoingTransition" required="true" transient="false"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link simplefsm.timedfsmmt.timedfsm.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplefsm.timedfsmmt.timedfsm.State#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see simplefsm.timedfsmmt.timedfsm.TimedfsmPackage#getTransition_Target()
	 * @see simplefsm.timedfsmmt.timedfsm.State#getIncomingTransition
	 * @model opposite="incomingTransition" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link simplefsm.timedfsmmt.timedfsm.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see simplefsm.timedfsmmt.timedfsm.TimedfsmPackage#getTransition_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link simplefsm.timedfsmmt.timedfsm.Transition#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see simplefsm.timedfsmmt.timedfsm.TimedfsmPackage#getTransition_Output()
	 * @model
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link simplefsm.timedfsmmt.timedfsm.Transition#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see simplefsm.timedfsmmt.timedfsm.TimedfsmPackage#getTransition_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link simplefsm.timedfsmmt.timedfsm.Transition#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

} // Transition
