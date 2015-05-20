/**
 */
package simpleconstraintslanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see simpleconstraintslanguage.SimpleconstraintslanguageFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleconstraintslanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simpleconstraintslanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://simpleconstraintslanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simpleconstraintslanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleconstraintslanguagePackage eINSTANCE = simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link simpleconstraintslanguage.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraintslanguage.impl.ConstraintImpl
	 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleconstraintslanguage.impl.RelationalConstraintImpl <em>Relational Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraintslanguage.impl.RelationalConstraintImpl
	 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getRelationalConstraint()
	 * @generated
	 */
	int RELATIONAL_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT__LEFT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT__RIGHT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT__OPERATOR = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relational Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleconstraintslanguage.impl.CExpressionImpl <em>CExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraintslanguage.impl.CExpressionImpl
	 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getCExpression()
	 * @generated
	 */
	int CEXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>CExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>CExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleconstraintslanguage.impl.CLiteralImpl <em>CLiteral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraintslanguage.impl.CLiteralImpl
	 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getCLiteral()
	 * @generated
	 */
	int CLITERAL = 3;

	/**
	 * The number of structural features of the '<em>CLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLITERAL_FEATURE_COUNT = CEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLITERAL_OPERATION_COUNT = CEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleconstraintslanguage.impl.CIntegerImpl <em>CInteger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraintslanguage.impl.CIntegerImpl
	 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getCInteger()
	 * @generated
	 */
	int CINTEGER = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTEGER__VALUE = CLITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CInteger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTEGER_FEATURE_COUNT = CLITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CInteger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTEGER_OPERATION_COUNT = CLITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleconstraintslanguage.impl.CVarRefImpl <em>CVar Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraintslanguage.impl.CVarRefImpl
	 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getCVarRef()
	 * @generated
	 */
	int CVAR_REF = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVAR_REF__NAME = CEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CVar Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVAR_REF_FEATURE_COUNT = CEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CVar Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVAR_REF_OPERATION_COUNT = CEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleconstraintslanguage.CRelationalOperator <em>CRelational Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleconstraintslanguage.CRelationalOperator
	 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getCRelationalOperator()
	 * @generated
	 */
	int CRELATIONAL_OPERATOR = 6;


	/**
	 * Returns the meta object for class '{@link simpleconstraintslanguage.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see simpleconstraintslanguage.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link simpleconstraintslanguage.RelationalConstraint <em>Relational Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Constraint</em>'.
	 * @see simpleconstraintslanguage.RelationalConstraint
	 * @generated
	 */
	EClass getRelationalConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link simpleconstraintslanguage.RelationalConstraint#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see simpleconstraintslanguage.RelationalConstraint#getLeft()
	 * @see #getRelationalConstraint()
	 * @generated
	 */
	EReference getRelationalConstraint_Left();

	/**
	 * Returns the meta object for the containment reference '{@link simpleconstraintslanguage.RelationalConstraint#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see simpleconstraintslanguage.RelationalConstraint#getRight()
	 * @see #getRelationalConstraint()
	 * @generated
	 */
	EReference getRelationalConstraint_Right();

	/**
	 * Returns the meta object for the attribute '{@link simpleconstraintslanguage.RelationalConstraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see simpleconstraintslanguage.RelationalConstraint#getOperator()
	 * @see #getRelationalConstraint()
	 * @generated
	 */
	EAttribute getRelationalConstraint_Operator();

	/**
	 * Returns the meta object for class '{@link simpleconstraintslanguage.CExpression <em>CExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CExpression</em>'.
	 * @see simpleconstraintslanguage.CExpression
	 * @generated
	 */
	EClass getCExpression();

	/**
	 * Returns the meta object for class '{@link simpleconstraintslanguage.CLiteral <em>CLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLiteral</em>'.
	 * @see simpleconstraintslanguage.CLiteral
	 * @generated
	 */
	EClass getCLiteral();

	/**
	 * Returns the meta object for class '{@link simpleconstraintslanguage.CInteger <em>CInteger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CInteger</em>'.
	 * @see simpleconstraintslanguage.CInteger
	 * @generated
	 */
	EClass getCInteger();

	/**
	 * Returns the meta object for the attribute '{@link simpleconstraintslanguage.CInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see simpleconstraintslanguage.CInteger#getValue()
	 * @see #getCInteger()
	 * @generated
	 */
	EAttribute getCInteger_Value();

	/**
	 * Returns the meta object for class '{@link simpleconstraintslanguage.CVarRef <em>CVar Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CVar Ref</em>'.
	 * @see simpleconstraintslanguage.CVarRef
	 * @generated
	 */
	EClass getCVarRef();

	/**
	 * Returns the meta object for the attribute '{@link simpleconstraintslanguage.CVarRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleconstraintslanguage.CVarRef#getName()
	 * @see #getCVarRef()
	 * @generated
	 */
	EAttribute getCVarRef_Name();

	/**
	 * Returns the meta object for enum '{@link simpleconstraintslanguage.CRelationalOperator <em>CRelational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CRelational Operator</em>'.
	 * @see simpleconstraintslanguage.CRelationalOperator
	 * @generated
	 */
	EEnum getCRelationalOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleconstraintslanguageFactory getSimpleconstraintslanguageFactory();

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
		 * The meta object literal for the '{@link simpleconstraintslanguage.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraintslanguage.impl.ConstraintImpl
		 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link simpleconstraintslanguage.impl.RelationalConstraintImpl <em>Relational Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraintslanguage.impl.RelationalConstraintImpl
		 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getRelationalConstraint()
		 * @generated
		 */
		EClass RELATIONAL_CONSTRAINT = eINSTANCE.getRelationalConstraint();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONSTRAINT__LEFT = eINSTANCE.getRelationalConstraint_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONSTRAINT__RIGHT = eINSTANCE.getRelationalConstraint_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_CONSTRAINT__OPERATOR = eINSTANCE.getRelationalConstraint_Operator();

		/**
		 * The meta object literal for the '{@link simpleconstraintslanguage.impl.CExpressionImpl <em>CExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraintslanguage.impl.CExpressionImpl
		 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getCExpression()
		 * @generated
		 */
		EClass CEXPRESSION = eINSTANCE.getCExpression();

		/**
		 * The meta object literal for the '{@link simpleconstraintslanguage.impl.CLiteralImpl <em>CLiteral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraintslanguage.impl.CLiteralImpl
		 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getCLiteral()
		 * @generated
		 */
		EClass CLITERAL = eINSTANCE.getCLiteral();

		/**
		 * The meta object literal for the '{@link simpleconstraintslanguage.impl.CIntegerImpl <em>CInteger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraintslanguage.impl.CIntegerImpl
		 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getCInteger()
		 * @generated
		 */
		EClass CINTEGER = eINSTANCE.getCInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CINTEGER__VALUE = eINSTANCE.getCInteger_Value();

		/**
		 * The meta object literal for the '{@link simpleconstraintslanguage.impl.CVarRefImpl <em>CVar Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraintslanguage.impl.CVarRefImpl
		 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getCVarRef()
		 * @generated
		 */
		EClass CVAR_REF = eINSTANCE.getCVarRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVAR_REF__NAME = eINSTANCE.getCVarRef_Name();

		/**
		 * The meta object literal for the '{@link simpleconstraintslanguage.CRelationalOperator <em>CRelational Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleconstraintslanguage.CRelationalOperator
		 * @see simpleconstraintslanguage.impl.SimpleconstraintslanguagePackageImpl#getCRelationalOperator()
		 * @generated
		 */
		EEnum CRELATIONAL_OPERATOR = eINSTANCE.getCRelationalOperator();

	}

} //SimpleconstraintslanguagePackage
