/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3sleFactory
 * @model kind="package"
 * @generated
 */
public interface K3slePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "k3sle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inria.fr/diverse/k3/sle";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "k3sle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	K3slePackage eINSTANCE = fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ModelTypingSpaceImpl <em>Model Typing Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ModelTypingSpaceImpl
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getModelTypingSpace()
	 * @generated
	 */
	int MODEL_TYPING_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPING_SPACE__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPING_SPACE__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPING_SPACE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Model Typing Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPING_SPACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Typing Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPING_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ElementImpl
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.MetamodelImpl
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ecore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__ECORE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__ASPECTS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exact Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__EXACT_TYPE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__IMPLEMENTS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inheritance Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__INHERITANCE_RELATION = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__PKGS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exact Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__EXACT_TYPE_REF = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Genmodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__GENMODELS = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__RESOURCE_TYPE = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__RESOURCE_URI = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ModelTypeImpl
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ecore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ECORE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtyping Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__SUBTYPING_RELATIONS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__PKGS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extracted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__EXTRACTED = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.TransformationImpl
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__MAIN = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__PARAMETERS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__BODY = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RETURN_TYPE_REF = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__INPUT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__OUTPUT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.EcoreImportImpl <em>Ecore Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.EcoreImportImpl
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getEcoreImport()
	 * @generated
	 */
	int ECORE_IMPORT = 5;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_IMPORT__URI = 0;

	/**
	 * The feature id for the '<em><b>Genmodel Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_IMPORT__GENMODEL_URIS = 1;

	/**
	 * The number of structural features of the '<em>Ecore Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_IMPORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ecore Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.AspectImportImpl <em>Aspect Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.AspectImportImpl
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getAspectImport()
	 * @generated
	 */
	int ASPECT_IMPORT = 6;

	/**
	 * The feature id for the '<em><b>Aspect Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_IMPORT__ASPECT_REF = 0;

	/**
	 * The feature id for the '<em><b>Aspected Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_IMPORT__ASPECTED_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Ecore Fragment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_IMPORT__ECORE_FRAGMENT = 2;

	/**
	 * The number of structural features of the '<em>Aspect Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_IMPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Aspect Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.InheritanceImpl
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 7;

	/**
	 * The feature id for the '<em><b>Sub Metamodel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__SUB_METAMODEL = 0;

	/**
	 * The feature id for the '<em><b>Super Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__SUPER_METAMODEL = 1;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.SubtypingImpl <em>Subtyping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.SubtypingImpl
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getSubtyping()
	 * @generated
	 */
	int SUBTYPING = 8;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPING__SUB_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPING__SUPER_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Subtyping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subtyping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPING_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ResourceType
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace <em>Model Typing Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Typing Space</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
	 * @generated
	 */
	EClass getModelTypingSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace#getElements()
	 * @see #getModelTypingSpace()
	 * @generated
	 */
	EReference getModelTypingSpace_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imports</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace#getImports()
	 * @see #getModelTypingSpace()
	 * @generated
	 */
	EReference getModelTypingSpace_Imports();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace#getName()
	 * @see #getModelTypingSpace()
	 * @generated
	 */
	EAttribute getModelTypingSpace_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getEcore <em>Ecore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ecore</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getEcore()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Ecore();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getAspects()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Aspects();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getExactType <em>Exact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exact Type</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getExactType()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_ExactType();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getImplements()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Implements();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getInheritanceRelation <em>Inheritance Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inheritance Relation</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getInheritanceRelation()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_InheritanceRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getPkgs <em>Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pkgs</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getPkgs()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Pkgs();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getExactTypeRef <em>Exact Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exact Type Ref</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getExactTypeRef()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_ExactTypeRef();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getGenmodels <em>Genmodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Genmodels</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getGenmodels()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Genmodels();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getResourceType()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_ResourceType();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getResourceUri <em>Resource Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Uri</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel#getResourceUri()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_ResourceUri();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getEcore <em>Ecore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ecore</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getEcore()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Ecore();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getSubtypingRelations <em>Subtyping Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtyping Relations</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getSubtypingRelations()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_SubtypingRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getPkgs <em>Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pkgs</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getPkgs()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Pkgs();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getExtracted <em>Extracted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extracted</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType#getExtracted()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Extracted();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#isMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#isMain()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Main();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getParameters()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getBody()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Body();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getReturnTypeRef <em>Return Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type Ref</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getReturnTypeRef()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_ReturnTypeRef();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getInput()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Input();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getOutput()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Output();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport <em>Ecore Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Import</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport
	 * @generated
	 */
	EClass getEcoreImport();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport#getUri()
	 * @see #getEcoreImport()
	 * @generated
	 */
	EAttribute getEcoreImport_Uri();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport#getGenmodelUris <em>Genmodel Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Genmodel Uris</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport#getGenmodelUris()
	 * @see #getEcoreImport()
	 * @generated
	 */
	EAttribute getEcoreImport_GenmodelUris();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport <em>Aspect Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect Import</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport
	 * @generated
	 */
	EClass getAspectImport();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport#getAspectRef <em>Aspect Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aspect Ref</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport#getAspectRef()
	 * @see #getAspectImport()
	 * @generated
	 */
	EReference getAspectImport_AspectRef();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport#getAspectedClass <em>Aspected Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aspected Class</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport#getAspectedClass()
	 * @see #getAspectImport()
	 * @generated
	 */
	EReference getAspectImport_AspectedClass();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport#getEcoreFragment <em>Ecore Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ecore Fragment</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport#getEcoreFragment()
	 * @see #getAspectImport()
	 * @generated
	 */
	EReference getAspectImport_EcoreFragment();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Inheritance#getSubMetamodel <em>Sub Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sub Metamodel</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Inheritance#getSubMetamodel()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_SubMetamodel();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Inheritance#getSuperMetamodel <em>Super Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Metamodel</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Inheritance#getSuperMetamodel()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_SuperMetamodel();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Subtyping <em>Subtyping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtyping</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Subtyping
	 * @generated
	 */
	EClass getSubtyping();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Subtyping#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sub Type</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Subtyping#getSubType()
	 * @see #getSubtyping()
	 * @generated
	 */
	EReference getSubtyping_SubType();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Subtyping#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.Subtyping#getSuperType()
	 * @see #getSubtyping()
	 * @generated
	 */
	EReference getSubtyping_SuperType();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	K3sleFactory getK3sleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ModelTypingSpaceImpl <em>Model Typing Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ModelTypingSpaceImpl
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getModelTypingSpace()
		 * @generated
		 */
		EClass MODEL_TYPING_SPACE = eINSTANCE.getModelTypingSpace();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPING_SPACE__ELEMENTS = eINSTANCE.getModelTypingSpace_Elements();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPING_SPACE__IMPORTS = eINSTANCE.getModelTypingSpace_Imports();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPING_SPACE__NAME = eINSTANCE.getModelTypingSpace_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ElementImpl
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.MetamodelImpl
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Ecore</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__ECORE = eINSTANCE.getMetamodel_Ecore();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__ASPECTS = eINSTANCE.getMetamodel_Aspects();

		/**
		 * The meta object literal for the '<em><b>Exact Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__EXACT_TYPE = eINSTANCE.getMetamodel_ExactType();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__IMPLEMENTS = eINSTANCE.getMetamodel_Implements();

		/**
		 * The meta object literal for the '<em><b>Inheritance Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__INHERITANCE_RELATION = eINSTANCE.getMetamodel_InheritanceRelation();

		/**
		 * The meta object literal for the '<em><b>Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__PKGS = eINSTANCE.getMetamodel_Pkgs();

		/**
		 * The meta object literal for the '<em><b>Exact Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__EXACT_TYPE_REF = eINSTANCE.getMetamodel_ExactTypeRef();

		/**
		 * The meta object literal for the '<em><b>Genmodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__GENMODELS = eINSTANCE.getMetamodel_Genmodels();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__RESOURCE_TYPE = eINSTANCE.getMetamodel_ResourceType();

		/**
		 * The meta object literal for the '<em><b>Resource Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__RESOURCE_URI = eINSTANCE.getMetamodel_ResourceUri();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ModelTypeImpl
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '<em><b>Ecore</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__ECORE = eINSTANCE.getModelType_Ecore();

		/**
		 * The meta object literal for the '<em><b>Subtyping Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__SUBTYPING_RELATIONS = eINSTANCE.getModelType_SubtypingRelations();

		/**
		 * The meta object literal for the '<em><b>Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__PKGS = eINSTANCE.getModelType_Pkgs();

		/**
		 * The meta object literal for the '<em><b>Extracted</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__EXTRACTED = eINSTANCE.getModelType_Extracted();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.TransformationImpl
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__MAIN = eINSTANCE.getTransformation_Main();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__PARAMETERS = eINSTANCE.getTransformation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__BODY = eINSTANCE.getTransformation_Body();

		/**
		 * The meta object literal for the '<em><b>Return Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__RETURN_TYPE_REF = eINSTANCE.getTransformation_ReturnTypeRef();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__INPUT = eINSTANCE.getTransformation_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__OUTPUT = eINSTANCE.getTransformation_Output();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.EcoreImportImpl <em>Ecore Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.EcoreImportImpl
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getEcoreImport()
		 * @generated
		 */
		EClass ECORE_IMPORT = eINSTANCE.getEcoreImport();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_IMPORT__URI = eINSTANCE.getEcoreImport_Uri();

		/**
		 * The meta object literal for the '<em><b>Genmodel Uris</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_IMPORT__GENMODEL_URIS = eINSTANCE.getEcoreImport_GenmodelUris();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.AspectImportImpl <em>Aspect Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.AspectImportImpl
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getAspectImport()
		 * @generated
		 */
		EClass ASPECT_IMPORT = eINSTANCE.getAspectImport();

		/**
		 * The meta object literal for the '<em><b>Aspect Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_IMPORT__ASPECT_REF = eINSTANCE.getAspectImport_AspectRef();

		/**
		 * The meta object literal for the '<em><b>Aspected Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_IMPORT__ASPECTED_CLASS = eINSTANCE.getAspectImport_AspectedClass();

		/**
		 * The meta object literal for the '<em><b>Ecore Fragment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_IMPORT__ECORE_FRAGMENT = eINSTANCE.getAspectImport_EcoreFragment();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.InheritanceImpl
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Sub Metamodel</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__SUB_METAMODEL = eINSTANCE.getInheritance_SubMetamodel();

		/**
		 * The meta object literal for the '<em><b>Super Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__SUPER_METAMODEL = eINSTANCE.getInheritance_SuperMetamodel();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.SubtypingImpl <em>Subtyping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.SubtypingImpl
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getSubtyping()
		 * @generated
		 */
		EClass SUBTYPING = eINSTANCE.getSubtyping();

		/**
		 * The meta object literal for the '<em><b>Sub Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTYPING__SUB_TYPE = eINSTANCE.getSubtyping_SubType();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTYPING__SUPER_TYPE = eINSTANCE.getSubtyping_SuperType();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.ResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.ResourceType
		 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3slePackageImpl#getResourceType()
		 * @generated
		 */
		EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

	}

} //K3slePackage
