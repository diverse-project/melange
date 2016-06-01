/**
 */
package fr.inria.diverse.melanger.melangedlangmt.minifsm.impl;

import fr.inria.diverse.melanger.melangedlangmt.minifsm.And;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.AndAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BlockAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignemntAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpression;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpressionAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperationAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVar;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRef;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRefAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Context;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Divide;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.DivideAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Equal;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.EqualAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.FinalState;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Greater;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqual;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqualAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IfAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignementAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparison;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparisonAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpressionAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperation;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperationAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRef;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRefAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerVar;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Less;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.LessAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqual;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqualAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmFactory;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Minus;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.MinusAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Multiply;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.MultiplyAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Not;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.NotAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Or;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.OrAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Plus;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.PlusAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.State;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.StatementAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Variable;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRef;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRefAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.WhileAspect;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinifsmPackageImpl extends EPackageImpl implements MinifsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

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
	private EClass integerVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intVariableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intExpressionAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRefAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intVariableRefAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intComparisonAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intAssignementAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableRefAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intOperationAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanAssignemntAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divideAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplyAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessOrEqualAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterOrEqualAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperationAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orAspectEClass = null;

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
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MinifsmPackageImpl() {
		super(eNS_URI, MinifsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MinifsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MinifsmPackage init() {
		if (isInited) return (MinifsmPackage)EPackage.Registry.INSTANCE.getEPackage(MinifsmPackage.eNS_URI);

		// Obtain or create and register package
		MinifsmPackageImpl theMinifsmPackage = (MinifsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MinifsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MinifsmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMinifsmPackage.createPackageContents();

		// Initialize created meta-data
		theMinifsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMinifsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MinifsmPackage.eNS_URI, theMinifsmPackage);
		return theMinifsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSM() {
		return fsmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_States() {
		return (EReference)fsmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_Transitions() {
		return (EReference)fsmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_InitialState() {
		return (EReference)fsmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Input() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Output() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Condition() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Expression() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Language() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Variables() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVar() {
		return integerVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerVar_Value() {
		return (EAttribute)integerVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVar() {
		return booleanVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVar_Value() {
		return (EAttribute)booleanVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_Value() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntExpression() {
		return intExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_Value() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqual() {
		return equalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntComparison() {
		return intComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntComparison_Right() {
		return (EReference)intComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntComparison_Left() {
		return (EReference)intComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreater() {
		return greaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterOrEqual() {
		return greaterOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLess() {
		return lessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessOrEqual() {
		return lessOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNot_Expression() {
		return (EReference)notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanOperation() {
		return booleanOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanOperation_Left() {
		return (EReference)booleanOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanOperation_Right() {
		return (EReference)booleanOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlus() {
		return plusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntOperation() {
		return intOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntOperation_Right() {
		return (EReference)intOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntOperation_Left() {
		return (EReference)intOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinus() {
		return minusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiply() {
		return multiplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivide() {
		return divideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableRef() {
		return booleanVariableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRef() {
		return variableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableRef_Name() {
		return (EAttribute)variableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntVariableRef() {
		return intVariableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntExpressionAspect() {
		return intExpressionAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerAspect() {
		return integerAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRefAspect() {
		return variableRefAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntVariableRefAspect() {
		return intVariableRefAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntComparisonAspect() {
		return intComparisonAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessAspect() {
		return lessAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementAspect() {
		return statementAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntAssignementAspect() {
		return intAssignementAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfAspect() {
		return ifAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpressionAspect() {
		return booleanExpressionAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableRefAspect() {
		return booleanVariableRefAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockAspect() {
		return blockAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntOperationAspect() {
		return intOperationAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlusAspect() {
		return plusAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanAssignemntAspect() {
		return booleanAssignemntAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualAspect() {
		return equalAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterAspect() {
		return greaterAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanAspect() {
		return booleanAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinusAspect() {
		return minusAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotAspect() {
		return notAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivideAspect() {
		return divideAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplyAspect() {
		return multiplyAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessOrEqualAspect() {
		return lessOrEqualAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterOrEqualAspect() {
		return greaterOrEqualAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileAspect() {
		return whileAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanOperationAspect() {
		return booleanOperationAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndAspect() {
		return andAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrAspect() {
		return orAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinifsmFactory getMinifsmFactory() {
		return (MinifsmFactory)getEFactoryInstance();
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
		fsmEClass = createEClass(FSM);
		createEReference(fsmEClass, FSM__STATES);
		createEReference(fsmEClass, FSM__TRANSITIONS);
		createEReference(fsmEClass, FSM__INITIAL_STATE);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);

		finalStateEClass = createEClass(FINAL_STATE);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__INPUT);
		createEReference(transitionEClass, TRANSITION__OUTPUT);
		createEReference(transitionEClass, TRANSITION__CONDITION);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__EXPRESSION);
		createEAttribute(conditionEClass, CONDITION__LANGUAGE);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__VARIABLES);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		integerVarEClass = createEClass(INTEGER_VAR);
		createEAttribute(integerVarEClass, INTEGER_VAR__VALUE);

		booleanVarEClass = createEClass(BOOLEAN_VAR);
		createEAttribute(booleanVarEClass, BOOLEAN_VAR__VALUE);

		integerEClass = createEClass(INTEGER);
		createEAttribute(integerEClass, INTEGER__VALUE);

		intExpressionEClass = createEClass(INT_EXPRESSION);

		booleanEClass = createEClass(BOOLEAN);
		createEAttribute(booleanEClass, BOOLEAN__VALUE);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

		equalEClass = createEClass(EQUAL);

		intComparisonEClass = createEClass(INT_COMPARISON);
		createEReference(intComparisonEClass, INT_COMPARISON__RIGHT);
		createEReference(intComparisonEClass, INT_COMPARISON__LEFT);

		greaterEClass = createEClass(GREATER);

		greaterOrEqualEClass = createEClass(GREATER_OR_EQUAL);

		lessEClass = createEClass(LESS);

		lessOrEqualEClass = createEClass(LESS_OR_EQUAL);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__EXPRESSION);

		orEClass = createEClass(OR);

		booleanOperationEClass = createEClass(BOOLEAN_OPERATION);
		createEReference(booleanOperationEClass, BOOLEAN_OPERATION__LEFT);
		createEReference(booleanOperationEClass, BOOLEAN_OPERATION__RIGHT);

		andEClass = createEClass(AND);

		plusEClass = createEClass(PLUS);

		intOperationEClass = createEClass(INT_OPERATION);
		createEReference(intOperationEClass, INT_OPERATION__RIGHT);
		createEReference(intOperationEClass, INT_OPERATION__LEFT);

		minusEClass = createEClass(MINUS);

		multiplyEClass = createEClass(MULTIPLY);

		divideEClass = createEClass(DIVIDE);

		booleanVariableRefEClass = createEClass(BOOLEAN_VARIABLE_REF);

		variableRefEClass = createEClass(VARIABLE_REF);
		createEAttribute(variableRefEClass, VARIABLE_REF__NAME);

		intVariableRefEClass = createEClass(INT_VARIABLE_REF);

		intExpressionAspectEClass = createEClass(INT_EXPRESSION_ASPECT);

		integerAspectEClass = createEClass(INTEGER_ASPECT);

		variableRefAspectEClass = createEClass(VARIABLE_REF_ASPECT);

		intVariableRefAspectEClass = createEClass(INT_VARIABLE_REF_ASPECT);

		intComparisonAspectEClass = createEClass(INT_COMPARISON_ASPECT);

		lessAspectEClass = createEClass(LESS_ASPECT);

		statementAspectEClass = createEClass(STATEMENT_ASPECT);

		intAssignementAspectEClass = createEClass(INT_ASSIGNEMENT_ASPECT);

		ifAspectEClass = createEClass(IF_ASPECT);

		booleanExpressionAspectEClass = createEClass(BOOLEAN_EXPRESSION_ASPECT);

		booleanVariableRefAspectEClass = createEClass(BOOLEAN_VARIABLE_REF_ASPECT);

		blockAspectEClass = createEClass(BLOCK_ASPECT);

		intOperationAspectEClass = createEClass(INT_OPERATION_ASPECT);

		plusAspectEClass = createEClass(PLUS_ASPECT);

		booleanAssignemntAspectEClass = createEClass(BOOLEAN_ASSIGNEMNT_ASPECT);

		equalAspectEClass = createEClass(EQUAL_ASPECT);

		greaterAspectEClass = createEClass(GREATER_ASPECT);

		booleanAspectEClass = createEClass(BOOLEAN_ASPECT);

		minusAspectEClass = createEClass(MINUS_ASPECT);

		notAspectEClass = createEClass(NOT_ASPECT);

		divideAspectEClass = createEClass(DIVIDE_ASPECT);

		multiplyAspectEClass = createEClass(MULTIPLY_ASPECT);

		lessOrEqualAspectEClass = createEClass(LESS_OR_EQUAL_ASPECT);

		greaterOrEqualAspectEClass = createEClass(GREATER_OR_EQUAL_ASPECT);

		whileAspectEClass = createEClass(WHILE_ASPECT);

		booleanOperationAspectEClass = createEClass(BOOLEAN_OPERATION_ASPECT);

		andAspectEClass = createEClass(AND_ASPECT);

		orAspectEClass = createEClass(OR_ASPECT);
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

		// Set bounds for type parameters

		// Add supertypes to classes
		finalStateEClass.getESuperTypes().add(this.getState());
		integerVarEClass.getESuperTypes().add(this.getVariable());
		booleanVarEClass.getESuperTypes().add(this.getVariable());
		integerEClass.getESuperTypes().add(this.getIntExpression());
		booleanEClass.getESuperTypes().add(this.getBooleanExpression());
		equalEClass.getESuperTypes().add(this.getIntComparison());
		intComparisonEClass.getESuperTypes().add(this.getBooleanExpression());
		greaterEClass.getESuperTypes().add(this.getIntComparison());
		greaterOrEqualEClass.getESuperTypes().add(this.getIntComparison());
		lessEClass.getESuperTypes().add(this.getIntComparison());
		lessOrEqualEClass.getESuperTypes().add(this.getIntComparison());
		notEClass.getESuperTypes().add(this.getBooleanExpression());
		orEClass.getESuperTypes().add(this.getBooleanOperation());
		booleanOperationEClass.getESuperTypes().add(this.getBooleanExpression());
		andEClass.getESuperTypes().add(this.getBooleanOperation());
		plusEClass.getESuperTypes().add(this.getIntOperation());
		intOperationEClass.getESuperTypes().add(this.getIntExpression());
		minusEClass.getESuperTypes().add(this.getIntOperation());
		multiplyEClass.getESuperTypes().add(this.getIntOperation());
		divideEClass.getESuperTypes().add(this.getIntOperation());
		booleanVariableRefEClass.getESuperTypes().add(this.getVariableRef());
		booleanVariableRefEClass.getESuperTypes().add(this.getBooleanExpression());
		intVariableRefEClass.getESuperTypes().add(this.getVariableRef());
		intVariableRefEClass.getESuperTypes().add(this.getIntExpression());
		integerAspectEClass.getESuperTypes().add(this.getIntExpressionAspect());
		intVariableRefAspectEClass.getESuperTypes().add(this.getVariableRefAspect());
		intComparisonAspectEClass.getESuperTypes().add(this.getBooleanExpressionAspect());
		lessAspectEClass.getESuperTypes().add(this.getIntComparisonAspect());
		intAssignementAspectEClass.getESuperTypes().add(this.getStatementAspect());
		booleanVariableRefAspectEClass.getESuperTypes().add(this.getVariableRefAspect());
		intOperationAspectEClass.getESuperTypes().add(this.getIntExpressionAspect());
		plusAspectEClass.getESuperTypes().add(this.getIntOperationAspect());
		booleanAssignemntAspectEClass.getESuperTypes().add(this.getStatementAspect());
		equalAspectEClass.getESuperTypes().add(this.getIntComparisonAspect());
		greaterAspectEClass.getESuperTypes().add(this.getIntComparisonAspect());
		booleanAspectEClass.getESuperTypes().add(this.getBooleanExpressionAspect());
		minusAspectEClass.getESuperTypes().add(this.getIntOperationAspect());
		notAspectEClass.getESuperTypes().add(this.getBooleanExpressionAspect());
		divideAspectEClass.getESuperTypes().add(this.getIntOperationAspect());
		multiplyAspectEClass.getESuperTypes().add(this.getIntOperationAspect());
		lessOrEqualAspectEClass.getESuperTypes().add(this.getIntComparisonAspect());
		greaterOrEqualAspectEClass.getESuperTypes().add(this.getIntComparisonAspect());
		booleanOperationAspectEClass.getESuperTypes().add(this.getBooleanExpressionAspect());
		andAspectEClass.getESuperTypes().add(this.getBooleanOperationAspect());
		orAspectEClass.getESuperTypes().add(this.getBooleanOperationAspect());

		// Initialize classes and features; add operations and parameters
		initEClass(fsmEClass, fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM.class, "FSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFSM_States(), this.getState(), null, "states", null, 0, -1, fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFSM_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFSM_InitialState(), this.getState(), null, "initialState", null, 1, 1, fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Input(), this.getState(), null, "input", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Output(), this.getState(), null, "output", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Condition(), this.getCondition(), null, "condition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_Language(), ecorePackage.getEString(), "language", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Variables(), this.getVariable(), null, "variables", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVarEClass, IntegerVar.class, "IntegerVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerVar_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVarEClass, BooleanVar.class, "BooleanVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanVar_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerEClass, fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteger_Value(), ecorePackage.getEInt(), "value", null, 1, 1, fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intExpressionEClass, IntExpression.class, "IntExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanEClass, fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalEClass, Equal.class, "Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intComparisonEClass, IntComparison.class, "IntComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntComparison_Right(), this.getIntExpression(), null, "right", null, 1, 1, IntComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntComparison_Left(), this.getIntExpression(), null, "left", null, 1, 1, IntComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(greaterEClass, Greater.class, "Greater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterOrEqualEClass, GreaterOrEqual.class, "GreaterOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessEClass, Less.class, "Less", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessOrEqualEClass, LessOrEqual.class, "LessOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_Expression(), this.getBooleanExpression(), null, "expression", null, 1, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanOperationEClass, BooleanOperation.class, "BooleanOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanOperation_Left(), this.getBooleanExpression(), null, "left", null, 1, 1, BooleanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanOperation_Right(), this.getBooleanExpression(), null, "right", null, 1, 1, BooleanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intOperationEClass, IntOperation.class, "IntOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntOperation_Right(), this.getIntExpression(), null, "right", null, 1, 1, IntOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntOperation_Left(), this.getIntExpression(), null, "left", null, 1, 1, IntOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplyEClass, Multiply.class, "Multiply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divideEClass, Divide.class, "Divide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanVariableRefEClass, BooleanVariableRef.class, "BooleanVariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableRefEClass, VariableRef.class, "VariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableRef_Name(), ecorePackage.getEString(), "name", null, 1, 1, VariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intVariableRefEClass, IntVariableRef.class, "IntVariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intExpressionAspectEClass, IntExpressionAspect.class, "IntExpressionAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(intExpressionAspectEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerAspectEClass, IntegerAspect.class, "IntegerAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(integerAspectEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableRefAspectEClass, VariableRefAspect.class, "VariableRefAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intVariableRefAspectEClass, IntVariableRefAspect.class, "IntVariableRefAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(intVariableRefAspectEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(intComparisonAspectEClass, IntComparisonAspect.class, "IntComparisonAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessAspectEClass, LessAspect.class, "LessAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(lessAspectEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(statementAspectEClass, StatementAspect.class, "StatementAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(statementAspectEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(intAssignementAspectEClass, IntAssignementAspect.class, "IntAssignementAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(intAssignementAspectEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ifAspectEClass, IfAspect.class, "IfAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(ifAspectEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanExpressionAspectEClass, BooleanExpressionAspect.class, "BooleanExpressionAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(booleanExpressionAspectEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanVariableRefAspectEClass, BooleanVariableRefAspect.class, "BooleanVariableRefAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(booleanVariableRefAspectEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(blockAspectEClass, BlockAspect.class, "BlockAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(blockAspectEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(intOperationAspectEClass, IntOperationAspect.class, "IntOperationAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plusAspectEClass, PlusAspect.class, "PlusAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(plusAspectEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanAssignemntAspectEClass, BooleanAssignemntAspect.class, "BooleanAssignemntAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(booleanAssignemntAspectEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(equalAspectEClass, EqualAspect.class, "EqualAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(equalAspectEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(greaterAspectEClass, GreaterAspect.class, "GreaterAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(greaterAspectEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanAspectEClass, BooleanAspect.class, "BooleanAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(booleanAspectEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(minusAspectEClass, MinusAspect.class, "MinusAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(minusAspectEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(notAspectEClass, NotAspect.class, "NotAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(notAspectEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(divideAspectEClass, DivideAspect.class, "DivideAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(divideAspectEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(multiplyAspectEClass, MultiplyAspect.class, "MultiplyAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(multiplyAspectEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lessOrEqualAspectEClass, LessOrEqualAspect.class, "LessOrEqualAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(lessOrEqualAspectEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(greaterOrEqualAspectEClass, GreaterOrEqualAspect.class, "GreaterOrEqualAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(greaterOrEqualAspectEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(whileAspectEClass, WhileAspect.class, "WhileAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(whileAspectEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanOperationAspectEClass, BooleanOperationAspect.class, "BooleanOperationAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andAspectEClass, AndAspect.class, "AndAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(andAspectEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orAspectEClass, OrAspect.class, "OrAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(orAspectEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (intExpressionAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (intExpressionAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (integerAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (integerAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (variableRefAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (intVariableRefAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (intVariableRefAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (intComparisonAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (lessAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (lessAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (statementAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (statementAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (intAssignementAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (intAssignementAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ifAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ifAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanExpressionAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanExpressionAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanVariableRefAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanVariableRefAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (blockAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (blockAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (intOperationAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (plusAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (plusAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanAssignemntAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanAssignemntAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (equalAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (equalAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (greaterAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (greaterAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (minusAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (minusAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (notAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (notAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (divideAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (divideAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (multiplyAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (multiplyAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (lessOrEqualAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (lessOrEqualAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (greaterOrEqualAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (greaterOrEqualAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (whileAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (whileAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanOperationAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (andAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (andAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (orAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (orAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });
	}

} //MinifsmPackageImpl
