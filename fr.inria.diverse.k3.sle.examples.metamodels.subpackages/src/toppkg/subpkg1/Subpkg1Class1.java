/**
 */
package toppkg.subpkg1;

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
 *   <li>{@link toppkg.subpkg1.Subpkg1Class1#getMySubpkg1Class2 <em>My Subpkg1 Class2</em>}</li>
 * </ul>
 * </p>
 *
 * @see toppkg.subpkg1.Subpkg1Package#getSubpkg1Class1()
 * @model
 * @generated
 */
public interface Subpkg1Class1 extends EObject {
	/**
	 * Returns the value of the '<em><b>My Subpkg1 Class2</b></em>' containment reference list.
	 * The list contents are of type {@link toppkg.subpkg1.Subpkg1Class2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Subpkg1 Class2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Subpkg1 Class2</em>' containment reference list.
	 * @see toppkg.subpkg1.Subpkg1Package#getSubpkg1Class1_MySubpkg1Class2()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subpkg1Class2> getMySubpkg1Class2();

} // Subpkg1Class1
