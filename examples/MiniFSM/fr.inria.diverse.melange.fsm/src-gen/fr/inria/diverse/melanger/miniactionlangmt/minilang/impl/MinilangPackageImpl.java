/**
 */
package fr.inria.diverse.melanger.miniactionlangmt.minilang.impl;

import fr.inria.diverse.melanger.miniactionlangmt.minilang.And;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Block;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanAssignment;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanExpression;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanOperation;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanVar;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanVariableRef;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Context;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Divide;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Equal;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Greater;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.GreaterOrEqual;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.If;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntAssignment;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntComparison;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntExpression;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntOperation;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntVariableRef;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntegerVar;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Less;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.LessOrEqual;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangFactory;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Minus;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Multiply;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Not;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Or;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Plus;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintStr;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintVar;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Statement;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Variable;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.VariableRef;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.While;

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
public class MinilangPackageImpl extends EPackageImpl implements MinilangPackage {
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
	private EClass integerEClass = null;

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
	private EClass intOperationEClass = null;

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
	private EClass intComparisonEClass = null;

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
	private EClass booleanOperationEClass = null;

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
	private EClass intVariableRefEClass = null;

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
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printStrEClass = null;

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
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

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
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MinilangPackageImpl() {
		super(eNS_URI, MinilangFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MinilangPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MinilangPackage init() {
		if (isInited) return (MinilangPackage)EPackage.Registry.INSTANCE.getEPackage(MinilangPackage.eNS_URI);

		// Obtain or create and register package
		MinilangPackageImpl theMinilangPackage = (MinilangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MinilangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MinilangPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMinilangPackage.createPackageContents();

		// Initialize created meta-data
		theMinilangPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMinilangPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MinilangPackage.eNS_URI, theMinilangPackage);
		return theMinilangPackage;
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
	public EClass getEqual() {
		return equalEClass;
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
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
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
	public EClass getBooleanVariableRef() {
		return booleanVariableRefEClass;
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
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanAssignment() {
		return booleanAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanAssignment_Variable() {
		return (EReference)booleanAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanAssignment_Value() {
		return (EReference)booleanAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntAssignment() {
		return intAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntAssignment_Variable() {
		return (EReference)intAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntAssignment_Value() {
		return (EReference)intAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrintVar() {
		return printVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrintVar_Value() {
		return (EReference)printVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrintStr() {
		return printStrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintStr_Value() {
		return (EAttribute)printStrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Statement() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Condition() {
		return (EReference)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Then() {
		return (EReference)ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Else() {
		return (EReference)ifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhile_Condition() {
		return (EReference)whileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhile_Body() {
		return (EReference)whileEClass.getEStructuralFeatures().get(1);
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
	public MinilangFactory getMinilangFactory() {
		return (MinilangFactory)getEFactoryInstance();
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
		intExpressionEClass = createEClass(INT_EXPRESSION);

		integerEClass = createEClass(INTEGER);
		createEAttribute(integerEClass, INTEGER__VALUE);

		booleanEClass = createEClass(BOOLEAN);
		createEAttribute(booleanEClass, BOOLEAN__VALUE);

		intOperationEClass = createEClass(INT_OPERATION);
		createEReference(intOperationEClass, INT_OPERATION__RIGHT);
		createEReference(intOperationEClass, INT_OPERATION__LEFT);

		equalEClass = createEClass(EQUAL);

		greaterEClass = createEClass(GREATER);

		greaterOrEqualEClass = createEClass(GREATER_OR_EQUAL);

		lessEClass = createEClass(LESS);

		lessOrEqualEClass = createEClass(LESS_OR_EQUAL);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__EXPRESSION);

		orEClass = createEClass(OR);

		andEClass = createEClass(AND);

		plusEClass = createEClass(PLUS);

		minusEClass = createEClass(MINUS);

		multiplyEClass = createEClass(MULTIPLY);

		divideEClass = createEClass(DIVIDE);

		intComparisonEClass = createEClass(INT_COMPARISON);
		createEReference(intComparisonEClass, INT_COMPARISON__RIGHT);
		createEReference(intComparisonEClass, INT_COMPARISON__LEFT);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

		booleanOperationEClass = createEClass(BOOLEAN_OPERATION);
		createEReference(booleanOperationEClass, BOOLEAN_OPERATION__LEFT);
		createEReference(booleanOperationEClass, BOOLEAN_OPERATION__RIGHT);

		booleanVariableRefEClass = createEClass(BOOLEAN_VARIABLE_REF);

		intVariableRefEClass = createEClass(INT_VARIABLE_REF);

		variableRefEClass = createEClass(VARIABLE_REF);
		createEAttribute(variableRefEClass, VARIABLE_REF__NAME);

		statementEClass = createEClass(STATEMENT);

		booleanAssignmentEClass = createEClass(BOOLEAN_ASSIGNMENT);
		createEReference(booleanAssignmentEClass, BOOLEAN_ASSIGNMENT__VARIABLE);
		createEReference(booleanAssignmentEClass, BOOLEAN_ASSIGNMENT__VALUE);

		intAssignmentEClass = createEClass(INT_ASSIGNMENT);
		createEReference(intAssignmentEClass, INT_ASSIGNMENT__VARIABLE);
		createEReference(intAssignmentEClass, INT_ASSIGNMENT__VALUE);

		printVarEClass = createEClass(PRINT_VAR);
		createEReference(printVarEClass, PRINT_VAR__VALUE);

		printStrEClass = createEClass(PRINT_STR);
		createEAttribute(printStrEClass, PRINT_STR__VALUE);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__STATEMENT);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__CONDITION);
		createEReference(ifEClass, IF__THEN);
		createEReference(ifEClass, IF__ELSE);

		whileEClass = createEClass(WHILE);
		createEReference(whileEClass, WHILE__CONDITION);
		createEReference(whileEClass, WHILE__BODY);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__VARIABLES);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		integerVarEClass = createEClass(INTEGER_VAR);
		createEAttribute(integerVarEClass, INTEGER_VAR__VALUE);

		booleanVarEClass = createEClass(BOOLEAN_VAR);
		createEAttribute(booleanVarEClass, BOOLEAN_VAR__VALUE);
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
		integerEClass.getESuperTypes().add(this.getIntExpression());
		booleanEClass.getESuperTypes().add(this.getBooleanExpression());
		intOperationEClass.getESuperTypes().add(this.getIntExpression());
		equalEClass.getESuperTypes().add(this.getIntComparison());
		greaterEClass.getESuperTypes().add(this.getIntComparison());
		greaterOrEqualEClass.getESuperTypes().add(this.getIntComparison());
		lessEClass.getESuperTypes().add(this.getIntComparison());
		lessOrEqualEClass.getESuperTypes().add(this.getIntComparison());
		notEClass.getESuperTypes().add(this.getBooleanExpression());
		orEClass.getESuperTypes().add(this.getBooleanOperation());
		andEClass.getESuperTypes().add(this.getBooleanOperation());
		plusEClass.getESuperTypes().add(this.getIntOperation());
		minusEClass.getESuperTypes().add(this.getIntOperation());
		multiplyEClass.getESuperTypes().add(this.getIntOperation());
		divideEClass.getESuperTypes().add(this.getIntOperation());
		intComparisonEClass.getESuperTypes().add(this.getBooleanExpression());
		booleanOperationEClass.getESuperTypes().add(this.getBooleanExpression());
		booleanVariableRefEClass.getESuperTypes().add(this.getVariableRef());
		booleanVariableRefEClass.getESuperTypes().add(this.getBooleanExpression());
		intVariableRefEClass.getESuperTypes().add(this.getVariableRef());
		intVariableRefEClass.getESuperTypes().add(this.getIntExpression());
		booleanAssignmentEClass.getESuperTypes().add(this.getStatement());
		intAssignmentEClass.getESuperTypes().add(this.getStatement());
		printVarEClass.getESuperTypes().add(this.getStatement());
		printStrEClass.getESuperTypes().add(this.getStatement());
		integerVarEClass.getESuperTypes().add(this.getVariable());
		booleanVarEClass.getESuperTypes().add(this.getVariable());

		// Initialize classes and features; add operations and parameters
		initEClass(intExpressionEClass, IntExpression.class, "IntExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(intExpressionEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerEClass, fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteger_Value(), ecorePackage.getEInt(), "value", null, 1, 1, fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(integerEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanEClass, fr.inria.diverse.melanger.miniactionlangmt.minilang.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, fr.inria.diverse.melanger.miniactionlangmt.minilang.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(booleanEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(intOperationEClass, IntOperation.class, "IntOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntOperation_Right(), this.getIntExpression(), null, "right", null, 1, 1, IntOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntOperation_Left(), this.getIntExpression(), null, "left", null, 1, 1, IntOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalEClass, Equal.class, "Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(equalEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(greaterEClass, Greater.class, "Greater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(greaterEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(greaterOrEqualEClass, GreaterOrEqual.class, "GreaterOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(greaterOrEqualEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lessEClass, Less.class, "Less", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(lessEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lessOrEqualEClass, LessOrEqual.class, "LessOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(lessOrEqualEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_Expression(), this.getBooleanExpression(), null, "expression", null, 1, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(notEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(orEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(andEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(plusEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(minusEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(multiplyEClass, Multiply.class, "Multiply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(multiplyEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(divideEClass, Divide.class, "Divide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(divideEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(intComparisonEClass, IntComparison.class, "IntComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntComparison_Right(), this.getIntExpression(), null, "right", null, 1, 1, IntComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntComparison_Left(), this.getIntExpression(), null, "left", null, 1, 1, IntComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(booleanExpressionEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanOperationEClass, BooleanOperation.class, "BooleanOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanOperation_Left(), this.getBooleanExpression(), null, "left", null, 1, 1, BooleanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanOperation_Right(), this.getBooleanExpression(), null, "right", null, 1, 1, BooleanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVariableRefEClass, BooleanVariableRef.class, "BooleanVariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(booleanVariableRefEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(intVariableRefEClass, IntVariableRef.class, "IntVariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(intVariableRefEClass, ecorePackage.getEInt(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableRefEClass, VariableRef.class, "VariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableRef_Name(), ecorePackage.getEString(), "name", null, 1, 1, VariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(statementEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanAssignmentEClass, BooleanAssignment.class, "BooleanAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanAssignment_Variable(), this.getBooleanVariableRef(), null, "variable", null, 1, 1, BooleanAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanAssignment_Value(), this.getBooleanExpression(), null, "value", null, 1, 1, BooleanAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(booleanAssignmentEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(intAssignmentEClass, IntAssignment.class, "IntAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntAssignment_Variable(), this.getIntVariableRef(), null, "variable", null, 1, 1, IntAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntAssignment_Value(), this.getIntExpression(), null, "value", null, 1, 1, IntAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(intAssignmentEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(printVarEClass, PrintVar.class, "PrintVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrintVar_Value(), this.getVariableRef(), null, "value", null, 0, 1, PrintVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(printVarEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(printStrEClass, PrintStr.class, "PrintStr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrintStr_Value(), ecorePackage.getEString(), "value", null, 1, 1, PrintStr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(printStrEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Statement(), this.getStatement(), null, "statement", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(blockEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_Condition(), this.getBooleanExpression(), null, "condition", null, 1, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_Then(), this.getBlock(), null, "then", null, 1, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_Else(), this.getBlock(), null, "else", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhile_Condition(), this.getBooleanExpression(), null, "condition", null, 1, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhile_Body(), this.getBlock(), null, "body", null, 1, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Variables(), this.getVariable(), null, "variables", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVarEClass, IntegerVar.class, "IntegerVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerVar_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVarEClass, BooleanVar.class, "BooleanVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanVar_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (intExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (integerEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (equalEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (greaterEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (greaterOrEqualEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (lessEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (lessOrEqualEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (notEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (orEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (andEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (plusEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (minusEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (multiplyEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (divideEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanVariableRefEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (intVariableRefEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (statementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanAssignmentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (intAssignmentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (printVarEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (printStrEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (blockEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });
	}

} //MinilangPackageImpl
