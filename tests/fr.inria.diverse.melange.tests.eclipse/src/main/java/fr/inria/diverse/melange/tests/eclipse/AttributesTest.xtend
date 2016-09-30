package fr.inria.diverse.melange.tests.eclipse

import com.google.inject.Inject
import fr.inria.diverse.melange.MelangeUiInjectorProvider
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceTestHelper
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.junit.After
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class AttributesTest extends AbstractXtextTests
{
	
	IProject melangeProject
	@Inject WorkspaceTestHelper helper
	@Inject extension ModelingElementExtensions
	static final String PROJECT_NAME = "fr.inria.diverse.melange.tests.attributes.main"
	static final String MELANGE_FILE =
		"fr.inria.diverse.melange.tests.attributes.main/src/fr/inria/diverse/melange/tests/attributes/main/Main.melange"
		
	@Before
	override setUp() {
		helper.setTargetPlatform
		// We don't want to regenerate everything for each test
		if (!helper.projectExists(PROJECT_NAME)) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			melangeProject = helper.deployMelangeProject(PROJECT_NAME,"tests-inputs/fr.inria.diverse.melange.tests.attributes.main.zip")
			helper.deployMelangeProject("fr.inria.diverse.melange.tests.attributes.aspects","tests-inputs/fr.inria.diverse.melange.tests.attributes.aspects.zip")
			helper.deployMelangeProject("fr.inria.diverse.melange.tests.attributes.model","tests-inputs/fr.inria.diverse.melange.tests.attributes.model.zip")
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
		
		//1 Languages & 1 MT
		assertEquals(2,model.elements.size)
		val testLang = model.languages.findFirst[name == "TestLanguage"]
		val testLangMT = model.MTs.findFirst[name == "TestLanguageMT"]
		assertNotNull(testLang)
		assertNotNull(testLangMT)
		
		// testLang
		val rootPkgs = testLang.syntax.pkgs.filter[ESuperPackage == null]
		assertEquals(1,rootPkgs.size)
		val root = rootPkgs.findFirst[name == "rootpkg"]
		assertNotNull(root)
		
		assertEquals(3,root.EClassifiers.size)
		val a = root.EClassifiers.findFirst[name == "A"] as EClass
		val b = root.EClassifiers.findFirst[name == "B"] as EClass
		val token = root.EClassifiers.findFirst[name == "Token"] as EClass
		assertNotNull(a)
		assertNotNull(b)
		assertNotNull(token)
		
		val a_toA = a.EAllReferences.findFirst[name == "toA"]
		assertNotNull(a_toA)
		assertTrue(a_toA.isUnique)
		assertEquals(0,a_toA.lowerBound)
		assertEquals(-1,a_toA.upperBound)
		
		val a_toB = a.EAllReferences.findFirst[name == "toB"]
		assertNotNull(a_toB)
		assertTrue(a_toB.isUnique)
		assertEquals(0,a_toB.lowerBound)
		assertEquals(-1,a_toB.upperBound)
		
		val b_toA = b.EAllReferences.findFirst[name == "toA"]
		assertNotNull(b_toA)
		assertTrue(b_toA.isUnique)
		assertTrue(b_toA.isContainment)
		assertEquals(0,b_toA.lowerBound)
		assertEquals(-1,b_toA.upperBound)
		
		val token_myName = token.EAllAttributes.findFirst[name == "myName"]
		assertNotNull(token_myName)
		assertEquals(0,token_myName.lowerBound)
		assertEquals(1,token_myName.upperBound)
		
		//Test opposite
		assertEquals(a_toB.EOpposite,b_toA)
		assertEquals(b_toA.EOpposite,a_toB)
		
	}
	
	@Test
	def void test5ExactType() {
		val model = helper.getResource(PROJECT_NAME, MELANGE_FILE)
		val testLang = model.languages.findFirst[name == "TestLanguage"]
		val testLangMT = model.MTs.findFirst[name == "TestLanguageMT"]
		
		assertTrue(testLang.implements.contains(testLangMT))
	}
	
	
	def List<Language> getLanguages(ModelTypingSpace root) {return root.elements.filter(Language).toList}
	def List<ModelType> getMTs(ModelTypingSpace root) {return root.elements.filter(ModelType).toList}
}
