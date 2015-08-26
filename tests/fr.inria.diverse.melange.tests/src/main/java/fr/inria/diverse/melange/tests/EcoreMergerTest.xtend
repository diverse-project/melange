package fr.inria.diverse.melange.tests

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.EcoreMerger
import fr.inria.diverse.melange.lib.EcoreMergerException
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.diff.DefaultDiffEngine
import org.eclipse.emf.compare.diff.FeatureFilter
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
class EcoreMergerTest
{
	ResourceSet rs = new ResourceSetImpl
	EPackage receivingEcore
	EPackage mergedEcore
	@Inject EcoreMerger merger
	@Inject extension MelangeTestHelper

	@Before
	def void setUp() {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
		val res = rs.getResource(URI::createURI("tests-inputs/metamodels/Ecore.ecore"), true)
		val ecorePkg = res.contents.head as EPackage

		receivingEcore = EcoreUtil::copy(ecorePkg)
		mergedEcore = EcoreUtil::copy(ecorePkg) => [nsURI = "http://otheruri/"]
	}

	@Test(expected = EcoreMergerException)
	def void testInvalidSelfMerge() {
		merger.merge(receivingEcore, receivingEcore)
	}

	@Test(expected = EcoreMergerException)
	def void testInvalidSubpackageMerge1() {
		val res = rs.getResource(URI::createURI("tests-inputs/metamodels/PackagesTest.ecore"), true)
		val pkg = res.contents.head as EPackage
		val subPkg = pkg.ESubpackages.get(1).ESubpackages.head

		merger.merge(pkg, subPkg)
	}

	@Test(expected = EcoreMergerException)
	def void testInvalidSubpackageMerge2() {
		val res = rs.getResource(URI::createURI("tests-inputs/metamodels/PackagesTest.ecore"), true)
		val pkg = res.contents.head as EPackage
		val subPkg = pkg.ESubpackages.get(1).ESubpackages.head

		merger.merge(subPkg, pkg)
	}

	@Test
	def void testIdenticalMerge() {
		val resulting1 = merger.merge(receivingEcore, mergedEcore)
		val resulting2 = merger.merge(mergedEcore, receivingEcore)

		assertIsValid(resulting1)
		assertIsValid(resulting2)
		assertPkgEquals(resulting1, resulting2, false)
		assertPkgEquals(receivingEcore, resulting1)
		assertPkgEquals(mergedEcore, resulting1, false)
	}

	private def void assertPkgEquals(EPackage pkgA, EPackage pkgB) {
		assertPkgEquals(pkgA, pkgB, true)
	}

	private def void assertPkgEquals(EPackage pkgA, EPackage pkgB, boolean matchUri) {
		val scope = new DefaultComparisonScope(pkgA, pkgB, null)
		// We don't want to take order into account
		// if matchUri = false, we don't care about package URIs
		val comparison = EMFCompare.builder().setDiffEngine(
			new DefaultDiffEngine() {
				override def FeatureFilter createFeatureFilter() {
					return new FeatureFilter() {
						override boolean isIgnoredAttribute(EAttribute attr) {
							return (if (!matchUri) attr == EcorePackage.Literals.EPACKAGE__NS_URI else false)
							        || super.isIgnoredAttribute(attr)
						}

						override boolean checkForOrderingChanges(EStructuralFeature f) {
							return false
						}
					}
				}
			}
		).build.compare(scope)

		if (!comparison.differences.empty)
			Assert.fail(comparison.differences.join(", "))

		Assert.assertTrue(comparison.differences.empty)
	}
}
