/**
 */
package conditionalpseudostate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link conditionalpseudostate.Vertex#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link conditionalpseudostate.Vertex#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see conditionalpseudostate.ConditionalpseudostatePackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link conditionalpseudostate.Transition}.
	 * It is bidirectional and its opposite is '{@link conditionalpseudostate.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see conditionalpseudostate.ConditionalpseudostatePackage#getVertex_Outgoing()
	 * @see conditionalpseudostate.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link conditionalpseudostate.Transition}.
	 * It is bidirectional and its opposite is '{@link conditionalpseudostate.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see conditionalpseudostate.ConditionalpseudostatePackage#getVertex_Incoming()
	 * @see conditionalpseudostate.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

} // Vertex
