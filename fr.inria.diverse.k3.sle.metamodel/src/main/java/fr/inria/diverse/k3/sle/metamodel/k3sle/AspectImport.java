/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport#getAspectRef <em>Aspect Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getAspectImport()
 * @model
 * @generated
 */
public interface AspectImport extends EObject {
	/**
	 * Returns the value of the '<em><b>Aspect Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect Ref</em>' containment reference.
	 * @see #setAspectRef(JvmTypeReference)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getAspectImport_AspectRef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JvmTypeReference getAspectRef();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport#getAspectRef <em>Aspect Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Ref</em>' containment reference.
	 * @see #getAspectRef()
	 * @generated
	 */
	void setAspectRef(JvmTypeReference value);

} // AspectImport
