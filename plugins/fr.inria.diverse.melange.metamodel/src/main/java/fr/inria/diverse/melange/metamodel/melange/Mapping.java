/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getFrom <em>From</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends Element {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.ClassBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMapping_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassBinding> getRules();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Metamodel)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMapping_From()
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getMappings
	 * @model opposite="mappings" resolveProxies="false"
	 * @generated
	 */
	Metamodel getFrom();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Metamodel value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ModelType)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMapping_To()
	 * @model
	 * @generated
	 */
	ModelType getTo();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ModelType value);

} // Mapping
