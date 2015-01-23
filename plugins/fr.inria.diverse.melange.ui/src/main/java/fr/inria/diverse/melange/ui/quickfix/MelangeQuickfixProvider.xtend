package fr.inria.diverse.melange.ui.quickfix

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.MetamodelExtensions

import fr.inria.diverse.melange.metamodel.melange.Metamodel

import fr.inria.diverse.melange.validation.MelangeValidationConstants

import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor

import org.eclipse.xtext.validation.Issue

import org.eclipse.xtext.xbase.ui.quickfix.XbaseQuickfixProvider

class MelangeQuickfixProvider extends XbaseQuickfixProvider
{
	@Inject extension MetamodelExtensions

	@Fix(MelangeValidationConstants::METAMODEL_NO_EMF_RUNTIME)
	def void generateRuntime(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue,
			"Generate EMF Runtime",
			"Generate EMF Runtime",
			null)[element, context |
				val mm = element as Metamodel
				mm.genmodels.forEach[generateCode]
			]
	}
}
