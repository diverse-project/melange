/**
 */
package testcopy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import testcopy.OppositesA;
import testcopy.OppositesB;
import testcopy.TestcopyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opposites B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testcopy.impl.OppositesBImpl#getToA <em>To A</em>}</li>
 *   <li>{@link testcopy.impl.OppositesBImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link testcopy.impl.OppositesBImpl#getManyToMany <em>Many To Many</em>}</li>
 *   <li>{@link testcopy.impl.OppositesBImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OppositesBImpl extends MinimalEObjectImpl.Container implements OppositesB {
	/**
	 * The cached value of the '{@link #getToA() <em>To A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToA()
	 * @generated
	 * @ordered
	 */
	protected OppositesA toA;

	/**
	 * The cached value of the '{@link #getManyToMany() <em>Many To Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyToMany()
	 * @generated
	 * @ordered
	 */
	protected EList<OppositesA> manyToMany;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OppositesBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestcopyPackage.Literals.OPPOSITES_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositesA getToA() {
		if (toA != null && toA.eIsProxy()) {
			InternalEObject oldToA = (InternalEObject)toA;
			toA = (OppositesA)eResolveProxy(oldToA);
			if (toA != oldToA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcopyPackage.OPPOSITES_B__TO_A, oldToA, toA));
			}
		}
		return toA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositesA basicGetToA() {
		return toA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToA(OppositesA newToA, NotificationChain msgs) {
		OppositesA oldToA = toA;
		toA = newToA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestcopyPackage.OPPOSITES_B__TO_A, oldToA, newToA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToA(OppositesA newToA) {
		if (newToA != toA) {
			NotificationChain msgs = null;
			if (toA != null)
				msgs = ((InternalEObject)toA).eInverseRemove(this, TestcopyPackage.OPPOSITES_A__TO_B, OppositesA.class, msgs);
			if (newToA != null)
				msgs = ((InternalEObject)newToA).eInverseAdd(this, TestcopyPackage.OPPOSITES_A__TO_B, OppositesA.class, msgs);
			msgs = basicSetToA(newToA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcopyPackage.OPPOSITES_B__TO_A, newToA, newToA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositesA getManyToOne() {
		if (eContainerFeatureID() != TestcopyPackage.OPPOSITES_B__MANY_TO_ONE) return null;
		return (OppositesA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManyToOne(OppositesA newManyToOne, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newManyToOne, TestcopyPackage.OPPOSITES_B__MANY_TO_ONE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManyToOne(OppositesA newManyToOne) {
		if (newManyToOne != eInternalContainer() || (eContainerFeatureID() != TestcopyPackage.OPPOSITES_B__MANY_TO_ONE && newManyToOne != null)) {
			if (EcoreUtil.isAncestor(this, newManyToOne))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newManyToOne != null)
				msgs = ((InternalEObject)newManyToOne).eInverseAdd(this, TestcopyPackage.OPPOSITES_A__ONE_TO_MANY, OppositesA.class, msgs);
			msgs = basicSetManyToOne(newManyToOne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcopyPackage.OPPOSITES_B__MANY_TO_ONE, newManyToOne, newManyToOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OppositesA> getManyToMany() {
		if (manyToMany == null) {
			manyToMany = new EObjectWithInverseResolvingEList.ManyInverse<OppositesA>(OppositesA.class, this, TestcopyPackage.OPPOSITES_B__MANY_TO_MANY, TestcopyPackage.OPPOSITES_A__MANY_TO_MANY);
		}
		return manyToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcopyPackage.OPPOSITES_B__NAME, oldName, name));
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
			case TestcopyPackage.OPPOSITES_B__TO_A:
				if (toA != null)
					msgs = ((InternalEObject)toA).eInverseRemove(this, TestcopyPackage.OPPOSITES_A__TO_B, OppositesA.class, msgs);
				return basicSetToA((OppositesA)otherEnd, msgs);
			case TestcopyPackage.OPPOSITES_B__MANY_TO_ONE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetManyToOne((OppositesA)otherEnd, msgs);
			case TestcopyPackage.OPPOSITES_B__MANY_TO_MANY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getManyToMany()).basicAdd(otherEnd, msgs);
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
			case TestcopyPackage.OPPOSITES_B__TO_A:
				return basicSetToA(null, msgs);
			case TestcopyPackage.OPPOSITES_B__MANY_TO_ONE:
				return basicSetManyToOne(null, msgs);
			case TestcopyPackage.OPPOSITES_B__MANY_TO_MANY:
				return ((InternalEList<?>)getManyToMany()).basicRemove(otherEnd, msgs);
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
			case TestcopyPackage.OPPOSITES_B__MANY_TO_ONE:
				return eInternalContainer().eInverseRemove(this, TestcopyPackage.OPPOSITES_A__ONE_TO_MANY, OppositesA.class, msgs);
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
			case TestcopyPackage.OPPOSITES_B__TO_A:
				if (resolve) return getToA();
				return basicGetToA();
			case TestcopyPackage.OPPOSITES_B__MANY_TO_ONE:
				return getManyToOne();
			case TestcopyPackage.OPPOSITES_B__MANY_TO_MANY:
				return getManyToMany();
			case TestcopyPackage.OPPOSITES_B__NAME:
				return getName();
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
			case TestcopyPackage.OPPOSITES_B__TO_A:
				setToA((OppositesA)newValue);
				return;
			case TestcopyPackage.OPPOSITES_B__MANY_TO_ONE:
				setManyToOne((OppositesA)newValue);
				return;
			case TestcopyPackage.OPPOSITES_B__MANY_TO_MANY:
				getManyToMany().clear();
				getManyToMany().addAll((Collection<? extends OppositesA>)newValue);
				return;
			case TestcopyPackage.OPPOSITES_B__NAME:
				setName((String)newValue);
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
			case TestcopyPackage.OPPOSITES_B__TO_A:
				setToA((OppositesA)null);
				return;
			case TestcopyPackage.OPPOSITES_B__MANY_TO_ONE:
				setManyToOne((OppositesA)null);
				return;
			case TestcopyPackage.OPPOSITES_B__MANY_TO_MANY:
				getManyToMany().clear();
				return;
			case TestcopyPackage.OPPOSITES_B__NAME:
				setName(NAME_EDEFAULT);
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
			case TestcopyPackage.OPPOSITES_B__TO_A:
				return toA != null;
			case TestcopyPackage.OPPOSITES_B__MANY_TO_ONE:
				return getManyToOne() != null;
			case TestcopyPackage.OPPOSITES_B__MANY_TO_MANY:
				return manyToMany != null && !manyToMany.isEmpty();
			case TestcopyPackage.OPPOSITES_B__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OppositesBImpl
