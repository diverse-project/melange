package fr.inria.diverse.k3.sle.tests

import fr.inria.diverse.k3.sle.K3SLEInjectorProvider

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner

import org.junit.Test

import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(K3SLEInjectorProvider)
class StubTest {
	@Test
	def testStubTest() {
		assertTrue(true)
	}
}
