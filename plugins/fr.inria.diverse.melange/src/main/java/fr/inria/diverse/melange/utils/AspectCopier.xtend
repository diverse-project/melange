package fr.inria.diverse.melange.utils

import com.google.common.collect.SetMultimap
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

/**
 * Handles the copy of a {@link Language}'s aspects into its runtime
 * project. Takes care of "type-group-copying" the set of aspects so
 * that they target the appropriate meta-classes (ie. the ones that constitute
 * the syntax of the generated project).
 */
class AspectCopier
{
	@Inject extension AspectExtensions
	@Inject extension IQualifiedNameConverter
	@Inject EclipseProjectHelper eclipseHelper

	private static final Logger log = Logger.getLogger(AspectCopier)

	/**
	 * A request for copying a (set of) aspect(s).
	 */
	@Data
	static class AspectCopierRequest {
		/**
		 * The set of {@link JvmTypeReference}s pointing to the aspects we
		 * want to copy.
		 */
		Set<JvmTypeReference> aspectRefs
		/**
		 * The list of fully qualified names of the different EMF namespaces
		 * that compose the {@link Language}. If the language results from an
		 * assembly, there may be many different namespaces.
		 */
		SetMultimap<String,String> sourceEmfNamespaces
		/**
		 * The target EMF namespace of the {@link Language}, ie. the package
		 * in which the code of its abstract syntax is generated.
		 */
		SetMultimap<String,String> targetEmfNamespace
		/**
		 * The target namespace in which the set of aspects must be copied.
		 */
		String targetAspectNamespace
		/**
		 * The name of the target runtime project.
		 */
		String targetProjectName
	}

	/**
	 * Copy {@code l}'s aspects into its runtime project following the rules
	 * defined in {@code request}.
	 * 
	 * @return The set of newly-created aspects' fully qualified names.  
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
		val sourceAspectNamespaces = newHashSet
		val targetAspectFolder = targetProject.locationURI.path + "/src-gen/"
		val sourceFolders = <File>newHashSet
		val shadeRequest = new ShadeRequest

		// Visiting the workspace to gather source projects
		val aspects2folders = newHashMap
		try {
			ws.accept(new IResourceVisitor {
				override visit(IResource resource) throws CoreException {
					if (resource instanceof IFile) {
						val firstMatch = request.aspectRefs.findFirst[ref|
							val pattern = ref.identifier.replace(".", "/") + ".java"
							resource.locationURI.path.endsWith(pattern)
						]
						if (firstMatch !== null){
							val ressourcePath = resource.locationURI.path
							if(ressourcePath.contains("/xtend-gen/")){
								aspects2folders.put(firstMatch,new File(resource.project.locationURI.path + "/xtend-gen/"))
							}
							else if(ressourcePath.contains("/src-gen/")){
								aspects2folders.put(firstMatch,new File(resource.project.locationURI.path + "/src-gen/"))
							}
						}
	
						return false
					}
	
					return true
				}
			})
		} catch (CoreException e) {
			log.error("Unexpected exception while visiting workspace", e)
		}

		// Ordering source folders
		request.aspectRefs.forEach[ref |
			val File folder = aspects2folders.get(ref)
			if(folder !== null){
				sourceFolders += folder
			}
		]

		request.aspectRefs.forEach[aspRef |
			sourceAspectNamespaces += aspRef.identifier.toQualifiedName.skipLast(1).toString
			resultFqn += '''«request.targetAspectNamespace».«aspRef.simpleName»'''
		]

		request.sourceEmfNamespaces.keySet.forEach[pkgName |
			val sourcePkgFqns = request.sourceEmfNamespaces.get(pkgName)
			val targetPkgFqn = request.targetEmfNamespace.get(pkgName).head
			if(targetPkgFqn !== null){
				sourcePkgFqns.forEach[ sourcePkgFqn |
					relocators += new SimpleRelocator(sourcePkgFqn, targetPkgFqn, null, #[])
				]
			}
		]

		sourceAspectNamespaces.forEach[fqn |
			relocators += new SimpleRelocator(fqn, request.targetAspectNamespace, null, #[])
		]

		val filter = new Filter {
			override canFilter(File jar) { return true }
			override finished() {}
			override isFiltered(String classFile) {
				val aspRef = request.aspectRefs.head
				if(aspRef !== null){
					val prefix = aspRef.identifier.replaceAll("\\.", "/")
					val targetCls = aspRef.simpleAspectAnnotationValue
					return 
						!( classFile.endsWith('''«prefix».java''')
						|| classFile.endsWith('''«prefix»«targetCls»AspectContext.java''')
						|| classFile.endsWith('''«prefix»«targetCls»AspectProperties.java'''))
				}
				else
					return true
			}
		}

		// FIXME: ad-hoc
//		relocators += new SimpleRelocator(
//			"ActivitydiagramFactory",
//			"Iot2Factory",
//			null,
//			#[]
//		)
		shadeRequest.inputFolders = sourceFolders.toList.reverseView.toSet
		shadeRequest.outputFolder = new File(targetAspectFolder)
		shadeRequest.filters = #[filter as Filter]
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
