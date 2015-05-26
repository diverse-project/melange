package fr.inria.diverse.puzzle.commands

import com.google.inject.Injector
import com.google.inject.Provider
import fr.inria.diverse.melange.MelangeStandaloneSetup
import java.util.ArrayList
import java.util.Collection
import java.util.Collections
import java.util.Iterator
import java.util.List
import org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.BasicMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.action.IAction
import org.eclipse.jface.operation.IRunnableWithProgress
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.IActionDelegate
import org.eclipse.ui.IObjectActionDelegate
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.PlatformUI
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer
import fr.inria.diverse.k3.sle.compose.configurator.common.Configurator

class CompositionHandler implements IObjectActionDelegate {

	private Shell shell;
	private Collection<IResource> selectedResources = Collections.emptySet();
	
	private IProject project
	private IWorkspaceRoot wsRoot
	private Provider<IJvmModelInferrer> inferrerProvider
	
	/** Constructor */
	new() {
		super();
		var Injector injector = new MelangeStandaloneSetup().createInjectorAndDoEMFRegistration();
		inferrerProvider = injector.getProvider(IJvmModelInferrer);
		
	}

	def protected Shell getShell() {
		return shell;
	}
	
	override public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	override void run(IAction action) {
			val IResource compositionModel = selectedResources.get(0)
			project = compositionModel.project
			wsRoot = project.workspace.root
			
			var IRunnableWithProgress operation = new IRunnableWithProgress() {
			override public void run(IProgressMonitor monitor) {
				try {
						var URI modelURI = URI.createFileURI(compositionModel.location.toString);
				    	System.out.println("filePath: " + compositionModel.location.toString);
				    	System.out.println("modelURI: " + modelURI);
						
						//TODO Do something to give a good name to the package! Probably, get the name of the language... *.*
				    	var IContainer targetJava = project.getFolder("src/fsm");
				    	if (!targetJava.getLocation().toFile().exists()) {
							targetJava.getLocation().toFile().mkdirs();
						}
				    	
				    	var List<? extends Object> arguments = new ArrayList<Object>();
				    	var Configurator pluginModule = new Configurator(modelURI, targetJava.getLocation().toFile(), arguments);
				    	monitor.worked(1);
						var String generationID = AcceleoLaunchingUtil.computeUIProjectID("fr.inria.diverse.k3.sle.compose.configurator", 
												"fr.inria.diverse.k3.sle.compose.configurator.common.Configurator", modelURI.toString(), targetJava.getFullPath().toString(), new ArrayList<String>());
						pluginModule.setGenerationID(generationID);
						pluginModule.doGenerate(BasicMonitor.toMonitor(monitor));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			
			try {
				// executes the action
				PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
				project.refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			println('Coucou! ' + compositionModel)
			
	}

	override void selectionChanged(IAction action, ISelection selection) {
		selectedResources = Collections.emptySet();
		if (selection instanceof IStructuredSelection) {
			var IStructuredSelection structuredSelection = selection as IStructuredSelection;
			selectedResources = new ArrayList<IResource>();
			var Iterator<?> iter = structuredSelection.iterator();
			while (iter.hasNext()){
				var Object next = iter.next();
				if (next instanceof IResource) {
					selectedResources.add(next as IResource);
				}
			}
		}
	}		
}