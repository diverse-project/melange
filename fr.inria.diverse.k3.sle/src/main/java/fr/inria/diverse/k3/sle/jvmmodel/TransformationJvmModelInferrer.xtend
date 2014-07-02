package fr.inria.diverse.k3.sle.jvmmodel

import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

import org.eclipse.xtext.naming.IQualifiedNameProvider

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.ASTHelper
import fr.inria.diverse.k3.sle.ast.MetamodelExtensions

class TransformationJvmModelInferrer
{
	@Inject extension JvmModelInferrerHelper
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension ASTHelper
	@Inject extension MetamodelExtensions

	def generateTransformation(Transformation transfo, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(transfo.toClass(transfo.className))
		.initializeLater[
			val returnType = transfo.returnTypeRef ?: transfo.newTypeRef(Void.TYPE)

			members += transfo.toMethod("call", returnType)[
				^static = true

				transfo.parameters.forEach[p |
					parameters += transfo.toParameter(p.name, p.parameterType)
				]

				body = transfo.body
			]

			if (transfo.main) {
				members += transfo.toMethod("main", transfo.newTypeRef(Void.TYPE))[
					^static = true

					parameters += transfo.toParameter("args", transfo.newTypeRef(String).addArrayTypeDimension)

					val root = transfo.eContainer as ModelTypingSpace

					// TODO: Remove hardcoded types in the following body code
					body = '''
						«FOR mm : root.metamodels»
						org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(
							«mm.getPackageFqn».eNS_URI,
							«mm.getPackageFqn».eINSTANCE
						) ;
							«FOR mt : mm.^implements»
							fr.inria.diverse.k3.sle.lib.AdaptersRegistry.getInstance().registerAdapter(
								"«mm.fullyQualifiedName»",
								"«mt.fullyQualifiedName»",
								«mm.adapterNameFor(mt)».class
							) ;
							«ENDFOR»
						«ENDFOR»

						org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
							"*",
							new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl()
						) ;

						call() ;
					'''
				]
			}
		]
	}
}
