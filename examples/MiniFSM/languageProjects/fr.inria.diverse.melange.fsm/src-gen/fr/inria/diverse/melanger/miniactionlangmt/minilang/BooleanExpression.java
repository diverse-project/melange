/**
 */
package fr.inria.diverse.melanger.miniactionlangmt.minilang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean eval(Context ctx);

} // BooleanExpression
