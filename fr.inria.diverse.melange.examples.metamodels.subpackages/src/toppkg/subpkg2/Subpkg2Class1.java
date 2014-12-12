/**
 */
package toppkg.subpkg2;

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
 *   <li>{@link toppkg.subpkg2.Subpkg2Class1#getMySubpkg2Class2 <em>My Subpkg2 Class2</em>}</li>
 * </ul>
 * </p>
 *
 * @see toppkg.subpkg2.Subpkg2Package#getSubpkg2Class1()
 * @model
 * @generated
 */
public interface Subpkg2Class1 extends EObject {
	/**
	 * Returns the value of the '<em><b>My Subpkg2 Class2</b></em>' containment reference list.
	 * The list contents are of type {@link toppkg.subpkg2.Subpkg2Class2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Subpkg2 Class2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Subpkg2 Class2</em>' containment reference list.
	 * @see toppkg.subpkg2.Subpkg2Package#getSubpkg2Class1_MySubpkg2Class2()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subpkg2Class2> getMySubpkg2Class2();

} // Subpkg2Class1
