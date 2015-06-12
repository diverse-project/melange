/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.k3.lua.dynamic.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Table Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Expression_TableConstructor#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getExpression_TableConstructor()
 * @model
 * @generated
 */
public interface Expression_TableConstructor extends Expression {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getExpression_TableConstructor_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.Environment"
	 * @generated
	 */
	void execute(Environment c);

} // Expression_TableConstructor
