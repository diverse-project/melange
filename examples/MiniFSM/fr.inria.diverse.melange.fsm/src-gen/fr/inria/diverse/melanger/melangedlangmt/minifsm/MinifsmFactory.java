/**
 */
package fr.inria.diverse.melanger.melangedlangmt.minifsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage
 * @generated
 */
public interface MinifsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinifsmFactory eINSTANCE = fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM</em>'.
	 * @generated
	 */
	FSM createFSM();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final State</em>'.
	 * @generated
	 */
	FinalState createFinalState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Integer Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Var</em>'.
	 * @generated
	 */
	IntegerVar createIntegerVar();

	/**
	 * Returns a new object of class '<em>Boolean Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Var</em>'.
	 * @generated
	 */
	BooleanVar createBooleanVar();

	/**
	 * Returns a new object of class '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer</em>'.
	 * @generated
	 */
	Integer createInteger();

	/**
	 * Returns a new object of class '<em>Int Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Expression</em>'.
	 * @generated
	 */
	IntExpression createIntExpression();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expression</em>'.
	 * @generated
	 */
	BooleanExpression createBooleanExpression();

	/**
	 * Returns a new object of class '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal</em>'.
	 * @generated
	 */
	Equal createEqual();

	/**
	 * Returns a new object of class '<em>Int Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Comparison</em>'.
	 * @generated
	 */
	IntComparison createIntComparison();

	/**
	 * Returns a new object of class '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater</em>'.
	 * @generated
	 */
	Greater createGreater();

	/**
	 * Returns a new object of class '<em>Greater Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Or Equal</em>'.
	 * @generated
	 */
	GreaterOrEqual createGreaterOrEqual();

	/**
	 * Returns a new object of class '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less</em>'.
	 * @generated
	 */
	Less createLess();

	/**
	 * Returns a new object of class '<em>Less Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Or Equal</em>'.
	 * @generated
	 */
	LessOrEqual createLessOrEqual();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>Boolean Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Operation</em>'.
	 * @generated
	 */
	BooleanOperation createBooleanOperation();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus</em>'.
	 * @generated
	 */
	Plus createPlus();

	/**
	 * Returns a new object of class '<em>Int Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Operation</em>'.
	 * @generated
	 */
	IntOperation createIntOperation();

	/**
	 * Returns a new object of class '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minus</em>'.
	 * @generated
	 */
	Minus createMinus();

	/**
	 * Returns a new object of class '<em>Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiply</em>'.
	 * @generated
	 */
	Multiply createMultiply();

	/**
	 * Returns a new object of class '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Divide</em>'.
	 * @generated
	 */
	Divide createDivide();

	/**
	 * Returns a new object of class '<em>Boolean Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable Ref</em>'.
	 * @generated
	 */
	BooleanVariableRef createBooleanVariableRef();

	/**
	 * Returns a new object of class '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Ref</em>'.
	 * @generated
	 */
	VariableRef createVariableRef();

	/**
	 * Returns a new object of class '<em>Int Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Variable Ref</em>'.
	 * @generated
	 */
	IntVariableRef createIntVariableRef();

	/**
	 * Returns a new object of class '<em>Int Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Expression Aspect</em>'.
	 * @generated
	 */
	IntExpressionAspect createIntExpressionAspect();

	/**
	 * Returns a new object of class '<em>Integer Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Aspect</em>'.
	 * @generated
	 */
	IntegerAspect createIntegerAspect();

	/**
	 * Returns a new object of class '<em>Variable Ref Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Ref Aspect</em>'.
	 * @generated
	 */
	VariableRefAspect createVariableRefAspect();

	/**
	 * Returns a new object of class '<em>Int Variable Ref Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Variable Ref Aspect</em>'.
	 * @generated
	 */
	IntVariableRefAspect createIntVariableRefAspect();

	/**
	 * Returns a new object of class '<em>Int Comparison Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Comparison Aspect</em>'.
	 * @generated
	 */
	IntComparisonAspect createIntComparisonAspect();

	/**
	 * Returns a new object of class '<em>Less Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Aspect</em>'.
	 * @generated
	 */
	LessAspect createLessAspect();

	/**
	 * Returns a new object of class '<em>Statement Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Aspect</em>'.
	 * @generated
	 */
	StatementAspect createStatementAspect();

	/**
	 * Returns a new object of class '<em>Int Assignement Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Assignement Aspect</em>'.
	 * @generated
	 */
	IntAssignementAspect createIntAssignementAspect();

	/**
	 * Returns a new object of class '<em>If Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Aspect</em>'.
	 * @generated
	 */
	IfAspect createIfAspect();

	/**
	 * Returns a new object of class '<em>Boolean Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expression Aspect</em>'.
	 * @generated
	 */
	BooleanExpressionAspect createBooleanExpressionAspect();

	/**
	 * Returns a new object of class '<em>Boolean Variable Ref Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable Ref Aspect</em>'.
	 * @generated
	 */
	BooleanVariableRefAspect createBooleanVariableRefAspect();

	/**
	 * Returns a new object of class '<em>Block Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Aspect</em>'.
	 * @generated
	 */
	BlockAspect createBlockAspect();

	/**
	 * Returns a new object of class '<em>Int Operation Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Operation Aspect</em>'.
	 * @generated
	 */
	IntOperationAspect createIntOperationAspect();

	/**
	 * Returns a new object of class '<em>Plus Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus Aspect</em>'.
	 * @generated
	 */
	PlusAspect createPlusAspect();

	/**
	 * Returns a new object of class '<em>Boolean Assignemnt Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Assignemnt Aspect</em>'.
	 * @generated
	 */
	BooleanAssignemntAspect createBooleanAssignemntAspect();

	/**
	 * Returns a new object of class '<em>Equal Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal Aspect</em>'.
	 * @generated
	 */
	EqualAspect createEqualAspect();

	/**
	 * Returns a new object of class '<em>Greater Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Aspect</em>'.
	 * @generated
	 */
	GreaterAspect createGreaterAspect();

	/**
	 * Returns a new object of class '<em>Boolean Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Aspect</em>'.
	 * @generated
	 */
	BooleanAspect createBooleanAspect();

	/**
	 * Returns a new object of class '<em>Minus Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minus Aspect</em>'.
	 * @generated
	 */
	MinusAspect createMinusAspect();

	/**
	 * Returns a new object of class '<em>Not Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Aspect</em>'.
	 * @generated
	 */
	NotAspect createNotAspect();

	/**
	 * Returns a new object of class '<em>Divide Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Divide Aspect</em>'.
	 * @generated
	 */
	DivideAspect createDivideAspect();

	/**
	 * Returns a new object of class '<em>Multiply Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiply Aspect</em>'.
	 * @generated
	 */
	MultiplyAspect createMultiplyAspect();

	/**
	 * Returns a new object of class '<em>Less Or Equal Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Or Equal Aspect</em>'.
	 * @generated
	 */
	LessOrEqualAspect createLessOrEqualAspect();

	/**
	 * Returns a new object of class '<em>Greater Or Equal Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Or Equal Aspect</em>'.
	 * @generated
	 */
	GreaterOrEqualAspect createGreaterOrEqualAspect();

	/**
	 * Returns a new object of class '<em>While Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Aspect</em>'.
	 * @generated
	 */
	WhileAspect createWhileAspect();

	/**
	 * Returns a new object of class '<em>Boolean Operation Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Operation Aspect</em>'.
	 * @generated
	 */
	BooleanOperationAspect createBooleanOperationAspect();

	/**
	 * Returns a new object of class '<em>And Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Aspect</em>'.
	 * @generated
	 */
	AndAspect createAndAspect();

	/**
	 * Returns a new object of class '<em>Or Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Aspect</em>'.
	 * @generated
	 */
	OrAspect createOrAspect();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MinifsmPackage getMinifsmPackage();

} //MinifsmFactory
