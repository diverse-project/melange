/**
 */
package exhaustive.impl;

import exhaustive.AbstractTest;
import exhaustive.AttributesTest;
import exhaustive.ExhaustiveFactory;
import exhaustive.ExhaustivePackage;
import exhaustive.GenericChildTest;
import exhaustive.GenericTest;
import exhaustive.InterfaceTest;
import exhaustive.MultipleSuperTest;
import exhaustive.OperationsTest;
import exhaustive.ReferencesTest;
import exhaustive.SerializableEnumTest;
import exhaustive.UnserializableEnumTest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExhaustivePackageImpl extends EPackageImpl implements ExhaustivePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleSuperTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencesTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationsTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericChildTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unserializableEnumTestEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serializableEnumTestEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unserializableDatatypeTestEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serializableDatatypeTestEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType customExceptionTestEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see exhaustive.ExhaustivePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExhaustivePackageImpl() {
		super(eNS_URI, ExhaustiveFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExhaustivePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExhaustivePackage init() {
		if (isInited) return (ExhaustivePackage)EPackage.Registry.INSTANCE.getEPackage(ExhaustivePackage.eNS_URI);

		// Obtain or create and register package
		ExhaustivePackageImpl theExhaustivePackage = (ExhaustivePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExhaustivePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExhaustivePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theExhaustivePackage.createPackageContents();

		// Initialize created meta-data
		theExhaustivePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExhaustivePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExhaustivePackage.eNS_URI, theExhaustivePackage);
		return theExhaustivePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTest() {
		return abstractTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceTest() {
		return interfaceTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleSuperTest() {
		return multipleSuperTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencesTest() {
		return referencesTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_ChangeableYes() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_ChangeableNo() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_ContainmentYes() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_ReferenceToGenerics() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_Opposite1() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_OrderedFalse() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_ResolveProxiesFalse() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_TransientTrue() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_UniqueFalse() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_UnsettableTrue() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_VolatileTrue() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_DerivedYes() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_UpperBoundN() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_UpperBound2() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_LowerBound1() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTest_LowerBound2() {
		return (EReference)referencesTestEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributesTest() {
		return attributesTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_ChangeableYes() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_ChangeableNo() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_DefaultValue() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_DerivedYes() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_DerivedNo() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_IdYes() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_IdNo() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_LowerBound0() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_LowerBound1() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_LowerBound2() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_LowerBoundN() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_UpperBound0() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_UpperBound1() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_UpperBound2() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_UpperBoundN() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_OrderedYes() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_OrderenedNo() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_TransientYes() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_TransientNo() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_UniqueYes() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_UniqueNo() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_UnsettableYes() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_UnsettableNo() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_VolatileYes() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesTest_VolatileNo() {
		return (EAttribute)attributesTestEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributesTest_Opposite2() {
		return (EReference)attributesTestEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationsTest() {
		return operationsTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperationsTest__Empty() {
		return operationsTestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperationsTest__LowerBound1() {
		return operationsTestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperationsTest__LowerBound2() {
		return operationsTestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperationsTest__OrderedNo() {
		return operationsTestEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperationsTest__UniqueNo() {
		return operationsTestEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperationsTest__UpperBound2() {
		return operationsTestEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperationsTest__UpperBoundN() {
		return operationsTestEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperationsTest__ManyParameters__AbstractTest_int() {
		return operationsTestEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericTest() {
		return genericTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericTest_GenericAttr() {
		return (EAttribute)genericTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenericTest__GenericOperationReturn() {
		return genericTestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenericTest__GenericOperationParameters() {
		return genericTestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenericTest__GenericOperationThrow() {
		return genericTestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericChildTest() {
		return genericChildTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnserializableEnumTest() {
		return unserializableEnumTestEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSerializableEnumTest() {
		return serializableEnumTestEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnserializableDatatypeTest() {
		return unserializableDatatypeTestEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSerializableDatatypeTest() {
		return serializableDatatypeTestEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCustomExceptionTest() {
		return customExceptionTestEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExhaustiveFactory getExhaustiveFactory() {
		return (ExhaustiveFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractTestEClass = createEClass(ABSTRACT_TEST);

		interfaceTestEClass = createEClass(INTERFACE_TEST);

		multipleSuperTestEClass = createEClass(MULTIPLE_SUPER_TEST);

		referencesTestEClass = createEClass(REFERENCES_TEST);
		createEReference(referencesTestEClass, REFERENCES_TEST__CHANGEABLE_YES);
		createEReference(referencesTestEClass, REFERENCES_TEST__CHANGEABLE_NO);
		createEReference(referencesTestEClass, REFERENCES_TEST__CONTAINMENT_YES);
		createEReference(referencesTestEClass, REFERENCES_TEST__REFERENCE_TO_GENERICS);
		createEReference(referencesTestEClass, REFERENCES_TEST__OPPOSITE1);
		createEReference(referencesTestEClass, REFERENCES_TEST__ORDERED_FALSE);
		createEReference(referencesTestEClass, REFERENCES_TEST__RESOLVE_PROXIES_FALSE);
		createEReference(referencesTestEClass, REFERENCES_TEST__TRANSIENT_TRUE);
		createEReference(referencesTestEClass, REFERENCES_TEST__UNIQUE_FALSE);
		createEReference(referencesTestEClass, REFERENCES_TEST__UNSETTABLE_TRUE);
		createEReference(referencesTestEClass, REFERENCES_TEST__VOLATILE_TRUE);
		createEReference(referencesTestEClass, REFERENCES_TEST__DERIVED_YES);
		createEReference(referencesTestEClass, REFERENCES_TEST__UPPER_BOUND_N);
		createEReference(referencesTestEClass, REFERENCES_TEST__UPPER_BOUND2);
		createEReference(referencesTestEClass, REFERENCES_TEST__LOWER_BOUND1);
		createEReference(referencesTestEClass, REFERENCES_TEST__LOWER_BOUND2);

		attributesTestEClass = createEClass(ATTRIBUTES_TEST);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__CHANGEABLE_YES);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__CHANGEABLE_NO);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__DEFAULT_VALUE);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__DERIVED_YES);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__DERIVED_NO);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__ID_YES);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__ID_NO);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__LOWER_BOUND0);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__LOWER_BOUND1);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__LOWER_BOUND2);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__LOWER_BOUND_N);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__UPPER_BOUND0);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__UPPER_BOUND1);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__UPPER_BOUND2);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__UPPER_BOUND_N);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__ORDERED_YES);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__ORDERENED_NO);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__TRANSIENT_YES);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__TRANSIENT_NO);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__UNIQUE_YES);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__UNIQUE_NO);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__UNSETTABLE_YES);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__UNSETTABLE_NO);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__VOLATILE_YES);
		createEAttribute(attributesTestEClass, ATTRIBUTES_TEST__VOLATILE_NO);
		createEReference(attributesTestEClass, ATTRIBUTES_TEST__OPPOSITE2);

		operationsTestEClass = createEClass(OPERATIONS_TEST);
		createEOperation(operationsTestEClass, OPERATIONS_TEST___EMPTY);
		createEOperation(operationsTestEClass, OPERATIONS_TEST___LOWER_BOUND1);
		createEOperation(operationsTestEClass, OPERATIONS_TEST___LOWER_BOUND2);
		createEOperation(operationsTestEClass, OPERATIONS_TEST___ORDERED_NO);
		createEOperation(operationsTestEClass, OPERATIONS_TEST___UNIQUE_NO);
		createEOperation(operationsTestEClass, OPERATIONS_TEST___UPPER_BOUND2);
		createEOperation(operationsTestEClass, OPERATIONS_TEST___UPPER_BOUND_N);
		createEOperation(operationsTestEClass, OPERATIONS_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT);

		genericTestEClass = createEClass(GENERIC_TEST);
		createEAttribute(genericTestEClass, GENERIC_TEST__GENERIC_ATTR);
		createEOperation(genericTestEClass, GENERIC_TEST___GENERIC_OPERATION_RETURN);
		createEOperation(genericTestEClass, GENERIC_TEST___GENERIC_OPERATION_PARAMETERS);
		createEOperation(genericTestEClass, GENERIC_TEST___GENERIC_OPERATION_THROW);

		genericChildTestEClass = createEClass(GENERIC_CHILD_TEST);

		// Create enums
		unserializableEnumTestEEnum = createEEnum(UNSERIALIZABLE_ENUM_TEST);
		serializableEnumTestEEnum = createEEnum(SERIALIZABLE_ENUM_TEST);

		// Create data types
		unserializableDatatypeTestEDataType = createEDataType(UNSERIALIZABLE_DATATYPE_TEST);
		serializableDatatypeTestEDataType = createEDataType(SERIALIZABLE_DATATYPE_TEST);
		customExceptionTestEDataType = createEDataType(CUSTOM_EXCEPTION_TEST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter genericTestEClass_A = addETypeParameter(genericTestEClass, "A");
		ETypeParameter genericTestEClass_B = addETypeParameter(genericTestEClass, "B");

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractTestEClass.getESuperTypes().add(this.getOperationsTest());
		interfaceTestEClass.getESuperTypes().add(this.getOperationsTest());
		multipleSuperTestEClass.getESuperTypes().add(this.getAbstractTest());
		multipleSuperTestEClass.getESuperTypes().add(this.getInterfaceTest());
		referencesTestEClass.getESuperTypes().add(this.getAbstractTest());
		attributesTestEClass.getESuperTypes().add(this.getMultipleSuperTest());
		attributesTestEClass.getESuperTypes().add(this.getInterfaceTest());
		EGenericType g1 = createEGenericType(this.getGenericTest());
		EGenericType g2 = createEGenericType(this.getAbstractTest());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getMultipleSuperTest());
		g1.getETypeArguments().add(g2);
		genericChildTestEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractTestEClass, AbstractTest.class, "AbstractTest", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceTestEClass, InterfaceTest.class, "InterfaceTest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleSuperTestEClass, MultipleSuperTest.class, "MultipleSuperTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referencesTestEClass, ReferencesTest.class, "ReferencesTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencesTest_ChangeableYes(), this.getAbstractTest(), null, "changeableYes", null, 0, 1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_ChangeableNo(), this.getAbstractTest(), null, "changeableNo", null, 0, 1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_ContainmentYes(), this.getMultipleSuperTest(), null, "containmentYes", null, 0, 1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getGenericTest());
		g2 = createEGenericType(this.getAbstractTest());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getOperationsTest());
		g1.getETypeArguments().add(g2);
		initEReference(getReferencesTest_ReferenceToGenerics(), g1, null, "referenceToGenerics", null, 0, 1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_Opposite1(), this.getAttributesTest(), this.getAttributesTest_Opposite2(), "opposite1", null, 0, 1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_OrderedFalse(), this.getAttributesTest(), null, "orderedFalse", null, 0, 1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferencesTest_ResolveProxiesFalse(), this.getAttributesTest(), null, "resolveProxiesFalse", null, 0, 1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_TransientTrue(), this.getAttributesTest(), null, "transientTrue", null, 0, 1, ReferencesTest.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_UniqueFalse(), this.getAttributesTest(), null, "uniqueFalse", null, 0, 1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_UnsettableTrue(), this.getAttributesTest(), null, "unsettableTrue", null, 0, 1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_VolatileTrue(), this.getAttributesTest(), null, "volatileTrue", null, 0, 1, ReferencesTest.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_DerivedYes(), this.getAttributesTest(), null, "derivedYes", null, 0, 1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_UpperBoundN(), this.getAttributesTest(), null, "upperBoundN", null, 0, -1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_UpperBound2(), this.getAttributesTest(), null, "upperBound2", null, 0, 2, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_LowerBound1(), this.getAttributesTest(), null, "lowerBound1", null, 1, 1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTest_LowerBound2(), this.getAttributesTest(), null, "lowerBound2", null, 2, -1, ReferencesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributesTestEClass, AttributesTest.class, "AttributesTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributesTest_ChangeableYes(), ecorePackage.getEDouble(), "changeableYes", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_ChangeableNo(), this.getSerializableEnumTest(), "changeableNo", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_DefaultValue(), this.getSerializableDatatypeTest(), "defaultValue", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_DerivedYes(), this.getSerializableDatatypeTest(), "derivedYes", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_DerivedNo(), this.getUnserializableEnumTest(), "derivedNo", "literal1", 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_IdYes(), ecorePackage.getEShort(), "idYes", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_IdNo(), ecorePackage.getEShort(), "idNo", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_LowerBound0(), ecorePackage.getEInt(), "lowerBound0", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_LowerBound1(), ecorePackage.getEIntegerObject(), "lowerBound1", null, 1, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_LowerBound2(), ecorePackage.getEShortObject(), "lowerBound2", null, 2, -1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_LowerBoundN(), this.getSerializableEnumTest(), "lowerBoundN", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_UpperBound0(), this.getSerializableDatatypeTest(), "upperBound0", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_UpperBound1(), ecorePackage.getEDate(), "upperBound1", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_UpperBound2(), ecorePackage.getEString(), "upperBound2", null, 0, 2, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_UpperBoundN(), ecorePackage.getELongObject(), "upperBoundN", null, 0, -1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_OrderedYes(), ecorePackage.getEIntegerObject(), "orderedYes", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getAttributesTest_OrderenedNo(), g1, "orderenedNo", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_TransientYes(), ecorePackage.getEDouble(), "transientYes", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_TransientNo(), ecorePackage.getELong(), "transientNo", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_UniqueYes(), this.getSerializableEnumTest(), "uniqueYes", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_UniqueNo(), this.getSerializableDatatypeTest(), "uniqueNo", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_UnsettableYes(), this.getSerializableDatatypeTest(), "unsettableYes", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_UnsettableNo(), this.getSerializableEnumTest(), "unsettableNo", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_VolatileYes(), this.getSerializableDatatypeTest(), "volatileYes", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributesTest_VolatileNo(), this.getUnserializableEnumTest(), "volatileNo", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributesTest_Opposite2(), this.getReferencesTest(), this.getReferencesTest_Opposite1(), "opposite2", null, 0, 1, AttributesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationsTestEClass, OperationsTest.class, "OperationsTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOperationsTest__Empty(), null, "empty", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperationsTest__LowerBound1(), ecorePackage.getEByte(), "lowerBound1", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperationsTest__LowerBound2(), this.getInterfaceTest(), "lowerBound2", 2, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperationsTest__OrderedNo(), null, "orderedNo", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOperationsTest__UniqueNo(), null, "uniqueNo", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperationsTest__UpperBound2(), this.getSerializableEnumTest(), "upperBound2", 0, 2, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperationsTest__UpperBoundN(), this.getUnserializableDatatypeTest(), "upperBoundN", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getOperationsTest__ManyParameters__AbstractTest_int(), null, "manyParameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractTest(), "p1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "p2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genericTestEClass, GenericTest.class, "GenericTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(genericTestEClass_A);
		initEAttribute(getGenericTest_GenericAttr(), g1, "genericAttr", null, 0, 1, GenericTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGenericTest__GenericOperationReturn(), null, "genericOperationReturn", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(genericTestEClass_B);
		initEOperation(op, g1);

		op = initEOperation(getGenericTest__GenericOperationParameters(), null, "genericOperationParameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "C");
		g1 = createEGenericType(this.getAbstractTest());
		t1.getEBounds().add(g1);

		op = initEOperation(getGenericTest__GenericOperationThrow(), null, "genericOperationThrow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getCustomExceptionTest());

		initEClass(genericChildTestEClass, GenericChildTest.class, "GenericChildTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(unserializableEnumTestEEnum, UnserializableEnumTest.class, "UnserializableEnumTest");
		addEEnumLiteral(unserializableEnumTestEEnum, UnserializableEnumTest.NAME1);
		addEEnumLiteral(unserializableEnumTestEEnum, UnserializableEnumTest.NAME2);

		initEEnum(serializableEnumTestEEnum, SerializableEnumTest.class, "SerializableEnumTest");
		addEEnumLiteral(serializableEnumTestEEnum, SerializableEnumTest.NAME3);
		addEEnumLiteral(serializableEnumTestEEnum, SerializableEnumTest.NAME4);

		// Initialize data types
		initEDataType(unserializableDatatypeTestEDataType, Integer.class, "UnserializableDatatypeTest", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serializableDatatypeTestEDataType, String.class, "SerializableDatatypeTest", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(customExceptionTestEDataType, Exception.class, "CustomExceptionTest", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExhaustivePackageImpl
