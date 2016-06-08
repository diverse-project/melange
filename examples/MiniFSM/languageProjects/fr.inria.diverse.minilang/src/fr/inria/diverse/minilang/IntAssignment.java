/**
 */
package fr.inria.diverse.minilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.minilang.IntAssignment#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.IntAssignment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.minilang.MinilangPackage#getIntAssignment()
 * @model
 * @generated
 */
public interface IntAssignment extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(IntVariableRef)
	 * @see fr.inria.diverse.minilang.MinilangPackage#getIntAssignment_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntVariableRef getVariable();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.IntAssignment#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(IntVariableRef value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(IntExpression)
	 * @see fr.inria.diverse.minilang.MinilangPackage#getIntAssignment_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntExpression getValue();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.IntAssignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(IntExpression value);

} // IntAssignment
