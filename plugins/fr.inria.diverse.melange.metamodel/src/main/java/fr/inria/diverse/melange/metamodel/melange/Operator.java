/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Operator#getOwningLanguage <em>Owning Language</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Language</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.melange.metamodel.melange.Language#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Language</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Language</em>' container reference.
	 * @see #setOwningLanguage(Language)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getOperator_OwningLanguage()
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getOperators
	 * @model opposite="operators" transient="false"
	 * @generated
	 */
	Language getOwningLanguage();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Operator#getOwningLanguage <em>Owning Language</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Language</em>' container reference.
	 * @see #getOwningLanguage()
	 * @generated
	 */
	void setOwningLanguage(Language value);

} // Operator
