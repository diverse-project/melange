package fr.inria.diverse.melange.utils

import fr.inria.diverse.commons.asm.shade.DirectoryShader
import fr.inria.diverse.commons.asm.shade.ShadeRequest

import fr.inria.diverse.commons.asm.shade.relocation.Relocator
import fr.inria.diverse.commons.asm.shade.relocation.SimpleRelocator

import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.NamingHelper

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

import org.eclipse.xtext.common.types.JvmDeclaredType

import org.eclipse.xtext.naming.IQualifiedNameConverter

import org.eclipse.xtext.util.internal.Stopwatches

import static fr.inria.diverse.melange.utils.AspectCopier.*

/**
 * Baaah, full of sh*t
 */
class AspectCopier
{
	@Inject extension MetamodelExtensions
	@Inject extension IQualifiedNameConverter
	@Inject extension NamingHelper
	static Logger log = Logger.getLogger(AspectCopier)

	def void copyAspectTo(Aspect asp, Metamodel mm) {
		val task = Stopwatches.forTask("copying aspects in new type group")
		task.start

		val shader = new DirectoryShader
		val request = new ShadeRequest
		val relocators = new ArrayList<Relocator>
		val sourceEmfNamespace = (asp.aspectTypeRef.type as JvmDeclaredType).aspectAnnotationValueType.toQualifiedName.skipLast(1)
		val targetEmfNamespace = mm.packageFqn.toQualifiedName.skipLast(1)
		val sourceAspectNamespace = asp.aspectTypeRef.identifier.toQualifiedName.skipLast(1)
		val targetAspectNamespace = sourceAspectNamespace.skipLast(2).append(mm.name.toLowerCase).append(sourceAspectNamespace.lastSegment)

		val projectPathTmp = new StringBuilder
		mm.project.workspace.root.accept(new IResourceVisitor {
			override visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					val resourcePath = resource.locationURI.path
					val toBeMatched = asp.aspectTypeRef.identifier.replace(".", "/") + ".java"
					if (resourcePath.endsWith(toBeMatched)) {
						val projectPath = resource.project.locationURI.path
						if (projectPathTmp.length == 0)
							projectPathTmp.append(projectPath)
					}
					return false
				}
				
				return true
			}
		})

		val sourceAspectFolder = projectPathTmp.toString + "/xtend-gen/"
		val targetAspectFolder = projectPathTmp.toString + "/../" + mm.externalAspectsRuntimeName + "/src/"
		val sourceFolderFile = new File(sourceAspectFolder)
		val targetFolderFile = new File(targetAspectFolder)

		relocators += new SimpleRelocator(sourceEmfNamespace.toString, targetEmfNamespace.toString, null, #[])
		relocators += new SimpleRelocator(sourceAspectNamespace.toString, targetAspectNamespace.toString, null, #[])

		request.inputFolders = #{sourceFolderFile}
		request.outputFolder = targetFolderFile
		request.filters = #[]
		request.relocators = relocators

		try {
			log.debug('''Copying aspect «asp.aspectTypeRef.identifier» to «mm.name»:''')
			log.debug('''	sourceEmfNamespace = «sourceEmfNamespace»''')
			log.debug('''	targetEmfNamespace = «targetEmfNamespace»''')
			log.debug('''	sourceAspectNamespace = «sourceAspectNamespace»''')
			log.debug('''	targetAspectNamespace = «targetAspectNamespace»''')
			log.debug('''	sourceAspectFolder = «sourceAspectFolder»''')
			log.debug('''	targetAspectFolder = «targetAspectFolder»''')
			shader.shade(request)
		} catch (IOException e) {
			log.debug("Copy failed", e)
		} finally {
			task.stop
		}
	}
}
