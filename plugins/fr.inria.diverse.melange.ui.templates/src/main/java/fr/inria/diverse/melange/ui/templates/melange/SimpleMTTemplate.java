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

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.BundleException;

import fr.inria.diverse.commons.eclipse.pde.manifest.ManifestChanger;
import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.BaseProjectWizardFields;
import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.templates.AbstractStringWithButtonOption;
import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.templates.TemplateOption;
import fr.inria.diverse.melange.ui.templates.Activator;
import fr.inria.diverse.melange.ui.templates.IHelpContextIds;
import fr.inria.diverse.melange.ui.templates.MelangeTemplateMessages;
import fr.inria.diverse.melange.ui.templates.MelangeTemplateSection;
import fr.inria.diverse.melange.ui.wizards.pages.NewMelangeProjectWizardFields;

public class SimpleMTTemplate extends MelangeTemplateSection {
	public static final String KEY_MELANGE_FILE_NAME = "melangeFileName"; //$NON-NLS-1$
	public static final String MELANGE_FILE_NAME = "Hello"; //$NON-NLS-1$
	public static final String KEY_ASPECTCLASS_POSTFIX = "aspectClassPostfix"; //$NON-NLS-1$
	public static final String KEY_METAMODEL_NAME = "metamodelName"; //$NON-NLS-1$
	public static final String METAMODEL_NAME = "MyLanguage"; //$NON-NLS-1$
	public static final String KEY_ECOREFILE_PATH = "ecoreFilePath"; //$NON-NLS-1$


	protected static final List<String> FILE_EXTENSIONS = Arrays.asList(new String [] { "ecore" });
	

	NewMelangeProjectWizardFields _data;
	
	// other data specific to this template
	public IFile 		ecoreIFile;
	protected String ecoreProjectPath;
	
	/**
	 * Constructor for simple model type Template.
	 */
	public SimpleMTTemplate() {
		setPageCount(1);
		createOptions();
	}

	/** 
	 * used to retrieve the template folder
	 */
	public String getSectionId() {
		return "SimpleMT"; //$NON-NLS-1$
	}

	/*
	 * @see ITemplateSection#getNumberOfWorkUnits()
	 */
	public int getNumberOfWorkUnits() {
		return super.getNumberOfWorkUnits() + 1;
	}

	private void createOptions() {
		addOption(KEY_PACKAGE_NAME, MelangeTemplateMessages.SimpleMTTemplate_packageName, (String) null, 0);
		addOption(KEY_MELANGE_FILE_NAME, MelangeTemplateMessages.SimpleMTTemplate_melangeFileName, MELANGE_FILE_NAME, 0);
		addOption(KEY_METAMODEL_NAME, MelangeTemplateMessages.SimpleMTTemplate_melangeMetamodelName, METAMODEL_NAME, 0);
		TemplateOption ecoreLocationOption  = new AbstractStringWithButtonOption(this, KEY_ECOREFILE_PATH, MelangeTemplateMessages.SimpleMTTemplate_ecoreFileLocation) {
			@Override
			public String doSelectButton() {
				final IWorkbenchWindow workbenchWindow = PlatformUI
						.getWorkbench().getActiveWorkbenchWindow();
				Object selection = null;
				if (workbenchWindow.getSelectionService().getSelection() instanceof IStructuredSelection) {
					selection = ((IStructuredSelection) workbenchWindow
							.getSelectionService().getSelection())
							.getFirstElement();
				}
				final IFile selectedEcoreFile = selection != null
						&& selection instanceof IFile
						&& FILE_EXTENSIONS.contains(((IFile) selection)
								.getFileExtension()) ? (IFile) selection : null;
				ViewerFilter viewerFilter = new ViewerFilter() {
					@Override
					public boolean select(Viewer viewer, Object parentElement,
							Object element) {
						if (element instanceof IFile) {
							IFile file = (IFile) element;
							return FILE_EXTENSIONS.contains(file
									.getFileExtension())
									&& (selectedEcoreFile == null || !selectedEcoreFile
											.getFullPath().equals(
													file.getFullPath()));
						}
						return true;
					}
				};
				final IFile[] files = WorkspaceResourceDialog
						.openFileSelection(workbenchWindow.getShell(), null,
								"Select ecore", true, null,
								Collections.singletonList(viewerFilter));
				if (files.length > 0) {
					SimpleMTTemplate.this.ecoreIFile = files[0];
					//txtPathEcore.setText(files[i].getFullPath().toOSString());
					SimpleMTTemplate.this.ecoreProjectPath = files[0].getProject().getFullPath().toString();
					return files[0].getFullPath().toString();
				}

				return null;
			}
		};
		registerOption(ecoreLocationOption, (String) null, 0);
	}

	public void addPages(Wizard wizard) {
		WizardPage page = createPage(0, IHelpContextIds.TEMPLATE_SIMPLE_MT_MELANGE);
		page.setTitle(MelangeTemplateMessages.SimpleMTTemplate_title);
		page.setDescription(MelangeTemplateMessages.SimpleMTTemplate_desc);
		wizard.addPage(page);
		markPagesAdded();
	}

	public boolean isDependentOnParentWizard() {
		return true;
	}

	protected void initializeFields(BaseProjectWizardFields data) {
		String packageName = getFormattedPackageName(((NewMelangeProjectWizardFields)data).projectName);
		initializeOption(KEY_PACKAGE_NAME, packageName);
		_data = (NewMelangeProjectWizardFields) data;
	}


	public String getUsedExtensionPoint() {
		return "org.eclipse.ui.actionSets"; //$NON-NLS-1$
	}


	/* (non-Javadoc)
	 * @see org.eclipse.pde.ui.templates.ITemplateSection#getFoldersToInclude()
	 */
	public String[] getNewFiles() {
		return new String[] {"icons/"}; //$NON-NLS-1$
	}

	/* (non-Javadoc)
	 * @see org.eclipse.pde.internal.ui.wizards.templates.PDETemplateSection#formatPackageName(java.lang.String)
	 */
	protected String getFormattedPackageName(String id) {
		String packageName = super.getFormattedPackageName(id);
		if (packageName.length() != 0)
			return packageName; //$NON-NLS-1$
		return "actions"; //$NON-NLS-1$
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.templates.BaseOptionTemplateSection#getReplacementString(java.lang.String, java.lang.String)
	 */
	@Override
	public String getReplacementString(String fileName, String key) {
		// TODO Auto-generated method stub
		String s = super.getReplacementString(fileName, key);
		return s;
	}

	/* (non-Javadoc)
	 * @see fr.inria.diverse.k3.ui.templates.K3TemplateSection#generateFiles(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected void generateFiles(IProgressMonitor monitor) throws CoreException {
		// use the templates files
		super.generateFiles(monitor);
		
		// now also fix the project configuration
		ManifestChanger manifestChanger;
		try {
			if(this.ecoreIFile != null){
				manifestChanger = new ManifestChanger(project.getFile("META-INF/MANIFEST.MF"));
				manifestChanger.addPluginDependency(this.ecoreIFile.getProject().getName(), "0.0.0", false, true);
				manifestChanger.commit();
			}
		} catch (IOException | BundleException e) {
			Activator.logErrorMessage(e.getMessage(), e);
		}
	}
}
