/**
 */
package activitydiagram.impl;

import activitydiagram.Action;
import activitydiagram.Activity;
import activitydiagram.ActivityEdge;
import activitydiagram.ActivityNode;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.ExecutableNode;
import activitydiagram.Expression;
import activitydiagram.InputValue;
import activitydiagram.NamedElement;
import activitydiagram.OpaqueAction;
import activitydiagram.Value;
import activitydiagram.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Context;
import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Offer;
import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitydiagramPackageImpl extends EPackageImpl implements ActivitydiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType offerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tokenEDataType = null;

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
	 * @see activitydiagram.ActivitydiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivitydiagramPackageImpl() {
		super(eNS_URI, ActivitydiagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActivitydiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivitydiagramPackage init() {
		if (isInited) return (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);

		// Obtain or create and register package
		ActivitydiagramPackageImpl theActivitydiagramPackage = (ActivitydiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivitydiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivitydiagramPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theActivitydiagramPackage.createPackageContents();

		// Initialize created meta-data
		theActivitydiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivitydiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivitydiagramPackage.eNS_URI, theActivitydiagramPackage);
		return theActivitydiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueAction() {
		return opaqueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_Expressions() {
		return (EReference)opaqueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNode() {
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Outgoing() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Incoming() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Activity() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_Running() {
		return (EAttribute)activityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge() {
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Source() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Target() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityEdge_Offers() {
		return (EAttribute)activityEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Nodes() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Edges() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Locals() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Inputs() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_InitialValue() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_CurrentValue() {
		return (EReference)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputValue() {
		return inputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_Value() {
		return (EReference)inputValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_Variable() {
		return (EReference)inputValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContext() {
		return contextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOffer() {
		return offerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getToken() {
		return tokenEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramFactory getActivitydiagramFactory() {
		return (ActivitydiagramFactory)getEFactoryInstance();
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
		opaqueActionEClass = createEClass(OPAQUE_ACTION);
		createEReference(opaqueActionEClass, OPAQUE_ACTION__EXPRESSIONS);

		actionEClass = createEClass(ACTION);

		executableNodeEClass = createEClass(EXECUTABLE_NODE);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OUTGOING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__ACTIVITY);
		createEAttribute(activityNodeEClass, ACTIVITY_NODE__RUNNING);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		activityEdgeEClass = createEClass(ACTIVITY_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);
		createEAttribute(activityEdgeEClass, ACTIVITY_EDGE__OFFERS);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__NODES);
		createEReference(activityEClass, ACTIVITY__EDGES);
		createEReference(activityEClass, ACTIVITY__LOCALS);
		createEReference(activityEClass, ACTIVITY__INPUTS);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__INITIAL_VALUE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEReference(variableEClass, VARIABLE__CURRENT_VALUE);

		valueEClass = createEClass(VALUE);

		inputValueEClass = createEClass(INPUT_VALUE);
		createEReference(inputValueEClass, INPUT_VALUE__VALUE);
		createEReference(inputValueEClass, INPUT_VALUE__VARIABLE);

		expressionEClass = createEClass(EXPRESSION);

		// Create data types
		contextEDataType = createEDataType(CONTEXT);
		offerEDataType = createEDataType(OFFER);
		tokenEDataType = createEDataType(TOKEN);
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
		opaqueActionEClass.getESuperTypes().add(this.getAction());
		actionEClass.getESuperTypes().add(this.getExecutableNode());
		executableNodeEClass.getESuperTypes().add(this.getActivityNode());
		activityNodeEClass.getESuperTypes().add(this.getNamedElement());
		activityEdgeEClass.getESuperTypes().add(this.getNamedElement());
		activityEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(opaqueActionEClass, OpaqueAction.class, "OpaqueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpaqueAction_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(opaqueActionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableNodeEClass, ExecutableNode.class, "ExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_Outgoing(), this.getActivityEdge(), this.getActivityEdge_Source(), "outgoing", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Incoming(), this.getActivityEdge(), this.getActivityEdge_Target(), "incoming", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Activity(), this.getActivity(), this.getActivity_Nodes(), "activity", null, 1, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityNode_Running(), ecorePackage.getEBoolean(), "running", null, 1, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(activityNodeEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityNodeEClass, null, "terminate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityNodeEClass, ecorePackage.getEBoolean(), "isReady", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityNodeEClass, null, "sendOffers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getToken(), "tokens", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityNodeEClass, this.getToken(), "takeOfferdTokens", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityNodeEClass, null, "addTokens", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getToken(), "tokens", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityNodeEClass, ecorePackage.getEBoolean(), "hasOffers", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityNodeEClass, null, "removeToken", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getToken(), "token", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(namedElementEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outgoing(), "source", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incoming(), "target", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityEdge_Offers(), this.getOffer(), "offers", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(activityEdgeEClass, null, "sendOffer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getToken(), "tokens", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEdgeEClass, this.getToken(), "takeOfferedTokens", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEdgeEClass, ecorePackage.getEBoolean(), "hasOffer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Nodes(), this.getActivityNode(), this.getActivityNode_Activity(), "nodes", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Edges(), this.getActivityEdge(), null, "edges", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Locals(), this.getVariable(), null, "locals", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Inputs(), this.getVariable(), null, "inputs", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(activityEClass, null, "main", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInputValue(), "value", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEClass, null, "writeToFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEClass, ecorePackage.getEString(), "printTrace", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityEClass, ecorePackage.getEInt(), "getIntegerVariableValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityEClass, ecorePackage.getEBoolean(), "getBooleanVariableValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityEClass, this.getValue(), "getVariableValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityEClass, this.getVariable(), "getVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEClass, null, "writeTrace", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_InitialValue(), this.getValue(), null, "initialValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_CurrentValue(), this.getValue(), null, "currentValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(variableEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(variableEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, ecorePackage.getEString(), "print", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputValueEClass, InputValue.class, "InputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputValue_Value(), this.getValue(), null, "value", null, 1, 1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_Variable(), this.getVariable(), null, "variable", null, 1, 1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(expressionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(contextEDataType, Context.class, "Context", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(offerEDataType, Offer.class, "Offer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tokenEDataType, Token.class, "Token", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ActivitydiagramPackageImpl
