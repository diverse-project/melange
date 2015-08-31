/**
 */
package activitydiagram;

import org.eclipse.emf.ecore.EObject;

import org.k3.lua.dynamic.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagram.ActivitydiagramPackage#getChunk()
 * @model
 * @generated
 */
public interface Chunk extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.Environment"
	 * @generated
	 */
	void execute(Environment c);

} // Chunk
