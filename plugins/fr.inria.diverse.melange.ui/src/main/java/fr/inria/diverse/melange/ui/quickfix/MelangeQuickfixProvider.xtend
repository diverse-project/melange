package fr.inria.diverse.melange.ui.quickfix

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.ui.EclipseProjectHelper
import fr.inria.diverse.melange.validation.MelangeValidationConstants
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.xbase.ui.quickfix.XbaseQuickfixProvider

class MelangeQuickfixProvider extends XbaseQuickfixProvider
{
	@Inject extension MetamodelExtensions

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

				// TODO: New project should be added as a MANIFEST dependency
			]
	}
}
