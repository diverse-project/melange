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
package fr.inria.diverse.melange.validation

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import org.eclipse.emf.common.util.BasicDiagnostic
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EValidator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.util.internal.Stopwatches
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.validation.impl.ConcreteSyntaxEValidator
import org.eclipse.xtext.xbase.annotations.validation.DerivedStateAwareResourceValidator

/**
 * Custom efficient validation process:
 *   - Don't check derived state (it should be correct by construction)
 *   - Don't check external Aspects/Ecore resources
 *   - Directly dispatch on the MelangeValidator, Diagnostician is too slow
 */
class MelangeLocalResourceValidator extends DerivedStateAwareResourceValidator
{
	@Inject MelangeValidator validator

	// Just get the root (ModelTypingSpace) and validate it
	override validate(Resource resource, CheckMode mode,
		CancelIndicator monitor, IAcceptor<Issue> acceptor) {
		if (monitor.canceled)
			return;

		if (resource.URI.fileExtension == "melange") {
			val task = Stopwatches.forTask(
				"MelangeLocalResourceValidator.validate("+resource.URI+")")
			task.start
			validate(resource, resource.contents.head,
					mode, monitor, acceptor)
			task.stop
		} else
			super.validate(resource, mode, monitor, acceptor)
	}

	override validate(Resource resource, EObject element, CheckMode mode,
		CancelIndicator monitor, IAcceptor<Issue> acceptor) {
		if (monitor.canceled)
			return;
		if (resource.URI.fileExtension == "melange") {
			val diagChain = new BasicDiagnostic
			val context = newHashMap => [
				put(CheckMode::KEY, mode)
				put(ConcreteSyntaxEValidator::DISABLE_CONCRETE_SYNTAX_EVALIDATOR,
					Boolean::TRUE)
				put(typeof(EValidator), validator)
			]

			val i = element.eAllContents
			while (i.hasNext) {
				val obj = i.next

				// Only validate Melange elements
				if (obj.eClass.EPackage == MelangePackage.eINSTANCE)
					validator.validate(obj, diagChain, context)
			}

			if (!diagChain.children.empty)
				diagChain.children.forEach[diag |
					issueFromEValidatorDiagnostic(diag, acceptor)
				]
			else
				issueFromEValidatorDiagnostic(diagChain, acceptor)
		} else
			super.validate(resource, mode, monitor, acceptor)
	}
}
