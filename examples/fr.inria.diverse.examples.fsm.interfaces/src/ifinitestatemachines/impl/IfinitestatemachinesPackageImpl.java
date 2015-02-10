/**
 */
package ifinitestatemachines.impl;

import ifinitestatemachines.IfinitestatemachinesFactory;
import ifinitestatemachines.IfinitestatemachinesPackage;
import ifinitestatemachines.StateMachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IfinitestatemachinesPackageImpl extends EPackageImpl implements IfinitestatemachinesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ifinitestatemachines.IfinitestatemachinesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IfinitestatemachinesPackageImpl() {
		super(eNS_URI, IfinitestatemachinesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IfinitestatemachinesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IfinitestatemachinesPackage init() {
		if (isInited) return (IfinitestatemachinesPackage)EPackage.Registry.INSTANCE.getEPackage(IfinitestatemachinesPackage.eNS_URI);

		// Obtain or create and register package
		IfinitestatemachinesPackageImpl theIfinitestatemachinesPackage = (IfinitestatemachinesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IfinitestatemachinesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IfinitestatemachinesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIfinitestatemachinesPackage.createPackageContents();

		// Initialize created meta-data
		theIfinitestatemachinesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIfinitestatemachinesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IfinitestatemachinesPackage.eNS_URI, theIfinitestatemachinesPackage);
		return theIfinitestatemachinesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Eval__Object_String() {
		return stateMachineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfinitestatemachinesFactory getIfinitestatemachinesFactory() {
		return (IfinitestatemachinesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEOperation(stateMachineEClass, STATE_MACHINE___EVAL__OBJECT_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getStateMachine__Eval__Object_String(), null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IfinitestatemachinesPackageImpl
