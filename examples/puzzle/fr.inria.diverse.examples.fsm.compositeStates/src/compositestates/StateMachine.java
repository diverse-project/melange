/**
 */
package compositestates;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see compositestates.CompositestatesPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false" eventsMany="false"
	 * @generated
	 */
	EList<?> getActiveTransitions(Vertex vertex, EList<?> events);
} // StateMachine
