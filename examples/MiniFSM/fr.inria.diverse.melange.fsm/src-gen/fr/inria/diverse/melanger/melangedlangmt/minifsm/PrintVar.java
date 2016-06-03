/**
 */
package fr.inria.diverse.melanger.melangedlangmt.minifsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintVar#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage#getPrintVar()
 * @model
 * @generated
 */
public interface PrintVar extends Statement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(VariableRef)
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage#getPrintVar_Value()
	 * @model containment="true"
	 * @generated
	 */
	VariableRef getValue();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintVar#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(VariableRef value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute(Context ctx);

} // PrintVar
