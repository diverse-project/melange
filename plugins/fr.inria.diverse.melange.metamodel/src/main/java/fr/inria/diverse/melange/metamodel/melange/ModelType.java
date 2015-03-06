/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getSubtypingRelations <em>Subtyping Relations</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getExtracted <em>Extracted</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getMtUri <em>Mt Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getModelType()
 * @model
 * @generated
 */
public interface ModelType extends ModelingElement {
	/**
	 * Returns the value of the '<em><b>Subtyping Relations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.Subtyping}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.melange.metamodel.melange.Subtyping#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtyping Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtyping Relations</em>' containment reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getModelType_SubtypingRelations()
	 * @see fr.inria.diverse.melange.metamodel.melange.Subtyping#getSubType
	 * @model opposite="subType" containment="true"
	 * @generated
	 */
	EList<Subtyping> getSubtypingRelations();

	/**
	 * Returns the value of the '<em><b>Extracted</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getExactType <em>Exact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extracted</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extracted</em>' reference.
	 * @see #setExtracted(Metamodel)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getModelType_Extracted()
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getExactType
	 * @model opposite="exactType"
	 * @generated
	 */
	Metamodel getExtracted();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getExtracted <em>Extracted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extracted</em>' reference.
	 * @see #getExtracted()
	 * @generated
	 */
	void setExtracted(Metamodel value);

	/**
	 * Returns the value of the '<em><b>Mt Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mt Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mt Uri</em>' attribute.
	 * @see #setMtUri(String)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getModelType_MtUri()
	 * @model
	 * @generated
	 */
	String getMtUri();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getMtUri <em>Mt Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mt Uri</em>' attribute.
	 * @see #getMtUri()
	 * @generated
	 */
	void setMtUri(String value);

} // ModelType
