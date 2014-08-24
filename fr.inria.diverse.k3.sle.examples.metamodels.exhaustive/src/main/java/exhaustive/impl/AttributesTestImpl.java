/**
 */
package exhaustive.impl;

import exhaustive.AttributesTest;
import exhaustive.ExhaustivePackage;
import exhaustive.ReferencesTest;
import exhaustive.SerializableEnumTest;
import exhaustive.UnserializableEnumTest;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributes Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getChangeableYes <em>Changeable Yes</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getChangeableNo <em>Changeable No</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getDerivedYes <em>Derived Yes</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getDerivedNo <em>Derived No</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getIdYes <em>Id Yes</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getIdNo <em>Id No</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getLowerBound0 <em>Lower Bound0</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getLowerBound1 <em>Lower Bound1</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getLowerBound2 <em>Lower Bound2</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getLowerBoundN <em>Lower Bound N</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getUpperBound0 <em>Upper Bound0</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getUpperBound1 <em>Upper Bound1</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getUpperBound2 <em>Upper Bound2</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getUpperBoundN <em>Upper Bound N</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getOrderedYes <em>Ordered Yes</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getOrderenedNo <em>Orderened No</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getTransientYes <em>Transient Yes</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getTransientNo <em>Transient No</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getUniqueYes <em>Unique Yes</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getUniqueNo <em>Unique No</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getUnsettableYes <em>Unsettable Yes</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getUnsettableNo <em>Unsettable No</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getVolatileYes <em>Volatile Yes</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getVolatileNo <em>Volatile No</em>}</li>
 *   <li>{@link exhaustive.impl.AttributesTestImpl#getOpposite2 <em>Opposite2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributesTestImpl extends MultipleSuperTestImpl implements AttributesTest {
	/**
	 * The default value of the '{@link #getChangeableYes() <em>Changeable Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableYes()
	 * @generated
	 * @ordered
	 */
	protected static final double CHANGEABLE_YES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getChangeableYes() <em>Changeable Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableYes()
	 * @generated
	 * @ordered
	 */
	protected double changeableYes = CHANGEABLE_YES_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeableNo() <em>Changeable No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableNo()
	 * @generated
	 * @ordered
	 */
	protected static final SerializableEnumTest CHANGEABLE_NO_EDEFAULT = SerializableEnumTest.NAME3;

	/**
	 * The cached value of the '{@link #getChangeableNo() <em>Changeable No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableNo()
	 * @generated
	 * @ordered
	 */
	protected SerializableEnumTest changeableNo = CHANGEABLE_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivedYes() <em>Derived Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedYes()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_YES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerivedYes() <em>Derived Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedYes()
	 * @generated
	 * @ordered
	 */
	protected String derivedYes = DERIVED_YES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivedNo() <em>Derived No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedNo()
	 * @generated
	 * @ordered
	 */
	protected static final UnserializableEnumTest DERIVED_NO_EDEFAULT = UnserializableEnumTest.NAME1;

	/**
	 * The cached value of the '{@link #getDerivedNo() <em>Derived No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedNo()
	 * @generated
	 * @ordered
	 */
	protected UnserializableEnumTest derivedNo = DERIVED_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdYes() <em>Id Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdYes()
	 * @generated
	 * @ordered
	 */
	protected static final short ID_YES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdYes() <em>Id Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdYes()
	 * @generated
	 * @ordered
	 */
	protected short idYes = ID_YES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdNo() <em>Id No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNo()
	 * @generated
	 * @ordered
	 */
	protected static final short ID_NO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdNo() <em>Id No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNo()
	 * @generated
	 * @ordered
	 */
	protected short idNo = ID_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound0() <em>Lower Bound0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound0()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND0_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound0() <em>Lower Bound0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound0()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound0 = LOWER_BOUND0_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound1() <em>Lower Bound1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound1()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_BOUND1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBound1() <em>Lower Bound1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound1()
	 * @generated
	 * @ordered
	 */
	protected Integer lowerBound1 = LOWER_BOUND1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLowerBound2() <em>Lower Bound2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound2()
	 * @generated
	 * @ordered
	 */
	protected EList<Short> lowerBound2;

	/**
	 * The default value of the '{@link #getLowerBoundN() <em>Lower Bound N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBoundN()
	 * @generated
	 * @ordered
	 */
	protected static final SerializableEnumTest LOWER_BOUND_N_EDEFAULT = SerializableEnumTest.NAME3;

	/**
	 * The cached value of the '{@link #getLowerBoundN() <em>Lower Bound N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBoundN()
	 * @generated
	 * @ordered
	 */
	protected SerializableEnumTest lowerBoundN = LOWER_BOUND_N_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound0() <em>Upper Bound0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound0()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_BOUND0_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound0() <em>Upper Bound0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound0()
	 * @generated
	 * @ordered
	 */
	protected String upperBound0 = UPPER_BOUND0_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound1() <em>Upper Bound1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound1()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPPER_BOUND1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound1() <em>Upper Bound1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound1()
	 * @generated
	 * @ordered
	 */
	protected Date upperBound1 = UPPER_BOUND1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpperBound2() <em>Upper Bound2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound2()
	 * @generated
	 * @ordered
	 */
	protected EList<String> upperBound2;

	/**
	 * The cached value of the '{@link #getUpperBoundN() <em>Upper Bound N</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBoundN()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> upperBoundN;

	/**
	 * The default value of the '{@link #getOrderedYes() <em>Ordered Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedYes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORDERED_YES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderedYes() <em>Ordered Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedYes()
	 * @generated
	 * @ordered
	 */
	protected Integer orderedYes = ORDERED_YES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderenedNo() <em>Orderened No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderenedNo()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ORDERENED_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderenedNo() <em>Orderened No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderenedNo()
	 * @generated
	 * @ordered
	 */
	protected Boolean orderenedNo = ORDERENED_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransientYes() <em>Transient Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientYes()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSIENT_YES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransientYes() <em>Transient Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientYes()
	 * @generated
	 * @ordered
	 */
	protected double transientYes = TRANSIENT_YES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransientNo() <em>Transient No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientNo()
	 * @generated
	 * @ordered
	 */
	protected static final long TRANSIENT_NO_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTransientNo() <em>Transient No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientNo()
	 * @generated
	 * @ordered
	 */
	protected long transientNo = TRANSIENT_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueYes() <em>Unique Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueYes()
	 * @generated
	 * @ordered
	 */
	protected static final SerializableEnumTest UNIQUE_YES_EDEFAULT = SerializableEnumTest.NAME3;

	/**
	 * The cached value of the '{@link #getUniqueYes() <em>Unique Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueYes()
	 * @generated
	 * @ordered
	 */
	protected SerializableEnumTest uniqueYes = UNIQUE_YES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueNo() <em>Unique No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueNo()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueNo() <em>Unique No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueNo()
	 * @generated
	 * @ordered
	 */
	protected String uniqueNo = UNIQUE_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnsettableYes() <em>Unsettable Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsettableYes()
	 * @generated
	 * @ordered
	 */
	protected static final String UNSETTABLE_YES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnsettableYes() <em>Unsettable Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsettableYes()
	 * @generated
	 * @ordered
	 */
	protected String unsettableYes = UNSETTABLE_YES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnsettableNo() <em>Unsettable No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsettableNo()
	 * @generated
	 * @ordered
	 */
	protected static final SerializableEnumTest UNSETTABLE_NO_EDEFAULT = SerializableEnumTest.NAME3;

	/**
	 * The cached value of the '{@link #getUnsettableNo() <em>Unsettable No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsettableNo()
	 * @generated
	 * @ordered
	 */
	protected SerializableEnumTest unsettableNo = UNSETTABLE_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolatileYes() <em>Volatile Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatileYes()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLATILE_YES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolatileYes() <em>Volatile Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatileYes()
	 * @generated
	 * @ordered
	 */
	protected String volatileYes = VOLATILE_YES_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolatileNo() <em>Volatile No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatileNo()
	 * @generated
	 * @ordered
	 */
	protected static final UnserializableEnumTest VOLATILE_NO_EDEFAULT = UnserializableEnumTest.NAME1;

	/**
	 * The cached value of the '{@link #getVolatileNo() <em>Volatile No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatileNo()
	 * @generated
	 * @ordered
	 */
	protected UnserializableEnumTest volatileNo = VOLATILE_NO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpposite2() <em>Opposite2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite2()
	 * @generated
	 * @ordered
	 */
	protected ReferencesTest opposite2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributesTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExhaustivePackage.Literals.ATTRIBUTES_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getChangeableYes() {
		return changeableYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeableYes(double newChangeableYes) {
		double oldChangeableYes = changeableYes;
		changeableYes = newChangeableYes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__CHANGEABLE_YES, oldChangeableYes, changeableYes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializableEnumTest getChangeableNo() {
		return changeableNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeableNo(SerializableEnumTest newChangeableNo) {
		SerializableEnumTest oldChangeableNo = changeableNo;
		changeableNo = newChangeableNo == null ? CHANGEABLE_NO_EDEFAULT : newChangeableNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__CHANGEABLE_NO, oldChangeableNo, changeableNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDerivedYes() {
		return derivedYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedYes(String newDerivedYes) {
		String oldDerivedYes = derivedYes;
		derivedYes = newDerivedYes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__DERIVED_YES, oldDerivedYes, derivedYes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnserializableEnumTest getDerivedNo() {
		return derivedNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedNo(UnserializableEnumTest newDerivedNo) {
		UnserializableEnumTest oldDerivedNo = derivedNo;
		derivedNo = newDerivedNo == null ? DERIVED_NO_EDEFAULT : newDerivedNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__DERIVED_NO, oldDerivedNo, derivedNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getIdYes() {
		return idYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdYes(short newIdYes) {
		short oldIdYes = idYes;
		idYes = newIdYes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__ID_YES, oldIdYes, idYes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getIdNo() {
		return idNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdNo(short newIdNo) {
		short oldIdNo = idNo;
		idNo = newIdNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__ID_NO, oldIdNo, idNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound0() {
		return lowerBound0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound0(int newLowerBound0) {
		int oldLowerBound0 = lowerBound0;
		lowerBound0 = newLowerBound0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND0, oldLowerBound0, lowerBound0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLowerBound1() {
		return lowerBound1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound1(Integer newLowerBound1) {
		Integer oldLowerBound1 = lowerBound1;
		lowerBound1 = newLowerBound1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND1, oldLowerBound1, lowerBound1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Short> getLowerBound2() {
		if (lowerBound2 == null) {
			lowerBound2 = new EDataTypeUniqueEList<Short>(Short.class, this, ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND2);
		}
		return lowerBound2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializableEnumTest getLowerBoundN() {
		return lowerBoundN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBoundN(SerializableEnumTest newLowerBoundN) {
		SerializableEnumTest oldLowerBoundN = lowerBoundN;
		lowerBoundN = newLowerBoundN == null ? LOWER_BOUND_N_EDEFAULT : newLowerBoundN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND_N, oldLowerBoundN, lowerBoundN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperBound0() {
		return upperBound0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound0(String newUpperBound0) {
		String oldUpperBound0 = upperBound0;
		upperBound0 = newUpperBound0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND0, oldUpperBound0, upperBound0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUpperBound1() {
		return upperBound1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound1(Date newUpperBound1) {
		Date oldUpperBound1 = upperBound1;
		upperBound1 = newUpperBound1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND1, oldUpperBound1, upperBound1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUpperBound2() {
		if (upperBound2 == null) {
			upperBound2 = new EDataTypeUniqueEList<String>(String.class, this, ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND2);
		}
		return upperBound2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getUpperBoundN() {
		if (upperBoundN == null) {
			upperBoundN = new EDataTypeUniqueEList<Long>(Long.class, this, ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND_N);
		}
		return upperBoundN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOrderedYes() {
		return orderedYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedYes(Integer newOrderedYes) {
		Integer oldOrderedYes = orderedYes;
		orderedYes = newOrderedYes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__ORDERED_YES, oldOrderedYes, orderedYes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOrderenedNo() {
		return orderenedNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderenedNo(Boolean newOrderenedNo) {
		Boolean oldOrderenedNo = orderenedNo;
		orderenedNo = newOrderenedNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__ORDERENED_NO, oldOrderenedNo, orderenedNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransientYes() {
		return transientYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransientYes(double newTransientYes) {
		double oldTransientYes = transientYes;
		transientYes = newTransientYes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__TRANSIENT_YES, oldTransientYes, transientYes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTransientNo() {
		return transientNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransientNo(long newTransientNo) {
		long oldTransientNo = transientNo;
		transientNo = newTransientNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__TRANSIENT_NO, oldTransientNo, transientNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializableEnumTest getUniqueYes() {
		return uniqueYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueYes(SerializableEnumTest newUniqueYes) {
		SerializableEnumTest oldUniqueYes = uniqueYes;
		uniqueYes = newUniqueYes == null ? UNIQUE_YES_EDEFAULT : newUniqueYes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__UNIQUE_YES, oldUniqueYes, uniqueYes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueNo() {
		return uniqueNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueNo(String newUniqueNo) {
		String oldUniqueNo = uniqueNo;
		uniqueNo = newUniqueNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__UNIQUE_NO, oldUniqueNo, uniqueNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnsettableYes() {
		return unsettableYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsettableYes(String newUnsettableYes) {
		String oldUnsettableYes = unsettableYes;
		unsettableYes = newUnsettableYes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__UNSETTABLE_YES, oldUnsettableYes, unsettableYes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializableEnumTest getUnsettableNo() {
		return unsettableNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsettableNo(SerializableEnumTest newUnsettableNo) {
		SerializableEnumTest oldUnsettableNo = unsettableNo;
		unsettableNo = newUnsettableNo == null ? UNSETTABLE_NO_EDEFAULT : newUnsettableNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__UNSETTABLE_NO, oldUnsettableNo, unsettableNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolatileYes() {
		return volatileYes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatileYes(String newVolatileYes) {
		String oldVolatileYes = volatileYes;
		volatileYes = newVolatileYes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__VOLATILE_YES, oldVolatileYes, volatileYes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnserializableEnumTest getVolatileNo() {
		return volatileNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatileNo(UnserializableEnumTest newVolatileNo) {
		UnserializableEnumTest oldVolatileNo = volatileNo;
		volatileNo = newVolatileNo == null ? VOLATILE_NO_EDEFAULT : newVolatileNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__VOLATILE_NO, oldVolatileNo, volatileNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesTest getOpposite2() {
		if (opposite2 != null && opposite2.eIsProxy()) {
			InternalEObject oldOpposite2 = (InternalEObject)opposite2;
			opposite2 = (ReferencesTest)eResolveProxy(oldOpposite2);
			if (opposite2 != oldOpposite2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExhaustivePackage.ATTRIBUTES_TEST__OPPOSITE2, oldOpposite2, opposite2));
			}
		}
		return opposite2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesTest basicGetOpposite2() {
		return opposite2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpposite2(ReferencesTest newOpposite2, NotificationChain msgs) {
		ReferencesTest oldOpposite2 = opposite2;
		opposite2 = newOpposite2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__OPPOSITE2, oldOpposite2, newOpposite2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite2(ReferencesTest newOpposite2) {
		if (newOpposite2 != opposite2) {
			NotificationChain msgs = null;
			if (opposite2 != null)
				msgs = ((InternalEObject)opposite2).eInverseRemove(this, ExhaustivePackage.REFERENCES_TEST__OPPOSITE1, ReferencesTest.class, msgs);
			if (newOpposite2 != null)
				msgs = ((InternalEObject)newOpposite2).eInverseAdd(this, ExhaustivePackage.REFERENCES_TEST__OPPOSITE1, ReferencesTest.class, msgs);
			msgs = basicSetOpposite2(newOpposite2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.ATTRIBUTES_TEST__OPPOSITE2, newOpposite2, newOpposite2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExhaustivePackage.ATTRIBUTES_TEST__OPPOSITE2:
				if (opposite2 != null)
					msgs = ((InternalEObject)opposite2).eInverseRemove(this, ExhaustivePackage.REFERENCES_TEST__OPPOSITE1, ReferencesTest.class, msgs);
				return basicSetOpposite2((ReferencesTest)otherEnd, msgs);
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
			case ExhaustivePackage.ATTRIBUTES_TEST__OPPOSITE2:
				return basicSetOpposite2(null, msgs);
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
			case ExhaustivePackage.ATTRIBUTES_TEST__CHANGEABLE_YES:
				return getChangeableYes();
			case ExhaustivePackage.ATTRIBUTES_TEST__CHANGEABLE_NO:
				return getChangeableNo();
			case ExhaustivePackage.ATTRIBUTES_TEST__DEFAULT_VALUE:
				return getDefaultValue();
			case ExhaustivePackage.ATTRIBUTES_TEST__DERIVED_YES:
				return getDerivedYes();
			case ExhaustivePackage.ATTRIBUTES_TEST__DERIVED_NO:
				return getDerivedNo();
			case ExhaustivePackage.ATTRIBUTES_TEST__ID_YES:
				return getIdYes();
			case ExhaustivePackage.ATTRIBUTES_TEST__ID_NO:
				return getIdNo();
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND0:
				return getLowerBound0();
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND1:
				return getLowerBound1();
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND2:
				return getLowerBound2();
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND_N:
				return getLowerBoundN();
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND0:
				return getUpperBound0();
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND1:
				return getUpperBound1();
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND2:
				return getUpperBound2();
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND_N:
				return getUpperBoundN();
			case ExhaustivePackage.ATTRIBUTES_TEST__ORDERED_YES:
				return getOrderedYes();
			case ExhaustivePackage.ATTRIBUTES_TEST__ORDERENED_NO:
				return getOrderenedNo();
			case ExhaustivePackage.ATTRIBUTES_TEST__TRANSIENT_YES:
				return getTransientYes();
			case ExhaustivePackage.ATTRIBUTES_TEST__TRANSIENT_NO:
				return getTransientNo();
			case ExhaustivePackage.ATTRIBUTES_TEST__UNIQUE_YES:
				return getUniqueYes();
			case ExhaustivePackage.ATTRIBUTES_TEST__UNIQUE_NO:
				return getUniqueNo();
			case ExhaustivePackage.ATTRIBUTES_TEST__UNSETTABLE_YES:
				return getUnsettableYes();
			case ExhaustivePackage.ATTRIBUTES_TEST__UNSETTABLE_NO:
				return getUnsettableNo();
			case ExhaustivePackage.ATTRIBUTES_TEST__VOLATILE_YES:
				return getVolatileYes();
			case ExhaustivePackage.ATTRIBUTES_TEST__VOLATILE_NO:
				return getVolatileNo();
			case ExhaustivePackage.ATTRIBUTES_TEST__OPPOSITE2:
				if (resolve) return getOpposite2();
				return basicGetOpposite2();
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
			case ExhaustivePackage.ATTRIBUTES_TEST__CHANGEABLE_YES:
				setChangeableYes((Double)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__CHANGEABLE_NO:
				setChangeableNo((SerializableEnumTest)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__DERIVED_YES:
				setDerivedYes((String)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__DERIVED_NO:
				setDerivedNo((UnserializableEnumTest)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__ID_YES:
				setIdYes((Short)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__ID_NO:
				setIdNo((Short)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND0:
				setLowerBound0((Integer)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND1:
				setLowerBound1((Integer)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND2:
				getLowerBound2().clear();
				getLowerBound2().addAll((Collection<? extends Short>)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND_N:
				setLowerBoundN((SerializableEnumTest)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND0:
				setUpperBound0((String)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND1:
				setUpperBound1((Date)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND2:
				getUpperBound2().clear();
				getUpperBound2().addAll((Collection<? extends String>)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND_N:
				getUpperBoundN().clear();
				getUpperBoundN().addAll((Collection<? extends Long>)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__ORDERED_YES:
				setOrderedYes((Integer)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__ORDERENED_NO:
				setOrderenedNo((Boolean)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__TRANSIENT_YES:
				setTransientYes((Double)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__TRANSIENT_NO:
				setTransientNo((Long)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UNIQUE_YES:
				setUniqueYes((SerializableEnumTest)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UNIQUE_NO:
				setUniqueNo((String)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UNSETTABLE_YES:
				setUnsettableYes((String)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UNSETTABLE_NO:
				setUnsettableNo((SerializableEnumTest)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__VOLATILE_YES:
				setVolatileYes((String)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__VOLATILE_NO:
				setVolatileNo((UnserializableEnumTest)newValue);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__OPPOSITE2:
				setOpposite2((ReferencesTest)newValue);
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
			case ExhaustivePackage.ATTRIBUTES_TEST__CHANGEABLE_YES:
				setChangeableYes(CHANGEABLE_YES_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__CHANGEABLE_NO:
				setChangeableNo(CHANGEABLE_NO_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__DERIVED_YES:
				setDerivedYes(DERIVED_YES_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__DERIVED_NO:
				setDerivedNo(DERIVED_NO_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__ID_YES:
				setIdYes(ID_YES_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__ID_NO:
				setIdNo(ID_NO_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND0:
				setLowerBound0(LOWER_BOUND0_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND1:
				setLowerBound1(LOWER_BOUND1_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND2:
				getLowerBound2().clear();
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND_N:
				setLowerBoundN(LOWER_BOUND_N_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND0:
				setUpperBound0(UPPER_BOUND0_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND1:
				setUpperBound1(UPPER_BOUND1_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND2:
				getUpperBound2().clear();
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND_N:
				getUpperBoundN().clear();
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__ORDERED_YES:
				setOrderedYes(ORDERED_YES_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__ORDERENED_NO:
				setOrderenedNo(ORDERENED_NO_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__TRANSIENT_YES:
				setTransientYes(TRANSIENT_YES_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__TRANSIENT_NO:
				setTransientNo(TRANSIENT_NO_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UNIQUE_YES:
				setUniqueYes(UNIQUE_YES_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UNIQUE_NO:
				setUniqueNo(UNIQUE_NO_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UNSETTABLE_YES:
				setUnsettableYes(UNSETTABLE_YES_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__UNSETTABLE_NO:
				setUnsettableNo(UNSETTABLE_NO_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__VOLATILE_YES:
				setVolatileYes(VOLATILE_YES_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__VOLATILE_NO:
				setVolatileNo(VOLATILE_NO_EDEFAULT);
				return;
			case ExhaustivePackage.ATTRIBUTES_TEST__OPPOSITE2:
				setOpposite2((ReferencesTest)null);
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
			case ExhaustivePackage.ATTRIBUTES_TEST__CHANGEABLE_YES:
				return changeableYes != CHANGEABLE_YES_EDEFAULT;
			case ExhaustivePackage.ATTRIBUTES_TEST__CHANGEABLE_NO:
				return changeableNo != CHANGEABLE_NO_EDEFAULT;
			case ExhaustivePackage.ATTRIBUTES_TEST__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case ExhaustivePackage.ATTRIBUTES_TEST__DERIVED_YES:
				return DERIVED_YES_EDEFAULT == null ? derivedYes != null : !DERIVED_YES_EDEFAULT.equals(derivedYes);
			case ExhaustivePackage.ATTRIBUTES_TEST__DERIVED_NO:
				return derivedNo != DERIVED_NO_EDEFAULT;
			case ExhaustivePackage.ATTRIBUTES_TEST__ID_YES:
				return idYes != ID_YES_EDEFAULT;
			case ExhaustivePackage.ATTRIBUTES_TEST__ID_NO:
				return idNo != ID_NO_EDEFAULT;
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND0:
				return lowerBound0 != LOWER_BOUND0_EDEFAULT;
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND1:
				return LOWER_BOUND1_EDEFAULT == null ? lowerBound1 != null : !LOWER_BOUND1_EDEFAULT.equals(lowerBound1);
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND2:
				return lowerBound2 != null && !lowerBound2.isEmpty();
			case ExhaustivePackage.ATTRIBUTES_TEST__LOWER_BOUND_N:
				return lowerBoundN != LOWER_BOUND_N_EDEFAULT;
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND0:
				return UPPER_BOUND0_EDEFAULT == null ? upperBound0 != null : !UPPER_BOUND0_EDEFAULT.equals(upperBound0);
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND1:
				return UPPER_BOUND1_EDEFAULT == null ? upperBound1 != null : !UPPER_BOUND1_EDEFAULT.equals(upperBound1);
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND2:
				return upperBound2 != null && !upperBound2.isEmpty();
			case ExhaustivePackage.ATTRIBUTES_TEST__UPPER_BOUND_N:
				return upperBoundN != null && !upperBoundN.isEmpty();
			case ExhaustivePackage.ATTRIBUTES_TEST__ORDERED_YES:
				return ORDERED_YES_EDEFAULT == null ? orderedYes != null : !ORDERED_YES_EDEFAULT.equals(orderedYes);
			case ExhaustivePackage.ATTRIBUTES_TEST__ORDERENED_NO:
				return ORDERENED_NO_EDEFAULT == null ? orderenedNo != null : !ORDERENED_NO_EDEFAULT.equals(orderenedNo);
			case ExhaustivePackage.ATTRIBUTES_TEST__TRANSIENT_YES:
				return transientYes != TRANSIENT_YES_EDEFAULT;
			case ExhaustivePackage.ATTRIBUTES_TEST__TRANSIENT_NO:
				return transientNo != TRANSIENT_NO_EDEFAULT;
			case ExhaustivePackage.ATTRIBUTES_TEST__UNIQUE_YES:
				return uniqueYes != UNIQUE_YES_EDEFAULT;
			case ExhaustivePackage.ATTRIBUTES_TEST__UNIQUE_NO:
				return UNIQUE_NO_EDEFAULT == null ? uniqueNo != null : !UNIQUE_NO_EDEFAULT.equals(uniqueNo);
			case ExhaustivePackage.ATTRIBUTES_TEST__UNSETTABLE_YES:
				return UNSETTABLE_YES_EDEFAULT == null ? unsettableYes != null : !UNSETTABLE_YES_EDEFAULT.equals(unsettableYes);
			case ExhaustivePackage.ATTRIBUTES_TEST__UNSETTABLE_NO:
				return unsettableNo != UNSETTABLE_NO_EDEFAULT;
			case ExhaustivePackage.ATTRIBUTES_TEST__VOLATILE_YES:
				return VOLATILE_YES_EDEFAULT == null ? volatileYes != null : !VOLATILE_YES_EDEFAULT.equals(volatileYes);
			case ExhaustivePackage.ATTRIBUTES_TEST__VOLATILE_NO:
				return volatileNo != VOLATILE_NO_EDEFAULT;
			case ExhaustivePackage.ATTRIBUTES_TEST__OPPOSITE2:
				return opposite2 != null;
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
		result.append(" (changeableYes: ");
		result.append(changeableYes);
		result.append(", changeableNo: ");
		result.append(changeableNo);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", derivedYes: ");
		result.append(derivedYes);
		result.append(", derivedNo: ");
		result.append(derivedNo);
		result.append(", idYes: ");
		result.append(idYes);
		result.append(", idNo: ");
		result.append(idNo);
		result.append(", lowerBound0: ");
		result.append(lowerBound0);
		result.append(", lowerBound1: ");
		result.append(lowerBound1);
		result.append(", lowerBound2: ");
		result.append(lowerBound2);
		result.append(", lowerBoundN: ");
		result.append(lowerBoundN);
		result.append(", upperBound0: ");
		result.append(upperBound0);
		result.append(", upperBound1: ");
		result.append(upperBound1);
		result.append(", upperBound2: ");
		result.append(upperBound2);
		result.append(", upperBoundN: ");
		result.append(upperBoundN);
		result.append(", orderedYes: ");
		result.append(orderedYes);
		result.append(", orderenedNo: ");
		result.append(orderenedNo);
		result.append(", transientYes: ");
		result.append(transientYes);
		result.append(", transientNo: ");
		result.append(transientNo);
		result.append(", uniqueYes: ");
		result.append(uniqueYes);
		result.append(", uniqueNo: ");
		result.append(uniqueNo);
		result.append(", unsettableYes: ");
		result.append(unsettableYes);
		result.append(", unsettableNo: ");
		result.append(unsettableNo);
		result.append(", volatileYes: ");
		result.append(volatileYes);
		result.append(", volatileNo: ");
		result.append(volatileNo);
		result.append(')');
		return result.toString();
	}

} //AttributesTestImpl
