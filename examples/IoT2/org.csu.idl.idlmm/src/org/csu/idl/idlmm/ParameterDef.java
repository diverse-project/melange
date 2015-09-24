/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.ParameterDef#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.ParameterDef#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getParameterDef()
 * @model
 * @generated
 */
public interface ParameterDef extends Typed {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getParameterDef_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.ParameterDef#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.idl.idlmm.ParameterMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.csu.idl.idlmm.ParameterMode
	 * @see #setDirection(ParameterMode)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getParameterDef_Direction()
	 * @model
	 * @generated
	 */
	ParameterMode getDirection();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.ParameterDef#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.csu.idl.idlmm.ParameterMode
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterMode value);

} // ParameterDef
