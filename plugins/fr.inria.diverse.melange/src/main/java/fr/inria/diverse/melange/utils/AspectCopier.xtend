package fr.inria.diverse.melange.utils

import fr.inria.diverse.commons.asm.shade.DirectoryShader
import fr.inria.diverse.commons.asm.shade.ShadeRequest
import fr.inria.diverse.commons.asm.shade.filter.Filter
import fr.inria.diverse.commons.asm.shade.relocation.Relocator
import fr.inria.diverse.commons.asm.shade.relocation.SimpleRelocator
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.utils.AspectCopier.AspectCopierRequest
import java.io.File
import java.util.Set
import javax.inject.Inject
import org.apache.log4j.Logger
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceVisitor
import org.eclipse.core.runtime.CoreException
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.util.internal.Stopwatches

import static fr.inria.diverse.melange.utils.AspectCopier.*

class AspectCopier
{
	@Inject extension AspectExtensions
	@Inject extension IQualifiedNameConverter
	@Inject EclipseProjectHelper eclipseHelper
	static Logger log = Logger.getLogger(AspectCopier)

	@Data
	static class AspectCopierRequest {
		Set<JvmTypeReference> aspectRefs
		Set<String> sourceEmfNamespaces
		String targetEmfNamespace
		String targetAspectNamespace
		String targetProjectName
	}

	/**
	 * Copy all aspects following the rules of {@link request}
	 * and returns the set of newly-created aspects' qualified names  
	 */
	def Set<String> copy(Language l, AspectCopierRequest request) {
		val task = Stopwatches.forTask("copying aspects in new type group")
		task.start

		val project = eclipseHelper.getProject(l.eResource)

		if (project === null)
			return null

		val ws = project.workspace.root
		val targetProject = ws.getProject(request.targetProjectName)

		if (targetProject === null)
			return null

		val shader = new DirectoryShader
		val relocators = <Relocator>newArrayList
		val resultFqn = <String>newHashSet
		val targetAspectFolder = targetProject.locationURI.path + "/src-gen/"
		val sourceFolders = <File>newHashSet
		val shadeRequest = new ShadeRequest

		// Visiting the workspace to gather source projects
		ws.accept(new IResourceVisitor {
			override visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					val possibleMatches = request.aspectRefs.map[identifier.replace(".", "/") + ".java"]

					if (possibleMatches.exists[match | resource.locationURI.path.endsWith(match)])
						sourceFolders += new File(resource.project.locationURI.path + "/xtend-gen/")

					return false
				}

				return true
			}
		})

		request.aspectRefs.forEach[aspRef |
			val sourceAspectNamespace = aspRef.identifier.toQualifiedName.skipLast(1).toString
			relocators += new SimpleRelocator(
				sourceAspectNamespace,
				request.targetAspectNamespace,
				null,
				#[]
			)
			resultFqn += '''«request.targetAspectNamespace».«aspRef.simpleName»'''
		]

		request.sourceEmfNamespaces.forEach[fqn |
			relocators += new SimpleRelocator(fqn, request.targetEmfNamespace, null, #[])
		]

		relocators += new SimpleRelocator("org.xtext.activitydiagram.semantics", "fr.inria.diverse.iot.activityecorelualang.aspects", null, #[])
		relocators += new SimpleRelocator("org.xtext.lua.semantics", "fr.inria.diverse.iot.activityecorelualang.aspects", null, #[])

		val filter = new Filter {
			override canFilter(File jar) { return true }
			override finished() {}
			override isFiltered(String classFile) {
				return
				!request.aspectRefs.exists[aspRef |
					val prefix = aspRef.identifier.replaceAll("\\.", "/")
					val targetCls = aspRef.aspectAnnotationValue

					classFile.endsWith('''«prefix».java''')
					|| classFile.endsWith('''«prefix»«targetCls»AspectContext.java''')
					|| classFile.endsWith('''«prefix»«targetCls»AspectProperties.java''')
				]
			}
		}

		shadeRequest.inputFolders = sourceFolders
		shadeRequest.outputFolder = new File(targetAspectFolder)
		shadeRequest.filters = #[filter]
		shadeRequest.resourceTransformers = #[]
		shadeRequest.relocators = relocators

		try {
			log.debug("Copying new aspects for " + l.name)
			shader.shade(shadeRequest)
			targetProject.refreshLocal(IResource::DEPTH_INFINITE, null)

			if (project.name != targetProject.name)
				eclipseHelper.addDependencies(project, #[targetProject.name])
		} catch (Exception e) {
			log.error("Unexpected error while copying aspects to runtime", e)
		} finally {
			task.stop
			log.debug("Done")
		}

		return resultFqn
	}
}
