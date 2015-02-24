/**
 */
package finitestatemachinestimedcomposite.impl;

import finitestatemachinestimedcomposite.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinitestatemachinestimedcompositeFactoryImpl extends EFactoryImpl implements FinitestatemachinestimedcompositeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FinitestatemachinestimedcompositeFactory init() {
		try {
			FinitestatemachinestimedcompositeFactory theFinitestatemachinestimedcompositeFactory = (FinitestatemachinestimedcompositeFactory)EPackage.Registry.INSTANCE.getEFactory(FinitestatemachinestimedcompositePackage.eNS_URI);
			if (theFinitestatemachinestimedcompositeFactory != null) {
				return theFinitestatemachinestimedcompositeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FinitestatemachinestimedcompositeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinitestatemachinestimedcompositeFactoryImpl() {
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
			case FinitestatemachinestimedcompositePackage.NAMED_ELEMENT: return createNamedElement();
			case FinitestatemachinestimedcompositePackage.STATE_MACHINE: return createStateMachine();
			case FinitestatemachinestimedcompositePackage.STATE: return createState();
			case FinitestatemachinestimedcompositePackage.FINAL_STATE: return createFinalState();
			case FinitestatemachinestimedcompositePackage.INITIAL_STATE: return createInitialState();
			case FinitestatemachinestimedcompositePackage.TRANSITION: return createTransition();
			case FinitestatemachinestimedcompositePackage.TIMED_TRANSITION: return createTimedTransition();
			case FinitestatemachinestimedcompositePackage.TRIGGER: return createTrigger();
			case FinitestatemachinestimedcompositePackage.PSEUDOSTATE: return createPseudostate();
			case FinitestatemachinestimedcompositePackage.FORK: return createFork();
			case FinitestatemachinestimedcompositePackage.JOIN: return createJoin();
			case FinitestatemachinestimedcompositePackage.COMPOSITE_STATE: return createCompositeState();
			case FinitestatemachinestimedcompositePackage.REGION: return createRegion();
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
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
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
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
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
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
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
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeState createCompositeState() {
		CompositeStateImpl compositeState = new CompositeStateImpl();
		return compositeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinitestatemachinestimedcompositePackage getFinitestatemachinestimedcompositePackage() {
		return (FinitestatemachinestimedcompositePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FinitestatemachinestimedcompositePackage getPackage() {
		return FinitestatemachinestimedcompositePackage.eINSTANCE;
	}

} //FinitestatemachinestimedcompositeFactoryImpl
