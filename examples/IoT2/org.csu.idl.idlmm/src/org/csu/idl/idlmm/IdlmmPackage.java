/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.csu.idl.idlmm.IdlmmFactory
 * @model kind="package"
 * @generated
 */
public interface IdlmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "idlmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://idlmm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "idlmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdlmmPackage eINSTANCE = org.csu.idl.idlmm.impl.IdlmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.NamedElementImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 35;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ContainedImpl <em>Contained</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ContainedImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getContained()
	 * @generated
	 */
	int CONTAINED = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__IDENTIFIER = NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__REPOSITORY_ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__ABSOLUTE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__DEFINED_IN = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Contained</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ContainerImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINS = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.InterfaceDefImpl <em>Interface Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.InterfaceDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getInterfaceDef()
	 * @generated
	 */
	int INTERFACE_DEF = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF__IDENTIFIER = CONTAINER__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF__REPOSITORY_ID = CONTAINER__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF__VERSION = CONTAINER__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF__ABSOLUTE_NAME = CONTAINER__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF__DEFINED_IN = CONTAINER__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF__CONTAINS = CONTAINER__CONTAINS;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF__TYPE_CODE = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF__IS_ABSTRACT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF__IS_CUSTOM = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Truncatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF__IS_TRUNCATABLE = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Derives From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF__DERIVES_FROM = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Forward</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF__FORWARD = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Interface Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ModuleDefImpl <em>Module Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ModuleDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getModuleDef()
	 * @generated
	 */
	int MODULE_DEF = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEF__IDENTIFIER = CONTAINER__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEF__REPOSITORY_ID = CONTAINER__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEF__VERSION = CONTAINER__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEF__ABSOLUTE_NAME = CONTAINER__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEF__DEFINED_IN = CONTAINER__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEF__CONTAINS = CONTAINER__CONTAINS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEF__PREFIX = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEF_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.IDLTypeImpl <em>IDL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.IDLTypeImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getIDLType()
	 * @generated
	 */
	int IDL_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE__TYPE_CODE = 0;

	/**
	 * The number of structural features of the '<em>IDL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.OperationDefImpl <em>Operation Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.OperationDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getOperationDef()
	 * @generated
	 */
	int OPERATION_DEF = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__CONTAINED_TYPE = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__SHARED_TYPE = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__PARAMETERS = CONTAINED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Oneway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__IS_ONEWAY = CONTAINED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__CONTEXTS = CONTAINED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Can Raise</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__CAN_RAISE = CONTAINED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Operation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.AttributeDefImpl <em>Attribute Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.AttributeDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getAttributeDef()
	 * @generated
	 */
	int ATTRIBUTE_DEF = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEF__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEF__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEF__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEF__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEF__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEF__CONTAINED_TYPE = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEF__SHARED_TYPE = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Get Raises</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEF__GET_RAISES = CONTAINED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Set Raises</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEF__SET_RAISES = CONTAINED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEF__IS_READONLY = CONTAINED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Attribute Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEF_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ConstantDefImpl <em>Constant Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ConstantDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getConstantDef()
	 * @generated
	 */
	int CONSTANT_DEF = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEF__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEF__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEF__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEF__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEF__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEF__CONTAINED_TYPE = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEF__SHARED_TYPE = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Const Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEF__CONST_VALUE = CONTAINED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constant Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEF_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.TypedImpl <em>Typed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.TypedImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getTyped()
	 * @generated
	 */
	int TYPED = 8;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED__CONTAINED_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED__SHARED_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ParameterDefImpl <em>Parameter Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ParameterDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getParameterDef()
	 * @generated
	 */
	int PARAMETER_DEF = 9;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__CONTAINED_TYPE = TYPED__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__SHARED_TYPE = TYPED__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__IDENTIFIER = TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__DIRECTION = TYPED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF_FEATURE_COUNT = TYPED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.PrimitiveDefImpl <em>Primitive Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.PrimitiveDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getPrimitiveDef()
	 * @generated
	 */
	int PRIMITIVE_DEF = 10;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DEF__TYPE_CODE = IDL_TYPE__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DEF__KIND = IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DEF_FEATURE_COUNT = IDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ExceptionDefImpl <em>Exception Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ExceptionDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getExceptionDef()
	 * @generated
	 */
	int EXCEPTION_DEF = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__TYPE_CODE = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__MEMBERS = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exception Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.FieldImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 12;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONTAINED_TYPE = TYPED__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SHARED_TYPE = TYPED__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IDENTIFIER = TYPED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = TYPED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.FixedDefImpl <em>Fixed Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.FixedDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getFixedDef()
	 * @generated
	 */
	int FIXED_DEF = 13;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_DEF__TYPE_CODE = IDL_TYPE__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_DEF__DIGITS = IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_DEF__SCALE = IDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_DEF_FEATURE_COUNT = IDL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.WstringDefImpl <em>Wstring Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.WstringDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getWstringDef()
	 * @generated
	 */
	int WSTRING_DEF = 14;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING_DEF__TYPE_CODE = IDL_TYPE__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING_DEF__BOUND = IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wstring Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING_DEF_FEATURE_COUNT = IDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.StringDefImpl <em>String Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.StringDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getStringDef()
	 * @generated
	 */
	int STRING_DEF = 15;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__TYPE_CODE = IDL_TYPE__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__BOUND = IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF_FEATURE_COUNT = IDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.AliasDefImpl <em>Alias Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.AliasDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getAliasDef()
	 * @generated
	 */
	int ALIAS_DEF = 16;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEF__CONTAINED_TYPE = TYPED__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEF__SHARED_TYPE = TYPED__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEF__TYPE_CODE = TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEF__IDENTIFIER = TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEF__REPOSITORY_ID = TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEF__VERSION = TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEF__ABSOLUTE_NAME = TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEF__DEFINED_IN = TYPED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Alias Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEF_FEATURE_COUNT = TYPED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ArrayDefImpl <em>Array Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ArrayDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getArrayDef()
	 * @generated
	 */
	int ARRAY_DEF = 17;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF__CONTAINED_TYPE = TYPED__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF__SHARED_TYPE = TYPED__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF__TYPE_CODE = TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF__NAME = TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF__BOUNDS = TYPED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF_FEATURE_COUNT = TYPED_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.SequenceDefImpl <em>Sequence Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.SequenceDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getSequenceDef()
	 * @generated
	 */
	int SEQUENCE_DEF = 18;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DEF__CONTAINED_TYPE = TYPED__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DEF__SHARED_TYPE = TYPED__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DEF__TYPE_CODE = TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DEF__BOUND = TYPED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DEF_FEATURE_COUNT = TYPED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.UnionFieldImpl <em>Union Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.UnionFieldImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getUnionField()
	 * @generated
	 */
	int UNION_FIELD = 19;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FIELD__CONTAINED_TYPE = TYPED__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FIELD__SHARED_TYPE = TYPED__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FIELD__IDENTIFIER = TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FIELD__LABEL = TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FIELD__IS_DEFAULT = TYPED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Union Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FIELD_FEATURE_COUNT = TYPED_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.TypedefDefImpl <em>Typedef Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.TypedefDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getTypedefDef()
	 * @generated
	 */
	int TYPEDEF_DEF = 20;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__TYPE_CODE = IDL_TYPE__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__IDENTIFIER = IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__REPOSITORY_ID = IDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__VERSION = IDL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__ABSOLUTE_NAME = IDL_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__DEFINED_IN = IDL_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Typedef Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF_FEATURE_COUNT = IDL_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.UnionDefImpl <em>Union Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.UnionDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getUnionDef()
	 * @generated
	 */
	int UNION_DEF = 21;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEF__TYPE_CODE = TYPEDEF_DEF__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEF__IDENTIFIER = TYPEDEF_DEF__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEF__REPOSITORY_ID = TYPEDEF_DEF__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEF__VERSION = TYPEDEF_DEF__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEF__ABSOLUTE_NAME = TYPEDEF_DEF__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEF__DEFINED_IN = TYPEDEF_DEF__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Union Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEF__UNION_MEMBERS = TYPEDEF_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Discrim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEF__CONTAINED_DISCRIM = TYPEDEF_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shared Discrim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEF__SHARED_DISCRIM = TYPEDEF_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Union Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEF_FEATURE_COUNT = TYPEDEF_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.EnumDefImpl <em>Enum Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.EnumDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getEnumDef()
	 * @generated
	 */
	int ENUM_DEF = 22;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__TYPE_CODE = TYPEDEF_DEF__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__IDENTIFIER = TYPEDEF_DEF__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__REPOSITORY_ID = TYPEDEF_DEF__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__VERSION = TYPEDEF_DEF__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__ABSOLUTE_NAME = TYPEDEF_DEF__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__DEFINED_IN = TYPEDEF_DEF__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__MEMBERS = TYPEDEF_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF_FEATURE_COUNT = TYPEDEF_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.StructDefImpl <em>Struct Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.StructDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getStructDef()
	 * @generated
	 */
	int STRUCT_DEF = 23;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEF__TYPE_CODE = TYPEDEF_DEF__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEF__IDENTIFIER = TYPEDEF_DEF__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEF__REPOSITORY_ID = TYPEDEF_DEF__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEF__VERSION = TYPEDEF_DEF__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEF__ABSOLUTE_NAME = TYPEDEF_DEF__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEF__DEFINED_IN = TYPEDEF_DEF__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEF__MEMBERS = TYPEDEF_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEF_FEATURE_COUNT = TYPEDEF_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.TranslationUnitImpl <em>Translation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.TranslationUnitImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getTranslationUnit()
	 * @generated
	 */
	int TRANSLATION_UNIT = 24;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT__INCLUDES = 2;

	/**
	 * The number of structural features of the '<em>Translation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.IncludeImpl <em>Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.IncludeImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getInclude()
	 * @generated
	 */
	int INCLUDE = 25;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__IMPORT_URI = 0;

	/**
	 * The feature id for the '<em><b>Translation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__TRANSLATION_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ExpressionImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 26;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.BinaryExpressionImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.UnaryExpressionImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.LiteralExpressionImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getLiteralExpression()
	 * @generated
	 */
	int LITERAL_EXPRESSION = 29;

	/**
	 * The number of structural features of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ConstantDefRefImpl <em>Constant Def Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ConstantDefRefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getConstantDefRef()
	 * @generated
	 */
	int CONSTANT_DEF_REF = 30;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEF_REF__CONSTANT = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Def Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEF_REF_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ValueExpressionImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getValueExpression()
	 * @generated
	 */
	int VALUE_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ForwardDefImpl <em>Forward Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ForwardDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getForwardDef()
	 * @generated
	 */
	int FORWARD_DEF = 32;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DEF__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DEF__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DEF__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DEF__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DEF__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DEF__DEFINITION = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DEF_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ConstantImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 34;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.EnumMemberImpl <em>Enum Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.EnumMemberImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getEnumMember()
	 * @generated
	 */
	int ENUM_MEMBER = 33;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__IDENTIFIER = CONSTANT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__REPOSITORY_ID = CONSTANT__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__VERSION = CONSTANT__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__ABSOLUTE_NAME = CONSTANT__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__DEFINED_IN = CONSTANT__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__ENUM = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.ParameterMode <em>Parameter Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.ParameterMode
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getParameterMode()
	 * @generated
	 */
	int PARAMETER_MODE = 36;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.PrimitiveKind <em>Primitive Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.PrimitiveKind
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getPrimitiveKind()
	 * @generated
	 */
	int PRIMITIVE_KIND = 37;

	/**
	 * The meta object id for the '<em>EAny</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getEAny()
	 * @generated
	 */
	int EANY = 38;

	/**
	 * The meta object id for the '<em>EType Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getETypeCode()
	 * @generated
	 */
	int ETYPE_CODE = 39;


	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.csu.idl.idlmm.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.Container#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see org.csu.idl.idlmm.Container#getContains()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Contains();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.Contained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained</em>'.
	 * @see org.csu.idl.idlmm.Contained
	 * @generated
	 */
	EClass getContained();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.Contained#getRepositoryId <em>Repository Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Id</em>'.
	 * @see org.csu.idl.idlmm.Contained#getRepositoryId()
	 * @see #getContained()
	 * @generated
	 */
	EAttribute getContained_RepositoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.Contained#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.csu.idl.idlmm.Contained#getVersion()
	 * @see #getContained()
	 * @generated
	 */
	EAttribute getContained_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.Contained#getAbsoluteName <em>Absolute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Name</em>'.
	 * @see org.csu.idl.idlmm.Contained#getAbsoluteName()
	 * @see #getContained()
	 * @generated
	 */
	EAttribute getContained_AbsoluteName();

	/**
	 * Returns the meta object for the container reference '{@link org.csu.idl.idlmm.Contained#getDefinedIn <em>Defined In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Defined In</em>'.
	 * @see org.csu.idl.idlmm.Contained#getDefinedIn()
	 * @see #getContained()
	 * @generated
	 */
	EReference getContained_DefinedIn();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.InterfaceDef <em>Interface Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def</em>'.
	 * @see org.csu.idl.idlmm.InterfaceDef
	 * @generated
	 */
	EClass getInterfaceDef();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.InterfaceDef#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.csu.idl.idlmm.InterfaceDef#isIsAbstract()
	 * @see #getInterfaceDef()
	 * @generated
	 */
	EAttribute getInterfaceDef_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.InterfaceDef#isIsCustom <em>Is Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Custom</em>'.
	 * @see org.csu.idl.idlmm.InterfaceDef#isIsCustom()
	 * @see #getInterfaceDef()
	 * @generated
	 */
	EAttribute getInterfaceDef_IsCustom();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.InterfaceDef#isIsTruncatable <em>Is Truncatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Truncatable</em>'.
	 * @see org.csu.idl.idlmm.InterfaceDef#isIsTruncatable()
	 * @see #getInterfaceDef()
	 * @generated
	 */
	EAttribute getInterfaceDef_IsTruncatable();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.idl.idlmm.InterfaceDef#getDerivesFrom <em>Derives From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derives From</em>'.
	 * @see org.csu.idl.idlmm.InterfaceDef#getDerivesFrom()
	 * @see #getInterfaceDef()
	 * @generated
	 */
	EReference getInterfaceDef_DerivesFrom();

	/**
	 * Returns the meta object for the reference '{@link org.csu.idl.idlmm.InterfaceDef#getForward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forward</em>'.
	 * @see org.csu.idl.idlmm.InterfaceDef#getForward()
	 * @see #getInterfaceDef()
	 * @generated
	 */
	EReference getInterfaceDef_Forward();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.ModuleDef <em>Module Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Def</em>'.
	 * @see org.csu.idl.idlmm.ModuleDef
	 * @generated
	 */
	EClass getModuleDef();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.ModuleDef#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.csu.idl.idlmm.ModuleDef#getPrefix()
	 * @see #getModuleDef()
	 * @generated
	 */
	EAttribute getModuleDef_Prefix();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.IDLType <em>IDL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Type</em>'.
	 * @see org.csu.idl.idlmm.IDLType
	 * @generated
	 */
	EClass getIDLType();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.IDLType#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.csu.idl.idlmm.IDLType#getTypeCode()
	 * @see #getIDLType()
	 * @generated
	 */
	EAttribute getIDLType_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.OperationDef <em>Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Def</em>'.
	 * @see org.csu.idl.idlmm.OperationDef
	 * @generated
	 */
	EClass getOperationDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.OperationDef#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.csu.idl.idlmm.OperationDef#getParameters()
	 * @see #getOperationDef()
	 * @generated
	 */
	EReference getOperationDef_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.OperationDef#isIsOneway <em>Is Oneway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Oneway</em>'.
	 * @see org.csu.idl.idlmm.OperationDef#isIsOneway()
	 * @see #getOperationDef()
	 * @generated
	 */
	EAttribute getOperationDef_IsOneway();

	/**
	 * Returns the meta object for the attribute list '{@link org.csu.idl.idlmm.OperationDef#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contexts</em>'.
	 * @see org.csu.idl.idlmm.OperationDef#getContexts()
	 * @see #getOperationDef()
	 * @generated
	 */
	EAttribute getOperationDef_Contexts();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.idl.idlmm.OperationDef#getCanRaise <em>Can Raise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Can Raise</em>'.
	 * @see org.csu.idl.idlmm.OperationDef#getCanRaise()
	 * @see #getOperationDef()
	 * @generated
	 */
	EReference getOperationDef_CanRaise();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.AttributeDef <em>Attribute Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Def</em>'.
	 * @see org.csu.idl.idlmm.AttributeDef
	 * @generated
	 */
	EClass getAttributeDef();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.idl.idlmm.AttributeDef#getGetRaises <em>Get Raises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Get Raises</em>'.
	 * @see org.csu.idl.idlmm.AttributeDef#getGetRaises()
	 * @see #getAttributeDef()
	 * @generated
	 */
	EReference getAttributeDef_GetRaises();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.idl.idlmm.AttributeDef#getSetRaises <em>Set Raises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Set Raises</em>'.
	 * @see org.csu.idl.idlmm.AttributeDef#getSetRaises()
	 * @see #getAttributeDef()
	 * @generated
	 */
	EReference getAttributeDef_SetRaises();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.AttributeDef#isIsReadonly <em>Is Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Readonly</em>'.
	 * @see org.csu.idl.idlmm.AttributeDef#isIsReadonly()
	 * @see #getAttributeDef()
	 * @generated
	 */
	EAttribute getAttributeDef_IsReadonly();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.ConstantDef <em>Constant Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Def</em>'.
	 * @see org.csu.idl.idlmm.ConstantDef
	 * @generated
	 */
	EClass getConstantDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.csu.idl.idlmm.ConstantDef#getConstValue <em>Const Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Const Value</em>'.
	 * @see org.csu.idl.idlmm.ConstantDef#getConstValue()
	 * @see #getConstantDef()
	 * @generated
	 */
	EReference getConstantDef_ConstValue();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed</em>'.
	 * @see org.csu.idl.idlmm.Typed
	 * @generated
	 */
	EClass getTyped();

	/**
	 * Returns the meta object for the containment reference '{@link org.csu.idl.idlmm.Typed#getContainedType <em>Contained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Type</em>'.
	 * @see org.csu.idl.idlmm.Typed#getContainedType()
	 * @see #getTyped()
	 * @generated
	 */
	EReference getTyped_ContainedType();

	/**
	 * Returns the meta object for the reference '{@link org.csu.idl.idlmm.Typed#getSharedType <em>Shared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shared Type</em>'.
	 * @see org.csu.idl.idlmm.Typed#getSharedType()
	 * @see #getTyped()
	 * @generated
	 */
	EReference getTyped_SharedType();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.ParameterDef <em>Parameter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Def</em>'.
	 * @see org.csu.idl.idlmm.ParameterDef
	 * @generated
	 */
	EClass getParameterDef();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.ParameterDef#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.csu.idl.idlmm.ParameterDef#getIdentifier()
	 * @see #getParameterDef()
	 * @generated
	 */
	EAttribute getParameterDef_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.ParameterDef#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.csu.idl.idlmm.ParameterDef#getDirection()
	 * @see #getParameterDef()
	 * @generated
	 */
	EAttribute getParameterDef_Direction();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.PrimitiveDef <em>Primitive Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Def</em>'.
	 * @see org.csu.idl.idlmm.PrimitiveDef
	 * @generated
	 */
	EClass getPrimitiveDef();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.PrimitiveDef#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.csu.idl.idlmm.PrimitiveDef#getKind()
	 * @see #getPrimitiveDef()
	 * @generated
	 */
	EAttribute getPrimitiveDef_Kind();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.ExceptionDef <em>Exception Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Def</em>'.
	 * @see org.csu.idl.idlmm.ExceptionDef
	 * @generated
	 */
	EClass getExceptionDef();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.ExceptionDef#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.csu.idl.idlmm.ExceptionDef#getTypeCode()
	 * @see #getExceptionDef()
	 * @generated
	 */
	EAttribute getExceptionDef_TypeCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.ExceptionDef#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.csu.idl.idlmm.ExceptionDef#getMembers()
	 * @see #getExceptionDef()
	 * @generated
	 */
	EReference getExceptionDef_Members();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.csu.idl.idlmm.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.Field#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.csu.idl.idlmm.Field#getIdentifier()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Identifier();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.FixedDef <em>Fixed Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Def</em>'.
	 * @see org.csu.idl.idlmm.FixedDef
	 * @generated
	 */
	EClass getFixedDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.csu.idl.idlmm.FixedDef#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digits</em>'.
	 * @see org.csu.idl.idlmm.FixedDef#getDigits()
	 * @see #getFixedDef()
	 * @generated
	 */
	EReference getFixedDef_Digits();

	/**
	 * Returns the meta object for the containment reference '{@link org.csu.idl.idlmm.FixedDef#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale</em>'.
	 * @see org.csu.idl.idlmm.FixedDef#getScale()
	 * @see #getFixedDef()
	 * @generated
	 */
	EReference getFixedDef_Scale();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.WstringDef <em>Wstring Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wstring Def</em>'.
	 * @see org.csu.idl.idlmm.WstringDef
	 * @generated
	 */
	EClass getWstringDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.csu.idl.idlmm.WstringDef#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see org.csu.idl.idlmm.WstringDef#getBound()
	 * @see #getWstringDef()
	 * @generated
	 */
	EReference getWstringDef_Bound();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.StringDef <em>String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Def</em>'.
	 * @see org.csu.idl.idlmm.StringDef
	 * @generated
	 */
	EClass getStringDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.csu.idl.idlmm.StringDef#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see org.csu.idl.idlmm.StringDef#getBound()
	 * @see #getStringDef()
	 * @generated
	 */
	EReference getStringDef_Bound();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.AliasDef <em>Alias Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Def</em>'.
	 * @see org.csu.idl.idlmm.AliasDef
	 * @generated
	 */
	EClass getAliasDef();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.ArrayDef <em>Array Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Def</em>'.
	 * @see org.csu.idl.idlmm.ArrayDef
	 * @generated
	 */
	EClass getArrayDef();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.ArrayDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.csu.idl.idlmm.ArrayDef#getName()
	 * @see #getArrayDef()
	 * @generated
	 */
	EAttribute getArrayDef_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.ArrayDef#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounds</em>'.
	 * @see org.csu.idl.idlmm.ArrayDef#getBounds()
	 * @see #getArrayDef()
	 * @generated
	 */
	EReference getArrayDef_Bounds();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.SequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Def</em>'.
	 * @see org.csu.idl.idlmm.SequenceDef
	 * @generated
	 */
	EClass getSequenceDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.csu.idl.idlmm.SequenceDef#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see org.csu.idl.idlmm.SequenceDef#getBound()
	 * @see #getSequenceDef()
	 * @generated
	 */
	EReference getSequenceDef_Bound();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.UnionField <em>Union Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Field</em>'.
	 * @see org.csu.idl.idlmm.UnionField
	 * @generated
	 */
	EClass getUnionField();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.UnionField#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.csu.idl.idlmm.UnionField#getIdentifier()
	 * @see #getUnionField()
	 * @generated
	 */
	EAttribute getUnionField_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.UnionField#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see org.csu.idl.idlmm.UnionField#getLabel()
	 * @see #getUnionField()
	 * @generated
	 */
	EReference getUnionField_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.UnionField#isIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see org.csu.idl.idlmm.UnionField#isIsDefault()
	 * @see #getUnionField()
	 * @generated
	 */
	EAttribute getUnionField_IsDefault();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.TypedefDef <em>Typedef Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typedef Def</em>'.
	 * @see org.csu.idl.idlmm.TypedefDef
	 * @generated
	 */
	EClass getTypedefDef();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.UnionDef <em>Union Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Def</em>'.
	 * @see org.csu.idl.idlmm.UnionDef
	 * @generated
	 */
	EClass getUnionDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.UnionDef#getUnionMembers <em>Union Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Members</em>'.
	 * @see org.csu.idl.idlmm.UnionDef#getUnionMembers()
	 * @see #getUnionDef()
	 * @generated
	 */
	EReference getUnionDef_UnionMembers();

	/**
	 * Returns the meta object for the containment reference '{@link org.csu.idl.idlmm.UnionDef#getContainedDiscrim <em>Contained Discrim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Discrim</em>'.
	 * @see org.csu.idl.idlmm.UnionDef#getContainedDiscrim()
	 * @see #getUnionDef()
	 * @generated
	 */
	EReference getUnionDef_ContainedDiscrim();

	/**
	 * Returns the meta object for the reference '{@link org.csu.idl.idlmm.UnionDef#getSharedDiscrim <em>Shared Discrim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shared Discrim</em>'.
	 * @see org.csu.idl.idlmm.UnionDef#getSharedDiscrim()
	 * @see #getUnionDef()
	 * @generated
	 */
	EReference getUnionDef_SharedDiscrim();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.EnumDef <em>Enum Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Def</em>'.
	 * @see org.csu.idl.idlmm.EnumDef
	 * @generated
	 */
	EClass getEnumDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.EnumDef#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.csu.idl.idlmm.EnumDef#getMembers()
	 * @see #getEnumDef()
	 * @generated
	 */
	EReference getEnumDef_Members();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.StructDef <em>Struct Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Def</em>'.
	 * @see org.csu.idl.idlmm.StructDef
	 * @generated
	 */
	EClass getStructDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.StructDef#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.csu.idl.idlmm.StructDef#getMembers()
	 * @see #getStructDef()
	 * @generated
	 */
	EReference getStructDef_Members();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.TranslationUnit <em>Translation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation Unit</em>'.
	 * @see org.csu.idl.idlmm.TranslationUnit
	 * @generated
	 */
	EClass getTranslationUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.TranslationUnit#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see org.csu.idl.idlmm.TranslationUnit#getContains()
	 * @see #getTranslationUnit()
	 * @generated
	 */
	EReference getTranslationUnit_Contains();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.TranslationUnit#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.csu.idl.idlmm.TranslationUnit#getIdentifier()
	 * @see #getTranslationUnit()
	 * @generated
	 */
	EAttribute getTranslationUnit_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.TranslationUnit#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see org.csu.idl.idlmm.TranslationUnit#getIncludes()
	 * @see #getTranslationUnit()
	 * @generated
	 */
	EReference getTranslationUnit_Includes();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include</em>'.
	 * @see org.csu.idl.idlmm.Include
	 * @generated
	 */
	EClass getInclude();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.Include#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.csu.idl.idlmm.Include#getImportURI()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_ImportURI();

	/**
	 * Returns the meta object for the reference '{@link org.csu.idl.idlmm.Include#getTranslationUnit <em>Translation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Translation Unit</em>'.
	 * @see org.csu.idl.idlmm.Include#getTranslationUnit()
	 * @see #getInclude()
	 * @generated
	 */
	EReference getInclude_TranslationUnit();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.csu.idl.idlmm.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.csu.idl.idlmm.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.csu.idl.idlmm.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.csu.idl.idlmm.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.csu.idl.idlmm.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.csu.idl.idlmm.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.csu.idl.idlmm.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.csu.idl.idlmm.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.csu.idl.idlmm.UnaryExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.csu.idl.idlmm.UnaryExpression#getExpression()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.csu.idl.idlmm.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Expression</em>'.
	 * @see org.csu.idl.idlmm.LiteralExpression
	 * @generated
	 */
	EClass getLiteralExpression();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.ConstantDefRef <em>Constant Def Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Def Ref</em>'.
	 * @see org.csu.idl.idlmm.ConstantDefRef
	 * @generated
	 */
	EClass getConstantDefRef();

	/**
	 * Returns the meta object for the reference '{@link org.csu.idl.idlmm.ConstantDefRef#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constant</em>'.
	 * @see org.csu.idl.idlmm.ConstantDefRef#getConstant()
	 * @see #getConstantDefRef()
	 * @generated
	 */
	EReference getConstantDefRef_Constant();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.ValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Expression</em>'.
	 * @see org.csu.idl.idlmm.ValueExpression
	 * @generated
	 */
	EClass getValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.ValueExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.csu.idl.idlmm.ValueExpression#getValue()
	 * @see #getValueExpression()
	 * @generated
	 */
	EAttribute getValueExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.ForwardDef <em>Forward Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward Def</em>'.
	 * @see org.csu.idl.idlmm.ForwardDef
	 * @generated
	 */
	EClass getForwardDef();

	/**
	 * Returns the meta object for the reference '{@link org.csu.idl.idlmm.ForwardDef#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.csu.idl.idlmm.ForwardDef#getDefinition()
	 * @see #getForwardDef()
	 * @generated
	 */
	EReference getForwardDef_Definition();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.EnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Member</em>'.
	 * @see org.csu.idl.idlmm.EnumMember
	 * @generated
	 */
	EClass getEnumMember();

	/**
	 * Returns the meta object for the container reference '{@link org.csu.idl.idlmm.EnumMember#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enum</em>'.
	 * @see org.csu.idl.idlmm.EnumMember#getEnum()
	 * @see #getEnumMember()
	 * @generated
	 */
	EReference getEnumMember_Enum();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.csu.idl.idlmm.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.csu.idl.idlmm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.NamedElement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.csu.idl.idlmm.NamedElement#getIdentifier()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Identifier();

	/**
	 * Returns the meta object for enum '{@link org.csu.idl.idlmm.ParameterMode <em>Parameter Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Mode</em>'.
	 * @see org.csu.idl.idlmm.ParameterMode
	 * @generated
	 */
	EEnum getParameterMode();

	/**
	 * Returns the meta object for enum '{@link org.csu.idl.idlmm.PrimitiveKind <em>Primitive Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Kind</em>'.
	 * @see org.csu.idl.idlmm.PrimitiveKind
	 * @generated
	 */
	EEnum getPrimitiveKind();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EAny</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EAny</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getEAny();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EType Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EType Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getETypeCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdlmmFactory getIdlmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ContainerImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTAINS = eINSTANCE.getContainer_Contains();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ContainedImpl <em>Contained</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ContainedImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getContained()
		 * @generated
		 */
		EClass CONTAINED = eINSTANCE.getContained();

		/**
		 * The meta object literal for the '<em><b>Repository Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED__REPOSITORY_ID = eINSTANCE.getContained_RepositoryId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED__VERSION = eINSTANCE.getContained_Version();

		/**
		 * The meta object literal for the '<em><b>Absolute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED__ABSOLUTE_NAME = eINSTANCE.getContained_AbsoluteName();

		/**
		 * The meta object literal for the '<em><b>Defined In</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED__DEFINED_IN = eINSTANCE.getContained_DefinedIn();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.InterfaceDefImpl <em>Interface Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.InterfaceDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getInterfaceDef()
		 * @generated
		 */
		EClass INTERFACE_DEF = eINSTANCE.getInterfaceDef();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DEF__IS_ABSTRACT = eINSTANCE.getInterfaceDef_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Custom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DEF__IS_CUSTOM = eINSTANCE.getInterfaceDef_IsCustom();

		/**
		 * The meta object literal for the '<em><b>Is Truncatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DEF__IS_TRUNCATABLE = eINSTANCE.getInterfaceDef_IsTruncatable();

		/**
		 * The meta object literal for the '<em><b>Derives From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DEF__DERIVES_FROM = eINSTANCE.getInterfaceDef_DerivesFrom();

		/**
		 * The meta object literal for the '<em><b>Forward</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DEF__FORWARD = eINSTANCE.getInterfaceDef_Forward();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ModuleDefImpl <em>Module Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ModuleDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getModuleDef()
		 * @generated
		 */
		EClass MODULE_DEF = eINSTANCE.getModuleDef();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_DEF__PREFIX = eINSTANCE.getModuleDef_Prefix();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.IDLTypeImpl <em>IDL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.IDLTypeImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getIDLType()
		 * @generated
		 */
		EClass IDL_TYPE = eINSTANCE.getIDLType();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_TYPE__TYPE_CODE = eINSTANCE.getIDLType_TypeCode();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.OperationDefImpl <em>Operation Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.OperationDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getOperationDef()
		 * @generated
		 */
		EClass OPERATION_DEF = eINSTANCE.getOperationDef();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEF__PARAMETERS = eINSTANCE.getOperationDef_Parameters();

		/**
		 * The meta object literal for the '<em><b>Is Oneway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_DEF__IS_ONEWAY = eINSTANCE.getOperationDef_IsOneway();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_DEF__CONTEXTS = eINSTANCE.getOperationDef_Contexts();

		/**
		 * The meta object literal for the '<em><b>Can Raise</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEF__CAN_RAISE = eINSTANCE.getOperationDef_CanRaise();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.AttributeDefImpl <em>Attribute Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.AttributeDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getAttributeDef()
		 * @generated
		 */
		EClass ATTRIBUTE_DEF = eINSTANCE.getAttributeDef();

		/**
		 * The meta object literal for the '<em><b>Get Raises</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEF__GET_RAISES = eINSTANCE.getAttributeDef_GetRaises();

		/**
		 * The meta object literal for the '<em><b>Set Raises</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEF__SET_RAISES = eINSTANCE.getAttributeDef_SetRaises();

		/**
		 * The meta object literal for the '<em><b>Is Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEF__IS_READONLY = eINSTANCE.getAttributeDef_IsReadonly();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ConstantDefImpl <em>Constant Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ConstantDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getConstantDef()
		 * @generated
		 */
		EClass CONSTANT_DEF = eINSTANCE.getConstantDef();

		/**
		 * The meta object literal for the '<em><b>Const Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_DEF__CONST_VALUE = eINSTANCE.getConstantDef_ConstValue();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.TypedImpl <em>Typed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.TypedImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getTyped()
		 * @generated
		 */
		EClass TYPED = eINSTANCE.getTyped();

		/**
		 * The meta object literal for the '<em><b>Contained Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED__CONTAINED_TYPE = eINSTANCE.getTyped_ContainedType();

		/**
		 * The meta object literal for the '<em><b>Shared Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED__SHARED_TYPE = eINSTANCE.getTyped_SharedType();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ParameterDefImpl <em>Parameter Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ParameterDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getParameterDef()
		 * @generated
		 */
		EClass PARAMETER_DEF = eINSTANCE.getParameterDef();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEF__IDENTIFIER = eINSTANCE.getParameterDef_Identifier();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEF__DIRECTION = eINSTANCE.getParameterDef_Direction();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.PrimitiveDefImpl <em>Primitive Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.PrimitiveDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getPrimitiveDef()
		 * @generated
		 */
		EClass PRIMITIVE_DEF = eINSTANCE.getPrimitiveDef();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DEF__KIND = eINSTANCE.getPrimitiveDef_Kind();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ExceptionDefImpl <em>Exception Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ExceptionDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getExceptionDef()
		 * @generated
		 */
		EClass EXCEPTION_DEF = eINSTANCE.getExceptionDef();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_DEF__TYPE_CODE = eINSTANCE.getExceptionDef_TypeCode();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_DEF__MEMBERS = eINSTANCE.getExceptionDef_Members();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.FieldImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IDENTIFIER = eINSTANCE.getField_Identifier();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.FixedDefImpl <em>Fixed Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.FixedDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getFixedDef()
		 * @generated
		 */
		EClass FIXED_DEF = eINSTANCE.getFixedDef();

		/**
		 * The meta object literal for the '<em><b>Digits</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_DEF__DIGITS = eINSTANCE.getFixedDef_Digits();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_DEF__SCALE = eINSTANCE.getFixedDef_Scale();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.WstringDefImpl <em>Wstring Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.WstringDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getWstringDef()
		 * @generated
		 */
		EClass WSTRING_DEF = eINSTANCE.getWstringDef();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSTRING_DEF__BOUND = eINSTANCE.getWstringDef_Bound();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.StringDefImpl <em>String Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.StringDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getStringDef()
		 * @generated
		 */
		EClass STRING_DEF = eINSTANCE.getStringDef();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_DEF__BOUND = eINSTANCE.getStringDef_Bound();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.AliasDefImpl <em>Alias Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.AliasDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getAliasDef()
		 * @generated
		 */
		EClass ALIAS_DEF = eINSTANCE.getAliasDef();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ArrayDefImpl <em>Array Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ArrayDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getArrayDef()
		 * @generated
		 */
		EClass ARRAY_DEF = eINSTANCE.getArrayDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_DEF__NAME = eINSTANCE.getArrayDef_Name();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_DEF__BOUNDS = eINSTANCE.getArrayDef_Bounds();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.SequenceDefImpl <em>Sequence Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.SequenceDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getSequenceDef()
		 * @generated
		 */
		EClass SEQUENCE_DEF = eINSTANCE.getSequenceDef();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_DEF__BOUND = eINSTANCE.getSequenceDef_Bound();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.UnionFieldImpl <em>Union Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.UnionFieldImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getUnionField()
		 * @generated
		 */
		EClass UNION_FIELD = eINSTANCE.getUnionField();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION_FIELD__IDENTIFIER = eINSTANCE.getUnionField_Identifier();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_FIELD__LABEL = eINSTANCE.getUnionField_Label();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION_FIELD__IS_DEFAULT = eINSTANCE.getUnionField_IsDefault();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.TypedefDefImpl <em>Typedef Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.TypedefDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getTypedefDef()
		 * @generated
		 */
		EClass TYPEDEF_DEF = eINSTANCE.getTypedefDef();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.UnionDefImpl <em>Union Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.UnionDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getUnionDef()
		 * @generated
		 */
		EClass UNION_DEF = eINSTANCE.getUnionDef();

		/**
		 * The meta object literal for the '<em><b>Union Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_DEF__UNION_MEMBERS = eINSTANCE.getUnionDef_UnionMembers();

		/**
		 * The meta object literal for the '<em><b>Contained Discrim</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_DEF__CONTAINED_DISCRIM = eINSTANCE.getUnionDef_ContainedDiscrim();

		/**
		 * The meta object literal for the '<em><b>Shared Discrim</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_DEF__SHARED_DISCRIM = eINSTANCE.getUnionDef_SharedDiscrim();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.EnumDefImpl <em>Enum Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.EnumDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getEnumDef()
		 * @generated
		 */
		EClass ENUM_DEF = eINSTANCE.getEnumDef();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_DEF__MEMBERS = eINSTANCE.getEnumDef_Members();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.StructDefImpl <em>Struct Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.StructDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getStructDef()
		 * @generated
		 */
		EClass STRUCT_DEF = eINSTANCE.getStructDef();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_DEF__MEMBERS = eINSTANCE.getStructDef_Members();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.TranslationUnitImpl <em>Translation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.TranslationUnitImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getTranslationUnit()
		 * @generated
		 */
		EClass TRANSLATION_UNIT = eINSTANCE.getTranslationUnit();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_UNIT__CONTAINS = eINSTANCE.getTranslationUnit_Contains();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION_UNIT__IDENTIFIER = eINSTANCE.getTranslationUnit_Identifier();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_UNIT__INCLUDES = eINSTANCE.getTranslationUnit_Includes();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.IncludeImpl <em>Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.IncludeImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getInclude()
		 * @generated
		 */
		EClass INCLUDE = eINSTANCE.getInclude();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE__IMPORT_URI = eINSTANCE.getInclude_ImportURI();

		/**
		 * The meta object literal for the '<em><b>Translation Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE__TRANSLATION_UNIT = eINSTANCE.getInclude_TranslationUnit();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ExpressionImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.BinaryExpressionImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.UnaryExpressionImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__EXPRESSION = eINSTANCE.getUnaryExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.LiteralExpressionImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getLiteralExpression()
		 * @generated
		 */
		EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ConstantDefRefImpl <em>Constant Def Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ConstantDefRefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getConstantDefRef()
		 * @generated
		 */
		EClass CONSTANT_DEF_REF = eINSTANCE.getConstantDefRef();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_DEF_REF__CONSTANT = eINSTANCE.getConstantDefRef_Constant();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ValueExpressionImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getValueExpression()
		 * @generated
		 */
		EClass VALUE_EXPRESSION = eINSTANCE.getValueExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_EXPRESSION__VALUE = eINSTANCE.getValueExpression_Value();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ForwardDefImpl <em>Forward Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ForwardDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getForwardDef()
		 * @generated
		 */
		EClass FORWARD_DEF = eINSTANCE.getForwardDef();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORWARD_DEF__DEFINITION = eINSTANCE.getForwardDef_Definition();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.EnumMemberImpl <em>Enum Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.EnumMemberImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getEnumMember()
		 * @generated
		 */
		EClass ENUM_MEMBER = eINSTANCE.getEnumMember();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_MEMBER__ENUM = eINSTANCE.getEnumMember_Enum();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ConstantImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.NamedElementImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__IDENTIFIER = eINSTANCE.getNamedElement_Identifier();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.ParameterMode <em>Parameter Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.ParameterMode
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getParameterMode()
		 * @generated
		 */
		EEnum PARAMETER_MODE = eINSTANCE.getParameterMode();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.PrimitiveKind <em>Primitive Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.PrimitiveKind
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getPrimitiveKind()
		 * @generated
		 */
		EEnum PRIMITIVE_KIND = eINSTANCE.getPrimitiveKind();

		/**
		 * The meta object literal for the '<em>EAny</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getEAny()
		 * @generated
		 */
		EDataType EANY = eINSTANCE.getEAny();

		/**
		 * The meta object literal for the '<em>EType Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getETypeCode()
		 * @generated
		 */
		EDataType ETYPE_CODE = eINSTANCE.getETypeCode();

	}

} //IdlmmPackage
