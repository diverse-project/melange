package fr.inria.diverse.melange.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import org.junit.Test
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import fr.inria.diverse.melange.lib.MatchingHelper
import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import java.util.Collections
import static org.junit.Assert.*
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.impl.EcorePackageImpl
import org.eclipse.emf.ecore.EcorePackage

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/TransitiveAspectTest.melange")
class TransitiveAspectTest
{
	@Inject MatchingHelper helper
	@Inject extension ModelingElementExtensions
	
	@Test
	def void testSimpleAspect(){
		assertNotNull(operationTest_SuperLang)
		assertNotNull(attributesTest_SuperLang)
		assertNotNull(operationTest_SuperLang.EReferences.exists[name == "addedReference"])
		assertEquals(attributesTest_SuperLang, operationTest_SuperLang.EReferences.findFirst[name == "addedReference"].EType)
	}
	
	@Test
	def void testInheritOverride(){
		assertNotNull(operationTest_Lang)
		assertNotNull(referencesTest_Lang)
		assertNotNull(operationTest_Lang.EReferences.exists[name == "addedReference"])
		assertEquals(referencesTest_Lang, operationTest_Lang.EReferences.findFirst[name == "addedReference"].EType)
	}
	
	@Test
	def void testInheritOverrideAgain(){
		assertNotNull(operationTest_SubLang)
		assertNotNull(multipleSuperTest_SubLang)
		assertNotNull(operationTest_SubLang.EReferences.exists[name == "addedReference"])
		assertEquals(multipleSuperTest_SubLang, operationTest_SubLang.EReferences.findFirst[name == "addedReference"].EType)
	}
	
	@Test
	def void testSimpleAspectOther(){
		assertNotNull(operationTest_MergeLang)
		assertNotNull(referencesTest_MergeLang)
		assertNotNull(operationTest_MergeLang.EReferences.exists[name == "addedReference"])
		assertEquals(referencesTest_MergeLang, operationTest_MergeLang.EReferences.findFirst[name == "addedReference"].EType)
		
		assertNotNull(interfaceTest_MergeLang)
		assertNotNull(genericTest_MergeLang)
		assertNotNull(interfaceTest_MergeLang.EReferences.exists[name == "addedReference"])
		assertEquals(genericTest_MergeLang, interfaceTest_MergeLang.EReferences.findFirst[name == "addedReference"].EType)
	}
	
	@Test
	def void testInheritOverrideOther(){
		
	}
	
	def void testMerge(){
		
	}
	
	
	@Test
	def void testMergeOverride(){
		//TODO
	}
	
	@Test
	def void testMergeInheritOverriding(){
		//TODO
	}
	
	@Test
	def void testSliceInheritOverriding(){
		//TODO
	}
	
	@Test
	def void testMergeSliceInheritOverriding(){
		//TODO
	}
	
	
	def Metamodel getSuperLang()     { return root.elements.get(0) as Metamodel }
	def Metamodel getLang()          { return root.elements.get(1) as Metamodel }
	def Metamodel getSubLang()       { return root.elements.get(2) as Metamodel }
	def Metamodel getOtherLang()     { return root.elements.get(3) as Metamodel }
	def Metamodel getSubOtherLang()  { return root.elements.get(4) as Metamodel }
	def Metamodel getMergeLang()     { return root.elements.get(5) as Metamodel }
	
	def EClass getOperationTest_SuperLang() {return superLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_Lang()      {return lang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_SubLang()   {return subLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_MergeLang()   {return mergeLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	
	def EClass getAttributesTest_SuperLang() {return superLang.pkgs.get(0).EClassifiers.findFirst[name == "AttributesTest"] as EClass}
	def EClass getReferencesTest_Lang()      {return lang.pkgs.get(0).EClassifiers.findFirst[name == "ReferencesTest"] as EClass}
	def EClass getMultipleSuperTest_SubLang(){return subLang.pkgs.get(0).EClassifiers.findFirst[name == "MultipleSuperTest"] as EClass}
	def EClass getReferencesTest_MergeLang()      {return mergeLang.pkgs.get(0).EClassifiers.findFirst[name == "ReferencesTest"] as EClass}
	
	def EClass getInterfaceTest_OtherLang()    {return otherLang.pkgs.get(0).EClassifiers.findFirst[name == "InterfaceTest"] as EClass}
	def EClass getInterfaceTest_SubOtherLang() {return subOtherLang.pkgs.get(0).EClassifiers.findFirst[name == "InterfaceTest"] as EClass}
	def EClass getInterfaceTest_MergeLang() {return mergeLang.pkgs.get(0).EClassifiers.findFirst[name == "InterfaceTest"] as EClass}
	
	def EClass getGenericTest_MergeLang() {return mergeLang.pkgs.get(0).EClassifiers.findFirst[name == "GenericTest"] as EClass}
	
}