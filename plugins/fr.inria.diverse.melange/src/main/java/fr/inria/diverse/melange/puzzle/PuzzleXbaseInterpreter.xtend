package fr.inria.diverse.melange.puzzle

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Aspect
import java.util.List
import org.eclipse.emf.ecore.EOperation
import org.eclipse.xtend.core.xtend.AnonymousClass
import org.eclipse.xtend.core.xtend.XtendFile
import org.eclipse.xtend.core.xtend.XtendFormalParameter
import org.eclipse.xtend.core.xtend.XtendFunction
import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.XBinaryOperation
import org.eclipse.xtext.xbase.XClosure
import org.eclipse.xtext.xbase.XConstructorCall
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.XForLoopExpression
import org.eclipse.xtext.xbase.XIfExpression
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.XReturnExpression
import org.eclipse.xtext.xbase.XUnaryOperation
import org.eclipse.xtext.xbase.XWhileExpression
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import org.eclipse.xtext.xbase.impl.XCastedExpressionImpl
import org.eclipse.xtext.xbase.XCastedExpression
import org.autorefactor.ui.RefactoringPatternVO
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference
import org.eclipse.xtext.xbase.interpreter.impl.EvaluationException
import org.eclipse.xtext.xbase.interpreter.impl.InterpreterCanceledException

/**
 * Class that go through an xbase xexpression and creates the corresponding refactoring patterns
 * 
 * @author David Mendez-Acuna
 */
class PuzzleXbaseInterpreter extends XbaseInterpreter {
	
	@Inject extension EcoreQueries
	
	override Object doEvaluate(XExpression expression, IEvaluationContext context, CancelIndicator indicator) {
		
	    if (expression instanceof AnonymousClass){
	    	  return _doEvaluate(expression as AnonymousClass, context, indicator);
	    }
	    
	    else {
	    	return super.doEvaluate(expression, context, indicator)
	    }
	}
	
