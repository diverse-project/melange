package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.NamingHelper

import fr.inria.diverse.melange.metamodel.melange.XbaseTransformation

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

class TransformationInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension NamingHelper

	def void generateTransformation(XbaseTransformation transfo, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		val task = Stopwatches.forTask("generate transformations")
		task.start

		acceptor.accept(transfo.toClass(transfo.className))
		[
			val returnType = transfo.returnTypeRef ?: Void::TYPE.typeRef

			members += transfo.toMethod("call", returnType)[
				^static = true

				transfo.parameters.forEach[p |
					parameters += transfo.toParameter(p.name, p.parameterType)
				]

				body = transfo.body
			]

			if (transfo.main) {
				members += transfo.toMethod("main", Void::TYPE.typeRef)[
					^static = true

					parameters += transfo.toParameter("args", String.typeRef.addArrayTypeDimension)

					// TODO: Remove hardcoded types in the following body code
					body = '''
						StandaloneSetup.doSetup() ;
						call() ;
					'''
				]
			}
		]

		task.stop
	}
}
