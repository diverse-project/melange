/**
 */
package activitydiagram;

import org.eclipse.emf.ecore.EObject;

import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagram.ActivitydiagramPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.Context"
	 * @generated
	 */
	void execute(Context c);

} // Expression
