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
import org.eclipse.jdt.core.JavaCore
import java.nio.file.Files
import java.nio.file.Paths

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class MiniFsmTest extends AbstractXtextTests
{
	@Inject WorkspaceTestHelper helper
	IProject melangeProject
	static final String PROJECT_NAME = "fr.inria.diverse.melange.fsm"
	static final String MELANGE_FILE = PROJECT_NAME+"/src/fr/inria/diverse/melanger/Main.melange"
	
	@Before
	override setUp() {
		helper.setTargetPlatform
		if (!helper.projectExists(PROJECT_NAME)) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			
			helper.deployMelangeProject("fr.inria.diverse.minifsm","tests-inputs/minifsm/fr.inria.diverse.minifsm.zip")
			helper.deployMelangeProject("fr.inria.diverse.minifsm.interpreter","tests-inputs/minifsm/fr.inria.diverse.minifsm.interpreter.zip")
			helper.deployMelangeProject("fr.inria.diverse.minilang","tests-inputs/minifsm/fr.inria.diverse.minilang.zip")
			helper.deployMelangeProject("fr.inria.diverse.minilang.interpreter","tests-inputs/minifsm/fr.inria.diverse.minilang.interpreter.zip")
			melangeProject = helper.deployMelangeProject(PROJECT_NAME,"tests-inputs/minifsm/fr.inria.diverse.melange.fsm.zip")
			
			IResourcesSetupUtil::waitForAutoBuild
			helper.cleanAll(MELANGE_FILE)
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
		helper.assertNoMarkers
		
		helper.assertProjectExists(PROJECT_NAME)
		helper.assertProjectExists("fr.inria.diverse.minifsm")
		helper.assertProjectExists("fr.inria.diverse.minifsm.interpreter")
		helper.assertProjectExists("fr.inria.diverse.minilang")
		helper.assertProjectExists("fr.inria.diverse.minilang.interpreter")
		
		helper.assertProjectExists("fr.inria.diverse.melanger.minifsm")
		helper.assertProjectExists("fr.inria.diverse.melanger.miniactionlang")
		helper.assertProjectExists("fr.inria.diverse.melanger.melangedlang")
	}
	
	@Test
	def void test1Exec() {
		createFiles
		IResourcesSetupUtil::waitForAutoBuild
		helper.assertNoMarkers
		
		val expected = new String(Files.readAllBytes(Paths.get("tests-inputs/minifsm/output.txt")))
		
		val outputContent = helper.runMainClass(melangeProject, "test.Main")
		assertEquals(expected, outputContent)
	}
	
	private def createFiles() {
		IResourcesSetupUtil::createFile(
			PROJECT_NAME+"/model/"+"99bottles.minifsm", 
			new String(Files.readAllBytes(Paths.get("tests-inputs/minifsm/99bottles.minifsm")))
		)
		
		IResourcesSetupUtil::createFile(PROJECT_NAME+"/src/test/"+"Main.java", '''
		package test;
		
		import org.eclipse.emf.common.util.BasicEList;
		import org.eclipse.emf.common.util.URI;
		import org.eclipse.emf.ecore.EPackage;
		import org.eclipse.emf.ecore.resource.Resource;
		import org.eclipse.emf.ecore.resource.ResourceSet;
		import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
		import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
		
		import fr.inria.diverse.melanger.melangedlang.aspects.FSMAspect;
		import fr.inria.diverse.melanger.melangedlang.minifsm.FSM;
		
		public class Main {
			public static void main(String[] args) {
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*",new XMIResourceFactoryImpl());
				EPackage.Registry.INSTANCE.put(
			    	fr.inria.diverse.melanger.melangedlang.minifsm.MinifsmPackage.eNS_URI,
			    	fr.inria.diverse.melanger.melangedlang.minifsm.MinifsmPackage.eINSTANCE
			    );
				ResourceSet rs = new ResourceSetImpl();
				Resource r = rs.getResource(URI.createURI("model/99bottles.minifsm"),true);
				FSM root = (FSM) r.getContents().get(0);
				BasicEList<String> events = new BasicEList<String>();
				events.add("one event");
				FSMAspect.execute(root,events);
			}
		}
		''')
	}
}