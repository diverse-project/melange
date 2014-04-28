/**
 */
package toppkg.subpkg2.subpkg3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link toppkg.subpkg2.subpkg3.Subpkg3Class1#getMySubpkg3Class2 <em>My Subpkg3 Class2</em>}</li>
 * </ul>
 * </p>
 *
 * @see toppkg.subpkg2.subpkg3.Subpkg3Package#getSubpkg3Class1()
 * @model
 * @generated
 */
public interface Subpkg3Class1 extends EObject {
	/**
	 * Returns the value of the '<em><b>My Subpkg3 Class2</b></em>' containment reference list.
	 * The list contents are of type {@link toppkg.subpkg2.subpkg3.Subpkg3Class2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Subpkg3 Class2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Subpkg3 Class2</em>' containment reference list.
	 * @see toppkg.subpkg2.subpkg3.Subpkg3Package#getSubpkg3Class1_MySubpkg3Class2()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subpkg3Class2> getMySubpkg3Class2();

} // Subpkg3Class1
