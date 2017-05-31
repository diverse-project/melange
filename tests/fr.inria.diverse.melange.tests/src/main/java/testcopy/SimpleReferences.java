/**
 */
package testcopy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testcopy.SimpleReferences#getSimpleRef <em>Simple Ref</em>}</li>
 *   <li>{@link testcopy.SimpleReferences#getContainmentRef <em>Containment Ref</em>}</li>
 * </ul>
 *
 * @see testcopy.TestcopyPackage#getSimpleReferences()
 * @model
 * @generated
 */
public interface SimpleReferences extends EObject {
	/**
	 * Returns the value of the '<em><b>Simple Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Ref</em>' reference.
	 * @see #setSimpleRef(Attributes)
	 * @see testcopy.TestcopyPackage#getSimpleReferences_SimpleRef()
	 * @model
	 * @generated
	 */
	Attributes getSimpleRef();

	/**
	 * Sets the value of the '{@link testcopy.SimpleReferences#getSimpleRef <em>Simple Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Ref</em>' reference.
	 * @see #getSimpleRef()
	 * @generated
	 */
	void setSimpleRef(Attributes value);

	/**
	 * Returns the value of the '<em><b>Containment Ref</b></em>' containment reference list.
	 * The list contents are of type {@link testcopy.Attributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Ref</em>' containment reference list.
	 * @see testcopy.TestcopyPackage#getSimpleReferences_ContainmentRef()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attributes> getContainmentRef();

} // SimpleReferences
