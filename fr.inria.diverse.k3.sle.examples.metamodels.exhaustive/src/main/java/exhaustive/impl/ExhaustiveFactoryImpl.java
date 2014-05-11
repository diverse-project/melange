/**
 */
package exhaustive.impl;

import exhaustive.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExhaustiveFactoryImpl extends EFactoryImpl implements ExhaustiveFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExhaustiveFactory init() {
		try {
			ExhaustiveFactory theExhaustiveFactory = (ExhaustiveFactory)EPackage.Registry.INSTANCE.getEFactory(ExhaustivePackage.eNS_URI);
			if (theExhaustiveFactory != null) {
				return theExhaustiveFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExhaustiveFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExhaustiveFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExhaustivePackage.MULTIPLE_SUPER_TEST: return createMultipleSuperTest();
			case ExhaustivePackage.REFERENCES_TEST: return createReferencesTest();
			case ExhaustivePackage.ATTRIBUTES_TEST: return createAttributesTest();
			case ExhaustivePackage.OPERATIONS_TEST: return createOperationsTest();
			case ExhaustivePackage.GENERIC_TEST: return createGenericTest();
			case ExhaustivePackage.GENERIC_CHILD_TEST: return createGenericChildTest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExhaustivePackage.UNSERIALIZABLE_ENUM_TEST:
				return createUnserializableEnumTestFromString(eDataType, initialValue);
			case ExhaustivePackage.SERIALIZABLE_ENUM_TEST:
				return createSerializableEnumTestFromString(eDataType, initialValue);
			case ExhaustivePackage.SERIALIZABLE_DATATYPE_TEST:
				return createSerializableDatatypeTestFromString(eDataType, initialValue);
			case ExhaustivePackage.CUSTOM_EXCEPTION_TEST:
				return createCustomExceptionTestFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExhaustivePackage.UNSERIALIZABLE_ENUM_TEST:
				return convertUnserializableEnumTestToString(eDataType, instanceValue);
			case ExhaustivePackage.SERIALIZABLE_ENUM_TEST:
				return convertSerializableEnumTestToString(eDataType, instanceValue);
			case ExhaustivePackage.SERIALIZABLE_DATATYPE_TEST:
				return convertSerializableDatatypeTestToString(eDataType, instanceValue);
			case ExhaustivePackage.CUSTOM_EXCEPTION_TEST:
				return convertCustomExceptionTestToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSuperTest createMultipleSuperTest() {
		MultipleSuperTestImpl multipleSuperTest = new MultipleSuperTestImpl();
		return multipleSuperTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesTest createReferencesTest() {
		ReferencesTestImpl referencesTest = new ReferencesTestImpl();
		return referencesTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest createAttributesTest() {
		AttributesTestImpl attributesTest = new AttributesTestImpl();
		return attributesTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsTest createOperationsTest() {
		OperationsTestImpl operationsTest = new OperationsTestImpl();
		return operationsTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <A, B> GenericTest<A, B> createGenericTest() {
		GenericTestImpl<A, B> genericTest = new GenericTestImpl<A, B>();
		return genericTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericChildTest createGenericChildTest() {
		GenericChildTestImpl genericChildTest = new GenericChildTestImpl();
		return genericChildTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnserializableEnumTest createUnserializableEnumTestFromString(EDataType eDataType, String initialValue) {
		UnserializableEnumTest result = UnserializableEnumTest.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnserializableEnumTestToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializableEnumTest createSerializableEnumTestFromString(EDataType eDataType, String initialValue) {
		SerializableEnumTest result = SerializableEnumTest.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSerializableEnumTestToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSerializableDatatypeTestFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSerializableDatatypeTestToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createCustomExceptionTestFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomExceptionTestToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExhaustivePackage getExhaustivePackage() {
		return (ExhaustivePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExhaustivePackage getPackage() {
		return ExhaustivePackage.eINSTANCE;
	}

} //ExhaustiveFactoryImpl
