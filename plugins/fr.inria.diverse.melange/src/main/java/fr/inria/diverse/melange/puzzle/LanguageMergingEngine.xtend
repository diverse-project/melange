package fr.inria.diverse.melange.puzzle

import com.google.inject.Inject
import com.google.inject.Provider
import fr.inria.diverse.commons.asm.shade.DirectoryShader
import fr.inria.diverse.commons.asm.shade.ShadeRequest
import fr.inria.diverse.commons.asm.shade.relocation.Relocator
import fr.inria.diverse.commons.asm.shade.relocation.SimpleRelocator
import fr.inria.diverse.k3.sle.common.utils.ModelUtils
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.sle.puzzle.compatibilitychecker.impl.CompatibilityChecker
import fr.inria.diverse.sle.puzzle.compatibilitychecker.impl.PuzzleDiagnosis
import fr.inria.diverse.sle.puzzle.merge.impl.PuzzleMerge
import java.io.File
import java.io.IOException
import java.net.URLClassLoader
import java.util.ArrayList
import java.util.Collections
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceVisitor
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Path
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl
import org.eclipse.emf.mapping.Mapping
import org.eclipse.emf.mapping.MappingRoot
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtend.core.xtend.XtendFile
import org.eclipse.xtend.core.xtend.XtendFunction
import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext
import puzzle.Aggregation
import puzzle.Composition
import puzzle.Expression
import puzzle.Extension
import puzzle.LanguageRef
import puzzle.Statement
import org.autorefactor.ui.OverlappingAspectsVO
import org.autorefactor.ui.RefactoringPatternVO
import org.autorefactor.ui.OverridingAspectsVO
import fr.inria.diverse.melange.utils.ErrorHelper

/**
 * Composition engine. Responsible for the composition of languages given a composition expression.
 * 
 * @author David Mendez-Acuna
 */
class LanguageMergingEngine {
	
	/**
	 * Dependencies injection
	 */
	@Inject extension CompositionInterfacesHelper
	@Inject extension PuzzleXbaseInterpreter puzzleXbaseInterpreter
	@Inject extension ModelingElementExtensions
	@Inject extension EcoreQueries
	@Inject extension ErrorHelper
	@Inject private Provider<IEvaluationContext> contextProvider;
	
	/**
	 * Attributes *.*
	 */
	private IProject targetProject
	private String compositionLanguageName
	
	/**
	 * Evaluates a composition tree expression by recursively performing the merge operator.
	 * 
	 * @param expression
	 * 			CompositionExpression
	 * 
	 * @param refactoringPatterns
	 * 			Object that stores the refactoring patterns needed to fix the aspects in the merged operational semantics. 
	 * 
	 * @return language
	 * 			A LanguageVO with the result of the composition i.e., metamodel, aspects and interfaces.
	 * 			TODO: This should be changed to return a Melange metamodel. 
	 */
	def LanguageVO evaluateCompositionExpression(Expression expression, ArrayList<RefactoringPatternVO> refactoringPatterns, 
		ArrayList<OverlappingAspectsVO> overlappingAspects, IProject targetProject, String compositionLanguageName) {
		
		this.targetProject = targetProject
		this.compositionLanguageName = compositionLanguageName
		
		if (expression instanceof LanguageRef) {
			val LanguageRef _expr = expression as LanguageRef;
			
			var LanguageVO language = new LanguageVO();
			language.name = compositionLanguageName
			
			if(_expr.ref.requiredInterfaceExists){
				// TODO: The ideal solution is that the required interface is inferred by a dedicated
				// inferrer as well as the exact types. However, that solution is not working correctly. 
				val newMT = MelangeFactory.eINSTANCE.createModelType => [
					name = _expr.ref.name + 'required']
				
				_expr.ref.inferRequiredInterface(newMT)
				language.requiredInterface = newMT.pkgs.head
				
				// language.metamodel = _expr.ref.pkgs.head. 
				// The problem with the loading mechanism above is that it contains the elements introduced by the aspects. 
				// Then, the merging gets crazy...
				language.metamodel = ModelUtils.loadEcoreFile(this.targetProject.workspace.root.location.toString + _expr.ref.ecoreUri.replace("platform:/resource", "")).
					extractMetamodelFromRequiredAnhanotatedEcore(language.requiredInterface)
			}else{
				language.metamodel = _expr.ref.pkgs.head
			}
			
			language.oldNamespaces.add(language.metamodel.name)
			
			if(_expr.getRef().aspects != null){
				for (Aspect _aspect : _expr.ref.aspects) {
					language.aspects.add(_aspect);
				}
			}
			language.providedInterface = language.metamodel.extractProvidedInterface(language.aspects)
			
			return language
		}
	}
	
