package fr.inria.diverse.melange.tests.eclipse

import com.google.common.base.Charsets
import com.google.common.io.CharStreams
import fr.inria.diverse.melange.MelangeUiInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.OnlyIfUI
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchManager
import org.eclipse.debug.ui.IDebugUIConstants
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants
import org.eclipse.pde.internal.core.natures.PDE
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.eclipse.xtext.junit4.ui.util.JavaProjectSetupUtil
import org.eclipse.xtext.ui.XtextProjectHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Before
import com.google.inject.Inject
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceTestHelper

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
public class SimpleFsmTest extends AbstractXtextTests
{
	IJavaProject melangeFsm
	IJavaProject aspectsFsm

	static final String MELANGE_PROJECT   = "FsmMelange"
	static final String MELANGE_FILE      =  MELANGE_PROJECT + "/src/melangefsm/Fsm.melange"
	static final String ASPECTS_PROJECT   = "FsmAspects"
	static final String LAUNCHCONFIG_NAME = "RunFsmMelange"
	static final String OUTPUT_FILE       = "output.txt"

	@Inject WorkspaceTestHelper helper
	
	@Before
	override void setUp() throws Exception {
		// We don't want to regenerate everything for each test
		if (!helper.projectExists(MELANGE_PROJECT)) {
			helper.setTargetPlatform
			super.setUp
	
			createAspectsProject
			createMelangeProject
			createTestFiles
			createRunOutputFile
			IResourcesSetupUtil::waitForAutoBuild
			helper.openEditor(MELANGE_FILE)
		}
	}

	@Test
	def void testNoProblemsInWorkspace() {
		helper.generateAll(MELANGE_FILE)
		
		aspectsFsm.project.findMarkers(IMarker::PROBLEM, true, IResource::DEPTH_INFINITE).forEach[
			println('''Found marker «getAttribute(IMarker::MESSAGE)» («getAttribute(IMarker::SEVERITY)»)''')
			assertFalse(
				"Unexpected marker: " + getAttribute(IMarker::MESSAGE),
				getAttribute(IMarker::SEVERITY) == IMarker::SEVERITY_ERROR
			)
		]

		melangeFsm.project.findMarkers(IMarker::PROBLEM, true, IResource::DEPTH_INFINITE).forEach[
			println('''Found marker «getAttribute(IMarker::MESSAGE)» («getAttribute(IMarker::SEVERITY)»)''')
			assertFalse(
				"Unexpected marker: " + getAttribute(IMarker::MESSAGE),
				getAttribute(IMarker::SEVERITY) == IMarker::SEVERITY_ERROR
			)
		]
	}

	@Test
	@OnlyIfUI
	def testRunningMelangeTransformationProducesExpectedOutput() {
//		melangeFsm = JavaProjectSetupUtil::createJavaProject(MELANGE_PROJECT)
		val manager = DebugPlugin::getDefault.launchManager
		val type = manager.getLaunchConfigurationType(IJavaLaunchConfigurationConstants::ID_JAVA_APPLICATION)
		val newLaunchConfig = type.newInstance(melangeFsm.project, LAUNCHCONFIG_NAME)
		newLaunchConfig.setAttribute(IJavaLaunchConfigurationConstants::ATTR_PROJECT_NAME, MELANGE_PROJECT)
		newLaunchConfig.setAttribute(IJavaLaunchConfigurationConstants::ATTR_MAIN_TYPE_NAME, "melangefsm.main")
		newLaunchConfig.setAttribute(IDebugUIConstants::ATTR_CAPTURE_IN_FILE, '''${workspace_loc:/«MELANGE_PROJECT»/«OUTPUT_FILE»}''')
		newLaunchConfig.doSave
		newLaunchConfig.launch(ILaunchManager::RUN_MODE, null)

		Job::getJobManager.join(ResourcesPlugin::FAMILY_AUTO_BUILD, null)

		val outputFile = melangeFsm.project.getFile(OUTPUT_FILE)
		outputFile.refreshLocal(IResource::DEPTH_ONE, null)
		val outputContent = CharStreams::toString(CharStreams::newReaderSupplier([outputFile.contents], Charsets::UTF_8))

		assertEquals(outputContent, '''Output: 14343
		'''.toString)
	}

