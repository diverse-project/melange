/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xbase Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getBody <em>Body</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#isMain <em>Main</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getReturnTypeRef <em>Return Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getXbaseTransformation()
 * @model
 * @generated
 */
public interface XbaseTransformation extends Transformation {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(XExpression)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getXbaseTransformation_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	XExpression getBody();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(XExpression value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' attribute.
	 * @see #setMain(boolean)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getXbaseTransformation_Main()
	 * @model
	 * @generated
	 */
	boolean isMain();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#isMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #isMain()
	 * @generated
	 */
	void setMain(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.common.types.JvmFormalParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getXbaseTransformation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<JvmFormalParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type Ref</em>' containment reference.
	 * @see #setReturnTypeRef(JvmTypeReference)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getXbaseTransformation_ReturnTypeRef()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getReturnTypeRef();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.XbaseTransformation#getReturnTypeRef <em>Return Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type Ref</em>' containment reference.
	 * @see #getReturnTypeRef()
	 * @generated
	 */
	void setReturnTypeRef(JvmTypeReference value);

} // XbaseTransformation
