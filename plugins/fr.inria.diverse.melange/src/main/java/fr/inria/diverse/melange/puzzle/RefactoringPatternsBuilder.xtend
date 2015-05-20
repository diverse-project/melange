package fr.inria.diverse.melange.puzzle

import java.util.List
import java.io.File
import java.io.BufferedReader
import java.io.FileReader
import org.eclipse.xtend.core.xtend.XtendFunction
import org.autorefactor.ui.RefactoringPatternVO
import org.autorefactor.ui.OverlappingAspectsVO

/**
 * TODO: Build a document with the explanation of the examples. 
 * 
 * @author David Mendez-Acuna
 */
class RefactoringPatternsBuilder {

	/**
	 * Builds a pattern for redirecting from a feature call to the required interface to
	 * its corresponding reference in the merged language.
	 * 
	 * TODO: We need to take into account that the target and the source references might have not the same name.  
	 * 
	 * @param requiredClassName
	 * 			The name of the class declared as required in the required interface that is the type of the reference.
	 * @param requiringReferenceName
	 * 			The name of the reference that will be redirected.
	 * @param providedClassName
	 * 			The name of the class that provides the implementation of the required class. 
	 * @param providingReferenceName
	 * 			The name of the reference that actually implements the requiring reference. 
	 * 
	 * Source pattern: 
	 * 		<RequiredClassName> _<requiringReferenceName> = _self.get<RequiringReferenceName>();
	 * 
	 * 	-> Example:
	 * 		Program _doAction = _self.getDoAction();
	 * 
	 * Target pattern:
	 * 		<ProvidedClassName> _<providingReferenceName> = _self.get<ProvidingReferenceName>();
	 * 
	 * 	-> Example:
	 * 		ClassMethod _doAction = _self.getDoAction();
	 */
	def static RefactoringPatternVO buildReferenceCallPattern(String requiredClassName, String requiringReferenceName,
														String providedClassName, String providingReferenceName){
		var RefactoringPatternVO result = new RefactoringPatternVO();
		result.sourcePattern = requiredClassName + " _" + requiringReferenceName + " = _self.get" + requiringReferenceName.toFirstUpper + "()";
		result.targetPattern = providedClassName + " _" + providingReferenceName + " = _self.get" + providingReferenceName.toFirstUpper + "()";
		return result;
	}

	/**
	 * Builds a pattern for redirecting from a operation call to the required interface to
	 * its corresponding implementation in the aspect.
	 * 
	 * TODO: We need to improve the support for the parameters!
	 * TODO: We need to reduce the dependence with the spaces in the code! 
	 * 
	 * @param requiredClassName
	 * 			The name of the class declared as required in the required interface and that contains the operation call.
	 * @param requiringFeatureName
	 * 			The name of the feature whose type corresponds to the required class.
	 * @param requiredOperationaName
	 * 			The name of the operation called on the required feature.
	 * @param providedClassName
	 * 			The name of the class that provides the implementation of the required class
	 * @param providedAspectName
	 * 			The name of the aspect that provides the implementation of the operations in the required class
	 * @param providedOperationName
	 * 			The name of the operation (in the provided class) that implements the required operation (in the required class).
	 * 
	 * Source pattern:
	 * 		<RequiredClassName> _<requiringFeatureName>_1 = _self.get<RequiringFeatureName>();
	 *  	_<requiringFeatureName>_1.<requiredOperationName>(
	 * 
	 *  -> Example:
	 * 		Program _doAction_1 = _self.getDoAction();
	 * 		_doAction_1.exec(
	 * 
	 * Target pattern:
	 * 		<ProvidedClassName> _<requiringFeatureName> = _self.get<RequiringFeatureName>();
	 * 		<ProvidedAspectName>.<providedOperationName>(_self, _<requiringFeatureName>
	 * 
	 *  -> Example:
	 * 		ClassMethod _doAction_1 = _self.getDoAction
	 * 		ClassMethodAspect.exec(_doAction_1
	 * 
	 */
	def static List<RefactoringPatternVO> buildOperationCallPattern(String requiredClassName, String requiringFeatureName,
													String requiredOperationName, String providedClassName,
														String providedAspectName, String providedOperationName, boolean hasArguments) {
		
		var List<RefactoringPatternVO> result = newArrayList							
		var index = 0
		while(index <= 3){
			var RefactoringPatternVO patternLine1 = new RefactoringPatternVO()
			patternLine1.sourcePattern = requiredClassName + " _" + requiringFeatureName + "_" + index +" = _self.get" + requiringFeatureName.toFirstUpper + "();"
			patternLine1.targetPattern = providedClassName + " _" + requiringFeatureName + "_" + index +" = _self.get" + requiringFeatureName.toFirstUpper + "();"
			
			var RefactoringPatternVO patternLine2 = new RefactoringPatternVO()
			patternLine2.sourcePattern = "_" + requiringFeatureName + "_" + index +"." + requiredOperationName + "("
			patternLine2.targetPattern = providedAspectName + "." + providedOperationName + "(_" + requiringFeatureName + "_" + index +""
			
			var RefactoringPatternVO patternLine3 = new RefactoringPatternVO()
			patternLine3.sourcePattern = "_" + requiringFeatureName + "." + requiredOperationName + "("
			patternLine3.targetPattern = providedAspectName + "." + providedOperationName + "(_" + requiringFeatureName
			
			// Case with cast!
			var RefactoringPatternVO patternLine4 = new RefactoringPatternVO()
			patternLine4.sourcePattern = "((" +  requiredClassName + ")" + "_" + requiringFeatureName + ")." + requiredOperationName + "("
			patternLine4.targetPattern = providedAspectName + "." + providedOperationName + "(_" + requiringFeatureName
			
			var RefactoringPatternVO patternLine5 = new RefactoringPatternVO()
			patternLine5.sourcePattern =  requiringFeatureName + "." + requiredOperationName + "("
			patternLine5.targetPattern = providedAspectName + "." + providedOperationName + "(" + requiringFeatureName
			
			if(hasArguments){
				patternLine2.targetPattern = patternLine2.targetPattern + ", "
				patternLine3.targetPattern = patternLine3.targetPattern + ", "
				patternLine4.targetPattern = patternLine4.targetPattern + ", "
				patternLine5.targetPattern = patternLine5.targetPattern + ", "
			}
			
			result.add(patternLine1)
			result.add(patternLine2)
			result.add(patternLine3)
			result.add(patternLine4)
			result.add(patternLine5)
			
			index++
		}
		
		return result
	}
	
