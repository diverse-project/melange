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
 * A representation of the model object '<em><b>Operation Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.OperationDef#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.OperationDef#isIsOneway <em>Is Oneway</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.OperationDef#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.OperationDef#getCanRaise <em>Can Raise</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getOperationDef()
 * @model
 * @generated
 */
public interface OperationDef extends Contained, Typed {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.idl.idlmm.ParameterDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.csu.idl.idlmm.IdlmmPackage#getOperationDef_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDef> getParameters();

	/**
	 * Returns the value of the '<em><b>Is Oneway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Oneway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Oneway</em>' attribute.
	 * @see #setIsOneway(boolean)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getOperationDef_IsOneway()
	 * @model
	 * @generated
	 */
	boolean isIsOneway();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.OperationDef#isIsOneway <em>Is Oneway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Oneway</em>' attribute.
	 * @see #isIsOneway()
	 * @generated
	 */
	void setIsOneway(boolean value);

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' attribute list.
	 * @see org.csu.idl.idlmm.IdlmmPackage#getOperationDef_Contexts()
	 * @model
	 * @generated
	 */
	EList<String> getContexts();

	/**
	 * Returns the value of the '<em><b>Can Raise</b></em>' reference list.
	 * The list contents are of type {@link org.csu.idl.idlmm.ExceptionDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Raise</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Raise</em>' reference list.
	 * @see org.csu.idl.idlmm.IdlmmPackage#getOperationDef_CanRaise()
	 * @model
	 * @generated
	 */
	EList<ExceptionDef> getCanRaise();

} // OperationDef
