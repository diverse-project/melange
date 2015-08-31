/**
 */
package org.xtext.lua.lua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Access Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.lua.lua.Expression_AccessArray#getArray <em>Array</em>}</li>
 *   <li>{@link org.xtext.lua.lua.Expression_AccessArray#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.lua.lua.LuaPackage#getExpression_AccessArray()
 * @model
 * @generated
 */
public interface Expression_AccessArray extends Expression
{
  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(Expression)
   * @see org.xtext.lua.lua.LuaPackage#getExpression_AccessArray_Array()
   * @model containment="true"
   * @generated
   */
  Expression getArray();

  /**
   * Sets the value of the '{@link org.xtext.lua.lua.Expression_AccessArray#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(Expression value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(Expression)
   * @see org.xtext.lua.lua.LuaPackage#getExpression_AccessArray_Index()
   * @model containment="true"
   * @generated
   */
  Expression getIndex();

  /**
   * Sets the value of the '{@link org.xtext.lua.lua.Expression_AccessArray#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(Expression value);

} // Expression_AccessArray
