/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ActivitydiagramPackage;

import activitydiagram.util.ActivitydiagramValidator;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitydiagramPackageImpl extends EPackageImpl implements ActivitydiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "activitydiagram.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStatement_ReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStatement_BreakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_BlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_WhileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_RepeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_If_Then_ElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_If_Then_Else_ElseIfPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_For_NumericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_For_GenericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_GlobalFunction_DeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_LocalFunction_DeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_Local_Variable_DeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_FunctioncallOrAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_NilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_TrueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_FalseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_NumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_VarArgsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_StringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_FunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_TableConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functioncall_ArgumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass field_AddEntryToTable_BracketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass field_AddEntryToTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass field_AppendEntryToTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStatement_ReturnWithValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_AssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_CallMemberFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_CallFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_OrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_AndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_LargerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_Larger_EqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_SmallerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_Smaller_EqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_EqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_Not_EqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_ConcatenationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_PlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_MinusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_MultiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_DivisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_ModuloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_NegateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_LengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_InvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_ExponentiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_CallMemberFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_CallFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_AccessArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_AccessMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_VariableNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType offerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tokenEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType environmentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBigDecimalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBigIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBooleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBooleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCharEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCharacterObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDiagnosticChainEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDoubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDoubleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eeListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eEnumeratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFeatureMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFeatureMapEntryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFloatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eIntegerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eJavaClassEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eJavaObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eLongEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eLongObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eResourceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eResourceSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eShortEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eShortObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eTreeIteratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eInvocationTargetExceptionEDataType = null;

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
	 * @see activitydiagram.ActivitydiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivitydiagramPackageImpl() {
		super(eNS_URI, ActivitydiagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActivitydiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ActivitydiagramPackage init() {
		if (isInited) return (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);

		// Obtain or create and register package
		ActivitydiagramPackageImpl theActivitydiagramPackage = (ActivitydiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivitydiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivitydiagramPackageImpl());

		isInited = true;

		// Load packages
		theActivitydiagramPackage.loadPackage();

		// Fix loaded packages
		theActivitydiagramPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theActivitydiagramPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ActivitydiagramValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theActivitydiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivitydiagramPackage.eNS_URI, theActivitydiagramPackage);
		return theActivitydiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueAction() {
		if (opaqueActionEClass == null) {
			opaqueActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(0);
		}
		return opaqueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_Expressions() {
        return (EReference)getOpaqueAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		if (actionEClass == null) {
			actionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(1);
		}
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNode() {
		if (executableNodeEClass == null) {
			executableNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(2);
		}
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode() {
		if (activityNodeEClass == null) {
			activityNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(3);
		}
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Outgoing() {
        return (EReference)getActivityNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Incoming() {
        return (EReference)getActivityNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Activity() {
        return (EReference)getActivityNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_Running() {
        return (EAttribute)getActivityNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		if (namedElementEClass == null) {
			namedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(4);
		}
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge() {
		if (activityEdgeEClass == null) {
			activityEdgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(6);
		}
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Source() {
        return (EReference)getActivityEdge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Target() {
        return (EReference)getActivityEdge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityEdge_Offers() {
        return (EAttribute)getActivityEdge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		if (activityEClass == null) {
			activityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(9);
		}
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Nodes() {
        return (EReference)getActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Edges() {
        return (EReference)getActivity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Locals() {
        return (EReference)getActivity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Inputs() {
        return (EReference)getActivity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		if (variableEClass == null) {
			variableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(10);
		}
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_InitialValue() {
        return (EReference)getVariable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
        return (EAttribute)getVariable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_CurrentValue() {
        return (EReference)getVariable().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		if (valueEClass == null) {
			valueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(11);
		}
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputValue() {
		if (inputValueEClass == null) {
			inputValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(12);
		}
		return inputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_Value() {
        return (EReference)getInputValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_Variable() {
        return (EReference)getInputValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunk() {
		if (chunkEClass == null) {
			chunkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(13);
		}
		return chunkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		if (blockEClass == null) {
			blockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(15);
		}
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Statements() {
        return (EReference)getBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_ReturnValue() {
        return (EReference)getBlock().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStatement() {
		if (lastStatementEClass == null) {
			lastStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(16);
		}
		return lastStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStatement_Return() {
		if (lastStatement_ReturnEClass == null) {
			lastStatement_ReturnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(17);
		}
		return lastStatement_ReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStatement_Break() {
		if (lastStatement_BreakEClass == null) {
			lastStatement_BreakEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(18);
		}
		return lastStatement_BreakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		if (statementEClass == null) {
			statementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(19);
		}
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_Block() {
		if (statement_BlockEClass == null) {
			statement_BlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(20);
		}
		return statement_BlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Block_Block() {
        return (EReference)getStatement_Block().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_While() {
		if (statement_WhileEClass == null) {
			statement_WhileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(21);
		}
		return statement_WhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_While_Expression() {
        return (EReference)getStatement_While().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_While_Block() {
        return (EReference)getStatement_While().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_Repeat() {
		if (statement_RepeatEClass == null) {
			statement_RepeatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(22);
		}
		return statement_RepeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Repeat_Block() {
        return (EReference)getStatement_Repeat().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Repeat_Expression() {
        return (EReference)getStatement_Repeat().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_If_Then_Else() {
		if (statement_If_Then_ElseEClass == null) {
			statement_If_Then_ElseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(23);
		}
		return statement_If_Then_ElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_IfExpression() {
        return (EReference)getStatement_If_Then_Else().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_IfBlock() {
        return (EReference)getStatement_If_Then_Else().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_ElseIf() {
        return (EReference)getStatement_If_Then_Else().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_ElseBlock() {
        return (EReference)getStatement_If_Then_Else().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_If_Then_Else_ElseIfPart() {
		if (statement_If_Then_Else_ElseIfPartEClass == null) {
			statement_If_Then_Else_ElseIfPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(24);
		}
		return statement_If_Then_Else_ElseIfPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_ElseIfPart_ElseifExpression() {
        return (EReference)getStatement_If_Then_Else_ElseIfPart().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_ElseIfPart_ElseifBlock() {
        return (EReference)getStatement_If_Then_Else_ElseIfPart().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_For_Numeric() {
		if (statement_For_NumericEClass == null) {
			statement_For_NumericEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(25);
		}
		return statement_For_NumericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_For_Numeric_IteratorName() {
        return (EAttribute)getStatement_For_Numeric().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Numeric_StartExpr() {
        return (EReference)getStatement_For_Numeric().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Numeric_UntilExpr() {
        return (EReference)getStatement_For_Numeric().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Numeric_StepExpr() {
        return (EReference)getStatement_For_Numeric().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Numeric_Block() {
        return (EReference)getStatement_For_Numeric().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_For_Generic() {
		if (statement_For_GenericEClass == null) {
			statement_For_GenericEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(26);
		}
		return statement_For_GenericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_For_Generic_Names() {
        return (EAttribute)getStatement_For_Generic().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Generic_Expressions() {
        return (EReference)getStatement_For_Generic().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Generic_Block() {
        return (EReference)getStatement_For_Generic().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_GlobalFunction_Declaration() {
		if (statement_GlobalFunction_DeclarationEClass == null) {
			statement_GlobalFunction_DeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(27);
		}
		return statement_GlobalFunction_DeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_GlobalFunction_Declaration_Prefix() {
        return (EAttribute)getStatement_GlobalFunction_Declaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_GlobalFunction_Declaration_FunctionName() {
        return (EAttribute)getStatement_GlobalFunction_Declaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_GlobalFunction_Declaration_Function() {
        return (EReference)getStatement_GlobalFunction_Declaration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_LocalFunction_Declaration() {
		if (statement_LocalFunction_DeclarationEClass == null) {
			statement_LocalFunction_DeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(28);
		}
		return statement_LocalFunction_DeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_LocalFunction_Declaration_FunctionName() {
        return (EAttribute)getStatement_LocalFunction_Declaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_LocalFunction_Declaration_Function() {
        return (EReference)getStatement_LocalFunction_Declaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_Local_Variable_Declaration() {
		if (statement_Local_Variable_DeclarationEClass == null) {
			statement_Local_Variable_DeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(29);
		}
		return statement_Local_Variable_DeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_Local_Variable_Declaration_VariableNames() {
        return (EAttribute)getStatement_Local_Variable_Declaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Local_Variable_Declaration_InitialValue() {
        return (EReference)getStatement_Local_Variable_Declaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_FunctioncallOrAssignment() {
		if (statement_FunctioncallOrAssignmentEClass == null) {
			statement_FunctioncallOrAssignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(30);
		}
		return statement_FunctioncallOrAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		if (expressionEClass == null) {
			expressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(31);
		}
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Lua() {
        return (EReference)getExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Nil() {
		if (expression_NilEClass == null) {
			expression_NilEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(32);
		}
		return expression_NilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_True() {
		if (expression_TrueEClass == null) {
			expression_TrueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(33);
		}
		return expression_TrueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_False() {
		if (expression_FalseEClass == null) {
			expression_FalseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(34);
		}
		return expression_FalseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Number() {
		if (expression_NumberEClass == null) {
			expression_NumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(35);
		}
		return expression_NumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Number_Value() {
        return (EAttribute)getExpression_Number().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_VarArgs() {
		if (expression_VarArgsEClass == null) {
			expression_VarArgsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(36);
		}
		return expression_VarArgsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_String() {
		if (expression_StringEClass == null) {
			expression_StringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(37);
		}
		return expression_StringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_String_Value() {
        return (EAttribute)getExpression_String().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Function() {
		if (expression_FunctionEClass == null) {
			expression_FunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(38);
		}
		return expression_FunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Function_Function() {
        return (EReference)getExpression_Function().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_TableConstructor() {
		if (expression_TableConstructorEClass == null) {
			expression_TableConstructorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(39);
		}
		return expression_TableConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_TableConstructor_Fields() {
        return (EReference)getExpression_TableConstructor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		if (functionEClass == null) {
			functionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(40);
		}
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Parameters() {
        return (EAttribute)getFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_VarArgs() {
        return (EAttribute)getFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Body() {
        return (EReference)getFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctioncall_Arguments() {
		if (functioncall_ArgumentsEClass == null) {
			functioncall_ArgumentsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(41);
		}
		return functioncall_ArgumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctioncall_Arguments_Arguments() {
        return (EReference)getFunctioncall_Arguments().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		if (fieldEClass == null) {
			fieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(42);
		}
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Value() {
        return (EReference)getField().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField_AddEntryToTable_Brackets() {
		if (field_AddEntryToTable_BracketsEClass == null) {
			field_AddEntryToTable_BracketsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(43);
		}
		return field_AddEntryToTable_BracketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_AddEntryToTable_Brackets_IndexExpression() {
        return (EReference)getField_AddEntryToTable_Brackets().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField_AddEntryToTable() {
		if (field_AddEntryToTableEClass == null) {
			field_AddEntryToTableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(44);
		}
		return field_AddEntryToTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_AddEntryToTable_Key() {
        return (EAttribute)getField_AddEntryToTable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField_AppendEntryToTable() {
		if (field_AppendEntryToTableEClass == null) {
			field_AppendEntryToTableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(45);
		}
		return field_AppendEntryToTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStatement_ReturnWithValue() {
		if (lastStatement_ReturnWithValueEClass == null) {
			lastStatement_ReturnWithValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(46);
		}
		return lastStatement_ReturnWithValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLastStatement_ReturnWithValue_ReturnValues() {
        return (EReference)getLastStatement_ReturnWithValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_Assignment() {
		if (statement_AssignmentEClass == null) {
			statement_AssignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(47);
		}
		return statement_AssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Assignment_Variable() {
        return (EReference)getStatement_Assignment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Assignment_Values() {
        return (EReference)getStatement_Assignment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_CallMemberFunction() {
		if (statement_CallMemberFunctionEClass == null) {
			statement_CallMemberFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(48);
		}
		return statement_CallMemberFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_CallMemberFunction_Object() {
        return (EReference)getStatement_CallMemberFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_CallMemberFunction_MemberFunctionName() {
        return (EAttribute)getStatement_CallMemberFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_CallMemberFunction_Arguments() {
        return (EReference)getStatement_CallMemberFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_CallFunction() {
		if (statement_CallFunctionEClass == null) {
			statement_CallFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(49);
		}
		return statement_CallFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_CallFunction_Object() {
        return (EReference)getStatement_CallFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_CallFunction_Arguments() {
        return (EReference)getStatement_CallFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Or() {
		if (expression_OrEClass == null) {
			expression_OrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(50);
		}
		return expression_OrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Or_Left() {
        return (EReference)getExpression_Or().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Or_Right() {
        return (EReference)getExpression_Or().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_And() {
		if (expression_AndEClass == null) {
			expression_AndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(51);
		}
		return expression_AndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_And_Left() {
        return (EReference)getExpression_And().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_And_Right() {
        return (EReference)getExpression_And().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Larger() {
		if (expression_LargerEClass == null) {
			expression_LargerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(52);
		}
		return expression_LargerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Larger_Left() {
        return (EReference)getExpression_Larger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Larger_Right() {
        return (EReference)getExpression_Larger().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Larger_Equal() {
		if (expression_Larger_EqualEClass == null) {
			expression_Larger_EqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(53);
		}
		return expression_Larger_EqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Larger_Equal_Left() {
        return (EReference)getExpression_Larger_Equal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Larger_Equal_Right() {
        return (EReference)getExpression_Larger_Equal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Smaller() {
		if (expression_SmallerEClass == null) {
			expression_SmallerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(54);
		}
		return expression_SmallerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Smaller_Left() {
        return (EReference)getExpression_Smaller().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Smaller_Right() {
        return (EReference)getExpression_Smaller().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Smaller_Equal() {
		if (expression_Smaller_EqualEClass == null) {
			expression_Smaller_EqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(55);
		}
		return expression_Smaller_EqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Smaller_Equal_Left() {
        return (EReference)getExpression_Smaller_Equal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Smaller_Equal_Right() {
        return (EReference)getExpression_Smaller_Equal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Equal() {
		if (expression_EqualEClass == null) {
			expression_EqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(56);
		}
		return expression_EqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Equal_Left() {
        return (EReference)getExpression_Equal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Equal_Right() {
        return (EReference)getExpression_Equal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Not_Equal() {
		if (expression_Not_EqualEClass == null) {
			expression_Not_EqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(57);
		}
		return expression_Not_EqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Not_Equal_Left() {
        return (EReference)getExpression_Not_Equal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Not_Equal_Right() {
        return (EReference)getExpression_Not_Equal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Concatenation() {
		if (expression_ConcatenationEClass == null) {
			expression_ConcatenationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(58);
		}
		return expression_ConcatenationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Concatenation_Left() {
        return (EReference)getExpression_Concatenation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Concatenation_Right() {
        return (EReference)getExpression_Concatenation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Plus() {
		if (expression_PlusEClass == null) {
			expression_PlusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(59);
		}
		return expression_PlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Plus_Left() {
        return (EReference)getExpression_Plus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Plus_Right() {
        return (EReference)getExpression_Plus().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Minus() {
		if (expression_MinusEClass == null) {
			expression_MinusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(60);
		}
		return expression_MinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Minus_Left() {
        return (EReference)getExpression_Minus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Minus_Right() {
        return (EReference)getExpression_Minus().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Multiplication() {
		if (expression_MultiplicationEClass == null) {
			expression_MultiplicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(61);
		}
		return expression_MultiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Multiplication_Left() {
        return (EReference)getExpression_Multiplication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Multiplication_Right() {
        return (EReference)getExpression_Multiplication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Division() {
		if (expression_DivisionEClass == null) {
			expression_DivisionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(62);
		}
		return expression_DivisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Division_Left() {
        return (EReference)getExpression_Division().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Division_Right() {
        return (EReference)getExpression_Division().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Modulo() {
		if (expression_ModuloEClass == null) {
			expression_ModuloEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(63);
		}
		return expression_ModuloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Modulo_Left() {
        return (EReference)getExpression_Modulo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Modulo_Right() {
        return (EReference)getExpression_Modulo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Negate() {
		if (expression_NegateEClass == null) {
			expression_NegateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(64);
		}
		return expression_NegateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Negate_Exp() {
        return (EReference)getExpression_Negate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Length() {
		if (expression_LengthEClass == null) {
			expression_LengthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(65);
		}
		return expression_LengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Length_Exp() {
        return (EReference)getExpression_Length().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Invert() {
		if (expression_InvertEClass == null) {
			expression_InvertEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(66);
		}
		return expression_InvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Invert_Exp() {
        return (EReference)getExpression_Invert().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Exponentiation() {
		if (expression_ExponentiationEClass == null) {
			expression_ExponentiationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(67);
		}
		return expression_ExponentiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Exponentiation_Left() {
        return (EReference)getExpression_Exponentiation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Exponentiation_Right() {
        return (EReference)getExpression_Exponentiation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_CallMemberFunction() {
		if (expression_CallMemberFunctionEClass == null) {
			expression_CallMemberFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(68);
		}
		return expression_CallMemberFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_CallMemberFunction_Object() {
        return (EReference)getExpression_CallMemberFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_CallMemberFunction_MemberFunctionName() {
        return (EAttribute)getExpression_CallMemberFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_CallMemberFunction_Arguments() {
        return (EReference)getExpression_CallMemberFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_CallFunction() {
		if (expression_CallFunctionEClass == null) {
			expression_CallFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(69);
		}
		return expression_CallFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_CallFunction_Object() {
        return (EReference)getExpression_CallFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_CallFunction_Arguments() {
        return (EReference)getExpression_CallFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_AccessArray() {
		if (expression_AccessArrayEClass == null) {
			expression_AccessArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(70);
		}
		return expression_AccessArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_AccessArray_Array() {
        return (EReference)getExpression_AccessArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_AccessArray_Index() {
        return (EReference)getExpression_AccessArray().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_AccessMember() {
		if (expression_AccessMemberEClass == null) {
			expression_AccessMemberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(71);
		}
		return expression_AccessMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_AccessMember_Object() {
        return (EReference)getExpression_AccessMember().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_AccessMember_MemberName() {
        return (EAttribute)getExpression_AccessMember().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_VariableName() {
		if (expression_VariableNameEClass == null) {
			expression_VariableNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(72);
		}
		return expression_VariableNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_VariableName_Variable() {
        return (EAttribute)getExpression_VariableName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAttribute() {
		if (eAttributeEClass == null) {
			eAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(73);
		}
		return eAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttribute_ID() {
        return (EAttribute)getEAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAttribute_EAttributeType() {
        return (EReference)getEAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAnnotation() {
		if (eAnnotationEClass == null) {
			eAnnotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(74);
		}
		return eAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAnnotation_Source() {
        return (EAttribute)getEAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_Details() {
        return (EReference)getEAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_EModelElement() {
        return (EReference)getEAnnotation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_Contents() {
        return (EReference)getEAnnotation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_References() {
        return (EReference)getEAnnotation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		if (eClassEClass == null) {
			eClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(75);
		}
		return eClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass_Abstract() {
        return (EAttribute)getEClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass_Interface() {
        return (EAttribute)getEClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_ESuperTypes() {
        return (EReference)getEClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EOperations() {
        return (EReference)getEClass().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllAttributes() {
        return (EReference)getEClass().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllReferences() {
        return (EReference)getEClass().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EReferences() {
        return (EReference)getEClass().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAttributes() {
        return (EReference)getEClass().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllContainments() {
        return (EReference)getEClass().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllOperations() {
        return (EReference)getEClass().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllStructuralFeatures() {
        return (EReference)getEClass().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllSuperTypes() {
        return (EReference)getEClass().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EIDAttribute() {
        return (EReference)getEClass().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EStructuralFeatures() {
        return (EReference)getEClass().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EGenericSuperTypes() {
        return (EReference)getEClass().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllGenericSuperTypes() {
        return (EReference)getEClass().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassifier() {
		if (eClassifierEClass == null) {
			eClassifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(76);
		}
		return eClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_InstanceClassName() {
        return (EAttribute)getEClassifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_InstanceClass() {
        return (EAttribute)getEClassifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_DefaultValue() {
        return (EAttribute)getEClassifier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_InstanceTypeName() {
        return (EAttribute)getEClassifier().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassifier_EPackage() {
        return (EReference)getEClassifier().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassifier_ETypeParameters() {
        return (EReference)getEClassifier().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDataType() {
		if (eDataTypeEClass == null) {
			eDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(77);
		}
		return eDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDataType_Serializable() {
        return (EAttribute)getEDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnum() {
		if (eEnumEClass == null) {
			eEnumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(78);
		}
		return eEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnum_ELiterals() {
        return (EReference)getEEnum().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnumLiteral() {
		if (eEnumLiteralEClass == null) {
			eEnumLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(79);
		}
		return eEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteral_Value() {
        return (EAttribute)getEEnumLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteral_Instance() {
        return (EAttribute)getEEnumLiteral().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteral_Literal() {
        return (EAttribute)getEEnumLiteral().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnumLiteral_EEnum() {
        return (EReference)getEEnumLiteral().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFactory() {
		if (eFactoryEClass == null) {
			eFactoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(80);
		}
		return eFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFactory_EPackage() {
        return (EReference)getEFactory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEModelElement() {
		if (eModelElementEClass == null) {
			eModelElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(81);
		}
		return eModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEModelElement_EAnnotations() {
        return (EReference)getEModelElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENamedElement() {
		if (eNamedElementEClass == null) {
			eNamedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(82);
		}
		return eNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENamedElement_Name() {
        return (EAttribute)getENamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObject() {
		if (eObjectEClass == null) {
			eObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(83);
		}
		return eObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEOperation() {
		if (eOperationEClass == null) {
			eOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(84);
		}
		return eOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EContainingClass() {
        return (EReference)getEOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_ETypeParameters() {
        return (EReference)getEOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EParameters() {
        return (EReference)getEOperation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EExceptions() {
        return (EReference)getEOperation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EGenericExceptions() {
        return (EReference)getEOperation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_Behavior() {
        return (EReference)getEOperation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPackage() {
		if (ePackageEClass == null) {
			ePackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(85);
		}
		return ePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackage_NsURI() {
        return (EAttribute)getEPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackage_NsPrefix() {
        return (EAttribute)getEPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_EFactoryInstance() {
        return (EReference)getEPackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_EClassifiers() {
        return (EReference)getEPackage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_ESubpackages() {
        return (EReference)getEPackage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_ESuperPackage() {
        return (EReference)getEPackage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEParameter() {
		if (eParameterEClass == null) {
			eParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(86);
		}
		return eParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEParameter_EOperation() {
        return (EReference)getEParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReference() {
		if (eReferenceEClass == null) {
			eReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(87);
		}
		return eReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_Containment() {
        return (EAttribute)getEReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_Container() {
        return (EAttribute)getEReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_ResolveProxies() {
        return (EAttribute)getEReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference_EOpposite() {
        return (EReference)getEReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference_EReferenceType() {
        return (EReference)getEReference().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference_EKeys() {
        return (EReference)getEReference().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralFeature() {
		if (eStructuralFeatureEClass == null) {
			eStructuralFeatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(88);
		}
		return eStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Changeable() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Volatile() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Transient() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_DefaultValueLiteral() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_DefaultValue() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Unsettable() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Derived() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeature_EContainingClass() {
        return (EReference)getEStructuralFeature().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETypedElement() {
		if (eTypedElementEClass == null) {
			eTypedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(89);
		}
		return eTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Ordered() {
        return (EAttribute)getETypedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Unique() {
        return (EAttribute)getETypedElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_LowerBound() {
        return (EAttribute)getETypedElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_UpperBound() {
        return (EAttribute)getETypedElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Many() {
        return (EAttribute)getETypedElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Required() {
        return (EAttribute)getETypedElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypedElement_EType() {
        return (EReference)getETypedElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypedElement_EGenericType() {
        return (EReference)getETypedElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringToStringMapEntry() {
		if (eStringToStringMapEntryEClass == null) {
			eStringToStringMapEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(121);
		}
		return eStringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToStringMapEntry_Key() {
        return (EAttribute)getEStringToStringMapEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToStringMapEntry_Value() {
        return (EAttribute)getEStringToStringMapEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEGenericType() {
		if (eGenericTypeEClass == null) {
			eGenericTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(123);
		}
		return eGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_EUpperBound() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ETypeArguments() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ERawType() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ELowerBound() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ETypeParameter() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_EClassifier() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETypeParameter() {
		if (eTypeParameterEClass == null) {
			eTypeParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(124);
		}
		return eTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypeParameter_EBounds() {
        return (EReference)getETypeParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContext() {
		if (contextEDataType == null) {
			contextEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(5);
		}
		return contextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOffer() {
		if (offerEDataType == null) {
			offerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(7);
		}
		return offerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getToken() {
		if (tokenEDataType == null) {
			tokenEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(8);
		}
		return tokenEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnvironment() {
		if (environmentEDataType == null) {
			environmentEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(14);
		}
		return environmentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBigDecimal() {
		if (eBigDecimalEDataType == null) {
			eBigDecimalEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(90);
		}
		return eBigDecimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBigInteger() {
		if (eBigIntegerEDataType == null) {
			eBigIntegerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(91);
		}
		return eBigIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBoolean() {
		if (eBooleanEDataType == null) {
			eBooleanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(92);
		}
		return eBooleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBooleanObject() {
		if (eBooleanObjectEDataType == null) {
			eBooleanObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(93);
		}
		return eBooleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEByte() {
		if (eByteEDataType == null) {
			eByteEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(94);
		}
		return eByteEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEByteArray() {
		if (eByteArrayEDataType == null) {
			eByteArrayEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(95);
		}
		return eByteArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEByteObject() {
		if (eByteObjectEDataType == null) {
			eByteObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(96);
		}
		return eByteObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEChar() {
		if (eCharEDataType == null) {
			eCharEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(97);
		}
		return eCharEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getECharacterObject() {
		if (eCharacterObjectEDataType == null) {
			eCharacterObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(98);
		}
		return eCharacterObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDate() {
		if (eDateEDataType == null) {
			eDateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(99);
		}
		return eDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDiagnosticChain() {
		if (eDiagnosticChainEDataType == null) {
			eDiagnosticChainEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(100);
		}
		return eDiagnosticChainEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDouble() {
		if (eDoubleEDataType == null) {
			eDoubleEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(101);
		}
		return eDoubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDoubleObject() {
		if (eDoubleObjectEDataType == null) {
			eDoubleObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(102);
		}
		return eDoubleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEEList() {
		if (eeListEDataType == null) {
			eeListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(103);
		}
		return eeListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEEnumerator() {
		if (eEnumeratorEDataType == null) {
			eEnumeratorEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(104);
		}
		return eEnumeratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFeatureMap() {
		if (eFeatureMapEDataType == null) {
			eFeatureMapEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(105);
		}
		return eFeatureMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFeatureMapEntry() {
		if (eFeatureMapEntryEDataType == null) {
			eFeatureMapEntryEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(106);
		}
		return eFeatureMapEntryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFloat() {
		if (eFloatEDataType == null) {
			eFloatEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(107);
		}
		return eFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFloatObject() {
		if (eFloatObjectEDataType == null) {
			eFloatObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(108);
		}
		return eFloatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEInt() {
		if (eIntEDataType == null) {
			eIntEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(109);
		}
		return eIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEIntegerObject() {
		if (eIntegerObjectEDataType == null) {
			eIntegerObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(110);
		}
		return eIntegerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEJavaClass() {
		if (eJavaClassEDataType == null) {
			eJavaClassEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(111);
		}
		return eJavaClassEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEJavaObject() {
		if (eJavaObjectEDataType == null) {
			eJavaObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(112);
		}
		return eJavaObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getELong() {
		if (eLongEDataType == null) {
			eLongEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(113);
		}
		return eLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getELongObject() {
		if (eLongObjectEDataType == null) {
			eLongObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(114);
		}
		return eLongObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEMap() {
		if (eMapEDataType == null) {
			eMapEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(115);
		}
		return eMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEResource() {
		if (eResourceEDataType == null) {
			eResourceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(116);
		}
		return eResourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEResourceSet() {
		if (eResourceSetEDataType == null) {
			eResourceSetEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(117);
		}
		return eResourceSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEShort() {
		if (eShortEDataType == null) {
			eShortEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(118);
		}
		return eShortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEShortObject() {
		if (eShortObjectEDataType == null) {
			eShortObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(119);
		}
		return eShortObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEString() {
		if (eStringEDataType == null) {
			eStringEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(120);
		}
		return eStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getETreeIterator() {
		if (eTreeIteratorEDataType == null) {
			eTreeIteratorEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(122);
		}
		return eTreeIteratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEInvocationTargetException() {
		if (eInvocationTargetExceptionEDataType == null) {
			eInvocationTargetExceptionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI).getEClassifiers().get(125);
		}
		return eInvocationTargetExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramFactory getActivitydiagramFactory() {
		return (ActivitydiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("activitydiagram." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ActivitydiagramPackageImpl
