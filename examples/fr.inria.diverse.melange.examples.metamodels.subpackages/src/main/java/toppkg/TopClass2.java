/**
 */
package toppkg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Class2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link toppkg.TopClass2#getMyTopClass1 <em>My Top Class1</em>}</li>
 * </ul>
 * </p>
 *
 * @see toppkg.ToppkgPackage#getTopClass2()
 * @model
 * @generated
 */
public interface TopClass2 extends EObject {
	/**
	 * Returns the value of the '<em><b>My Top Class1</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link toppkg.TopClass1#getMyTopClass2 <em>My Top Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Top Class1</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Top Class1</em>' container reference.
	 * @see #setMyTopClass1(TopClass1)
	 * @see toppkg.ToppkgPackage#getTopClass2_MyTopClass1()
	 * @see toppkg.TopClass1#getMyTopClass2
	 * @model opposite="myTopClass2" transient="false"
	 * @generated
	 */
	TopClass1 getMyTopClass1();

	/**
	 * Sets the value of the '{@link toppkg.TopClass2#getMyTopClass1 <em>My Top Class1</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Top Class1</em>' container reference.
	 * @see #getMyTopClass1()
	 * @generated
	 */
	void setMyTopClass1(TopClass1 value);

} // TopClass2
