/**
 */
package otherfsm.finitestatemachines.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import otherfsm.finitestatemachines.FinitestatemachinesPackage;
import otherfsm.finitestatemachines.State2;
import otherfsm.finitestatemachines.StateMachine;
import otherfsm.finitestatemachines.Transition2;
import otherfsm.finitestatemachines.Trigger2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link otherfsm.finitestatemachines.impl.Transition2Impl#getTarget <em>Target</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.Transition2Impl#getSource <em>Source</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.Transition2Impl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.Transition2Impl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.Transition2Impl#getInitialTime <em>Initial Time</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.Transition2Impl#getFinalTime2 <em>Final Time2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Transition2Impl extends NamedElementImpl implements Transition2 {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State2 target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State2 source;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected Trigger2 trigger;

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
	 * The default value of the '{@link #getFinalTime2() <em>Final Time2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalTime2()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_TIME2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFinalTime2() <em>Final Time2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalTime2()
	 * @generated
	 * @ordered
	 */
	protected int finalTime2 = FINAL_TIME2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinitestatemachinesPackage.Literals.TRANSITION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State2 getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State2)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinitestatemachinesPackage.TRANSITION2__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State2 basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(State2 newTarget, NotificationChain msgs) {
		State2 oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION2__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State2 newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, FinitestatemachinesPackage.STATE2__INCOMING, State2.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, FinitestatemachinesPackage.STATE2__INCOMING, State2.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION2__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State2 getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (State2)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinitestatemachinesPackage.TRANSITION2__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State2 basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(State2 newSource, NotificationChain msgs) {
		State2 oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION2__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State2 newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, FinitestatemachinesPackage.STATE2__OUTGOING, State2.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, FinitestatemachinesPackage.STATE2__OUTGOING, State2.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION2__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger2 getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(Trigger2 newTrigger, NotificationChain msgs) {
		Trigger2 oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION2__TRIGGER, oldTrigger, newTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Trigger2 newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinitestatemachinesPackage.TRANSITION2__TRIGGER, null, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinitestatemachinesPackage.TRANSITION2__TRIGGER, null, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION2__TRIGGER, newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		if (eContainerFeatureID() != FinitestatemachinesPackage.TRANSITION2__STATE_MACHINE) return null;
		return (StateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateMachine, FinitestatemachinesPackage.TRANSITION2__STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != eInternalContainer() || (eContainerFeatureID() != FinitestatemachinesPackage.TRANSITION2__STATE_MACHINE && newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, FinitestatemachinesPackage.STATE_MACHINE__TRANSITIONS2, StateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION2__STATE_MACHINE, newStateMachine, newStateMachine));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION2__INITIAL_TIME, oldInitialTime, initialTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFinalTime2() {
		return finalTime2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalTime2(int newFinalTime2) {
		int oldFinalTime2 = finalTime2;
		finalTime2 = newFinalTime2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION2__FINAL_TIME2, oldFinalTime2, finalTime2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinitestatemachinesPackage.TRANSITION2__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, FinitestatemachinesPackage.STATE2__INCOMING, State2.class, msgs);
				return basicSetTarget((State2)otherEnd, msgs);
			case FinitestatemachinesPackage.TRANSITION2__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, FinitestatemachinesPackage.STATE2__OUTGOING, State2.class, msgs);
				return basicSetSource((State2)otherEnd, msgs);
			case FinitestatemachinesPackage.TRANSITION2__STATE_MACHINE:
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
			case FinitestatemachinesPackage.TRANSITION2__TARGET:
				return basicSetTarget(null, msgs);
			case FinitestatemachinesPackage.TRANSITION2__SOURCE:
				return basicSetSource(null, msgs);
			case FinitestatemachinesPackage.TRANSITION2__TRIGGER:
				return basicSetTrigger(null, msgs);
			case FinitestatemachinesPackage.TRANSITION2__STATE_MACHINE:
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
			case FinitestatemachinesPackage.TRANSITION2__STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, FinitestatemachinesPackage.STATE_MACHINE__TRANSITIONS2, StateMachine.class, msgs);
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
			case FinitestatemachinesPackage.TRANSITION2__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FinitestatemachinesPackage.TRANSITION2__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FinitestatemachinesPackage.TRANSITION2__TRIGGER:
				return getTrigger();
			case FinitestatemachinesPackage.TRANSITION2__STATE_MACHINE:
				return getStateMachine();
			case FinitestatemachinesPackage.TRANSITION2__INITIAL_TIME:
				return getInitialTime();
			case FinitestatemachinesPackage.TRANSITION2__FINAL_TIME2:
				return getFinalTime2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinitestatemachinesPackage.TRANSITION2__TARGET:
				setTarget((State2)newValue);
				return;
			case FinitestatemachinesPackage.TRANSITION2__SOURCE:
				setSource((State2)newValue);
				return;
			case FinitestatemachinesPackage.TRANSITION2__TRIGGER:
				setTrigger((Trigger2)newValue);
				return;
			case FinitestatemachinesPackage.TRANSITION2__STATE_MACHINE:
				setStateMachine((StateMachine)newValue);
				return;
			case FinitestatemachinesPackage.TRANSITION2__INITIAL_TIME:
				setInitialTime((Integer)newValue);
				return;
			case FinitestatemachinesPackage.TRANSITION2__FINAL_TIME2:
				setFinalTime2((Integer)newValue);
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
			case FinitestatemachinesPackage.TRANSITION2__TARGET:
				setTarget((State2)null);
				return;
			case FinitestatemachinesPackage.TRANSITION2__SOURCE:
				setSource((State2)null);
				return;
			case FinitestatemachinesPackage.TRANSITION2__TRIGGER:
				setTrigger((Trigger2)null);
				return;
			case FinitestatemachinesPackage.TRANSITION2__STATE_MACHINE:
				setStateMachine((StateMachine)null);
				return;
			case FinitestatemachinesPackage.TRANSITION2__INITIAL_TIME:
				setInitialTime(INITIAL_TIME_EDEFAULT);
				return;
			case FinitestatemachinesPackage.TRANSITION2__FINAL_TIME2:
				setFinalTime2(FINAL_TIME2_EDEFAULT);
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
			case FinitestatemachinesPackage.TRANSITION2__TARGET:
				return target != null;
			case FinitestatemachinesPackage.TRANSITION2__SOURCE:
				return source != null;
			case FinitestatemachinesPackage.TRANSITION2__TRIGGER:
				return trigger != null;
			case FinitestatemachinesPackage.TRANSITION2__STATE_MACHINE:
				return getStateMachine() != null;
			case FinitestatemachinesPackage.TRANSITION2__INITIAL_TIME:
				return initialTime != INITIAL_TIME_EDEFAULT;
			case FinitestatemachinesPackage.TRANSITION2__FINAL_TIME2:
				return finalTime2 != FINAL_TIME2_EDEFAULT;
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
		result.append(", finalTime2: ");
		result.append(finalTime2);
		result.append(')');
		return result.toString();
	}

} //Transition2Impl
