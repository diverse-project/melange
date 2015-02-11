package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.NamingHelper

import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.ResourceType
import fr.inria.diverse.melange.metamodel.melange.XbaseTransformation

import org.eclipse.xtext.naming.IQualifiedNameProvider

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

/**
 * This class generates a Java class for a Transformation
 */
class TransformationInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension ASTHelper
	@Inject extension NamingHelper
	@Inject extension MetamodelExtensions

	def void generateTransformation(XbaseTransformation transfo, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		val task = Stopwatches.forTask("generate transformations")
		task.start

		acceptor.accept(transfo.toClass(transfo.className.toString))
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
								fr.inria.diverse.melange.lib.AdaptersRegistry.getInstance().registerAdapter(
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
