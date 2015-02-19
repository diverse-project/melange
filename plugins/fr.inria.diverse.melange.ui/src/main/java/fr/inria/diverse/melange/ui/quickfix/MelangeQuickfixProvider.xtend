package fr.inria.diverse.melange.ui.quickfix

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.validation.MelangeValidationConstants
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.xbase.ui.quickfix.XbaseQuickfixProvider

class MelangeQuickfixProvider extends XbaseQuickfixProvider
{
	@Inject extension MetamodelExtensions
	@Inject extension IQualifiedNameConverter
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

				EclipseProjectHelper::createEMFRuntimeProject(mm)
				mm.createExternalEcore
				mm.createExternalGenmodel
				mm.genmodels.head.generateCode

				val rs = mm.eResource.resourceSet
				val project = projectProvider.getJavaProject(rs).project
				EclipseProjectHelper::addDependencies(project, #[mm.externalRuntimeName])
			]
	}
}
