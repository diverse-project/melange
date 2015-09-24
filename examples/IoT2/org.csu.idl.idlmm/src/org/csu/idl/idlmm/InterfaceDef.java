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
 * A representation of the model object '<em><b>Interface Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.InterfaceDef#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.InterfaceDef#isIsCustom <em>Is Custom</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.InterfaceDef#isIsTruncatable <em>Is Truncatable</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.InterfaceDef#getDerivesFrom <em>Derives From</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.InterfaceDef#getForward <em>Forward</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getInterfaceDef()
 * @model
 * @generated
 */
public interface InterfaceDef extends Container, TypedefDef {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getInterfaceDef_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.InterfaceDef#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Custom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Custom</em>' attribute.
	 * @see #setIsCustom(boolean)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getInterfaceDef_IsCustom()
	 * @model
	 * @generated
	 */
	boolean isIsCustom();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.InterfaceDef#isIsCustom <em>Is Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Custom</em>' attribute.
	 * @see #isIsCustom()
	 * @generated
	 */
	void setIsCustom(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Truncatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Truncatable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Truncatable</em>' attribute.
	 * @see #setIsTruncatable(boolean)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getInterfaceDef_IsTruncatable()
	 * @model
	 * @generated
	 */
	boolean isIsTruncatable();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.InterfaceDef#isIsTruncatable <em>Is Truncatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Truncatable</em>' attribute.
	 * @see #isIsTruncatable()
	 * @generated
	 */
	void setIsTruncatable(boolean value);

	/**
	 * Returns the value of the '<em><b>Derives From</b></em>' reference list.
	 * The list contents are of type {@link org.csu.idl.idlmm.InterfaceDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derives From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derives From</em>' reference list.
	 * @see org.csu.idl.idlmm.IdlmmPackage#getInterfaceDef_DerivesFrom()
	 * @model
	 * @generated
	 */
	EList<InterfaceDef> getDerivesFrom();

	/**
	 * Returns the value of the '<em><b>Forward</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward</em>' reference.
	 * @see #setForward(ForwardDef)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getInterfaceDef_Forward()
	 * @model
	 * @generated
	 */
	ForwardDef getForward();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.InterfaceDef#getForward <em>Forward</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward</em>' reference.
	 * @see #getForward()
	 * @generated
	 */
	void setForward(ForwardDef value);

} // InterfaceDef
