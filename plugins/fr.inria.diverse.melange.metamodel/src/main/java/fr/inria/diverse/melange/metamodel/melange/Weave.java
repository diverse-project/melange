/**
 */
package fr.inria.diverse.melange.metamodel.melange;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Weave#getAspect <em>Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getWeave()
 * @model
 * @generated
 */
public interface Weave extends Operator {
	/**
	 * Returns the value of the '<em><b>Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect</em>' containment reference.
	 * @see #setAspect(Aspect)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getWeave_Aspect()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Aspect getAspect();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Weave#getAspect <em>Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect</em>' containment reference.
	 * @see #getAspect()
	 * @generated
	 */
	void setAspect(Aspect value);

} // Weave
