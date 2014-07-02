package fr.inria.diverse.k3.sle.tests

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace

import fr.inria.diverse.k3.sle.tests.common.K3SLETestHelper
import fr.inria.diverse.k3.sle.tests.common.K3SLETestsInjectorProvider

import fr.inria.diverse.k3.sle.validation.K3SLEValidationConstants

import fr.inria.diverse.k3.tools.xtext.testing.XtextTest

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner

import org.eclipse.xtext.junit4.validation.ValidationTestHelper

import org.junit.Test

import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(K3SLETestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/k3sle/ImplementsTest.k3sle", withValidation = false)
class EditorTest
{
	@Inject extension K3SLETestHelper
	@Inject extension ValidationTestHelper

	@Test
	def testInvalidImplements() {
		root.mm("FsmM").assertError(K3slePackage.eINSTANCE.metamodel, K3SLEValidationConstants.METAMODEL_IMPLEMENTS_ERROR)
	}
}
