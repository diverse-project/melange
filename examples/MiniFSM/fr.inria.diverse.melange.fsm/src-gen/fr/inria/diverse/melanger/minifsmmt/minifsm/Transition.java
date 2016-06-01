/**
 */
package fr.inria.diverse.melanger.minifsmmt.minifsm;

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
 *   <li>{@link fr.inria.diverse.melanger.minifsmmt.minifsm.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.minifsmmt.minifsm.Transition#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.minifsmmt.minifsm.Transition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(State)
	 * @see fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage#getTransition_Input()
	 * @model required="true"
	 * @generated
	 */
	State getInput();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.minifsmmt.minifsm.Transition#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(State value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(State)
	 * @see fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage#getTransition_Output()
	 * @model required="true"
	 * @generated
	 */
	State getOutput();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.minifsmmt.minifsm.Transition#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(State value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage#getTransition_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.minifsmmt.minifsm.Transition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // Transition
