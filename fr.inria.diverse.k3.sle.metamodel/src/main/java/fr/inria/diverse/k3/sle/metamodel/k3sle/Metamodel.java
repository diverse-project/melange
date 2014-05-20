/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getEcore <em>Ecore</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getAspects <em>Aspects</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getExactType <em>Exact Type</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getImplements <em>Implements</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getInheritanceRelation <em>Inheritance Relation</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getPkgs <em>Pkgs</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getExactTypeRef <em>Exact Type Ref</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getGenmodels <em>Genmodels</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getResourceUri <em>Resource Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends Element {
	/**
	 * Returns the value of the '<em><b>Ecore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore</em>' containment reference.
	 * @see #setEcore(EcoreImport)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_Ecore()
	 * @model containment="true"
	 * @generated
	 */
	EcoreImport getEcore();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getEcore <em>Ecore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore</em>' containment reference.
	 * @see #getEcore()
	 * @generated
	 */
	void setEcore(EcoreImport value);

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_Aspects()
	 * @model containment="true"
	 * @generated
	 */
	EList<AspectImport> getAspects();

	/**
	 * Returns the value of the '<em><b>Exact Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getExtracted <em>Extracted</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exact Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exact Type</em>' reference.
	 * @see #setExactType(ModelType)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_ExactType()
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getExtracted
	 * @model opposite="extracted" required="true"
	 * @generated
	 */
	ModelType getExactType();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getExactType <em>Exact Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exact Type</em>' reference.
	 * @see #getExactType()
	 * @generated
	 */
	void setExactType(ModelType value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_Implements()
	 * @model
	 * @generated
	 */
	EList<ModelType> getImplements();

	/**
	 * Returns the value of the '<em><b>Inheritance Relation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Inheritance#getSubMetamodel <em>Sub Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance Relation</em>' containment reference.
	 * @see #setInheritanceRelation(Inheritance)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_InheritanceRelation()
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Inheritance#getSubMetamodel
	 * @model opposite="subMetamodel" containment="true"
	 * @generated
	 */
	Inheritance getInheritanceRelation();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getInheritanceRelation <em>Inheritance Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance Relation</em>' containment reference.
	 * @see #getInheritanceRelation()
	 * @generated
	 */
	void setInheritanceRelation(Inheritance value);

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
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_Pkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EPackage> getPkgs();

	/**
	 * Returns the value of the '<em><b>Exact Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exact Type Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exact Type Ref</em>' attribute.
	 * @see #setExactTypeRef(String)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_ExactTypeRef()
	 * @model
	 * @generated
	 */
	String getExactTypeRef();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getExactTypeRef <em>Exact Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exact Type Ref</em>' attribute.
	 * @see #getExactTypeRef()
	 * @generated
	 */
	void setExactTypeRef(String value);

	/**
	 * Returns the value of the '<em><b>Genmodels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.codegen.ecore.genmodel.GenModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genmodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genmodels</em>' containment reference list.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_Genmodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenModel> getGenmodels();

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * The default value is <code>"K3"</code>.
	 * The literals are from the enumeration {@link fr.inria.diverse.k3.sle.metamodel.k3sle.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ResourceType
	 * @see #setResourceType(ResourceType)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_ResourceType()
	 * @model default="K3"
	 * @generated
	 */
	ResourceType getResourceType();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ResourceType
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Uri</em>' attribute.
	 * @see #setResourceUri(String)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_ResourceUri()
	 * @model
	 * @generated
	 */
	String getResourceUri();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getResourceUri <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Uri</em>' attribute.
	 * @see #getResourceUri()
	 * @generated
	 */
	void setResourceUri(String value);

} // Metamodel
