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
package fr.inria.diverse.melange.ui.wizards.pages;

import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.BaseProjectWizardFields;

public class NewMelangeProjectWizardFields extends BaseProjectWizardFields {
	
	// Specific fields for this wizard
/*	public enum KindsOfProject { STANDALONE, PLUGIN, MAVEN }
	
	public boolean 			ecoreProject;
	public String 			genModelFile;
	public List<String>		basePackage;
	public String 			typeProject;
	public String 			namePackage;
	public IFile 			ecoreIFile;
	public String 			ecoreProjectPath;
	public KindsOfProject 	kindsOfProject;
	public boolean			useEMF = true;
	public boolean			useKMF = false;
	public boolean			useSLE = false;*/

	//public String 			basePackageName;
	
	
	
	public NewMelangeProjectWizardFields () {
		super();
		
		this.projectName 			= "org.sample.melangeproject";
		this.projectLocation 		= ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
		//this.basePackageName 		= this.projectName;
		
	}
}
