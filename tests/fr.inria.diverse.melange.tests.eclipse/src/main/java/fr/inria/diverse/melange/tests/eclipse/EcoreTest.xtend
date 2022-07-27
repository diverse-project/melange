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
package fr.inria.diverse.melange.tests.eclipse

import com.google.inject.Inject
import fr.inria.diverse.melange.ui.tests.MelangeUiInjectorProvider
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceTestHelper
import org.eclipse.core.resources.IProject
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.ui.testing.util.IResourcesSetupUtil
import org.junit.After
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import org.junit.Test

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class EcoreTest extends AbstractXtextTests
{
	@Inject WorkspaceTestHelper helper
	IProject melangeProject
	static final String PROJECT_NAME = "fr.inria.diverse.melange.tests.ecore.main"
	static final String MELANGE_FILE = PROJECT_NAME+"/src/fr/inria/diverse/melange/tests/ecore/main.melange"
	
	@Before
	override setUp() {
		helper.setTargetPlatform
		if (!helper.projectExists(PROJECT_NAME)) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			
			melangeProject = helper.deployMelangeProject(PROJECT_NAME,"tests-inputs/fr.inria.diverse.melange.tests.ecore.main.zip")
			
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
	def void test0NoErrorsInWorkspace() {
		helper.generateAll(MELANGE_FILE)
		IResourcesSetupUtil::waitForAutoBuild
		//Genmodel doesn't like generating EcoreMT.ecore
//		helper.assertNoMarkers 
		
		helper.assertProjectExists(PROJECT_NAME)
		helper.assertProjectExists("fr.inria.diverse.melange.tests.ecore.ecore")
	}
	
	@Test
	def void test1Generation() {
		
		val SRC_GEN = "src-gen"
		val MELANGE_PKG = "fr/inria/diverse/melange/tests/ecore"
		val BASE_PKG ='''«PROJECT_NAME»/«SRC_GEN»/«MELANGE_PKG»'''
		val ADAPTER_PKG = "ecore/adapters/ecoremt"
		
	// Main package
		// StandaloneSetup
		helper.assertFileExists('''«BASE_PKG»/StandaloneSetup.java''')
		//Transfo
		helper.assertFileExists('''«BASE_PKG»/testListClassifiersCount.java''')
		helper.assertFileExists('''«BASE_PKG»/loadEcore.java''')
		helper.assertFileExists('''«BASE_PKG»/test.java''')
		//Languages
		helper.assertFileExists('''«BASE_PKG»/Ecore.java''')
		//ModelTypes
		helper.assertFileExists('''«BASE_PKG»/EcoreMT.java''')
		
	// SubPackagesTest.adapters.SubPackagesTestMT package
		// LanguageAdapter, MTFactory
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/EcoreAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/EcoreMTAdaptersFactory.java''')
		// AdapterFactory
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EcoreFactoryAdapter.java''')
		// Adapters
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EAnnotationAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EAttributeAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EClassAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EClassifierAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EcoreFactoryAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EDataTypeAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EEnumAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EEnumLiteralAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EFactoryAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EGenericTypeAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EModelElementAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/ENamedElementAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EOperationAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EPackageAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EParameterAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EReferenceAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/EStructuralFeatureAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/ETypedElementAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/ecore/ETypeParameterAdapter.java''')
	}
	
	@Test
	def void test2Parsing() {
		helper.assertNoMarkers(MELANGE_FILE)
	}
}