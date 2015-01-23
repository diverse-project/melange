package fr.inria.diverse.melange.ui.wizards.pages;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;

import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.BaseProjectWizardFields;

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
		
		this.projectName 			= "org.sample.my_melange";
		this.projectLocation 		= ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
		//this.basePackageName 		= this.projectName;
		
	}
}
