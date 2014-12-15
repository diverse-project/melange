package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.ASTCompleter
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.ASTProcessingException

import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

import org.apache.log4j.Logger

import org.eclipse.emf.common.util.Diagnostic

import org.eclipse.emf.ecore.util.Diagnostician

import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor

class MelangeJvmModelInferrer extends AbstractModelInferrer
{
	@Inject ASTCompleter completer
	@Inject extension ASTHelper
	@Inject extension ModelTypeInferrer
	@Inject extension MetamodelInferrer
	@Inject extension TransformationInferrer
//	@Inject extension KomprenInferrer

	ModelTypingSpace root
	static final Logger logger = Logger.getLogger(MelangeJvmModelInferrer)

	def dispatch void infer(ModelTypingSpace typingSpace, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		root = typingSpace

		if (Diagnostician.INSTANCE.validate(root) == Diagnostic.OK_INSTANCE) {
			try {
				completer.complete(root)
				completer.inferTypingRelations(root)

				root.modelTypes.forEach[generateInterfaces(acceptor, _typeReferenceBuilder)]
				root.metamodels.forEach[generateAdapters(acceptor, _typeReferenceBuilder)]
				root.transformations.forEach[generateTransformation(acceptor, _typeReferenceBuilder)]
	//			root.slicers.forEach[generateSlicer]
			} catch (ASTProcessingException e) {
				logger.error('''ASTProcessingException: «e.message»''')
			} catch (Exception e) {
				logger.error('''Exception: «e.message»''', e)
			}
		} else {
			logger.error('''Inferrer cannot proceed: there are errors in the model.''')
		}
	}
}
