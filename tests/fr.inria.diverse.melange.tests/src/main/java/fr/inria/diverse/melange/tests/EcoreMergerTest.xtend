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
import org.junit.Ignore
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
	val ecoreFactory = EcoreFactory.eINSTANCE
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

	@Ignore("This is a bit tricky, every reference to EClass is now broken")
	@Test
	def void testPleaseConsiderMeLaterThankYou() {
		mergedEcore.EClassifiers.filter(EClass)
		.findFirst[name == "EClass"] => [
			name = "EClassNotMatching" 
		]

		println("---")
		val resulting = merger.merge(receivingEcore, mergedEcore)
		println("---")
		assertNull(resulting)
		val conflicts = merger.conflicts
		println(conflicts)
		assertEquals(2, conflicts.size)
		//FIXME: Conflict message is ugly:
		//"Cannot insert ecore.EClassNotMatching into ecore: The opposite of the opposite may not be a reference different from this one"
	}

	@Test
	def void testMultipleIDs() {
		mergedEcore.EClassifiers.filter(EClass)
		.findFirst[name == "EParameter"]
		.EStructuralFeatures +=
			ecoreFactory.createEAttribute => [
				ID = true
				name = "id1"
				EType = EcorePackage.Literals.ESTRING
			]
		mergedEcore.EClassifiers.filter(EClass)
		.findFirst[name == "EParameter"]
		.EStructuralFeatures +=
			ecoreFactory.createEAttribute => [
				ID = true
				name = "id2"
				EType = EcorePackage.Literals.ESTRING
			]

		val resulting = merger.merge(receivingEcore, mergedEcore)
		assertNull(resulting)
		val conflicts = merger.conflicts
		assertEquals(2, conflicts.size)
		assertEquals("Cannot merge ecore.EParameter.id1 with ecore.EParameter: The features 'id1' and 'id2' cannot both be IDs",
			conflicts.get(0).message)
		assertEquals("Cannot merge ecore.EParameter.id2 with ecore.EParameter: The features 'id1' and 'id2' cannot both be IDs",
			conflicts.get(1).message)
	}

	@Test
	def void testConflictingAttribute() {
		val merged = dummyEcorePackage
		merged.EClassifiers.filter(EClass)
		.findFirst[name == "EClass"]
		.EStructuralFeatures += ecoreFactory.createEAttribute => [
			name = "abstract"
			EType = EcorePackage.Literals.ESTRING
		]

		val resulting = merger.merge(receivingEcore, merged)
		saveResulting(resulting)
		assertNull(resulting)
		val conflicts = merger.conflicts
		assertEquals(1, conflicts.size)
		assertEquals("Cannot merge ecore.EClass.abstract with ecore.EClass: There may not be two features named 'abstract'",
			conflicts.head.message)
	}

	@Test
	def void testConflictingReference() {
		val merged = dummyEcorePackage
		val attrCls = ecoreFactory.createEClass => [name = "EAttribute"]
		merged.EClassifiers += attrCls
		merged.EClassifiers.filter(EClass)
		.findFirst[name == "EClass"]
		.EStructuralFeatures += ecoreFactory.createEReference => [
			name = "eSuperTypes"
			EType = attrCls
			upperBound = -1
		]

		val resulting = merger.merge(receivingEcore, merged)
		assertNull(resulting)
		val conflicts = merger.conflicts
		assertEquals(1, conflicts.size)
		assertEquals("Cannot merge ecore.EClass.eSuperTypes with ecore.EClass: There may not be two features named 'eSuperTypes'",
			conflicts.head.message)
	}

	@Test
	def void testConflictingContainment() {
		
	}

	@Test
	def void testConflictingOperation() {
		val merged = dummyEcorePackage
		val opCls = ecoreFactory.createEClass => [name = "EOperation"]
		merged.EClassifiers += opCls
		merged.EClassifiers.filter(EClass)
		.findFirst[name == "EClass"]
		.EOperations += ecoreFactory.createEOperation => [
			name = "getOperationID"
			EType = EcorePackage.Literals.ESTRING
			EParameters += ecoreFactory.createEParameter => [
				name = "nonRelevant"
				EType = opCls
			]
		]

		val resulting = merger.merge(receivingEcore, merged)
		assertNull(resulting)
		val conflicts = merger.conflicts
		assertEquals(1, conflicts.size)
		println(conflicts)
		assertTrue(conflicts.head.message.startsWith("Cannot merge ecore.EClass.getOperationID with ecore.EClass: There may not be two operations"))
	}

	@Test
	def void testValidOppositeInsertion() {
		val merged = dummyEcorePackage
		val clsCls = merged.EClassifiers.filter(EClass).findFirst[name == "EClass"]
		val newRef = ecoreFactory.createEReference => [
			name = "myClasses"
			containment = true
			EType = clsCls
			upperBound = -1
		]
		val pkgCls = ecoreFactory.createEClass => [
			name = "EPackage"
			EStructuralFeatures += newRef
		]
		merged.EClassifiers += pkgCls
		val newRef2 = ecoreFactory.createEReference => [
			name = "validOpposite"
			containment = false
			EType = pkgCls
			EOpposite = newRef
			upperBound = 1
		]
		clsCls.EStructuralFeatures += newRef2
		newRef.EOpposite = newRef2
		
		val resulting = merger.merge(receivingEcore, merged)
		assertNotNull(resulting)
		assertIsValid(resulting)
		val conflicts = merger.conflicts
		assertTrue(conflicts.empty)
		assertTrue(resulting.EClassifiers.filter(EClass).findFirst[name == "EClass"].EStructuralFeatures.exists[name == "validOpposite"])
		assertTrue(resulting.EClassifiers.filter(EClass).findFirst[name == "EPackage"].EStructuralFeatures.exists[name == "myClasses"])
	}

	@Test
	def void testSameAttribute() {
		val merged = dummyEcorePackage
		merged.EClassifiers.filter(EClass)
		.findFirst[name == "EClass"]
		.EStructuralFeatures += ecoreFactory.createEAttribute => [
			name = "abstract"
			EType = EcorePackage.Literals.EBOOLEAN
		]

		val resulting = merger.merge(receivingEcore, merged)
		assertNotNull(resulting)
		assertIsValid(resulting)
		assertEquals(0, merger.conflicts.size)
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

	private def EPackage getDummyEcorePackage() {
		return ecoreFactory.createEPackage => [
			name = "ecore"
			nsPrefix=  "ecore"
			nsURI = "http://dummyecore/"

			EClassifiers += ecoreFactory.createEClass => [
				name = "EClass"
			]
		]
	}

	private def void saveResulting(EPackage pkg) {
		if (pkg !== null) {
			val res = rs.createResource(URI::createURI("Resulting.ecore"))
			res.contents += pkg
			res.save(null)
		}
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
