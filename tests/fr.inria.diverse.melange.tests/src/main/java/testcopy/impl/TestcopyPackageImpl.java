/**
 */
package testcopy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import testcopy.Attributes;
import testcopy.MyEnum;
import testcopy.OppositesA;
import testcopy.OppositesB;
import testcopy.SimpleReferences;
import testcopy.TestcopyFactory;
import testcopy.TestcopyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestcopyPackageImpl extends EPackageImpl implements TestcopyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleReferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oppositesAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oppositesBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum myEnumEEnum = null;

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
	 * @see testcopy.TestcopyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestcopyPackageImpl() {
		super(eNS_URI, TestcopyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TestcopyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestcopyPackage init() {
		if (isInited) return (TestcopyPackage)EPackage.Registry.INSTANCE.getEPackage(TestcopyPackage.eNS_URI);

		// Obtain or create and register package
		TestcopyPackageImpl theTestcopyPackage = (TestcopyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestcopyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TestcopyPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTestcopyPackage.createPackageContents();

		// Initialize created meta-data
		theTestcopyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestcopyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestcopyPackage.eNS_URI, theTestcopyPackage);
		return theTestcopyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributes() {
		return attributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributes_IntAttribute() {
		return (EAttribute)attributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributes_EnumAttibute() {
		return (EAttribute)attributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleReferences() {
		return simpleReferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleReferences_SimpleRef() {
		return (EReference)simpleReferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleReferences_ContainmentRef() {
		return (EReference)simpleReferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOppositesA() {
		return oppositesAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOppositesA_ToB() {
		return (EReference)oppositesAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOppositesA_OneToMany() {
		return (EReference)oppositesAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOppositesA_ManyToMany() {
		return (EReference)oppositesAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOppositesA_Name() {
		return (EAttribute)oppositesAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOppositesB() {
		return oppositesBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOppositesB_ToA() {
		return (EReference)oppositesBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOppositesB_ManyToOne() {
		return (EReference)oppositesBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOppositesB_ManyToMany() {
		return (EReference)oppositesBEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOppositesB_Name() {
		return (EAttribute)oppositesBEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMyEnum() {
		return myEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestcopyFactory getTestcopyFactory() {
		return (TestcopyFactory)getEFactoryInstance();
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
		attributesEClass = createEClass(ATTRIBUTES);
		createEAttribute(attributesEClass, ATTRIBUTES__INT_ATTRIBUTE);
		createEAttribute(attributesEClass, ATTRIBUTES__ENUM_ATTIBUTE);

		simpleReferencesEClass = createEClass(SIMPLE_REFERENCES);
		createEReference(simpleReferencesEClass, SIMPLE_REFERENCES__SIMPLE_REF);
		createEReference(simpleReferencesEClass, SIMPLE_REFERENCES__CONTAINMENT_REF);

		oppositesAEClass = createEClass(OPPOSITES_A);
		createEReference(oppositesAEClass, OPPOSITES_A__TO_B);
		createEReference(oppositesAEClass, OPPOSITES_A__ONE_TO_MANY);
		createEReference(oppositesAEClass, OPPOSITES_A__MANY_TO_MANY);
		createEAttribute(oppositesAEClass, OPPOSITES_A__NAME);

		oppositesBEClass = createEClass(OPPOSITES_B);
		createEReference(oppositesBEClass, OPPOSITES_B__TO_A);
		createEReference(oppositesBEClass, OPPOSITES_B__MANY_TO_ONE);
		createEReference(oppositesBEClass, OPPOSITES_B__MANY_TO_MANY);
		createEAttribute(oppositesBEClass, OPPOSITES_B__NAME);

		// Create enums
		myEnumEEnum = createEEnum(MY_ENUM);
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
		initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributes_IntAttribute(), ecorePackage.getEInt(), "intAttribute", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributes_EnumAttibute(), this.getMyEnum(), "enumAttibute", "ITEM1", 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleReferencesEClass, SimpleReferences.class, "SimpleReferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleReferences_SimpleRef(), this.getAttributes(), null, "simpleRef", null, 0, 1, SimpleReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleReferences_ContainmentRef(), this.getAttributes(), null, "containmentRef", null, 0, -1, SimpleReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oppositesAEClass, OppositesA.class, "OppositesA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOppositesA_ToB(), this.getOppositesB(), this.getOppositesB_ToA(), "toB", null, 0, 1, OppositesA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOppositesA_OneToMany(), this.getOppositesB(), this.getOppositesB_ManyToOne(), "oneToMany", null, 0, -1, OppositesA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOppositesA_ManyToMany(), this.getOppositesB(), this.getOppositesB_ManyToMany(), "manyToMany", null, 0, -1, OppositesA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOppositesA_Name(), ecorePackage.getEString(), "name", null, 0, 1, OppositesA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oppositesBEClass, OppositesB.class, "OppositesB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOppositesB_ToA(), this.getOppositesA(), this.getOppositesA_ToB(), "toA", null, 0, 1, OppositesB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOppositesB_ManyToOne(), this.getOppositesA(), this.getOppositesA_OneToMany(), "manyToOne", null, 0, 1, OppositesB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOppositesB_ManyToMany(), this.getOppositesA(), this.getOppositesA_ManyToMany(), "manyToMany", null, 0, -1, OppositesB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOppositesB_Name(), ecorePackage.getEString(), "name", null, 0, 1, OppositesB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(myEnumEEnum, MyEnum.class, "MyEnum");
		addEEnumLiteral(myEnumEEnum, MyEnum.ITEM1);
		addEEnumLiteral(myEnumEEnum, MyEnum.ITEM2);

		// Create resource
		createResource(eNS_URI);
	}

} //TestcopyPackageImpl
