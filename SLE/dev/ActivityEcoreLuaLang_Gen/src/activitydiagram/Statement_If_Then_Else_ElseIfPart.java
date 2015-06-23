/**
 */
package activitydiagram;

import org.eclipse.emf.ecore.EObject;

import org.k3.lua.dynamic.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement If Then Else Else If Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Statement_If_Then_Else_ElseIfPart#getElseifExpression <em>Elseif Expression</em>}</li>
 *   <li>{@link activitydiagram.Statement_If_Then_Else_ElseIfPart#getElseifBlock <em>Elseif Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getStatement_If_Then_Else_ElseIfPart()
 * @model
 * @generated
 */
public interface Statement_If_Then_Else_ElseIfPart extends EObject {
	/**
	 * Returns the value of the '<em><b>Elseif Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elseif Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseif Expression</em>' containment reference.
	 * @see #setElseifExpression(Expression)
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_If_Then_Else_ElseIfPart_ElseifExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getElseifExpression();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_If_Then_Else_ElseIfPart#getElseifExpression <em>Elseif Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elseif Expression</em>' containment reference.
	 * @see #getElseifExpression()
	 * @generated
	 */
	void setElseifExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Elseif Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elseif Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseif Block</em>' containment reference.
	 * @see #setElseifBlock(Block)
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_If_Then_Else_ElseIfPart_ElseifBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getElseifBlock();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_If_Then_Else_ElseIfPart#getElseifBlock <em>Elseif Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elseif Block</em>' containment reference.
	 * @see #getElseifBlock()
	 * @generated
	 */
	void setElseifBlock(Block value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.Environment"
	 * @generated
	 */
	void execute(Environment c);

} // Statement_If_Then_Else_ElseIfPart