	def LanguageVO evaluateCompositionExpression(List<Statement> statements, ArrayList<RefactoringPatternVO> refactoringPatterns, 
		ArrayList<OverlappingAspectsVO> overlappingAspects, ArrayList<OverridingAspectsVO> overridingAspects, IProject targetProject, String compositionLanguageName) {

		var CompositionTreeNode compositionTree = statements.calculateCompositionTree 
		var LanguageVO result = compositionTree.evaluateCompositionTree(refactoringPatterns, overlappingAspects, overridingAspects, targetProject, compositionLanguageName)
		return result
	}
	
	
	/**
	 * Evaluates the composition tree in the parameter. 
	 */
	def LanguageVO evaluateCompositionTree(CompositionTreeNode tree, ArrayList<RefactoringPatternVO> refactoringPatterns, 
									ArrayList<OverlappingAspectsVO> overlappingAspects, ArrayList<OverridingAspectsVO> overridingAspects,
											IProject targetProject, String compositionLanguageName){
		
		if(tree instanceof CompositionTreeLeaf){
			return tree.language.evaluateCompositionExpression(refactoringPatterns, overlappingAspects, targetProject, compositionLanguageName)
		}
		else if(tree instanceof ExtensionTreeNode){
			
			var LanguageVO language = new LanguageVO();
			language.name = compositionLanguageName 
			
			var LanguageVO baseLanguage = tree._base.evaluateCompositionTree(refactoringPatterns, overlappingAspects, overridingAspects, targetProject, compositionLanguageName)
			var LanguageVO extensionLanguage = tree._extension.evaluateCompositionTree(refactoringPatterns, overlappingAspects, overridingAspects, targetProject, compositionLanguageName)
			
			println("baseLanguage.metamodel: " + baseLanguage.metamodel)
			println("extensionLanguage.metamodel: " + extensionLanguage.metamodel)
			
			if(extensionLanguage.metamodel != null && baseLanguage.providedInterface != null){
				var MappingRoot binding = null;
				binding = PuzzleMerge.instance.calculateBinding(extensionLanguage.metamodel, 
								baseLanguage.providedInterface)
				// 3. Checking the compatibility.
				val PuzzleDiagnosis diagnosis = CompatibilityChecker.getInstance.checkCompatibility(baseLanguage.providedInterface, 
					extensionLanguage.metamodel, binding)
			
				if(diagnosis != null && diagnosis.items.size != 0){
					diagnosis.items.forEach[ error |
						println("error.kind: " + error.kind + " " + error.input + " " + error.output)
					]	
				}
				else{
					// 4. Executing the merge operator at the level of the abstract syntax		
					launchAbstractSyntaxExtensionMergeOperation(extensionLanguage, baseLanguage, binding, language)
					
					// 6. Executing the merge operator at the level of the operational semantics
					launchOperationalSemanticsMergeOperation(extensionLanguage, baseLanguage, binding, language, refactoringPatterns, overlappingAspects, overridingAspects)
				}
			}
			
			return language
		}
		else if(tree instanceof AggregationTreeNode){
			var LanguageVO requiringLanguage = tree._requiring.evaluateCompositionTree(refactoringPatterns, overlappingAspects, overridingAspects, targetProject, compositionLanguageName)
			var LanguageVO providingLanguage = tree._providing.evaluateCompositionTree(refactoringPatterns, overlappingAspects, overridingAspects, targetProject, compositionLanguageName)
		
			var LanguageVO language = new LanguageVO();
			language.name = compositionLanguageName
		
			if(requiringLanguage.requiredInterface != null && providingLanguage.providedInterface != null){
				var MappingRoot binding = null;
//				if((_statement as Aggregation).getBinding() != null){
//					// TODO Load a manually defined binding!
//				}
//				else{
					binding = PuzzleMerge.instance.calculateBinding(requiringLanguage.requiredInterface, 
									providingLanguage.providedInterface)
//				}
				
				// 3. Checking the compatibility.
				val PuzzleDiagnosis diagnosis = CompatibilityChecker.getInstance.checkCompatibility(providingLanguage.providedInterface, requiringLanguage.requiredInterface, binding)
				
				if(diagnosis != null && diagnosis.items.size != 0){
					diagnosis.items.forEach[ error |
						println("error.kind: " + error.kind + " " + error.input + " " + error.output)
//						tree addError( error.kind.toString, null )
					]	
				}
				else{
					// 4. Executing the merge operator at the level of the abstract syntax		
					launchAbstractSyntaxAggregationMergeOperation(requiringLanguage, providingLanguage, binding, language)
					
					// 6. Executing the merge operator at the level of the operational semantics
					launchOperationalSemanticsMergeOperation(requiringLanguage, providingLanguage, binding, language, refactoringPatterns, overlappingAspects, overridingAspects)
				}
			}
			return language
		}
		return null
	}
	
	
	def CompositionTreeNode calculateCompositionTree(List<Statement> statements){
		
		var ArrayList<CompositionStatementVO> statementsLeft = newArrayList
		var CompositionTreeNode compositionTree = null
		
		for(Statement _statement : statements){
			statementsLeft.add(new CompositionStatementVO(_statement))
		}
		
		while( statementsLeft.unconsideredStatementExsit ){
			var unconsidered = statementsLeft.findFirst[ _statement | _statement.considered == false ]
			var _realStatement = unconsidered.statement
			
			if(_realStatement instanceof Extension){
				var ExtensionTreeNode node = new ExtensionTreeNode
				node._base = new CompositionTreeLeaf(_realStatement.base)
				node._extension = new CompositionTreeLeaf(_realStatement.extension)
				
				if(compositionTree == null){
					compositionTree = node
					
				}else{
					addNode(compositionTree, node)
				}
				unconsidered.considered = true
			}
			else if(_realStatement instanceof Aggregation){
				var AggregationTreeNode node = new AggregationTreeNode
				node._requiring = new CompositionTreeLeaf(_realStatement.requiring)
				node._providing = new CompositionTreeLeaf(_realStatement.providing)
				
				if(compositionTree == null){
					compositionTree = node	
				}else{
					addNode(compositionTree, node)
				}
				unconsidered.considered = true
			}
		}
		
		return compositionTree
		
	}
	
