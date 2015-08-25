/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.xtext.common.types.JvmTypeReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Weave#getAspectTypeRef <em>Aspect Type Ref</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Weave#getAspectWildcardImport <em>Aspect Wildcard Import</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getWeave()
 * @model
 * @generated
 */
public interface Weave extends Operator {
	/**
	 * Returns the value of the '<em><b>Aspect Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect Type Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect Type Ref</em>' containment reference.
	 * @see #setAspectTypeRef(JvmTypeReference)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getWeave_AspectTypeRef()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getAspectTypeRef();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Weave#getAspectTypeRef <em>Aspect Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Type Ref</em>' containment reference.
	 * @see #getAspectTypeRef()
	 * @generated
	 */
	void setAspectTypeRef(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Aspect Wildcard Import</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect Wildcard Import</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect Wildcard Import</em>' attribute.
	 * @see #setAspectWildcardImport(String)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getWeave_AspectWildcardImport()
	 * @model
	 * @generated
	 */
	String getAspectWildcardImport();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Weave#getAspectWildcardImport <em>Aspect Wildcard Import</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Wildcard Import</em>' attribute.
	 * @see #getAspectWildcardImport()
	 * @generated
	 */
	void setAspectWildcardImport(String value);

} // Weave
