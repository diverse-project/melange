/**
 */
package otherfsm.finitestatemachines.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import otherfsm.finitestatemachines.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinitestatemachinesFactoryImpl extends EFactoryImpl implements FinitestatemachinesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FinitestatemachinesFactory init() {
		try {
			FinitestatemachinesFactory theFinitestatemachinesFactory = (FinitestatemachinesFactory)EPackage.Registry.INSTANCE.getEFactory(FinitestatemachinesPackage.eNS_URI);
			if (theFinitestatemachinesFactory != null) {
				return theFinitestatemachinesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FinitestatemachinesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinitestatemachinesFactoryImpl() {
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
			case FinitestatemachinesPackage.NAMED_ELEMENT: return createNamedElement();
			case FinitestatemachinesPackage.STATE_MACHINE: return createStateMachine();
			case FinitestatemachinesPackage.STATE2: return createState2();
			case FinitestatemachinesPackage.FINAL_STATE: return createFinalState();
			case FinitestatemachinesPackage.INITIAL_STATE: return createInitialState();
			case FinitestatemachinesPackage.TRANSITION2: return createTransition2();
			case FinitestatemachinesPackage.TIMED_TRANSITION: return createTimedTransition();
			case FinitestatemachinesPackage.TRIGGER2: return createTrigger2();
			case FinitestatemachinesPackage.PSEUDOSTATE: return createPseudostate();
			case FinitestatemachinesPackage.FORK: return createFork();
			case FinitestatemachinesPackage.JOIN2: return createJoin2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State2 createState2() {
		State2Impl state2 = new State2Impl();
		return state2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition2 createTransition2() {
		Transition2Impl transition2 = new Transition2Impl();
		return transition2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedTransition createTimedTransition() {
		TimedTransitionImpl timedTransition = new TimedTransitionImpl();
		return timedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger2 createTrigger2() {
		Trigger2Impl trigger2 = new Trigger2Impl();
		return trigger2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate createPseudostate() {
		PseudostateImpl pseudostate = new PseudostateImpl();
		return pseudostate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fork createFork() {
		ForkImpl fork = new ForkImpl();
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join2 createJoin2() {
		Join2Impl join2 = new Join2Impl();
		return join2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinitestatemachinesPackage getFinitestatemachinesPackage() {
		return (FinitestatemachinesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FinitestatemachinesPackage getPackage() {
		return FinitestatemachinesPackage.eINSTANCE;
	}

} //FinitestatemachinesFactoryImpl
