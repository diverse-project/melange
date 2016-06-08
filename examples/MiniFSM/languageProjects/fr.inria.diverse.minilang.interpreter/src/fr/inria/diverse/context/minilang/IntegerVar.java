/**
 */
package fr.inria.diverse.context.minilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.context.minilang.IntegerVar#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.context.minilang.MinilangPackage#getIntegerVar()
 * @model
 * @generated
 */
public interface IntegerVar extends Variable {
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
	 * @see fr.inria.diverse.context.minilang.MinilangPackage#getIntegerVar_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.context.minilang.IntegerVar#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerVar
