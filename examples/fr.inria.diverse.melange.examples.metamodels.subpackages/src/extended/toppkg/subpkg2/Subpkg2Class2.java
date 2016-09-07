/**
 */
package extended.toppkg.subpkg2;

import extended.toppkg.subpkg2.subpkg3.Subpkg3Class1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extended.toppkg.subpkg2.Subpkg2Class2#getMySubpkg3Class1 <em>My Subpkg3 Class1</em>}</li>
 * </ul>
 *
 * @see extended.toppkg.subpkg2.Subpkg2Package#getSubpkg2Class2()
 * @model
 * @generated
 */
public interface Subpkg2Class2 extends EObject {
	/**
	 * Returns the value of the '<em><b>My Subpkg3 Class1</b></em>' containment reference list.
	 * The list contents are of type {@link extended.toppkg.subpkg2.subpkg3.Subpkg3Class1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Subpkg3 Class1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Subpkg3 Class1</em>' containment reference list.
	 * @see extended.toppkg.subpkg2.Subpkg2Package#getSubpkg2Class2_MySubpkg3Class1()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subpkg3Class1> getMySubpkg3Class1();

} // Subpkg2Class2
