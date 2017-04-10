package fr.inria.diverse.melange.tests

import fr.inria.diverse.melange.resource.loader.ModelCopier
import java.util.List
import java.util.Set
import org.eclipse.emf.common.util.Enumerator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.Before
import org.junit.Test
import testcopy.MyEnum
import testcopy.TestcopyFactory
import testcopy.TestcopyPackage

import static org.junit.Assert.*
import org.eclipse.emf.ecore.resource.ResourceSet
import testcopy.Attributes

class ModelCopierTest {
	
	ModelCopier copier;
	
	@Before
	def void setUp() {
		
		val Set<EPackage> src = newHashSet
		src += TestcopyPackage.eINSTANCE
		
		val Set<EPackage> trg = newHashSet
		trg += EcoreUtil.copy(TestcopyPackage.eINSTANCE as EPackage)
		
		copier = new ModelCopier(src,trg)
	}
	
	def Resource makeModel(ResourceSet rs) {
		val res = rs.createResource(URI.createURI("test.copy.model"))
		
		val factory = TestcopyPackage.eINSTANCE.EFactoryInstance as TestcopyFactory
		
		val attrObj1 = factory.createAttributes
		attrObj1.intAttribute = 1;
		attrObj1.enumAttibute = MyEnum.get("ITEM1");
		val attrObj2 = factory.createAttributes
		attrObj2.intAttribute = 2;
		attrObj2.enumAttibute = MyEnum.get("ITEM2");
		val attrObj3 = factory.createAttributes
		attrObj3.intAttribute = 3;
		attrObj3.enumAttibute = MyEnum.get("ITEM1");
		
		val simpleRefObj = factory.createSimpleReferences
		simpleRefObj.containmentRef += attrObj1
		simpleRefObj.containmentRef += attrObj2
		simpleRefObj.containmentRef += attrObj3
		simpleRefObj.simpleRef = attrObj2
		
		val eopObjA1 = factory.createOppositesA
		val eopObjA2 = factory.createOppositesA
		val eopObjA3 = factory.createOppositesA
		eopObjA1.name = "A1"
		eopObjA2.name = "A2"
		eopObjA3.name = "A3"
		
		val eopObjB1 = factory.createOppositesB
		val eopObjB2 = factory.createOppositesB
		val eopObjB3 = factory.createOppositesB
		eopObjB1.name = "B1"
		eopObjB2.name = "B2"
		eopObjB3.name = "B3"
		
		eopObjA1.oneToMany += eopObjB1
		eopObjA1.oneToMany += eopObjB2
		eopObjA1.oneToMany += eopObjB3
		
		eopObjA2.toB = eopObjB2
		
		eopObjA2.manyToMany += eopObjB1
		eopObjA2.manyToMany += eopObjB3
		eopObjB2.manyToMany += eopObjA1
		eopObjB2.manyToMany += eopObjA2
		
		
		res.contents += simpleRefObj
		res.contents += eopObjA1
		res.contents += eopObjA2
		res.contents += eopObjA3
		
		return res
	}
	
	def Resource makeEmptyModels(ResourceSet rs){
		return rs.createResource(URI.createURI("test.copy.model0"))
	}
	
	def Resource makeCrossRefModels(ResourceSet rs){
		
		val targetedRes = makeModel(rs)
		
		val res = rs.createResource(URI.createURI("test.copy.model2"))
		
		val factory = TestcopyPackage.eINSTANCE.EFactoryInstance as TestcopyFactory
		
		val simpleRefObj = factory.createSimpleReferences
		simpleRefObj.simpleRef = targetedRes.allContents.filter(Attributes).head
		
		res.contents += simpleRefObj
		
		return res;
	}
	
	def void checkAttributes(EObject simpleRefObj) {
		
		assertEquals("SimpleReferences", simpleRefObj.eClass.name)
		
		assertEquals(3,simpleRefObj.getAsList("containmentRef").size)
		val attrObj1 = simpleRefObj.getAsList("containmentRef").get(0) as EObject
		val attrObj2 = simpleRefObj.getAsList("containmentRef").get(1) as EObject
		val attrObj3 = simpleRefObj.getAsList("containmentRef").get(2) as EObject
		
		val refObj2 = simpleRefObj.get("simpleRef")
		assertNotNull(refObj2)
		assertEquals(attrObj2,refObj2)
		
		assertEquals("Attributes", attrObj1.eClass.name)
		assertEquals("Attributes", attrObj2.eClass.name)
		assertEquals("Attributes", attrObj3.eClass.name)
		
		assertEquals(1,attrObj1.get("intAttribute"))
		assertEquals(2,attrObj2.get("intAttribute"))
		assertEquals(3,attrObj3.get("intAttribute"))
		
		assertEquals("ITEM1",(attrObj1.get("enumAttibute") as Enumerator).literal)
		assertEquals("ITEM2",(attrObj2.get("enumAttibute") as Enumerator).literal)
		assertEquals("ITEM1",(attrObj3.get("enumAttibute") as Enumerator).literal)
		
	}
	
