package fr.inria.diverse.melange.tests

import com.google.inject.Inject

import fr.inria.diverse.k3.tools.xtext.testing.XtextTest

import fr.inria.diverse.melange.ast.ASTHelper

import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider

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

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner

import org.junit.Test

import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/AspectToEcoreTest.melange", withValidation = true)
class AspectToEcoreTest
{
	@Inject extension ASTHelper

	@Test
	def void testSimpleAttributes() {
		val pkg = "SimpleAttributes".aspectPkg
		assertNotNull(pkg)

		assertTrue(pkg.match("SimpleAttributes.ecore"))
	}

	@Test
	def void testAttributesCollections() {
		val pkg = "AttributesCollections".aspectPkg
		assertNotNull(pkg)

		assertTrue(pkg.match("AttributesCollections.ecore"))
	}

	@Test
	def void testSimpleReferences() {
		val pkg = "SimpleReferences".aspectPkg
		assertNotNull(pkg)

		assertTrue(pkg.match("SimpleReferences.ecore"))
	}

	@Test
	def void testReferencesCollections() {
		val pkg = "ReferencesCollections".aspectPkg
		assertNotNull(pkg)

		assertTrue(pkg.match("ReferencesCollections.ecore"))
	}

	@Test
	def void testExternalReferences() {
		val pkg = "ExternalReferences".aspectPkg
		assertNotNull(pkg)

		assertTrue(pkg.match("ExternalReferences.ecore"))
	}

	@Test
	def void testVisibility() {
		val pkg = "Visibility".aspectPkg
		assertNotNull(pkg)

		assertTrue(pkg.match("Visibility.ecore"))
	}

	@Test
	def void testOperations() {
		val pkg = "Operations".aspectPkg
		assertNotNull(pkg)

		assertTrue(pkg.match("Operations.ecore"))
	}

	private def boolean match(EPackage pkg, String refEcore) {
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

		return comparison.differences.empty
	}

	private def EPackage getAspectPkg(String name) {
		return root.metamodels.head.aspects.findFirst[aspectTypeRef.simpleName == name]?.ecoreFragment
	}
}
