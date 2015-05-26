/**
 */
package forkpseudostate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see forkpseudostate.ForkpseudostateFactory
 * @model kind="package"
 * @generated
 */
public interface ForkpseudostatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "forkpseudostate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "forkpseudostate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "forkpseudostate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ForkpseudostatePackage eINSTANCE = forkpseudostate.impl.ForkpseudostatePackageImpl.init();

	/**
	 * The meta object id for the '{@link forkpseudostate.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forkpseudostate.impl.RegionImpl
	 * @see forkpseudostate.impl.ForkpseudostatePackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 0;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forkpseudostate.impl.AbstractStateImpl <em>Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forkpseudostate.impl.AbstractStateImpl
	 * @see forkpseudostate.impl.ForkpseudostatePackageImpl#getAbstractState()
	 * @generated
	 */
	int ABSTRACT_STATE = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__OUTGOING = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__INCOMING = 1;

	/**
	 * The number of structural features of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forkpseudostate.impl.PseudostateImpl <em>Pseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forkpseudostate.impl.PseudostateImpl
	 * @see forkpseudostate.impl.ForkpseudostatePackageImpl#getPseudostate()
	 * @generated
	 */
	int PSEUDOSTATE = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__OUTGOING = ABSTRACT_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__INCOMING = ABSTRACT_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__KIND = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_OPERATION_COUNT = ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forkpseudostate.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forkpseudostate.impl.TransitionImpl
	 * @see forkpseudostate.impl.ForkpseudostatePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forkpseudostate.PseudostateKind <em>Pseudostate Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forkpseudostate.PseudostateKind
	 * @see forkpseudostate.impl.ForkpseudostatePackageImpl#getPseudostateKind()
	 * @generated
	 */
	int PSEUDOSTATE_KIND = 4;


	/**
	 * Returns the meta object for class '{@link forkpseudostate.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see forkpseudostate.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for class '{@link forkpseudostate.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State</em>'.
	 * @see forkpseudostate.AbstractState
	 * @generated
	 */
	EClass getAbstractState();

	/**
	 * Returns the meta object for the reference list '{@link forkpseudostate.AbstractState#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see forkpseudostate.AbstractState#getOutgoing()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link forkpseudostate.AbstractState#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see forkpseudostate.AbstractState#getIncoming()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Incoming();

	/**
	 * Returns the meta object for class '{@link forkpseudostate.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudostate</em>'.
	 * @see forkpseudostate.Pseudostate
	 * @generated
	 */
	EClass getPseudostate();

	/**
	 * Returns the meta object for the attribute '{@link forkpseudostate.Pseudostate#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see forkpseudostate.Pseudostate#getKind()
	 * @see #getPseudostate()
	 * @generated
	 */
	EAttribute getPseudostate_Kind();

	/**
	 * Returns the meta object for class '{@link forkpseudostate.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see forkpseudostate.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link forkpseudostate.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see forkpseudostate.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link forkpseudostate.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see forkpseudostate.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for enum '{@link forkpseudostate.PseudostateKind <em>Pseudostate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pseudostate Kind</em>'.
	 * @see forkpseudostate.PseudostateKind
	 * @generated
	 */
	EEnum getPseudostateKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ForkpseudostateFactory getForkpseudostateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link forkpseudostate.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forkpseudostate.impl.RegionImpl
		 * @see forkpseudostate.impl.ForkpseudostatePackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '{@link forkpseudostate.impl.AbstractStateImpl <em>Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forkpseudostate.impl.AbstractStateImpl
		 * @see forkpseudostate.impl.ForkpseudostatePackageImpl#getAbstractState()
		 * @generated
		 */
		EClass ABSTRACT_STATE = eINSTANCE.getAbstractState();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__OUTGOING = eINSTANCE.getAbstractState_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__INCOMING = eINSTANCE.getAbstractState_Incoming();

		/**
		 * The meta object literal for the '{@link forkpseudostate.impl.PseudostateImpl <em>Pseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forkpseudostate.impl.PseudostateImpl
		 * @see forkpseudostate.impl.ForkpseudostatePackageImpl#getPseudostate()
		 * @generated
		 */
		EClass PSEUDOSTATE = eINSTANCE.getPseudostate();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSEUDOSTATE__KIND = eINSTANCE.getPseudostate_Kind();

		/**
		 * The meta object literal for the '{@link forkpseudostate.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forkpseudostate.impl.TransitionImpl
		 * @see forkpseudostate.impl.ForkpseudostatePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '{@link forkpseudostate.PseudostateKind <em>Pseudostate Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forkpseudostate.PseudostateKind
		 * @see forkpseudostate.impl.ForkpseudostatePackageImpl#getPseudostateKind()
		 * @generated
		 */
		EEnum PSEUDOSTATE_KIND = eINSTANCE.getPseudostateKind();

	}

} //ForkpseudostatePackage
