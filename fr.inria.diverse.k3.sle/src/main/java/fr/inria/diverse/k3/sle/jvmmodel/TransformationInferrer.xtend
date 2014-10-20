package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.ASTHelper
import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import fr.inria.diverse.k3.sle.metamodel.k3sle.ResourceType
import fr.inria.diverse.k3.sle.metamodel.k3sle.XbaseTransformation

import org.eclipse.xtext.naming.IQualifiedNameProvider

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class TransformationInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension ASTHelper
	@Inject extension NamingHelper

	def void generateTransformation(XbaseTransformation transfo, IJvmDeclaredTypeAcceptor acceptor) {
		val task = Stopwatches.forTask('''TransformationInferrer.generateTransformation(«transfo.name»)''')
		task.start

		acceptor.accept(transfo.toClass(transfo.className.toString))
		[
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
							«IF mm.resourceType == ResourceType.XTEXT && mm.xtextSetupRef !== null»
								«mm.xtextSetupRef.qualifiedName».doSetup() ;
							«ELSE»
								«FOR gm : mm.genmodels»
									«FOR gp : gm.genPackages»
										org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(
											"«gp.NSURI»",
											«gp.packageFqn».eINSTANCE
										) ;
									«ENDFOR»
								«ENDFOR»
							«ENDIF»

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

		task.stop
	}
}
