/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.AttributeDef#getGetRaises <em>Get Raises</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.AttributeDef#getSetRaises <em>Set Raises</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.AttributeDef#isIsReadonly <em>Is Readonly</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getAttributeDef()
 * @model
 * @generated
 */
public interface AttributeDef extends Contained, Typed {
	/**
	 * Returns the value of the '<em><b>Get Raises</b></em>' reference list.
	 * The list contents are of type {@link org.csu.idl.idlmm.ExceptionDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Raises</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Raises</em>' reference list.
	 * @see org.csu.idl.idlmm.IdlmmPackage#getAttributeDef_GetRaises()
	 * @model
	 * @generated
	 */
	EList<ExceptionDef> getGetRaises();

	/**
	 * Returns the value of the '<em><b>Set Raises</b></em>' reference list.
	 * The list contents are of type {@link org.csu.idl.idlmm.ExceptionDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Raises</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Raises</em>' reference list.
	 * @see org.csu.idl.idlmm.IdlmmPackage#getAttributeDef_SetRaises()
	 * @model
	 * @generated
	 */
	EList<ExceptionDef> getSetRaises();

	/**
	 * Returns the value of the '<em><b>Is Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Readonly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Readonly</em>' attribute.
	 * @see #setIsReadonly(boolean)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getAttributeDef_IsReadonly()
	 * @model
	 * @generated
	 */
	boolean isIsReadonly();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.AttributeDef#isIsReadonly <em>Is Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Readonly</em>' attribute.
	 * @see #isIsReadonly()
	 * @generated
	 */
	void setIsReadonly(boolean value);

} // AttributeDef
