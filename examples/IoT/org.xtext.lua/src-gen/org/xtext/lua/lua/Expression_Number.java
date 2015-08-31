/**
 */
package org.xtext.lua.lua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.lua.lua.Expression_Number#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.lua.lua.LuaPackage#getExpression_Number()
 * @model
 * @generated
 */
public interface Expression_Number extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(double)
   * @see org.xtext.lua.lua.LuaPackage#getExpression_Number_Value()
   * @model
   * @generated
   */
  double getValue();

  /**
   * Sets the value of the '{@link org.xtext.lua.lua.Expression_Number#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(double value);

} // Expression_Number
