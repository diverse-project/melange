/**
 */
package shallowhistory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shallowhistory.AbstractState#getOwnerRegion <em>Owner Region</em>}</li>
 * </ul>
 *
 * @see shallowhistory.ShallowhistoryPackage#getAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface AbstractState extends EObject {

	/**
	 * Returns the value of the '<em><b>Owner Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link shallowhistory.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Region</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Region</em>' container reference.
	 * @see #setOwnerRegion(Region)
	 * @see shallowhistory.ShallowhistoryPackage#getAbstractState_OwnerRegion()
	 * @see shallowhistory.Region#getSubvertex
	 * @model opposite="subvertex" required="true" transient="false"
	 * @generated
	 */
	Region getOwnerRegion();

	/**
	 * Sets the value of the '{@link shallowhistory.AbstractState#getOwnerRegion <em>Owner Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Region</em>' container reference.
	 * @see #getOwnerRegion()
	 * @generated
	 */
	void setOwnerRegion(Region value);
} // AbstractState
