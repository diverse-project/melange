/**
 */
package activitydiagram;

import org.k3.lua.dynamic.environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Expression#getLua <em>Lua</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends Statement_FunctioncallOrAssignment {
	/**
	 * Returns the value of the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lua</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lua</em>' reference.
	 * @see #setLua(Block)
	 * @see activitydiagram.ActivitydiagramPackage#getExpression_Lua()
	 * @model
	 * @generated
	 */
	Block getLua();

	/**
	 * Sets the value of the '{@link activitydiagram.Expression#getLua <em>Lua</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lua</em>' reference.
	 * @see #getLua()
	 * @generated
	 */
	void setLua(Block value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.environment"
	 * @generated
	 */
	void execute(environment c);

} // Expression
