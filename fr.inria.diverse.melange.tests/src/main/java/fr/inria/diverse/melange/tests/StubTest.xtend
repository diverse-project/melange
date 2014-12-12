package fr.inria.diverse.melange.tests

import fr.inria.diverse.melange.MelangeInjectorProvider

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner

import org.junit.Test

import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeInjectorProvider)
class StubTest {
	@Test
	def testStubTest() {
		assertTrue(true)
	}
}
