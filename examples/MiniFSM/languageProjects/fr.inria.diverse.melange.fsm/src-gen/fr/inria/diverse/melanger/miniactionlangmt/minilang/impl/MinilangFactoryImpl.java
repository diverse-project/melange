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
			case MinilangPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case MinilangPackage.BOOLEAN_OPERATION: return createBooleanOperation();
			case MinilangPackage.BOOLEAN_VARIABLE_REF: return createBooleanVariableRef();
			case MinilangPackage.INT_VARIABLE_REF: return createIntVariableRef();
			case MinilangPackage.VARIABLE_REF: return createVariableRef();
			case MinilangPackage.STATEMENT: return createStatement();
			case MinilangPackage.BOOLEAN_ASSIGNMENT: return createBooleanAssignment();
			case MinilangPackage.INT_ASSIGNMENT: return createIntAssignment();
			case MinilangPackage.PRINT_VAR: return createPrintVar();
			case MinilangPackage.PRINT_STR: return createPrintStr();
			case MinilangPackage.BLOCK: return createBlock();
			case MinilangPackage.IF: return createIf();
			case MinilangPackage.WHILE: return createWhile();
			case MinilangPackage.CONTEXT: return createContext();
			case MinilangPackage.VARIABLE: return createVariable();
			case MinilangPackage.INTEGER_VAR: return createIntegerVar();
			case MinilangPackage.BOOLEAN_VAR: return createBooleanVar();
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
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer createInteger() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.diverse.melanger.miniactionlangmt.minilang.Boolean createBoolean() {
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
	public Equal createEqual() {
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
	public BooleanExpression createBooleanExpression() {
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
	public BooleanVariableRef createBooleanVariableRef() {
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
	public VariableRef createVariableRef() {
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
	public BooleanAssignment createBooleanAssignment() {
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
	public If createIf() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
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
