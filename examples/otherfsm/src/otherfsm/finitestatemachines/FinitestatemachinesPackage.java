/**
 */
package otherfsm.finitestatemachines;

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
 * @see otherfsm.finitestatemachines.FinitestatemachinesFactory
 * @model kind="package"
 * @generated
 */
public interface FinitestatemachinesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "finitestatemachines";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.examples.fsm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "finitestatemachines";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FinitestatemachinesPackage eINSTANCE = otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl.init();

	/**
	 * The meta object id for the '{@link otherfsm.finitestatemachines.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see otherfsm.finitestatemachines.impl.NamedElementImpl
	 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link otherfsm.finitestatemachines.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see otherfsm.finitestatemachines.impl.StateMachineImpl
	 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>States2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES2 = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRANSITIONS2 = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link otherfsm.finitestatemachines.impl.State2Impl <em>State2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see otherfsm.finitestatemachines.impl.State2Impl
	 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getState2()
	 * @generated
	 */
	int STATE2 = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State Machine2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2__STATE_MACHINE2 = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial Time2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2__INITIAL_TIME2 = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Final Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2__FINAL_TIME = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>State2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>State2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link otherfsm.finitestatemachines.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see otherfsm.finitestatemachines.impl.FinalStateImpl
	 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE2__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUTGOING = STATE2__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INCOMING = STATE2__INCOMING;

	/**
	 * The feature id for the '<em><b>State Machine2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__STATE_MACHINE2 = STATE2__STATE_MACHINE2;

	/**
	 * The feature id for the '<em><b>Initial Time2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INITIAL_TIME2 = STATE2__INITIAL_TIME2;

	/**
	 * The feature id for the '<em><b>Final Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__FINAL_TIME = STATE2__FINAL_TIME;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE2_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE2_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link otherfsm.finitestatemachines.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see otherfsm.finitestatemachines.impl.InitialStateImpl
	 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = STATE2__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__OUTGOING = STATE2__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__INCOMING = STATE2__INCOMING;

	/**
	 * The feature id for the '<em><b>State Machine2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__STATE_MACHINE2 = STATE2__STATE_MACHINE2;

	/**
	 * The feature id for the '<em><b>Initial Time2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__INITIAL_TIME2 = STATE2__INITIAL_TIME2;

	/**
	 * The feature id for the '<em><b>Final Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__FINAL_TIME = STATE2__FINAL_TIME;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = STATE2_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = STATE2_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link otherfsm.finitestatemachines.impl.Transition2Impl <em>Transition2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see otherfsm.finitestatemachines.impl.Transition2Impl
	 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getTransition2()
	 * @generated
	 */
	int TRANSITION2 = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2__TRIGGER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2__STATE_MACHINE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initial Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2__INITIAL_TIME = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Final Time2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2__FINAL_TIME2 = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transition2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Transition2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link otherfsm.finitestatemachines.impl.TimedTransitionImpl <em>Timed Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see otherfsm.finitestatemachines.impl.TimedTransitionImpl
	 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getTimedTransition()
	 * @generated
	 */
	int TIMED_TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION__NAME = TRANSITION2__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION__TARGET = TRANSITION2__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION__SOURCE = TRANSITION2__SOURCE;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION__TRIGGER = TRANSITION2__TRIGGER;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION__STATE_MACHINE = TRANSITION2__STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Initial Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION__INITIAL_TIME = TRANSITION2__INITIAL_TIME;

	/**
	 * The feature id for the '<em><b>Final Time2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION__FINAL_TIME2 = TRANSITION2__FINAL_TIME2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION__DURATION = TRANSITION2_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_FEATURE_COUNT = TRANSITION2_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_OPERATION_COUNT = TRANSITION2_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link otherfsm.finitestatemachines.impl.Trigger2Impl <em>Trigger2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see otherfsm.finitestatemachines.impl.Trigger2Impl
	 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getTrigger2()
	 * @generated
	 */
	int TRIGGER2 = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER2__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Trigger2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trigger2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link otherfsm.finitestatemachines.impl.PseudostateImpl <em>Pseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see otherfsm.finitestatemachines.impl.PseudostateImpl
	 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getPseudostate()
	 * @generated
	 */
	int PSEUDOSTATE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__NAME = STATE2__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__OUTGOING = STATE2__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__INCOMING = STATE2__INCOMING;

	/**
	 * The feature id for the '<em><b>State Machine2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__STATE_MACHINE2 = STATE2__STATE_MACHINE2;

	/**
	 * The feature id for the '<em><b>Initial Time2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__INITIAL_TIME2 = STATE2__INITIAL_TIME2;

	/**
	 * The feature id for the '<em><b>Final Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__FINAL_TIME = STATE2__FINAL_TIME;

	/**
	 * The number of structural features of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_FEATURE_COUNT = STATE2_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_OPERATION_COUNT = STATE2_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link otherfsm.finitestatemachines.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see otherfsm.finitestatemachines.impl.ForkImpl
	 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getFork()
	 * @generated
	 */
	int FORK = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = PSEUDOSTATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__OUTGOING = PSEUDOSTATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__INCOMING = PSEUDOSTATE__INCOMING;

	/**
	 * The feature id for the '<em><b>State Machine2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__STATE_MACHINE2 = PSEUDOSTATE__STATE_MACHINE2;

	/**
	 * The feature id for the '<em><b>Initial Time2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__INITIAL_TIME2 = PSEUDOSTATE__INITIAL_TIME2;

	/**
	 * The feature id for the '<em><b>Final Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__FINAL_TIME = PSEUDOSTATE__FINAL_TIME;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = PSEUDOSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = PSEUDOSTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link otherfsm.finitestatemachines.impl.Join2Impl <em>Join2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see otherfsm.finitestatemachines.impl.Join2Impl
	 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getJoin2()
	 * @generated
	 */
	int JOIN2 = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN2__NAME = PSEUDOSTATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN2__OUTGOING = PSEUDOSTATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN2__INCOMING = PSEUDOSTATE__INCOMING;

	/**
	 * The feature id for the '<em><b>State Machine2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN2__STATE_MACHINE2 = PSEUDOSTATE__STATE_MACHINE2;

	/**
	 * The feature id for the '<em><b>Initial Time2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN2__INITIAL_TIME2 = PSEUDOSTATE__INITIAL_TIME2;

	/**
	 * The feature id for the '<em><b>Final Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN2__FINAL_TIME = PSEUDOSTATE__FINAL_TIME;

	/**
	 * The number of structural features of the '<em>Join2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN2_FEATURE_COUNT = PSEUDOSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN2_OPERATION_COUNT = PSEUDOSTATE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link otherfsm.finitestatemachines.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see otherfsm.finitestatemachines.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link otherfsm.finitestatemachines.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see otherfsm.finitestatemachines.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link otherfsm.finitestatemachines.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see otherfsm.finitestatemachines.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link otherfsm.finitestatemachines.StateMachine#getStates2 <em>States2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States2</em>'.
	 * @see otherfsm.finitestatemachines.StateMachine#getStates2()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States2();

	/**
	 * Returns the meta object for the containment reference list '{@link otherfsm.finitestatemachines.StateMachine#getTransitions2 <em>Transitions2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions2</em>'.
	 * @see otherfsm.finitestatemachines.StateMachine#getTransitions2()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Transitions2();

	/**
	 * Returns the meta object for class '{@link otherfsm.finitestatemachines.State2 <em>State2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State2</em>'.
	 * @see otherfsm.finitestatemachines.State2
	 * @generated
	 */
	EClass getState2();

	/**
	 * Returns the meta object for the reference list '{@link otherfsm.finitestatemachines.State2#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see otherfsm.finitestatemachines.State2#getOutgoing()
	 * @see #getState2()
	 * @generated
	 */
	EReference getState2_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link otherfsm.finitestatemachines.State2#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see otherfsm.finitestatemachines.State2#getIncoming()
	 * @see #getState2()
	 * @generated
	 */
	EReference getState2_Incoming();

	/**
	 * Returns the meta object for the container reference '{@link otherfsm.finitestatemachines.State2#getStateMachine2 <em>State Machine2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Machine2</em>'.
	 * @see otherfsm.finitestatemachines.State2#getStateMachine2()
	 * @see #getState2()
	 * @generated
	 */
	EReference getState2_StateMachine2();

	/**
	 * Returns the meta object for the attribute '{@link otherfsm.finitestatemachines.State2#getInitialTime2 <em>Initial Time2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Time2</em>'.
	 * @see otherfsm.finitestatemachines.State2#getInitialTime2()
	 * @see #getState2()
	 * @generated
	 */
	EAttribute getState2_InitialTime2();

	/**
	 * Returns the meta object for the attribute '{@link otherfsm.finitestatemachines.State2#getFinalTime <em>Final Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Time</em>'.
	 * @see otherfsm.finitestatemachines.State2#getFinalTime()
	 * @see #getState2()
	 * @generated
	 */
	EAttribute getState2_FinalTime();

	/**
	 * Returns the meta object for class '{@link otherfsm.finitestatemachines.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see otherfsm.finitestatemachines.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link otherfsm.finitestatemachines.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see otherfsm.finitestatemachines.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link otherfsm.finitestatemachines.Transition2 <em>Transition2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition2</em>'.
	 * @see otherfsm.finitestatemachines.Transition2
	 * @generated
	 */
	EClass getTransition2();

	/**
	 * Returns the meta object for the reference '{@link otherfsm.finitestatemachines.Transition2#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see otherfsm.finitestatemachines.Transition2#getTarget()
	 * @see #getTransition2()
	 * @generated
	 */
	EReference getTransition2_Target();

	/**
	 * Returns the meta object for the reference '{@link otherfsm.finitestatemachines.Transition2#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see otherfsm.finitestatemachines.Transition2#getSource()
	 * @see #getTransition2()
	 * @generated
	 */
	EReference getTransition2_Source();

	/**
	 * Returns the meta object for the containment reference '{@link otherfsm.finitestatemachines.Transition2#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see otherfsm.finitestatemachines.Transition2#getTrigger()
	 * @see #getTransition2()
	 * @generated
	 */
	EReference getTransition2_Trigger();

	/**
	 * Returns the meta object for the container reference '{@link otherfsm.finitestatemachines.Transition2#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Machine</em>'.
	 * @see otherfsm.finitestatemachines.Transition2#getStateMachine()
	 * @see #getTransition2()
	 * @generated
	 */
	EReference getTransition2_StateMachine();

	/**
	 * Returns the meta object for the attribute '{@link otherfsm.finitestatemachines.Transition2#getInitialTime <em>Initial Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Time</em>'.
	 * @see otherfsm.finitestatemachines.Transition2#getInitialTime()
	 * @see #getTransition2()
	 * @generated
	 */
	EAttribute getTransition2_InitialTime();

	/**
	 * Returns the meta object for the attribute '{@link otherfsm.finitestatemachines.Transition2#getFinalTime2 <em>Final Time2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Time2</em>'.
	 * @see otherfsm.finitestatemachines.Transition2#getFinalTime2()
	 * @see #getTransition2()
	 * @generated
	 */
	EAttribute getTransition2_FinalTime2();

	/**
	 * Returns the meta object for class '{@link otherfsm.finitestatemachines.TimedTransition <em>Timed Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Transition</em>'.
	 * @see otherfsm.finitestatemachines.TimedTransition
	 * @generated
	 */
	EClass getTimedTransition();

	/**
	 * Returns the meta object for the attribute '{@link otherfsm.finitestatemachines.TimedTransition#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see otherfsm.finitestatemachines.TimedTransition#getDuration()
	 * @see #getTimedTransition()
	 * @generated
	 */
	EAttribute getTimedTransition_Duration();

	/**
	 * Returns the meta object for class '{@link otherfsm.finitestatemachines.Trigger2 <em>Trigger2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger2</em>'.
	 * @see otherfsm.finitestatemachines.Trigger2
	 * @generated
	 */
	EClass getTrigger2();

	/**
	 * Returns the meta object for the attribute '{@link otherfsm.finitestatemachines.Trigger2#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see otherfsm.finitestatemachines.Trigger2#getExpression()
	 * @see #getTrigger2()
	 * @generated
	 */
	EAttribute getTrigger2_Expression();

	/**
	 * Returns the meta object for class '{@link otherfsm.finitestatemachines.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudostate</em>'.
	 * @see otherfsm.finitestatemachines.Pseudostate
	 * @generated
	 */
	EClass getPseudostate();

	/**
	 * Returns the meta object for class '{@link otherfsm.finitestatemachines.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see otherfsm.finitestatemachines.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for class '{@link otherfsm.finitestatemachines.Join2 <em>Join2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join2</em>'.
	 * @see otherfsm.finitestatemachines.Join2
	 * @generated
	 */
	EClass getJoin2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FinitestatemachinesFactory getFinitestatemachinesFactory();

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
		 * The meta object literal for the '{@link otherfsm.finitestatemachines.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see otherfsm.finitestatemachines.impl.NamedElementImpl
		 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link otherfsm.finitestatemachines.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see otherfsm.finitestatemachines.impl.StateMachineImpl
		 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>States2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES2 = eINSTANCE.getStateMachine_States2();

		/**
		 * The meta object literal for the '<em><b>Transitions2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__TRANSITIONS2 = eINSTANCE.getStateMachine_Transitions2();

		/**
		 * The meta object literal for the '{@link otherfsm.finitestatemachines.impl.State2Impl <em>State2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see otherfsm.finitestatemachines.impl.State2Impl
		 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getState2()
		 * @generated
		 */
		EClass STATE2 = eINSTANCE.getState2();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE2__OUTGOING = eINSTANCE.getState2_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE2__INCOMING = eINSTANCE.getState2_Incoming();

		/**
		 * The meta object literal for the '<em><b>State Machine2</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE2__STATE_MACHINE2 = eINSTANCE.getState2_StateMachine2();

		/**
		 * The meta object literal for the '<em><b>Initial Time2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE2__INITIAL_TIME2 = eINSTANCE.getState2_InitialTime2();

		/**
		 * The meta object literal for the '<em><b>Final Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE2__FINAL_TIME = eINSTANCE.getState2_FinalTime();

		/**
		 * The meta object literal for the '{@link otherfsm.finitestatemachines.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see otherfsm.finitestatemachines.impl.FinalStateImpl
		 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link otherfsm.finitestatemachines.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see otherfsm.finitestatemachines.impl.InitialStateImpl
		 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link otherfsm.finitestatemachines.impl.Transition2Impl <em>Transition2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see otherfsm.finitestatemachines.impl.Transition2Impl
		 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getTransition2()
		 * @generated
		 */
		EClass TRANSITION2 = eINSTANCE.getTransition2();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION2__TARGET = eINSTANCE.getTransition2_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION2__SOURCE = eINSTANCE.getTransition2_Source();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION2__TRIGGER = eINSTANCE.getTransition2_Trigger();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION2__STATE_MACHINE = eINSTANCE.getTransition2_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Initial Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION2__INITIAL_TIME = eINSTANCE.getTransition2_InitialTime();

		/**
		 * The meta object literal for the '<em><b>Final Time2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION2__FINAL_TIME2 = eINSTANCE.getTransition2_FinalTime2();

		/**
		 * The meta object literal for the '{@link otherfsm.finitestatemachines.impl.TimedTransitionImpl <em>Timed Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see otherfsm.finitestatemachines.impl.TimedTransitionImpl
		 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getTimedTransition()
		 * @generated
		 */
		EClass TIMED_TRANSITION = eINSTANCE.getTimedTransition();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_TRANSITION__DURATION = eINSTANCE.getTimedTransition_Duration();

		/**
		 * The meta object literal for the '{@link otherfsm.finitestatemachines.impl.Trigger2Impl <em>Trigger2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see otherfsm.finitestatemachines.impl.Trigger2Impl
		 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getTrigger2()
		 * @generated
		 */
		EClass TRIGGER2 = eINSTANCE.getTrigger2();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER2__EXPRESSION = eINSTANCE.getTrigger2_Expression();

		/**
		 * The meta object literal for the '{@link otherfsm.finitestatemachines.impl.PseudostateImpl <em>Pseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see otherfsm.finitestatemachines.impl.PseudostateImpl
		 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getPseudostate()
		 * @generated
		 */
		EClass PSEUDOSTATE = eINSTANCE.getPseudostate();

		/**
		 * The meta object literal for the '{@link otherfsm.finitestatemachines.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see otherfsm.finitestatemachines.impl.ForkImpl
		 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '{@link otherfsm.finitestatemachines.impl.Join2Impl <em>Join2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see otherfsm.finitestatemachines.impl.Join2Impl
		 * @see otherfsm.finitestatemachines.impl.FinitestatemachinesPackageImpl#getJoin2()
		 * @generated
		 */
		EClass JOIN2 = eINSTANCE.getJoin2();

	}

} //FinitestatemachinesPackage
