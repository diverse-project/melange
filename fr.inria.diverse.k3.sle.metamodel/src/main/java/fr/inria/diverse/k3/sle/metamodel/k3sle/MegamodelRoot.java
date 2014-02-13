/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Megamodel Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.MegamodelRoot#getElements <em>Elements</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.MegamodelRoot#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.MegamodelRoot#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMegamodelRoot()
 * @model
 * @generated
 */
public interface MegamodelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.k3.sle.metamodel.k3sle.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMegamodelRoot_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference.
	 * @see #setImports(XImportSection)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMegamodelRoot_Imports()
	 * @model containment="true"
	 * @generated
	 */
	XImportSection getImports();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.MegamodelRoot#getImports <em>Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports</em>' containment reference.
	 * @see #getImports()
	 * @generated
	 */
	void setImports(XImportSection value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getMegamodelRoot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.MegamodelRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MegamodelRoot
