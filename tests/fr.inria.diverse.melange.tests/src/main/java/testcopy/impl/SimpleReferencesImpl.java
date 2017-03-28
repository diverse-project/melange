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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import testcopy.Attributes;
import testcopy.SimpleReferences;
import testcopy.TestcopyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple References</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testcopy.impl.SimpleReferencesImpl#getSimpleRef <em>Simple Ref</em>}</li>
 *   <li>{@link testcopy.impl.SimpleReferencesImpl#getContainmentRef <em>Containment Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleReferencesImpl extends MinimalEObjectImpl.Container implements SimpleReferences {
	/**
	 * The cached value of the '{@link #getSimpleRef() <em>Simple Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleRef()
	 * @generated
	 * @ordered
	 */
	protected Attributes simpleRef;

	/**
	 * The cached value of the '{@link #getContainmentRef() <em>Containment Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentRef()
	 * @generated
	 * @ordered
	 */
	protected EList<Attributes> containmentRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleReferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestcopyPackage.Literals.SIMPLE_REFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getSimpleRef() {
		if (simpleRef != null && simpleRef.eIsProxy()) {
			InternalEObject oldSimpleRef = (InternalEObject)simpleRef;
			simpleRef = (Attributes)eResolveProxy(oldSimpleRef);
			if (simpleRef != oldSimpleRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcopyPackage.SIMPLE_REFERENCES__SIMPLE_REF, oldSimpleRef, simpleRef));
			}
		}
		return simpleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes basicGetSimpleRef() {
		return simpleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleRef(Attributes newSimpleRef) {
		Attributes oldSimpleRef = simpleRef;
		simpleRef = newSimpleRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcopyPackage.SIMPLE_REFERENCES__SIMPLE_REF, oldSimpleRef, simpleRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attributes> getContainmentRef() {
		if (containmentRef == null) {
			containmentRef = new EObjectContainmentEList<Attributes>(Attributes.class, this, TestcopyPackage.SIMPLE_REFERENCES__CONTAINMENT_REF);
		}
		return containmentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestcopyPackage.SIMPLE_REFERENCES__CONTAINMENT_REF:
				return ((InternalEList<?>)getContainmentRef()).basicRemove(otherEnd, msgs);
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
			case TestcopyPackage.SIMPLE_REFERENCES__SIMPLE_REF:
				if (resolve) return getSimpleRef();
				return basicGetSimpleRef();
			case TestcopyPackage.SIMPLE_REFERENCES__CONTAINMENT_REF:
				return getContainmentRef();
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
			case TestcopyPackage.SIMPLE_REFERENCES__SIMPLE_REF:
				setSimpleRef((Attributes)newValue);
				return;
			case TestcopyPackage.SIMPLE_REFERENCES__CONTAINMENT_REF:
				getContainmentRef().clear();
				getContainmentRef().addAll((Collection<? extends Attributes>)newValue);
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
			case TestcopyPackage.SIMPLE_REFERENCES__SIMPLE_REF:
				setSimpleRef((Attributes)null);
				return;
			case TestcopyPackage.SIMPLE_REFERENCES__CONTAINMENT_REF:
				getContainmentRef().clear();
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
			case TestcopyPackage.SIMPLE_REFERENCES__SIMPLE_REF:
				return simpleRef != null;
			case TestcopyPackage.SIMPLE_REFERENCES__CONTAINMENT_REF:
				return containmentRef != null && !containmentRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleReferencesImpl
