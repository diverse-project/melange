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
import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
class MatchingTest
{
	@Inject MatchingHelper helper
	// Since we use it as main test data
	EPackage ecorePkg
	EPackage otherPkg

	@Before
	def void setUp() {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put(
			"ecore", new EcoreResourceFactoryImpl
		)

		ecorePkg = "tests-inputs/metamodels/Ecore.ecore".loadEcore
		otherPkg = "tests-inputs/metamodels/Ecore.ecore".loadEcore
	}

	@Test
	def void testEcoreSelfMatching() {
		assertTrue(ecorePkg.simpleMatch(ecorePkg))
	}

	@Test
	def void testPackagesSelfMatching() {
		val packagesPkg = "tests-inputs/metamodels/PackagesTest.ecore".loadEcore

		assertTrue(packagesPkg.simpleMatch(packagesPkg))
	}

	@Test
	def void testExhaustiveSelfMatching() {
		val exhaustivePkg = "tests-inputs/metamodels/Exhaustive.ecore".loadEcore

		assertTrue(exhaustivePkg.simpleMatch(exhaustivePkg))
	}

	@Test
	def void testValidMatching1() {
		val fsmPkg =  "tests-inputs/metamodels/FSM.ecore".loadEcore
		val tfsmPkg = "tests-inputs/metamodels/TimedFSM.ecore".loadEcore

		assertFalse(fsmPkg.simpleMatch(tfsmPkg))
		assertTrue(tfsmPkg.simpleMatch(fsmPkg))
	}

	@Test
	def void testSelfCycleMatching() {
		val cyclePkg = "tests-inputs/metamodels/matching/Cycle.ecore".loadEcore

		assertTrue(cyclePkg.simpleMatch(cyclePkg))
	}

	@Test
	def void testSubCycleMatching() {
		val cyclePkg = "tests-inputs/metamodels/matching/Cycle.ecore".loadEcore
		val subcyclePkg = "tests-inputs/metamodels/matching/SubCycle.ecore".loadEcore

		assertFalse(cyclePkg.simpleMatch(subcyclePkg))
		assertTrue(subcyclePkg.simpleMatch(cyclePkg))
	}

	@Test
	def void testInvalidSubCycleMatching() {
		val cyclePkg = "tests-inputs/metamodels/matching/Cycle.ecore".loadEcore
		val subcyclePkg = "tests-inputs/metamodels/matching/SubCycle.ecore".loadEcore
		val bCls = cyclePkg.EClassifiers.findFirst[name == "B"] as EClass
		val myARef = bCls.EStructuralFeatures.findFirst[name == "myA"]

		myARef.EType = bCls

		assertFalse(cyclePkg.simpleMatch(subcyclePkg))
		assertFalse(subcyclePkg.simpleMatch(cyclePkg))
	}

	@Test
	def void testInvalidRef() {
		val refCls = otherPkg.EClassifiers.findFirst[name == "EReference"] as EClass
		val opRef = refCls.EReferences.findFirst[name == "eOpposite"]

		opRef.EType = otherPkg.EClassifiers.findFirst[name == "EClass"]

		assertFalse(ecorePkg.simpleMatch(otherPkg))
		assertFalse(otherPkg.simpleMatch(ecorePkg))
	}

	@Test
	def void testEquivalentDatatypes1() {
		val namedCls = otherPkg.EClassifiers.findFirst[name == "ENamedElement"] as EClass
		val nameAttr = namedCls.EAttributes.findFirst[name == "name"]
		val oldDt = nameAttr.EType
		val newDt = EcoreFactory.eINSTANCE.createEDataType => [
			name = "MyString"
			instanceTypeName = "java.lang.String"
			serializable = true
		]
		otherPkg.EClassifiers += newDt

		nameAttr.EType = newDt

		assertTrue(ecorePkg.simpleMatch(otherPkg))
		assertTrue(otherPkg.simpleMatch(ecorePkg))

		nameAttr.EType = oldDt

		assertTrue(ecorePkg.simpleMatch(otherPkg))
		assertTrue(otherPkg.simpleMatch(ecorePkg))
	}

	@Test
	def void testEquivalentDatatypes2() {
		val namedCls = otherPkg.EClassifiers.findFirst[name == "ENamedElement"] as EClass
		val nameAttr = namedCls.EAttributes.findFirst[name == "name"]
		val oldDt = nameAttr.EType
		val newDt = EcoreFactory.eINSTANCE.createEDataType => [
			name = "MyString"
			instanceClassName = "java.lang.String"
			serializable = true
		]
		otherPkg.EClassifiers += newDt

		nameAttr.EType = newDt

		assertTrue(ecorePkg.simpleMatch(otherPkg))
		assertTrue(otherPkg.simpleMatch(ecorePkg))

		nameAttr.EType = oldDt

		assertTrue(ecorePkg.simpleMatch(otherPkg))
		assertTrue(otherPkg.simpleMatch(ecorePkg))
	}

	@Test
	def void testDifferentDatatypes1() {
		val namedCls = otherPkg.EClassifiers.findFirst[name == "ENamedElement"] as EClass
		val nameAttr = namedCls.EAttributes.findFirst[name == "name"]

		nameAttr.EType = otherPkg.EClassifiers.findFirst[name == "EInt"]

		assertFalse(ecorePkg.simpleMatch(otherPkg))
		assertFalse(otherPkg.simpleMatch(ecorePkg))
	}

	@Test
	def void testDifferentDatatypes2() {
		val stringDt = otherPkg.EClassifiers.findFirst[name == "EString"] as EDataType

		stringDt.instanceTypeName = "java.lang.Integer"

		assertFalse(ecorePkg.simpleMatch(otherPkg))
		assertFalse(otherPkg.simpleMatch(ecorePkg))
	}

	@Test
	def void testDifferentDatatypes3() {
		val stringDt = otherPkg.EClassifiers.findFirst[name == "EString"] as EDataType

		stringDt.instanceClassName = "java.lang.Integer"

		assertFalse(ecorePkg.simpleMatch(otherPkg))
		assertFalse(otherPkg.simpleMatch(ecorePkg))
	}

	@Test
	def void testEquivalentEnums() {
		val attrCls1 = ecorePkg.EClassifiers.findFirst[name == "EAttribute"] as EClass
		val attrCls2 = otherPkg.EClassifiers.findFirst[name == "EAttribute"] as EClass
		val enum1 = EcoreFactory.eINSTANCE.createEEnum => [
			name = "MyEnum"
		]
		val enum2 = EcoreFactory.eINSTANCE.createEEnum => [
			name = "MyEnum"
		]

		ecorePkg.EClassifiers += enum1
		otherPkg.EClassifiers += enum2

		val newAttr1 = EcoreFactory.eINSTANCE.createEAttribute => [
			name = "myAttr"
			EType = ecorePkg.EClassifiers.findFirst[name == "EString"]
		]
		val newAttr2 = EcoreFactory.eINSTANCE.createEAttribute => [
			name = "myAttr"
			EType = otherPkg.EClassifiers.findFirst[name == "EString"]
		]

		attrCls1.EStructuralFeatures += newAttr1
		attrCls2.EStructuralFeatures += newAttr2

		assertTrue(ecorePkg.simpleMatch(otherPkg))
		assertTrue(otherPkg.simpleMatch(ecorePkg))
	}

	@Test
	def void testDifferentEnums() {
		val attrCls1 = ecorePkg.EClassifiers.findFirst[name == "EAttribute"] as EClass
		val attrCls2 = otherPkg.EClassifiers.findFirst[name == "EAttribute"] as EClass
		val enum1 = EcoreFactory.eINSTANCE.createEEnum => [
			name = "MyEnum"
		]
		val enum2 = EcoreFactory.eINSTANCE.createEEnum => [
			name = "MyOtherEnum"
		]

		ecorePkg.EClassifiers += enum1
		otherPkg.EClassifiers += enum2

		val newAttr1 = EcoreFactory.eINSTANCE.createEAttribute => [
			name = "myAttr"
			EType = enum1
		]
		val newAttr2 = EcoreFactory.eINSTANCE.createEAttribute => [
			name = "myAttr"
			EType = enum2
		]

		attrCls1.EStructuralFeatures += newAttr1
		attrCls2.EStructuralFeatures += newAttr2

		assertFalse(ecorePkg.simpleMatch(otherPkg))
		assertFalse(otherPkg.simpleMatch(ecorePkg))
	}

	@Test
	def void testReferenceMultiplicites() {
		val fsmPkg = "tests-inputs/metamodels/FSM.ecore".loadEcore
		val otherPkg = "tests-inputs/metamodels/FSM.ecore".loadEcore
		val stateCls = otherPkg.EClassifiers.findFirst[name == "State"] as EClass
		val outgoingRef = stateCls.EReferences.findFirst[name == "outgoingTransition"]

		assertTrue(fsmPkg.simpleMatch(otherPkg))
		assertTrue(otherPkg.simpleMatch(fsmPkg))

		// Initial multiplicies are 0..*
		outgoingRef.lowerBound = 1
		assertFalse(otherPkg.simpleMatch(fsmPkg))

		outgoingRef.lowerBound = 0
		outgoingRef.upperBound = 1
		assertFalse(otherPkg.simpleMatch(fsmPkg))

		outgoingRef.upperBound = 5
		assertFalse(otherPkg.simpleMatch(fsmPkg))

		outgoingRef.upperBound = -1
		assertTrue(otherPkg.simpleMatch(fsmPkg))
	}

	@Test
	def void testAttributeMultiplicites() {
		val fsmPkg = "tests-inputs/metamodels/FSM.ecore".loadEcore
		val otherPkg = "tests-inputs/metamodels/FSM.ecore".loadEcore
		val stateCls = otherPkg.EClassifiers.findFirst[name == "State"] as EClass
		val nameAttr = stateCls.EAttributes.findFirst[name == "name"]

		assertTrue(fsmPkg.simpleMatch(otherPkg))
		assertTrue(otherPkg.simpleMatch(fsmPkg))

		// Initial multiplicies are 0..1
		nameAttr.lowerBound = 1
		assertFalse(otherPkg.simpleMatch(fsmPkg))

		nameAttr.lowerBound = 0
		nameAttr.upperBound = 2
		assertFalse(otherPkg.simpleMatch(fsmPkg))

		nameAttr.upperBound = -1
		assertFalse(otherPkg.simpleMatch(fsmPkg))
	}

	private def EPackage loadEcore(String uri) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI.createURI(uri), true)

		return res.contents.head as EPackage
	}

	private def boolean simpleMatch(EPackage pkgA, EPackage pkgB) {
		return helper.match(Collections.singletonList(pkgA), Collections.singletonList(pkgB), null)
	}
}
