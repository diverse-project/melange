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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import testcopy.OppositesA;
import testcopy.OppositesB;
import testcopy.TestcopyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opposites A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testcopy.impl.OppositesAImpl#getToB <em>To B</em>}</li>
 *   <li>{@link testcopy.impl.OppositesAImpl#getOneToMany <em>One To Many</em>}</li>
 *   <li>{@link testcopy.impl.OppositesAImpl#getManyToMany <em>Many To Many</em>}</li>
 *   <li>{@link testcopy.impl.OppositesAImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OppositesAImpl extends MinimalEObjectImpl.Container implements OppositesA {
	/**
	 * The cached value of the '{@link #getToB() <em>To B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToB()
	 * @generated
	 * @ordered
	 */
	protected OppositesB toB;

	/**
	 * The cached value of the '{@link #getOneToMany() <em>One To Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneToMany()
	 * @generated
	 * @ordered
	 */
	protected EList<OppositesB> oneToMany;

	/**
	 * The cached value of the '{@link #getManyToMany() <em>Many To Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyToMany()
	 * @generated
	 * @ordered
	 */
	protected EList<OppositesB> manyToMany;

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
	protected OppositesAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestcopyPackage.Literals.OPPOSITES_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositesB getToB() {
		if (toB != null && toB.eIsProxy()) {
			InternalEObject oldToB = (InternalEObject)toB;
			toB = (OppositesB)eResolveProxy(oldToB);
			if (toB != oldToB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcopyPackage.OPPOSITES_A__TO_B, oldToB, toB));
			}
		}
		return toB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositesB basicGetToB() {
		return toB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToB(OppositesB newToB, NotificationChain msgs) {
		OppositesB oldToB = toB;
		toB = newToB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestcopyPackage.OPPOSITES_A__TO_B, oldToB, newToB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToB(OppositesB newToB) {
		if (newToB != toB) {
			NotificationChain msgs = null;
			if (toB != null)
				msgs = ((InternalEObject)toB).eInverseRemove(this, TestcopyPackage.OPPOSITES_B__TO_A, OppositesB.class, msgs);
			if (newToB != null)
				msgs = ((InternalEObject)newToB).eInverseAdd(this, TestcopyPackage.OPPOSITES_B__TO_A, OppositesB.class, msgs);
			msgs = basicSetToB(newToB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcopyPackage.OPPOSITES_A__TO_B, newToB, newToB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OppositesB> getOneToMany() {
		if (oneToMany == null) {
			oneToMany = new EObjectContainmentWithInverseEList<OppositesB>(OppositesB.class, this, TestcopyPackage.OPPOSITES_A__ONE_TO_MANY, TestcopyPackage.OPPOSITES_B__MANY_TO_ONE);
		}
		return oneToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OppositesB> getManyToMany() {
		if (manyToMany == null) {
			manyToMany = new EObjectWithInverseResolvingEList.ManyInverse<OppositesB>(OppositesB.class, this, TestcopyPackage.OPPOSITES_A__MANY_TO_MANY, TestcopyPackage.OPPOSITES_B__MANY_TO_MANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestcopyPackage.OPPOSITES_A__NAME, oldName, name));
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
			case TestcopyPackage.OPPOSITES_A__TO_B:
				if (toB != null)
					msgs = ((InternalEObject)toB).eInverseRemove(this, TestcopyPackage.OPPOSITES_B__TO_A, OppositesB.class, msgs);
				return basicSetToB((OppositesB)otherEnd, msgs);
			case TestcopyPackage.OPPOSITES_A__ONE_TO_MANY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOneToMany()).basicAdd(otherEnd, msgs);
			case TestcopyPackage.OPPOSITES_A__MANY_TO_MANY:
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
			case TestcopyPackage.OPPOSITES_A__TO_B:
				return basicSetToB(null, msgs);
			case TestcopyPackage.OPPOSITES_A__ONE_TO_MANY:
				return ((InternalEList<?>)getOneToMany()).basicRemove(otherEnd, msgs);
			case TestcopyPackage.OPPOSITES_A__MANY_TO_MANY:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestcopyPackage.OPPOSITES_A__TO_B:
				if (resolve) return getToB();
				return basicGetToB();
			case TestcopyPackage.OPPOSITES_A__ONE_TO_MANY:
				return getOneToMany();
			case TestcopyPackage.OPPOSITES_A__MANY_TO_MANY:
				return getManyToMany();
			case TestcopyPackage.OPPOSITES_A__NAME:
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
			case TestcopyPackage.OPPOSITES_A__TO_B:
				setToB((OppositesB)newValue);
				return;
			case TestcopyPackage.OPPOSITES_A__ONE_TO_MANY:
				getOneToMany().clear();
				getOneToMany().addAll((Collection<? extends OppositesB>)newValue);
				return;
			case TestcopyPackage.OPPOSITES_A__MANY_TO_MANY:
				getManyToMany().clear();
				getManyToMany().addAll((Collection<? extends OppositesB>)newValue);
				return;
			case TestcopyPackage.OPPOSITES_A__NAME:
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
			case TestcopyPackage.OPPOSITES_A__TO_B:
				setToB((OppositesB)null);
				return;
			case TestcopyPackage.OPPOSITES_A__ONE_TO_MANY:
				getOneToMany().clear();
				return;
			case TestcopyPackage.OPPOSITES_A__MANY_TO_MANY:
				getManyToMany().clear();
				return;
			case TestcopyPackage.OPPOSITES_A__NAME:
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
			case TestcopyPackage.OPPOSITES_A__TO_B:
				return toB != null;
			case TestcopyPackage.OPPOSITES_A__ONE_TO_MANY:
				return oneToMany != null && !oneToMany.isEmpty();
			case TestcopyPackage.OPPOSITES_A__MANY_TO_MANY:
				return manyToMany != null && !manyToMany.isEmpty();
			case TestcopyPackage.OPPOSITES_A__NAME:
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

} //OppositesAImpl
