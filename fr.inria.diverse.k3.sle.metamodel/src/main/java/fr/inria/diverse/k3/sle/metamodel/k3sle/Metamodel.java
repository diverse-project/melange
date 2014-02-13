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
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getPkg <em>Pkg</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getGenmodel <em>Genmodel</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exact Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exact Type</em>' reference.
	 * @see #setExactType(ModelType)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_ExactType()
	 * @model
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
	 * Returns the value of the '<em><b>Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' containment reference.
	 * @see #setPkg(EPackage)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_Pkg()
	 * @model containment="true"
	 * @generated
	 */
	EPackage getPkg();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getPkg <em>Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' containment reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(EPackage value);

	/**
	 * Returns the value of the '<em><b>Genmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genmodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genmodel</em>' containment reference.
	 * @see #setGenmodel(GenModel)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMetamodel_Genmodel()
	 * @model containment="true"
	 * @generated
	 */
	GenModel getGenmodel();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getGenmodel <em>Genmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genmodel</em>' containment reference.
	 * @see #getGenmodel()
	 * @generated
	 */
	void setGenmodel(GenModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void footprint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void merge();

} // Metamodel
