package fr.inria.diverse.melange.tests.eclipse.shared

import com.google.common.base.Charsets
import com.google.common.io.CharStreams
import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import java.io.ByteArrayInputStream
import java.util.List
import java.util.zip.ZipFile
import org.eclipse.core.expressions.IEvaluationContext
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchManager
import org.eclipse.debug.ui.IDebugUIConstants
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.Match
import org.eclipse.emf.compare.diff.DefaultDiffEngine
import org.eclipse.emf.compare.diff.FeatureFilter
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants
import org.eclipse.jdt.ui.JavaUI
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.viewers.TreeViewer
import org.eclipse.pde.internal.core.natures.PDE
import org.eclipse.ui.ISources
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.commands.ICommandService
import org.eclipse.ui.dialogs.IOverwriteQuery
import org.eclipse.ui.handlers.IHandlerService
import org.eclipse.ui.internal.wizards.datatransfer.ZipLeveledStructureProvider
import org.eclipse.ui.part.FileEditorInput
import org.eclipse.ui.views.contentoutline.IContentOutlinePage
import org.eclipse.ui.wizards.datatransfer.ImportOperation
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.eclipse.xtext.junit4.ui.util.JavaProjectSetupUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage
import org.eclipse.xtext.ui.editor.utils.EditorUtils
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider
import org.junit.Assert
import org.eclipse.swt.widgets.Display
import org.eclipse.pde.core.target.ITargetPlatformService
import org.eclipse.pde.core.target.ITargetDefinition
import org.eclipse.core.runtime.Platform
import java.util.List
import org.eclipse.pde.core.target.ITargetLocation
import java.util.ArrayList
import java.util.Set
import java.io.File
import java.util.HashSet
import org.eclipse.osgi.internal.framework.EquinoxBundle
import org.eclipse.osgi.storage.BundleInfo.Generation
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.pde.core.target.LoadTargetDefinitionJob
import org.eclipse.pde.internal.core.target.TargetPlatformService
import org.osgi.framework.Bundle

class WorkspaceTestHelper {
	static final String MELANGE_CMD_GENERATE_ALL        = "fr.inria.diverse.melange.GenerateAll"
	static final String MELANGE_CMD_GENERATE_ADAPTERS   = "fr.inria.diverse.melange.GenerateAdapters"
	static final String MELANGE_CMD_GENERATE_LANGUAGES  = "fr.inria.diverse.melange.GenerateLanguages"
	static final String MELANGE_CMD_GENERATE_INTERFACES = "fr.inria.diverse.melange.GenerateInterfaces"
	static final String MELANGE_CMD_CLEAN_ALL           = "fr.inria.diverse.melange.CleanAll"

	static final String MELANGE_EDITOR_ID = "fr.inria.diverse.melange.Melange"
	
	@Inject XtextResourceSetProvider rsProvider

	def void init() {
		Display.^default.syncExec(new Runnable(){
				override run() {
					PlatformUI::workbench.showPerspective(JavaUI.ID_PERSPECTIVE, PlatformUI.workbench.activeWorkbenchWindow)
					closeWelcomePage
				}
			})
	}

	def IProject getProject(String projectName) {
		return ResourcesPlugin::workspace.root.getProject(projectName)
	}

	def boolean projectExists(String projectName) {
		return getProject(projectName).exists
	}

