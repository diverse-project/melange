/**
 */
package exhaustive.impl;

import exhaustive.AbstractTest;
import exhaustive.AttributesTest;
import exhaustive.ExhaustivePackage;
import exhaustive.GenericTest;
import exhaustive.MultipleSuperTest;
import exhaustive.OperationsTest;
import exhaustive.ReferencesTest;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>References Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getChangeableYes <em>Changeable Yes</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getChangeableNo <em>Changeable No</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getContainmentYes <em>Containment Yes</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getReferenceToGenerics <em>Reference To Generics</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getOpposite1 <em>Opposite1</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getOrderedFalse <em>Ordered False</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getResolveProxiesFalse <em>Resolve Proxies False</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getTransientTrue <em>Transient True</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getUniqueFalse <em>Unique False</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getUnsettableTrue <em>Unsettable True</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getVolatileTrue <em>Volatile True</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getDerivedYes <em>Derived Yes</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getUpperBoundN <em>Upper Bound N</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getUpperBound2 <em>Upper Bound2</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getLowerBound1 <em>Lower Bound1</em>}</li>
 *   <li>{@link exhaustive.impl.ReferencesTestImpl#getLowerBound2 <em>Lower Bound2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencesTestImpl extends AbstractTestImpl implements ReferencesTest {
	/**
	 * The cached value of the '{@link #getChangeableYes() <em>Changeable Yes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableYes()
	 * @generated
	 * @ordered
	 */
	protected AbstractTest changeableYes;

	/**
	 * The cached value of the '{@link #getChangeableNo() <em>Changeable No</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableNo()
	 * @generated
	 * @ordered
	 */
	protected AbstractTest changeableNo;

	/**
	 * The cached value of the '{@link #getContainmentYes() <em>Containment Yes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentYes()
	 * @generated
	 * @ordered
	 */
	protected MultipleSuperTest containmentYes;

	/**
	 * The cached value of the '{@link #getReferenceToGenerics() <em>Reference To Generics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceToGenerics()
	 * @generated
	 * @ordered
	 */
	protected GenericTest<AbstractTest, OperationsTest> referenceToGenerics;

	/**
	 * The cached value of the '{@link #getOpposite1() <em>Opposite1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite1()
	 * @generated
	 * @ordered
	 */
	protected AttributesTest opposite1;

	/**
	 * The cached value of the '{@link #getOrderedFalse() <em>Ordered False</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedFalse()
	 * @generated
	 * @ordered
	 */
	protected AttributesTest orderedFalse;

	/**
	 * The cached value of the '{@link #getResolveProxiesFalse() <em>Resolve Proxies False</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveProxiesFalse()
	 * @generated
	 * @ordered
	 */
	protected AttributesTest resolveProxiesFalse;

	/**
	 * The cached value of the '{@link #getTransientTrue() <em>Transient True</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientTrue()
	 * @generated
	 * @ordered
	 */
	protected AttributesTest transientTrue;

	/**
	 * The cached value of the '{@link #getUniqueFalse() <em>Unique False</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueFalse()
	 * @generated
	 * @ordered
	 */
	protected AttributesTest uniqueFalse;

	/**
	 * The cached value of the '{@link #getUnsettableTrue() <em>Unsettable True</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsettableTrue()
	 * @generated
	 * @ordered
	 */
	protected AttributesTest unsettableTrue;

	/**
	 * This is true if the Unsettable True reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unsettableTrueESet;

	/**
	 * The cached value of the '{@link #getDerivedYes() <em>Derived Yes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedYes()
	 * @generated
	 * @ordered
	 */
	protected AttributesTest derivedYes;

	/**
	 * The cached value of the '{@link #getUpperBoundN() <em>Upper Bound N</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBoundN()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributesTest> upperBoundN;

	/**
	 * The cached value of the '{@link #getUpperBound2() <em>Upper Bound2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound2()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributesTest> upperBound2;

	/**
	 * The cached value of the '{@link #getLowerBound1() <em>Lower Bound1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound1()
	 * @generated
	 * @ordered
	 */
	protected AttributesTest lowerBound1;

	/**
	 * The cached value of the '{@link #getLowerBound2() <em>Lower Bound2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound2()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributesTest> lowerBound2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencesTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExhaustivePackage.Literals.REFERENCES_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTest getChangeableYes() {
		if (changeableYes != null && changeableYes.eIsProxy()) {
			InternalEObject oldChangeableYes = (InternalEObject)changeableYes;
			changeableYes = (AbstractTest)eResolveProxy(oldChangeableYes);
			if (changeableYes != oldChangeableYes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExhaustivePackage.REFERENCES_TEST__CHANGEABLE_YES, oldChangeableYes, changeableYes));
			}
		}
		return changeableYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTest basicGetChangeableYes() {
		return changeableYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeableYes(AbstractTest newChangeableYes) {
		AbstractTest oldChangeableYes = changeableYes;
		changeableYes = newChangeableYes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__CHANGEABLE_YES, oldChangeableYes, changeableYes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTest getChangeableNo() {
		if (changeableNo != null && changeableNo.eIsProxy()) {
			InternalEObject oldChangeableNo = (InternalEObject)changeableNo;
			changeableNo = (AbstractTest)eResolveProxy(oldChangeableNo);
			if (changeableNo != oldChangeableNo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExhaustivePackage.REFERENCES_TEST__CHANGEABLE_NO, oldChangeableNo, changeableNo));
			}
		}
		return changeableNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTest basicGetChangeableNo() {
		return changeableNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSuperTest getContainmentYes() {
		return containmentYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainmentYes(MultipleSuperTest newContainmentYes, NotificationChain msgs) {
		MultipleSuperTest oldContainmentYes = containmentYes;
		containmentYes = newContainmentYes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__CONTAINMENT_YES, oldContainmentYes, newContainmentYes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainmentYes(MultipleSuperTest newContainmentYes) {
		if (newContainmentYes != containmentYes) {
			NotificationChain msgs = null;
			if (containmentYes != null)
				msgs = ((InternalEObject)containmentYes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExhaustivePackage.REFERENCES_TEST__CONTAINMENT_YES, null, msgs);
			if (newContainmentYes != null)
				msgs = ((InternalEObject)newContainmentYes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExhaustivePackage.REFERENCES_TEST__CONTAINMENT_YES, null, msgs);
			msgs = basicSetContainmentYes(newContainmentYes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__CONTAINMENT_YES, newContainmentYes, newContainmentYes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public GenericTest<AbstractTest, OperationsTest> getReferenceToGenerics() {
		if (referenceToGenerics != null && referenceToGenerics.eIsProxy()) {
			InternalEObject oldReferenceToGenerics = (InternalEObject)referenceToGenerics;
			referenceToGenerics = (GenericTest<AbstractTest, OperationsTest>)eResolveProxy(oldReferenceToGenerics);
			if (referenceToGenerics != oldReferenceToGenerics) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExhaustivePackage.REFERENCES_TEST__REFERENCE_TO_GENERICS, oldReferenceToGenerics, referenceToGenerics));
			}
		}
		return referenceToGenerics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericTest<AbstractTest, OperationsTest> basicGetReferenceToGenerics() {
		return referenceToGenerics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceToGenerics(GenericTest<AbstractTest, OperationsTest> newReferenceToGenerics) {
		GenericTest<AbstractTest, OperationsTest> oldReferenceToGenerics = referenceToGenerics;
		referenceToGenerics = newReferenceToGenerics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__REFERENCE_TO_GENERICS, oldReferenceToGenerics, referenceToGenerics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest getOpposite1() {
		if (opposite1 != null && opposite1.eIsProxy()) {
			InternalEObject oldOpposite1 = (InternalEObject)opposite1;
			opposite1 = (AttributesTest)eResolveProxy(oldOpposite1);
			if (opposite1 != oldOpposite1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExhaustivePackage.REFERENCES_TEST__OPPOSITE1, oldOpposite1, opposite1));
			}
		}
		return opposite1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest basicGetOpposite1() {
		return opposite1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpposite1(AttributesTest newOpposite1, NotificationChain msgs) {
		AttributesTest oldOpposite1 = opposite1;
		opposite1 = newOpposite1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__OPPOSITE1, oldOpposite1, newOpposite1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite1(AttributesTest newOpposite1) {
		if (newOpposite1 != opposite1) {
			NotificationChain msgs = null;
			if (opposite1 != null)
				msgs = ((InternalEObject)opposite1).eInverseRemove(this, ExhaustivePackage.ATTRIBUTES_TEST__OPPOSITE2, AttributesTest.class, msgs);
			if (newOpposite1 != null)
				msgs = ((InternalEObject)newOpposite1).eInverseAdd(this, ExhaustivePackage.ATTRIBUTES_TEST__OPPOSITE2, AttributesTest.class, msgs);
			msgs = basicSetOpposite1(newOpposite1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__OPPOSITE1, newOpposite1, newOpposite1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest getOrderedFalse() {
		if (orderedFalse != null && orderedFalse.eIsProxy()) {
			InternalEObject oldOrderedFalse = (InternalEObject)orderedFalse;
			orderedFalse = (AttributesTest)eResolveProxy(oldOrderedFalse);
			if (orderedFalse != oldOrderedFalse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExhaustivePackage.REFERENCES_TEST__ORDERED_FALSE, oldOrderedFalse, orderedFalse));
			}
		}
		return orderedFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest basicGetOrderedFalse() {
		return orderedFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedFalse(AttributesTest newOrderedFalse) {
		AttributesTest oldOrderedFalse = orderedFalse;
		orderedFalse = newOrderedFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__ORDERED_FALSE, oldOrderedFalse, orderedFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest getResolveProxiesFalse() {
		return resolveProxiesFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolveProxiesFalse(AttributesTest newResolveProxiesFalse) {
		AttributesTest oldResolveProxiesFalse = resolveProxiesFalse;
		resolveProxiesFalse = newResolveProxiesFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__RESOLVE_PROXIES_FALSE, oldResolveProxiesFalse, resolveProxiesFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest getTransientTrue() {
		if (transientTrue != null && transientTrue.eIsProxy()) {
			InternalEObject oldTransientTrue = (InternalEObject)transientTrue;
			transientTrue = (AttributesTest)eResolveProxy(oldTransientTrue);
			if (transientTrue != oldTransientTrue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExhaustivePackage.REFERENCES_TEST__TRANSIENT_TRUE, oldTransientTrue, transientTrue));
			}
		}
		return transientTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest basicGetTransientTrue() {
		return transientTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransientTrue(AttributesTest newTransientTrue) {
		AttributesTest oldTransientTrue = transientTrue;
		transientTrue = newTransientTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__TRANSIENT_TRUE, oldTransientTrue, transientTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest getUniqueFalse() {
		if (uniqueFalse != null && uniqueFalse.eIsProxy()) {
			InternalEObject oldUniqueFalse = (InternalEObject)uniqueFalse;
			uniqueFalse = (AttributesTest)eResolveProxy(oldUniqueFalse);
			if (uniqueFalse != oldUniqueFalse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExhaustivePackage.REFERENCES_TEST__UNIQUE_FALSE, oldUniqueFalse, uniqueFalse));
			}
		}
		return uniqueFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest basicGetUniqueFalse() {
		return uniqueFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueFalse(AttributesTest newUniqueFalse) {
		AttributesTest oldUniqueFalse = uniqueFalse;
		uniqueFalse = newUniqueFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__UNIQUE_FALSE, oldUniqueFalse, uniqueFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest getUnsettableTrue() {
		if (unsettableTrue != null && unsettableTrue.eIsProxy()) {
			InternalEObject oldUnsettableTrue = (InternalEObject)unsettableTrue;
			unsettableTrue = (AttributesTest)eResolveProxy(oldUnsettableTrue);
			if (unsettableTrue != oldUnsettableTrue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExhaustivePackage.REFERENCES_TEST__UNSETTABLE_TRUE, oldUnsettableTrue, unsettableTrue));
			}
		}
		return unsettableTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest basicGetUnsettableTrue() {
		return unsettableTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsettableTrue(AttributesTest newUnsettableTrue) {
		AttributesTest oldUnsettableTrue = unsettableTrue;
		unsettableTrue = newUnsettableTrue;
		boolean oldUnsettableTrueESet = unsettableTrueESet;
		unsettableTrueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__UNSETTABLE_TRUE, oldUnsettableTrue, unsettableTrue, !oldUnsettableTrueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnsettableTrue() {
		AttributesTest oldUnsettableTrue = unsettableTrue;
		boolean oldUnsettableTrueESet = unsettableTrueESet;
		unsettableTrue = null;
		unsettableTrueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExhaustivePackage.REFERENCES_TEST__UNSETTABLE_TRUE, oldUnsettableTrue, null, oldUnsettableTrueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnsettableTrue() {
		return unsettableTrueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest getVolatileTrue() {
		AttributesTest volatileTrue = basicGetVolatileTrue();
		return volatileTrue != null && volatileTrue.eIsProxy() ? (AttributesTest)eResolveProxy((InternalEObject)volatileTrue) : volatileTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest basicGetVolatileTrue() {
		// TODO: implement this method to return the 'Volatile True' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatileTrue(AttributesTest newVolatileTrue) {
		// TODO: implement this method to set the 'Volatile True' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest getDerivedYes() {
		if (derivedYes != null && derivedYes.eIsProxy()) {
			InternalEObject oldDerivedYes = (InternalEObject)derivedYes;
			derivedYes = (AttributesTest)eResolveProxy(oldDerivedYes);
			if (derivedYes != oldDerivedYes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExhaustivePackage.REFERENCES_TEST__DERIVED_YES, oldDerivedYes, derivedYes));
			}
		}
		return derivedYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest basicGetDerivedYes() {
		return derivedYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedYes(AttributesTest newDerivedYes) {
		AttributesTest oldDerivedYes = derivedYes;
		derivedYes = newDerivedYes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__DERIVED_YES, oldDerivedYes, derivedYes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributesTest> getUpperBoundN() {
		if (upperBoundN == null) {
			upperBoundN = new EObjectResolvingEList<AttributesTest>(AttributesTest.class, this, ExhaustivePackage.REFERENCES_TEST__UPPER_BOUND_N);
		}
		return upperBoundN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributesTest> getUpperBound2() {
		if (upperBound2 == null) {
			upperBound2 = new EObjectResolvingEList<AttributesTest>(AttributesTest.class, this, ExhaustivePackage.REFERENCES_TEST__UPPER_BOUND2);
		}
		return upperBound2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest getLowerBound1() {
		if (lowerBound1 != null && lowerBound1.eIsProxy()) {
			InternalEObject oldLowerBound1 = (InternalEObject)lowerBound1;
			lowerBound1 = (AttributesTest)eResolveProxy(oldLowerBound1);
			if (lowerBound1 != oldLowerBound1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExhaustivePackage.REFERENCES_TEST__LOWER_BOUND1, oldLowerBound1, lowerBound1));
			}
		}
		return lowerBound1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesTest basicGetLowerBound1() {
		return lowerBound1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound1(AttributesTest newLowerBound1) {
		AttributesTest oldLowerBound1 = lowerBound1;
		lowerBound1 = newLowerBound1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.REFERENCES_TEST__LOWER_BOUND1, oldLowerBound1, lowerBound1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributesTest> getLowerBound2() {
		if (lowerBound2 == null) {
			lowerBound2 = new EObjectResolvingEList<AttributesTest>(AttributesTest.class, this, ExhaustivePackage.REFERENCES_TEST__LOWER_BOUND2);
		}
		return lowerBound2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExhaustivePackage.REFERENCES_TEST__OPPOSITE1:
				if (opposite1 != null)
					msgs = ((InternalEObject)opposite1).eInverseRemove(this, ExhaustivePackage.ATTRIBUTES_TEST__OPPOSITE2, AttributesTest.class, msgs);
				return basicSetOpposite1((AttributesTest)otherEnd, msgs);
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
			case ExhaustivePackage.REFERENCES_TEST__CONTAINMENT_YES:
				return basicSetContainmentYes(null, msgs);
			case ExhaustivePackage.REFERENCES_TEST__OPPOSITE1:
				return basicSetOpposite1(null, msgs);
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
			case ExhaustivePackage.REFERENCES_TEST__CHANGEABLE_YES:
				if (resolve) return getChangeableYes();
				return basicGetChangeableYes();
			case ExhaustivePackage.REFERENCES_TEST__CHANGEABLE_NO:
				if (resolve) return getChangeableNo();
				return basicGetChangeableNo();
			case ExhaustivePackage.REFERENCES_TEST__CONTAINMENT_YES:
				return getContainmentYes();
			case ExhaustivePackage.REFERENCES_TEST__REFERENCE_TO_GENERICS:
				if (resolve) return getReferenceToGenerics();
				return basicGetReferenceToGenerics();
			case ExhaustivePackage.REFERENCES_TEST__OPPOSITE1:
				if (resolve) return getOpposite1();
				return basicGetOpposite1();
			case ExhaustivePackage.REFERENCES_TEST__ORDERED_FALSE:
				if (resolve) return getOrderedFalse();
				return basicGetOrderedFalse();
			case ExhaustivePackage.REFERENCES_TEST__RESOLVE_PROXIES_FALSE:
				return getResolveProxiesFalse();
			case ExhaustivePackage.REFERENCES_TEST__TRANSIENT_TRUE:
				if (resolve) return getTransientTrue();
				return basicGetTransientTrue();
			case ExhaustivePackage.REFERENCES_TEST__UNIQUE_FALSE:
				if (resolve) return getUniqueFalse();
				return basicGetUniqueFalse();
			case ExhaustivePackage.REFERENCES_TEST__UNSETTABLE_TRUE:
				if (resolve) return getUnsettableTrue();
				return basicGetUnsettableTrue();
			case ExhaustivePackage.REFERENCES_TEST__VOLATILE_TRUE:
				if (resolve) return getVolatileTrue();
				return basicGetVolatileTrue();
			case ExhaustivePackage.REFERENCES_TEST__DERIVED_YES:
				if (resolve) return getDerivedYes();
				return basicGetDerivedYes();
			case ExhaustivePackage.REFERENCES_TEST__UPPER_BOUND_N:
				return getUpperBoundN();
			case ExhaustivePackage.REFERENCES_TEST__UPPER_BOUND2:
				return getUpperBound2();
			case ExhaustivePackage.REFERENCES_TEST__LOWER_BOUND1:
				if (resolve) return getLowerBound1();
				return basicGetLowerBound1();
			case ExhaustivePackage.REFERENCES_TEST__LOWER_BOUND2:
				return getLowerBound2();
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
			case ExhaustivePackage.REFERENCES_TEST__CHANGEABLE_YES:
				setChangeableYes((AbstractTest)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__CONTAINMENT_YES:
				setContainmentYes((MultipleSuperTest)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__REFERENCE_TO_GENERICS:
				setReferenceToGenerics((GenericTest<AbstractTest, OperationsTest>)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__OPPOSITE1:
				setOpposite1((AttributesTest)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__ORDERED_FALSE:
				setOrderedFalse((AttributesTest)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__RESOLVE_PROXIES_FALSE:
				setResolveProxiesFalse((AttributesTest)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__TRANSIENT_TRUE:
				setTransientTrue((AttributesTest)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__UNIQUE_FALSE:
				setUniqueFalse((AttributesTest)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__UNSETTABLE_TRUE:
				setUnsettableTrue((AttributesTest)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__VOLATILE_TRUE:
				setVolatileTrue((AttributesTest)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__DERIVED_YES:
				setDerivedYes((AttributesTest)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__UPPER_BOUND_N:
				getUpperBoundN().clear();
				getUpperBoundN().addAll((Collection<? extends AttributesTest>)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__UPPER_BOUND2:
				getUpperBound2().clear();
				getUpperBound2().addAll((Collection<? extends AttributesTest>)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__LOWER_BOUND1:
				setLowerBound1((AttributesTest)newValue);
				return;
			case ExhaustivePackage.REFERENCES_TEST__LOWER_BOUND2:
				getLowerBound2().clear();
				getLowerBound2().addAll((Collection<? extends AttributesTest>)newValue);
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
			case ExhaustivePackage.REFERENCES_TEST__CHANGEABLE_YES:
				setChangeableYes((AbstractTest)null);
				return;
			case ExhaustivePackage.REFERENCES_TEST__CONTAINMENT_YES:
				setContainmentYes((MultipleSuperTest)null);
				return;
			case ExhaustivePackage.REFERENCES_TEST__REFERENCE_TO_GENERICS:
				setReferenceToGenerics((GenericTest<AbstractTest, OperationsTest>)null);
				return;
			case ExhaustivePackage.REFERENCES_TEST__OPPOSITE1:
				setOpposite1((AttributesTest)null);
				return;
			case ExhaustivePackage.REFERENCES_TEST__ORDERED_FALSE:
				setOrderedFalse((AttributesTest)null);
				return;
			case ExhaustivePackage.REFERENCES_TEST__RESOLVE_PROXIES_FALSE:
				setResolveProxiesFalse((AttributesTest)null);
				return;
			case ExhaustivePackage.REFERENCES_TEST__TRANSIENT_TRUE:
				setTransientTrue((AttributesTest)null);
				return;
			case ExhaustivePackage.REFERENCES_TEST__UNIQUE_FALSE:
				setUniqueFalse((AttributesTest)null);
				return;
			case ExhaustivePackage.REFERENCES_TEST__UNSETTABLE_TRUE:
				unsetUnsettableTrue();
				return;
			case ExhaustivePackage.REFERENCES_TEST__VOLATILE_TRUE:
				setVolatileTrue((AttributesTest)null);
				return;
			case ExhaustivePackage.REFERENCES_TEST__DERIVED_YES:
				setDerivedYes((AttributesTest)null);
				return;
			case ExhaustivePackage.REFERENCES_TEST__UPPER_BOUND_N:
				getUpperBoundN().clear();
				return;
			case ExhaustivePackage.REFERENCES_TEST__UPPER_BOUND2:
				getUpperBound2().clear();
				return;
			case ExhaustivePackage.REFERENCES_TEST__LOWER_BOUND1:
				setLowerBound1((AttributesTest)null);
				return;
			case ExhaustivePackage.REFERENCES_TEST__LOWER_BOUND2:
				getLowerBound2().clear();
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
			case ExhaustivePackage.REFERENCES_TEST__CHANGEABLE_YES:
				return changeableYes != null;
			case ExhaustivePackage.REFERENCES_TEST__CHANGEABLE_NO:
				return changeableNo != null;
			case ExhaustivePackage.REFERENCES_TEST__CONTAINMENT_YES:
				return containmentYes != null;
			case ExhaustivePackage.REFERENCES_TEST__REFERENCE_TO_GENERICS:
				return referenceToGenerics != null;
			case ExhaustivePackage.REFERENCES_TEST__OPPOSITE1:
				return opposite1 != null;
			case ExhaustivePackage.REFERENCES_TEST__ORDERED_FALSE:
				return orderedFalse != null;
			case ExhaustivePackage.REFERENCES_TEST__RESOLVE_PROXIES_FALSE:
				return resolveProxiesFalse != null;
			case ExhaustivePackage.REFERENCES_TEST__TRANSIENT_TRUE:
				return transientTrue != null;
			case ExhaustivePackage.REFERENCES_TEST__UNIQUE_FALSE:
				return uniqueFalse != null;
			case ExhaustivePackage.REFERENCES_TEST__UNSETTABLE_TRUE:
				return isSetUnsettableTrue();
			case ExhaustivePackage.REFERENCES_TEST__VOLATILE_TRUE:
				return basicGetVolatileTrue() != null;
			case ExhaustivePackage.REFERENCES_TEST__DERIVED_YES:
				return derivedYes != null;
			case ExhaustivePackage.REFERENCES_TEST__UPPER_BOUND_N:
				return upperBoundN != null && !upperBoundN.isEmpty();
			case ExhaustivePackage.REFERENCES_TEST__UPPER_BOUND2:
				return upperBound2 != null && !upperBound2.isEmpty();
			case ExhaustivePackage.REFERENCES_TEST__LOWER_BOUND1:
				return lowerBound1 != null;
			case ExhaustivePackage.REFERENCES_TEST__LOWER_BOUND2:
				return lowerBound2 != null && !lowerBound2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferencesTestImpl
