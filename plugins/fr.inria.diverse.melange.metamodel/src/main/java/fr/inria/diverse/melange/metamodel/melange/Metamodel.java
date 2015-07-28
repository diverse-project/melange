/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getOwningLanguage <em>Owning Language</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getGenmodelUris <em>Genmodel Uris</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends ModelingElement {
	/**
	 * Returns the value of the '<em><b>Owning Language</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.melange.metamodel.melange.Language#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Language</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Language</em>' container reference.
	 * @see #setOwningLanguage(Language)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMetamodel_OwningLanguage()
	 * @see fr.inria.diverse.melange.metamodel.melange.Language#getSyntax
	 * @model opposite="syntax" required="true" transient="false"
	 * @generated
	 */
	Language getOwningLanguage();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getOwningLanguage <em>Owning Language</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Language</em>' container reference.
	 * @see #getOwningLanguage()
	 * @generated
	 */
	void setOwningLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Genmodel Uris</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genmodel Uris</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genmodel Uris</em>' attribute list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMetamodel_GenmodelUris()
	 * @model
	 * @generated
	 */
	EList<String> getGenmodelUris();

} // Metamodel
