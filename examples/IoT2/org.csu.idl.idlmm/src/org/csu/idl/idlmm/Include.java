/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.Include#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.Include#getTranslationUnit <em>Translation Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends EObject {
	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getInclude_ImportURI()
	 * @model
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.Include#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

	/**
	 * Returns the value of the '<em><b>Translation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation Unit</em>' reference.
	 * @see #setTranslationUnit(TranslationUnit)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getInclude_TranslationUnit()
	 * @model
	 * @generated
	 */
	TranslationUnit getTranslationUnit();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.Include#getTranslationUnit <em>Translation Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation Unit</em>' reference.
	 * @see #getTranslationUnit()
	 * @generated
	 */
	void setTranslationUnit(TranslationUnit value);

} // Include
