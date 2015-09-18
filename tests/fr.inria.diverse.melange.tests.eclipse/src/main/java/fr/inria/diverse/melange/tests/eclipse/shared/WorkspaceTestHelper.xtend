package fr.inria.diverse.melange.tests.eclipse.shared

import java.util.zip.ZipFile
import org.eclipse.core.expressions.IEvaluationContext
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.ui.JavaUI
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.pde.internal.core.natures.PDE
import org.eclipse.ui.ISources
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.commands.ICommandService
import org.eclipse.ui.dialogs.IOverwriteQuery
import org.eclipse.ui.handlers.IHandlerService
import org.eclipse.ui.internal.wizards.datatransfer.ZipLeveledStructureProvider
import org.eclipse.ui.part.FileEditorInput
import org.eclipse.ui.wizards.datatransfer.ImportOperation
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.eclipse.xtext.junit4.ui.util.JavaProjectSetupUtil
import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.utils.EditorUtils
import org.junit.Assert

class WorkspaceTestHelper {
	static final String MELANGE_CMD_GENERATE_ALL        = "fr.inria.diverse.melange.GenerateAll"
	static final String MELANGE_CMD_GENERATE_ADAPTERS   = "fr.inria.diverse.melange.GenerateAdapters"
	static final String MELANGE_CMD_GENERATE_LANGUAGES  = "fr.inria.diverse.melange.GenerateLanguages"
	static final String MELANGE_CMD_GENERATE_INTERFACES = "fr.inria.diverse.melange.GenerateInterfaces"
	static final String MELANGE_CMD_CLEAN_ALL           = "fr.inria.diverse.melange.CleanAll"

	static final String MELANGE_EDITOR_ID = "fr.inria.diverse.melange.Melange"

	def void init() {
		PlatformUI::workbench.showPerspective(JavaUI.ID_PERSPECTIVE, PlatformUI.workbench.activeWorkbenchWindow)
		closeWelcomePage
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

	def void assertFileExists(String filename) {
		val ws = ResourcesPlugin::workspace
		Assert.assertTrue(
			"Cannot find file " + filename,
			ws.root.getFile(new Path(filename)).exists
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
		IResourcesSetupUtil::reallyWaitForAutoBuild
	}
}
