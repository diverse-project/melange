/**
 */
package org.xtext.lua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.lua.Expression_Function#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.lua.LuaPackage#getExpression_Function()
 * @model
 * @generated
 */
public interface Expression_Function extends Expression
{
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
   * @see org.xtext.lua.LuaPackage#getExpression_Function_Function()
   * @model containment="true"
   * @generated
   */
  Function getFunction();

  /**
   * Sets the value of the '{@link org.xtext.lua.Expression_Function#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(Function value);

} // Expression_Function
