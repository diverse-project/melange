/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getXtextSetupRef <em>Xtext Setup Ref</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Xtext Setup Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xtext Setup Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xtext Setup Ref</em>' containment reference.
	 * @see #setXtextSetupRef(JvmTypeReference)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMetamodel_XtextSetupRef()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getXtextSetupRef();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getXtextSetupRef <em>Xtext Setup Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xtext Setup Ref</em>' containment reference.
	 * @see #getXtextSetupRef()
	 * @generated
	 */
	void setXtextSetupRef(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.Mapping}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMetamodel_Mappings()
	 * @see fr.inria.diverse.melange.metamodel.melange.Mapping#getFrom
	 * @model opposite="from" resolveProxies="false"
	 * @generated
	 */
	EList<Mapping> getMappings();

} // Metamodel
