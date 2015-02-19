package fr.inria.diverse.melange.utils

import fr.inria.diverse.commons.asm.shade.DirectoryShader
import fr.inria.diverse.commons.asm.shade.ShadeRequest
import fr.inria.diverse.commons.asm.shade.relocation.Relocator
import fr.inria.diverse.commons.asm.shade.relocation.SimpleRelocator
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import java.io.File
import java.io.IOException
import java.util.ArrayList
import javax.inject.Inject
import org.apache.log4j.Logger
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceVisitor
import org.eclipse.core.runtime.CoreException
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.util.internal.Stopwatches

import static fr.inria.diverse.melange.utils.AspectCopier.*

/**
 * Baaah, full of sh*t
 */
class AspectCopier
{
	@Inject extension ModelingElementExtensions
	@Inject extension MetamodelExtensions
	@Inject extension IQualifiedNameConverter
	@Inject extension NamingHelper
	static Logger log = Logger.getLogger(AspectCopier)

	// FIXME: We should first check that aspects are importable (i.e. defined
	//         on a type group this metamodel is a subtype of)
	def String copyAspectTo(Aspect asp, Metamodel mm) {
		val task = Stopwatches.forTask("copying aspects in new type group")
		task.start

		val ws = mm.project.workspace.root
		val shader = new DirectoryShader
		val request = new ShadeRequest
		val relocators = new ArrayList<Relocator>
		val sourceEmfNamespace = asp.targetedNamespace
		val targetEmfNamespace = mm.packageFqn.toQualifiedName.skipLast(1)
		val sourceAspectNamespace = asp.aspectTypeRef.identifier.toQualifiedName.skipLast(1)
		val targetAspectNamespace = sourceAspectNamespace.skipLast(2).append(mm.name.toLowerCase).append(sourceAspectNamespace.lastSegment)

		val projectPathTmp = new StringBuilder
		val projectNameTmp = new StringBuilder
		ws.accept(new IResourceVisitor {
			override visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					val resourcePath = resource.locationURI.path
					val toBeMatched = asp.aspectTypeRef.identifier.replace(".", "/") + ".java"
					if (resourcePath.endsWith(toBeMatched)) {
						val projectPath = resource.project.locationURI.path
						if (projectPathTmp.length == 0)
							projectPathTmp.append(projectPath)
						if (projectNameTmp.length == 0)
							projectNameTmp.append(resource.project.name)
					}
					return false
				}
				
				return true
			}
		})

		val sourceAspectFolder = projectPathTmp.toString + "/xtend-gen/"
		val targetAspectFolder = projectPathTmp.toString + "/../" + targetAspectNamespace + "/src-gen/"
		val sourceFolderFile = new File(sourceAspectFolder)
		val targetFolderFile = new File(targetAspectFolder)
		val sourceProject = ws.getProject(projectNameTmp.toString)
		val findTargetProject = ws.getProject(targetAspectNamespace.toString)
		// FIXME: Just to have a first call of the EPackageProvider
		//        in order to set the ecoreUri when inherited
		val x = mm.pkgs
		val ecoreUri = URI::createURI(mm.ecoreUri)
		val emfRuntimeProject = ecoreUri.segment(1)
		val targetProject =
			if (findTargetProject.exists)
				findTargetProject
			else
				EclipseProjectHelper::createAspectsRuntimeProject(
					sourceProject,
					targetAspectNamespace.toString,
					targetAspectNamespace.toString,
					emfRuntimeProject
				)
//		val filenameToBeFound = '''/src-gen/«targetAspectNamespace.toString.replace(".", "/")»/«asp.aspectTypeRef.simpleName».java'''
//		val fileToBeFound = targetProject.getFile(filenameToBeFound)

		EclipseProjectHelper::addDependencies(mm.project, #[targetProject.name])

		relocators += new SimpleRelocator(sourceEmfNamespace.toString, targetEmfNamespace.toString, null, #[])
		relocators += new SimpleRelocator(sourceAspectNamespace.toString, targetAspectNamespace.toString, null, #[])

		request.inputFolders = #{sourceFolderFile}
		request.outputFolder = targetFolderFile
		request.filters = #[]
		request.relocators = relocators

		try {
			log.debug('''Copying aspect «asp.aspectTypeRef.identifier» to «mm.name»:''')
			log.debug('''	sourceEmfNamespace    = «sourceEmfNamespace»''')
			log.debug('''	targetEmfNamespace    = «targetEmfNamespace»''')
			log.debug('''	sourceAspectNamespace = «sourceAspectNamespace»''')
			log.debug('''	targetAspectNamespace = «targetAspectNamespace»''')
			log.debug('''	sourceAspectFolder    = «sourceAspectFolder»''')
			log.debug('''	targetAspectFolder    = «targetAspectFolder»''')

//			if (!fileToBeFound.exists) {
				shader.shade(request)
				targetProject.refreshLocal(IResource.DEPTH_INFINITE, null)
//			}
			return '''«targetAspectNamespace».«asp.aspectTypeRef.simpleName»'''
		} catch (IOException e) {
			log.debug("Copy failed", e)
			return null
		} catch (CoreException e) {
			log.debug("Refresh failed", e)
			return null
		} finally {
			task.stop
		}
	}
}
