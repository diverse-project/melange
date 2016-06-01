/**
 */
package fr.inria.diverse.melanger.minilangmt.minilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Str</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.minilangmt.minilang.PrintStr#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.minilangmt.minilang.MinilangPackage#getPrintStr()
 * @model
 * @generated
 */
public interface PrintStr extends Statement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.inria.diverse.melanger.minilangmt.minilang.MinilangPackage#getPrintStr_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.minilangmt.minilang.PrintStr#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // PrintStr
