/**
 */
package simpleconstraintslanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleconstraintslanguage.CExpression;
import simpleconstraintslanguage.CInteger;
import simpleconstraintslanguage.CLiteral;
import simpleconstraintslanguage.CRelationalOperator;
import simpleconstraintslanguage.CVarRef;
import simpleconstraintslanguage.Constraint;
import simpleconstraintslanguage.RelationalConstraint;
import simpleconstraintslanguage.SimpleconstraintslanguageFactory;
import simpleconstraintslanguage.SimpleconstraintslanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleconstraintslanguagePackageImpl extends EPackageImpl implements SimpleconstraintslanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cVarRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cRelationalOperatorEEnum = null;

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
	 * @see simpleconstraintslanguage.SimpleconstraintslanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleconstraintslanguagePackageImpl() {
		super(eNS_URI, SimpleconstraintslanguageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimpleconstraintslanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleconstraintslanguagePackage init() {
		if (isInited) return (SimpleconstraintslanguagePackage)EPackage.Registry.INSTANCE.getEPackage(SimpleconstraintslanguagePackage.eNS_URI);

		// Obtain or create and register package
		SimpleconstraintslanguagePackageImpl theSimpleconstraintslanguagePackage = (SimpleconstraintslanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleconstraintslanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleconstraintslanguagePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimpleconstraintslanguagePackage.createPackageContents();

		// Initialize created meta-data
		theSimpleconstraintslanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleconstraintslanguagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleconstraintslanguagePackage.eNS_URI, theSimpleconstraintslanguagePackage);
		return theSimpleconstraintslanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalConstraint() {
		return relationalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalConstraint_Left() {
		return (EReference)relationalConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalConstraint_Right() {
		return (EReference)relationalConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalConstraint_Operator() {
		return (EAttribute)relationalConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCExpression() {
		return cExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLiteral() {
		return cLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCInteger() {
		return cIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCInteger_Value() {
		return (EAttribute)cIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVarRef() {
		return cVarRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCVarRef_Name() {
		return (EAttribute)cVarRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCRelationalOperator() {
		return cRelationalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleconstraintslanguageFactory getSimpleconstraintslanguageFactory() {
		return (SimpleconstraintslanguageFactory)getEFactoryInstance();
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
		constraintEClass = createEClass(CONSTRAINT);

		relationalConstraintEClass = createEClass(RELATIONAL_CONSTRAINT);
		createEReference(relationalConstraintEClass, RELATIONAL_CONSTRAINT__LEFT);
		createEReference(relationalConstraintEClass, RELATIONAL_CONSTRAINT__RIGHT);
		createEAttribute(relationalConstraintEClass, RELATIONAL_CONSTRAINT__OPERATOR);

		cExpressionEClass = createEClass(CEXPRESSION);

		cLiteralEClass = createEClass(CLITERAL);

		cIntegerEClass = createEClass(CINTEGER);
		createEAttribute(cIntegerEClass, CINTEGER__VALUE);

		cVarRefEClass = createEClass(CVAR_REF);
		createEAttribute(cVarRefEClass, CVAR_REF__NAME);

		// Create enums
		cRelationalOperatorEEnum = createEEnum(CRELATIONAL_OPERATOR);
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
		relationalConstraintEClass.getESuperTypes().add(this.getConstraint());
		cLiteralEClass.getESuperTypes().add(this.getCExpression());
		cIntegerEClass.getESuperTypes().add(this.getCLiteral());
		cVarRefEClass.getESuperTypes().add(this.getCExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalConstraintEClass, RelationalConstraint.class, "RelationalConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalConstraint_Left(), this.getCExpression(), null, "left", null, 1, 1, RelationalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalConstraint_Right(), this.getCExpression(), null, "right", null, 1, 1, RelationalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalConstraint_Operator(), this.getCRelationalOperator(), "operator", null, 0, 1, RelationalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cExpressionEClass, CExpression.class, "CExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cLiteralEClass, CLiteral.class, "CLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cIntegerEClass, CInteger.class, "CInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCInteger_Value(), ecorePackage.getEInt(), "value", null, 0, 1, CInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cVarRefEClass, CVarRef.class, "CVarRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCVarRef_Name(), ecorePackage.getEString(), "name", null, 0, 1, CVarRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cRelationalOperatorEEnum, CRelationalOperator.class, "CRelationalOperator");
		addEEnumLiteral(cRelationalOperatorEEnum, CRelationalOperator.EQUAL);
		addEEnumLiteral(cRelationalOperatorEEnum, CRelationalOperator.NOT_EQUAL);
		addEEnumLiteral(cRelationalOperatorEEnum, CRelationalOperator.GREATER_THAN);
		addEEnumLiteral(cRelationalOperatorEEnum, CRelationalOperator.LESS_THAN);

		// Create resource
		createResource(eNS_URI);
	}

} //SimpleconstraintslanguagePackageImpl
