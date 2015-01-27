package fr.inria.diverse.melange.ui.quickfix

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.ui.EclipseProjectHelper
import fr.inria.diverse.melange.validation.MelangeValidationConstants
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.OutputStream
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.util.MergeableManifest
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.xbase.ui.quickfix.XbaseQuickfixProvider

class MelangeQuickfixProvider extends XbaseQuickfixProvider
{
	@Inject extension MetamodelExtensions
	@Inject IJavaProjectProvider projectProvider

	@Fix(MelangeValidationConstants::METAMODEL_NO_EMF_RUNTIME)
	def void generateLocalRuntime(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue,
			"Generate EMF Runtime in emf-gen/",
			"Generate EMF Runtime in emf-gen/",
			null)[element, context |
				val mm = element as Metamodel

				mm.createLocalEcore
				mm.createLocalGenmodel
				mm.genmodels.head.generateCode

				// TODO: emf-gen should be added to the current classpath
				//       and the EPackage should be registered
			]
	}

	@Fix(MelangeValidationConstants::METAMODEL_NO_EMF_RUNTIME)
	def void generateExternalRuntime(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue,
			"Generate EMF Runtime in a new project",
			"Generate EMF Runtime in a new project",
			null)[element, context |
				val mm = element as Metamodel

				EclipseProjectHelper::createEMFRuntimeProject(mm.externalRuntimeName)
				mm.createExternalEcore
				mm.createExternalGenmodel
				mm.genmodels.head.generateCode

				val rs = mm.eResource.resourceSet
				val project = projectProvider.getJavaProject(rs).project
				println("javaP="+project)

				val manifestFile = project.getFile("META-INF/MANIFEST.MF")

				if (manifestFile !== null
					&& manifestFile.exists
					&& manifestFile.accessible
					&& !manifestFile.resourceAttributes.readOnly
				) {
					var OutputStream output = null
					var InputStream input = null
					try {
						input = manifestFile.contents
						val manifest = new MergeableManifest(input)
						manifest.addRequiredBundles(#{mm.externalRuntimeName})
						val out = new ByteArrayOutputStream
						output = new BufferedOutputStream(out)
						manifest.write(output)
						val in = new ByteArrayInputStream(out.toByteArray)
						input = new BufferedInputStream(in)
						manifestFile.setContents(input, true, true, null)
					} finally {
						if (output !== null)
							output.close
						if (input !== null)
							input.close
					}
				}
			]
	}
}
