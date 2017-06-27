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
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import fr.inria.diverse.melange.validation.MelangeValidationConstants
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.junit.Ignore

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/TransitiveAspectTest.melange", withValidation = false, ignoreSelfImplement=#["Lang","SubLang","MergeLang","MergeOverrideLang","SliceOverrideLang","DoubleMergeLang","DoubleSliceLang","MergeSliceLang","SliceMergeLang","SliceMergeLang","AspectedLang"])
class TransitiveAspectTest
{
	@Inject extension ModelingElementExtensions
	@Inject extension LanguageExtensions
	
	@Test
	def void testSimpleAspect(){
		assertNotNull(operationTest_SuperLang)
		assertNotNull(attributesTest_SuperLang)
		assertNotNull(operationTest_SuperLang.EReferences.exists[name == "addedReference"])
		assertEquals(attributesTest_SuperLang, operationTest_SuperLang.EReferences.findFirst[name == "addedReference"].EType)
	}
	
	@Ignore("We'll take care of that later on")
	@Test
	def void testInheritOverride(){
		assertNotNull(operationTest_Lang)
		assertNotNull(referencesTest_Lang)

		assertError(lang.semantics.get(0),
					MelangePackage.eINSTANCE.aspect,
					MelangeValidationConstants.MERGE_REFERENCE_OVERRIDING,
					"Aspect \'fr.inria.diverse.melange.tests.aspects.exhaustive.LangAspect\' has a reference \'addedReference\' typed ReferencesTest but in \'SuperLang\' it is typed AttributesTest"
		)
	}
	
