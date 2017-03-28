package fr.inria.diverse.melange.tests

import org.junit.Test
import org.junit.Before
import fr.inria.diverse.melange.resource.loader.ModelCopier
import testcopy.TestcopyPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import testcopy.TestcopyFactory
import testcopy.MyEnum
import testcopy.SimpleReferences
import testcopy.Attributes

import static org.junit.Assert.*
import org.eclipse.emf.ecore.EPackage
import java.util.Set
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import testcopy.OppositesA

class ModelCopierTest {
	
	ModelCopier copier;
	
	@Before
	def void setUp() {
		val Set<EPackage> src = newHashSet
		src += TestcopyPackage.eINSTANCE
		
		val Set<EPackage> trg = newHashSet
		trg += TestcopyPackage.eINSTANCE
		
		copier = new ModelCopier(src,trg)
	}
	
	def Resource makeModel() {
		val rs = new ResourceSetImpl
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
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
	
	@Test
	def void testAttributes() {
		val source = makeModel()
		val copy = copier.clone(source)
		
		val simpleRefObj = copy.contents.get(0) as SimpleReferences
		val attrObj1 = simpleRefObj.containmentRef.get(0) as Attributes
		val attrObj2 = simpleRefObj.containmentRef.get(1) as Attributes
		val attrObj3 = simpleRefObj.containmentRef.get(2) as Attributes
		
		assertEquals(1,attrObj1.intAttribute)
		assertEquals(2,attrObj2.intAttribute)
		assertEquals(3,attrObj3.intAttribute)
		
		assertEquals(MyEnum.get("ITEM1"),attrObj1.enumAttibute)
		assertEquals(MyEnum.get("ITEM2"),attrObj2.enumAttibute)
		assertEquals(MyEnum.get("ITEM1"),attrObj3.enumAttibute)
	}
	
	@Test
	def void testEOpposite() {
		val source = makeModel()
		val copy = copier.clone(source)
		
		val eopObjA1 = copy.contents.get(1) as OppositesA
		val eopObjA2 = copy.contents.get(2) as OppositesA
		val eopObjA3 = copy.contents.get(3) as OppositesA
		
		assertEquals("A1", eopObjA1.name)
		assertEquals("A2", eopObjA2.name)
		assertEquals("A3", eopObjA3.name)
		
		// oneToMany
		val eopObjB1 = eopObjA1.oneToMany.get(0)
		val eopObjB2 = eopObjA1.oneToMany.get(1)
		val eopObjB3 = eopObjA1.oneToMany.get(2)
		
		assertEquals("B1", eopObjB1.name)
		assertEquals("B2", eopObjB2.name)
		assertEquals("B3", eopObjB3.name)
		assertEquals(3,eopObjA1.oneToMany.size)
		assertEquals(0,eopObjA2.oneToMany.size)
		assertEquals(0,eopObjA3.oneToMany.size)
		
		// toB
		assertNull(eopObjA1.toB)
		assertEquals(eopObjB2, eopObjA2.toB)
		assertNull(eopObjA3.toB)
		
		// manyToMany
		assertEquals(1,eopObjA1.manyToMany.size)
		assertEquals(3,eopObjA2.manyToMany.size)
		assertEquals(0,eopObjA3.manyToMany.size)
		
		assertEquals(eopObjB2,eopObjA1.manyToMany.get(0))
		assertEquals(eopObjB1,eopObjA2.manyToMany.get(0))
		assertEquals(eopObjB3,eopObjA2.manyToMany.get(1))
		assertEquals(eopObjB2,eopObjA2.manyToMany.get(2))
		
		// toA
		assertNull(eopObjB1.toA)
		assertEquals(eopObjA2, eopObjB2.toA)
		assertNull(eopObjB3.toA)
		
		// manyToOne
		assertEquals(eopObjA1,eopObjB1.manyToOne)
		assertEquals(eopObjA1,eopObjB2.manyToOne)
		assertEquals(eopObjA1,eopObjB3.manyToOne)
		
		// manyToMany
		assertEquals(1,eopObjB1.manyToMany.size)
		assertEquals(2,eopObjB2.manyToMany.size)
		assertEquals(1,eopObjB3.manyToMany.size)
		
		assertEquals(eopObjA2,eopObjB1.manyToMany.get(0))
		assertEquals(eopObjA1,eopObjB2.manyToMany.get(0))
		assertEquals(eopObjA2,eopObjB2.manyToMany.get(1))
		assertEquals(eopObjA2,eopObjB3.manyToMany.get(0))
	}
}