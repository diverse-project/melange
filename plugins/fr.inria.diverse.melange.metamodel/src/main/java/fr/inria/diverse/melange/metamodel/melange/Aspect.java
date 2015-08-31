/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getAspectTypeRef <em>Aspect Type Ref</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getAspectedClass <em>Aspected Class</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getEcoreFragment <em>Ecore Fragment</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends EObject {
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
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getAspect_AspectTypeRef()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getAspectTypeRef();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getAspectTypeRef <em>Aspect Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Type Ref</em>' containment reference.
	 * @see #getAspectTypeRef()
	 * @generated
	 */
	void setAspectTypeRef(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Aspected Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspected Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspected Class</em>' reference.
	 * @see #setAspectedClass(EClass)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getAspect_AspectedClass()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EClass getAspectedClass();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getAspectedClass <em>Aspected Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspected Class</em>' reference.
	 * @see #getAspectedClass()
	 * @generated
	 */
	void setAspectedClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Ecore Fragment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Fragment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Fragment</em>' containment reference.
	 * @see #setEcoreFragment(EPackage)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getAspect_EcoreFragment()
	 * @model containment="true"
	 * @generated
	 */
	EPackage getEcoreFragment();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Aspect#getEcoreFragment <em>Ecore Fragment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Fragment</em>' containment reference.
	 * @see #getEcoreFragment()
	 * @generated
	 */
	void setEcoreFragment(EPackage value);

} // Aspect