	def void addNode(CompositionTreeNode root, CompositionTreeNode node){
		if(root instanceof ExtensionTreeNode){
			
			var boolean added = false
			if(root._base instanceof CompositionTreeLeaf){
				var Metamodel baseLanguage = ((root._base as CompositionTreeLeaf).language as LanguageRef).ref
				if(baseLanguage.languageExists(node)){
					root._base = node
					added = true
				}
			}
			if((root._extension instanceof CompositionTreeLeaf) && !added){
				var Metamodel extensionLanguage = ((root._extension as CompositionTreeLeaf).language as LanguageRef).ref
				if(extensionLanguage.languageExists(node)){
					root._extension = node
				}
			}
			if(!(root._base instanceof CompositionTreeLeaf) && (!added)){
				addNode(root._base, node)
			}
			if(!(root._extension instanceof CompositionTreeLeaf) && (!added)){
				addNode(root._extension, node)
			}
			
		}
		else if(root instanceof AggregationTreeNode){
			var boolean added = false
			if(root._requiring instanceof CompositionTreeLeaf){
				var Metamodel baseLanguage = ((root._requiring as CompositionTreeLeaf).language as LanguageRef).ref
				if(baseLanguage.languageExists(node)){
					root._requiring = node
					added = true
				}
			}
			if((root._providing instanceof CompositionTreeLeaf) && !added){
				var Metamodel extensionLanguage = ((root._providing as CompositionTreeLeaf).language as LanguageRef).ref
				if(extensionLanguage.languageExists(node)){
					root._providing = node
				}
			}
			if(!(root._requiring instanceof CompositionTreeLeaf) && (!added)){
				addNode(root._requiring, node)
			}
			if(!(root._providing instanceof CompositionTreeLeaf) && (!added)){
				addNode(root._providing, node)
			}
		}
	}
	
	def boolean languageExists(Metamodel language, CompositionTreeNode node){
		if(node instanceof ExtensionTreeNode){
			if(((node._base as CompositionTreeLeaf).language as LanguageRef).ref.name.equals(language.name)
				|| ((node._extension as CompositionTreeLeaf).language as LanguageRef).ref.name.equals(language.name)){
				return true
			}
		}
		else if(node instanceof AggregationTreeNode){
			if(((node._requiring as CompositionTreeLeaf).language as LanguageRef).ref.name.equals(language.name)
				|| ((node._providing as CompositionTreeLeaf).language as LanguageRef).ref.name.equals(language.name)){
				return true
			}
		}
		return false
	}
	
	def boolean unconsideredStatementExsit(ArrayList<CompositionStatementVO> statements){
		for(CompositionStatementVO _statement : statements){
			if(_statement.considered == false)
				return true
		}
		return false
	}
	
