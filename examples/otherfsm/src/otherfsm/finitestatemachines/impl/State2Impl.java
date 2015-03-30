/**
 */
package otherfsm.finitestatemachines.impl;

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
import otherfsm.finitestatemachines.FinitestatemachinesPackage;
import otherfsm.finitestatemachines.State2;
import otherfsm.finitestatemachines.StateMachine;
import otherfsm.finitestatemachines.Transition2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link otherfsm.finitestatemachines.impl.State2Impl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.State2Impl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.State2Impl#getStateMachine2 <em>State Machine2</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.State2Impl#getInitialTime2 <em>Initial Time2</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.State2Impl#getFinalTime <em>Final Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class State2Impl extends NamedElementImpl implements State2 {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition2> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition2> incoming;

	/**
	 * The default value of the '{@link #getInitialTime2() <em>Initial Time2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTime2()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_TIME2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialTime2() <em>Initial Time2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTime2()
	 * @generated
	 * @ordered
	 */
	protected int initialTime2 = INITIAL_TIME2_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinitestatemachinesPackage.Literals.STATE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition2> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Transition2>(Transition2.class, this, FinitestatemachinesPackage.STATE2__OUTGOING, FinitestatemachinesPackage.TRANSITION2__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition2> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition2>(Transition2.class, this, FinitestatemachinesPackage.STATE2__INCOMING, FinitestatemachinesPackage.TRANSITION2__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine2() {
		if (eContainerFeatureID() != FinitestatemachinesPackage.STATE2__STATE_MACHINE2) return null;
		return (StateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine2(StateMachine newStateMachine2, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateMachine2, FinitestatemachinesPackage.STATE2__STATE_MACHINE2, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine2(StateMachine newStateMachine2) {
		if (newStateMachine2 != eInternalContainer() || (eContainerFeatureID() != FinitestatemachinesPackage.STATE2__STATE_MACHINE2 && newStateMachine2 != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine2))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine2 != null)
				msgs = ((InternalEObject)newStateMachine2).eInverseAdd(this, FinitestatemachinesPackage.STATE_MACHINE__STATES2, StateMachine.class, msgs);
			msgs = basicSetStateMachine2(newStateMachine2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.STATE2__STATE_MACHINE2, newStateMachine2, newStateMachine2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialTime2() {
		return initialTime2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialTime2(int newInitialTime2) {
		int oldInitialTime2 = initialTime2;
		initialTime2 = newInitialTime2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.STATE2__INITIAL_TIME2, oldInitialTime2, initialTime2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.STATE2__FINAL_TIME, oldFinalTime, finalTime));
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
			case FinitestatemachinesPackage.STATE2__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case FinitestatemachinesPackage.STATE2__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case FinitestatemachinesPackage.STATE2__STATE_MACHINE2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateMachine2((StateMachine)otherEnd, msgs);
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
			case FinitestatemachinesPackage.STATE2__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case FinitestatemachinesPackage.STATE2__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case FinitestatemachinesPackage.STATE2__STATE_MACHINE2:
				return basicSetStateMachine2(null, msgs);
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
			case FinitestatemachinesPackage.STATE2__STATE_MACHINE2:
				return eInternalContainer().eInverseRemove(this, FinitestatemachinesPackage.STATE_MACHINE__STATES2, StateMachine.class, msgs);
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
			case FinitestatemachinesPackage.STATE2__OUTGOING:
				return getOutgoing();
			case FinitestatemachinesPackage.STATE2__INCOMING:
				return getIncoming();
			case FinitestatemachinesPackage.STATE2__STATE_MACHINE2:
				return getStateMachine2();
			case FinitestatemachinesPackage.STATE2__INITIAL_TIME2:
				return getInitialTime2();
			case FinitestatemachinesPackage.STATE2__FINAL_TIME:
				return getFinalTime();
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
			case FinitestatemachinesPackage.STATE2__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition2>)newValue);
				return;
			case FinitestatemachinesPackage.STATE2__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition2>)newValue);
				return;
			case FinitestatemachinesPackage.STATE2__STATE_MACHINE2:
				setStateMachine2((StateMachine)newValue);
				return;
			case FinitestatemachinesPackage.STATE2__INITIAL_TIME2:
				setInitialTime2((Integer)newValue);
				return;
			case FinitestatemachinesPackage.STATE2__FINAL_TIME:
				setFinalTime((Integer)newValue);
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
			case FinitestatemachinesPackage.STATE2__OUTGOING:
				getOutgoing().clear();
				return;
			case FinitestatemachinesPackage.STATE2__INCOMING:
				getIncoming().clear();
				return;
			case FinitestatemachinesPackage.STATE2__STATE_MACHINE2:
				setStateMachine2((StateMachine)null);
				return;
			case FinitestatemachinesPackage.STATE2__INITIAL_TIME2:
				setInitialTime2(INITIAL_TIME2_EDEFAULT);
				return;
			case FinitestatemachinesPackage.STATE2__FINAL_TIME:
				setFinalTime(FINAL_TIME_EDEFAULT);
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
			case FinitestatemachinesPackage.STATE2__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case FinitestatemachinesPackage.STATE2__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case FinitestatemachinesPackage.STATE2__STATE_MACHINE2:
				return getStateMachine2() != null;
			case FinitestatemachinesPackage.STATE2__INITIAL_TIME2:
				return initialTime2 != INITIAL_TIME2_EDEFAULT;
			case FinitestatemachinesPackage.STATE2__FINAL_TIME:
				return finalTime != FINAL_TIME_EDEFAULT;
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
		result.append(" (initialTime2: ");
		result.append(initialTime2);
		result.append(", finalTime: ");
		result.append(finalTime);
		result.append(')');
		return result.toString();
	}

} //State2Impl
