package fr.inria.diverse.melange.tests.eclipse

import fr.inria.diverse.melange.MelangeUiInjectorProvider
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.FixMethodOrder
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import org.junit.Before
import org.junit.After
import org.eclipse.core.resources.IProject
import com.google.inject.Inject
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceTestHelper
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.junit.Test
import java.util.List
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import fr.inria.diverse.melange.ast.ModelingElementExtensions

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class MultiPackagesTest extends AbstractXtextTests
{
	
	IProject melangeProject
	@Inject WorkspaceTestHelper helper
	@Inject extension ModelingElementExtensions
	static final String PROJECT_NAME = "fr.inria.diverse.melange.tests.multipkgs.main"
	static final String MELANGE_FILE =
		"fr.inria.diverse.melange.tests.multipkgs.main/src/fr/inria/diverse/melange/tests/multipkgs/main/main.melange"
		
	@Before
	override setUp() {
		helper.setTargetPlatform
		// We don't want to regenerate everything for each test
		if (!helper.projectExists(PROJECT_NAME)) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			helper.deployMelangeProject("fr.inria.diverse.melange.tests.multipkgs.model","tests-inputs/fr.inria.diverse.melange.tests.multipkgs.model.zip")
			helper.deployMelangeProject("fr.inria.diverse.melange.tests.multipkgs.aspects","tests-inputs/fr.inria.diverse.melange.tests.multipkgs.aspects.zip")
			melangeProject = helper.deployMelangeProject(PROJECT_NAME,"tests-inputs/fr.inria.diverse.melange.tests.multipkgs.main.zip")
			IResourcesSetupUtil::waitForAutoBuild
			helper.openEditor(MELANGE_FILE)
		} else {
			melangeProject = helper.getProject(PROJECT_NAME)
		}
	}

	@After
	override tearDown() {
		// Nope
	}
	
	@Test
	def void test1GeneratedModelTypes() {
		helper.generateInterfaces(MELANGE_FILE)
		IResourcesSetupUtil::waitForAutoBuild
		//TODO: check generated files exist
	}
	
	@Test
	def void test2GeneratedLanguages() {
		helper.generateLanguages(MELANGE_FILE)
		IResourcesSetupUtil::waitForAutoBuild
		helper.assertNoMarkers
	}


	@Test
	def void test3GeneratedAdaptersCompile() {
		helper.generateAdapters(MELANGE_FILE)
		IResourcesSetupUtil::waitForAutoBuild
		helper.assertNoMarkers
	}
	
	@Test
	def void test4Structure(){
		val model = helper.getResource(PROJECT_NAME, MELANGE_FILE)
		
		//4 Languages & 4 MT
		assertEquals(8,model.elements.size)
		val rootLang = model.languages.findFirst[name == "RootLang"]
		val xRootLang = model.languages.findFirst[name == "XRootLang"]
		val multiRootLang = model.languages.findFirst[name == "MultiRootLang"]
		val crossRefLang = model.languages.findFirst[name == "CrossRefLang"]
		val multiRootLangMT = model.MTs.findFirst[name == "MultiRootLangMT"]
		val crossRefLangMT = model.MTs.findFirst[name == "CrossRefLangMT"]
		val rootLangMT = model.MTs.findFirst[name == "RootLangMT"]
		val xRootLangMT = model.MTs.findFirst[name == "XRootLangMT"]
		assertNotNull(multiRootLang)
		assertNotNull(crossRefLang)
		assertNotNull(rootLang)
		assertNotNull(xRootLang)
		assertNotNull(multiRootLangMT)
		assertNotNull(crossRefLangMT)
		assertNotNull(rootLangMT)
		assertNotNull(xRootLangMT)
		
		// RootLang
		val rootPkgs1 = rootLang.syntax.pkgs.filter[ESuperPackage == null]
		assertEquals(1,rootPkgs1.size)
		val root1 = rootPkgs1.findFirst[name == "toppkg"]
		assertNotNull(root1)
		
		root1.checkIsPkgTest
		
		// XRootLang
		val rootPkgs2 = xRootLang.syntax.pkgs.filter[ESuperPackage == null]
		assertEquals(1,rootPkgs2.size)
		val root2 = rootPkgs2.findFirst[name == "toppkg"]
		assertNotNull(root2)
		
		root2.checkIsPkgTestWithAsp
		
		// MultiRootLang
		val rootPkgs = multiRootLang.syntax.pkgs.filter[ESuperPackage == null]
		assertEquals(2,rootPkgs.size)
		val root = rootPkgs.findFirst[name == "root"]
		val toppkg = rootPkgs.findFirst[name == "toppkg"]
		assertNotNull(root)
		assertNotNull(toppkg)
		
		assertEquals(0,root.ESubpackages.size)
		assertEquals(1,root.EClassifiers.size)
		assertEquals("Class",root.EClassifiers.get(0).name)
		
		toppkg.checkIsPkgTest
		
		// CrossRefLang
		val rootPkgs3 = crossRefLang.syntax.pkgs.filter[ESuperPackage == null]
		assertEquals(3,rootPkgs3.size)
		val root3 = rootPkgs3.findFirst[name == "root"]
		val rootpkg3 = rootPkgs3.findFirst[name == "rootpkg"]
		val toppkg3 = rootPkgs3.findFirst[name == "toppkg"]
		assertNotNull(root3)
		assertNotNull(rootpkg3)
		assertNotNull(toppkg3)
		
		assertEquals(0,root3.ESubpackages.size)
		assertEquals(1,root3.EClassifiers.size)
		val clazz = root3.EClassifiers.findFirst[name == "Class"] as EClass
		assertNotNull(clazz)
		
		toppkg3.checkIsPkgTest
		
		assertEquals(0,rootpkg3.ESubpackages.size)
		assertEquals(1,rootpkg3.EClassifiers.size)
		val newClass = rootpkg3.EClassifiers.findFirst[name == "NewClass"] as EClass
		assertNotNull(newClass)
		assertEquals(1, newClass.ESuperTypes.size)
		assertEquals(1,newClass.EAllReferences.size)
		val toSubpkg2Class1 = newClass.EAllReferences.findFirst[name == "toSubpkg2Class1"]
		val subpkg2Class1 = toppkg3.ESubpackages.findFirst[name == "subpkg2"].EClassifiers.findFirst[name == "Subpkg2Class1"]
		assertEquals(clazz, newClass.ESuperTypes.get(0))
		assertEquals(subpkg2Class1, toSubpkg2Class1.EType)
	}
	
	/*
	 * Check {@link toppkg} is PackagesTest.ecore
	 */
	def checkIsPkgTest(EPackage toppkg) {
		
		assertEquals(2,toppkg.ESubpackages.size)
		assertEquals(3,toppkg.EClassifiers.size)
		val topClass1 = toppkg.EClassifiers.findFirst[name == "TopClass1"] as EClass
		val topClass2 = toppkg.EClassifiers.findFirst[name == "TopClass2"] as EClass
		val classA = toppkg.EClassifiers.findFirst[name == "ClassA"] as EClass
		assertNotNull(topClass1)
		assertNotNull(topClass2)
		assertNotNull(classA)
		
		val subpkg1 = toppkg.ESubpackages.findFirst[name == "subpkg1"]
		assertEquals(0,subpkg1.ESubpackages.size)
		assertEquals(2,subpkg1.EClassifiers.size)
		val subpkg1Class1 = subpkg1.EClassifiers.findFirst[name == "Subpkg1Class1"] as EClass
		val subpkg1Class2 = subpkg1.EClassifiers.findFirst[name == "Subpkg1Class2"] as EClass
		assertNotNull(subpkg1Class1)
		assertNotNull(subpkg1Class2)
		
		val subpkg2 = toppkg.ESubpackages.findFirst[name == "subpkg2"]
		assertEquals(1,subpkg2.ESubpackages.size)
		assertEquals(2,subpkg2.EClassifiers.size)
		val subpkg2Class1 = subpkg2.EClassifiers.findFirst[name == "Subpkg2Class1"] as EClass
		val subpkg2Class2 = subpkg2.EClassifiers.findFirst[name == "Subpkg2Class2"] as EClass
		assertNotNull(subpkg2Class1)
		assertNotNull(subpkg2Class2)
		
		val subpkg3 = subpkg2.ESubpackages.findFirst[name == "subpkg3"]
		assertEquals(0,subpkg3.ESubpackages.size)
		assertEquals(3,subpkg3.EClassifiers.size)
		val subpkg3Class1 = subpkg3.EClassifiers.findFirst[name == "Subpkg3Class1"] as EClass
		val subpkg3Class2 = subpkg3.EClassifiers.findFirst[name == "Subpkg3Class2"] as EClass
		val subpkg3ClassA = subpkg3.EClassifiers.findFirst[name == "ClassA"] as EClass
		assertNotNull(subpkg3Class1)
		assertNotNull(subpkg3Class2)
		assertNotNull(subpkg3ClassA)
		
		assertEquals(3,topClass1.EAllReferences.size)
		val myTopClass2 = topClass1.EAllReferences.findFirst[name == "myTopClass2"]
		val mySubPkg1Class1 = topClass1.EAllReferences.findFirst[name == "mySubPkg1Class1"]
		val mySubPkg2Class1 = topClass1.EAllReferences.findFirst[name == "mySubpkg2Class1"]
		assertNotNull(myTopClass2)
		assertEquals(topClass2, myTopClass2.EType)
		assertNotNull(mySubPkg1Class1)
		assertEquals(subpkg1Class1, mySubPkg1Class1.EType)
		assertNotNull(mySubPkg2Class1)
		assertEquals(subpkg2Class1, mySubPkg2Class1.EType)
		
		assertEquals(1,topClass2.EAllReferences.size)
		val myTopClass1 = topClass2.EAllReferences.findFirst[name == "myTopClass1"]
		assertNotNull(myTopClass1)
		assertEquals(topClass1, myTopClass1.EType)
		
		assertEquals(1,classA.EAllReferences.size)
		val toClassA = classA.EAllReferences.findFirst[name == "toClassA"]
		assertEquals(subpkg3ClassA, toClassA.EType)
		
		assertEquals(1,subpkg1Class1.EAllReferences.size)
		val mySubPkg1Class2 = subpkg1Class1.EAllReferences.findFirst[name == "mySubpkg1Class2"]
		assertNotNull(mySubPkg1Class2)
		assertEquals(subpkg1Class2, mySubPkg1Class2.EType)
		
		assertEquals(1,subpkg2Class1.EAllReferences.size)
		val mySubPkg2Class2 = subpkg2Class1.EAllReferences.findFirst[name == "mySubpkg2Class2"]
		assertNotNull(mySubPkg2Class2)
		assertEquals(subpkg2Class2, mySubPkg2Class2.EType)
		
		assertEquals(1,subpkg2Class2.EAllReferences.size)
		val mySubPkg3Class1 = subpkg2Class2.EAllReferences.findFirst[name == "mySubpkg3Class1"]
		assertNotNull(mySubPkg3Class1)
		assertEquals(subpkg3Class1, mySubPkg3Class1.EType)
		
		assertEquals(1,subpkg3Class1.EAllReferences.size)
		val mySubPkg3Class2 = subpkg3Class1.EAllReferences.findFirst[name == "mySubpkg3Class2"]
		assertNotNull(mySubPkg3Class2)
		assertEquals(subpkg3Class2, mySubPkg3Class2.EType)
	}
	
	def checkIsPkgTestWithAsp(EPackage toppkg) {
		
		assertEquals(2,toppkg.ESubpackages.size)
		assertEquals(3,toppkg.EClassifiers.size)
		val topClass1 = toppkg.EClassifiers.findFirst[name == "TopClass1"] as EClass
		val topClass2 = toppkg.EClassifiers.findFirst[name == "TopClass2"] as EClass
		val classA = toppkg.EClassifiers.findFirst[name == "ClassA"] as EClass
		assertNotNull(topClass1)
		assertNotNull(topClass2)
		assertNotNull(classA)
		
		val subpkg1 = toppkg.ESubpackages.findFirst[name == "subpkg1"]
		assertEquals(0,subpkg1.ESubpackages.size)
		assertEquals(2,subpkg1.EClassifiers.size)
		val subpkg1Class1 = subpkg1.EClassifiers.findFirst[name == "Subpkg1Class1"] as EClass
		val subpkg1Class2 = subpkg1.EClassifiers.findFirst[name == "Subpkg1Class2"] as EClass
		assertNotNull(subpkg1Class1)
		assertNotNull(subpkg1Class2)
		
		val subpkg2 = toppkg.ESubpackages.findFirst[name == "subpkg2"]
		assertEquals(1,subpkg2.ESubpackages.size)
		assertEquals(2,subpkg2.EClassifiers.size)
		val subpkg2Class1 = subpkg2.EClassifiers.findFirst[name == "Subpkg2Class1"] as EClass
		val subpkg2Class2 = subpkg2.EClassifiers.findFirst[name == "Subpkg2Class2"] as EClass
		assertNotNull(subpkg2Class1)
		assertNotNull(subpkg2Class2)
		
		val subpkg3 = subpkg2.ESubpackages.findFirst[name == "subpkg3"]
		assertEquals(0,subpkg3.ESubpackages.size)
		assertEquals(3,subpkg3.EClassifiers.size)
		val subpkg3Class1 = subpkg3.EClassifiers.findFirst[name == "Subpkg3Class1"] as EClass
		val subpkg3Class2 = subpkg3.EClassifiers.findFirst[name == "Subpkg3Class2"] as EClass
		val subpkg3ClassA = subpkg3.EClassifiers.findFirst[name == "ClassA"] as EClass
		assertNotNull(subpkg3Class1)
		assertNotNull(subpkg3Class2)
		assertNotNull(subpkg3ClassA)
		
		assertEquals(3,topClass1.EAllReferences.size)
		val myTopClass2 = topClass1.EAllReferences.findFirst[name == "myTopClass2"]
		val mySubPkg1Class1 = topClass1.EAllReferences.findFirst[name == "mySubPkg1Class1"]
		val mySubPkg2Class1 = topClass1.EAllReferences.findFirst[name == "mySubpkg2Class1"]
		assertNotNull(myTopClass2)
		assertEquals(topClass2, myTopClass2.EType)
		assertNotNull(mySubPkg1Class1)
		assertEquals(subpkg1Class1, mySubPkg1Class1.EType)
		assertNotNull(mySubPkg2Class1)
		assertEquals(subpkg2Class1, mySubPkg2Class1.EType)
		
		assertEquals(1,topClass2.EAllReferences.size)
		val myTopClass1 = topClass2.EAllReferences.findFirst[name == "myTopClass1"]
		assertNotNull(myTopClass1)
		assertEquals(topClass1, myTopClass1.EType)
		
		assertEquals(2,classA.EAllReferences.size)
		val toClassA = classA.EAllReferences.findFirst[name == "toClassA"]
		assertEquals(subpkg3ClassA, toClassA.EType)
		val toSubClassA = classA.EAllReferences.findFirst[name == "toSubClassA"]
		assertEquals(subpkg3ClassA, toSubClassA.EType)
		
		assertEquals(1,subpkg1Class1.EAllReferences.size)
		val mySubPkg1Class2 = subpkg1Class1.EAllReferences.findFirst[name == "mySubpkg1Class2"]
		assertNotNull(mySubPkg1Class2)
		assertEquals(subpkg1Class2, mySubPkg1Class2.EType)
		
		assertEquals(1,subpkg2Class1.EAllReferences.size)
		val mySubPkg2Class2 = subpkg2Class1.EAllReferences.findFirst[name == "mySubpkg2Class2"]
		assertNotNull(mySubPkg2Class2)
		assertEquals(subpkg2Class2, mySubPkg2Class2.EType)
		
		assertEquals(1,subpkg2Class2.EAllReferences.size)
		val mySubPkg3Class1 = subpkg2Class2.EAllReferences.findFirst[name == "mySubpkg3Class1"]
		assertNotNull(mySubPkg3Class1)
		assertEquals(subpkg3Class1, mySubPkg3Class1.EType)
		
		assertEquals(1,subpkg3Class1.EAllReferences.size)
		val mySubPkg3Class2 = subpkg3Class1.EAllReferences.findFirst[name == "mySubpkg3Class2"]
		assertNotNull(mySubPkg3Class2)
		assertEquals(subpkg3Class2, mySubPkg3Class2.EType)
		
		assertEquals(1,subpkg3ClassA.EAllReferences.size)
		val toUpperClassA = subpkg3ClassA.EAllReferences.findFirst[name == "toUpperClassA"]
		assertNotNull(toUpperClassA)
		assertEquals(classA, toUpperClassA.EType)
	}
	
	def List<Language> getLanguages(ModelTypingSpace root) {return root.elements.filter(Language).toList}
	def List<ModelType> getMTs(ModelTypingSpace root) {return root.elements.filter(ModelType).toList}
}
