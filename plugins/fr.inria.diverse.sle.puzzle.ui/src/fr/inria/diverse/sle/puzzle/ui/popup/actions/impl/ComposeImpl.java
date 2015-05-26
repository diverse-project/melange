package fr.inria.diverse.sle.puzzle.ui.popup.actions.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLClassLoader;
import java.util.Collections;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.mapping.MappingRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;
import org.xml.sax.SAXException;

import puzzle.Composition;

import com.google.inject.Inject;
import com.google.inject.Injector;

import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.melange.MelangeStandaloneSetup;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.sle.puzzle.compatibilitychecker.impl.CompatibilityChecker;
import fr.inria.diverse.sle.puzzle.compatibilitychecker.impl.PuzzleDiagnosis;
import fr.inria.diverse.sle.puzzle.merge.impl.PuzzleMerge;

import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class ComposeImpl {

	private static ComposeImpl instance;
	private String workspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
	private IResource compositionModel;
	private @Inject JvmTypeReferenceBuilder.Factory builderFactory;
	@Inject IResourceSetProvider resourceSetProvider;
	
	private ComposeImpl() {

	}

	public static ComposeImpl getInstance() {
		if (instance == null)
			instance = new ComposeImpl();
		return instance;
	}

	public void compose(IResource puzzleFile) throws SAXException, IOException,
			ParserConfigurationException, CoreException, IncompatibleLanguagesException {
		compositionModel = puzzleFile;
		
		Injector injector = new MelangeStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
//		XtextResourceSet resourceSet = (XtextResourceSet) resourceSetProvider.get(puzzleFile.getProject());
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		((XtextResourceSet) resourceSet).setClasspathURIContext(URLClassLoader
				.getSystemClassLoader());
		
		String platformUri = "platform:/resource/" + compositionModel.getProject().getName() + "/" + compositionModel.getProjectRelativePath();
		System.out.println("platformUri: " + platformUri);
		
		URI resouceURI = URI.createURI(platformUri);
		System.out.println("resouceURI: " + resouceURI);
		
		Resource resource = resourceSet.getResource(resouceURI, true);
//		EcoreUtil.resolveAll(resource);
		ModelTypingSpace modelTypingSpace = (ModelTypingSpace) resource.getContents().get(0);
		
		Composition composition = null;
		for(Element _element : modelTypingSpace.getElements()){
			if(_element instanceof Composition){
				composition = (Composition)_element;
				break;
			}
		}
		
		System.out.println(composition);
		refreshProjects();
	}

	public Composition loadLangaugeComposition(String filePath) {
		Injector injector = new MelangeStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		((XtextResourceSet) resourceSet).setClasspathURIContext(URLClassLoader
				.getSystemClassLoader());
		
		URI resouceURI = URI.createFileURI(filePath);
		Resource resource = resourceSet.getResource(resouceURI, true);
		EcoreUtil.resolveAll(resource);
		return (Composition) resource.getContents().get(0);
	}
	
	
	// -----------------------------------------------------------
	// File management utilities
	// -----------------------------------------------------------
	
	/**
	 * Generates the corresponding GenModel file for an ecore package in the parameter
	 * @param ePackage
	 * @throws IOException 
	 */
	private void generateGenmodelFile(EPackage rootPackage, String ecoreLocation, String genModelLocation, String projectName, String languageName) throws IOException {
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.setEditDirectory("/" + projectName + ".edit/src");
		genModel.setEditPluginID(projectName + ".edit");
		genModel.setEditDirectory("/" + projectName + ".editor/src");
		genModel.setEditPluginID(projectName + ".editor");
        genModel.setModelDirectory("/" + projectName + "/src");
        genModel.setModelPluginID(projectName + ".tests");
        genModel.setOperationReflection(true);
        genModel.setTestsDirectory("/" + projectName + ".tests/src");
        genModel.setTestsPluginID(projectName);
        genModel.getForeignModel().add(new Path(ecoreLocation).lastSegment());
        genModel.setModelName(languageName);
        genModel.setRootExtendsInterface("org.eclipse.emf.ecore.EObject");
        genModel.initialize(Collections.singleton(rootPackage));
        genModel.setCanGenerate(true);
        
        GenPackage genPackage = (GenPackage)genModel.getGenPackages().get(0);
        genPackage.setPrefix(rootPackage.getNsPrefix());

        URI genModelURI = URI.createFileURI(genModelLocation);
        final XMIResourceImpl genModelResource = new XMIResourceImpl(genModelURI);
        genModelResource.getContents().add(genModel);
        genModelResource.save(Collections.EMPTY_MAP);
        
        genModel.reconcile();
    	genModel.setCanGenerate(true);
    	genModel.setValidateModel(true);

	    Generator generator = new Generator();
	    generator.setInput(genModel);
	    generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, "model project", new BasicMonitor.Printing(System.out));
	}
	
	/**
	 * Creates the class path file 
	 * @param aspectsProject
	 * @throws FileNotFoundException 
	 */
	private void createClasspath(IProject aspectsProject) throws FileNotFoundException {
		File classPathFile = new File(aspectsProject.getLocation().toString() + "/.classpath");
		PrintWriter out = new PrintWriter( classPathFile );
		
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("	<classpath>");
		out.println("		<classpathentry kind=\"src\" path=\"src\"/>");
		out.println("		<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.6\"/>");
		out.println("		<classpathentry kind=\"con\" path=\"org.eclipse.pde.core.requiredPlugins\"/>");
		out.println("		<classpathentry kind=\"src\" path=\"xtend-gen\"/>");
		out.println("		<classpathentry kind=\"output\" path=\"bin\"/>");
		out.println("	</classpath>");
		
		out.close();
		
		File xtendGen = new File(aspectsProject.getLocation().toString() + "/xtend-gen");
		if(!xtendGen.exists()){
			xtendGen.mkdir();
		}
	}
	
	/**
	 * Creates the project descriptor file
	 * @param project
	 * @throws FileNotFoundException
	 */
	private void createProjectDescriptor(IProject project) throws FileNotFoundException{
		File projectDescriptionFile = new File(project.getLocation().toString() + "/.project");
		PrintWriter out = new PrintWriter( projectDescriptionFile );
		
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("	<projectDescription>");
		out.println("		<name>" + project.getName() + "</name>");
		out.println("		<comment></comment>");
		out.println("		<projects></projects>");
		out.println("		<buildSpec>");
		out.println("			<buildCommand>");
		out.println("				<name>org.eclipse.xtext.ui.shared.xtextBuilder</name>");
		out.println("				<arguments></arguments>");
		out.println("			</buildCommand>");
		out.println("			<buildCommand>");
		out.println("				<name>org.eclipse.jdt.core.javabuilder</name>");
		out.println("				<arguments></arguments>");
		out.println("			</buildCommand>");
		out.println("			<buildCommand>");
		out.println("				<name>org.eclipse.pde.ManifestBuilder</name>");
		out.println("				<arguments></arguments>");
		out.println("			</buildCommand>");
		out.println("			<buildCommand>");
		out.println("				<name>org.eclipse.pde.SchemaBuilder</name>");
		out.println("				<arguments></arguments>");
		out.println("			</buildCommand>");
		out.println("		</buildSpec>");
		out.println("		<natures>");
		out.println("			<nature>org.eclipse.pde.PluginNature</nature>");
		out.println("			<nature>org.eclipse.jdt.core.javanature</nature>");
		out.println("			<nature>org.eclipse.xtext.ui.shared.xtextNature</nature>");
		out.println("		</natures>");
		out.println("	</projectDescription>");
		
		out.close();
	}
	
	/**
	 * Refreshes the project containing the definition model so the results can be
	 * automatically visualized.
	 * @throws CoreException
	 */
	private void refreshProjects() throws CoreException{
		for(IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()){
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
		}
	}
}
