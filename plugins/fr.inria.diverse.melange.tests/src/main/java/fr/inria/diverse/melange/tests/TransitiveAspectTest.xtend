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
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.validation.MelangeValidationConstants
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.Slice

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

		assertError(lang.aspects.get(0),
					MelangePackage.eINSTANCE.aspect,
					MelangeValidationConstants.MERGE_REFERENCE_OVERRIDING,
					"Aspect \'LangAspect\' has a reference \'addedReference\' typed ReferencesTest but in \'SuperLang\' it is typed AttributesTest"
		)
	}
	
	@Test
	def void testInheritOverrideAgain(){
		assertNotNull(operationTest_SubLang)
		assertNotNull(multipleSuperTest_SubLang)
		
		assertError(subLang.inheritanceRelation.get(0).superMetamodel,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
	}
	
	@Test
	def void testSimpleAspectOther(){
		assertNotNull(interfaceTest_OtherLang)
		assertNotNull(abstractTest_OtherLang)
		assertNotNull(interfaceTest_OtherLang.EReferences.exists[name == "addedReference"])
		assertEquals(abstractTest_OtherLang, interfaceTest_OtherLang.EReferences.findFirst[name == "addedReference"].EType)
	}
	
	@Test
	def void testInheritOverrideOther(){
		assertNotNull(interfaceTest_SubOtherLang)
		assertNotNull(genericTest_SubOtherLang)
		
		assertError(subLang.aspects.get(0),
					MelangePackage.eINSTANCE.aspect,
					MelangeValidationConstants.MERGE_REFERENCE_OVERRIDING,
					"Aspect \'SubOtherAspect\' has a reference \'addedReference\' typed GenericTest but in \'OtherLang\' it is typed AbstractTest"
		)
	}
	
	def void testMerge(){
		assertNotNull(operationTest_MergeLang)
		assertNotNull(referencesTest_MergeLang)
		assertNotNull(operationTest_MergeLang.EReferences.exists[name == "addedReference"])
		assertEquals(referencesTest_MergeLang, operationTest_MergeLang.EReferences.findFirst[name == "addedReference"].EType)
		
		assertError((mergeLang.operators.get(0) as Merge).language,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError((mergeLang.operators.get(1) as Merge).language,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SubOtherLang\' has errors in its definition"
		)
	}
	
	
	@Test
	def void testMergeOverride(){
		assertNotNull(operationTest_DoubleMergeLang)
		assertNotNull(multipleSuperTest_DoubleMergeLang)
		
		assertError((doubleMergeLang.operators.get(0) as Merge).language,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError((doubleMergeLang.operators.get(1) as Merge).language,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SubLang\' has errors in its definition"
		)
	}
	
	@Test
	def void testSliceOverride(){
		assertNotNull(operationTest_DoubleSliceLang)
		assertNotNull(multipleSuperTest_DoubleSliceLang)
		
		assertError((doubleSliceLang.operators.get(0) as Slice).language,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError((doubleSliceLang.operators.get(1) as Slice).language,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SubLang\' has errors in its definition"
		)
	}
	
	@Test
	def void testMergeSliceOverride(){
		assertNotNull(operationTest_MergeSliceLang)
		assertNotNull(multipleSuperTest_MergeSliceLang)
		
		assertError((mergeSliceLang.operators.get(0) as Merge).language,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError((mergeSliceLang.operators.get(1) as Slice).language,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SubLang\' has errors in its definition"
		)
		assertNotNull(operationTest_MergeSliceLang.EReferences.exists[name == "addedReference"])
		assertEquals(multipleSuperTest_MergeSliceLang, operationTest_MergeSliceLang.EReferences.findFirst[name == "addedReference"].EType)
	}
	
	@Test
	def void testSliceMergeOverride(){
		assertNotNull(operationTest_SliceMergeLang)
		assertNotNull(multipleSuperTest_SliceMergeLang)
		
		assertError((sliceMergeLang.operators.get(0) as Slice).language,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError((sliceMergeLang.operators.get(1) as Merge).language,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SubLang\' has errors in its definition"
		)
	}
	
	@Test
	def void testMergeInheritOverriding(){
		assertNotNull(operationTest_MergeOverrideLang)
		assertNotNull(referencesTest_MergeOverrideLang)
		
		assertError((mergeOverrideLang.operators.get(0) as Merge).language,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError(mergeOverrideLang.inheritanceRelation.get(0).superMetamodel,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SuperLang\' has errors in its definition"
		)		
	}
	
	@Test
	def void testSliceInheritOverriding(){
		assertNotNull(operationTest_SliceOverrideLang)
		assertNotNull(referencesTest_SliceOverrideLang)
		
		assertError((sliceOverrideLang.operators.get(0) as Slice).language,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError(sliceOverrideLang.inheritanceRelation.get(0).superMetamodel,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SuperLang\' has errors in its definition"
		)
	}
	
	@Test
	def void testAspectOverride(){
		assertNotNull(operationTest_AspectOverrideLang)
		assertNotNull(referencesTest_AspectOverrideLang)
		
		assertError(aspectOverrideLang.inheritanceRelation.get(0).superMetamodel,
					MelangePackage.eINSTANCE.metamodel,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SliceMergeLang\' has errors in its definition"
		)
	}
	
	@Test
	def void testMergeAspectOverride(){
		assertNotNull(operationTest_Lang)
		assertNotNull(referencesTest_Lang)

		assertError(aspectedLang.aspects.get(0),
					MelangePackage.eINSTANCE.aspect,
					MelangeValidationConstants.MERGE_REFERENCE_OVERRIDING,
					"Aspect \'LangAspect\' has a reference \'addedReference\' typed ReferencesTest but in \'SuperLang\' it is typed AttributesTest"
		)
	}
	
	
	def Metamodel getExhausitve()        { return root.elements.get(0) as Metamodel }
	def Metamodel getSuperLang()         { return root.elements.get(1) as Metamodel }
	def Metamodel getLang()              { return root.elements.get(2) as Metamodel }
	def Metamodel getSubLang()           { return root.elements.get(3) as Metamodel }
	def Metamodel getOtherLang()         { return root.elements.get(4) as Metamodel }
	def Metamodel getSubOtherLang()      { return root.elements.get(5) as Metamodel }
	def Metamodel getMergeLang()         { return root.elements.get(6) as Metamodel }
	def Metamodel getMergeOverrideLang() { return root.elements.get(7) as Metamodel }
	def Metamodel getSliceOverrideLang() { return root.elements.get(8) as Metamodel }
	def Metamodel getDoubleMergeLang()   { return root.elements.get(9) as Metamodel }
	def Metamodel getDoubleSliceLang()   { return root.elements.get(10) as Metamodel }
	def Metamodel getMergeSliceLang()    { return root.elements.get(11) as Metamodel }
	def Metamodel getSliceMergeLang()    { return root.elements.get(12) as Metamodel }
	def Metamodel getAspectOverrideLang(){ return root.elements.get(13) as Metamodel }
	def Metamodel getAspectedLang()      { return root.elements.get(14) as Metamodel }
	
	def EClass getOperationTest_SuperLang()         {return superLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_Lang()              {return lang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_SubLang()           {return subLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_MergeLang()         {return mergeLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_MergeOverrideLang() {return mergeOverrideLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_SliceOverrideLang() {return sliceOverrideLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_DoubleMergeLang()   {return doubleMergeLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_DoubleSliceLang()   {return doubleSliceLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_MergeSliceLang()    {return mergeSliceLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_SliceMergeLang()    {return sliceMergeLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_AspectOverrideLang(){return aspectOverrideLang.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	
	def EClass getAttributesTest_SuperLang()          {return superLang.pkgs.get(0).EClassifiers.findFirst[name == "AttributesTest"] as EClass}
	def EClass getReferencesTest_Lang()               {return lang.pkgs.get(0).EClassifiers.findFirst[name == "ReferencesTest"] as EClass}
	def EClass getMultipleSuperTest_SubLang()         {return subLang.pkgs.get(0).EClassifiers.findFirst[name == "MultipleSuperTest"] as EClass}
	def EClass getReferencesTest_MergeLang()          {return mergeLang.pkgs.get(0).EClassifiers.findFirst[name == "ReferencesTest"] as EClass}
	def EClass getReferencesTest_MergeOverrideLang()  {return mergeOverrideLang.pkgs.get(0).EClassifiers.findFirst[name == "ReferencesTest"] as EClass}
	def EClass getReferencesTest_SliceOverrideLang()  {return sliceOverrideLang.pkgs.get(0).EClassifiers.findFirst[name == "ReferencesTest"] as EClass}
	def EClass getMultipleSuperTest_DoubleMergeLang() {return doubleMergeLang.pkgs.get(0).EClassifiers.findFirst[name == "MultipleSuperTest"] as EClass}
	def EClass getMultipleSuperTest_DoubleSliceLang() {return doubleSliceLang.pkgs.get(0).EClassifiers.findFirst[name == "MultipleSuperTest"] as EClass}
	def EClass getMultipleSuperTest_MergeSliceLang()  {return mergeSliceLang.pkgs.get(0).EClassifiers.findFirst[name == "MultipleSuperTest"] as EClass}
	def EClass getMultipleSuperTest_SliceMergeLang()  {return sliceMergeLang.pkgs.get(0).EClassifiers.findFirst[name == "MultipleSuperTest"] as EClass}
	def EClass getReferencesTest_AspectOverrideLang() {return aspectOverrideLang.pkgs.get(0).EClassifiers.findFirst[name == "ReferencesTest"] as EClass}
	
	def EClass getInterfaceTest_OtherLang()    {return otherLang.pkgs.get(0).EClassifiers.findFirst[name == "InterfaceTest"] as EClass}
	def EClass getInterfaceTest_SubOtherLang() {return subOtherLang.pkgs.get(0).EClassifiers.findFirst[name == "InterfaceTest"] as EClass}
	def EClass getInterfaceTest_MergeLang()    {return mergeLang.pkgs.get(0).EClassifiers.findFirst[name == "InterfaceTest"] as EClass}
	
	def EClass getAbstractTest_OtherLang()   {return otherLang.pkgs.get(0).EClassifiers.findFirst[name == "AbstractTest"] as EClass}
	def EClass getGenericTest_SubOtherLang() {return subOtherLang.pkgs.get(0).EClassifiers.findFirst[name == "GenericTest"] as EClass}
	def EClass getGenericTest_MergeLang()    {return mergeLang.pkgs.get(0).EClassifiers.findFirst[name == "GenericTest"] as EClass}
	
}