	def IProject deployMelangeProject(String projectName, String zipLocation) {
		val newProject = JavaProjectSetupUtil::createJavaProject(projectName)
		JavaProjectSetupUtil::addSourceFolder(newProject, "src")
		JavaProjectSetupUtil::addSourceFolder(newProject, "src-gen")
		IResourcesSetupUtil::addNature(newProject.project, XtextProjectHelper::NATURE_ID)
		IResourcesSetupUtil::addNature(newProject.project, PDE::PLUGIN_NATURE)
		IResourcesSetupUtil::addBuilder(newProject.project, XtextProjectHelper::BUILDER_ID)
		IResourcesSetupUtil::addBuilder(newProject.project, PDE::MANIFEST_BUILDER_ID)
		IResourcesSetupUtil::addBuilder(newProject.project, PDE::SCHEMA_BUILDER_ID)
		JavaProjectSetupUtil::addToClasspath(newProject,
			JavaCore::newContainerEntry(new Path("org.eclipse.xtend.XTEND_CONTAINER")))
		JavaProjectSetupUtil::addToClasspath(newProject,
			JavaCore::newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")))

		val zip = new ZipFile(zipLocation)
		val structureProvider = new ZipLeveledStructureProvider(zip)
		val queryOverwrite = new IOverwriteQuery() {
			override queryOverwrite(String file) { return ALL }
		}

		new ImportOperation(
			newProject.project.fullPath,
			structureProvider.root,
			structureProvider,
			queryOverwrite
		).run(new NullProgressMonitor)

		zip.close
		return newProject.project
	}

	def void generateAll(String melangeFile) {
		invokeMelangeCommand(MELANGE_CMD_GENERATE_ALL, melangeFile)
	}

	def void generateAdapters(String melangeFile) {
		invokeMelangeCommand(MELANGE_CMD_GENERATE_ADAPTERS, melangeFile)
	}
	
	def void generateLanguages(String melangeFile) {
		invokeMelangeCommand(MELANGE_CMD_GENERATE_LANGUAGES, melangeFile)
	}
	
	def void generateInterfaces(String melangeFile) {
		invokeMelangeCommand(MELANGE_CMD_GENERATE_INTERFACES, melangeFile)
	}
	
	def void cleanAll(String melangeFile) {
		invokeMelangeCommand(MELANGE_CMD_CLEAN_ALL, melangeFile)
	}

	def void closeWelcomePage() {
		if (PlatformUI.workbench.introManager.intro !== null) {
			PlatformUI.workbench.introManager.closeIntro(PlatformUI.workbench.introManager.intro)
		}
	}

	def void assertNoMarkers() {
		ResourcesPlugin::workspace.root.projects.forEach[project |
			project.findMarkers(IMarker::PROBLEM, true, IResource::DEPTH_INFINITE).forEach[
				println('''Found marker «getAttribute(IMarker::MESSAGE)» («getAttribute(IMarker::SEVERITY)»)''')
				Assert.assertFalse(
					"Unexpected marker: " + getAttribute(IMarker::MESSAGE),
					getAttribute(IMarker::SEVERITY) == IMarker::SEVERITY_ERROR
				)
			]
		]
	}
	
	def void assertNoMarkers(String filename) {
		val mlgFile = ResourcesPlugin::workspace.root.getFile(new Path(filename))
		mlgFile.findMarkers(IMarker::PROBLEM, true, IResource::DEPTH_INFINITE).forEach[
				println('''Found marker «getAttribute(IMarker::MESSAGE)» («getAttribute(IMarker::SEVERITY)»)''')
				Assert.assertFalse(
					"Unexpected marker: " + getAttribute(IMarker::MESSAGE),
					getAttribute(IMarker::SEVERITY) == IMarker::SEVERITY_ERROR
				)
			]
	}

	def XtextEditor openEditor(String melangeFile) {
		try {
			val ws = ResourcesPlugin::workspace
			val mlgFile = ws.root.getFile(new Path(melangeFile))
			val wb = PlatformUI::workbench
			val openEditor = wb.activeWorkbenchWindow.activePage
				.openEditor(new FileEditorInput(mlgFile), MELANGE_EDITOR_ID);
			val xtextEditor = EditorUtils::getXtextEditor(openEditor)
			if (xtextEditor !== null) {
				xtextEditor.selectAndReveal(0, 0)
				xtextEditor.internalSourceViewer.setSelectedRange(0, 0)
				xtextEditor.internalSourceViewer.textWidget.setFocus
				return xtextEditor
			}
		} catch (Exception e) {
			e.printStackTrace
			Assert.fail(e.message)
		}

		return null
	}
	
	def TreeViewer getOutline(String melangeFile){
		val editor = openEditor(melangeFile)
		val outlinePage = editor.getAdapter(typeof(IContentOutlinePage)) as OutlinePage
		val treeViewer = outlinePage.treeViewer
		return treeViewer
	}

	/**
	 * Usage : projectName/folder/file
	 */
	def void assertFileExists(String filename) {
		val ws = ResourcesPlugin::workspace
		Assert.assertTrue(
			"Cannot find file " + filename,
			ws.root.getFile(new Path(filename)).exists
		)
	}
	
	/**
	 * Usage : projectName/folder/file
	 */
	def void assertFileDontExists(String filename) {
		val ws = ResourcesPlugin::workspace
		Assert.assertFalse(
			"Found file " + filename,
			ws.root.getFile(new Path(filename)).exists
		)
	}
	
	/**
	 * Check if {@link project} exist
	 */
	def void assertProjectExists(String project){
		val ws = ResourcesPlugin::workspace
		Assert.assertTrue(
			"Cannot find project " + project,
			ws.root.getProject(project).exists
		)
	}

	private def void invokeMelangeCommand(String commandId, String melangeFile) {
		val ws = ResourcesPlugin::workspace
		val wb = PlatformUI::workbench
		val mlgFile = ws.root.getFile(new Path(melangeFile))
		val commandService = wb.getService(typeof(ICommandService)) as ICommandService
		val handlerService = wb.getService(typeof(IHandlerService)) as IHandlerService

		val command = commandService.getCommand(commandId)
		val executionEvent = handlerService.createExecutionEvent(command, null)
		val context = executionEvent.applicationContext as IEvaluationContext

		context.parent.addVariable(ISources.ACTIVE_MENU_SELECTION_NAME,
			new StructuredSelection(mlgFile))

		command.executeWithChecks(executionEvent)
		IResourcesSetupUtil::waitForAutoBuild
	}
	
	/**
	 * Check for each aspect from {@link aspects} that K3-generated files are inside {@link project}
	 * 
	 * @param aspects Pairs of [AspectName->AspectedClass]
	 */
	def void assertK3AspectsExists(List<Pair<String,String>> aspects, String project){
		
		val ASPECTS_NS = project+".aspects"
		val ASPECTS_FOLDER = ASPECTS_NS.replaceAll("\\.","/")
		val SRC_GEN = "src-gen"
		
		aspects.forEach[asp |
			val aspectName = asp.key
			val targetClass = asp.value
			val aspect     = '''«project»/«SRC_GEN»/«ASPECTS_FOLDER»/«aspectName».java'''
			val context    = '''«project»/«SRC_GEN»/«ASPECTS_FOLDER»/«aspectName»«targetClass»AspectContext.java'''
			val properties = '''«project»/«SRC_GEN»/«ASPECTS_FOLDER»/«aspectName»«targetClass»AspectProperties.java'''
			assertFileExists(aspect)
			assertFileExists(context)
			assertFileExists(properties)
		]
	}
	
	/**
	 * Check for each aspect from {@link aspects} that K3-generated files are NOT inside {@link project}
	 * 
	 * @param aspects Pairs of [AspectName->AspectedClass]
	 */
	def void assertK3AspectsDontExists(List<Pair<String,String>> aspects, String project){
		
		val ASPECTS_NS = project+".aspects"
		val ASPECTS_FOLDER = ASPECTS_NS.replaceAll("\\.","/")
		val SRC_GEN = "src-gen"
		
		aspects.forEach[asp |
			val aspectName = asp.key
			val targetClass = asp.value
			val aspect     = '''«project»/«SRC_GEN»/«ASPECTS_FOLDER»/«aspectName».java'''
			val context    = '''«project»/«SRC_GEN»/«ASPECTS_FOLDER»/«aspectName»«targetClass»AspectContext.java'''
			val properties = '''«project»/«SRC_GEN»/«ASPECTS_FOLDER»/«aspectName»«targetClass»AspectProperties.java'''
			assertFileDontExists(aspect)
			assertFileDontExists(context)
			assertFileDontExists(properties)
		]
	}

	/**
	 * Creates and lauches a new run configuration for {@link project}
	 * using {@link mainClass} as the main Java class.
	 *
	 * @return the produced console output
	 */
	def String runMainClass(IProject project, String mainClass) {
		val outputFileName = "output.txt"
		val manager = DebugPlugin::getDefault.launchManager
		val type = manager.getLaunchConfigurationType(IJavaLaunchConfigurationConstants::ID_JAVA_APPLICATION)
		val newLaunchConfig = type.newInstance(project, "RunMainTransfo")
		newLaunchConfig.setAttribute(IJavaLaunchConfigurationConstants::ATTR_PROJECT_NAME, project.name)
		newLaunchConfig.setAttribute(IJavaLaunchConfigurationConstants::ATTR_MAIN_TYPE_NAME, mainClass)
		newLaunchConfig.setAttribute(IDebugUIConstants::ATTR_CAPTURE_IN_FILE, '''${workspace_loc:/«project.name»/«outputFileName»}''')
		newLaunchConfig.doSave

		val outputFile = project.getFile(outputFileName)
		if (!outputFile.exists)
			outputFile.create(new ByteArrayInputStream("".bytes), true, null)

		newLaunchConfig.launch(ILaunchManager::RUN_MODE, null)

		Job::getJobManager.join(ResourcesPlugin::FAMILY_AUTO_BUILD, null)

		outputFile.refreshLocal(IResource::DEPTH_ONE, null)

		return CharStreams::toString(CharStreams::newReaderSupplier([outputFile.contents], Charsets::UTF_8))
	}

	/**
	 * Returns the EPackage for generated model type {@link mtName}
	 * in {@link project}
	 */
	def EPackage getMT(IProject project, String mtName) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI::createURI('''platform:/resource/«project.name»/model-gen/«mtName».ecore'''), true)

