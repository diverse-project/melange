/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtyping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Subtyping#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Subtyping#getSuperType <em>Super Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getSubtyping()
 * @model
 * @generated
 */
public interface Subtyping extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getSubtypingRelations <em>Subtyping Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Type</em>' container reference.
	 * @see #setSubType(ModelType)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getSubtyping_SubType()
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelType#getSubtypingRelations
	 * @model opposite="subtypingRelations" required="true" transient="false"
	 * @generated
	 */
	ModelType getSubType();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Subtyping#getSubType <em>Sub Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' container reference.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(ModelType value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(ModelType)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getSubtyping_SuperType()
	 * @model required="true"
	 * @generated
	 */
	ModelType getSuperType();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Subtyping#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(ModelType value);

} // Subtyping
