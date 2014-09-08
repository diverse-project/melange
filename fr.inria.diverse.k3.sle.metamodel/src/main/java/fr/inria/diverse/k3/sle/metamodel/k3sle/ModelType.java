/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getSubtypingRelations <em>Subtyping Relations</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getPkgs <em>Pkgs</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getExtracted <em>Extracted</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getEcoreUri <em>Ecore Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getModelType()
 * @model
 * @generated
 */
public interface ModelType extends Element {
	/**
	 * Returns the value of the '<em><b>Subtyping Relations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.k3.sle.metamodel.k3sle.Subtyping}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Subtyping#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtyping Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtyping Relations</em>' containment reference list.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getModelType_SubtypingRelations()
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Subtyping#getSubType
	 * @model opposite="subType" containment="true"
	 * @generated
	 */
	EList<Subtyping> getSubtypingRelations();

	/**
	 * Returns the value of the '<em><b>Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkgs</em>' containment reference list.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getModelType_Pkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EPackage> getPkgs();

	/**
	 * Returns the value of the '<em><b>Extracted</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getExactType <em>Exact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extracted</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extracted</em>' reference.
	 * @see #setExtracted(Metamodel)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getModelType_Extracted()
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getExactType
	 * @model opposite="exactType"
	 * @generated
	 */
	Metamodel getExtracted();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getExtracted <em>Extracted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extracted</em>' reference.
	 * @see #getExtracted()
	 * @generated
	 */
	void setExtracted(Metamodel value);

	/**
	 * Returns the value of the '<em><b>Ecore Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Uri</em>' attribute.
	 * @see #setEcoreUri(String)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getModelType_EcoreUri()
	 * @model
	 * @generated
	 */
	String getEcoreUri();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getEcoreUri <em>Ecore Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Uri</em>' attribute.
	 * @see #getEcoreUri()
	 * @generated
	 */
	void setEcoreUri(String value);

} // ModelType
