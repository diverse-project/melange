/**
 */
package ortrigger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ortrigger.OrtriggerFactory
 * @model kind="package"
 * @generated
 */
public interface OrtriggerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ortrigger";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ortrigger";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ortrigger";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrtriggerPackage eINSTANCE = ortrigger.impl.OrtriggerPackageImpl.init();

	/**
	 * The meta object id for the '{@link ortrigger.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ortrigger.impl.TriggerImpl
	 * @see ortrigger.impl.OrtriggerPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Eval Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER___EVAL_TRIGGER__ELIST = 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ortrigger.impl.OrTriggerImpl <em>Or Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ortrigger.impl.OrTriggerImpl
	 * @see ortrigger.impl.OrtriggerPackageImpl#getOrTrigger()
	 * @generated
	 */
	int OR_TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER__EXPRESSION = TRIGGER__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER__RIGHT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER__LEFT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Eval Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER___EVAL_TRIGGER__ELIST = TRIGGER___EVAL_TRIGGER__ELIST;

	/**
	 * The number of operations of the '<em>Or Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ortrigger.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see ortrigger.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link ortrigger.Trigger#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see ortrigger.Trigger#getExpression()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Expression();

	/**
	 * Returns the meta object for the '{@link ortrigger.Trigger#evalTrigger(org.eclipse.emf.common.util.EList) <em>Eval Trigger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Trigger</em>' operation.
	 * @see ortrigger.Trigger#evalTrigger(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTrigger__EvalTrigger__EList();

	/**
	 * Returns the meta object for class '{@link ortrigger.OrTrigger <em>Or Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Trigger</em>'.
	 * @see ortrigger.OrTrigger
	 * @generated
	 */
	EClass getOrTrigger();

	/**
	 * Returns the meta object for the reference '{@link ortrigger.OrTrigger#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see ortrigger.OrTrigger#getRight()
	 * @see #getOrTrigger()
	 * @generated
	 */
	EReference getOrTrigger_Right();

	/**
	 * Returns the meta object for the reference '{@link ortrigger.OrTrigger#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see ortrigger.OrTrigger#getLeft()
	 * @see #getOrTrigger()
	 * @generated
	 */
	EReference getOrTrigger_Left();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrtriggerFactory getOrtriggerFactory();

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
		 * The meta object literal for the '{@link ortrigger.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ortrigger.impl.TriggerImpl
		 * @see ortrigger.impl.OrtriggerPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__EXPRESSION = eINSTANCE.getTrigger_Expression();

		/**
		 * The meta object literal for the '<em><b>Eval Trigger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRIGGER___EVAL_TRIGGER__ELIST = eINSTANCE.getTrigger__EvalTrigger__EList();

		/**
		 * The meta object literal for the '{@link ortrigger.impl.OrTriggerImpl <em>Or Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ortrigger.impl.OrTriggerImpl
		 * @see ortrigger.impl.OrtriggerPackageImpl#getOrTrigger()
		 * @generated
		 */
		EClass OR_TRIGGER = eINSTANCE.getOrTrigger();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_TRIGGER__RIGHT = eINSTANCE.getOrTrigger_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_TRIGGER__LEFT = eINSTANCE.getOrTrigger_Left();

	}

} //OrtriggerPackage
