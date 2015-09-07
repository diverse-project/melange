package fr.inria.diverse.melange.tests.eclipse.shared

import java.io.IOException
import java.lang.reflect.InvocationTargetException
import java.util.zip.ZipFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.ui.dialogs.IOverwriteQuery
import org.eclipse.ui.wizards.datatransfer.ImportOperation
import org.eclipse.ui.wizards.datatransfer.ZipFileStructureProvider

class WorkspaceDeployer
{
	def static void deployZipInProject(IProject project, String zipLocation) throws CoreException, IOException, InvocationTargetException, InterruptedException {
		val zip = new ZipFile(zipLocation)

		val queryOverwrite = new IOverwriteQuery() {
	    	override queryOverwrite(String file) { return ALL }	
	    }

		val structureProvider = new ZipFileStructureProvider(zip)

	    new ImportOperation(
	    	project.fullPath,
	    	structureProvider.root,
	    	structureProvider,
	    	queryOverwrite
	    ).run(new NullProgressMonitor)

		zip.close
	}
}