	def Statement getNextAdjuntStatement(CompositionTreeLeaf leaf, List<CompositionStatementVO> statements){
		for(CompositionStatementVO _statement : statements){
			if(_statement.considered==false){
				if(_statement.statement instanceof Aggregation){
					if((((_statement.statement as Aggregation).requiring as LanguageRef).ref.name.equals((leaf.language as LanguageRef).ref.name) ||
						(((_statement.statement as Aggregation).providing as LanguageRef).ref.name.equals((leaf.language as LanguageRef).ref.name))))
							return _statement.statement
				}
				else if(_statement.statement instanceof Extension){
					if((((_statement.statement as Extension).base as LanguageRef).ref.name.equals((leaf.language as LanguageRef).ref.name) ||
						(((_statement.statement as Extension).extension as LanguageRef).ref.name.equals((leaf.language as LanguageRef).ref.name))))
							return _statement.statement
				}
			}
		}
		return null
	}
	
	
	/**
	 * Launches the merge for the abstract syntax of the language.
	 * The merged result is stored in the parameter called language.
	 * 
	 * @param leftLanguage
	 * 			Value object containing the information of the extension language
	 * @param rightLanguage
	 * 			Value object containing the information of the base language
	 * @param biding
	 * 			Binding between the elements of the extension and the base languages.
	 * @param language
	 * 			Value object where the result of the merge operation is stored. 
	 */
	def void launchAbstractSyntaxAggregationMergeOperation(LanguageVO leftLanguage, LanguageVO rightLanguage, MappingRoot binding, LanguageVO language){
		var EPackage recalculatedRequiredInterface = PuzzleMerge.getInstance().
				recalculateRequiredInterface(leftLanguage.requiredInterface, 
						binding, compositionLanguageName, rightLanguage.requiredInterface);
		language.setRequiredInterface(recalculatedRequiredInterface);
		
		var EPackage mergedLanguage = PuzzleMerge.getInstance().mergeAbstractSyntax(rightLanguage.metamodel, 
				rightLanguage.providedInterface, leftLanguage.metamodel, 
					leftLanguage.requiredInterface, binding, recalculatedRequiredInterface, compositionLanguageName);
		language.setMetamodel(mergedLanguage);
		
		var EPackage recalculatedProvidedInterface = PuzzleMerge.getInstance().
				recalculateProvidedInterface(leftLanguage.providedInterface, rightLanguage.providedInterface)
		language.providedInterface = recalculatedProvidedInterface
	}
	
	def void launchAbstractSyntaxExtensionMergeOperation(LanguageVO leftLanguage, LanguageVO rightLanguage, MappingRoot binding, LanguageVO language){
		var EPackage recalculatedRequiredInterface = PuzzleMerge.getInstance().
				recalculateRequiredInterface(rightLanguage.requiredInterface, 
						binding, compositionLanguageName, leftLanguage.requiredInterface);
		language.setRequiredInterface(recalculatedRequiredInterface);
		
		var EPackage mergedLanguage = PuzzleMerge.getInstance().mergeAbstractSyntax(rightLanguage.metamodel, 
				rightLanguage.providedInterface, leftLanguage.metamodel, 
					leftLanguage.requiredInterface, binding, recalculatedRequiredInterface, compositionLanguageName);
		language.setMetamodel(mergedLanguage);
		
		var EPackage recalculatedProvidedInterface = PuzzleMerge.getInstance().
				recalculateProvidedInterface(leftLanguage.providedInterface, rightLanguage.providedInterface)
		language.providedInterface = recalculatedProvidedInterface
	}
	
	/**
	 * Serializes the .ecore files corresponding to the language in the parameter
	 * A language is composed of three different .ecore files: the metamodel, the provided interface and the required interface.
	 * 
	 * @param language
	 * 		The value object containing the information of the language whose .ecore files will be serialized. 
	 */
	def void serializeEcoreFiles(LanguageVO language) {
		var String mergedProjectName = targetProject.getProject()
				.getLocation().toString();
		
		if(language.providedInterface != null){
			var String providedInterfaceMergedLocation = mergedProjectName + 
					"/composition-gen/" + language.name + "-Provided.ecore";
			ModelUtils.saveEcoreFile(providedInterfaceMergedLocation, language.providedInterface);
		}
		
		if(language.providedInterface != null){
			var String providedInterfaceMergedLocation = mergedProjectName + 
					"/composition-gen/" + language.name + "MT.ecore";
			ModelUtils.saveEcoreFile(providedInterfaceMergedLocation, language.providedInterface);
		}
		
		if(language.requiredInterface != null){
			var String requiredInterfaceMergedLocation = mergedProjectName + 
					"/composition-gen/" + language.name + "-Required.ecore";
			println("serializeEcoreFiles.recalculatedRequiredInterface: " + language.requiredInterface.EClassifiers)
			ModelUtils.saveEcoreFile(requiredInterfaceMergedLocation, language.requiredInterface);
		}
		
		if(language.metamodel != null){
			var String metamodelMergedLocation = mergedProjectName + 
				"/composition-gen/" + language.name + ".ecore";
			language.metamodelSerializationPath = metamodelMergedLocation
			ModelUtils.saveEcoreFile(metamodelMergedLocation, language.metamodel);
		}
	}
	
