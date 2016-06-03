/**
 */
package fr.inria.diverse.melanger.melangedlangmt.minifsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Context#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage#getContext_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // Context