	@Test
	def void testInheritOverrideAgain(){
		assertNotNull(operationTest_SubLang)
		assertNotNull(multipleSuperTest_SubLang)
		
		assertError(subLang.superLanguages.head,
					MelangePackage.eINSTANCE.languageOperator,
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
	
	@Ignore("We'll take care of that later on")
	@Test
	def void testInheritOverrideOther(){
		assertNotNull(interfaceTest_SubOtherLang)
		assertNotNull(genericTest_SubOtherLang)
		
		assertError(subLang.semantics.get(0),
					MelangePackage.eINSTANCE.aspect,
					MelangeValidationConstants.MERGE_REFERENCE_OVERRIDING,
					"Aspect \'fr.inria.diverse.melange.tests.aspects.exhaustive.SubOtherAspect\' has a reference \'addedReference\' typed GenericTest but in \'OtherLang\' it is typed AbstractTest"
		)
	}
	
	def void testMerge(){
		assertNotNull(operationTest_MergeLang)
		assertNotNull(referencesTest_MergeLang)
		assertNotNull(operationTest_MergeLang.EReferences.exists[name == "addedReference"])
		assertEquals(referencesTest_MergeLang, operationTest_MergeLang.EReferences.findFirst[name == "addedReference"].EType)
		
		assertError((mergeLang.operators.get(0) as Merge).targetLanguage,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError((mergeLang.operators.get(1) as Merge).targetLanguage,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SubOtherLang\' has errors in its definition"
		)
	}
	
	
	@Test
	def void testMergeOverride(){
		assertNotNull(operationTest_DoubleMergeLang)
		assertNotNull(multipleSuperTest_DoubleMergeLang)
		
		assertError((doubleMergeLang.operators.get(0) as Merge).targetLanguage,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError((doubleMergeLang.operators.get(1) as Merge).targetLanguage,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SubLang\' has errors in its definition"
		)
	}
	
	@Test
	def void testSliceOverride(){
		assertNotNull(operationTest_DoubleSliceLang)
		assertNotNull(multipleSuperTest_DoubleSliceLang)
		
		assertError((doubleSliceLang.operators.get(0) as Slice).targetLanguage,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError((doubleSliceLang.operators.get(1) as Slice).targetLanguage,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SubLang\' has errors in its definition"
		)
	}
	
	@Test
	def void testMergeSliceOverride(){
		assertNotNull(operationTest_MergeSliceLang)
		assertNotNull(getAttributesTest_MergeSliceLang)
		
		assertError((mergeSliceLang.operators.get(0) as Merge).targetLanguage,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError((mergeSliceLang.operators.get(1) as Slice).targetLanguage,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SubLang\' has errors in its definition"
		)
		assertNotNull(operationTest_MergeSliceLang.EReferences.exists[name == "addedReference"])
		assertEquals(getAttributesTest_MergeSliceLang, operationTest_MergeSliceLang.EReferences.findFirst[name == "addedReference"].EType)
	}
	
	@Test
	def void testSliceMergeOverride(){
		assertNotNull(operationTest_SliceMergeLang)
		assertNotNull(multipleSuperTest_SliceMergeLang)
		
		assertError((sliceMergeLang.operators.get(0) as Slice).targetLanguage,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError((sliceMergeLang.operators.get(1) as Merge).targetLanguage,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SubLang\' has errors in its definition"
		)
	}
	
	@Ignore("We'll take care of that later on")
	@Test
	def void testMergeInheritOverriding(){
		assertNotNull(operationTest_MergeOverrideLang)
		assertNotNull(referencesTest_MergeOverrideLang)
		
		assertError((mergeOverrideLang.operators.get(1) as Merge).targetLanguage,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError(mergeOverrideLang.superLanguages.head,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SuperLang\' has errors in its definition"
		)		
	}
	
	@Ignore("We'll take care of that later on")
	@Test
	def void testSliceInheritOverriding(){
		assertNotNull(operationTest_SliceOverrideLang)
		assertNotNull(referencesTest_SliceOverrideLang)
		
		assertError((sliceOverrideLang.operators.get(1) as Slice).targetLanguage,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'Lang\' has errors in its definition"
		)
		assertError(sliceOverrideLang.superLanguages.head,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SuperLang\' has errors in its definition"
		)
	}
	
	@Test
	def void testAspectOverride(){
		assertNotNull(operationTest_AspectOverrideLang)
		assertNotNull(referencesTest_AspectOverrideLang)
		
		assertError(aspectOverrideLang.superLanguages.head,
					MelangePackage.eINSTANCE.languageOperator,
					MelangeValidationConstants.METAMODEL_IN_ERROR,
					"Language \'SliceMergeLang\' has errors in its definition"
		)
	}
	
	@Ignore("We'll take care of that later on")
	@Test
	def void testMergeAspectOverride(){
		assertNotNull(operationTest_Lang)
		assertNotNull(referencesTest_Lang)

		assertError(aspectedLang.semantics.get(0),
					MelangePackage.eINSTANCE.aspect,
					MelangeValidationConstants.MERGE_REFERENCE_OVERRIDING,
					"Aspect \'fr.inria.diverse.melange.tests.aspects.exhaustive.LangAspect\' has a reference \'addedReference\' typed ReferencesTest but in \'SuperLang\' it is typed AttributesTest"
		)
	}
	
	
	def Language getExhausitve()        { return root.elements.get(0) as Language }
	def Language getSuperLang()         { return root.elements.get(1) as Language }
	def Language getLang()              { return root.elements.get(2) as Language }
	def Language getSubLang()           { return root.elements.get(3) as Language }
	def Language getOtherLang()         { return root.elements.get(4) as Language }
	def Language getSubOtherLang()      { return root.elements.get(5) as Language }
	def Language getMergeLang()         { return root.elements.get(6) as Language }
	def Language getMergeOverrideLang() { return root.elements.get(7) as Language }
	def Language getSliceOverrideLang() { return root.elements.get(8) as Language }
	def Language getDoubleMergeLang()   { return root.elements.get(9) as Language }
	def Language getDoubleSliceLang()   { return root.elements.get(10) as Language }
	def Language getMergeSliceLang()    { return root.elements.get(11) as Language }
	def Language getSliceMergeLang()    { return root.elements.get(12) as Language }
	def Language getAspectOverrideLang(){ return root.elements.get(13) as Language }
	def Language getAspectedLang()      { return root.elements.get(14) as Language }
	
	def EClass getOperationTest_SuperLang()         {return superLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_Lang()              {return lang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_SubLang()           {return subLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_MergeLang()         {return mergeLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_MergeOverrideLang() {return mergeOverrideLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_SliceOverrideLang() {return sliceOverrideLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_DoubleMergeLang()   {return doubleMergeLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_DoubleSliceLang()   {return doubleSliceLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_MergeSliceLang()    {return mergeSliceLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_SliceMergeLang()    {return sliceMergeLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	def EClass getOperationTest_AspectOverrideLang(){return aspectOverrideLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "OperationsTest"] as EClass}
	
	def EClass getAttributesTest_SuperLang()          {return superLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "AttributesTest"] as EClass}
	def EClass getReferencesTest_Lang()               {return lang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "ReferencesTest"] as EClass}
	def EClass getMultipleSuperTest_SubLang()         {return subLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "MultipleSuperTest"] as EClass}
	def EClass getReferencesTest_MergeLang()          {return mergeLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "ReferencesTest"] as EClass}
	def EClass getReferencesTest_MergeOverrideLang()  {return mergeOverrideLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "ReferencesTest"] as EClass}
	def EClass getReferencesTest_SliceOverrideLang()  {return sliceOverrideLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "ReferencesTest"] as EClass}
	def EClass getMultipleSuperTest_DoubleMergeLang() {return doubleMergeLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "MultipleSuperTest"] as EClass}
	def EClass getMultipleSuperTest_DoubleSliceLang() {return doubleSliceLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "MultipleSuperTest"] as EClass}
	def EClass getAttributesTest_MergeSliceLang()  {return mergeSliceLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "AttributesTest"] as EClass}
	def EClass getMultipleSuperTest_SliceMergeLang()  {return sliceMergeLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "MultipleSuperTest"] as EClass}
	def EClass getReferencesTest_AspectOverrideLang() {return aspectOverrideLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "ReferencesTest"] as EClass}
	
	def EClass getInterfaceTest_OtherLang()    {return otherLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "InterfaceTest"] as EClass}
	def EClass getInterfaceTest_SubOtherLang() {return subOtherLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "InterfaceTest"] as EClass}
	def EClass getInterfaceTest_MergeLang()    {return mergeLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "InterfaceTest"] as EClass}
	
	def EClass getAbstractTest_OtherLang()   {return otherLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "AbstractTest"] as EClass}
	def EClass getGenericTest_SubOtherLang() {return subOtherLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "GenericTest"] as EClass}
	def EClass getGenericTest_MergeLang()    {return mergeLang.syntax.pkgs.get(0).EClassifiers.findFirst[name == "GenericTest"] as EClass}
	
}