/**
 */
package extended.toppkg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extended.toppkg.ClassA#getToClassA <em>To Class A</em>}</li>
 * </ul>
 *
 * @see extended.toppkg.ToppkgPackage#getClassA()
 * @model
 * @generated
 */
public interface ClassA extends EObject {
	/**
	 * Returns the value of the '<em><b>To Class A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Class A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Class A</em>' reference.
	 * @see #setToClassA(extended.toppkg.subpkg2.subpkg3.ClassA)
	 * @see extended.toppkg.ToppkgPackage#getClassA_ToClassA()
	 * @model
	 * @generated
	 */
	extended.toppkg.subpkg2.subpkg3.ClassA getToClassA();

	/**
	 * Sets the value of the '{@link extended.toppkg.ClassA#getToClassA <em>To Class A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Class A</em>' reference.
	 * @see #getToClassA()
	 * @generated
	 */
	void setToClassA(extended.toppkg.subpkg2.subpkg3.ClassA value);

} // ClassA
