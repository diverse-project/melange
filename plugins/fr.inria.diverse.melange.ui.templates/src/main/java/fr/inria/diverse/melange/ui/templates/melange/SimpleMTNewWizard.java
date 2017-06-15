/*******************************************************************************
 *  Copyright (c) 2000, 2007 IBM Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package fr.inria.diverse.melange.ui.templates.melange;


import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.BaseProjectWizardFields;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.templates.ITemplateSection;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.templates.NewProjectTemplateWizard;
import fr.inria.diverse.melange.ui.templates.MelangeTemplateMessages;

public class SimpleMTNewWizard extends NewProjectTemplateWizard {
	/**
	 * Constructor for MiniEcoreAspectSampleNewWizard.
	 */
	public SimpleMTNewWizard() {
		super();
	}

	public void init(BaseProjectWizardFields data) {
		super.init(data);
		setWindowTitle(MelangeTemplateMessages.SimpleMTTemplate_wtitle);
	}

	/*
	 * @see NewExtensionTemplateWizard#createTemplateSections()
	 */
	public ITemplateSection[] createTemplateSections() {
		return new ITemplateSection[] {new SimpleMTTemplate()};
	}
}
