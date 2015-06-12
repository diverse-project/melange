/**
 */
package activitydiagram;

import org.k3.lua.dynamic.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement For Numeric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Statement_For_Numeric#getIteratorName <em>Iterator Name</em>}</li>
 *   <li>{@link activitydiagram.Statement_For_Numeric#getStartExpr <em>Start Expr</em>}</li>
 *   <li>{@link activitydiagram.Statement_For_Numeric#getUntilExpr <em>Until Expr</em>}</li>
 *   <li>{@link activitydiagram.Statement_For_Numeric#getStepExpr <em>Step Expr</em>}</li>
 *   <li>{@link activitydiagram.Statement_For_Numeric#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getStatement_For_Numeric()
 * @model
 * @generated
 */
public interface Statement_For_Numeric extends Statement {
	/**
	 * Returns the value of the '<em><b>Iterator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator Name</em>' attribute.
	 * @see #setIteratorName(String)
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_For_Numeric_IteratorName()
	 * @model dataType="activitydiagram.EString"
	 * @generated
	 */
	String getIteratorName();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_For_Numeric#getIteratorName <em>Iterator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator Name</em>' attribute.
	 * @see #getIteratorName()
	 * @generated
	 */
	void setIteratorName(String value);

	/**
	 * Returns the value of the '<em><b>Start Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Expr</em>' containment reference.
	 * @see #setStartExpr(Expression)
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_For_Numeric_StartExpr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getStartExpr();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_For_Numeric#getStartExpr <em>Start Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Expr</em>' containment reference.
	 * @see #getStartExpr()
	 * @generated
	 */
	void setStartExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Until Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Expr</em>' containment reference.
	 * @see #setUntilExpr(Expression)
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_For_Numeric_UntilExpr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getUntilExpr();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_For_Numeric#getUntilExpr <em>Until Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Expr</em>' containment reference.
	 * @see #getUntilExpr()
	 * @generated
	 */
	void setUntilExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Step Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Expr</em>' containment reference.
	 * @see #setStepExpr(Expression)
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_For_Numeric_StepExpr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getStepExpr();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_For_Numeric#getStepExpr <em>Step Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Expr</em>' containment reference.
	 * @see #getStepExpr()
	 * @generated
	 */
	void setStepExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_For_Numeric_Block()
	 * @model containment="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_For_Numeric#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.Environment"
	 * @generated
	 */
	void execute(Environment c);

} // Statement_For_Numeric
