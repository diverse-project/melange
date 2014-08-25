/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slicer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Slicer#getSlicer <em>Slicer</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getSlicer()
 * @model
 * @generated
 */
public interface Slicer extends Transformation {
	/**
	 * Returns the value of the '<em><b>Slicer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slicer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slicer</em>' containment reference.
	 * @see #setSlicer(kompren.Slicer)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getSlicer_Slicer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	kompren.Slicer getSlicer();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Slicer#getSlicer <em>Slicer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slicer</em>' containment reference.
	 * @see #getSlicer()
	 * @generated
	 */
	void setSlicer(kompren.Slicer value);

} // Slicer
