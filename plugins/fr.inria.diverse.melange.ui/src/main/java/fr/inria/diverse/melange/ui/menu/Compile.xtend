package fr.inria.diverse.melange.ui.menu

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.swt.widgets.Shell
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IncrementalProjectBuilder
import org.eclipse.jface.wizard.ProgressMonitorPart
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import fr.inria.diverse.melange.preferences.MelangePreferencesAccess

class Compile extends AbstractHandler{
	
	override execute(ExecutionEvent event) throws ExecutionException {
		
		val Job job = new Job("Full Melange build"){
			
			override protected run(IProgressMonitor monitor) {
				
				MelangePreferencesAccess.instance.enableCodeGenerator()
				
				val Shell shell = HandlerUtil.getActiveShell(event)
		    	val ISelection sel = HandlerUtil.getActiveMenuSelection(event)
		    	val IStructuredSelection selection =  sel as IStructuredSelection
				val IResource resource = selection.firstElement as IResource
				val project = resource.project
				project.build(IncrementalProjectBuilder.FULL_BUILD, monitor)
				return Status.OK_STATUS
			}
			
		}
		job.schedule
		
		return null
	}
}