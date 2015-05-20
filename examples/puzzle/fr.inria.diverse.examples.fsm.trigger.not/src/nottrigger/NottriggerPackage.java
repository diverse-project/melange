/**
 */
package nottrigger;

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
 * @see nottrigger.NottriggerFactory
 * @model kind="package"
 * @generated
 */
public interface NottriggerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nottrigger";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nottrigger";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nottrigger";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NottriggerPackage eINSTANCE = nottrigger.impl.NottriggerPackageImpl.init();

	/**
	 * The meta object id for the '{@link nottrigger.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nottrigger.impl.TriggerImpl
	 * @see nottrigger.impl.NottriggerPackageImpl#getTrigger()
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
	 * The meta object id for the '{@link nottrigger.impl.NotTriggerImpl <em>Not Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nottrigger.impl.NotTriggerImpl
	 * @see nottrigger.impl.NottriggerPackageImpl#getNotTrigger()
	 * @generated
	 */
	int NOT_TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER__EXPRESSION = TRIGGER__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER__NEGATED = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Eval Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER___EVAL_TRIGGER__ELIST = TRIGGER___EVAL_TRIGGER__ELIST;

	/**
	 * The number of operations of the '<em>Not Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link nottrigger.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see nottrigger.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link nottrigger.Trigger#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see nottrigger.Trigger#getExpression()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Expression();

	/**
	 * Returns the meta object for the '{@link nottrigger.Trigger#evalTrigger(org.eclipse.emf.common.util.EList) <em>Eval Trigger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Trigger</em>' operation.
	 * @see nottrigger.Trigger#evalTrigger(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTrigger__EvalTrigger__EList();

	/**
	 * Returns the meta object for class '{@link nottrigger.NotTrigger <em>Not Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Trigger</em>'.
	 * @see nottrigger.NotTrigger
	 * @generated
	 */
	EClass getNotTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link nottrigger.NotTrigger#getNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negated</em>'.
	 * @see nottrigger.NotTrigger#getNegated()
	 * @see #getNotTrigger()
	 * @generated
	 */
	EReference getNotTrigger_Negated();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NottriggerFactory getNottriggerFactory();

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
		 * The meta object literal for the '{@link nottrigger.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nottrigger.impl.TriggerImpl
		 * @see nottrigger.impl.NottriggerPackageImpl#getTrigger()
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
		 * The meta object literal for the '{@link nottrigger.impl.NotTriggerImpl <em>Not Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nottrigger.impl.NotTriggerImpl
		 * @see nottrigger.impl.NottriggerPackageImpl#getNotTrigger()
		 * @generated
		 */
		EClass NOT_TRIGGER = eINSTANCE.getNotTrigger();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_TRIGGER__NEGATED = eINSTANCE.getNotTrigger_Negated();

	}

} //NottriggerPackage
