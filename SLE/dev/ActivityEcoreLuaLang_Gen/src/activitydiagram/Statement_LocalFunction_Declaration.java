/**
 */
package activitydiagram;

import org.k3.lua.dynamic.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Local Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Statement_LocalFunction_Declaration#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link activitydiagram.Statement_LocalFunction_Declaration#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getStatement_LocalFunction_Declaration()
 * @model
 * @generated
 */
public interface Statement_LocalFunction_Declaration extends Statement {
	/**
	 * Returns the value of the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Name</em>' attribute.
	 * @see #setFunctionName(String)
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_LocalFunction_Declaration_FunctionName()
	 * @model dataType="activitydiagram.EString"
	 * @generated
	 */
	String getFunctionName();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_LocalFunction_Declaration#getFunctionName <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name</em>' attribute.
	 * @see #getFunctionName()
	 * @generated
	 */
	void setFunctionName(String value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Function)
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_LocalFunction_Declaration_Function()
	 * @model containment="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_LocalFunction_Declaration#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.Environment"
	 * @generated
	 */
	void execute(Environment c);

} // Statement_LocalFunction_Declaration
