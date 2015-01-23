package fr.inria.diverse.melange.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import fr.inria.diverse.commons.eclipse.pde.classpath.ManifestChanger;
import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.AbstractNewProjectWizardWithTemplates;
import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.IProjectContentWizard;
import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.ProjectTemplateApplicationOperation;
import fr.inria.diverse.commons.eclipse.resources.IFileUtils;
import fr.inria.diverse.commons.eclipse.resources.IFolderUtils;
import fr.inria.diverse.melange.ui.MelangeUiModule;
import fr.inria.diverse.melange.ui.internal.MelangeActivator;
import fr.inria.diverse.melange.ui.wizards.pages.NewMelangeProjectWizardFields;
import fr.inria.diverse.melange.ui.wizards.pages.NewMelangeProjectWizardPage;

public class NewMelangeProjectWizard extends AbstractNewProjectWizardWithTemplates implements INewWizard {


	
	protected NewMelangeProjectWizardFields 		context;
	
	protected NewMelangeProjectWizardPage 		projectPage;
	//WizardPageCustomNewProjectK3Plugin 	projectPageCustom	 = new WizardPageCustomNewProjectK3Plugin(this.context);
	
	
	public NewMelangeProjectWizard() {
		context = new NewMelangeProjectWizardFields();
	}
	
