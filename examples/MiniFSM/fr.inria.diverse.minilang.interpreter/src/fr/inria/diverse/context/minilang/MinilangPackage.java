/**
 */
package fr.inria.diverse.context.minilang;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.context.minilang.MinilangFactory
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
	String eNS_URI = "http://minilang/context/";

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
	MinilangPackage eINSTANCE = fr.inria.diverse.context.minilang.impl.MinilangPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.context.minilang.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.context.minilang.impl.ContextImpl
	 * @see fr.inria.diverse.context.minilang.impl.MinilangPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

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
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.context.minilang.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.context.minilang.impl.VariableImpl
	 * @see fr.inria.diverse.context.minilang.impl.MinilangPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

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
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.context.minilang.impl.IntegerVarImpl <em>Integer Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.context.minilang.impl.IntegerVarImpl
	 * @see fr.inria.diverse.context.minilang.impl.MinilangPackageImpl#getIntegerVar()
	 * @generated
	 */
	int INTEGER_VAR = 2;

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
	 * The number of operations of the '<em>Integer Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VAR_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.context.minilang.impl.BooleanVarImpl <em>Boolean Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.context.minilang.impl.BooleanVarImpl
	 * @see fr.inria.diverse.context.minilang.impl.MinilangPackageImpl#getBooleanVar()
	 * @generated
	 */
	int BOOLEAN_VAR = 3;

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
	 * The number of operations of the '<em>Boolean Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VAR_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.context.minilang.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see fr.inria.diverse.context.minilang.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.context.minilang.Context#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see fr.inria.diverse.context.minilang.Context#getVariables()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Variables();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.context.minilang.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.inria.diverse.context.minilang.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.context.minilang.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.context.minilang.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.context.minilang.IntegerVar <em>Integer Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Var</em>'.
	 * @see fr.inria.diverse.context.minilang.IntegerVar
	 * @generated
	 */
	EClass getIntegerVar();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.context.minilang.IntegerVar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.context.minilang.IntegerVar#getValue()
	 * @see #getIntegerVar()
	 * @generated
	 */
	EAttribute getIntegerVar_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.context.minilang.BooleanVar <em>Boolean Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Var</em>'.
	 * @see fr.inria.diverse.context.minilang.BooleanVar
	 * @generated
	 */
	EClass getBooleanVar();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.context.minilang.BooleanVar#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.context.minilang.BooleanVar#isValue()
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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.context.minilang.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.context.minilang.impl.ContextImpl
		 * @see fr.inria.diverse.context.minilang.impl.MinilangPackageImpl#getContext()
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
		 * The meta object literal for the '{@link fr.inria.diverse.context.minilang.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.context.minilang.impl.VariableImpl
		 * @see fr.inria.diverse.context.minilang.impl.MinilangPackageImpl#getVariable()
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
		 * The meta object literal for the '{@link fr.inria.diverse.context.minilang.impl.IntegerVarImpl <em>Integer Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.context.minilang.impl.IntegerVarImpl
		 * @see fr.inria.diverse.context.minilang.impl.MinilangPackageImpl#getIntegerVar()
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
		 * The meta object literal for the '{@link fr.inria.diverse.context.minilang.impl.BooleanVarImpl <em>Boolean Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.context.minilang.impl.BooleanVarImpl
		 * @see fr.inria.diverse.context.minilang.impl.MinilangPackageImpl#getBooleanVar()
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
