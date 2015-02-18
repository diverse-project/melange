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
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceVisitor
import org.eclipse.core.runtime.CoreException
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.naming.IQualifiedNameConverter

/**
 * Baaah, full of sh*t
 */
class AspectCopier
{
	@Inject extension MetamodelExtensions
	@Inject extension IQualifiedNameConverter
	@Inject extension NamingHelper

	def void copyAspectTo(Aspect asp, Metamodel mm) {
//		val shader = new DirectoryShader
//		val request = new ShadeRequest
//		val relocators = new java.util.ArrayList<Relocator>
//		val sourceEmfNamespace = "fsm"
//		val targetEmfNamespace = "timedfsm"
//		val sourceAspectNamespace = "atgm.aspects"
//		val targetAspectNamespace = "atgm.extended.aspects"
//		val sourceAspectFolder = "/home/dig/repositories/melange/examples/gemoc/ATGM.aspects/xtend-gen/"
//		val targetAspectFolder = "/home/dig/repositories/melange/examples/gemoc/my.dest.project/src/"
		val shader = new DirectoryShader
		val request = new ShadeRequest
		val relocators = new ArrayList<Relocator>
		val sourceEmfNamespace = (asp.aspectTypeRef.type as JvmDeclaredType).aspectAnnotationValueType.toQualifiedName.skipLast(1).toString
		val targetEmfNamespace = mm.packageFqn.toQualifiedName.skipLast(1).toString
		val sourceAspectNamespace = asp.aspectTypeRef.identifier.substring(0, asp.aspectTypeRef.identifier.lastIndexOf("."))
		val sourceAspectFqn = sourceAspectNamespace.toQualifiedName
		val targetAspectNamespace = sourceAspectFqn.skipLast(2).append(mm.name.toLowerCase).append(sourceAspectFqn.lastSegment).toString

		val projectPathTmp = new StringBuilder
		mm.project.workspace.root.accept(new IResourceVisitor {
			override visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					if (resource.name == asp.aspectTypeRef.simpleName + ".java") {
						val projectPath = resource.project.locationURI.toString.replaceFirst("file:", "")
						projectPathTmp.append(projectPath.toString)
					}
					return false
				}
				
				return true
			}
		})

		val sourceAspectFolder = projectPathTmp.toString + "/xtend-gen/"
		val targetAspectFolder = projectPathTmp.toString + "/../plop/src/"
		val sourceFolderFile = new File(sourceAspectFolder)
		val targetFolderFile = new File(targetAspectFolder)

		println("sourceEmfNamespace = " + sourceEmfNamespace)
		println("targetEmfNamespace = " + targetEmfNamespace)
		println("sourceAspectNamespace = " + sourceAspectNamespace)
		println("targetAspectNamespace = " + targetAspectNamespace)
		println("sourceAspectFolder = " + sourceAspectFolder)
		println("targetAspectFolder = " + targetAspectFolder)

		relocators += new SimpleRelocator(sourceEmfNamespace, targetEmfNamespace, null, #[])
		relocators += new SimpleRelocator(sourceAspectNamespace, targetAspectNamespace, null, #[])

		request.inputFolders = #{sourceFolderFile}
		request.outputFolder = targetFolderFile
		request.filters = #[]
		request.relocators = relocators

		try {
			shader.shade(request)
		} catch (IOException e) {
			// ...
		}
	}
}
