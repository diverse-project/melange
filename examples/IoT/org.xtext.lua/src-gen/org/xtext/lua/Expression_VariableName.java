/**
 */
package org.xtext.lua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Variable Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.lua.Expression_VariableName#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.lua.LuaPackage#getExpression_VariableName()
 * @model
 * @generated
 */
public interface Expression_VariableName extends Expression
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see org.xtext.lua.LuaPackage#getExpression_VariableName_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link org.xtext.lua.Expression_VariableName#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

} // Expression_VariableName
