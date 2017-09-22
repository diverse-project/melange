/**
 * Copyright (c) 2017 Inria and others.
 *  * All rights reserved. This program and the accompanying materials
 *  * are made available under the terms of the Eclipse Public License v1.0
 *  * which accompanies this distribution, and is available at
 *  * http://www.eclipse.org/legal/epl-v10.html
 *  *
 *  * Contributors:
 *  *     Inria - initial API and implementation
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.gemoc.dsl.Dsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Dsl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.ImportDsl#getDsl <em>Dsl</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getImportDsl()
 * @model
 * @generated
 */
public interface ImportDsl extends Language {
	/**
	 * Returns the value of the '<em><b>Dsl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsl</em>' reference.
	 * @see #setDsl(Dsl)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getImportDsl_Dsl()
	 * @model
	 * @generated
	 */
	Dsl getDsl();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.ImportDsl#getDsl <em>Dsl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsl</em>' reference.
	 * @see #getDsl()
	 * @generated
	 */
	void setDsl(Dsl value);

} // ImportDsl