		return res.contents.head as EPackage
	}

	def void assertMatch(EPackage pkg, String refEcore) {
		val rs = new ResourceSetImpl
		val uri = URI::createURI(refEcore)
		val res = rs.getResource(uri, true)
		val ref = res.contents.head as EPackage

		val scope = new DefaultComparisonScope(pkg, ref, null)
		// We don't want to take order into account
		// We don't want to take eAnnotations (especially "aspect") into account
		val comparison = EMFCompare.builder().setDiffEngine(
			new DefaultDiffEngine() {
				override def FeatureFilter createFeatureFilter() {
					return new FeatureFilter() {
						override boolean isIgnoredReference(Match match, EReference ref) {
							return ref == EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS
							        || super.isIgnoredReference(match, ref)
						}

						override boolean checkForOrderingChanges(EStructuralFeature f) {
							return false
						}
					}
				}
			}
		).build.compare(scope)

		if (!comparison.differences.empty)
			Assert::fail(comparison.differences.join(", "))

		Assert::assertTrue(comparison.differences.empty)
	}
	
	/*
	 * Assert node contains at least pkg
	 */
	def void assertMatch(EPackage pkg, IOutlineNode node){
		
		Assert.assertEquals(pkg.name, node.text.toString)
		
		val subPack = pkg.ESubpackages
		val classes = pkg.EClassifiers
		val subNodes = node.children
		
		subPack.forEach[p |
			val n = subNodes.findFirst[text.toString == p.name]
			Assert.assertNotNull(n)
			assertMatch(p,n)
		]
		
		classes.forEach[c |
			val n = subNodes.findFirst[text.toString == c.name]
			Assert.assertNotNull(n)
			if(c instanceof EClass){
				assertMatch(c,n)
			}
		]
	}
	
	def void assertMatch(EClass cls, IOutlineNode node){
		
		Assert.assertEquals(cls.name, node.text.toString)
		
		val ref = cls.EAllReferences
		val att = cls.EAllAttributes
		val op  = cls.EAllOperations
		val subNodes = node.children
		
		ref.forEach[r |
			val n = subNodes.findFirst[text.toString == (r.name +" : "+ r.EType.name)]
			Assert.assertNotNull(n)
		]
		
		att.forEach[a |
			val n = subNodes.findFirst[text.toString == a.name +" : "+ a.EType.name]
			Assert.assertNotNull(n)
		]
		
		op.forEach[o |
			val n = subNodes.findFirst[text.toString == o.name +" : "+ o.EType.name]
			Assert.assertNotNull(n)
		]
	}
	
	def void assertMatch(String refEcore, IOutlineNode node){
		val rs = new ResourceSetImpl
		val uri = URI::createURI(refEcore)
		val res = rs.getResource(uri, true)
		val ref = res.contents.head as EPackage
		assertMatch(ref,node)
	}
	
	def ModelTypingSpace getResource(String projectName, String melangeFile){
		val melangeProject = getProject(projectName)
		val rs = rsProvider.get(melangeProject)
		val uri = URI::createPlatformResourceURI(melangeFile, true)
		val res = rs.getResource(uri, true) as DerivedStateAwareResource
		res.installDerivedState(false)
		return res.contents.head as ModelTypingSpace
	}
	
	def void debug(){
		ResourcesPlugin::workspace.root.projects.forEach[project |
	         println("Error markers: " + project.name)
	         project.findMarkers(IMarker::PROBLEM, true, IResource::DEPTH_INFINITE).forEach[ marker |
	             println("   Resource: " + marker.resource.name)
	             println("   Location: " + marker.getAttribute(IMarker::LOCATION))
	             println("   Message: " + marker.getAttribute(IMarker::MESSAGE) + "\n")
	         ]
	         
	         println("\n")
	         
	         println("Classpath: " + project.name)
		       val jProject = JavaCore.create(project)
		       val cp = new StringBuffer
		       jProject.getResolvedClasspath(false).forEach[entry|
		           cp.append(" "+entry.path.toString+"\n")
	       	]
			val str = cp.toString
			println(str)
	     ]
	}
	
	/**
	 * Sets a target platform in the test platform to get workspace builds OK
	 * with PDE
	 * 
	 * @throws Exception
	 */
	def void setTargetPlatform() throws Exception {
		val ITargetPlatformService tpService = TargetPlatformService.getDefault();
		val ITargetDefinition targetDef = tpService.newTarget();
		targetDef.setName("Tycho platform");
		val Bundle[] bundles = Platform.getBundle("org.eclipse.core.runtime").getBundleContext().getBundles();
		val List<ITargetLocation> bundleContainers = new ArrayList<ITargetLocation>();
		val Set<File> dirs = new HashSet<File>();
		for (Bundle bundle : bundles) {
			val EquinoxBundle bundleImpl = bundle as EquinoxBundle;
			val Generation generation = bundleImpl.getModule().getCurrentRevision().getRevisionInfo() as Generation;
			val File file = generation.getBundleFile().getBaseFile();
			val File folder = file.getParentFile();
			if (!dirs.contains(folder)) {
				dirs.add(folder);
				bundleContainers.add(tpService.newDirectoryLocation(folder.getAbsolutePath()));
			}
		}
		val ITargetLocation[] bundleContainersArray = bundleContainers
		targetDef.setTargetLocations(bundleContainersArray);
		targetDef.setArch(Platform.getOSArch());
		targetDef.setOS(Platform.getOS());
		targetDef.setWS(Platform.getWS());
		targetDef.setNL(Platform.getNL());
		// targetDef.setJREContainer()
		tpService.saveTargetDefinition(targetDef);

		val Job job = new LoadTargetDefinitionJob(targetDef);
		job.schedule();
		job.join();
	}	
}
