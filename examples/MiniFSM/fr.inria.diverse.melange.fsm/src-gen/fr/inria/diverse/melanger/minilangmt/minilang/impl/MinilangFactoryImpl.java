/**
 */
package fr.inria.diverse.melanger.minilangmt.minilang.impl;

import fr.inria.diverse.melanger.minilangmt.minilang.And;
import fr.inria.diverse.melanger.minilangmt.minilang.Block;
import fr.inria.diverse.melanger.minilangmt.minilang.BooleanAssignemnt;
import fr.inria.diverse.melanger.minilangmt.minilang.BooleanExpression;
import fr.inria.diverse.melanger.minilangmt.minilang.BooleanOperation;
import fr.inria.diverse.melanger.minilangmt.minilang.BooleanVariableRef;
import fr.inria.diverse.melanger.minilangmt.minilang.Divide;
import fr.inria.diverse.melanger.minilangmt.minilang.Equal;
import fr.inria.diverse.melanger.minilangmt.minilang.Greater;
import fr.inria.diverse.melanger.minilangmt.minilang.GreaterOrEqual;
import fr.inria.diverse.melanger.minilangmt.minilang.If;
import fr.inria.diverse.melanger.minilangmt.minilang.IntAssignement;
import fr.inria.diverse.melanger.minilangmt.minilang.IntComparison;
import fr.inria.diverse.melanger.minilangmt.minilang.IntExpression;
import fr.inria.diverse.melanger.minilangmt.minilang.IntOperation;
import fr.inria.diverse.melanger.minilangmt.minilang.IntVariableRef;
import fr.inria.diverse.melanger.minilangmt.minilang.Less;
import fr.inria.diverse.melanger.minilangmt.minilang.LessOrEqual;
import fr.inria.diverse.melanger.minilangmt.minilang.MinilangFactory;
import fr.inria.diverse.melanger.minilangmt.minilang.MinilangPackage;
import fr.inria.diverse.melanger.minilangmt.minilang.Minus;
import fr.inria.diverse.melanger.minilangmt.minilang.Multiply;
import fr.inria.diverse.melanger.minilangmt.minilang.Not;
import fr.inria.diverse.melanger.minilangmt.minilang.Or;
import fr.inria.diverse.melanger.minilangmt.minilang.Plus;
import fr.inria.diverse.melanger.minilangmt.minilang.PrintStr;
import fr.inria.diverse.melanger.minilangmt.minilang.PrintVar;
import fr.inria.diverse.melanger.minilangmt.minilang.Statement;
import fr.inria.diverse.melanger.minilangmt.minilang.VariableRef;
import fr.inria.diverse.melanger.minilangmt.minilang.While;

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
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.diverse.melanger.minilangmt.minilang.Integer createInteger() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.diverse.melanger.minilangmt.minilang.Boolean createBoolean() {
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
	public IntComparison createIntComparison() {
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
	public BooleanAssignemnt createBooleanAssignemnt() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntAssignement createIntAssignement() {
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