	/**
	 * Serializes the .genmodel file corresponding to the language in the parameter. 
	 * This genmodel file contains the packages of the metamodel and the required interface if any. 
	 * 
	 * TODO: Throw an exception where the metamodel serialization path is null. That is an error!
	 * 
	 * @param language
	 * 			The value object containing the information of the language whose .genmodel file will be serialized.
	 */
	def GenModel serializeGenmodelFiles(LanguageVO language){
		
		if(language.metamodelSerializationPath != null){
			var String mergedProjectName = targetProject.getProject()
				.getLocation().toString();
				
			var String genmodelMetamodelMergedLocation = mergedProjectName + 
					"/composition-gen/" + language.name + ".genmodel";
			
			return generateGenmodelFile(language.metamodel, language.metamodelSerializationPath, 
					genmodelMetamodelMergedLocation, targetProject.getProject().name, 
					language.name, language.mergedPackage);
		}
	}
	
	/**
	 * Generates the corresponding GenModel file for an ecore package in the parameter
	 * @param ePackage
	 * @throws IOException 
	 */
	def private GenModel generateGenmodelFile(EPackage rootPackage, String ecoreLocation, 
		String genModelLocation, String projectName, String languageName, String basePackage) throws IOException {
		var GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.setEditDirectory("/" + projectName + ".edit/src");
		genModel.setEditPluginID(projectName + ".edit");
		genModel.setEditorDirectory("/" + projectName + ".editor/src");
		genModel.setEditorPluginID(projectName + ".editor");
        genModel.setModelDirectory("/" + projectName + "/src-gen");
        genModel.setModelPluginID(projectName);
        genModel.setOperationReflection(true);
        genModel.setTestsDirectory("/" + projectName + ".tests/src");
        genModel.setTestsPluginID(projectName + ".tests");
        genModel.getForeignModel().add(new Path(ecoreLocation).lastSegment());
        genModel.setModelName(languageName);
        genModel.setRootExtendsInterface("org.eclipse.emf.ecore.EObject");
        genModel.initialize(Collections.singleton(rootPackage));
        genModel.setCanGenerate(true);
        
        
        var GenPackage genPackage = genModel.getGenPackages().get(0) as GenPackage;
        var String genModelPrefix = rootPackage.getNsPrefix().charAt(0).toString.toUpperCase + 
        								rootPackage.getNsPrefix().substring(1, rootPackage.getNsPrefix().length)
        genPackage.setPrefix(genModelPrefix);
        var URI genModelURI = URI.createFileURI(genModelLocation);
        var XMIResourceImpl genModelResource = new XMIResourceImpl(genModelURI);
        genModelResource.getContents().add(genModel);
        genModelResource.save(Collections.EMPTY_MAP);

        genModel.reconcile();
    	genModel.setCanGenerate(true);
    	genModel.setValidateModel(true);
		
		return genModel
	}
	
