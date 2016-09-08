/**
 */
package toppkg.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import toppkg.ClassA;
import toppkg.TopClass1;
import toppkg.TopClass2;
import toppkg.ToppkgFactory;
import toppkg.ToppkgPackage;

import toppkg.subpkg1.Subpkg1Package;

import toppkg.subpkg1.impl.Subpkg1PackageImpl;

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
public class ToppkgPackageImpl extends EPackageImpl implements ToppkgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topClass1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topClass2EClass = null;

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
	 * @see toppkg.ToppkgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToppkgPackageImpl() {
		super(eNS_URI, ToppkgFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToppkgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToppkgPackage init() {
		if (isInited) return (ToppkgPackage)EPackage.Registry.INSTANCE.getEPackage(ToppkgPackage.eNS_URI);

		// Obtain or create and register package
		ToppkgPackageImpl theToppkgPackage = (ToppkgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToppkgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToppkgPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Subpkg1PackageImpl theSubpkg1Package = (Subpkg1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subpkg1Package.eNS_URI) instanceof Subpkg1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subpkg1Package.eNS_URI) : Subpkg1Package.eINSTANCE);
		Subpkg2PackageImpl theSubpkg2Package = (Subpkg2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subpkg2Package.eNS_URI) instanceof Subpkg2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subpkg2Package.eNS_URI) : Subpkg2Package.eINSTANCE);
		Subpkg3PackageImpl theSubpkg3Package = (Subpkg3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subpkg3Package.eNS_URI) instanceof Subpkg3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subpkg3Package.eNS_URI) : Subpkg3Package.eINSTANCE);

		// Create package meta-data objects
		theToppkgPackage.createPackageContents();
		theSubpkg1Package.createPackageContents();
		theSubpkg2Package.createPackageContents();
		theSubpkg3Package.createPackageContents();

		// Initialize created meta-data
		theToppkgPackage.initializePackageContents();
		theSubpkg1Package.initializePackageContents();
		theSubpkg2Package.initializePackageContents();
		theSubpkg3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToppkgPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToppkgPackage.eNS_URI, theToppkgPackage);
		return theToppkgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopClass1() {
		return topClass1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopClass1_MyTopClass2() {
		return (EReference)topClass1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopClass1_MySubPkg1Class1() {
		return (EReference)topClass1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopClass1_MySubpkg2Class1() {
		return (EReference)topClass1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopClass2() {
		return topClass2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopClass2_MyTopClass1() {
		return (EReference)topClass2EClass.getEStructuralFeatures().get(0);
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
	public EReference getClassA_ToClassA() {
		return (EReference)classAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToppkgFactory getToppkgFactory() {
		return (ToppkgFactory)getEFactoryInstance();
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
		topClass1EClass = createEClass(TOP_CLASS1);
		createEReference(topClass1EClass, TOP_CLASS1__MY_TOP_CLASS2);
		createEReference(topClass1EClass, TOP_CLASS1__MY_SUB_PKG1_CLASS1);
		createEReference(topClass1EClass, TOP_CLASS1__MY_SUBPKG2_CLASS1);

		topClass2EClass = createEClass(TOP_CLASS2);
		createEReference(topClass2EClass, TOP_CLASS2__MY_TOP_CLASS1);

		classAEClass = createEClass(CLASS_A);
		createEReference(classAEClass, CLASS_A__TO_CLASS_A);
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
		Subpkg1Package theSubpkg1Package = (Subpkg1Package)EPackage.Registry.INSTANCE.getEPackage(Subpkg1Package.eNS_URI);
		Subpkg2Package theSubpkg2Package = (Subpkg2Package)EPackage.Registry.INSTANCE.getEPackage(Subpkg2Package.eNS_URI);
		Subpkg3Package theSubpkg3Package = (Subpkg3Package)EPackage.Registry.INSTANCE.getEPackage(Subpkg3Package.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubpkg1Package);
		getESubpackages().add(theSubpkg2Package);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(topClass1EClass, TopClass1.class, "TopClass1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopClass1_MyTopClass2(), this.getTopClass2(), this.getTopClass2_MyTopClass1(), "myTopClass2", null, 0, -1, TopClass1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopClass1_MySubPkg1Class1(), theSubpkg1Package.getSubpkg1Class1(), null, "mySubPkg1Class1", null, 0, -1, TopClass1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopClass1_MySubpkg2Class1(), theSubpkg2Package.getSubpkg2Class1(), null, "mySubpkg2Class1", null, 0, -1, TopClass1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topClass2EClass, TopClass2.class, "TopClass2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopClass2_MyTopClass1(), this.getTopClass1(), this.getTopClass1_MyTopClass2(), "myTopClass1", null, 0, 1, TopClass2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classAEClass, ClassA.class, "ClassA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassA_ToClassA(), theSubpkg3Package.getClassA(), null, "toClassA", null, 0, 1, ClassA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToppkgPackageImpl
