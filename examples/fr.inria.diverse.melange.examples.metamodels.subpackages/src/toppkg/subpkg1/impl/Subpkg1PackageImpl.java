/**
 */
package toppkg.subpkg1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import toppkg.ToppkgPackage;

import toppkg.impl.ToppkgPackageImpl;

import toppkg.subpkg1.Subpkg1Class1;
import toppkg.subpkg1.Subpkg1Class2;
import toppkg.subpkg1.Subpkg1Factory;
import toppkg.subpkg1.Subpkg1Package;

import toppkg.subpkg2.Subpkg2Package;

import toppkg.subpkg2.impl.Subpkg2PackageImpl;

import toppkg.subpkg2.subpkg3.Subpkg3Package;

import toppkg.subpkg2.subpkg3.impl.Subpkg3PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Subpkg1PackageImpl extends EPackageImpl implements Subpkg1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subpkg1Class1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subpkg1Class2EClass = null;

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
	 * @see toppkg.subpkg1.Subpkg1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Subpkg1PackageImpl() {
		super(eNS_URI, Subpkg1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Subpkg1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Subpkg1Package init() {
		if (isInited) return (Subpkg1Package)EPackage.Registry.INSTANCE.getEPackage(Subpkg1Package.eNS_URI);

		// Obtain or create and register package
		Subpkg1PackageImpl theSubpkg1Package = (Subpkg1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Subpkg1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Subpkg1PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ToppkgPackageImpl theToppkgPackage = (ToppkgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToppkgPackage.eNS_URI) instanceof ToppkgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToppkgPackage.eNS_URI) : ToppkgPackage.eINSTANCE);
		Subpkg2PackageImpl theSubpkg2Package = (Subpkg2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subpkg2Package.eNS_URI) instanceof Subpkg2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subpkg2Package.eNS_URI) : Subpkg2Package.eINSTANCE);
		Subpkg3PackageImpl theSubpkg3Package = (Subpkg3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subpkg3Package.eNS_URI) instanceof Subpkg3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subpkg3Package.eNS_URI) : Subpkg3Package.eINSTANCE);

		// Create package meta-data objects
		theSubpkg1Package.createPackageContents();
		theToppkgPackage.createPackageContents();
		theSubpkg2Package.createPackageContents();
		theSubpkg3Package.createPackageContents();

		// Initialize created meta-data
		theSubpkg1Package.initializePackageContents();
		theToppkgPackage.initializePackageContents();
		theSubpkg2Package.initializePackageContents();
		theSubpkg3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubpkg1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Subpkg1Package.eNS_URI, theSubpkg1Package);
		return theSubpkg1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubpkg1Class1() {
		return subpkg1Class1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubpkg1Class1_MySubpkg1Class2() {
		return (EReference)subpkg1Class1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubpkg1Class2() {
		return subpkg1Class2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg1Factory getSubpkg1Factory() {
		return (Subpkg1Factory)getEFactoryInstance();
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
		subpkg1Class1EClass = createEClass(SUBPKG1_CLASS1);
		createEReference(subpkg1Class1EClass, SUBPKG1_CLASS1__MY_SUBPKG1_CLASS2);

		subpkg1Class2EClass = createEClass(SUBPKG1_CLASS2);
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
		initEClass(subpkg1Class1EClass, Subpkg1Class1.class, "Subpkg1Class1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubpkg1Class1_MySubpkg1Class2(), this.getSubpkg1Class2(), null, "mySubpkg1Class2", null, 0, -1, Subpkg1Class1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subpkg1Class2EClass, Subpkg1Class2.class, "Subpkg1Class2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //Subpkg1PackageImpl
