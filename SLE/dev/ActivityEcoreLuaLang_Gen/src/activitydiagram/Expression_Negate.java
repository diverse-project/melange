/**
 */
package activitydiagram;

import org.k3.lua.dynamic.environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Negate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Expression_Negate#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getExpression_Negate()
 * @model
 * @generated
 */
public interface Expression_Negate extends Expression {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(Expression)
	 * @see activitydiagram.ActivitydiagramPackage#getExpression_Negate_Exp()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExp();

	/**
	 * Sets the value of the '{@link activitydiagram.Expression_Negate#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.environment"
	 * @generated
	 */
	void execute(environment c);

} // Expression_Negate
