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
import otherfsm.finitestatemachines.Transition;
import otherfsm.finitestatemachines.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link otherfsm.finitestatemachines.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.TransitionImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.TransitionImpl#getInitialTime <em>Initial Time</em>}</li>
 *   <li>{@link otherfsm.finitestatemachines.impl.TransitionImpl#getFinalTime <em>Final Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
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
	protected Trigger trigger;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinitestatemachinesPackage.Literals.TRANSITION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinitestatemachinesPackage.TRANSITION__TARGET, oldTarget, target));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION__TARGET, oldTarget, newTarget);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION__TARGET, newTarget, newTarget));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinitestatemachinesPackage.TRANSITION__SOURCE, oldSource, source));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION__SOURCE, oldSource, newSource);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(Trigger newTrigger, NotificationChain msgs) {
		Trigger oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION__TRIGGER, oldTrigger, newTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Trigger newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinitestatemachinesPackage.TRANSITION__TRIGGER, null, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinitestatemachinesPackage.TRANSITION__TRIGGER, null, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION__TRIGGER, newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		if (eContainerFeatureID() != FinitestatemachinesPackage.TRANSITION__STATE_MACHINE) return null;
		return (StateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateMachine, FinitestatemachinesPackage.TRANSITION__STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != eInternalContainer() || (eContainerFeatureID() != FinitestatemachinesPackage.TRANSITION__STATE_MACHINE && newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, FinitestatemachinesPackage.STATE_MACHINE__TRANSITIONS, StateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION__STATE_MACHINE, newStateMachine, newStateMachine));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION__INITIAL_TIME, oldInitialTime, initialTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinitestatemachinesPackage.TRANSITION__FINAL_TIME, oldFinalTime, finalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinitestatemachinesPackage.TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, FinitestatemachinesPackage.STATE2__INCOMING, State2.class, msgs);
				return basicSetTarget((State2)otherEnd, msgs);
			case FinitestatemachinesPackage.TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, FinitestatemachinesPackage.STATE2__OUTGOING, State2.class, msgs);
				return basicSetSource((State2)otherEnd, msgs);
			case FinitestatemachinesPackage.TRANSITION__STATE_MACHINE:
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
			case FinitestatemachinesPackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
			case FinitestatemachinesPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case FinitestatemachinesPackage.TRANSITION__TRIGGER:
				return basicSetTrigger(null, msgs);
			case FinitestatemachinesPackage.TRANSITION__STATE_MACHINE:
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
			case FinitestatemachinesPackage.TRANSITION__STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, FinitestatemachinesPackage.STATE_MACHINE__TRANSITIONS, StateMachine.class, msgs);
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
			case FinitestatemachinesPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FinitestatemachinesPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FinitestatemachinesPackage.TRANSITION__TRIGGER:
				return getTrigger();
			case FinitestatemachinesPackage.TRANSITION__STATE_MACHINE:
				return getStateMachine();
			case FinitestatemachinesPackage.TRANSITION__INITIAL_TIME:
				return getInitialTime();
			case FinitestatemachinesPackage.TRANSITION__FINAL_TIME:
				return getFinalTime();
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
			case FinitestatemachinesPackage.TRANSITION__TARGET:
				setTarget((State2)newValue);
				return;
			case FinitestatemachinesPackage.TRANSITION__SOURCE:
				setSource((State2)newValue);
				return;
			case FinitestatemachinesPackage.TRANSITION__TRIGGER:
				setTrigger((Trigger)newValue);
				return;
			case FinitestatemachinesPackage.TRANSITION__STATE_MACHINE:
				setStateMachine((StateMachine)newValue);
				return;
			case FinitestatemachinesPackage.TRANSITION__INITIAL_TIME:
				setInitialTime((Integer)newValue);
				return;
			case FinitestatemachinesPackage.TRANSITION__FINAL_TIME:
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
			case FinitestatemachinesPackage.TRANSITION__TARGET:
				setTarget((State2)null);
				return;
			case FinitestatemachinesPackage.TRANSITION__SOURCE:
				setSource((State2)null);
				return;
			case FinitestatemachinesPackage.TRANSITION__TRIGGER:
				setTrigger((Trigger)null);
				return;
			case FinitestatemachinesPackage.TRANSITION__STATE_MACHINE:
				setStateMachine((StateMachine)null);
				return;
			case FinitestatemachinesPackage.TRANSITION__INITIAL_TIME:
				setInitialTime(INITIAL_TIME_EDEFAULT);
				return;
			case FinitestatemachinesPackage.TRANSITION__FINAL_TIME:
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
			case FinitestatemachinesPackage.TRANSITION__TARGET:
				return target != null;
			case FinitestatemachinesPackage.TRANSITION__SOURCE:
				return source != null;
			case FinitestatemachinesPackage.TRANSITION__TRIGGER:
				return trigger != null;
			case FinitestatemachinesPackage.TRANSITION__STATE_MACHINE:
				return getStateMachine() != null;
			case FinitestatemachinesPackage.TRANSITION__INITIAL_TIME:
				return initialTime != INITIAL_TIME_EDEFAULT;
			case FinitestatemachinesPackage.TRANSITION__FINAL_TIME:
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
		result.append(" (initialTime: ");
		result.append(initialTime);
		result.append(", finalTime: ");
		result.append(finalTime);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
