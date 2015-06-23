/**
 */
package activitydiagram.util;

import activitydiagram.*;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see activitydiagram.EcorePackage
 * @generated
 */
public class EcoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EcoreValidator INSTANCE = new EcoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "activitydiagram";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EcorePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EcorePackage.EATTRIBUTE:
				return validateEAttribute((EAttribute)value, diagnostics, context);
			case EcorePackage.EANNOTATION:
				return validateEAnnotation((EAnnotation)value, diagnostics, context);
			case EcorePackage.ECLASS:
				return validateEClass((EClass)value, diagnostics, context);
			case EcorePackage.ECLASSIFIER:
				return validateEClassifier((EClassifier)value, diagnostics, context);
			case EcorePackage.EDATA_TYPE:
				return validateEDataType((EDataType)value, diagnostics, context);
			case EcorePackage.EENUM:
				return validateEEnum((EEnum)value, diagnostics, context);
			case EcorePackage.EENUM_LITERAL:
				return validateEEnumLiteral((EEnumLiteral)value, diagnostics, context);
			case EcorePackage.EFACTORY:
				return validateEFactory((EFactory)value, diagnostics, context);
			case EcorePackage.EMODEL_ELEMENT:
				return validateEModelElement((EModelElement)value, diagnostics, context);
			case EcorePackage.ENAMED_ELEMENT:
				return validateENamedElement((ENamedElement)value, diagnostics, context);
			case EcorePackage.EOBJECT:
				return validateEObject((EObject)value, diagnostics, context);
			case EcorePackage.EOPERATION:
				return validateEOperation((EOperation)value, diagnostics, context);
			case EcorePackage.EPACKAGE:
				return validateEPackage((activitydiagram.EPackage)value, diagnostics, context);
			case EcorePackage.EPARAMETER:
				return validateEParameter((EParameter)value, diagnostics, context);
			case EcorePackage.EREFERENCE:
				return validateEReference((EReference)value, diagnostics, context);
			case EcorePackage.ESTRUCTURAL_FEATURE:
				return validateEStructuralFeature((EStructuralFeature)value, diagnostics, context);
			case EcorePackage.ETYPED_ELEMENT:
				return validateETypedElement((ETypedElement)value, diagnostics, context);
			case EcorePackage.ESTRING_TO_STRING_MAP_ENTRY:
				return validateEStringToStringMapEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case EcorePackage.EGENERIC_TYPE:
				return validateEGenericType((EGenericType)value, diagnostics, context);
			case EcorePackage.ETYPE_PARAMETER:
				return validateETypeParameter((ETypeParameter)value, diagnostics, context);
			case EcorePackage.EBIG_DECIMAL:
				return validateEBigDecimal((BigDecimal)value, diagnostics, context);
			case EcorePackage.EBIG_INTEGER:
				return validateEBigInteger((BigInteger)value, diagnostics, context);
			case EcorePackage.EBOOLEAN:
				return validateEBoolean((Boolean)value, diagnostics, context);
			case EcorePackage.EBOOLEAN_OBJECT:
				return validateEBooleanObject((Boolean)value, diagnostics, context);
			case EcorePackage.EBYTE:
				return validateEByte((Byte)value, diagnostics, context);
			case EcorePackage.EBYTE_ARRAY:
				return validateEByteArray((byte[])value, diagnostics, context);
			case EcorePackage.EBYTE_OBJECT:
				return validateEByteObject((Byte)value, diagnostics, context);
			case EcorePackage.ECHAR:
				return validateEChar((Character)value, diagnostics, context);
			case EcorePackage.ECHARACTER_OBJECT:
				return validateECharacterObject((Character)value, diagnostics, context);
			case EcorePackage.EDATE:
				return validateEDate((Date)value, diagnostics, context);
			case EcorePackage.EDIAGNOSTIC_CHAIN:
				return validateEDiagnosticChain((DiagnosticChain)value, diagnostics, context);
			case EcorePackage.EDOUBLE:
				return validateEDouble((Double)value, diagnostics, context);
			case EcorePackage.EDOUBLE_OBJECT:
				return validateEDoubleObject((Double)value, diagnostics, context);
			case EcorePackage.EE_LIST:
				return validateEEList((EList<?>)value, diagnostics, context);
			case EcorePackage.EENUMERATOR:
				return validateEEnumerator((Enumerator)value, diagnostics, context);
			case EcorePackage.EFEATURE_MAP:
				return validateEFeatureMap((FeatureMap)value, diagnostics, context);
			case EcorePackage.EFEATURE_MAP_ENTRY:
				return validateEFeatureMapEntry((FeatureMap.Entry)value, diagnostics, context);
			case EcorePackage.EFLOAT:
				return validateEFloat((Float)value, diagnostics, context);
			case EcorePackage.EFLOAT_OBJECT:
				return validateEFloatObject((Float)value, diagnostics, context);
			case EcorePackage.EINT:
				return validateEInt((Integer)value, diagnostics, context);
			case EcorePackage.EINTEGER_OBJECT:
				return validateEIntegerObject((Integer)value, diagnostics, context);
			case EcorePackage.EJAVA_CLASS:
				return validateEJavaClass((Class<?>)value, diagnostics, context);
			case EcorePackage.EJAVA_OBJECT:
				return validateEJavaObject(value, diagnostics, context);
			case EcorePackage.ELONG:
				return validateELong((Long)value, diagnostics, context);
			case EcorePackage.ELONG_OBJECT:
				return validateELongObject((Long)value, diagnostics, context);
			case EcorePackage.EMAP:
				return validateEMap((Map<?, ?>)value, diagnostics, context);
			case EcorePackage.ERESOURCE:
				return validateEResource((Resource)value, diagnostics, context);
			case EcorePackage.ERESOURCE_SET:
				return validateEResourceSet((ResourceSet)value, diagnostics, context);
			case EcorePackage.ESHORT:
				return validateEShort((Short)value, diagnostics, context);
			case EcorePackage.ESHORT_OBJECT:
				return validateEShortObject((Short)value, diagnostics, context);
			case EcorePackage.ESTRING:
				return validateEString((String)value, diagnostics, context);
			case EcorePackage.ETREE_ITERATOR:
				return validateETreeIterator((TreeIterator<?>)value, diagnostics, context);
			case EcorePackage.EINVOCATION_TARGET_EXCEPTION:
				return validateEInvocationTargetException((InvocationTargetException)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAttribute(EAttribute eAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEStructuralFeature_ValidDefaultValueLiteral(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEAttribute_ConsistentTransient(eAttribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConsistentTransient constraint of '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAttribute_ConsistentTransient(EAttribute eAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentTransient", getObjectLabel(eAttribute, context) },
						 new Object[] { eAttribute },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAnnotation(EAnnotation eAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eAnnotation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEAnnotation_WellFormedSourceURI(eAnnotation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormedSourceURI constraint of '<em>EAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAnnotation_WellFormedSourceURI(EAnnotation eAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedSourceURI", getObjectLabel(eAnnotation, context) },
						 new Object[] { eAnnotation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_WellFormedInstanceTypeName(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_UniqueTypeParameterNames(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_InterfaceIsAbstract(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_AtMostOneID(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_UniqueFeatureNames(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_UniqueOperationSignatures(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_NoCircularSuperTypes(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_WellFormedMapEntryClass(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_ConsistentSuperTypes(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_DisjointFeatureAndOperationSignatures(eClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InterfaceIsAbstract constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_InterfaceIsAbstract(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "InterfaceIsAbstract", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AtMostOneID constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_AtMostOneID(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AtMostOneID", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueFeatureNames constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_UniqueFeatureNames(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueFeatureNames", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueOperationSignatures constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_UniqueOperationSignatures(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueOperationSignatures", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NoCircularSuperTypes constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_NoCircularSuperTypes(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NoCircularSuperTypes", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WellFormedMapEntryClass constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_WellFormedMapEntryClass(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedMapEntryClass", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentSuperTypes constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_ConsistentSuperTypes(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentSuperTypes", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DisjointFeatureAndOperationSignatures constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_DisjointFeatureAndOperationSignatures(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "DisjointFeatureAndOperationSignatures", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClassifier(EClassifier eClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eClassifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_WellFormedInstanceTypeName(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_UniqueTypeParameterNames(eClassifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormedInstanceTypeName constraint of '<em>EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClassifier_WellFormedInstanceTypeName(EClassifier eClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedInstanceTypeName", getObjectLabel(eClassifier, context) },
						 new Object[] { eClassifier },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueTypeParameterNames constraint of '<em>EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClassifier_UniqueTypeParameterNames(EClassifier eClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueTypeParameterNames", getObjectLabel(eClassifier, context) },
						 new Object[] { eClassifier },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDataType(EDataType eDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eDataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_WellFormedInstanceTypeName(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_UniqueTypeParameterNames(eDataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEnum(EEnum eEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eEnum, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_WellFormedInstanceTypeName(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_UniqueTypeParameterNames(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateEEnum_UniqueEnumeratorNames(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateEEnum_UniqueEnumeratorLiterals(eEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueEnumeratorNames constraint of '<em>EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEnum_UniqueEnumeratorNames(EEnum eEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueEnumeratorNames", getObjectLabel(eEnum, context) },
						 new Object[] { eEnum },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueEnumeratorLiterals constraint of '<em>EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEnum_UniqueEnumeratorLiterals(EEnum eEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueEnumeratorLiterals", getObjectLabel(eEnum, context) },
						 new Object[] { eEnum },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEnumLiteral(EEnumLiteral eEnumLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eEnumLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eEnumLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFactory(EFactory eFactory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFactory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEModelElement(EModelElement eModelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eModelElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENamedElement(ENamedElement eNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eNamedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eNamedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormedName constraint of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENamedElement_WellFormedName(ENamedElement eNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedName", getObjectLabel(eNamedElement, context) },
						 new Object[] { eNamedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEObject(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOperation(EOperation eOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEOperation_UniqueParameterNames(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEOperation_UniqueTypeParameterNames(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEOperation_NoRepeatingVoid(eOperation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueParameterNames constraint of '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOperation_UniqueParameterNames(EOperation eOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueParameterNames", getObjectLabel(eOperation, context) },
						 new Object[] { eOperation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueTypeParameterNames constraint of '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOperation_UniqueTypeParameterNames(EOperation eOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueTypeParameterNames", getObjectLabel(eOperation, context) },
						 new Object[] { eOperation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NoRepeatingVoid constraint of '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOperation_NoRepeatingVoid(EOperation eOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NoRepeatingVoid", getObjectLabel(eOperation, context) },
						 new Object[] { eOperation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPackage(activitydiagram.EPackage ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ePackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_WellFormedNsURI(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_WellFormedNsPrefix(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_UniqueSubpackageNames(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_UniqueClassifierNames(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_UniqueNsURIs(ePackage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormedNsURI constraint of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPackage_WellFormedNsURI(activitydiagram.EPackage ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedNsURI", getObjectLabel(ePackage, context) },
						 new Object[] { ePackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WellFormedNsPrefix constraint of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPackage_WellFormedNsPrefix(activitydiagram.EPackage ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedNsPrefix", getObjectLabel(ePackage, context) },
						 new Object[] { ePackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueSubpackageNames constraint of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPackage_UniqueSubpackageNames(activitydiagram.EPackage ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueSubpackageNames", getObjectLabel(ePackage, context) },
						 new Object[] { ePackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueClassifierNames constraint of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPackage_UniqueClassifierNames(activitydiagram.EPackage ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueClassifierNames", getObjectLabel(ePackage, context) },
						 new Object[] { ePackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueNsURIs constraint of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPackage_UniqueNsURIs(activitydiagram.EPackage ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueNsURIs", getObjectLabel(ePackage, context) },
						 new Object[] { ePackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEParameter(EParameter eParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(eParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEReference(EReference eReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEStructuralFeature_ValidDefaultValueLiteral(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_ConsistentOpposite(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_SingleContainer(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_ConsistentKeys(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_ConsistentUnique(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_ConsistentContainer(eReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConsistentOpposite constraint of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEReference_ConsistentOpposite(EReference eReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentOpposite", getObjectLabel(eReference, context) },
						 new Object[] { eReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SingleContainer constraint of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEReference_SingleContainer(EReference eReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SingleContainer", getObjectLabel(eReference, context) },
						 new Object[] { eReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentKeys constraint of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEReference_ConsistentKeys(EReference eReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentKeys", getObjectLabel(eReference, context) },
						 new Object[] { eReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentUnique constraint of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEReference_ConsistentUnique(EReference eReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentUnique", getObjectLabel(eReference, context) },
						 new Object[] { eReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentContainer constraint of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEReference_ConsistentContainer(EReference eReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentContainer", getObjectLabel(eReference, context) },
						 new Object[] { eReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEStructuralFeature(EStructuralFeature eStructuralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eStructuralFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateEStructuralFeature_ValidDefaultValueLiteral(eStructuralFeature, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidDefaultValueLiteral constraint of '<em>EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEStructuralFeature_ValidDefaultValueLiteral(EStructuralFeature eStructuralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidDefaultValueLiteral", getObjectLabel(eStructuralFeature, context) },
						 new Object[] { eStructuralFeature },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETypedElement(ETypedElement eTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eTypedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(eTypedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidLowerBound constraint of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETypedElement_ValidLowerBound(ETypedElement eTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidLowerBound", getObjectLabel(eTypedElement, context) },
						 new Object[] { eTypedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidUpperBound constraint of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETypedElement_ValidUpperBound(ETypedElement eTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidUpperBound", getObjectLabel(eTypedElement, context) },
						 new Object[] { eTypedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentBounds constraint of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETypedElement_ConsistentBounds(ETypedElement eTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentBounds", getObjectLabel(eTypedElement, context) },
						 new Object[] { eTypedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidType constraint of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETypedElement_ValidType(ETypedElement eTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidType", getObjectLabel(eTypedElement, context) },
						 new Object[] { eTypedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEStringToStringMapEntry(Map.Entry<?, ?> eStringToStringMapEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((org.eclipse.emf.ecore.EObject)eStringToStringMapEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGenericType(EGenericType eGenericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eGenericType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEGenericType_ConsistentType(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEGenericType_ConsistentBounds(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEGenericType_ConsistentArguments(eGenericType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConsistentType constraint of '<em>EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGenericType_ConsistentType(EGenericType eGenericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentType", getObjectLabel(eGenericType, context) },
						 new Object[] { eGenericType },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentBounds constraint of '<em>EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGenericType_ConsistentBounds(EGenericType eGenericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentBounds", getObjectLabel(eGenericType, context) },
						 new Object[] { eGenericType },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentArguments constraint of '<em>EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGenericType_ConsistentArguments(EGenericType eGenericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentArguments", getObjectLabel(eGenericType, context) },
						 new Object[] { eGenericType },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETypeParameter(ETypeParameter eTypeParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eTypeParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eTypeParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBigDecimal(BigDecimal eBigDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBigInteger(BigInteger eBigInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBoolean(boolean eBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBooleanObject(Boolean eBooleanObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEByte(byte eByte, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEByteArray(byte[] eByteArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEByteObject(Byte eByteObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEChar(char eChar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateECharacterObject(Character eCharacterObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDate(Date eDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDiagnosticChain(DiagnosticChain eDiagnosticChain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDouble(double eDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDoubleObject(Double eDoubleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEList(EList<?> eeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEnumerator(Enumerator eEnumerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMap(FeatureMap eFeatureMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry(FeatureMap.Entry eFeatureMapEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFloat(float eFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFloatObject(Float eFloatObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEInt(int eInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEIntegerObject(Integer eIntegerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEJavaClass(Class<?> eJavaClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEJavaObject(Object eJavaObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateELong(long eLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateELongObject(Long eLongObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMap(Map<?, ?> eMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEResource(Resource eResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEResourceSet(ResourceSet eResourceSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEShort(short eShort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEShortObject(Short eShortObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEString(String eString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETreeIterator(TreeIterator<?> eTreeIterator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEInvocationTargetException(InvocationTargetException eInvocationTargetException, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EcoreValidator