	def void checkEOpposite(EObject eopObjA1, EObject eopObjA2, EObject eopObjA3) {
		
		assertEquals("OppositesA", eopObjA1.eClass.name)
		assertEquals("OppositesA", eopObjA2.eClass.name)
		assertEquals("OppositesA", eopObjA3.eClass.name)
		
		assertEquals("A1", eopObjA1.get("name"))
		assertEquals("A2", eopObjA2.get("name"))
		assertEquals("A3", eopObjA3.get("name"))
		
		// oneToMany
		val eopObjB1 = eopObjA1.getAsList("oneToMany").get(0) as EObject
		val eopObjB2 = eopObjA1.getAsList("oneToMany").get(1) as EObject
		val eopObjB3 = eopObjA1.getAsList("oneToMany").get(2) as EObject
		
		assertEquals("OppositesB", eopObjB1.eClass.name)
		assertEquals("OppositesB", eopObjB2.eClass.name)
		assertEquals("OppositesB", eopObjB3.eClass.name)
		
		assertEquals("B1", eopObjB1.get("name"))
		assertEquals("B2", eopObjB2.get("name"))
		assertEquals("B3", eopObjB3.get("name"))
		
		assertEquals(3,eopObjA1.getAsList("oneToMany").size)
		assertEquals(0,eopObjA2.getAsList("oneToMany").size)
		assertEquals(0,eopObjA3.getAsList("oneToMany").size)
		
		// toB
		assertNull(eopObjA1.get("toB"))
		assertEquals(eopObjB2, eopObjA2.get("toB"))
		assertNull(eopObjA3.get("toB"))
		
		// manyToMany
		assertEquals(1,eopObjA1.getAsList("manyToMany").size)
		assertEquals(3,eopObjA2.getAsList("manyToMany").size)
		assertEquals(0,eopObjA3.getAsList("manyToMany").size)
		
		assertEquals(eopObjB2,eopObjA1.getAsList("manyToMany").get(0))
		assertEquals(eopObjB1,eopObjA2.getAsList("manyToMany").get(0))
		assertEquals(eopObjB3,eopObjA2.getAsList("manyToMany").get(1))
		assertEquals(eopObjB2,eopObjA2.getAsList("manyToMany").get(2))
		
		// toA
		assertNull(eopObjB1.get("toA"))
		assertEquals(eopObjA2, eopObjB2.get("toA"))
		assertNull(eopObjB3.get("toA"))
		
		// manyToOne
		assertEquals(eopObjA1,eopObjB1.get("manyToOne"))
		assertEquals(eopObjA1,eopObjB2.get("manyToOne"))
		assertEquals(eopObjA1,eopObjB3.get("manyToOne"))
		
		// manyToMany
		assertEquals(1,eopObjB1.getAsList("manyToMany").size)
		assertEquals(2,eopObjB2.getAsList("manyToMany").size)
		assertEquals(1,eopObjB3.getAsList("manyToMany").size)
		
		assertEquals(eopObjA2,eopObjB1.getAsList("manyToMany").get(0))
		assertEquals(eopObjA1,eopObjB2.getAsList("manyToMany").get(0))
		assertEquals(eopObjA2,eopObjB2.getAsList("manyToMany").get(1))
		assertEquals(eopObjA2,eopObjB3.getAsList("manyToMany").get(0))
	}
	
	@Test
	def void testAttributes() {
		val rs = new ResourceSetImpl
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val source = makeModel(rs)
		val copy = copier.clone(source)
		
		val simpleRefObj = copy.contents.get(0)
		
		checkAttributes(simpleRefObj)
	}
	
	@Test
	def void testEOpposite() {
		val rs = new ResourceSetImpl
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val source = makeModel(rs)
		val copy = copier.clone(source)
		
		val eopObjA1 = copy.contents.get(1)
		val eopObjA2 = copy.contents.get(2)
		val eopObjA3 = copy.contents.get(3)
		
		checkEOpposite(eopObjA1,eopObjA2,eopObjA3)
	}
	
	@Test
	def testEmpty() {
		val rs = new ResourceSetImpl
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val source = makeEmptyModels(rs)
		val copy = copier.clone(source)
		
		assertNotNull(copy)
		assertTrue(copy.contents.isEmpty)
	}
	
	@Test
	def testCrossRef() {
		val rs = new ResourceSetImpl
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val source = makeCrossRefModels(rs)
		
		val copy = copier.clone(source)
		assertNotNull(copy)
		assertEquals(5,copy.contents.size) // size of the 2 models
		
		val simpleRefObj = copy.contents.get(0)
		assertEquals("SimpleReferences", simpleRefObj.eClass.name)
		
		assertNotNull(simpleRefObj.get("simpleRef"))
		val refAttrib = simpleRefObj.get("simpleRef") as EObject
		
		val eopObjA1 = copy.contents.filter[eClass.name == "OppositesA" && get("name") == "A1"].head
		val eopObjA2 = copy.contents.filter[eClass.name == "OppositesA" && get("name") == "A2"].head
		val eopObjA3 = copy.contents.filter[eClass.name == "OppositesA" && get("name") == "A3"].head
		
		checkAttributes(refAttrib.eContainer)
		checkEOpposite(eopObjA1,eopObjA2,eopObjA3)
	}
	
	def Object get(EObject caller, String feature) {
		val feat = caller.eClass.getEStructuralFeature(feature);
		return caller.eGet(feat)
	}
	
	def List<?> getAsList(EObject caller, String feature) {
		val feat = caller.eClass.getEStructuralFeature(feature);
		return caller.eGet(feat) as List<?>
	}
}