	@Override
	public void addPages() {
		projectPage			 = new NewMelangeProjectWizardPage(this.context);
		
		addPage(projectPage);			
		addPage(getTemplateListSelectionPage(context));
		
		
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean performFinish() {	
		try {
			IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
			final IProjectDescription description = workspace.newProjectDescription(this.context.projectName);
			if (!this.context.projectLocation.equals(workspace.getRoot().getLocation().toOSString()))
				description.setLocation(new Path(this.context.projectLocation));
			
			final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(this.context.projectName);
			IWorkspaceRunnable operation = new IWorkspaceRunnable() {
				public void run(IProgressMonitor monitor) throws CoreException {
					project.create(description, monitor);
					project.open(monitor);
					addNaturesToProject(project);
					
					configureProject(project, monitor);
					
					
					// launch the template
					
					IProjectContentWizard contentWizard = templateSelectionPage.getSelectedWizard();
					try {
						getContainer().run(false, true, new ProjectTemplateApplicationOperation(context, project, contentWizard));
					} catch (InvocationTargetException e) {
						MelangeUiModule.logErrorMessage(e.getMessage(), e);
					} catch (InterruptedException e) {
						MelangeUiModule.logErrorMessage(e.getMessage(), e);
					}
					
					//setClassPath(project, monitor);
					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				}
			};
			ResourcesPlugin.getWorkspace().run(operation, null);
			
		} catch (Exception exception) {
			MelangeUiModule.logErrorMessage(exception.getMessage(), exception);
			return false;
		}
		return true;
	}
	
	
	@Override
	public boolean isHelpAvailable() {
		return true;
	}

	public void addNaturesToProject(IProject project) {
		IProjectDescription description;
		try {
			
			description = project.getDescription();	
			if (!description.hasNature("org.eclipse.jdt.core.javanature")){
				addNature(description, "org.eclipse.jdt.core.javanature");
			}
			if(!description.hasNature("org.eclipse.xtext.ui.shared.xtextNature")){
				addNature(description, "org.eclipse.xtext.ui.shared.xtextNature");				
			}
			if(!description.hasNature("org.eclipse.pde.PluginNature")){
				addNature(description, "org.eclipse.pde.PluginNature");				
			}
			project.setDescription(description, null);
		} catch (CoreException e) {
			MelangeUiModule.logErrorMessage(e.getMessage(), e);
		}
	}
	
	public void configureProject(IProject project, IProgressMonitor monitor) {
		try {
			IProjectDescription description;
			description = project.getDescription();
			addNature(description, "org.eclipse.jdt.core.javanature");
			addNature(description, "org.eclipse.xtext.ui.shared.xtextNature");
			//String sourceFolderName= "src/";
			
			createSettingsResourcePrefs(project, monitor);

			//IFolderUtils.createFolder(sourceFolderName + context.basePackageName.replaceAll("\\.", "/"), project, monitor);
			IFolderUtils.createFolder("src-gen", project, monitor);
			
			addNature(description, "org.eclipse.pde.PluginNature");
			createEmptyManifestFile(project, monitor);
			updateManifestFile(project, monitor);
			createPlugInFile(project, monitor);
			createBuildProperties(project, monitor);
			setClasspath(project,  monitor);
			
			project.setDescription(description, monitor);
		} catch (Exception e) {
			MelangeUiModule.logErrorMessage(e.getMessage(), e);
		}
	}
	
	private void updateManifestFile (IProject project, IProgressMonitor monitor) {
		try {
			ManifestChanger manifestChanger = new ManifestChanger(project.getFile("META-INF/MANIFEST.MF"));

			manifestChanger.addPluginDependency("org.eclipse.xtend.lib", "2.7.0", false, true);
			manifestChanger.addPluginDependency("org.eclipse.xtext.xbase.lib", "2.7.0", false, true);
			manifestChanger.addPluginDependency("com.google.guava", "0.0.0", false, true);
			manifestChanger.addPluginDependency("org.eclipse.emf.ecore.xmi", "2.8.0", true, true);
			manifestChanger.addPluginDependency("org.eclipse.emf.ecore", "2.8.0", true, true);
			manifestChanger.addPluginDependency("org.eclipse.emf.common", "2.8.0", true, true);
			manifestChanger.addPluginDependency("fr.inria.diverse.melange.lib", "0.1.0", true, true);
			
			manifestChanger.writeManifest(project.getFile("META-INF/MANIFEST.MF"));
			createPlugInFile(project, monitor);
			createBuildProperties(project, monitor);			
		} catch (Exception e) {
			MelangeUiModule.logErrorMessage(e.getMessage(), e);
		}
	}
	
	public static void addNature(IProjectDescription description, String nature) {
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = nature;
		description.setNatureIds(newNatures);
	}	
	
    private void createEmptyManifestFile(IProject project, IProgressMonitor monitor) throws Exception {	
	    IFolder metaInf = project.getFolder("META-INF");
	    metaInf.create(false, true, monitor);
	    
	    String path = "META-INF/MANIFEST.MF";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		String lineSeparator = System.getProperty("line.separator");
		StringBuffer buffer= new StringBuffer();
		buffer.append("Manifest-Version: 1.0" + lineSeparator);
		buffer.append("Bundle-ManifestVersion: 2" + lineSeparator);
		buffer.append("Bundle-Name: " + project.getName() + lineSeparator);
		buffer.append("Bundle-SymbolicName: " + project.getName() + "; singleton:=true" + lineSeparator);
		buffer.append("Bundle-Version: 1.0.0" + lineSeparator);
		buffer.append("Bundle-ClassPath: ." + lineSeparator);
	    buffer.append("Bundle-RequiredExecutionEnvironment: JavaSE-1.7"+lineSeparator);
	    
		IFileUtils.writeInFile(file, buffer.toString(), monitor);    
    }
	
    private void createBuildProperties(IProject project, IProgressMonitor monitor) throws Exception {	    
	    String path = "build.properties";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		
		String contents = MelangeFilesTemplates.buildProperties();
		IFileUtils.writeInFile(file, contents, monitor);   
    }
    
    private void createSettingsResourcePrefs(IProject project, IProgressMonitor monitor) throws Exception {	    
    	IFolder settings = project.getFolder(".settings");
    	settings.create(false, true, monitor);
	    
	    String path = ".settings/org.eclipse.core.resources.prefs";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		
		String contents = MelangeFilesTemplates.eclipseResourcePrefs();
		IFileUtils.writeInFile(file, contents, monitor);   
    }
    
	private void createPlugInFile(IProject project,IProgressMonitor monitor) throws Exception {
		String path = "/plugin.xml";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		
		String contents = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + "<?eclipse version=\"3.4\"?>\n" + "<plugin>\n" + "</plugin>";
		IFileUtils.writeInFile(file, contents, monitor);
	}
	
	
		
	public NewMelangeProjectWizardFields getContext() {
		return context;
	}
	
	public void addNatureToProject(IProject project, Boolean tabNature[]) {
		IProjectDescription description;
		try {
			
			description = project.getDescription();
			if (!tabNature[0] && !description.hasNature("fr.inria.diverse.k3.ui.k3Nature")){
				addNature(description, "fr.inria.diverse.k3.ui.k3Nature");
			}
			if (!tabNature[1] && !description.hasNature("org.eclipse.jdt.core.javanature")){
				addNature(description, "org.eclipse.jdt.core.javanature");
			}
			if(!tabNature[2] && !description.hasNature("org.eclipse.xtext.ui.shared.xtextNature")){
				addNature(description, "org.eclipse.xtext.ui.shared.xtextNature");				
			}
			if(!tabNature[3] && (!description.hasNature("org.eclipse.pde.PluginNature"))){
				addNature(description, "org.eclipse.pde.PluginNature");				
			}
			if(!tabNature[4] && (!description.hasNature("org.eclipse.m2e.core.maven2Nature"))){
				addNature(description, "org.eclipse.m2e.core.maven2Nature");			
			}
			project.setDescription(description, null);
		} catch (CoreException e) {
			MelangeUiModule.logErrorMessage(e.getMessage(), e);
		}
	}
	
	public void setClasspath (IProject project, IProgressMonitor monitor) {
		
		try {
			
			IJavaProject javaProject = (IJavaProject)project.getNature(JavaCore.NATURE_ID);
			
			IFolder sourceFolder = project.getFolder("src");
			try {
				sourceFolder.create(true, true, monitor);
			} catch (Exception ex) {}
			
			ArrayList<IClasspathEntry> newClassPathArrayList = new ArrayList<IClasspathEntry>();
			
			IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);

			newClassPathArrayList.add( JavaCore.newSourceEntry(root.getPath()));
			newClassPathArrayList.add(JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER")));
			newClassPathArrayList.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));
			newClassPathArrayList.add(JavaCore.newSourceEntry(javaProject.getPackageFragmentRoot(project.getFolder("src-gen")).getPath()));

			// convert the array to the appropriate table
			IClasspathEntry[] newClassPath = new IClasspathEntry[newClassPathArrayList.size()];
			javaProject.setRawClasspath(newClassPathArrayList.toArray(newClassPath), monitor);
		} catch (Exception e) {
			MelangeUiModule.logErrorMessage(e.getMessage(), e);	
		}
		
	}
	
	

	public NewMelangeProjectWizardPage getPageProject() {
		return this.projectPage;
	}
	
	

	@Override
	public String getTargetPluginId() {		
		return MelangeActivator.getInstance().getBundle().getSymbolicName();
	}
	
	
	
}
