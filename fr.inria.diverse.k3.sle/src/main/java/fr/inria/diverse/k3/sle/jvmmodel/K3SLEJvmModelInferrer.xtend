package fr.inria.diverse.k3.sle.jvmmodel

import fr.inria.diverse.k3.sle.ast.ASTProcessingException

import fr.inria.diverse.k3.sle.metamodel.k3sle.K3sleFactory
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace

import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor

import org.apache.log4j.Logger

import java.util.ArrayList

import com.google.inject.Inject

import static extension fr.inria.diverse.k3.sle.ast.ASTHelper.*

class K3SLEJvmModelInferrer extends AbstractModelInferrer
{
	@Inject extension ModelTypeJvmModelInferrer
	@Inject extension MetamodelJvmModelInferrer
	@Inject extension TransformationJvmModelInferrer

	ModelTypingSpace root
	Logger logger = Logger.getLogger(K3SLEJvmModelInferrer)

	def dispatch infer(ModelTypingSpace typingSpace, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		root = typingSpace

		try {
			val newMTs = new ArrayList<ModelType>
			for (mm : root.metamodels) {
				val newMT = K3sleFactory.eINSTANCE.createModelType => [
					name = mm.exactTypeRef
				]

				if (!root.modelTypes.exists[name == newMT.name])
					newMTs += newMT
			}

			root.elements += newMTs
			root.metamodels.forEach[mm |
				mm.exactType = root.modelTypes.findFirst[name == mm.exactTypeRef]
			]

			root.completeAST
			root.inferTypingRelations

			root.modelTypes.forEach[generateInterfaces(acceptor)]
			root.metamodels.forEach[generateAdapters(acceptor)]
			root.transformations.forEach[generateTransformation(acceptor)]
		} catch (ASTProcessingException e) {
			logger.error('''ASTProcessingException: «e.message»''', e)
		} catch (Exception e) {
			logger.error('''Exception: «e.message»''', e)
		}
	}
}
