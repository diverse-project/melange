package fr.inria.diverse.melange.puzzle

import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.PrintWriter
import java.util.ArrayList
import java.util.Hashtable
import javax.inject.Inject
import org.autorefactor.ui.OverlappingAspectsVO
import org.autorefactor.ui.OverridingAspectsVO
import org.autorefactor.ui.PrepareApplyRefactoringsJob
import org.autorefactor.ui.PropertiesSetVO
import org.autorefactor.ui.RefactoringPatternVO
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.jdt.core.IJavaElement
import org.eclipse.jdt.core.JavaCore
import org.eclipse.pde.internal.core.natures.PDE
import org.eclipse.xtext.resource.CompilerPhases
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import puzzle.Composition
import fr.inria.diverse.melange.processors.DispatchMelangeProcessor

/**
 * Language processor that resolves a composition written in Puzzle on top of Melange. 
 * @author David Mendez-Acuna
 * 
 * TODO: Commit and repo synchronization.
 * TODO: Organize the code in utils. Get a better modularization of the services.
 * TODO: Include the compatibility checking here!
 * TODO: Merge Puzzle' ModelUtils with Melange' ModelUtils
 * TODO: Case study: Java, C#, Timed, Composite, OCL, EVL, Core.
 */
class LanguagesMergingProcessor extends DispatchMelangeProcessor {
	
	@Inject extension EclipseProjectHelper
	@Inject extension MetamodelExtensions
	@Inject extension LanguageMergingEngine
	@Inject private JvmTypeReferenceBuilder.Factory typeReferenceFactory
	@Inject private CompilerPhases compilerPhases;
	
	private JvmTypeReferenceBuilder typeReferenceBuilder
	private IProject project
	private IProject targetProject
	private IWorkspaceRoot wsRoot
	private String compositionLanguageName
	private Hashtable<String, IJavaElement> cacheJavaElements = new Hashtable<String, IJavaElement>()

