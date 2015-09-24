/**
 */
package fr.inria.diverse.iot2.iot2.iot2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.Trace#getExecutedNodes <em>Executed Nodes</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Executed Nodes</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Nodes</em>' reference list.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getTrace_ExecutedNodes()
	 * @model
	 * @generated
	 */
	EList<ActivityNode> getExecutedNodes();

} // Trace
