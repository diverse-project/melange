/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.ui.quickfix

//import com.google.inject.Inject
//import fr.inria.diverse.melange.ast.LanguageExtensions
//import fr.inria.diverse.melange.ast.MetamodelExtensions
//import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
//import fr.inria.diverse.melange.lib.EcoreExtensions
//import fr.inria.diverse.melange.metamodel.melange.Language
//import fr.inria.diverse.melange.metamodel.melange.Metamodel
//import fr.inria.diverse.melange.validation.MelangeValidationConstants
//import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider
//import org.eclipse.xtext.ui.editor.quickfix.Fix
//import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
//import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.xbase.ui.quickfix.XbaseQuickfixProvider

class MelangeQuickfixProvider extends XbaseQuickfixProvider
{
//	@Inject extension LanguageExtensions
//	@Inject extension MetamodelExtensions
//	@Inject extension EcoreExtensions
//	@Inject IJavaProjectProvider projectProvider

//	@Fix(MelangeValidationConstants::METAMODEL_NO_EMF_RUNTIME)
//	def void generateLocalRuntime(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(
//			issue,
//			"Generate EMF Runtime in emf-gen/",
//			"Generate EMF Runtime in emf-gen/",
//			null)[element, context |
//				val mm = element as Metamodel
//				val l = mm.owningLanguage
//
//				l.createLocalEcore
//				l.createLocalGenmodel
//				l.syntax.genmodels.head.generateCode
//
//				// TODO: emf-gen should be added to the current classpath
//				//       and the EPackage should be registered
//			]
//	}
//
//	@Fix(MelangeValidationConstants::METAMODEL_NO_EMF_RUNTIME)
//	def void generateExternalRuntime(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(
//			issue,
//			"Generate EMF Runtime in a new project",
//			"Generate EMF Runtime in a new project",
//			null)[element, context |
//				val mm = element as Metamodel
//				val l = mm.owningLanguage
//
//				EclipseProjectHelper::createEMFRuntimeProject(l.externalRuntimeName, l)
//				l.createExternalEcore
//				l.createExternalGenmodel
//				l.createExternalAspects
//				l.syntax.genmodels.head.generateCode
//
//				val rs = l.eResource.resourceSet
//				val project = projectProvider.getJavaProject(rs).project
//				EclipseProjectHelper::addDependencies(project, #[l.externalRuntimeName])
//			]
//	}
}
