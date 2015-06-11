/**
 */
package activitydiagram;

import org.eclipse.emf.ecore.EObject;

import org.k3.lua.dynamic.environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagram.ActivitydiagramPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.environment"
	 * @generated
	 */
	void execute(environment c);

} // Statement
