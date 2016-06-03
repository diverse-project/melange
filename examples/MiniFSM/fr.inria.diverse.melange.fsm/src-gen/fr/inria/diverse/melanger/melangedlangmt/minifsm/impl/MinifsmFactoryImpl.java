/**
 */
package fr.inria.diverse.melanger.melangedlangmt.minifsm.impl;

import fr.inria.diverse.melanger.melangedlangmt.minifsm.And;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Block;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignment;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpression;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVar;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRef;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Context;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Divide;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Equal;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.FinalState;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Greater;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqual;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignment;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparison;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperation;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRef;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerVar;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Less;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqual;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmFactory;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Minus;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Multiply;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Not;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Or;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Plus;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintStr;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintVar;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.State;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Statement;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Variable;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRef;

import org.eclipse.emf.ecore.EClass;
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
public class MinifsmFactoryImpl extends EFactoryImpl implements MinifsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MinifsmFactory init() {
		try {
			MinifsmFactory theMinifsmFactory = (MinifsmFactory)EPackage.Registry.INSTANCE.getEFactory(MinifsmPackage.eNS_URI);
			if (theMinifsmFactory != null) {
				return theMinifsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MinifsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinifsmFactoryImpl() {
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
			case MinifsmPackage.FSM: return createFSM();
			case MinifsmPackage.STATE: return createState();
			case MinifsmPackage.FINAL_STATE: return createFinalState();
			case MinifsmPackage.TRANSITION: return createTransition();
			case MinifsmPackage.CONDITION: return createCondition();
			case MinifsmPackage.INTEGER: return createInteger();
			case MinifsmPackage.INT_EXPRESSION: return createIntExpression();
			case MinifsmPackage.CONTEXT: return createContext();
			case MinifsmPackage.VARIABLE: return createVariable();
			case MinifsmPackage.BOOLEAN: return createBoolean();
			case MinifsmPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case MinifsmPackage.EQUAL: return createEqual();
			case MinifsmPackage.INT_COMPARISON: return createIntComparison();
			case MinifsmPackage.GREATER: return createGreater();
			case MinifsmPackage.GREATER_OR_EQUAL: return createGreaterOrEqual();
			case MinifsmPackage.LESS: return createLess();
			case MinifsmPackage.LESS_OR_EQUAL: return createLessOrEqual();
			case MinifsmPackage.NOT: return createNot();
			case MinifsmPackage.OR: return createOr();
			case MinifsmPackage.BOOLEAN_OPERATION: return createBooleanOperation();
			case MinifsmPackage.AND: return createAnd();
			case MinifsmPackage.PLUS: return createPlus();
			case MinifsmPackage.INT_OPERATION: return createIntOperation();
			case MinifsmPackage.MINUS: return createMinus();
			case MinifsmPackage.MULTIPLY: return createMultiply();
			case MinifsmPackage.DIVIDE: return createDivide();
			case MinifsmPackage.BOOLEAN_VARIABLE_REF: return createBooleanVariableRef();
			case MinifsmPackage.VARIABLE_REF: return createVariableRef();
			case MinifsmPackage.INT_VARIABLE_REF: return createIntVariableRef();
			case MinifsmPackage.BOOLEAN_ASSIGNMENT: return createBooleanAssignment();
			case MinifsmPackage.STATEMENT: return createStatement();
			case MinifsmPackage.INT_ASSIGNMENT: return createIntAssignment();
			case MinifsmPackage.PRINT_VAR: return createPrintVar();
			case MinifsmPackage.PRINT_STR: return createPrintStr();
			case MinifsmPackage.BLOCK: return createBlock();
			case MinifsmPackage.INTEGER_VAR: return createIntegerVar();
			case MinifsmPackage.BOOLEAN_VAR: return createBooleanVar();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM createFSM() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer createInteger() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression createIntExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean createBoolean() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression createBooleanExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntComparison createIntComparison() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Greater createGreater() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterOrEqual createGreaterOrEqual() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Less createLess() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessOrEqual createLessOrEqual() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperation createBooleanOperation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntOperation createIntOperation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minus createMinus() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiply createMultiply() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Divide createDivide() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableRef createBooleanVariableRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef createVariableRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVariableRef createIntVariableRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAssignment createBooleanAssignment() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntAssignment createIntAssignment() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintVar createPrintVar() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintStr createPrintStr() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVar createIntegerVar() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVar createBooleanVar() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinifsmPackage getMinifsmPackage() {
		return (MinifsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MinifsmPackage getPackage() {
		return MinifsmPackage.eINSTANCE;
	}

} //MinifsmFactoryImpl
