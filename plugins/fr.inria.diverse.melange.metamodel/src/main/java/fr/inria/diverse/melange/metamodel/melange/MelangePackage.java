/**
 */
package fr.inria.diverse.melange.metamodel.melange;

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
 * @see fr.inria.diverse.melange.metamodel.melange.MelangeFactory
 * @model kind="package"
 * @generated
 */
public interface MelangePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "melange";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inria.fr/diverse/melange";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "melange";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MelangePackage eINSTANCE = fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelTypingSpaceImpl <em>Model Typing Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ModelTypingSpaceImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getModelTypingSpace()
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
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ElementImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getElement()
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
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelingElementImpl <em>Modeling Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ModelingElementImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getModelingElement()
	 * @generated
	 */
	int MODELING_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ecore Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_ELEMENT__ECORE_URI = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modeling Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Modeling Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getMetamodel()
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
	int METAMODEL__NAME = MODELING_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ecore Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__ECORE_URI = MODELING_ELEMENT__ECORE_URI;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__ASPECTS = MODELING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exact Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__EXACT_TYPE = MODELING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__IMPLEMENTS = MODELING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__REQUIRES = MODELING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inheritance Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__INHERITANCE_RELATION = MODELING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exact Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__EXACT_TYPE_NAME = MODELING_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exact Type Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__EXACT_TYPE_URI = MODELING_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__RESOURCE_TYPE = MODELING_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__RESOURCE_URI = MODELING_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Xtext Setup Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__XTEXT_SETUP_REF = MODELING_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Genmodel Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__GENMODEL_URIS = MODELING_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__MAPPINGS = MODELING_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__UNITS = MODELING_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = MODELING_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_OPERATION_COUNT = MODELING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ModelTypeImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getModelType()
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
	int MODEL_TYPE__NAME = MODELING_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ecore Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ECORE_URI = MODELING_ELEMENT__ECORE_URI;

	/**
	 * The feature id for the '<em><b>Subtyping Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__SUBTYPING_RELATIONS = MODELING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extracted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__EXTRACTED = MODELING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mt Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__MT_URI = MODELING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = MODELING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_OPERATION_COUNT = MODELING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.TransformationImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getTransformation()
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
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageUnitImpl <em>Language Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.LanguageUnitImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getLanguageUnit()
	 * @generated
	 */
	int LANGUAGE_UNIT = 13;

	/**
	 * The number of structural features of the '<em>Language Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Language Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.AspectImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 5;

	/**
	 * The feature id for the '<em><b>Aspect Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ASPECT_TYPE_REF = LANGUAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aspected Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ASPECTED_CLASS = LANGUAGE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ecore Fragment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ECORE_FRAGMENT = LANGUAGE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = LANGUAGE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_OPERATION_COUNT = LANGUAGE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.InheritanceImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 6;

	/**
	 * The feature id for the '<em><b>Sub Metamodel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__SUB_METAMODEL = LANGUAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__SUPER_METAMODEL = LANGUAGE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = LANGUAGE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = LANGUAGE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.SubtypingImpl <em>Subtyping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.SubtypingImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getSubtyping()
	 * @generated
	 */
	int SUBTYPING = 7;

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
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.XbaseTransformationImpl <em>Xbase Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.XbaseTransformationImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getXbaseTransformation()
	 * @generated
	 */
	int XBASE_TRANSFORMATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION__NAME = TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION__BODY = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION__MAIN = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION__PARAMETERS = TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION__RETURN_TYPE_REF = TRANSFORMATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xbase Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Xbase Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_TRANSFORMATION_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MappingImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__RULES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__FROM = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TO = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ClassBindingImpl <em>Class Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.ClassBindingImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getClassBinding()
	 * @generated
	 */
	int CLASS_BINDING = 11;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING__TO = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Class Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Class Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.PropertyBindingImpl <em>Property Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.PropertyBindingImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getPropertyBinding()
	 * @generated
	 */
	int PROPERTY_BINDING = 12;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__TO = 1;

	/**
	 * The number of structural features of the '<em>Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.EcoreImpl <em>Ecore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.EcoreImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getEcore()
	 * @generated
	 */
	int ECORE = 14;

	/**
	 * The feature id for the '<em><b>Ecore Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE__ECORE_URI = LANGUAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Genmodel Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE__GENMODEL_URIS = LANGUAGE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ecore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_FEATURE_COUNT = LANGUAGE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ecore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OPERATION_COUNT = LANGUAGE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.MergeImpl <em>Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MergeImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getMerge()
	 * @generated
	 */
	int MERGE = 15;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__LANGUAGE = LANGUAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_FEATURE_COUNT = LANGUAGE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_OPERATION_COUNT = LANGUAGE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl <em>Slice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getSlice()
	 * @generated
	 */
	int SLICE = 16;

	/**
	 * The number of structural features of the '<em>Slice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_FEATURE_COUNT = LANGUAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Slice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_OPERATION_COUNT = LANGUAGE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melange.metamodel.melange.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melange.metamodel.melange.ResourceType
	 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace <em>Model Typing Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Typing Space</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
	 * @generated
	 */
	EClass getModelTypingSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace#getElements()
	 * @see #getModelTypingSpace()
	 * @generated
	 */
	EReference getModelTypingSpace_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imports</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace#getImports()
	 * @see #getModelTypingSpace()
	 * @generated
	 */
	EReference getModelTypingSpace_Imports();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace#getName()
	 * @see #getModelTypingSpace()
	 * @generated
	 */
	EAttribute getModelTypingSpace_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getAspects()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Aspects();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getExactType <em>Exact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exact Type</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getExactType()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_ExactType();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getImplements()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Implements();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getRequires()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Requires();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getInheritanceRelation <em>Inheritance Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inheritance Relation</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getInheritanceRelation()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_InheritanceRelation();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getExactTypeName <em>Exact Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exact Type Name</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getExactTypeName()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_ExactTypeName();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getExactTypeUri <em>Exact Type Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exact Type Uri</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getExactTypeUri()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_ExactTypeUri();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getResourceType()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_ResourceType();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getResourceUri <em>Resource Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Uri</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getResourceUri()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_ResourceUri();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getXtextSetupRef <em>Xtext Setup Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xtext Setup Ref</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getXtextSetupRef()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_XtextSetupRef();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getGenmodelUris <em>Genmodel Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Genmodel Uris</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getGenmodelUris()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_GenmodelUris();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mappings</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getMappings()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Mappings();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getUnits()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Units();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getSubtypingRelations <em>Subtyping Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtyping Relations</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelType#getSubtypingRelations()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_SubtypingRelations();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getExtracted <em>Extracted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extracted</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelType#getExtracted()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Extracted();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getMtUri <em>Mt Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mt Uri</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelType#getMtUri()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_MtUri();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getAspectTypeRef <em>Aspect Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aspect Type Ref</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Aspect#getAspectTypeRef()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_AspectTypeRef();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getAspectedClass <em>Aspected Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aspected Class</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Aspect#getAspectedClass()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_AspectedClass();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getEcoreFragment <em>Ecore Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ecore Fragment</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Aspect#getEcoreFragment()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_EcoreFragment();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.melange.metamodel.melange.Inheritance#getSubMetamodel <em>Sub Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sub Metamodel</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Inheritance#getSubMetamodel()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_SubMetamodel();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Inheritance#getSuperMetamodel <em>Super Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Metamodel</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Inheritance#getSuperMetamodel()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_SuperMetamodel();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Subtyping <em>Subtyping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtyping</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Subtyping
	 * @generated
	 */
	EClass getSubtyping();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.melange.metamodel.melange.Subtyping#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sub Type</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Subtyping#getSubType()
	 * @see #getSubtyping()
	 * @generated
	 */
	EReference getSubtyping_SubType();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Subtyping#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Subtyping#getSuperType()
	 * @see #getSubtyping()
	 * @generated
	 */
	EReference getSubtyping_SuperType();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation <em>Xbase Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xbase Transformation</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.XbaseTransformation
	 * @generated
	 */
	EClass getXbaseTransformation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getBody()
	 * @see #getXbaseTransformation()
	 * @generated
	 */
	EReference getXbaseTransformation_Body();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#isMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#isMain()
	 * @see #getXbaseTransformation()
	 * @generated
	 */
	EAttribute getXbaseTransformation_Main();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getParameters()
	 * @see #getXbaseTransformation()
	 * @generated
	 */
	EReference getXbaseTransformation_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getReturnTypeRef <em>Return Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type Ref</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getReturnTypeRef()
	 * @see #getXbaseTransformation()
	 * @generated
	 */
	EReference getXbaseTransformation_ReturnTypeRef();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.ModelingElement <em>Modeling Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeling Element</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelingElement
	 * @generated
	 */
	EClass getModelingElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.ModelingElement#getEcoreUri <em>Ecore Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecore Uri</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelingElement#getEcoreUri()
	 * @see #getModelingElement()
	 * @generated
	 */
	EAttribute getModelingElement_EcoreUri();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Mapping#getFrom()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_From();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Mapping#getTo()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_To();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Mapping#getRules()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Rules();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.ClassBinding <em>Class Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Binding</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ClassBinding
	 * @generated
	 */
	EClass getClassBinding();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.ClassBinding#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ClassBinding#getFrom()
	 * @see #getClassBinding()
	 * @generated
	 */
	EAttribute getClassBinding_From();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.ClassBinding#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ClassBinding#getTo()
	 * @see #getClassBinding()
	 * @generated
	 */
	EAttribute getClassBinding_To();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melange.metamodel.melange.ClassBinding#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ClassBinding#getProperties()
	 * @see #getClassBinding()
	 * @generated
	 */
	EReference getClassBinding_Properties();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.PropertyBinding <em>Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Binding</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.PropertyBinding
	 * @generated
	 */
	EClass getPropertyBinding();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.PropertyBinding#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.PropertyBinding#getFrom()
	 * @see #getPropertyBinding()
	 * @generated
	 */
	EAttribute getPropertyBinding_From();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.PropertyBinding#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.PropertyBinding#getTo()
	 * @see #getPropertyBinding()
	 * @generated
	 */
	EAttribute getPropertyBinding_To();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.LanguageUnit <em>Language Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Unit</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.LanguageUnit
	 * @generated
	 */
	EClass getLanguageUnit();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Ecore <em>Ecore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Ecore
	 * @generated
	 */
	EClass getEcore();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melange.metamodel.melange.Ecore#getEcoreUri <em>Ecore Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecore Uri</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Ecore#getEcoreUri()
	 * @see #getEcore()
	 * @generated
	 */
	EAttribute getEcore_EcoreUri();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.melange.metamodel.melange.Ecore#getGenmodelUris <em>Genmodel Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Genmodel Uris</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Ecore#getGenmodelUris()
	 * @see #getEcore()
	 * @generated
	 */
	EAttribute getEcore_GenmodelUris();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Merge
	 * @generated
	 */
	EClass getMerge();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melange.metamodel.melange.Merge#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Merge#getLanguage()
	 * @see #getMerge()
	 * @generated
	 */
	EReference getMerge_Language();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melange.metamodel.melange.Slice <em>Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slice</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.Slice
	 * @generated
	 */
	EClass getSlice();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.melange.metamodel.melange.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see fr.inria.diverse.melange.metamodel.melange.ResourceType
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
	MelangeFactory getMelangeFactory();

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
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelTypingSpaceImpl <em>Model Typing Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ModelTypingSpaceImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getModelTypingSpace()
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
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ElementImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getElement()
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
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

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
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__REQUIRES = eINSTANCE.getMetamodel_Requires();

		/**
		 * The meta object literal for the '<em><b>Inheritance Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__INHERITANCE_RELATION = eINSTANCE.getMetamodel_InheritanceRelation();

		/**
		 * The meta object literal for the '<em><b>Exact Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__EXACT_TYPE_NAME = eINSTANCE.getMetamodel_ExactTypeName();

		/**
		 * The meta object literal for the '<em><b>Exact Type Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__EXACT_TYPE_URI = eINSTANCE.getMetamodel_ExactTypeUri();

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
		 * The meta object literal for the '<em><b>Xtext Setup Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__XTEXT_SETUP_REF = eINSTANCE.getMetamodel_XtextSetupRef();

		/**
		 * The meta object literal for the '<em><b>Genmodel Uris</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__GENMODEL_URIS = eINSTANCE.getMetamodel_GenmodelUris();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__MAPPINGS = eINSTANCE.getMetamodel_Mappings();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__UNITS = eINSTANCE.getMetamodel_Units();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ModelTypeImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '<em><b>Subtyping Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__SUBTYPING_RELATIONS = eINSTANCE.getModelType_SubtypingRelations();

		/**
		 * The meta object literal for the '<em><b>Extracted</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__EXTRACTED = eINSTANCE.getModelType_Extracted();

		/**
		 * The meta object literal for the '<em><b>Mt Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__MT_URI = eINSTANCE.getModelType_MtUri();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.TransformationImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.AspectImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Aspect Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ASPECT_TYPE_REF = eINSTANCE.getAspect_AspectTypeRef();

		/**
		 * The meta object literal for the '<em><b>Aspected Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ASPECTED_CLASS = eINSTANCE.getAspect_AspectedClass();

		/**
		 * The meta object literal for the '<em><b>Ecore Fragment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ECORE_FRAGMENT = eINSTANCE.getAspect_EcoreFragment();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.InheritanceImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getInheritance()
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
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.SubtypingImpl <em>Subtyping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.SubtypingImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getSubtyping()
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
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.XbaseTransformationImpl <em>Xbase Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.XbaseTransformationImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getXbaseTransformation()
		 * @generated
		 */
		EClass XBASE_TRANSFORMATION = eINSTANCE.getXbaseTransformation();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XBASE_TRANSFORMATION__BODY = eINSTANCE.getXbaseTransformation_Body();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBASE_TRANSFORMATION__MAIN = eINSTANCE.getXbaseTransformation_Main();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XBASE_TRANSFORMATION__PARAMETERS = eINSTANCE.getXbaseTransformation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XBASE_TRANSFORMATION__RETURN_TYPE_REF = eINSTANCE.getXbaseTransformation_ReturnTypeRef();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelingElementImpl <em>Modeling Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ModelingElementImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getModelingElement()
		 * @generated
		 */
		EClass MODELING_ELEMENT = eINSTANCE.getModelingElement();

		/**
		 * The meta object literal for the '<em><b>Ecore Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELING_ELEMENT__ECORE_URI = eINSTANCE.getModelingElement_EcoreUri();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MappingImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__FROM = eINSTANCE.getMapping_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__TO = eINSTANCE.getMapping_To();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__RULES = eINSTANCE.getMapping_Rules();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.ClassBindingImpl <em>Class Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.ClassBindingImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getClassBinding()
		 * @generated
		 */
		EClass CLASS_BINDING = eINSTANCE.getClassBinding();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_BINDING__FROM = eINSTANCE.getClassBinding_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_BINDING__TO = eINSTANCE.getClassBinding_To();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_BINDING__PROPERTIES = eINSTANCE.getClassBinding_Properties();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.PropertyBindingImpl <em>Property Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.PropertyBindingImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getPropertyBinding()
		 * @generated
		 */
		EClass PROPERTY_BINDING = eINSTANCE.getPropertyBinding();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BINDING__FROM = eINSTANCE.getPropertyBinding_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BINDING__TO = eINSTANCE.getPropertyBinding_To();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageUnitImpl <em>Language Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.LanguageUnitImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getLanguageUnit()
		 * @generated
		 */
		EClass LANGUAGE_UNIT = eINSTANCE.getLanguageUnit();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.EcoreImpl <em>Ecore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.EcoreImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getEcore()
		 * @generated
		 */
		EClass ECORE = eINSTANCE.getEcore();

		/**
		 * The meta object literal for the '<em><b>Ecore Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE__ECORE_URI = eINSTANCE.getEcore_EcoreUri();

		/**
		 * The meta object literal for the '<em><b>Genmodel Uris</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE__GENMODEL_URIS = eINSTANCE.getEcore_GenmodelUris();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.MergeImpl <em>Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MergeImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getMerge()
		 * @generated
		 */
		EClass MERGE = eINSTANCE.getMerge();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE__LANGUAGE = eINSTANCE.getMerge_Language();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl <em>Slice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getSlice()
		 * @generated
		 */
		EClass SLICE = eINSTANCE.getSlice();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melange.metamodel.melange.ResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melange.metamodel.melange.ResourceType
		 * @see fr.inria.diverse.melange.metamodel.melange.impl.MelangePackageImpl#getResourceType()
		 * @generated
		 */
		EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

	}

} //MelangePackage