	/**
	 * 
	 * TODO: To include support for operations with parameters!
	 * 
	 * Source pattern:
	 * 		<RequiringAspectName>._requiredSuper.<operationName>
	 * 
	 * 	-> Example:
	 * 		TimedTransitionAspect._requiredSuper.eval();
	 * 
	 * Target pattern:
	 * 		<SuperAspectName>.<operationName>(_self);
	 * 
	 * 	-> Example: 
	 * 		TransitionAspect.eval(_self);
	 */
	def static RefactoringPatternVO buildSuperOperationCallPattern(String requiringAspectName, String operationName, String superAspectName, boolean hasArguments){
		var RefactoringPatternVO pattern = new RefactoringPatternVO();
		pattern.sourcePattern = requiringAspectName + "._requiredSuper." + operationName + "("
		pattern.targetPattern = superAspectName + ".super_" + operationName + "(_self";
		
		if(hasArguments){
			pattern.targetPattern = pattern.targetPattern + ", "
		}
		
		return pattern;
	}
	
	/**
	 * Builds a refactoring pattern for changing the types of variables when it refers to a required classes.
	 * 
	 * 	-> Example:
	 * 		Program auxVariable
	 * 		Program _privk3_auxVariable(
	 * 
	 * 
	 * 	-> Example:
	 * 		ClassMethod auxVariable
	 * 		ClassMethod _privk3_auxVariable(
	 * 
	 */
	def static List<RefactoringPatternVO> buildVariablesPattern(String requiredClassName, String declaredVariableName, String providedClassName){
		var RefactoringPatternVO patternLine1 = new RefactoringPatternVO()
		patternLine1.sourcePattern = requiredClassName + " " + declaredVariableName
		patternLine1.targetPattern = providedClassName + " " + declaredVariableName
		
		var RefactoringPatternVO patternLine2 = new RefactoringPatternVO()
		patternLine2.sourcePattern = requiredClassName + " _privk3_" + declaredVariableName
		patternLine2.targetPattern = providedClassName + " _privk3_" + declaredVariableName
		
		var List<RefactoringPatternVO> result = newArrayList
		result.add(patternLine1)
		result.add(patternLine2)
		return result
	}
	
	/**
	 * Builds a refactoring pattern for changing the references from the classes in the metamodels to the
	 * classes to the merged language. 
	 * 
	 * Source pattern:
	 * 		<sourceNamespace>.<sourceClassName>
	 * 
	 * 	-> Example: 
	 * 		fsmrequired.Program
	 * 
	 * Target pattern:
	 * 		<targetNamespace>.<targetClassName>
	 * 
	 * 	-> Example:
	 * 		CompleteFSM.members.ClassMethod
	 */
	def static RefactoringPatternVO buildMetaclassReferencePattern(String sourceNamespace, String sourceClassName,
															String targetNamespace, String targetClassName){
		var RefactoringPatternVO result = new RefactoringPatternVO()
		result.sourcePattern = sourceNamespace + "." + sourceClassName;
		result.targetPattern = targetNamespace + "." + targetClassName;
		return result
	}
	
	def static RefactoringPatternVO buildNamespacePattern(String sourceNamespace, String targetNamespace){
		
		var RefactoringPatternVO result = new RefactoringPatternVO()
		result.sourcePattern = sourceNamespace + ".";
		result.targetPattern = targetNamespace + ".";
		return result
	}
	
	
	def static RefactoringPatternVO buildComplexOverlappingAspectPattern(OverlappingAspectsVO overlappingAspect) {
		
		for(XtendFunction _overridedFunction : overlappingAspect.leftAspectOperations){
			var String baseOperationContent = ""
			val File targetFolderFile = new File(overlappingAspect.rightFile)
			
			var BufferedReader br = new BufferedReader(new FileReader(targetFolderFile));
			var String line = br.readLine();
					
			while(line != null){
				
				if(line.contains("def") && line.contains("def")){
					println
				}
				line = br.readLine();
			}
			br.close()
		}
		
		
		
		return null
	}
	
}