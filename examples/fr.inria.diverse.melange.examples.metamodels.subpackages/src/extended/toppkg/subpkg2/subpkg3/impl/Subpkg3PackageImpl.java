/**
 */
package extended.toppkg.subpkg2.subpkg3.impl;

import extended.toppkg.ToppkgPackage;

import extended.toppkg.impl.ToppkgPackageImpl;

import extended.toppkg.subpkg1.Subpkg1Package;

import extended.toppkg.subpkg1.impl.Subpkg1PackageImpl;

import extended.toppkg.subpkg2.Subpkg2Package;

import extended.toppkg.subpkg2.impl.Subpkg2PackageImpl;

import extended.toppkg.subpkg2.subpkg3.ClassA;
import extended.toppkg.subpkg2.subpkg3.Subpkg3Class1;
import extended.toppkg.subpkg2.subpkg3.Subpkg3Class2;
import extended.toppkg.subpkg2.subpkg3.Subpkg3Factory;
import extended.toppkg.subpkg2.subpkg3.Subpkg3Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Subpkg3PackageImpl extends EPackageImpl implements Subpkg3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subpkg3Class1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subpkg3Class2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAEClass = null;

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
	 * @see extended.toppkg.subpkg2.subpkg3.Subpkg3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Subpkg3PackageImpl() {
		super(eNS_URI, Subpkg3Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Subpkg3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Subpkg3Package init() {
		if (isInited) return (Subpkg3Package)EPackage.Registry.INSTANCE.getEPackage(Subpkg3Package.eNS_URI);

		// Obtain or create and register package
		Subpkg3PackageImpl theSubpkg3Package = (Subpkg3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Subpkg3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Subpkg3PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ToppkgPackageImpl theToppkgPackage = (ToppkgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToppkgPackage.eNS_URI) instanceof ToppkgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToppkgPackage.eNS_URI) : ToppkgPackage.eINSTANCE);
		Subpkg1PackageImpl theSubpkg1Package = (Subpkg1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subpkg1Package.eNS_URI) instanceof Subpkg1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subpkg1Package.eNS_URI) : Subpkg1Package.eINSTANCE);
		Subpkg2PackageImpl theSubpkg2Package = (Subpkg2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subpkg2Package.eNS_URI) instanceof Subpkg2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subpkg2Package.eNS_URI) : Subpkg2Package.eINSTANCE);

		// Create package meta-data objects
		theSubpkg3Package.createPackageContents();
		theToppkgPackage.createPackageContents();
		theSubpkg1Package.createPackageContents();
		theSubpkg2Package.createPackageContents();

		// Initialize created meta-data
		theSubpkg3Package.initializePackageContents();
		theToppkgPackage.initializePackageContents();
		theSubpkg1Package.initializePackageContents();
		theSubpkg2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubpkg3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Subpkg3Package.eNS_URI, theSubpkg3Package);
		return theSubpkg3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubpkg3Class1() {
		return subpkg3Class1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubpkg3Class1_MySubpkg3Class2() {
		return (EReference)subpkg3Class1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubpkg3Class2() {
		return subpkg3Class2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassA() {
		return classAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg3Factory getSubpkg3Factory() {
		return (Subpkg3Factory)getEFactoryInstance();
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
		subpkg3Class1EClass = createEClass(SUBPKG3_CLASS1);
		createEReference(subpkg3Class1EClass, SUBPKG3_CLASS1__MY_SUBPKG3_CLASS2);

		subpkg3Class2EClass = createEClass(SUBPKG3_CLASS2);

		classAEClass = createEClass(CLASS_A);
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
		initEClass(subpkg3Class1EClass, Subpkg3Class1.class, "Subpkg3Class1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubpkg3Class1_MySubpkg3Class2(), this.getSubpkg3Class2(), null, "mySubpkg3Class2", null, 0, -1, Subpkg3Class1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subpkg3Class2EClass, Subpkg3Class2.class, "Subpkg3Class2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classAEClass, ClassA.class, "ClassA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //Subpkg3PackageImpl
