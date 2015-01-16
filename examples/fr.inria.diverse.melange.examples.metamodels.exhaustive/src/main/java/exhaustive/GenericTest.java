/**
 */
package exhaustive;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link exhaustive.GenericTest#getGenericAttr <em>Generic Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @see exhaustive.ExhaustivePackage#getGenericTest()
 * @model
 * @generated
 */
public interface GenericTest<A, B> extends EObject {
	/**
	 * Returns the value of the '<em><b>Generic Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Attr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Attr</em>' attribute.
	 * @see #setGenericAttr(Object)
	 * @see exhaustive.ExhaustivePackage#getGenericTest_GenericAttr()
	 * @model
	 * @generated
	 */
	A getGenericAttr();

	/**
	 * Sets the value of the '{@link exhaustive.GenericTest#getGenericAttr <em>Generic Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Attr</em>' attribute.
	 * @see #getGenericAttr()
	 * @generated
	 */
	void setGenericAttr(A value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	B genericOperationReturn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<C extends AbstractTest> void genericOperationParameters(C foo, GenericTest<A, C> bar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="exhaustive.CustomExceptionTest"
	 * @generated
	 */
	void genericOperationThrow() throws Exception;

} // GenericTest
