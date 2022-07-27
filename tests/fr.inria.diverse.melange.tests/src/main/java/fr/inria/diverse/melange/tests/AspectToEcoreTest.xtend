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
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.Match
import org.eclipse.emf.compare.diff.DefaultDiffEngine
import org.eclipse.emf.compare.diff.FeatureFilter
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/AspectToEcoreTest.melange", withValidation = true)
class AspectToEcoreTest
{
	@Inject extension ASTHelper
	@Inject extension ModelingElementExtensions
	@Inject extension MelangeTestHelper

	@Test
	def void testSimpleAttributes() {
		val pkg = "SimpleAttributes".aspectPkg
		assertNotNull(pkg)

		assertMatch(pkg, "SimpleAttributes.ecore")
	}

	@Test
	def void testAttributesCollections() {
		val pkg = "AttributesCollections".aspectPkg
		assertNotNull(pkg)

		assertMatch(pkg, "AttributesCollections.ecore")
	}

	@Test
	def void testSimpleReferences() {
		val pkg = "SimpleReferences".aspectPkg
		assertNotNull(pkg)

		assertMatch(pkg, "SimpleReferences.ecore")
	}

	@Test
	def void testReferencesCollections() {
		val pkg = "ReferencesCollections".aspectPkg
		assertNotNull(pkg)

		assertMatch(pkg, "ReferencesCollections.ecore")
	}

	@Test
	def void testExternalReferences() {
		val pkg = "ExternalReferences".aspectPkg
		assertNotNull(pkg)

		assertMatch(pkg, "ExternalReferences.ecore")
	}

	@Test
	def void testVisibility() {
		val pkg = "Visibility".aspectPkg
		assertNotNull(pkg)

		assertMatch(pkg, "Visibility.ecore")
	}

	@Test
	def void testOperations() {
		val pkg = "Operations".aspectPkg
		assertNotNull(pkg)


		assertMatch(pkg, "Operations.ecore")
	}

	@Test
	def void testNoAnnotation() {
		val pkg = "NoAnnotation".aspectPkg
		assertNotNull(pkg)

		assertMatch(pkg, "NoAnnotation.ecore")
	}

	@Test
	def void testResultingPkg() {
		val testPkg = root.languages.head.syntax.pkgs.head

		assertNotNull(testPkg)
		assertIsValid(testPkg)
	}

	@Test
	def void testDependencyBetweenRuntimeConcepts() {
		val testPkg = root.languages.get(1).syntax.pkgs.head

		assertNotNull(testPkg)
		assertIsValid(testPkg)
		assertMatch(testPkg, "DependencyBetweenRuntimeConcepts.ecore")
	}

	private def void assertMatch(EPackage pkg, String refEcore) {
		val rs = new ResourceSetImpl
		val uri = URI::createURI("tests-inputs/aspect-to-ecore/" + refEcore)
		val res = rs.getResource(uri, true)
		val ref = res.contents.head as EPackage

		val scope = new DefaultComparisonScope(pkg, ref, null)
		// We don't want to take order into account
		// We don't want to take eAnnotations (especially "aspect") into account
		val comparison = EMFCompare.builder().setDiffEngine(
			new DefaultDiffEngine() {
				override def FeatureFilter createFeatureFilter() {
					return new FeatureFilter() {
						override boolean isIgnoredReference(Match match, EReference ref) {
							return ref == EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS
							        || super.isIgnoredReference(match, ref)
						}

						override boolean checkForOrderingChanges(EStructuralFeature f) {
							return false
						}
					}
				}
			}
		).build.compare(scope)

		if (!comparison.differences.empty)
			fail(comparison.differences.join(", "))

		assertTrue(comparison.differences.empty)
	}

	private def EPackage getAspectPkg(String name) {
		return root.languages.head.semantics.findFirst[aspectTypeRef.simpleName == name]?.ecoreFragment
	}
}