	def dispatch void postProcess(Composition composition) {
		
		if(composition.compositionExpressionComplete && 
			(composition.eResource as DerivedStateAwareResource).fullyInitialized &&
				!compilerPhases.isIndexing(composition.eResource as DerivedStateAwareResource)){
			
			project = composition.eResource.project
			wsRoot = project.workspace.root
			compositionLanguageName = composition.name
			typeReferenceBuilder = typeReferenceFactory.create(composition.eResource.resourceSet)
			
			if(!wsRoot.getProject(project.name + "." + compositionLanguageName).exists){
					targetProject = EclipseProjectHelper::createEclipseProject(
					project.name + "." + compositionLanguageName,
					#[JavaCore::NATURE_ID, PDE::PLUGIN_NATURE],
					#[JavaCore::BUILDER_ID,	PDE::MANIFEST_BUILDER_ID, PDE::SCHEMA_BUILDER_ID],
					#["src-gen", "xtend-gen"],
					#[],
					#["fr.inria.diverse.puzzle.annotations", 
						"fr.inria.diverse.k3.al.annotationprocessor.plugin"],
					#[],
					#[],
					new NullProgressMonitor
				)
			}else{
				targetProject = wsRoot.getProject(project.name + "." + compositionLanguageName)
			}
			
			val modelFolder = targetProject.getFolder("composition-gen")
			if(!modelFolder.exists)
				modelFolder.create(false, true, null)
			
			val xtendFolder = targetProject.getFolder("xtend-gen")
			if(!xtendFolder.exists)
				xtendFolder.create(false, true, null)	
			
			EclipseProjectHelper::cleanFolders(targetProject, #["composition-gen", "src-gen", "xtend-gen"]);
			EclipseProjectHelper::cleanFolders(project, #["src-gen"]);
			
			targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
			
			var ArrayList<RefactoringPatternVO> refactoringPatterns = newArrayList
			var ArrayList<OverlappingAspectsVO> overlappingAspects = newArrayList
			var ArrayList<OverridingAspectsVO> overridingAspects = newArrayList
			var LanguageVO language = composition.getStatements().evaluateCompositionExpression(refactoringPatterns, overlappingAspects, overridingAspects, targetProject, compositionLanguageName)
			
			
			for(OverlappingAspectsVO _aspecto : overlappingAspects){
				println("Overlapping Aspect: leftFile: " + _aspecto.leftFile +  " - rightFile: " + _aspecto.rightFile + " - mergedFile: " + _aspecto.mergedFile)
			}
			
			serializeEcoreFiles(language)
			var GenModel genModel = serializeGenmodelFiles(language)
			println("genModel " + genModel)
			composition.genModel = genModel
			genModel.generateCode
//		composition.addWarning("You need to generate the metamodel code *.*", MelangeValidationConstants::COMPOSITION_METAMODEL_NO_EMF_RUNTIME)

			val ws = targetProject.project.workspace.root
			
			// Loading the java elements in the overlapping aspects needed for the java AST refactoring
			var boolean mergedFixed = false
			var ArrayList<OverlappingAspectsVO> cleanListOverlappingAspects = overlappingAspects.removeRepeatedElements()
			var Hashtable<String, PropertiesSetVO> propertiesFiles = new Hashtable<String, PropertiesSetVO>()
			var Hashtable<String, String> mergedFiles = new Hashtable<String, String>()
			
			for(OverlappingAspectsVO _overlappingAspect : overlappingAspects){
				if(mergedFiles.get(_overlappingAspect.mergedFile) == null){
					println("overrideMethod " + _overlappingAspect.rightFile + " .. " + _overlappingAspect.mergedFile)
					overrideMethod(_overlappingAspect.rightFile, _overlappingAspect.mergedFile);
					mergedFiles.put(_overlappingAspect.mergedFile,_overlappingAspect.mergedFile);
				}
				
				var String aspectName = _overlappingAspect.leftAspect.aspectTypeRef.identifier.substring(
					_overlappingAspect.leftAspect.aspectTypeRef.identifier.lastIndexOf(".") + 1)
				
				var String mergedPropertiesFile = _overlappingAspect.mergedFile.replace(aspectName, aspectName + aspectName + "Properties")
				var String leftPropertiesFile = _overlappingAspect.rightFile.replace(aspectName, aspectName + aspectName + "Properties")
				var String rightPropertiesFile = _overlappingAspect.rightFile.replace(aspectName, aspectName + aspectName + "Properties")
				
				var PropertiesSetVO propertiesSet = propertiesFiles.get(mergedPropertiesFile)
				if(propertiesSet == null){
					propertiesSet = new PropertiesSetVO()
					propertiesSet.mergedPropertiesFile = mergedPropertiesFile
					propertiesSet.allPropertiesFiles.add(mergedPropertiesFile)
				}
				if(!propertiesSet.allPropertiesFiles.contains(leftPropertiesFile))
					propertiesSet.allPropertiesFiles.add(leftPropertiesFile)
				if(!propertiesSet.allPropertiesFiles.contains(rightPropertiesFile))
					propertiesSet.allPropertiesFiles.add(rightPropertiesFile)
				
				propertiesFiles.put(mergedPropertiesFile, propertiesSet)
				println("propertiesSet: " + propertiesSet)
				
				targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
				JavaCore.initializeAfterLoad(null)
				
				val String mergedPathString = _overlappingAspect.mergedFile.replace(ws.location.toString, "")
				var IJavaElement mergedElement = cacheJavaElements.get(mergedPathString)
				if(mergedElement == null){
					val IPath mergedPath = new Path(mergedPathString)
					mergedElement = JavaCore.create(ws.getFile(mergedPath))
					cacheJavaElements.put(mergedPathString, mergedElement)
				}
				
				val String leftPathString = _overlappingAspect.leftFile.replace(ws.location.toString, "")
				var IJavaElement extensionElement = cacheJavaElements.get(leftPathString)
				if(extensionElement == null){
					val IPath leftPath = new Path(leftPathString)
					val IFile leftFile = ws.getFile(leftPath);
					extensionElement = JavaCore.create(leftFile)
					cacheJavaElements.put(leftPathString, extensionElement)
				}
				
				val String righPathString = _overlappingAspect.rightFile.replace(ws.location.toString, "")
				var IJavaElement baseElement = cacheJavaElements.get(righPathString)
				if(baseElement == null){
					val IPath rightPath = new Path(righPathString)
					val IFile rightFile = ws.getFile(rightPath);
					baseElement = JavaCore.create(rightFile)
					cacheJavaElements.put(righPathString, baseElement)
				}
				_overlappingAspect.extensionElement = extensionElement
				_overlappingAspect.mergedElement = mergedElement
				_overlappingAspect.baseElement = baseElement
			}
			
//			for(OverlappingAspectsVO _overlapping : overlappingAspects ){
//				println("_overlapping: " + _overlapping)
//			}
			
			// Loading the java elements in the overriding aspects needed for the java AST refactoring
			for(OverridingAspectsVO _overridingAspect : overridingAspects){
				println("_overridingAspect.mergedFile: " + _overridingAspect.mergedFile)
				if(_overridingAspect.mergedFile!=null){
					val String mergedPathString = _overridingAspect.mergedFile.replace(ws.location.toString, "")
					var IJavaElement mergedElement = cacheJavaElements.get(mergedPathString)
					if(mergedElement == null){
						val IPath mergedPath = new Path(mergedPathString)
						mergedElement = JavaCore.create(ws.getFile(mergedPath))
						cacheJavaElements.put(mergedPathString, mergedElement)
					}
					
					val String rightPathString = _overridingAspect.baseFile.replace(ws.location.toString, "")
					var IJavaElement rightElement = cacheJavaElements.get(rightPathString)
					if(rightElement == null){
						val IPath rightPath = new Path(rightPathString)
						rightElement = JavaCore.create(ws.getFile(rightPath))
						cacheJavaElements.put(rightPathString, rightElement)
					}
					
					val String leftPathString = _overridingAspect.leftFile.replace(ws.location.toString, "")
					var IJavaElement extensionElement = cacheJavaElements.get(leftPathString)
					if(extensionElement == null){
						val IPath leftPath = new Path(leftPathString)
						val IFile leftFile = ws.getFile(leftPath);
						extensionElement = JavaCore.create(leftFile)
						cacheJavaElements.put(leftPathString, extensionElement)
					}
					
					_overridingAspect.mergedElement = mergedElement
					_overridingAspect.extensionElement = extensionElement
					_overridingAspect.baseElement = rightElement
				}
			}
			
			val targetFolderFile = new File(targetProject.locationURI.path + "/xtend-gen/")
			
			for(RefactoringPatternVO _refactoringPattern: refactoringPatterns){
				println("_refactoringPattern: " + _refactoringPattern.sourcePattern + " - " + _refactoringPattern.targetPattern)
			}
			
			var PrepareApplyRefactoringsJob refactoringJob = new PrepareApplyRefactoringsJob(cleanListOverlappingAspects, overridingAspects,
				refactoringPatterns, propertiesFiles, targetFolderFile, targetProject
			)
			refactoringJob.schedule()
			
			
			targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);


	//		println("Composition completed... " + result)
	//		
	//		// Adding the composed language to the model typing space so it can be used in the transformations
	//		val ModelType newLanguageExactType = MelangeFactory.eINSTANCE.createModelType => [
	//			name = composition.name + "MT"
	//			ecoreUri = "platform:/resource/" + project.name + "/composition-gen/" + compositionLanguageName + "-Provided.ecore"
	//			mtUri = "platform:/resource/" + project.name + "/composition-gen/" + compositionLanguageName + "-Provided.ecore"
	//		]
	//		newLanguageExactType.pkgs.add(result.providedInterface)
	//		
	//		val Metamodel newLanguageMetamodel = MelangeFactory.eINSTANCE.createMetamodel => [
	//			name = composition.name + "MM"
	//			ecoreUri = "platform:/resource/" + project.name + "/composition-gen/" + compositionLanguageName + ".ecore"
	//			exactTypeName = composition.name + "MT"
	//			exactType = newLanguageExactType
	//			
	//			result.aspects.forEach[ aspect | 
	//				var Aspect _newAspect = MelangeFactory.eINSTANCE.createAspect => [
	//					aspectedClass = searchClassByName(result.metamodel, aspect.aspectedClass.name) as EClass
	//					aspectTypeRef = typeReferenceBuilder.typeRef("CompleteFSM.StateAspect")
	//				]
	//				aspects += _newAspect
	//			]
	//		]
	//		newLanguageExactType.extracted = newLanguageMetamodel
	//
	//		if (!(composition.eContainer as ModelTypingSpace).modelTypes.exists[name == newLanguageExactType.name])
	//					(composition.eContainer as ModelTypingSpace).elements += newLanguageExactType;
	//		
	//		if (!(composition.eContainer as ModelTypingSpace).metamodels.exists[name == newLanguageMetamodel.name])
	//					(composition.eContainer as ModelTypingSpace).elements += newLanguageMetamodel;
		}
	}
	
	def ArrayList<OverlappingAspectsVO> removeRepeatedElements(ArrayList<OverlappingAspectsVO> vos) {
		var ArrayList<OverlappingAspectsVO> answer = newArrayList
		for(OverlappingAspectsVO _overlappingAspect : vos){
			if(!answer.contains(_overlappingAspect))
				answer.add(_overlappingAspect)
		}
		return answer
	}
	
	def private overrideMethod(String sourceFilePath, String targetFilePath){
		var String baseContent = ""
			val BufferedReader br = new BufferedReader(new FileReader(sourceFilePath));
			var String line = br.readLine();
			
	        while (line != null) {
	           baseContent = baseContent + line + "\n"
	           line = br.readLine();
	        }
			br.close()
			
			var PrintWriter writer = new PrintWriter(new File(targetFilePath));
			writer.print(baseContent);
			writer.close();
	}
}