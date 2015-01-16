/**
 */
package exhaustive;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributes Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link exhaustive.AttributesTest#getChangeableYes <em>Changeable Yes</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getChangeableNo <em>Changeable No</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getDerivedYes <em>Derived Yes</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getDerivedNo <em>Derived No</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getIdYes <em>Id Yes</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getIdNo <em>Id No</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getLowerBound0 <em>Lower Bound0</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getLowerBound1 <em>Lower Bound1</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getLowerBound2 <em>Lower Bound2</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getLowerBoundN <em>Lower Bound N</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getUpperBound0 <em>Upper Bound0</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getUpperBound1 <em>Upper Bound1</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getUpperBound2 <em>Upper Bound2</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getUpperBoundN <em>Upper Bound N</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getOrderedYes <em>Ordered Yes</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getOrderenedNo <em>Orderened No</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getTransientYes <em>Transient Yes</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getTransientNo <em>Transient No</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getUniqueYes <em>Unique Yes</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getUniqueNo <em>Unique No</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getUnsettableYes <em>Unsettable Yes</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getUnsettableNo <em>Unsettable No</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getVolatileYes <em>Volatile Yes</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getVolatileNo <em>Volatile No</em>}</li>
 *   <li>{@link exhaustive.AttributesTest#getOpposite2 <em>Opposite2</em>}</li>
 * </ul>
 * </p>
 *
 * @see exhaustive.ExhaustivePackage#getAttributesTest()
 * @model
 * @generated
 */
public interface AttributesTest extends MultipleSuperTest, InterfaceTest {
	/**
	 * Returns the value of the '<em><b>Changeable Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable Yes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable Yes</em>' attribute.
	 * @see #setChangeableYes(double)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_ChangeableYes()
	 * @model
	 * @generated
	 */
	double getChangeableYes();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getChangeableYes <em>Changeable Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable Yes</em>' attribute.
	 * @see #getChangeableYes()
	 * @generated
	 */
	void setChangeableYes(double value);

	/**
	 * Returns the value of the '<em><b>Changeable No</b></em>' attribute.
	 * The literals are from the enumeration {@link exhaustive.SerializableEnumTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable No</em>' attribute.
	 * @see exhaustive.SerializableEnumTest
	 * @see #setChangeableNo(SerializableEnumTest)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_ChangeableNo()
	 * @model
	 * @generated
	 */
	SerializableEnumTest getChangeableNo();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getChangeableNo <em>Changeable No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable No</em>' attribute.
	 * @see exhaustive.SerializableEnumTest
	 * @see #getChangeableNo()
	 * @generated
	 */
	void setChangeableNo(SerializableEnumTest value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_DefaultValue()
	 * @model dataType="exhaustive.SerializableDatatypeTest"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Derived Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Yes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Yes</em>' attribute.
	 * @see #setDerivedYes(String)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_DerivedYes()
	 * @model dataType="exhaustive.SerializableDatatypeTest"
	 * @generated
	 */
	String getDerivedYes();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getDerivedYes <em>Derived Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Yes</em>' attribute.
	 * @see #getDerivedYes()
	 * @generated
	 */
	void setDerivedYes(String value);

	/**
	 * Returns the value of the '<em><b>Derived No</b></em>' attribute.
	 * The default value is <code>"literal1"</code>.
	 * The literals are from the enumeration {@link exhaustive.UnserializableEnumTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived No</em>' attribute.
	 * @see exhaustive.UnserializableEnumTest
	 * @see #setDerivedNo(UnserializableEnumTest)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_DerivedNo()
	 * @model default="literal1"
	 * @generated
	 */
	UnserializableEnumTest getDerivedNo();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getDerivedNo <em>Derived No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived No</em>' attribute.
	 * @see exhaustive.UnserializableEnumTest
	 * @see #getDerivedNo()
	 * @generated
	 */
	void setDerivedNo(UnserializableEnumTest value);

	/**
	 * Returns the value of the '<em><b>Id Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Yes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Yes</em>' attribute.
	 * @see #setIdYes(short)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_IdYes()
	 * @model
	 * @generated
	 */
	short getIdYes();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getIdYes <em>Id Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Yes</em>' attribute.
	 * @see #getIdYes()
	 * @generated
	 */
	void setIdYes(short value);

	/**
	 * Returns the value of the '<em><b>Id No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id No</em>' attribute.
	 * @see #setIdNo(short)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_IdNo()
	 * @model
	 * @generated
	 */
	short getIdNo();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getIdNo <em>Id No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id No</em>' attribute.
	 * @see #getIdNo()
	 * @generated
	 */
	void setIdNo(short value);

	/**
	 * Returns the value of the '<em><b>Lower Bound0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound0</em>' attribute.
	 * @see #setLowerBound0(int)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_LowerBound0()
	 * @model
	 * @generated
	 */
	int getLowerBound0();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getLowerBound0 <em>Lower Bound0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound0</em>' attribute.
	 * @see #getLowerBound0()
	 * @generated
	 */
	void setLowerBound0(int value);

	/**
	 * Returns the value of the '<em><b>Lower Bound1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound1</em>' attribute.
	 * @see #setLowerBound1(Integer)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_LowerBound1()
	 * @model required="true"
	 * @generated
	 */
	Integer getLowerBound1();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getLowerBound1 <em>Lower Bound1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound1</em>' attribute.
	 * @see #getLowerBound1()
	 * @generated
	 */
	void setLowerBound1(Integer value);

	/**
	 * Returns the value of the '<em><b>Lower Bound2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Short}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound2</em>' attribute list.
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_LowerBound2()
	 * @model lower="2"
	 * @generated
	 */
	EList<Short> getLowerBound2();

	/**
	 * Returns the value of the '<em><b>Lower Bound N</b></em>' attribute.
	 * The literals are from the enumeration {@link exhaustive.SerializableEnumTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound N</em>' attribute.
	 * @see exhaustive.SerializableEnumTest
	 * @see #setLowerBoundN(SerializableEnumTest)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_LowerBoundN()
	 * @model
	 * @generated
	 */
	SerializableEnumTest getLowerBoundN();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getLowerBoundN <em>Lower Bound N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound N</em>' attribute.
	 * @see exhaustive.SerializableEnumTest
	 * @see #getLowerBoundN()
	 * @generated
	 */
	void setLowerBoundN(SerializableEnumTest value);

	/**
	 * Returns the value of the '<em><b>Upper Bound0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound0</em>' attribute.
	 * @see #setUpperBound0(String)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_UpperBound0()
	 * @model dataType="exhaustive.SerializableDatatypeTest"
	 * @generated
	 */
	String getUpperBound0();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getUpperBound0 <em>Upper Bound0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound0</em>' attribute.
	 * @see #getUpperBound0()
	 * @generated
	 */
	void setUpperBound0(String value);

	/**
	 * Returns the value of the '<em><b>Upper Bound1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound1</em>' attribute.
	 * @see #setUpperBound1(Date)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_UpperBound1()
	 * @model
	 * @generated
	 */
	Date getUpperBound1();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getUpperBound1 <em>Upper Bound1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound1</em>' attribute.
	 * @see #getUpperBound1()
	 * @generated
	 */
	void setUpperBound1(Date value);

	/**
	 * Returns the value of the '<em><b>Upper Bound2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound2</em>' attribute list.
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_UpperBound2()
	 * @model upper="2"
	 * @generated
	 */
	EList<String> getUpperBound2();

	/**
	 * Returns the value of the '<em><b>Upper Bound N</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound N</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound N</em>' attribute list.
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_UpperBoundN()
	 * @model
	 * @generated
	 */
	EList<Long> getUpperBoundN();

	/**
	 * Returns the value of the '<em><b>Ordered Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered Yes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered Yes</em>' attribute.
	 * @see #setOrderedYes(Integer)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_OrderedYes()
	 * @model
	 * @generated
	 */
	Integer getOrderedYes();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getOrderedYes <em>Ordered Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered Yes</em>' attribute.
	 * @see #getOrderedYes()
	 * @generated
	 */
	void setOrderedYes(Integer value);

	/**
	 * Returns the value of the '<em><b>Orderened No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orderened No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderened No</em>' attribute.
	 * @see #setOrderenedNo(Boolean)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_OrderenedNo()
	 * @model
	 * @generated
	 */
	Boolean getOrderenedNo();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getOrderenedNo <em>Orderened No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderened No</em>' attribute.
	 * @see #getOrderenedNo()
	 * @generated
	 */
	void setOrderenedNo(Boolean value);

	/**
	 * Returns the value of the '<em><b>Transient Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Yes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Yes</em>' attribute.
	 * @see #setTransientYes(double)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_TransientYes()
	 * @model
	 * @generated
	 */
	double getTransientYes();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getTransientYes <em>Transient Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Yes</em>' attribute.
	 * @see #getTransientYes()
	 * @generated
	 */
	void setTransientYes(double value);

	/**
	 * Returns the value of the '<em><b>Transient No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient No</em>' attribute.
	 * @see #setTransientNo(long)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_TransientNo()
	 * @model
	 * @generated
	 */
	long getTransientNo();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getTransientNo <em>Transient No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient No</em>' attribute.
	 * @see #getTransientNo()
	 * @generated
	 */
	void setTransientNo(long value);

	/**
	 * Returns the value of the '<em><b>Unique Yes</b></em>' attribute.
	 * The literals are from the enumeration {@link exhaustive.SerializableEnumTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Yes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Yes</em>' attribute.
	 * @see exhaustive.SerializableEnumTest
	 * @see #setUniqueYes(SerializableEnumTest)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_UniqueYes()
	 * @model
	 * @generated
	 */
	SerializableEnumTest getUniqueYes();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getUniqueYes <em>Unique Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Yes</em>' attribute.
	 * @see exhaustive.SerializableEnumTest
	 * @see #getUniqueYes()
	 * @generated
	 */
	void setUniqueYes(SerializableEnumTest value);

	/**
	 * Returns the value of the '<em><b>Unique No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique No</em>' attribute.
	 * @see #setUniqueNo(String)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_UniqueNo()
	 * @model dataType="exhaustive.SerializableDatatypeTest"
	 * @generated
	 */
	String getUniqueNo();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getUniqueNo <em>Unique No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique No</em>' attribute.
	 * @see #getUniqueNo()
	 * @generated
	 */
	void setUniqueNo(String value);

	/**
	 * Returns the value of the '<em><b>Unsettable Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsettable Yes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsettable Yes</em>' attribute.
	 * @see #setUnsettableYes(String)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_UnsettableYes()
	 * @model dataType="exhaustive.SerializableDatatypeTest"
	 * @generated
	 */
	String getUnsettableYes();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getUnsettableYes <em>Unsettable Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsettable Yes</em>' attribute.
	 * @see #getUnsettableYes()
	 * @generated
	 */
	void setUnsettableYes(String value);

	/**
	 * Returns the value of the '<em><b>Unsettable No</b></em>' attribute.
	 * The literals are from the enumeration {@link exhaustive.SerializableEnumTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsettable No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsettable No</em>' attribute.
	 * @see exhaustive.SerializableEnumTest
	 * @see #setUnsettableNo(SerializableEnumTest)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_UnsettableNo()
	 * @model
	 * @generated
	 */
	SerializableEnumTest getUnsettableNo();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getUnsettableNo <em>Unsettable No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsettable No</em>' attribute.
	 * @see exhaustive.SerializableEnumTest
	 * @see #getUnsettableNo()
	 * @generated
	 */
	void setUnsettableNo(SerializableEnumTest value);

	/**
	 * Returns the value of the '<em><b>Volatile Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile Yes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile Yes</em>' attribute.
	 * @see #setVolatileYes(String)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_VolatileYes()
	 * @model dataType="exhaustive.SerializableDatatypeTest"
	 * @generated
	 */
	String getVolatileYes();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getVolatileYes <em>Volatile Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile Yes</em>' attribute.
	 * @see #getVolatileYes()
	 * @generated
	 */
	void setVolatileYes(String value);

	/**
	 * Returns the value of the '<em><b>Volatile No</b></em>' attribute.
	 * The literals are from the enumeration {@link exhaustive.UnserializableEnumTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile No</em>' attribute.
	 * @see exhaustive.UnserializableEnumTest
	 * @see #setVolatileNo(UnserializableEnumTest)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_VolatileNo()
	 * @model
	 * @generated
	 */
	UnserializableEnumTest getVolatileNo();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getVolatileNo <em>Volatile No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile No</em>' attribute.
	 * @see exhaustive.UnserializableEnumTest
	 * @see #getVolatileNo()
	 * @generated
	 */
	void setVolatileNo(UnserializableEnumTest value);

	/**
	 * Returns the value of the '<em><b>Opposite2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link exhaustive.ReferencesTest#getOpposite1 <em>Opposite1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite2</em>' reference.
	 * @see #setOpposite2(ReferencesTest)
	 * @see exhaustive.ExhaustivePackage#getAttributesTest_Opposite2()
	 * @see exhaustive.ReferencesTest#getOpposite1
	 * @model opposite="opposite1"
	 * @generated
	 */
	ReferencesTest getOpposite2();

	/**
	 * Sets the value of the '{@link exhaustive.AttributesTest#getOpposite2 <em>Opposite2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite2</em>' reference.
	 * @see #getOpposite2()
	 * @generated
	 */
	void setOpposite2(ReferencesTest value);

} // AttributesTest
