/**
 */
package fr.inria.diverse.melanger.melangedlangmt.minifsm.util;

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
import fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage
 * @generated
 */
public class MinifsmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MinifsmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinifsmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MinifsmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinifsmSwitch<Adapter> modelSwitch =
		new MinifsmSwitch<Adapter>() {
			@Override
			public Adapter caseFSM(FSM object) {
				return createFSMAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseIntegerVar(IntegerVar object) {
				return createIntegerVarAdapter();
			}
			@Override
			public Adapter caseBooleanVar(BooleanVar object) {
				return createBooleanVarAdapter();
			}
			@Override
			public Adapter caseInteger(fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseIntExpression(IntExpression object) {
				return createIntExpressionAdapter();
			}
			@Override
			public Adapter caseBoolean(fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseEqual(Equal object) {
				return createEqualAdapter();
			}
			@Override
			public Adapter caseIntComparison(IntComparison object) {
				return createIntComparisonAdapter();
			}
			@Override
			public Adapter caseGreater(Greater object) {
				return createGreaterAdapter();
			}
			@Override
			public Adapter caseGreaterOrEqual(GreaterOrEqual object) {
				return createGreaterOrEqualAdapter();
			}
			@Override
			public Adapter caseLess(Less object) {
				return createLessAdapter();
			}
			@Override
			public Adapter caseLessOrEqual(LessOrEqual object) {
				return createLessOrEqualAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseBooleanOperation(BooleanOperation object) {
				return createBooleanOperationAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter casePlus(Plus object) {
				return createPlusAdapter();
			}
			@Override
			public Adapter caseIntOperation(IntOperation object) {
				return createIntOperationAdapter();
			}
			@Override
			public Adapter caseMinus(Minus object) {
				return createMinusAdapter();
			}
			@Override
			public Adapter caseMultiply(Multiply object) {
				return createMultiplyAdapter();
			}
			@Override
			public Adapter caseDivide(Divide object) {
				return createDivideAdapter();
			}
			@Override
			public Adapter caseBooleanVariableRef(BooleanVariableRef object) {
				return createBooleanVariableRefAdapter();
			}
			@Override
			public Adapter caseVariableRef(VariableRef object) {
				return createVariableRefAdapter();
			}
			@Override
			public Adapter caseIntVariableRef(IntVariableRef object) {
				return createIntVariableRefAdapter();
			}
			@Override
			public Adapter caseIntExpressionAspect(IntExpressionAspect object) {
				return createIntExpressionAspectAdapter();
			}
			@Override
			public Adapter caseIntegerAspect(IntegerAspect object) {
				return createIntegerAspectAdapter();
			}
			@Override
			public Adapter caseVariableRefAspect(VariableRefAspect object) {
				return createVariableRefAspectAdapter();
			}
			@Override
			public Adapter caseIntVariableRefAspect(IntVariableRefAspect object) {
				return createIntVariableRefAspectAdapter();
			}
			@Override
			public Adapter caseIntComparisonAspect(IntComparisonAspect object) {
				return createIntComparisonAspectAdapter();
			}
			@Override
			public Adapter caseLessAspect(LessAspect object) {
				return createLessAspectAdapter();
			}
			@Override
			public Adapter caseStatementAspect(StatementAspect object) {
				return createStatementAspectAdapter();
			}
			@Override
			public Adapter caseIntAssignementAspect(IntAssignementAspect object) {
				return createIntAssignementAspectAdapter();
			}
			@Override
			public Adapter caseIfAspect(IfAspect object) {
				return createIfAspectAdapter();
			}
			@Override
			public Adapter caseBooleanExpressionAspect(BooleanExpressionAspect object) {
				return createBooleanExpressionAspectAdapter();
			}
			@Override
			public Adapter caseBooleanVariableRefAspect(BooleanVariableRefAspect object) {
				return createBooleanVariableRefAspectAdapter();
			}
			@Override
			public Adapter caseBlockAspect(BlockAspect object) {
				return createBlockAspectAdapter();
			}
			@Override
			public Adapter caseIntOperationAspect(IntOperationAspect object) {
				return createIntOperationAspectAdapter();
			}
			@Override
			public Adapter casePlusAspect(PlusAspect object) {
				return createPlusAspectAdapter();
			}
			@Override
			public Adapter caseBooleanAssignemntAspect(BooleanAssignemntAspect object) {
				return createBooleanAssignemntAspectAdapter();
			}
			@Override
			public Adapter caseEqualAspect(EqualAspect object) {
				return createEqualAspectAdapter();
			}
			@Override
			public Adapter caseGreaterAspect(GreaterAspect object) {
				return createGreaterAspectAdapter();
			}
			@Override
			public Adapter caseBooleanAspect(BooleanAspect object) {
				return createBooleanAspectAdapter();
			}
			@Override
			public Adapter caseMinusAspect(MinusAspect object) {
				return createMinusAspectAdapter();
			}
			@Override
			public Adapter caseNotAspect(NotAspect object) {
				return createNotAspectAdapter();
			}
			@Override
			public Adapter caseDivideAspect(DivideAspect object) {
				return createDivideAspectAdapter();
			}
			@Override
			public Adapter caseMultiplyAspect(MultiplyAspect object) {
				return createMultiplyAspectAdapter();
			}
			@Override
			public Adapter caseLessOrEqualAspect(LessOrEqualAspect object) {
				return createLessOrEqualAspectAdapter();
			}
			@Override
			public Adapter caseGreaterOrEqualAspect(GreaterOrEqualAspect object) {
				return createGreaterOrEqualAspectAdapter();
			}
			@Override
			public Adapter caseWhileAspect(WhileAspect object) {
				return createWhileAspectAdapter();
			}
			@Override
			public Adapter caseBooleanOperationAspect(BooleanOperationAspect object) {
				return createBooleanOperationAspectAdapter();
			}
			@Override
			public Adapter caseAndAspect(AndAspect object) {
				return createAndAspectAdapter();
			}
			@Override
			public Adapter caseOrAspect(OrAspect object) {
				return createOrAspectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM
	 * @generated
	 */
	public Adapter createFSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerVar <em>Integer Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerVar
	 * @generated
	 */
	public Adapter createIntegerVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVar <em>Boolean Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVar
	 * @generated
	 */
	public Adapter createBooleanVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression <em>Int Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression
	 * @generated
	 */
	public Adapter createIntExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Equal
	 * @generated
	 */
	public Adapter createEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparison <em>Int Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparison
	 * @generated
	 */
	public Adapter createIntComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Greater
	 * @generated
	 */
	public Adapter createGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqual <em>Greater Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqual
	 * @generated
	 */
	public Adapter createGreaterOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Less
	 * @generated
	 */
	public Adapter createLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqual <em>Less Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqual
	 * @generated
	 */
	public Adapter createLessOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation <em>Boolean Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation
	 * @generated
	 */
	public Adapter createBooleanOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperation <em>Int Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperation
	 * @generated
	 */
	public Adapter createIntOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Multiply
	 * @generated
	 */
	public Adapter createMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Divide
	 * @generated
	 */
	public Adapter createDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRef <em>Boolean Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRef
	 * @generated
	 */
	public Adapter createBooleanVariableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRef
	 * @generated
	 */
	public Adapter createVariableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRef <em>Int Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRef
	 * @generated
	 */
	public Adapter createIntVariableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpressionAspect <em>Int Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpressionAspect
	 * @generated
	 */
	public Adapter createIntExpressionAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerAspect <em>Integer Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerAspect
	 * @generated
	 */
	public Adapter createIntegerAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRefAspect <em>Variable Ref Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRefAspect
	 * @generated
	 */
	public Adapter createVariableRefAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRefAspect <em>Int Variable Ref Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRefAspect
	 * @generated
	 */
	public Adapter createIntVariableRefAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparisonAspect <em>Int Comparison Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparisonAspect
	 * @generated
	 */
	public Adapter createIntComparisonAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.LessAspect <em>Less Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.LessAspect
	 * @generated
	 */
	public Adapter createLessAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.StatementAspect <em>Statement Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.StatementAspect
	 * @generated
	 */
	public Adapter createStatementAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignementAspect <em>Int Assignement Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignementAspect
	 * @generated
	 */
	public Adapter createIntAssignementAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IfAspect <em>If Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IfAspect
	 * @generated
	 */
	public Adapter createIfAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpressionAspect <em>Boolean Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpressionAspect
	 * @generated
	 */
	public Adapter createBooleanExpressionAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRefAspect <em>Boolean Variable Ref Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRefAspect
	 * @generated
	 */
	public Adapter createBooleanVariableRefAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BlockAspect <em>Block Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BlockAspect
	 * @generated
	 */
	public Adapter createBlockAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperationAspect <em>Int Operation Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperationAspect
	 * @generated
	 */
	public Adapter createIntOperationAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.PlusAspect <em>Plus Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.PlusAspect
	 * @generated
	 */
	public Adapter createPlusAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignemntAspect <em>Boolean Assignemnt Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignemntAspect
	 * @generated
	 */
	public Adapter createBooleanAssignemntAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.EqualAspect <em>Equal Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.EqualAspect
	 * @generated
	 */
	public Adapter createEqualAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterAspect <em>Greater Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterAspect
	 * @generated
	 */
	public Adapter createGreaterAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAspect <em>Boolean Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAspect
	 * @generated
	 */
	public Adapter createBooleanAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.MinusAspect <em>Minus Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinusAspect
	 * @generated
	 */
	public Adapter createMinusAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.NotAspect <em>Not Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.NotAspect
	 * @generated
	 */
	public Adapter createNotAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.DivideAspect <em>Divide Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.DivideAspect
	 * @generated
	 */
	public Adapter createDivideAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.MultiplyAspect <em>Multiply Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MultiplyAspect
	 * @generated
	 */
	public Adapter createMultiplyAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqualAspect <em>Less Or Equal Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqualAspect
	 * @generated
	 */
	public Adapter createLessOrEqualAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqualAspect <em>Greater Or Equal Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqualAspect
	 * @generated
	 */
	public Adapter createGreaterOrEqualAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.WhileAspect <em>While Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.WhileAspect
	 * @generated
	 */
	public Adapter createWhileAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperationAspect <em>Boolean Operation Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperationAspect
	 * @generated
	 */
	public Adapter createBooleanOperationAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.AndAspect <em>And Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.AndAspect
	 * @generated
	 */
	public Adapter createAndAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.OrAspect <em>Or Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.OrAspect
	 * @generated
	 */
	public Adapter createOrAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MinifsmAdapterFactory