	override Object _doEvaluate(XMemberFeatureCall xExpression, IEvaluationContext context, CancelIndicator indicator){
		var EOperation _input = context.getValue(QualifiedName.create("input")) as EOperation
		var EOperation _output = context.getValue(QualifiedName.create("output")) as EOperation
		var String providingClassName = context.getValue(QualifiedName.create("providingClassName")) as String
		var String requiringClassName = context.getValue(QualifiedName.create("requiringClassName")) as String
		var List<Aspect> aspects = context.getValue(QualifiedName.create("aspects")) as List<Aspect>
		val List<RefactoringPatternVO> refactoringPatterns = context.getValue(QualifiedName.create("refactoringPatterns")) as List<RefactoringPatternVO>
		val XtendFunction xtendFunction = context.getValue(QualifiedName.create("function")) as XtendFunction
		
		if(xExpression.actualReceiver != null && !xExpression.actualReceiver.toString().contains("_requiredSuper")){
			var RefactoringPatternVO refactPattern = new RefactoringPatternVO
			refactPattern.sourcePattern = xExpression.actualReceiver  + "." + _input.name + "("
			refactPattern.targetPattern = providingClassName + "Aspect." + _output.name + "(" + xExpression.actualReceiver
			
			var boolean functionHasArguments = false
			if(xtendFunction.parameters.size != 0)
				functionHasArguments = true
			
			if(functionHasArguments) refactPattern.targetPattern = refactPattern.targetPattern + ","
			
			if(!refactoringPatterns.contains(refactPattern))
				refactoringPatterns.add(refactPattern) 
		}
		
		// Building the refactoring patterns
		var String featureQualifiedName = xExpression.feature.qualifiedName
		if(featureQualifiedName == null || featureQualifiedName.equals("null")){
			featureQualifiedName = xExpression.feature.toString.
				substring(xExpression.feature.toString.indexOf("#") + 1,
					xExpression.feature.toString.length - 1)
		}
		
		if(!featureQualifiedName.equals("void")){
			var String featureName = featureQualifiedName.substring(featureQualifiedName.lastIndexOf(".") + 1, featureQualifiedName.length)
			var String featureClassName = featureQualifiedName.substring(0, featureQualifiedName.lastIndexOf("."))
			featureClassName = featureClassName.substring(featureClassName.lastIndexOf(".") + 1, featureClassName.length)
			var String featureNamespace = featureQualifiedName.substring(0, featureQualifiedName.lastIndexOf("."))
			
			if(featureName.indexOf('(') != -1)
				featureName = featureName.substring(0, featureName.indexOf('('))
			
			if(_input.EContainingClass.getEAnnotation('required') != null || _input.EContainingClass.getEAnnotation('extension') != null ){
				if(featureNamespace.equals(_input.EContainingClass.qualifiedName) && _output.getEAnnotation('aspect')!=null
					&& featureName.equals(_input.name) && !xExpression.memberCallTarget.toString.equals("_requiredSuper")){
						
					// Building the pattern for redirecting an operation call from a required method towards
					// 	the corresponding implementation.
					//FIXME
					var String providingAspectName = providingClassName + "Aspect"//findAspectName(featureName, providingClassName, aspects)
					var RefactoringPatternVO pattern = new RefactoringPatternVO
					pattern.sourcePattern = xExpression.memberCallTarget  + "." + featureName + "("
					pattern.targetPattern = providingAspectName + "." + featureName + "(" + xExpression.memberCallTarget
					
					var boolean hasArguments = false
					if((xExpression.feature instanceof JvmOperation) && 
							(xExpression.feature as JvmOperation).parameters.size != 0)
						hasArguments = true
					
					if(hasArguments) pattern.targetPattern = pattern.targetPattern + ","
					
					if(!refactoringPatterns.contains(pattern))
						refactoringPatterns.add(pattern)
						
					var String variableName = xExpression.memberCallTarget.toString
					var RefactoringPatternVO patternWithCast = new RefactoringPatternVO()
					patternWithCast.sourcePattern = "((" +  featureClassName + ")" + variableName + ")." + featureName + "("
					patternWithCast.targetPattern = providingAspectName + "." + featureName + "((" + featureClassName + ")" + variableName
					
					if(hasArguments) patternWithCast.targetPattern = patternWithCast.targetPattern + ","
					
					if(!refactoringPatterns.contains(patternWithCast))
						refactoringPatterns.add(patternWithCast) 
				}
				
				if(xExpression.memberCallTarget instanceof XMemberFeatureCall){
					// Building the pattern for redirecting an operation call from a required method towards
					// 	the corresponding implementation.
					//FIXME
					var String providingAspectName = providingClassName + "Aspect"//findAspectName(featureName, providingClassName, aspects)
					var String targetQualifiedName = (xExpression.memberCallTarget as XMemberFeatureCall).feature.qualifiedName
					var String targetFeatureName = ""
					if(targetQualifiedName == null || targetQualifiedName.equals("null")){
						targetQualifiedName = (xExpression.memberCallTarget as XMemberFeatureCall).feature.toString.
							substring((xExpression.memberCallTarget as XMemberFeatureCall).feature.toString.indexOf("#") + 1,
								(xExpression.memberCallTarget as XMemberFeatureCall).feature.toString.length - 1)
					}
				
					targetFeatureName = targetQualifiedName.substring(targetQualifiedName.lastIndexOf(".") + 1, targetQualifiedName.length)
						if(targetFeatureName.indexOf('(') != -1)
							targetFeatureName = targetFeatureName.substring(0, targetFeatureName.indexOf('('))
						targetFeatureName = targetFeatureName.replace("get", "").toFirstLower

					
					
					if(featureClassName.equals(requiringClassName)){
						// TODO Sacar el nombre de la operacion de destino del binding. 
						if(providingAspectName != null){
							
							var boolean hasArguments = false
							if(xExpression.feature instanceof JvmOperation && (xExpression.feature as JvmOperation).parameters.size != 0)
								hasArguments = true
							
							var List<RefactoringPatternVO> operationCall = RefactoringPatternsBuilder.buildOperationCallPattern(
								requiringClassName, targetFeatureName, featureName, providingClassName, providingAspectName, featureName, hasArguments);
								
							operationCall.forEach[ pattern |
								if(!refactoringPatterns.contains(pattern))
									refactoringPatterns.add(pattern)
							]
						}
					}
				}
				else if((xExpression.memberCallTarget instanceof XFeatureCall)){
					var XFeatureCall featureCall = xExpression.memberCallTarget as XFeatureCall
					
					if(xExpression.memberCallTarget.toString.equals("_requiredSuper")){
						var String requiringAspectName = xExpression.memberCallTarget.toString.replace("<implicit: ", "").replace(">", "")
						requiringAspectName = ((xExpression.memberCallTarget as XFeatureCall).feature.eContainer as JvmType).simpleName
						var String operationName = featureName
						var String superAspectName = findAspectName(featureName, providingClassName, aspects)
						
						var boolean hasArguments = false
						if((xExpression.feature instanceof JvmOperation) && 
								(xExpression.feature as JvmOperation).parameters.size != 0)
							hasArguments = true
						
						if(superAspectName != null){
							var RefactoringPatternVO superCallPattern = RefactoringPatternsBuilder.
								buildSuperOperationCallPattern(requiringAspectName, operationName, superAspectName, hasArguments)
							
							if(!refactoringPatterns.contains(superCallPattern))
								refactoringPatterns.add(superCallPattern)
						}
					}else if(featureCall.feature instanceof XtendFormalParameter){
						var XtendFormalParameter featureCallParam = featureCall.feature as XtendFormalParameter
						
						if(featureCallParam.parameterType != null){
							var String variableName = featureCallParam.simpleName
							featureClassName = providingClassName + "Aspect"//findAspectName(featureName, providingClassName, aspects)
							if(_input.name.equals(featureName)){
								// TODO put this in the refatoring patterns builder!
								var RefactoringPatternVO pattern = new RefactoringPatternVO
								pattern.sourcePattern = variableName  + "." + featureName + "("
								pattern.targetPattern = featureClassName + "." + featureName + "(" + variableName
								
								var boolean hasArguments = false
								if((xExpression.feature instanceof JvmOperation) && 
										(xExpression.feature as JvmOperation).parameters.size != 0)
									hasArguments = true
								
								if(hasArguments) pattern.targetPattern = pattern.targetPattern + ","
								
								if(!refactoringPatterns.contains(pattern))
									refactoringPatterns.add(pattern) 
							}
						}
					}
					else{
						internalEvaluate(xExpression.memberCallTarget, context, indicator)
					}
				}
				if(xExpression.memberCallArguments.size!=0){
					xExpression.memberCallArguments.forEach[ _callArgument | 
						internalEvaluate(_callArgument, context, indicator)
					]
				}
			}
		}
		
		if(xExpression.memberCallTarget != null){
			internalEvaluate(xExpression.memberCallTarget, context, indicator)
		}
		return null
	}
	
