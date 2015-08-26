package fr.inria.diverse.melange.tests

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.EcoreMerger
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.diff.DefaultDiffEngine
import org.eclipse.emf.compare.diff.FeatureFilter
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

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
		val res2 = rs.getResource(URI::createURI("tests-inputs/metamodels/Ecore2.ecore"), true)

		receivingEcore = res.contents.head as EPackage
		mergedEcore = res2.contents.head as EPackage => [nsURI = "http://otheruri/"]
	}

	@Test
	def void testPerf() {
//		val startTime = System.nanoTime();    
//		for (i : 1..10) {
//			merger.merge(receivingEcore, mergedEcore)
//		}
//		val estimatedTime = System.nanoTime() - startTime;
//		println("result="+estimatedTime / 1000000f)
//		val startTime2 = System.nanoTime();    
//		for (i : 1..10) {
//			algebra.merge(receivingEcore, mergedEcore)
//		}
//		val estimatedTime2 = System.nanoTime() - startTime2;
//		println("result2="+estimatedTime2 / 1000000f)
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

	@Test
	def void testNotMatchingPackage() {
		mergedEcore.name = "namesNotMatching"
		val resulting = merger.merge(
			newArrayList(Collections.singletonList(receivingEcore)),
			newArrayList(Collections.singletonList(mergedEcore))
		)

		assertNotNull(resulting)
		assertEquals(2, resulting.size)
		val a = resulting.get(0)
		val b = resulting.get(1)
		assertIsValid(a)
		assertIsValid(b)
		assertPkgEquals(a, receivingEcore)
		assertPkgEquals(b, mergedEcore)
	}

	@Test
	def void testConflictingOpposite() {
		mergedEcore.EClassifiers.filter(EClass).findFirst[name == "EClass"] => [
			name = "EClassNotMatching" 
		]

		val resulting = merger.merge(receivingEcore, mergedEcore)
		assertNull(resulting)
		println(merger.conflicts)
	}

	@Test
	def void testMultipleIDs() {
		mergedEcore.EClassifiers.filter(EClass).findFirst[name == "EParameter"].EStructuralFeatures += EcoreFactory.eINSTANCE.createEAttribute => [
			ID = true
			name = "id1"
			EType = EcorePackage.Literals.ESTRING
		]
		mergedEcore.EClassifiers.filter(EClass).findFirst[name == "EParameter"].EStructuralFeatures += EcoreFactory.eINSTANCE.createEAttribute => [
			ID = true
			name = "id2"
			EType = EcorePackage.Literals.ESTRING
		]

		val resulting = merger.merge(receivingEcore, mergedEcore)
		assertNull(resulting)
		println(merger.conflicts)
	}

	@Test
	def void testInvalidSelfMerge() {
		assertNull(merger.merge(receivingEcore, receivingEcore))
	}

	@Test
	def void testInvalidSubpackageMerge1() {
		val res = rs.getResource(URI::createURI("tests-inputs/metamodels/PackagesTest.ecore"), true)
		val pkg = res.contents.head as EPackage
		val subPkg = pkg.ESubpackages.get(1).ESubpackages.head

		assertNull(merger.merge(pkg, subPkg))
	}

	@Test
	def void testInvalidSubpackageMerge2() {
		val res = rs.getResource(URI::createURI("tests-inputs/metamodels/PackagesTest.ecore"), true)
		val pkg = res.contents.head as EPackage
		val subPkg = pkg.ESubpackages.get(1).ESubpackages.head

		assertNull(merger.merge(subPkg, pkg))
	}

	@Test
	def void testInvalidNullMerge1() {
		assertNull(merger.merge(null, mergedEcore))
	}

	@Test
	def void testInvalidNullMerge2() {
		assertNull(merger.merge(receivingEcore, null))
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
