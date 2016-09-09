/**
 */
package fr.inria.diverse.melanger.miniactionlangmt.minilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage#getInteger()
 * @model
 * @generated
 */
public interface Integer extends IntExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage#getInteger_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int eval(Context ctx);

} // Integer