	override Object _doEvaluate(XAssignment xExpression, IEvaluationContext context, CancelIndicator indicator){
		return null
	}
	
	override Object _doEvaluate(XClosure xExpression, IEvaluationContext context, CancelIndicator indicator){
		if(xExpression.expression != null)
			internalEvaluate(xExpression.expression, context, indicator)
		return null
	}
	
	override Object _doEvaluate(XForLoopExpression xExpression, IEvaluationContext context, CancelIndicator indicator){
		if(xExpression.eachExpression != null)
			internalEvaluate(xExpression.eachExpression, context, indicator)
		if(xExpression.forExpression != null)
			internalEvaluate(xExpression.forExpression, context, indicator)
		return null
	}
	
	override Object _doEvaluate(XWhileExpression xExpression, IEvaluationContext context, CancelIndicator indicator){
		if(xExpression.predicate != null)
			internalEvaluate(xExpression.predicate, context, indicator)
		if(xExpression.body != null)
			internalEvaluate(xExpression.body, context, indicator)
		return null
	}
	
	override Object _doEvaluate(XAbstractFeatureCall xExpression, IEvaluationContext context, CancelIndicator indicator){
		var EOperation _input = context.getValue(QualifiedName.create("input")) as EOperation
		var EOperation _output = context.getValue(QualifiedName.create("output")) as EOperation
		var String providingClassName = context.getValue(QualifiedName.create("providingClassName")) as String
		var String requiringClassName = context.getValue(QualifiedName.create("requiringClassName")) as String
		var List<Aspect> aspects = context.getValue(QualifiedName.create("aspects")) as List<Aspect>
		val List<RefactoringPatternVO> refactoringPatterns = context.getValue(QualifiedName.create("refactoringPatterns")) as List<RefactoringPatternVO>
		
		if(xExpression instanceof XUnaryOperation){
			if(xExpression.operand != null)
				internalEvaluate(xExpression.operand, context, indicator)
		}else if(xExpression instanceof XBinaryOperation){
			if(xExpression.leftOperand != null)
				internalEvaluate(xExpression.leftOperand, context, indicator)
			if(xExpression.rightOperand != null)
				internalEvaluate(xExpression.rightOperand, context, indicator)
		}
		return null
	}
	
