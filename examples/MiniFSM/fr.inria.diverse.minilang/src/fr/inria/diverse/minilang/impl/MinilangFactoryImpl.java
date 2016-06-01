/**
 */
package fr.inria.diverse.minilang.impl;

import fr.inria.diverse.minilang.And;
import fr.inria.diverse.minilang.Block;
import fr.inria.diverse.minilang.BooleanAssignemnt;
import fr.inria.diverse.minilang.BooleanExpression;
import fr.inria.diverse.minilang.BooleanOperation;
import fr.inria.diverse.minilang.BooleanVariableRef;
import fr.inria.diverse.minilang.Divide;
import fr.inria.diverse.minilang.Equal;
import fr.inria.diverse.minilang.Greater;
import fr.inria.diverse.minilang.GreaterOrEqual;
import fr.inria.diverse.minilang.If;
import fr.inria.diverse.minilang.IntAssignement;
import fr.inria.diverse.minilang.IntComparison;
import fr.inria.diverse.minilang.IntExpression;
import fr.inria.diverse.minilang.IntOperation;
import fr.inria.diverse.minilang.IntVariableRef;
import fr.inria.diverse.minilang.Less;
import fr.inria.diverse.minilang.LessOrEqual;
import fr.inria.diverse.minilang.MinilangFactory;
import fr.inria.diverse.minilang.MinilangPackage;
import fr.inria.diverse.minilang.Minus;
import fr.inria.diverse.minilang.Multiply;
import fr.inria.diverse.minilang.Not;
import fr.inria.diverse.minilang.Or;
import fr.inria.diverse.minilang.Plus;
import fr.inria.diverse.minilang.PrintStr;
import fr.inria.diverse.minilang.PrintVar;
import fr.inria.diverse.minilang.Statement;
import fr.inria.diverse.minilang.VariableRef;

import fr.inria.diverse.minilang.While;
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
public class MinilangFactoryImpl extends EFactoryImpl implements MinilangFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MinilangFactory init() {
		try {
			MinilangFactory theMinilangFactory = (MinilangFactory)EPackage.Registry.INSTANCE.getEFactory(MinilangPackage.eNS_URI);
			if (theMinilangFactory != null) {
				return theMinilangFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MinilangFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinilangFactoryImpl() {
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
			case MinilangPackage.INT_EXPRESSION: return createIntExpression();
			case MinilangPackage.INTEGER: return createInteger();
			case MinilangPackage.BOOLEAN: return createBoolean();
			case MinilangPackage.INT_OPERATION: return createIntOperation();
			case MinilangPackage.EQUAL: return createEqual();
			case MinilangPackage.GREATER: return createGreater();
			case MinilangPackage.GREATER_OR_EQUAL: return createGreaterOrEqual();
			case MinilangPackage.LESS: return createLess();
			case MinilangPackage.LESS_OR_EQUAL: return createLessOrEqual();
			case MinilangPackage.NOT: return createNot();
			case MinilangPackage.OR: return createOr();
			case MinilangPackage.AND: return createAnd();
			case MinilangPackage.PLUS: return createPlus();
			case MinilangPackage.MINUS: return createMinus();
			case MinilangPackage.MULTIPLY: return createMultiply();
			case MinilangPackage.DIVIDE: return createDivide();
			case MinilangPackage.INT_COMPARISON: return createIntComparison();
			case MinilangPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case MinilangPackage.BOOLEAN_OPERATION: return createBooleanOperation();
			case MinilangPackage.BOOLEAN_VARIABLE_REF: return createBooleanVariableRef();
			case MinilangPackage.INT_VARIABLE_REF: return createIntVariableRef();
			case MinilangPackage.VARIABLE_REF: return createVariableRef();
			case MinilangPackage.STATEMENT: return createStatement();
			case MinilangPackage.BOOLEAN_ASSIGNEMNT: return createBooleanAssignemnt();
			case MinilangPackage.INT_ASSIGNEMENT: return createIntAssignement();
			case MinilangPackage.PRINT_VAR: return createPrintVar();
			case MinilangPackage.PRINT_STR: return createPrintStr();
			case MinilangPackage.BLOCK: return createBlock();
			case MinilangPackage.IF: return createIf();
			case MinilangPackage.WHILE: return createWhile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression createIntExpression() {
		IntExpressionImpl intExpression = new IntExpressionImpl();
		return intExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.diverse.minilang.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.diverse.minilang.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntOperation createIntOperation() {
		IntOperationImpl intOperation = new IntOperationImpl();
		return intOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Greater createGreater() {
		GreaterImpl greater = new GreaterImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterOrEqual createGreaterOrEqual() {
		GreaterOrEqualImpl greaterOrEqual = new GreaterOrEqualImpl();
		return greaterOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Less createLess() {
		LessImpl less = new LessImpl();
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessOrEqual createLessOrEqual() {
		LessOrEqualImpl lessOrEqual = new LessOrEqualImpl();
		return lessOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiply createMultiply() {
		MultiplyImpl multiply = new MultiplyImpl();
		return multiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Divide createDivide() {
		DivideImpl divide = new DivideImpl();
		return divide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntComparison createIntComparison() {
		IntComparisonImpl intComparison = new IntComparisonImpl();
		return intComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression createBooleanExpression() {
		BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperation createBooleanOperation() {
		BooleanOperationImpl booleanOperation = new BooleanOperationImpl();
		return booleanOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableRef createBooleanVariableRef() {
		BooleanVariableRefImpl booleanVariableRef = new BooleanVariableRefImpl();
		return booleanVariableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVariableRef createIntVariableRef() {
		IntVariableRefImpl intVariableRef = new IntVariableRefImpl();
		return intVariableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef createVariableRef() {
		VariableRefImpl variableRef = new VariableRefImpl();
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAssignemnt createBooleanAssignemnt() {
		BooleanAssignemntImpl booleanAssignemnt = new BooleanAssignemntImpl();
		return booleanAssignemnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntAssignement createIntAssignement() {
		IntAssignementImpl intAssignement = new IntAssignementImpl();
		return intAssignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintVar createPrintVar() {
		PrintVarImpl printVar = new PrintVarImpl();
		return printVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintStr createPrintStr() {
		PrintStrImpl printStr = new PrintStrImpl();
		return printStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinilangPackage getMinilangPackage() {
		return (MinilangPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MinilangPackage getPackage() {
		return MinilangPackage.eINSTANCE;
	}

} //MinilangFactoryImpl
