package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.ASTProcessingException

import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

import org.apache.log4j.Logger

import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions

/**
 * This class generates Java source code for each Model types, Metamodels and
 * Transformations defined in a Melange model.  
 */
class MelangeJvmModelInferrer extends AbstractModelInferrer
{
	@Inject extension ASTHelper
	@Inject extension ModelTypeInferrer
	@Inject extension MetamodelInferrer
	@Inject extension TransformationInferrer
	@Inject extension ModelTypeExtensions
	@Inject extension MetamodelExtensions
//	@Inject extension KomprenInferrer

	ModelTypingSpace root
	static final Logger logger = Logger.getLogger(MelangeJvmModelInferrer)

	def dispatch void infer(ModelTypingSpace typingSpace, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		root = typingSpace

		try {
//			if (Diagnostician.INSTANCE.validate(typingSpace).severity != Diagnostic.ERROR) {
				root.modelTypes.filter[canGenerate].forEach[generateInterfaces(acceptor, _typeReferenceBuilder)]
				root.metamodels.filter[canGenerate].forEach[generateAdapters(acceptor, _typeReferenceBuilder)]
				root.transformations.forEach[generateTransformation(acceptor, _typeReferenceBuilder)]
//				root.slicers.forEach[generateSlicer]
//			} else {
//				logger.error('''Inferrer cannot proceed: there are errors in the model.''')
//			}
		} catch (ASTProcessingException e) {
			logger.error('''ASTProcessingException: «e.message»''')
		} catch (Exception e) {
			logger.error('''Exception: «e.message»''', e)
		}
	}
}
