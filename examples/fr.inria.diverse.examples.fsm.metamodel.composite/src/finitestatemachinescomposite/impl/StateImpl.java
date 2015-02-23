/**
 */
package finitestatemachinescomposite.impl;

import finitestatemachinescomposite.CompositeState;
import finitestatemachinescomposite.FinitestatemachinescompositePackage;
import finitestatemachinescomposite.State;
import finitestatemachinescomposite.StateMachine;
import finitestatemachinescomposite.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link finitestatemachinescomposite.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link finitestatemachinescomposite.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link finitestatemachinescomposite.impl.StateImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link finitestatemachinescomposite.impl.StateImpl#getInitialTime <em>Initial Time</em>}</li>
 *   <li>{@link finitestatemachinescomposite.impl.StateImpl#getFinalTime <em>Final Time</em>}</li>
 *   <li>{@link finitestatemachinescomposite.impl.StateImpl#getParentState <em>Parent State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends NamedElementImpl implements State {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;

	/**
	 * The default value of the '{@link #getInitialTime() <em>Initial Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTime()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialTime() <em>Initial Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTime()
	 * @generated
	 * @ordered
	 */
	protected int initialTime = INITIAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalTime() <em>Final Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalTime()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFinalTime() <em>Final Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalTime()
	 * @generated
	 * @ordered
	 */
	protected int finalTime = FINAL_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentState() <em>Parent State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentState()
	 * @generated
	 * @ordered
	 */
	protected CompositeState parentState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinitestatemachinescompositePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, FinitestatemachinescompositePackage.STATE__OUTGOING, FinitestatemachinescompositePackage.TRANSITION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, FinitestatemachinescompositePackage.STATE__INCOMING, FinitestatemachinescompositePackage.TRANSITION__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		if (eContainerFeatureID() != FinitestatemachinescompositePackage.STATE__STATE_MACHINE) return null;
		return (StateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateMachine, FinitestatemachinescompositePackage.STATE__STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != eInternalContainer() || (eContainerFeatureID() != FinitestatemachinescompositePackage.STATE__STATE_MACHINE && newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, FinitestatemachinescompositePackage.STATE_MACHINE__STATES, StateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinescompositePackage.STATE__STATE_MACHINE, newStateMachine, newStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialTime() {
		return initialTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialTime(int newInitialTime) {
		int oldInitialTime = initialTime;
		initialTime = newInitialTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinescompositePackage.STATE__INITIAL_TIME, oldInitialTime, initialTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFinalTime() {
		return finalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalTime(int newFinalTime) {
		int oldFinalTime = finalTime;
		finalTime = newFinalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinescompositePackage.STATE__FINAL_TIME, oldFinalTime, finalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeState getParentState() {
		if (parentState != null && parentState.eIsProxy()) {
			InternalEObject oldParentState = (InternalEObject)parentState;
			parentState = (CompositeState)eResolveProxy(oldParentState);
			if (parentState != oldParentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinitestatemachinescompositePackage.STATE__PARENT_STATE, oldParentState, parentState));
			}
		}
		return parentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeState basicGetParentState() {
		return parentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentState(CompositeState newParentState) {
		CompositeState oldParentState = parentState;
		parentState = newParentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinescompositePackage.STATE__PARENT_STATE, oldParentState, parentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinitestatemachinescompositePackage.STATE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case FinitestatemachinescompositePackage.STATE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case FinitestatemachinescompositePackage.STATE__STATE_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateMachine((StateMachine)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinitestatemachinescompositePackage.STATE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case FinitestatemachinescompositePackage.STATE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case FinitestatemachinescompositePackage.STATE__STATE_MACHINE:
				return basicSetStateMachine(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FinitestatemachinescompositePackage.STATE__STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, FinitestatemachinescompositePackage.STATE_MACHINE__STATES, StateMachine.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinitestatemachinescompositePackage.STATE__OUTGOING:
				return getOutgoing();
			case FinitestatemachinescompositePackage.STATE__INCOMING:
				return getIncoming();
			case FinitestatemachinescompositePackage.STATE__STATE_MACHINE:
				return getStateMachine();
			case FinitestatemachinescompositePackage.STATE__INITIAL_TIME:
				return getInitialTime();
			case FinitestatemachinescompositePackage.STATE__FINAL_TIME:
				return getFinalTime();
			case FinitestatemachinescompositePackage.STATE__PARENT_STATE:
				if (resolve) return getParentState();
				return basicGetParentState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinitestatemachinescompositePackage.STATE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition>)newValue);
				return;
			case FinitestatemachinescompositePackage.STATE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
				return;
			case FinitestatemachinescompositePackage.STATE__STATE_MACHINE:
				setStateMachine((StateMachine)newValue);
				return;
			case FinitestatemachinescompositePackage.STATE__INITIAL_TIME:
				setInitialTime((Integer)newValue);
				return;
			case FinitestatemachinescompositePackage.STATE__FINAL_TIME:
				setFinalTime((Integer)newValue);
				return;
			case FinitestatemachinescompositePackage.STATE__PARENT_STATE:
				setParentState((CompositeState)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FinitestatemachinescompositePackage.STATE__OUTGOING:
				getOutgoing().clear();
				return;
			case FinitestatemachinescompositePackage.STATE__INCOMING:
				getIncoming().clear();
				return;
			case FinitestatemachinescompositePackage.STATE__STATE_MACHINE:
				setStateMachine((StateMachine)null);
				return;
			case FinitestatemachinescompositePackage.STATE__INITIAL_TIME:
				setInitialTime(INITIAL_TIME_EDEFAULT);
				return;
			case FinitestatemachinescompositePackage.STATE__FINAL_TIME:
				setFinalTime(FINAL_TIME_EDEFAULT);
				return;
			case FinitestatemachinescompositePackage.STATE__PARENT_STATE:
				setParentState((CompositeState)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FinitestatemachinescompositePackage.STATE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case FinitestatemachinescompositePackage.STATE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case FinitestatemachinescompositePackage.STATE__STATE_MACHINE:
				return getStateMachine() != null;
			case FinitestatemachinescompositePackage.STATE__INITIAL_TIME:
				return initialTime != INITIAL_TIME_EDEFAULT;
			case FinitestatemachinescompositePackage.STATE__FINAL_TIME:
				return finalTime != FINAL_TIME_EDEFAULT;
			case FinitestatemachinescompositePackage.STATE__PARENT_STATE:
				return parentState != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initialTime: ");
		result.append(initialTime);
		result.append(", finalTime: ");
		result.append(finalTime);
		result.append(')');
		return result.toString();
	}

} //StateImpl