	def private void createMelangeProject() throws Exception {
		melangeFsm = JavaProjectSetupUtil::createJavaProject(MELANGE_PROJECT)
		JavaProjectSetupUtil::addSourceFolder(melangeFsm, "src")
		JavaProjectSetupUtil::addSourceFolder(melangeFsm, "src-gen")
		IResourcesSetupUtil::addNature(melangeFsm.project, XtextProjectHelper::NATURE_ID)
		IResourcesSetupUtil::addNature(melangeFsm.project, PDE::PLUGIN_NATURE)
		IResourcesSetupUtil::addBuilder(melangeFsm.project, XtextProjectHelper::BUILDER_ID)
		IResourcesSetupUtil::addBuilder(melangeFsm.project, PDE::MANIFEST_BUILDER_ID)
		IResourcesSetupUtil::addBuilder(melangeFsm.project, PDE::SCHEMA_BUILDER_ID)
		JavaProjectSetupUtil::addToClasspath(melangeFsm, JavaCore::newContainerEntry(new Path("org.eclipse.xtend.XTEND_CONTAINER")))
		JavaProjectSetupUtil::addToClasspath(melangeFsm, JavaCore::newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")))

		IResourcesSetupUtil::createFile(MELANGE_PROJECT + "/META-INF/MANIFEST.MF", '''
		Manifest-Version: 1.0
		Bundle-ManifestVersion: 2
		Bundle-Name: «MELANGE_PROJECT»
		Bundle-SymbolicName: «MELANGE_PROJECT»;singleton:=true
		Bundle-Version: 0.1.0.qualifier
		Require-Bundle: org.eclipse.emf.ecore.xmi;bundle-version="2.10.2",
		 fr.inria.diverse.melange.lib;bundle-version="0.1.0",
		 fr.inria.diverse.melange.adapters;bundle-version="0.1.0",
		 fr.inria.diverse.melange.resource;bundle-version="0.1.0",
		 fr.inria.diverse.melange.examples.metamodels.fsm;bundle-version="0.1.0",
		 «ASPECTS_PROJECT»;bundle-version="0.1.0"
		Bundle-RequiredExecutionEnvironment: JavaSE-1.7
		''')
		IResourcesSetupUtil::createFile(MELANGE_PROJECT + "/build.properties", '''
		source.. = src-gen/,\
					src/
		bin.includes = META-INF/,\
						plugin.xml

		''')
	}

	def private void createAspectsProject() throws Exception {
		aspectsFsm = JavaProjectSetupUtil::createJavaProject(ASPECTS_PROJECT)
		JavaProjectSetupUtil::addSourceFolder(aspectsFsm, "src")
		JavaProjectSetupUtil::addSourceFolder(aspectsFsm, "xtend-gen")
		IResourcesSetupUtil::addNature(aspectsFsm.project, XtextProjectHelper::NATURE_ID)
		IResourcesSetupUtil::addNature(aspectsFsm.project, PDE::PLUGIN_NATURE)
		IResourcesSetupUtil::addBuilder(aspectsFsm.project, XtextProjectHelper::BUILDER_ID)
		IResourcesSetupUtil::addBuilder(aspectsFsm.project, PDE::MANIFEST_BUILDER_ID)
		IResourcesSetupUtil::addBuilder(aspectsFsm.project, PDE::SCHEMA_BUILDER_ID)
		JavaProjectSetupUtil::addToClasspath(aspectsFsm, JavaCore::newContainerEntry(new Path("org.eclipse.xtend.XTEND_CONTAINER")))
		JavaProjectSetupUtil::addToClasspath(aspectsFsm, JavaCore::newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")))

		IResourcesSetupUtil::createFile(ASPECTS_PROJECT + "/META-INF/MANIFEST.MF", '''
		Manifest-Version: 1.0
		Bundle-ManifestVersion: 2
		Bundle-Name: «ASPECTS_PROJECT»
		Bundle-SymbolicName: «ASPECTS_PROJECT»;singleton:=true
		Bundle-Version: 0.1.0.qualifier
		Require-Bundle: org.eclipse.emf.ecore.xmi;bundle-version="2.10.2",
		 fr.inria.diverse.k3.al.annotationprocessor.plugin;bundle-version="3.1.0";visibility:=reexport,
		 fr.inria.diverse.melange.examples.metamodels.fsm;bundle-version="0.1.0"
		Bundle-RequiredExecutionEnvironment: JavaSE-1.7
		Export-Package: aspectsfsm
		''')
		IResourcesSetupUtil::createFile(ASPECTS_PROJECT + "/build.properties", '''
		source.. = xtend-gen/,\
					src/
		bin.includes = META-INF/,

		''')
	}

	def private void createTestFiles() throws Exception {
		IResourcesSetupUtil::createFile(MELANGE_FILE, '''
		package melangefsm

		language Fsm {
			syntax "platform:/plugin/fr.inria.diverse.melange.examples.metamodels.fsm/model/FSM.ecore"
			with aspectsfsm.ExecutableFsmAspect
			with aspectsfsm.ExecutableStateAspect
			with aspectsfsm.ExecutableTransitionAspect
			exactType FsmMT
		}

		transformation foo(FsmMT m) {
			val root = m.contents.head as melangefsm.fsmmt.fsm.FSM
			print("Output: ")
			root.execute("adcdc")
			println
		}

		@Main
		transformation main() {
			val m = Fsm.load("input/Simple.fsm")
			foo.call(m)
		}
		''')
		IResourcesSetupUtil::createFile(ASPECTS_PROJECT + "/src/aspectsfsm/AspectsFsm.xtend", '''
		package aspectsfsm

		import fsm.FSM
		import fsm.State
		import fsm.Transition

		import fr.inria.diverse.k3.al.annotationprocessor.Aspect

		import static extension aspectsfsm.ExecutableFsmAspect.*
		import static extension aspectsfsm.ExecutableStateAspect.*
		import static extension aspectsfsm.ExecutableTransitionAspect.*

		@Aspect(className = FSM)
		class ExecutableFsmAspect
		{
			public State current

			def void execute(String input) {
				if (_self.current == null)
					_self.current = _self.initialState

				for (i : 0 ..< input.length) {
					try
					{
						_self.current.step(input.charAt(i))
					} catch (NoFireableTransition e) {
						println("No fireable transition in " + _self.current.name + " for input " + input.charAt(i))
						return
					} catch (NonDeterminism e) {
						println("Non-determinism in " + _self.current.name + " for input " + input.charAt(i))
						return
					}
				}
			}
		}

		@Aspect(className = State)
		class ExecutableStateAspect
		{
			def void step(char c) {
				val validTrans = _self.outgoingTransition.filter[input.equals(String.valueOf(c))]

				if (validTrans.empty)
					throw new NoFireableTransition
				if (validTrans.size > 1)
					throw new NonDeterminism

				validTrans.head.fire
			}
		}

		@Aspect(className = Transition)
		class ExecutableTransitionAspect
		{
			def void fire() {
				print(_self.output)
				_self.source.owningFSM.current = _self.target
			}
		}

		abstract class FsmException extends Exception {}
		class NoFireableTransition extends FsmException {}
		class NonDeterminism extends FsmException {}
		''')
		IResourcesSetupUtil::createFile(MELANGE_PROJECT + "/input/Simple.fsm", '''
		<?xml version="1.0" encoding="UTF-8"?>
		<fsm:FSM xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:fsm="http://fsm/" initialState="//@ownedState.0" finalState="//@ownedState.2 //@ownedState.3">
		  <ownedState name="1">
		    <outgoingTransition target="//@ownedState.1" input="a" output="1"/>
		    <outgoingTransition target="//@ownedState.2" input="b" output="2"/>
		  </ownedState>
		  <ownedState name="2" incomingTransition="//@ownedState.0/@outgoingTransition.0 //@ownedState.2/@outgoingTransition.0">
		    <outgoingTransition target="//@ownedState.2" input="d" output="4"/>
		    <outgoingTransition target="//@ownedState.3" input="e" output="5"/>
		  </ownedState>
		  <ownedState name="3" incomingTransition="//@ownedState.0/@outgoingTransition.1 //@ownedState.1/@outgoingTransition.0">
		    <outgoingTransition target="//@ownedState.1" input="c" output="3"/>
		  </ownedState>
		  <ownedState name="4" incomingTransition="//@ownedState.1/@outgoingTransition.1"/>
		</fsm:FSM>
		''')
	}

	def private void createRunOutputFile() throws Exception {
		IResourcesSetupUtil::createFile('''«MELANGE_PROJECT»/«OUTPUT_FILE»''', "")
	}
}
