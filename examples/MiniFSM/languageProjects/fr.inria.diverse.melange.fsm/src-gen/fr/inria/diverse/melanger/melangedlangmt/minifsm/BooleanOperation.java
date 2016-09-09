/**
 */
package fr.inria.diverse.melanger.melangedlangmt.minifsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage#getBooleanOperation()
 * @model
 * @generated
 */
public interface BooleanOperation extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(BooleanExpression)
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage#getBooleanOperation_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getLeft();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(BooleanExpression)
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage#getBooleanOperation_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getRight();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(BooleanExpression value);

} // BooleanOperation
