/**
 */
package compositestates;

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
 *   <li>{@link compositestates.Vertex#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link compositestates.Vertex#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link compositestates.Vertex#getOwnerState <em>Owner State</em>}</li>
 * </ul>
 * </p>
 *
 * @see compositestates.CompositestatesPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link compositestates.Transition}.
	 * It is bidirectional and its opposite is '{@link compositestates.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see compositestates.CompositestatesPackage#getVertex_Incoming()
	 * @see compositestates.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link compositestates.Transition}.
	 * It is bidirectional and its opposite is '{@link compositestates.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see compositestates.CompositestatesPackage#getVertex_Outgoing()
	 * @see compositestates.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Owner State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compositestates.CompositeState#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner State</em>' container reference.
	 * @see #setOwnerState(CompositeState)
	 * @see compositestates.CompositestatesPackage#getVertex_OwnerState()
	 * @see compositestates.CompositeState#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	CompositeState getOwnerState();

	/**
	 * Sets the value of the '{@link compositestates.Vertex#getOwnerState <em>Owner State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner State</em>' container reference.
	 * @see #getOwnerState()
	 * @generated
	 */
	void setOwnerState(CompositeState value);

} // Vertex
