/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.PropertyBinding#getFrom <em>From</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.PropertyBinding#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getPropertyBinding()
 * @model
 * @generated
 */
public interface PropertyBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getPropertyBinding_From()
	 * @model
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.PropertyBinding#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getPropertyBinding_To()
	 * @model
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.PropertyBinding#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

} // PropertyBinding
