/**
 */
package extension.dispatchroot.impl;

import extension.dispatchroot.DispatchrootFactory;
import extension.dispatchroot.DispatchrootPackage;
import extension.dispatchroot.SubB;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DispatchrootPackageImpl extends EPackageImpl implements DispatchrootPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subBEClass = null;

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
	 * @see extension.dispatchroot.DispatchrootPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DispatchrootPackageImpl() {
		super(eNS_URI, DispatchrootFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DispatchrootPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DispatchrootPackage init() {
		if (isInited) return (DispatchrootPackage)EPackage.Registry.INSTANCE.getEPackage(DispatchrootPackage.eNS_URI);

		// Obtain or create and register package
		DispatchrootPackageImpl theDispatchrootPackage = (DispatchrootPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DispatchrootPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DispatchrootPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDispatchrootPackage.createPackageContents();

		// Initialize created meta-data
		theDispatchrootPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDispatchrootPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DispatchrootPackage.eNS_URI, theDispatchrootPackage);
		return theDispatchrootPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getB() {
		return bEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubB() {
		return subBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchrootFactory getDispatchrootFactory() {
		return (DispatchrootFactory)getEFactoryInstance();
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
		bEClass = createEClass(B);

		subBEClass = createEClass(SUB_B);
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
		subBEClass.getESuperTypes().add(this.getB());

		// Initialize classes, features, and operations; add parameters
		initEClass(bEClass, extension.dispatchroot.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subBEClass, SubB.class, "SubB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DispatchrootPackageImpl
