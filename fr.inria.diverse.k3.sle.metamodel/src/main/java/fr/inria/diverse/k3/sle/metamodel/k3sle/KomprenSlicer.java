/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle;

import kompren.Slicer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kompren Slicer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.KomprenSlicer#getSlicer <em>Slicer</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getKomprenSlicer()
 * @model
 * @generated
 */
public interface KomprenSlicer extends Transformation {
	/**
	 * Returns the value of the '<em><b>Slicer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slicer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slicer</em>' containment reference.
	 * @see #setSlicer(Slicer)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getKomprenSlicer_Slicer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Slicer getSlicer();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.KomprenSlicer#getSlicer <em>Slicer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slicer</em>' containment reference.
	 * @see #getSlicer()
	 * @generated
	 */
	void setSlicer(Slicer value);

} // KomprenSlicer
