/**
 */
package fr.inria.diverse.context.minilang;

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
 *   <li>{@link fr.inria.diverse.context.minilang.Context#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.context.minilang.MinilangPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.context.minilang.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see fr.inria.diverse.context.minilang.MinilangPackage#getContext_Variables()
	 * @model
	 * @generated
	 */
	EList<Variable> getVariables();

} // Context
