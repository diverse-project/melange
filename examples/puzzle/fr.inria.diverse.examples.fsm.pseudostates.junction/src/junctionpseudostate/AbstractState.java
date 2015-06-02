/**
 */
package junctionpseudostate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link junctionpseudostate.AbstractState#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link junctionpseudostate.AbstractState#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see junctionpseudostate.JunctionpseudostatePackage#getAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface AbstractState extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link junctionpseudostate.Transition}.
	 * It is bidirectional and its opposite is '{@link junctionpseudostate.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see junctionpseudostate.JunctionpseudostatePackage#getAbstractState_Outgoing()
	 * @see junctionpseudostate.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link junctionpseudostate.Transition}.
	 * It is bidirectional and its opposite is '{@link junctionpseudostate.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see junctionpseudostate.JunctionpseudostatePackage#getAbstractState_Incoming()
	 * @see junctionpseudostate.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

} // AbstractState
