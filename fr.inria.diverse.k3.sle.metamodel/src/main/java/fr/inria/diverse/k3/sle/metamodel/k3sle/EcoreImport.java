/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecore Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport#getUri <em>Uri</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport#getGenmodelUri <em>Genmodel Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getEcoreImport()
 * @model
 * @generated
 */
public interface EcoreImport extends EObject {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getEcoreImport_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Genmodel Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genmodel Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genmodel Uri</em>' attribute.
	 * @see #setGenmodelUri(String)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getEcoreImport_GenmodelUri()
	 * @model
	 * @generated
	 */
	String getGenmodelUri();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport#getGenmodelUri <em>Genmodel Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genmodel Uri</em>' attribute.
	 * @see #getGenmodelUri()
	 * @generated
	 */
	void setGenmodelUri(String value);

} // EcoreImport
