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
 * A representation of the model object '<em><b>Contained</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.Contained#getRepositoryId <em>Repository Id</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.Contained#getVersion <em>Version</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.Contained#getAbsoluteName <em>Absolute Name</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.Contained#getDefinedIn <em>Defined In</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getContained()
 * @model abstract="true"
 * @generated
 */
public interface Contained extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Id</em>' attribute.
	 * @see #setRepositoryId(String)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getContained_RepositoryId()
	 * @model
	 * @generated
	 */
	String getRepositoryId();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.Contained#getRepositoryId <em>Repository Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Id</em>' attribute.
	 * @see #getRepositoryId()
	 * @generated
	 */
	void setRepositoryId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getContained_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.Contained#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Name</em>' attribute.
	 * @see #setAbsoluteName(String)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getContained_AbsoluteName()
	 * @model
	 * @generated
	 */
	String getAbsoluteName();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.Contained#getAbsoluteName <em>Absolute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Name</em>' attribute.
	 * @see #getAbsoluteName()
	 * @generated
	 */
	void setAbsoluteName(String value);

	/**
	 * Returns the value of the '<em><b>Defined In</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.idl.idlmm.Container#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined In</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined In</em>' container reference.
	 * @see #setDefinedIn(Container)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getContained_DefinedIn()
	 * @see org.csu.idl.idlmm.Container#getContains
	 * @model opposite="contains" transient="false"
	 * @generated
	 */
	Container getDefinedIn();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.Contained#getDefinedIn <em>Defined In</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined In</em>' container reference.
	 * @see #getDefinedIn()
	 * @generated
	 */
	void setDefinedIn(Container value);

} // Contained
