/**
 */
package exhaustive;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link exhaustive.ReferencesTest#getChangeableYes <em>Changeable Yes</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getChangeableNo <em>Changeable No</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getContainmentYes <em>Containment Yes</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getReferenceToGenerics <em>Reference To Generics</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getOpposite1 <em>Opposite1</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getOrderedFalse <em>Ordered False</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getResolveProxiesFalse <em>Resolve Proxies False</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getTransientTrue <em>Transient True</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getUniqueFalse <em>Unique False</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getUnsettableTrue <em>Unsettable True</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getVolatileTrue <em>Volatile True</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getDerivedYes <em>Derived Yes</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getUpperBoundN <em>Upper Bound N</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getUpperBound2 <em>Upper Bound2</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getLowerBound1 <em>Lower Bound1</em>}</li>
 *   <li>{@link exhaustive.ReferencesTest#getLowerBound2 <em>Lower Bound2</em>}</li>
 * </ul>
 * </p>
 *
 * @see exhaustive.ExhaustivePackage#getReferencesTest()
 * @model
 * @generated
 */
public interface ReferencesTest extends AbstractTest {
	/**
	 * Returns the value of the '<em><b>Changeable Yes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable Yes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable Yes</em>' reference.
	 * @see #setChangeableYes(AbstractTest)
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_ChangeableYes()
	 * @model
	 * @generated
	 */
	AbstractTest getChangeableYes();

	/**
	 * Sets the value of the '{@link exhaustive.ReferencesTest#getChangeableYes <em>Changeable Yes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable Yes</em>' reference.
	 * @see #getChangeableYes()
	 * @generated
	 */
	void setChangeableYes(AbstractTest value);

	/**
	 * Returns the value of the '<em><b>Changeable No</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable No</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable No</em>' reference.
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_ChangeableNo()
	 * @model changeable="false"
	 * @generated
	 */
	AbstractTest getChangeableNo();

	/**
	 * Returns the value of the '<em><b>Containment Yes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment Yes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Yes</em>' containment reference.
	 * @see #setContainmentYes(MultipleSuperTest)
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_ContainmentYes()
	 * @model containment="true"
	 * @generated
	 */
	MultipleSuperTest getContainmentYes();

	/**
	 * Sets the value of the '{@link exhaustive.ReferencesTest#getContainmentYes <em>Containment Yes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment Yes</em>' containment reference.
	 * @see #getContainmentYes()
	 * @generated
	 */
	void setContainmentYes(MultipleSuperTest value);

	/**
	 * Returns the value of the '<em><b>Reference To Generics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference To Generics</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference To Generics</em>' reference.
	 * @see #setReferenceToGenerics(GenericTest)
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_ReferenceToGenerics()
	 * @model
	 * @generated
	 */
	GenericTest<AbstractTest, OperationsTest> getReferenceToGenerics();

	/**
	 * Sets the value of the '{@link exhaustive.ReferencesTest#getReferenceToGenerics <em>Reference To Generics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference To Generics</em>' reference.
	 * @see #getReferenceToGenerics()
	 * @generated
	 */
	void setReferenceToGenerics(GenericTest<AbstractTest, OperationsTest> value);

	/**
	 * Returns the value of the '<em><b>Opposite1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link exhaustive.AttributesTest#getOpposite2 <em>Opposite2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite1</em>' reference.
	 * @see #setOpposite1(AttributesTest)
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_Opposite1()
	 * @see exhaustive.AttributesTest#getOpposite2
	 * @model opposite="opposite2"
	 * @generated
	 */
	AttributesTest getOpposite1();

	/**
	 * Sets the value of the '{@link exhaustive.ReferencesTest#getOpposite1 <em>Opposite1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite1</em>' reference.
	 * @see #getOpposite1()
	 * @generated
	 */
	void setOpposite1(AttributesTest value);

	/**
	 * Returns the value of the '<em><b>Ordered False</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered False</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered False</em>' reference.
	 * @see #setOrderedFalse(AttributesTest)
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_OrderedFalse()
	 * @model ordered="false"
	 * @generated
	 */
	AttributesTest getOrderedFalse();

	/**
	 * Sets the value of the '{@link exhaustive.ReferencesTest#getOrderedFalse <em>Ordered False</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered False</em>' reference.
	 * @see #getOrderedFalse()
	 * @generated
	 */
	void setOrderedFalse(AttributesTest value);

	/**
	 * Returns the value of the '<em><b>Resolve Proxies False</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Proxies False</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Proxies False</em>' reference.
	 * @see #setResolveProxiesFalse(AttributesTest)
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_ResolveProxiesFalse()
	 * @model resolveProxies="false"
	 * @generated
	 */
	AttributesTest getResolveProxiesFalse();

	/**
	 * Sets the value of the '{@link exhaustive.ReferencesTest#getResolveProxiesFalse <em>Resolve Proxies False</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve Proxies False</em>' reference.
	 * @see #getResolveProxiesFalse()
	 * @generated
	 */
	void setResolveProxiesFalse(AttributesTest value);

	/**
	 * Returns the value of the '<em><b>Transient True</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient True</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient True</em>' reference.
	 * @see #setTransientTrue(AttributesTest)
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_TransientTrue()
	 * @model transient="true"
	 * @generated
	 */
	AttributesTest getTransientTrue();

	/**
	 * Sets the value of the '{@link exhaustive.ReferencesTest#getTransientTrue <em>Transient True</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient True</em>' reference.
	 * @see #getTransientTrue()
	 * @generated
	 */
	void setTransientTrue(AttributesTest value);

	/**
	 * Returns the value of the '<em><b>Unique False</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique False</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique False</em>' reference.
	 * @see #setUniqueFalse(AttributesTest)
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_UniqueFalse()
	 * @model
	 * @generated
	 */
	AttributesTest getUniqueFalse();

	/**
	 * Sets the value of the '{@link exhaustive.ReferencesTest#getUniqueFalse <em>Unique False</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique False</em>' reference.
	 * @see #getUniqueFalse()
	 * @generated
	 */
	void setUniqueFalse(AttributesTest value);

	/**
	 * Returns the value of the '<em><b>Unsettable True</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsettable True</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsettable True</em>' reference.
	 * @see #isSetUnsettableTrue()
	 * @see #unsetUnsettableTrue()
	 * @see #setUnsettableTrue(AttributesTest)
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_UnsettableTrue()
	 * @model unsettable="true"
	 * @generated
	 */
	AttributesTest getUnsettableTrue();

	/**
	 * Sets the value of the '{@link exhaustive.ReferencesTest#getUnsettableTrue <em>Unsettable True</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsettable True</em>' reference.
	 * @see #isSetUnsettableTrue()
	 * @see #unsetUnsettableTrue()
	 * @see #getUnsettableTrue()
	 * @generated
	 */
	void setUnsettableTrue(AttributesTest value);

	/**
	 * Unsets the value of the '{@link exhaustive.ReferencesTest#getUnsettableTrue <em>Unsettable True</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnsettableTrue()
	 * @see #getUnsettableTrue()
	 * @see #setUnsettableTrue(AttributesTest)
	 * @generated
	 */
	void unsetUnsettableTrue();

	/**
	 * Returns whether the value of the '{@link exhaustive.ReferencesTest#getUnsettableTrue <em>Unsettable True</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unsettable True</em>' reference is set.
	 * @see #unsetUnsettableTrue()
	 * @see #getUnsettableTrue()
	 * @see #setUnsettableTrue(AttributesTest)
	 * @generated
	 */
	boolean isSetUnsettableTrue();

	/**
	 * Returns the value of the '<em><b>Volatile True</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile True</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile True</em>' reference.
	 * @see #setVolatileTrue(AttributesTest)
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_VolatileTrue()
	 * @model volatile="true"
	 * @generated
	 */
	AttributesTest getVolatileTrue();

	/**
	 * Sets the value of the '{@link exhaustive.ReferencesTest#getVolatileTrue <em>Volatile True</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile True</em>' reference.
	 * @see #getVolatileTrue()
	 * @generated
	 */
	void setVolatileTrue(AttributesTest value);

	/**
	 * Returns the value of the '<em><b>Derived Yes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Yes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Yes</em>' reference.
	 * @see #setDerivedYes(AttributesTest)
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_DerivedYes()
	 * @model derived="true"
	 * @generated
	 */
	AttributesTest getDerivedYes();

	/**
	 * Sets the value of the '{@link exhaustive.ReferencesTest#getDerivedYes <em>Derived Yes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Yes</em>' reference.
	 * @see #getDerivedYes()
	 * @generated
	 */
	void setDerivedYes(AttributesTest value);

	/**
	 * Returns the value of the '<em><b>Upper Bound N</b></em>' reference list.
	 * The list contents are of type {@link exhaustive.AttributesTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound N</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound N</em>' reference list.
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_UpperBoundN()
	 * @model
	 * @generated
	 */
	EList<AttributesTest> getUpperBoundN();

	/**
	 * Returns the value of the '<em><b>Upper Bound2</b></em>' reference list.
	 * The list contents are of type {@link exhaustive.AttributesTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound2</em>' reference list.
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_UpperBound2()
	 * @model upper="2"
	 * @generated
	 */
	EList<AttributesTest> getUpperBound2();

	/**
	 * Returns the value of the '<em><b>Lower Bound1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound1</em>' reference.
	 * @see #setLowerBound1(AttributesTest)
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_LowerBound1()
	 * @model required="true"
	 * @generated
	 */
	AttributesTest getLowerBound1();

	/**
	 * Sets the value of the '{@link exhaustive.ReferencesTest#getLowerBound1 <em>Lower Bound1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound1</em>' reference.
	 * @see #getLowerBound1()
	 * @generated
	 */
	void setLowerBound1(AttributesTest value);

	/**
	 * Returns the value of the '<em><b>Lower Bound2</b></em>' reference list.
	 * The list contents are of type {@link exhaustive.AttributesTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound2</em>' reference list.
	 * @see exhaustive.ExhaustivePackage#getReferencesTest_LowerBound2()
	 * @model lower="2"
	 * @generated
	 */
	EList<AttributesTest> getLowerBound2();

} // ReferencesTest
