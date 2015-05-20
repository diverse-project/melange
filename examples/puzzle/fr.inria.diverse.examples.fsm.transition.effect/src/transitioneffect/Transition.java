/**
 */
package transitioneffect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link transitioneffect.Transition#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see transitioneffect.TransitioneffectPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference list.
	 * The list contents are of type {@link transitioneffect.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference list.
	 * @see transitioneffect.TransitioneffectPackage#getTransition_Effect()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getEffect();

} // Transition
