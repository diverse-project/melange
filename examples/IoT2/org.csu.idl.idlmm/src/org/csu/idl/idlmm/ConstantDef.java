/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.ConstantDef#getConstValue <em>Const Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getConstantDef()
 * @model
 * @generated
 */
public interface ConstantDef extends Contained, Typed, Constant {
	/**
	 * Returns the value of the '<em><b>Const Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Const Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const Value</em>' containment reference.
	 * @see #setConstValue(Expression)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getConstantDef_ConstValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getConstValue();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.ConstantDef#getConstValue <em>Const Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const Value</em>' containment reference.
	 * @see #getConstValue()
	 * @generated
	 */
	void setConstValue(Expression value);

} // ConstantDef
