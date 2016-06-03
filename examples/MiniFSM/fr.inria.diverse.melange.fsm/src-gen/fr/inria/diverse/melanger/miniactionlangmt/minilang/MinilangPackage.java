/**
 */
package fr.inria.diverse.melanger.miniactionlangmt.minilang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangFactory
 * @model kind="package"
 * @generated
 */
public interface MinilangPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "minilang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://miniactionlangmt/minilang/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "minilang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinilangPackage eINSTANCE = fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntExpressionImpl <em>Int Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntExpressionImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIntExpression()
	 * @generated
	 */
	int INT_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Int Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntegerImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = INT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanExpressionImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 17;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntOperationImpl <em>Int Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntOperationImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIntOperation()
	 * @generated
	 */
	int INT_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION__RIGHT = INT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION__LEFT = INT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntComparisonImpl <em>Int Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntComparisonImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIntComparison()
	 * @generated
	 */
	int INT_COMPARISON = 16;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_COMPARISON__RIGHT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_COMPARISON__LEFT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_COMPARISON_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.EqualImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 4;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__RIGHT = INT_COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__LEFT = INT_COMPARISON__LEFT;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = INT_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.GreaterImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 5;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__RIGHT = INT_COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__LEFT = INT_COMPARISON__LEFT;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = INT_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.GreaterOrEqualImpl <em>Greater Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.GreaterOrEqualImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getGreaterOrEqual()
	 * @generated
	 */
	int GREATER_OR_EQUAL = 6;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL__RIGHT = INT_COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL__LEFT = INT_COMPARISON__LEFT;

	/**
	 * The number of structural features of the '<em>Greater Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_FEATURE_COUNT = INT_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.LessImpl <em>Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.LessImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getLess()
	 * @generated
	 */
	int LESS = 7;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__RIGHT = INT_COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__LEFT = INT_COMPARISON__LEFT;

	/**
	 * The number of structural features of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = INT_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.LessOrEqualImpl <em>Less Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.LessOrEqualImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getLessOrEqual()
	 * @generated
	 */
	int LESS_OR_EQUAL = 8;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL__RIGHT = INT_COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL__LEFT = INT_COMPARISON__LEFT;

	/**
	 * The number of structural features of the '<em>Less Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_FEATURE_COUNT = INT_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.NotImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 9;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXPRESSION = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanOperationImpl <em>Boolean Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanOperationImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBooleanOperation()
	 * @generated
	 */
	int BOOLEAN_OPERATION = 18;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__LEFT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__RIGHT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.OrImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getOr()
	 * @generated
	 */
	int OR = 10;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = BOOLEAN_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = BOOLEAN_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOLEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.AndImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 11;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = BOOLEAN_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = BOOLEAN_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOLEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.PlusImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 12;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT = INT_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT = INT_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = INT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinusImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 13;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__RIGHT = INT_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__LEFT = INT_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = INT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MultiplyImpl <em>Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MultiplyImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getMultiply()
	 * @generated
	 */
	int MULTIPLY = 14;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__RIGHT = INT_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__LEFT = INT_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FEATURE_COUNT = INT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.DivideImpl <em>Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.DivideImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getDivide()
	 * @generated
	 */
	int DIVIDE = 15;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__RIGHT = INT_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__LEFT = INT_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_FEATURE_COUNT = INT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.VariableRefImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanVariableRefImpl <em>Boolean Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanVariableRefImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBooleanVariableRef()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_REF = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_REF__NAME = VARIABLE_REF__NAME;

	/**
	 * The number of structural features of the '<em>Boolean Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_REF_FEATURE_COUNT = VARIABLE_REF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntVariableRefImpl <em>Int Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntVariableRefImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIntVariableRef()
	 * @generated
	 */
	int INT_VARIABLE_REF = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VARIABLE_REF__NAME = VARIABLE_REF__NAME;

	/**
	 * The number of structural features of the '<em>Int Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VARIABLE_REF_FEATURE_COUNT = VARIABLE_REF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.StatementImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 22;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanAssignmentImpl <em>Boolean Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanAssignmentImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBooleanAssignment()
	 * @generated
	 */
	int BOOLEAN_ASSIGNMENT = 23;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGNMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGNMENT__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntAssignmentImpl <em>Int Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntAssignmentImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIntAssignment()
	 * @generated
	 */
	int INT_ASSIGNMENT = 24;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ASSIGNMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ASSIGNMENT__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.PrintVarImpl <em>Print Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.PrintVarImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getPrintVar()
	 * @generated
	 */
	int PRINT_VAR = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_VAR__VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_VAR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.PrintStrImpl <em>Print Str</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.PrintStrImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getPrintStr()
	 * @generated
	 */
	int PRINT_STR = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STR__VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print Str</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BlockImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 27;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IfImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIf()
	 * @generated
	 */
	int IF = 28;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN = 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.WhileImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 29;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BODY = 1;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.ContextImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 30;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.VariableImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntegerVarImpl <em>Integer Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntegerVarImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIntegerVar()
	 * @generated
	 */
	int INTEGER_VAR = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VAR__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VAR__VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VAR_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanVarImpl <em>Boolean Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanVarImpl
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBooleanVar()
	 * @generated
	 */
	int BOOLEAN_VAR = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VAR__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VAR__VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VAR_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntExpression <em>Int Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Expression</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntExpression
	 * @generated
	 */
	EClass getIntExpression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer#getValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Boolean#isValue()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntOperation <em>Int Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Operation</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntOperation
	 * @generated
	 */
	EClass getIntOperation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntOperation#getRight()
	 * @see #getIntOperation()
	 * @generated
	 */
	EReference getIntOperation_Right();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntOperation#getLeft()
	 * @see #getIntOperation()
	 * @generated
	 */
	EReference getIntOperation_Left();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.GreaterOrEqual <em>Greater Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Or Equal</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.GreaterOrEqual
	 * @generated
	 */
	EClass getGreaterOrEqual();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Less
	 * @generated
	 */
	EClass getLess();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.LessOrEqual <em>Less Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Or Equal</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.LessOrEqual
	 * @generated
	 */
	EClass getLessOrEqual();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Not#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Not#getExpression()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Expression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Multiply
	 * @generated
	 */
	EClass getMultiply();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Divide
	 * @generated
	 */
	EClass getDivide();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntComparison <em>Int Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Comparison</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntComparison
	 * @generated
	 */
	EClass getIntComparison();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntComparison#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntComparison#getRight()
	 * @see #getIntComparison()
	 * @generated
	 */
	EReference getIntComparison_Right();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntComparison#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntComparison#getLeft()
	 * @see #getIntComparison()
	 * @generated
	 */
	EReference getIntComparison_Left();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanOperation <em>Boolean Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operation</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanOperation
	 * @generated
	 */
	EClass getBooleanOperation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanOperation#getLeft()
	 * @see #getBooleanOperation()
	 * @generated
	 */
	EReference getBooleanOperation_Left();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanOperation#getRight()
	 * @see #getBooleanOperation()
	 * @generated
	 */
	EReference getBooleanOperation_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanVariableRef <em>Boolean Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Ref</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanVariableRef
	 * @generated
	 */
	EClass getBooleanVariableRef();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntVariableRef <em>Int Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Variable Ref</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntVariableRef
	 * @generated
	 */
	EClass getIntVariableRef();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.VariableRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.VariableRef#getName()
	 * @see #getVariableRef()
	 * @generated
	 */
	EAttribute getVariableRef_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanAssignment <em>Boolean Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Assignment</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanAssignment
	 * @generated
	 */
	EClass getBooleanAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanAssignment#getVariable()
	 * @see #getBooleanAssignment()
	 * @generated
	 */
	EReference getBooleanAssignment_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanAssignment#getValue()
	 * @see #getBooleanAssignment()
	 * @generated
	 */
	EReference getBooleanAssignment_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntAssignment <em>Int Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Assignment</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntAssignment
	 * @generated
	 */
	EClass getIntAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntAssignment#getVariable()
	 * @see #getIntAssignment()
	 * @generated
	 */
	EReference getIntAssignment_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntAssignment#getValue()
	 * @see #getIntAssignment()
	 * @generated
	 */
	EReference getIntAssignment_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintVar <em>Print Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print Var</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintVar
	 * @generated
	 */
	EClass getPrintVar();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintVar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintVar#getValue()
	 * @see #getPrintVar()
	 * @generated
	 */
	EReference getPrintVar_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintStr <em>Print Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print Str</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintStr
	 * @generated
	 */
	EClass getPrintStr();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintStr#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintStr#getValue()
	 * @see #getPrintStr()
	 * @generated
	 */
	EAttribute getPrintStr_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Block#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Block#getStatement()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statement();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.If#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.If#getThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Then();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.While#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.While#getCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Condition();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.While#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.While#getBody()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Body();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Context#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Context#getVariables()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Variables();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntegerVar <em>Integer Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Var</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntegerVar
	 * @generated
	 */
	EClass getIntegerVar();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.IntegerVar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.IntegerVar#getValue()
	 * @see #getIntegerVar()
	 * @generated
	 */
	EAttribute getIntegerVar_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanVar <em>Boolean Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Var</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanVar
	 * @generated
	 */
	EClass getBooleanVar();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanVar#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanVar#isValue()
	 * @see #getBooleanVar()
	 * @generated
	 */
	EAttribute getBooleanVar_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MinilangFactory getMinilangFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntExpressionImpl <em>Int Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntExpressionImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIntExpression()
		 * @generated
		 */
		EClass INT_EXPRESSION = eINSTANCE.getIntExpression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntegerImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__VALUE = eINSTANCE.getBoolean_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntOperationImpl <em>Int Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntOperationImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIntOperation()
		 * @generated
		 */
		EClass INT_OPERATION = eINSTANCE.getIntOperation();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_OPERATION__RIGHT = eINSTANCE.getIntOperation_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_OPERATION__LEFT = eINSTANCE.getIntOperation_Left();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.EqualImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.GreaterImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.GreaterOrEqualImpl <em>Greater Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.GreaterOrEqualImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getGreaterOrEqual()
		 * @generated
		 */
		EClass GREATER_OR_EQUAL = eINSTANCE.getGreaterOrEqual();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.LessImpl <em>Less</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.LessImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getLess()
		 * @generated
		 */
		EClass LESS = eINSTANCE.getLess();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.LessOrEqualImpl <em>Less Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.LessOrEqualImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getLessOrEqual()
		 * @generated
		 */
		EClass LESS_OR_EQUAL = eINSTANCE.getLessOrEqual();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.NotImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__EXPRESSION = eINSTANCE.getNot_Expression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.OrImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.AndImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.PlusImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinusImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MultiplyImpl <em>Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MultiplyImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getMultiply()
		 * @generated
		 */
		EClass MULTIPLY = eINSTANCE.getMultiply();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.DivideImpl <em>Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.DivideImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getDivide()
		 * @generated
		 */
		EClass DIVIDE = eINSTANCE.getDivide();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntComparisonImpl <em>Int Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntComparisonImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIntComparison()
		 * @generated
		 */
		EClass INT_COMPARISON = eINSTANCE.getIntComparison();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_COMPARISON__RIGHT = eINSTANCE.getIntComparison_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_COMPARISON__LEFT = eINSTANCE.getIntComparison_Left();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanExpressionImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanOperationImpl <em>Boolean Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanOperationImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBooleanOperation()
		 * @generated
		 */
		EClass BOOLEAN_OPERATION = eINSTANCE.getBooleanOperation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_OPERATION__LEFT = eINSTANCE.getBooleanOperation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_OPERATION__RIGHT = eINSTANCE.getBooleanOperation_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanVariableRefImpl <em>Boolean Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanVariableRefImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBooleanVariableRef()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_REF = eINSTANCE.getBooleanVariableRef();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntVariableRefImpl <em>Int Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntVariableRefImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIntVariableRef()
		 * @generated
		 */
		EClass INT_VARIABLE_REF = eINSTANCE.getIntVariableRef();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.VariableRefImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_REF__NAME = eINSTANCE.getVariableRef_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.StatementImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanAssignmentImpl <em>Boolean Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanAssignmentImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBooleanAssignment()
		 * @generated
		 */
		EClass BOOLEAN_ASSIGNMENT = eINSTANCE.getBooleanAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_ASSIGNMENT__VARIABLE = eINSTANCE.getBooleanAssignment_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_ASSIGNMENT__VALUE = eINSTANCE.getBooleanAssignment_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntAssignmentImpl <em>Int Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntAssignmentImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIntAssignment()
		 * @generated
		 */
		EClass INT_ASSIGNMENT = eINSTANCE.getIntAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_ASSIGNMENT__VARIABLE = eINSTANCE.getIntAssignment_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_ASSIGNMENT__VALUE = eINSTANCE.getIntAssignment_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.PrintVarImpl <em>Print Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.PrintVarImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getPrintVar()
		 * @generated
		 */
		EClass PRINT_VAR = eINSTANCE.getPrintVar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT_VAR__VALUE = eINSTANCE.getPrintVar_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.PrintStrImpl <em>Print Str</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.PrintStrImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getPrintStr()
		 * @generated
		 */
		EClass PRINT_STR = eINSTANCE.getPrintStr();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT_STR__VALUE = eINSTANCE.getPrintStr_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BlockImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENT = eINSTANCE.getBlock_Statement();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IfImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN = eINSTANCE.getIf_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.WhileImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__CONDITION = eINSTANCE.getWhile_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__BODY = eINSTANCE.getWhile_Body();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.ContextImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__VARIABLES = eINSTANCE.getContext_Variables();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.VariableImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntegerVarImpl <em>Integer Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.IntegerVarImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getIntegerVar()
		 * @generated
		 */
		EClass INTEGER_VAR = eINSTANCE.getIntegerVar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VAR__VALUE = eINSTANCE.getIntegerVar_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanVarImpl <em>Boolean Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.BooleanVarImpl
		 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.impl.MinilangPackageImpl#getBooleanVar()
		 * @generated
		 */
		EClass BOOLEAN_VAR = eINSTANCE.getBooleanVar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VAR__VALUE = eINSTANCE.getBooleanVar_Value();

	}

} //MinilangPackage
