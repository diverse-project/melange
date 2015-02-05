/**
 */
package kmlogo.impl;

import kmlogo.KmlogoFactory;
import kmlogo.KmlogoPackage;

import kmlogo.asm.AsmPackage;

import kmlogo.asm.impl.AsmPackageImpl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KmlogoPackageImpl extends EPackageImpl implements KmlogoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

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
	 * @see kmlogo.KmlogoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KmlogoPackageImpl() {
		super(eNS_URI, KmlogoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KmlogoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KmlogoPackage init() {
		if (isInited) return (KmlogoPackage)EPackage.Registry.INSTANCE.getEPackage(KmlogoPackage.eNS_URI);

		// Obtain or create and register package
		KmlogoPackageImpl theKmlogoPackage = (KmlogoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KmlogoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KmlogoPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AsmPackageImpl theAsmPackage = (AsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AsmPackage.eNS_URI) instanceof AsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AsmPackage.eNS_URI) : AsmPackage.eINSTANCE);

		// Create package meta-data objects
		theKmlogoPackage.createPackageContents();
		theAsmPackage.createPackageContents();

		// Initialize created meta-data
		theKmlogoPackage.initializePackageContents();
		theAsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKmlogoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KmlogoPackage.eNS_URI, theKmlogoPackage);
		return theKmlogoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmlogoFactory getKmlogoFactory() {
		return (KmlogoFactory)getEFactoryInstance();
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

		// Create data types
		integerEDataType = createEDataType(INTEGER);
		booleanEDataType = createEDataType(BOOLEAN);
		stringEDataType = createEDataType(STRING);
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

		// Obtain other dependent packages
		AsmPackage theAsmPackage = (AsmPackage)EPackage.Registry.INSTANCE.getEPackage(AsmPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAsmPackage);

		// Initialize data types
		initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KmlogoPackageImpl