	override Object _doEvaluate(XConstructorCall xExpression, IEvaluationContext context, CancelIndicator indicator){
		return null
	}
	
	override Object _doEvaluate(XCastedExpression xExpression,  IEvaluationContext context, CancelIndicator indicator){
		if(xExpression.target != null)
			internalEvaluate(xExpression.target, context, indicator)
	}
	
	override Object _doEvaluate(XIfExpression xExpression, IEvaluationContext context, CancelIndicator indicator){
		if(xExpression.^if != null)
			internalEvaluate(xExpression.^if, context, indicator)
		if(xExpression.then != null)
			internalEvaluate(xExpression.then, context, indicator)
		if(xExpression.^else != null)
			internalEvaluate(xExpression.^else, context, indicator)
		return null
	}
	
	override Object _doEvaluate(XReturnExpression xExpression, IEvaluationContext context, CancelIndicator indicator){
		if(xExpression.expression != null)
			internalEvaluate(xExpression.expression, context, indicator)
		return null
	}

	def Object _doEvaluate(AnonymousClass xExpression, IEvaluationContext context, CancelIndicator indicator){
		xExpression.members.forEach[ member |
			if (member instanceof XtendFunction){
				val _function = (member as XtendFunction)
				internalEvaluate(_function.expression, context, indicator)
			}
		]
		return null
	}
	
	override Object internalEvaluate(XExpression expression, IEvaluationContext context, CancelIndicator indicator) throws EvaluationException {
		if (indicator.isCanceled())
			throw new InterpreterCanceledException();
		doEvaluate(expression, context, indicator);
		return null;
	}
	
	private def String findAspectName(String operationName, String ownerClassName, List<Aspect> aspects) {
		//TODO Check parameters as well! Revisar que es un aspecto para ese classifier.
		for(Aspect _aspect : aspects){
			if(_aspect.aspectTypeRef.type.eResource != null){
				var XtendFile xtendFile = _aspect.aspectTypeRef.type.eResource.contents.get(0) as XtendFile;
				for(XtendTypeDeclaration _typeDeclaration : xtendFile.xtendTypes){
					//TODO Necesito encontrar correctamente el nombre de la clase aspectizada
					var String typeDeclarationName = _typeDeclaration.name.replace("Aspect", "");
					if(typeDeclarationName.equals(ownerClassName)){
						for(XtendMember _member : _typeDeclaration.members){
							if(_member instanceof XtendFunction && (_member as XtendFunction).name.equals(operationName))
								return _typeDeclaration.name
						}
					}
				}
			}
		}return null
	}
}