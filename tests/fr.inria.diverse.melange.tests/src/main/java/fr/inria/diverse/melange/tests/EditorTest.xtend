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
package fr.inria.diverse.melange.tests

import com.google.inject.Inject

import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider

import fr.inria.diverse.melange.validation.MelangeValidationConstants

import fr.inria.diverse.melange.tools.xtext.testing.XtextTest

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner

import org.eclipse.xtext.junit4.validation.ValidationTestHelper

import org.junit.Test

import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/ImplementsTest.melange", withValidation = false)
class EditorTest
{
	@Inject extension MelangeTestHelper

	@Test
	def void testInvalidImplements() {
		root.l("FsmM").assertError(MelangePackage.eINSTANCE.language, MelangeValidationConstants.METAMODEL_IMPLEMENTS_ERROR)
	}
}
