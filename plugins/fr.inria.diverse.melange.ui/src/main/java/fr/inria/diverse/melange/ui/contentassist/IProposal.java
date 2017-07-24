/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.ui.contentassist;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;

public interface IProposal {
	
	/**
	 * Text diplayed in the proposal list
	 */
	public String getDisplayText();
	
	
	/**
	 * Text inserted in the document
	 */
	public String getReplacementText();
	
	/**
	 * Add dependencies to make valid this proposal 
	 */
	public void configureProject(IProject project);
	
	public void configureProposal(EObject context);
}
