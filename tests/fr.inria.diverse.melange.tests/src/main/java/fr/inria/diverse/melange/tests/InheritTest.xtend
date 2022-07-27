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
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/InheritTest.melange")
class InheritanceTest
{
	@Inject MatchingHelper helper
	@Inject extension ModelingElementExtensions
	@Inject extension LanguageExtensions
	
	@Test
	def void testPackagesSelfMatching() {
		val packagesPkg1 = "tests-inputs/metamodels/merge/MM1.ecore".loadEcore
		assertTrue(packagesPkg1.simpleMatch(MM1.exactType.pkgs.head))

		val packagesPkg2 = "tests-inputs/metamodels/merge/MM2.ecore".loadEcore
		assertTrue(packagesPkg2.simpleMatch(MM2.exactType.pkgs.head))
	}
	
	@Test
	def void testSimpleInherit() {
		assertTrue(MM1.implements.contains(subMM1.exactType))
		assertTrue(subMM1.implements.contains(MM1.exactType))
		assertTrue(subMM1.superLanguages.contains(MM1))
		
		assertTrue(MM2.implements.contains(subMM2.exactType))
		assertTrue(subMM2.implements.contains(MM2.exactType))
		assertTrue(subMM2.superLanguages.contains(MM2))
	}
	
	@Test
	def void testMultiInherit(){
		assertTrue(subMM1MM2.implements.contains(MM1.exactType))
		assertTrue(subMM1MM2.implements.contains(MM2.exactType))
		
		assertTrue(subMM1MM2.superLanguages.contains(MM1))
		assertTrue(subMM1MM2.superLanguages.contains(MM2))
	}
	
	@Test
	def void testInheritSlices(){
		assertTrue(sliceInherit.implements.contains(sliceMM1.exactType))
		assertTrue(sliceInherit.implements.contains(sliceMM2.exactType))
		assertTrue(sliceInherit.superLanguages.contains(sliceMM1))
		assertTrue(sliceInherit.superLanguages.contains(sliceMM2))
		
		assertTrue(sliceInherit.implements.contains(sliceMerge.exactType))
		assertTrue(sliceMerge.implements.contains(sliceInherit.exactType))
	}
	
	private def EPackage loadEcore(String uri) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI.createURI(uri), true)

		return res.contents.head as EPackage
	}
	
	private def boolean simpleMatch(EPackage pkgA, EPackage pkgB) {
		return helper.match(Collections.singletonList(pkgA), Collections.singletonList(pkgB), null)
	}
	
	def Language getMM1()       { return root.elements.get(0) as Language }
	def Language getMM2()       { return root.elements.get(1) as Language }
	def Language getSubMM1()    { return root.elements.get(2) as Language }
	def Language getSubMM2()    { return root.elements.get(3) as Language }
	def Language getSubMM1MM2() { return root.elements.get(4) as Language }
	def Language getMergeLang() { return root.elements.get(5) as Language }
	def Language getSliceMM1()  { return root.elements.get(6) as Language }
	def Language getSliceMM2()  { return root.elements.get(7) as Language }
	def Language getSliceInherit(){ return root.elements.get(8) as Language }
	def Language getSliceMerge(){ return root.elements.get(9) as Language }
	
}