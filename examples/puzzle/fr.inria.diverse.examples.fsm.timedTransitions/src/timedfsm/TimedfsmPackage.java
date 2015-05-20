/**
 */
package timedfsm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see timedfsm.TimedfsmFactory
 * @model kind="package"
 * @generated
 */
public interface TimedfsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timedfsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://timedfsm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "timedfsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimedfsmPackage eINSTANCE = timedfsm.impl.TimedfsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link timedfsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see timedfsm.impl.TransitionImpl
	 * @see timedfsm.impl.TimedfsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Eval Transition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EVAL_TRANSITION__MAP = 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link timedfsm.impl.TimedTransitionImpl <em>Timed Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see timedfsm.impl.TimedTransitionImpl
	 * @see timedfsm.impl.TimedfsmPackageImpl#getTimedTransition()
	 * @generated
	 */
	int TIMED_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION__TIME = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Eval Transition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION___EVAL_TRANSITION__MAP = TRANSITION___EVAL_TRANSITION__MAP;

	/**
	 * The number of operations of the '<em>Timed Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link timedfsm.TimedTransition <em>Timed Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Transition</em>'.
	 * @see timedfsm.TimedTransition
	 * @generated
	 */
	EClass getTimedTransition();

	/**
	 * Returns the meta object for the attribute '{@link timedfsm.TimedTransition#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see timedfsm.TimedTransition#getTime()
	 * @see #getTimedTransition()
	 * @generated
	 */
	EAttribute getTimedTransition_Time();

	/**
	 * Returns the meta object for class '{@link timedfsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see timedfsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the '{@link timedfsm.Transition#evalTransition(java.util.Map) <em>Eval Transition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval Transition</em>' operation.
	 * @see timedfsm.Transition#evalTransition(java.util.Map)
	 * @generated
	 */
	EOperation getTransition__EvalTransition__Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimedfsmFactory getTimedfsmFactory();

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
		 * The meta object literal for the '{@link timedfsm.impl.TimedTransitionImpl <em>Timed Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see timedfsm.impl.TimedTransitionImpl
		 * @see timedfsm.impl.TimedfsmPackageImpl#getTimedTransition()
		 * @generated
		 */
		EClass TIMED_TRANSITION = eINSTANCE.getTimedTransition();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_TRANSITION__TIME = eINSTANCE.getTimedTransition_Time();

		/**
		 * The meta object literal for the '{@link timedfsm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see timedfsm.impl.TransitionImpl
		 * @see timedfsm.impl.TimedfsmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Eval Transition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___EVAL_TRANSITION__MAP = eINSTANCE.getTransition__EvalTransition__Map();

	}

} //TimedfsmPackage