	/**
	 * Launches the merge for the operational semantics of the language.
	 * The merged result is stored in the parameter called language.
	 * 
	 * @param leftLanguage
	 * 			Value object containing the information of the extension language
	 * @param rightLanguage
	 * 			Value object containing the information of the base language
	 * @param biding
	 * 			Binding between the elements of the extension and the base languages.
	 * @param language
	 * 			Value object where the result of the merge operation is stored. 
	 */
	def void launchOperationalSemanticsMergeOperation(LanguageVO leftLanguage, 
		LanguageVO rightLanguage, MappingRoot binding, LanguageVO language, ArrayList<RefactoringPatternVO> refactoringPatterns, 
			ArrayList<OverlappingAspectsVO> overlappingAspects, ArrayList<OverridingAspectsVO> overridingAspects){
		
		for(Aspect _aspectRight : rightLanguage.aspects){
			language.aspects.add(_aspectRight)
		}
		
		for(Aspect _aspectLeft : leftLanguage.aspects){
			var boolean repeated = false
			if(_aspectLeft.aspectTypeRef.qualifiedName.lastIndexOf(".") != -1){
				var String leftAspectedClassName = _aspectLeft.aspectTypeRef.qualifiedName.substring(
				_aspectLeft.aspectTypeRef.qualifiedName.lastIndexOf(".") + 1).replace("Aspect", "") //TODO Pilas!!
				for(Aspect _aspectRight : rightLanguage.aspects){
					if(_aspectRight.aspectTypeRef.qualifiedName.lastIndexOf(".") != -1){
						var String rightAspectedClassName = _aspectRight.aspectTypeRef.qualifiedName.substring(
							_aspectRight.aspectTypeRef.qualifiedName.lastIndexOf(".") + 1).replace("Aspect", "") //TODO Pilas!!
						if(leftAspectedClassName.equals(rightAspectedClassName)){
							repeated = true
							val overlappingAspect = new OverlappingAspectsVO(_aspectRight, rightAspectedClassName,_aspectLeft, leftAspectedClassName)
							overlappingAspect.rightFile = _aspectRight.aspectTypeRef.identifier.replace(".", "/") + ".java"
							overlappingAspect.leftFile = _aspectLeft.aspectTypeRef.identifier.replace(".", "/") + ".java"
							overlappingAspects.add(overlappingAspect)
						}
					}
				}
				
				for(Aspect _aspectRight : rightLanguage.aspects){
					if(_aspectRight.aspectTypeRef.qualifiedName.lastIndexOf(".") != -1){
						val String rightAspectedClassName = _aspectRight.aspectTypeRef.qualifiedName.substring(
							_aspectRight.aspectTypeRef.qualifiedName.lastIndexOf(".") + 1).replace("Aspect", "") //TODO Pilas!!
							
						
						if(_aspectLeft.aspectedClass != null && !_aspectLeft.aspectedClass.ESuperTypes.filter[ _superType |
								_superType.name.equals(rightAspectedClassName)].isEmpty){
							val overridingAspect = new OverridingAspectsVO(_aspectRight, rightAspectedClassName,_aspectLeft, leftAspectedClassName)
							overridingAspect.baseFile = _aspectRight.aspectTypeRef.identifier.replace(".", "/") + ".java"
							overridingAspect.leftFile = _aspectLeft.aspectTypeRef.identifier.replace(".", "/") + ".java"
							overridingAspects.add(overridingAspect)		
						}
					}
				}
			}
			language.aspects.add(_aspectLeft)
		}
		
		language.oldNamespaces.add(leftLanguage.metamodel.name)
		language.oldNamespaces.add(rightLanguage.metamodel.name)
		
		for(Aspect _aspect : language.aspects){
			// Changing the namespaces of the required types of the extension language that still required in the merged language.
			if(language.requiredInterface != null){
				for(EClassifier _requiredClassifier : language.requiredInterface.EClassifiers){
				var RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildMetaclassReferencePattern(
					leftLanguage.metamodel.name, _requiredClassifier.name, language.requiredInterface.name, 
						_requiredClassifier.name)
				if(!refactoringPatterns.contains(pattern))
					refactoringPatterns.add(pattern)
				}
				
				// Changing the namespaces of the required types of the base language that still required in the merged language. 
				for(EClassifier _requiredClassifier : language.requiredInterface.EClassifiers){
					var RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildMetaclassReferencePattern(
						rightLanguage.metamodel.name, _requiredClassifier.name, language.requiredInterface.name, 
							_requiredClassifier.name)
					if(!refactoringPatterns.contains(pattern))
						refactoringPatterns.add(pattern)
				}
			}
			

			// Changing the namespaces of the required types of the extension language that were provided by the merged language. 
			for(EClassifier _requiredClassifier : language.metamodel.EClassifiers){
				var RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildMetaclassReferencePattern(
					leftLanguage.requiredInterface.name, _requiredClassifier.name, language.metamodel.name, 
						_requiredClassifier.name)
				if(!refactoringPatterns.contains(pattern))
					refactoringPatterns.add(pattern)
			}

			if(_aspect.aspectTypeRef != null && _aspect.aspectTypeRef.type != null 
					&& _aspect.aspectTypeRef.identifier != null && _aspect.aspectTypeRef.type.eResource != null){

				val ws = targetProject.project.workspace.root
				val shader = new DirectoryShader
				val request = new ShadeRequest
				val relocators = new ArrayList<Relocator>
				val sourceEmfNamespace = "FSM"
				val targetEmfNamespace = "FSM"
				val sourceAspectNamespace = _aspect.aspectTypeRef.qualifiedName.replace("." + _aspect.aspectTypeRef.simpleName, "")
				val targetAspectNamespace = language.name
			
			
				if(_aspect.aspectTypeRef.type.eResource.contents.get(0) instanceof XtendFile){
					var XtendFile xtendFile = _aspect.aspectTypeRef.type.eResource.contents.get(0) as XtendFile;
					
					try{
						EcoreUtil.resolveAll(xtendFile)
					}catch(IllegalStateException e){
						println("Crying because of indexing")
					}
					
					var TreeIterator<Mapping> _it = binding.treeIterator();
					while (_it.hasNext()) {
						var Mapping _mapping = _it.next
						
						var EObject _input = _mapping.getInputs().get(0);
						var EObject _output = _mapping.getOutputs().get(0);
						
						if(_input instanceof EClassifier && _output instanceof EClassifier){
							var EClassifier sourceClass = language.metamodel.searchClassByName((_input as EClassifier).name)
							var EClassifier targetClass = language.metamodel.searchClassByName((_output as EClassifier).name)
							var RefactoringPatternVO pattern = new RefactoringPatternVO()
							pattern.sourcePattern = sourceClass.getQualifiedName//leftLanguage.requiredInterface.name + "." + (_input as EClassifier).name
							pattern.targetPattern = targetClass.getQualifiedName.replace(sourceAspectNamespace, targetAspectNamespace)
							
							if(!refactoringPatterns.contains(pattern))
								refactoringPatterns.add(pattern)
							
							if((_input instanceof EClass) && (_output instanceof EClass)){
								var EClass _inputClass = _input as EClass;
								var EClass _outputClass = _output as EClass;

									var List<EReference> incomingReferences = newArrayList;
									_inputClass.getIncomingReferences(leftLanguage.metamodel, incomingReferences)
									
									for(EReference _eRequiringReference : incomingReferences){
										var RefactoringPatternVO referenceCallPattern = RefactoringPatternsBuilder.buildReferenceCallPattern(_inputClass.name, 
											_eRequiringReference.name, _outputClass.name, _eRequiringReference.name);
										
										if(!refactoringPatterns.contains(referenceCallPattern))
											refactoringPatterns.add(referenceCallPattern);
								}
							}
						}
						
						for(XtendTypeDeclaration _typeDeclaration : xtendFile.xtendTypes){
							buildPatternsByType(_typeDeclaration, refactoringPatterns, leftLanguage, language, _input, _output, _aspect.aspectTypeRef.identifier)
						}
					}
				
					for(String _MetamodelNamespace : language.oldNamespaces){
						var RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildNamespacePattern(_MetamodelNamespace, targetAspectNamespace)
						if(!refactoringPatterns.contains(pattern))
							refactoringPatterns.add(pattern)
					}
					
					val projectPathTmp = new StringBuilder
					val projectNameTmp = new StringBuilder
					
					ws.accept(
					new IResourceVisitor {
						override visit(IResource resource) throws CoreException {
							if (resource instanceof IFile) {
								val resourcePath = resource.locationURI.path
								if(_aspect.aspectTypeRef != null && _aspect.aspectTypeRef.identifier != null){
									val String currentAspectIdentifier = _aspect.aspectTypeRef.identifier
									val toBeMatched = currentAspectIdentifier.replace(".", "/") + ".java"
									if (resourcePath.endsWith(toBeMatched)) {
										
										val projectPath = resource.project.locationURI.path
										if (projectPathTmp.length == 0)
											projectPathTmp.append(projectPath)
										if (projectNameTmp.length == 0)
											projectNameTmp.append(resource.project.name)
									}
								}
								return false
							}
							return true
						}
					})
	
					val sourceAspectFolder = projectPathTmp + "/xtend-gen/"
					val sourceFolderFile = new File(sourceAspectFolder)
					val targetAspectFolder = targetProject.locationURI.path + "/xtend-gen/"
					
					if(sourceFolderFile != null && sourceFolderFile.exists){
						val targetFolderFile = new File(targetAspectFolder)
						relocators += new SimpleRelocator(sourceAspectNamespace.toString, targetAspectNamespace.toString, null, #[])
						relocators += new SimpleRelocator(sourceEmfNamespace.toString, targetEmfNamespace.toString, null, #[])
						
						var RefactoringPatternVO namespaceRefactoringPattern = new RefactoringPatternVO()
						 namespaceRefactoringPattern.sourcePattern = sourceAspectNamespace.toString
						 namespaceRefactoringPattern.targetPattern = targetAspectNamespace.toString
						 
						 if(!refactoringPatterns.contains(namespaceRefactoringPattern))
						 	refactoringPatterns.add(namespaceRefactoringPattern)
						
						request.inputFolders = #{sourceFolderFile}
						request.outputFolder = targetFolderFile
						request.filters = #[]
						request.relocators = relocators
						request.resourceTransformers = new ArrayList
						shader.shade(request)
					}
					
					for(OverlappingAspectsVO _overlappingAspect : overlappingAspects){
						if(_aspect.aspectTypeRef.identifier.equals(_overlappingAspect.leftAspect.aspectTypeRef.identifier)){
							_overlappingAspect.leftFile = sourceAspectFolder + _aspect.aspectTypeRef.identifier.replace(".", "/") + ".java"
							_overlappingAspect.mergedFile = targetAspectFolder + targetAspectNamespace.toString + "/" + _aspect.aspectTypeRef.identifier.
								substring(_aspect.aspectTypeRef.identifier.lastIndexOf(".") + 1).replace(".", "/") + ".java"
						}
						if(_aspect.aspectTypeRef.identifier.equals(_overlappingAspect.rightAspect.aspectTypeRef.identifier)){
							_overlappingAspect.rightFile = sourceAspectFolder + _aspect.aspectTypeRef.identifier.replace(".", "/") + ".java"
							_overlappingAspect.mergedFile = targetAspectFolder + targetAspectNamespace.toString + "/" + _aspect.aspectTypeRef.identifier.
								substring(_aspect.aspectTypeRef.identifier.lastIndexOf(".") + 1).replace(".", "/") + ".java"
						}
					}
					
					for(OverridingAspectsVO _overridingAspect : overridingAspects){
						if(_aspect.aspectTypeRef.identifier.equals(_overridingAspect.leftAspect.aspectTypeRef.identifier))
							_overridingAspect.leftFile = sourceAspectFolder + _aspect.aspectTypeRef.identifier.replace(".", "/") + ".java"
						if(_aspect.aspectTypeRef.identifier.equals(_overridingAspect.baseAspect.aspectTypeRef.identifier)){
							_overridingAspect.baseFile = sourceAspectFolder + _aspect.aspectTypeRef.identifier.replace(".", "/") + ".java"
							_overridingAspect.mergedFile = targetAspectFolder + targetAspectNamespace.toString + "/" + _aspect.aspectTypeRef.identifier.
								substring(_aspect.aspectTypeRef.identifier.lastIndexOf(".") + 1).replace(".", "/") + ".java"
						}
					}
				}
			}
		}
	}
	
	def private buildPatternsByType(XtendTypeDeclaration _typeDeclaration, ArrayList<RefactoringPatternVO> refactoringPattern, 
		LanguageVO leftLanguage, LanguageVO result, EObject _input, EObject _output, String aspectIdentifier) {
//			println("*** aspectIdentifier: " + aspectIdentifier)
		for(XtendMember _member : _typeDeclaration.members){
			if((_member instanceof XtendField) && (_input instanceof EClass && _output instanceof EClass)){
				var String requiredTypeQualifiedName = (_input as EClassifier).qualifiedName//leftLanguage.requiredInterface.name + "." + (_input as EClassifier).name
				var String currentTypeQualifiedName = (_member as XtendField).type.qualifiedName
				if(currentTypeQualifiedName == null || currentTypeQualifiedName.equals("null")){
					currentTypeQualifiedName = (_member as XtendField).type.toString.substring((_member as XtendField).type.toString.indexOf("#") + 1, (_member as XtendField).type.toString.length-1)
				}
				if(currentTypeQualifiedName.equals(requiredTypeQualifiedName)){
					var List<RefactoringPatternVO> variablePatterns = RefactoringPatternsBuilder.buildVariablesPattern((_input as EClassifier).name, 
						(_member as XtendField).name, (_output as EClassifier).name)
					
					variablePatterns.forEach[ pattern |
						if(!refactoringPattern.contains(pattern))
							refactoringPattern.add(pattern)
					]
				}
			}
			else if((_member instanceof XtendFunction) && (_input instanceof EOperation && _output instanceof EOperation)){
				var String requiringClassName = (_input as EOperation).EContainingClass.name
				var String providingClassName = (_output as EOperation).EContainingClass.name
				println("(_input as EOperation): " + (_input as EOperation))
				if((_member as XtendFunction).expression != null){
					for(XExpression _currentExpressionStatement : ((_member as XtendFunction).expression as XBlockExpression).expressions){
						var IEvaluationContext evaluationContext = contextProvider.get();
						evaluationContext.newValue(QualifiedName.create("baseLanguage"), leftLanguage)
						evaluationContext.newValue(QualifiedName.create("input"), _input)
						evaluationContext.newValue(QualifiedName.create("output"), _output)
						evaluationContext.newValue(QualifiedName.create("providingClassName"), providingClassName)
						evaluationContext.newValue(QualifiedName.create("requiringClassName"), requiringClassName)
						evaluationContext.newValue(QualifiedName.create("aspects"), result.aspects)
						evaluationContext.newValue(QualifiedName.create("refactoringPatterns"), refactoringPattern)
						evaluationContext.newValue(QualifiedName.create("function"),(_member as XtendFunction))
						puzzleXbaseInterpreter.classLoader = URLClassLoader.getSystemClassLoader()
						puzzleXbaseInterpreter.evaluate(_currentExpressionStatement, evaluationContext, CancelIndicator.NullImpl)
					}
				}
			}
		}
	}
	
	def public boolean isCompositionExpressionComplete(Composition composition){
		var boolean validName = composition.name != null && !composition.name.equals("")
		var boolean allExpressionsComplete = false
		
		allExpressionsComplete = composition.statements.expressionComplete
		
		return validName && allExpressionsComplete
	}
	
	def boolean expressionComplete(List<Statement> statements){
		if(statements == null)
			return false;
		if(statements.empty)
			return false;
		var boolean complete = true
		for(Statement _statement : statements){
			if(_statement instanceof Aggregation){
				complete = complete && ((_statement as Aggregation).requiring.expressionComplete
					&& (_statement as Aggregation).providing.expressionComplete)
			}
			else if(_statement instanceof Extension){
				complete = complete && ((_statement as Extension).base.expressionComplete
					&& (_statement as Extension).extension.expressionComplete)
			}
			else{
				complete = false;
			}
		}
		return complete
	}
	
	def boolean expressionComplete(Expression expression){
		if(expression instanceof LanguageRef){
			return (expression as LanguageRef).ref != null && (expression as LanguageRef).ref.name != null
		}
		return false
	}
	
}