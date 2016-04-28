package fr.inria.diverse.melange.tests

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.EcoreMerger
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.Match
import org.eclipse.emf.compare.diff.DefaultDiffEngine
import org.eclipse.emf.compare.diff.FeatureFilter
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
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
	@Inject EcoreMerger merger
	@Inject extension MelangeTestHelper

	@Before
	def void setUp() {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
		receivingEcore = loadModel("tests-inputs/metamodels/Ecore.ecore")
		mergedEcore = loadModel("tests-inputs/metamodels/Ecore2.ecore")
	}

	@Test
	def void testIdenticalMerge() {
		mergedEcore.nsURI = "http://somethingelse"
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
			newHashSet(Collections.singletonList(receivingEcore)),
			newHashSet(Collections.singletonList(mergedEcore))
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
		val merged = getTestInput("ConflictingEClass")
		val resulting = merger.merge(receivingEcore, merged)
		assertNull(resulting)
		val conflicts = merger.conflicts
		assertEquals(2, conflicts.size)
		//FIXME: Conflict message is ugly:
		//"Cannot insert ecore.EClassNotMatching into ecore: The opposite of the opposite may not be a reference different from this one"
	}

	@Test
	def void testMultipleIDs() {
		val id1 = getTestInput("MultipleID1")
		val id2 = getTestInput("MultipleID2")

		val first = merger.merge(receivingEcore, id1)
		val resulting = merger.merge(first, id2)
		assertNull(resulting)
		val conflicts = merger.conflicts
		assertEquals(1, conflicts.size)
		assertEquals("Cannot merge ecore.EClass.id2 with ecore.EClass.eStructuralFeatures: The features 'id1' and 'id2' cannot both be IDs",
			conflicts.get(0).message)
	}

	@Test
	def void testConflictingAttribute() {
		val merged = getTestInput("ConflictingAttribute")
		val resulting = merger.merge(receivingEcore, merged)
		assertNull(resulting)
		val conflicts = merger.conflicts
		assertEquals(1, conflicts.size)
		assertEquals("Cannot merge ecore.EClass.abstract with ecore.EClass.eStructuralFeatures: There may not be two features named 'abstract'",
			conflicts.head.message)
	}

	@Test
	def void testConflictingReference() {
		val merged = getTestInput("ConflictingReference")
		val resulting = merger.merge(receivingEcore, merged)
		assertNull(resulting)
		val conflicts = merger.conflicts
		assertEquals(1, conflicts.size)
		assertEquals("Cannot merge ecore.EClass.eSuperTypes with ecore.EClass.eStructuralFeatures: There may not be two features named 'eSuperTypes'",
			conflicts.head.message)
	}

	@Test
	def void testConflictingContainment() {
		val merged = getTestInput("ConflictingContainment")
		val resulting = merger.merge(receivingEcore, merged)
		assertNull(resulting)
		val conflicts = merger.conflicts
		assertEquals(2, conflicts.size)
		conflicts.forEach[
			assertEquals("Conflicting containment values for reference", message)
		]
	}

	@Test
	def void testConflictingOperation() {
		val merged = getTestInput("ConflictingOperation")
		val resulting = merger.merge(receivingEcore, merged)
		assertNull(resulting)
		val conflicts = merger.conflicts
		assertEquals(1, conflicts.size)
		assertTrue(conflicts.head.message.startsWith("Cannot merge ecore.EClass.getOperationID with ecore.EClass.eOperations: There may not be two operations"))
	}

	@Test
	def void testValidOppositeInsertion() {
		val merged = getTestInput("ValidOpposite")
		val resulting = merger.merge(receivingEcore, merged)
		assertNotNull(resulting)
		assertIsValid(resulting)
		val conflicts = merger.conflicts
		assertTrue(conflicts.empty)
		assertPkgEquals(resulting, getExpected("ValidOpposite"))
	}

	@Test
	def void testAbstractOverride() {
		val merged = getTestInput("AbstractOverride")
		val resulting = merger.merge(receivingEcore, merged)
		assertNotNull(resulting)
		assertEquals(0, merger.conflicts.size)
		assertPkgEquals(resulting, getExpected("AbstractOverride"))
	}

	@Test
	def void testDerivedOverride() {
		val merged = getTestInput("DerivedOverride")
		val resulting = merger.merge(receivingEcore, merged)
		assertNotNull(resulting)
		assertEquals(0, merger.conflicts.size)
		assertPkgEquals(resulting, getExpected("DerivedOverride"))
	}


	@Test
	def void testMultiplicities() {
		val merged = getTestInput("Multiplicities")
		val resulting = merger.merge(receivingEcore, merged)
		assertNotNull(resulting)
		assertEquals(0, merger.conflicts.size)
		assertPkgEquals(resulting, getExpected("Multiplicities"))
	}

	@Test
	def void testSameAttribute() {
		val merged = getTestInput("SameAttribute")
		val resulting = merger.merge(receivingEcore, merged)
		assertNotNull(resulting)
		assertIsValid(resulting)
		assertEquals(0, merger.conflicts.size)
		assertMatch(resulting, getExpected("Ecore"))
	}

	@Test
	def void testValidSuperTypes() {
		val merged = getTestInput("SuperTypes")
		val resulting = merger.merge(receivingEcore, merged)
		assertNotNull(resulting)
		assertIsValid(resulting)
		assertEquals(0, merger.conflicts.size)
		assertPkgEquals(resulting, getExpected("SuperTypes"))
	}

	@Test
	def void testInvalidValidSuperTypes() {
		val merged = getTestInput("InvalidSuperTypes")
		val resulting = merger.merge(receivingEcore, merged)
		assertNull(resulting)
		val conflicts = merger.conflicts
		assertEquals(2, conflicts.size)
		assertEquals("Cannot merge ecore.EClass with ecore.EClassifier.eSuperTypes: A class may not be a super type of itself", conflicts.get(0).message)
		assertEquals("Cannot merge ecore.EOperation with ecore.EModelElement.eSuperTypes: A class may not be a super type of itself", conflicts.get(1).message)
	}

	@Test
	def void testAttachedFsm() {
		val merged = getTestInput("AttachedFsm")
		val resulting = merger.merge(receivingEcore, merged)
		assertNotNull(resulting)
		assertIsValid(resulting)
		assertEquals(0, merger.conflicts.size)
		assertPkgEquals(resulting, getExpected("AttachedFsm"))
	}

	@Test
	def void testInvalidAttachedFsm() {
		val merged = getTestInput("InvalidAttachedFsm")
		val resulting = merger.merge(receivingEcore, merged)
		assertNull(resulting)
		val conflicts = merger.conflicts
		assertEquals(1, merger.conflicts.size)
		assertEquals("Cannot merge ecore.State with ecore.eClassifiers: There may not be two features named 'name'",
			conflicts.head.message)
	}

	@Test
	def void testInvalidSelfMerge() {
		assertNull(merger.merge(receivingEcore, receivingEcore))
	}

	@Test
	def void testInvalidSubpackageMerge1() {
		val pkg = loadModel("tests-inputs/metamodels/PackagesTest.ecore")
		val subPkg = pkg.ESubpackages.get(1).ESubpackages.head

		assertNull(merger.merge(pkg, subPkg))
	}

	@Test
	def void testInvalidSubpackageMerge2() {
		val pkg = loadModel("tests-inputs/metamodels/PackagesTest.ecore")
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

	private def EPackage getTestInput(String name) {
		return loadModel("tests-inputs/metamodels/merge/" + name + ".ecore")
	}

	private def EPackage getExpected(String name) {
		return loadModel("tests-inputs/metamodels/merge/expected/" + name + ".ecore")
	}

	private def EPackage loadModel(String uri) {
		val res = rs.getResource(URI::createURI(uri), true)
		return res.contents.head as EPackage
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

						override boolean isIgnoredReference(Match match, EReference ref) {
							return    ref == EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS
							        || ref == EcorePackage.Literals.EANNOTATION__REFERENCES
							        || super.isIgnoredReference(match, ref)
						}

						override boolean checkForOrderingChanges(EStructuralFeature f) {
							return false
						}
					}
				}
			}
		).build.compare(scope)

		if (!comparison.differences.empty) {
			println(comparison.differences.join("\n"))
			Assert.fail(comparison.differences.join(", "))
		}

		Assert.assertTrue(comparison.differences.empty)
	}
}
