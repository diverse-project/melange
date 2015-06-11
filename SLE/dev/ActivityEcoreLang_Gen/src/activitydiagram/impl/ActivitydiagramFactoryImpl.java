/**
 */
package activitydiagram.impl;

import activitydiagram.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Context;
import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Offer;
import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitydiagramFactoryImpl extends EFactoryImpl implements ActivitydiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivitydiagramFactory init() {
		try {
			ActivitydiagramFactory theActivitydiagramFactory = (ActivitydiagramFactory)EPackage.Registry.INSTANCE.getEFactory(ActivitydiagramPackage.eNS_URI);
			if (theActivitydiagramFactory != null) {
				return theActivitydiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivitydiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramFactoryImpl() {
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
			case ActivitydiagramPackage.OPAQUE_ACTION: return createOpaqueAction();
			case ActivitydiagramPackage.ACTIVITY: return createActivity();
			case ActivitydiagramPackage.INPUT_VALUE: return createInputValue();
			case ActivitydiagramPackage.EATTRIBUTE: return createEAttribute();
			case ActivitydiagramPackage.EANNOTATION: return createEAnnotation();
			case ActivitydiagramPackage.ECLASS: return createEClass();
			case ActivitydiagramPackage.EDATA_TYPE: return createEDataType();
			case ActivitydiagramPackage.EENUM: return createEEnum();
			case ActivitydiagramPackage.EENUM_LITERAL: return createEEnumLiteral();
			case ActivitydiagramPackage.EFACTORY: return createEFactory();
			case ActivitydiagramPackage.EOBJECT: return createEObject();
			case ActivitydiagramPackage.EOPERATION: return createEOperation();
			case ActivitydiagramPackage.EPACKAGE: return createEPackage();
			case ActivitydiagramPackage.EPARAMETER: return createEParameter();
			case ActivitydiagramPackage.EREFERENCE: return createEReference();
			case ActivitydiagramPackage.ESTRING_TO_STRING_MAP_ENTRY: return (EObject)createEStringToStringMapEntry();
			case ActivitydiagramPackage.EGENERIC_TYPE: return createEGenericType();
			case ActivitydiagramPackage.ETYPE_PARAMETER: return createETypeParameter();
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
			case ActivitydiagramPackage.CONTEXT:
				return createContextFromString(eDataType, initialValue);
			case ActivitydiagramPackage.OFFER:
				return createOfferFromString(eDataType, initialValue);
			case ActivitydiagramPackage.TOKEN:
				return createTokenFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBIG_DECIMAL:
				return createEBigDecimalFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBIG_INTEGER:
				return createEBigIntegerFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBOOLEAN:
				return createEBooleanFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBOOLEAN_OBJECT:
				return createEBooleanObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBYTE:
				return createEByteFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBYTE_ARRAY:
				return createEByteArrayFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBYTE_OBJECT:
				return createEByteObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ECHAR:
				return createECharFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ECHARACTER_OBJECT:
				return createECharacterObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EDATE:
				return createEDateFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EDOUBLE:
				return createEDoubleFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EDOUBLE_OBJECT:
				return createEDoubleObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EFLOAT:
				return createEFloatFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EFLOAT_OBJECT:
				return createEFloatObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EINT:
				return createEIntFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EINTEGER_OBJECT:
				return createEIntegerObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EJAVA_CLASS:
				return createEJavaClassFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EJAVA_OBJECT:
				return createEJavaObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ELONG:
				return createELongFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ELONG_OBJECT:
				return createELongObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ESHORT:
				return createEShortFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ESHORT_OBJECT:
				return createEShortObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ESTRING:
				return createEStringFromString(eDataType, initialValue);
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
			case ActivitydiagramPackage.CONTEXT:
				return convertContextToString(eDataType, instanceValue);
			case ActivitydiagramPackage.OFFER:
				return convertOfferToString(eDataType, instanceValue);
			case ActivitydiagramPackage.TOKEN:
				return convertTokenToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBIG_DECIMAL:
				return convertEBigDecimalToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBIG_INTEGER:
				return convertEBigIntegerToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBOOLEAN:
				return convertEBooleanToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBOOLEAN_OBJECT:
				return convertEBooleanObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBYTE:
				return convertEByteToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBYTE_ARRAY:
				return convertEByteArrayToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBYTE_OBJECT:
				return convertEByteObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ECHAR:
				return convertECharToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ECHARACTER_OBJECT:
				return convertECharacterObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EDATE:
				return convertEDateToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EDOUBLE:
				return convertEDoubleToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EDOUBLE_OBJECT:
				return convertEDoubleObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EFLOAT:
				return convertEFloatToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EFLOAT_OBJECT:
				return convertEFloatObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EINT:
				return convertEIntToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EINTEGER_OBJECT:
				return convertEIntegerObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EJAVA_CLASS:
				return convertEJavaClassToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EJAVA_OBJECT:
				return convertEJavaObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ELONG:
				return convertELongToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ELONG_OBJECT:
				return convertELongObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ESHORT:
				return convertEShortToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ESHORT_OBJECT:
				return convertEShortObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ESTRING:
				return convertEStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction createOpaqueAction() {
		OpaqueActionImpl opaqueAction = new OpaqueActionImpl();
		return opaqueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValue createInputValue() {
		InputValueImpl inputValue = new InputValueImpl();
		return inputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute createEAttribute() {
		EAttributeImpl eAttribute = new EAttributeImpl();
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createEAnnotation() {
		EAnnotationImpl eAnnotation = new EAnnotationImpl();
		return eAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activitydiagram.EClass createEClass() {
		EClassImpl eClass = new EClassImpl();
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activitydiagram.EDataType createEDataType() {
		EDataTypeImpl eDataType = new EDataTypeImpl();
		return eDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum createEEnum() {
		EEnumImpl eEnum = new EEnumImpl();
		return eEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral createEEnumLiteral() {
		EEnumLiteralImpl eEnumLiteral = new EEnumLiteralImpl();
		return eEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFactory createEFactory() {
		activitydiagram.impl.EFactoryImpl eFactory = new activitydiagram.impl.EFactoryImpl();
		return eFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activitydiagram.EObject createEObject() {
		EObjectImpl eObject = new EObjectImpl();
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation createEOperation() {
		EOperationImpl eOperation = new EOperationImpl();
		return eOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activitydiagram.EPackage createEPackage() {
		EPackageImpl ePackage = new EPackageImpl();
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParameter createEParameter() {
		EParameterImpl eParameter = new EParameterImpl();
		return eParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference createEReference() {
		EReferenceImpl eReference = new EReferenceImpl();
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createEStringToStringMapEntry() {
		EStringToStringMapEntryImpl eStringToStringMapEntry = new EStringToStringMapEntryImpl();
		return eStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType createEGenericType() {
		EGenericTypeImpl eGenericType = new EGenericTypeImpl();
		return eGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter createETypeParameter() {
		ETypeParameterImpl eTypeParameter = new ETypeParameterImpl();
		return eTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContextFromString(EDataType eDataType, String initialValue) {
		return (Context)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer createOfferFromString(EDataType eDataType, String initialValue) {
		return (Offer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOfferToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createTokenFromString(EDataType eDataType, String initialValue) {
		return (Token)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTokenToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createEBigDecimalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBigDecimalToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createEBigIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBigIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createEBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createEBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createEBooleanFromString(ActivitydiagramPackage.Literals.EBOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEBooleanToString(ActivitydiagramPackage.Literals.EBOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createEByteFromString(EDataType eDataType, String initialValue) {
		return (Byte)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BYTE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BYTE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createEByteArrayFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.HEX_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteArrayToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.HEX_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createEByteObjectFromString(EDataType eDataType, String initialValue) {
		return createEByteFromString(ActivitydiagramPackage.Literals.EBYTE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEByteToString(ActivitydiagramPackage.Literals.EBYTE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createECharFromString(EDataType eDataType, String initialValue) {
		return (Character)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECharToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createECharacterObjectFromString(EDataType eDataType, String initialValue) {
		return createECharFromString(ActivitydiagramPackage.Literals.ECHAR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECharacterObjectToString(EDataType eDataType, Object instanceValue) {
		return convertECharToString(ActivitydiagramPackage.Literals.ECHAR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createEDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createEDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDoubleToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createEDoubleObjectFromString(EDataType eDataType, String initialValue) {
		return createEDoubleFromString(ActivitydiagramPackage.Literals.EDOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDoubleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEDoubleToString(ActivitydiagramPackage.Literals.EDOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createEFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFloatToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createEFloatObjectFromString(EDataType eDataType, String initialValue) {
		return createEFloatFromString(ActivitydiagramPackage.Literals.EFLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFloatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEFloatToString(ActivitydiagramPackage.Literals.EFLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createEIntFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createEIntegerObjectFromString(EDataType eDataType, String initialValue) {
		return createEIntFromString(ActivitydiagramPackage.Literals.EINT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntegerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEIntToString(ActivitydiagramPackage.Literals.EINT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> createEJavaClassFromString(EDataType eDataType, String initialValue) {
		return (Class<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEJavaClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEJavaObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEJavaObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createELongFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELongToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createELongObjectFromString(EDataType eDataType, String initialValue) {
		return createELongFromString(ActivitydiagramPackage.Literals.ELONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELongObjectToString(EDataType eDataType, Object instanceValue) {
		return convertELongToString(ActivitydiagramPackage.Literals.ELONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createEShortFromString(EDataType eDataType, String initialValue) {
		return (Short)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.SHORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEShortToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.SHORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createEShortObjectFromString(EDataType eDataType, String initialValue) {
		return createEShortFromString(ActivitydiagramPackage.Literals.ESHORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEShortObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEShortToString(ActivitydiagramPackage.Literals.ESHORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramPackage getActivitydiagramPackage() {
		return (ActivitydiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivitydiagramPackage getPackage() {
		return ActivitydiagramPackage.eINSTANCE;
	}

} //ActivitydiagramFactoryImpl
