/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.ForwardDef#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getForwardDef()
 * @model
 * @generated
 */
public interface ForwardDef extends Contained {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(InterfaceDef)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getForwardDef_Definition()
	 * @model
	 * @generated
	 */
	InterfaceDef getDefinition();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.ForwardDef#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(InterfaceDef value);

} // ForwardDef
