package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.ModelTypeExtensions
import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.lib.EcoreExtensions
import fr.inria.diverse.k3.sle.lib.IFactory
import fr.inria.diverse.k3.sle.lib.IModelType

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType

import java.util.List

import org.eclipse.xtext.common.types.TypesFactory

import org.eclipse.xtext.naming.IQualifiedNameProvider

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

class ModelTypeInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension JvmTypeReferenceBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension EcoreExtensions
	@Inject extension K3SLETypesBuilder
	@Inject extension EnumInferrer
	@Inject extension MetaclassInterfaceInferrer

	def void generateInterfaces(ModelType mt, IJvmDeclaredTypeAcceptor acceptor) {
		val task = Stopwatches.forTask('''ModelTypeInferrer.generateInterfaces(«mt.name»)''')
		task.start

		acceptor.accept(mt.toInterface(mt.fullyQualifiedName.toString)[
			superTypes += typeRef(IModelType)

			members += mt.toMethod("getContents", typeRef(List, typeRef(Object)))[
				^abstract = true
			]

			members += mt.toMethod("getFactory", typeRef(mt.factoryName))[
				^abstract = true
			]

			members += mt.toMethod("save", typeRef(Void.TYPE))[
				parameters += mt.toParameter("uri", typeRef(String))

				exceptions += typeRef(java.io.IOException)
			]
		])

		acceptor.accept(mt.toInterface(mt.factoryName)[
			superTypes += typeRef(IFactory)

			mt.allClasses.filter[instantiable].forEach[cls |
				members += mt.toMethod("create" + cls.name, null)[m |
					m.^abstract = true

					cls.ETypeParameters.forEach[t |
						m.typeParameters += TypesFactory.eINSTANCE.createJvmTypeParameter => [it.name = t.name]
					]
				] => [m |
					m.returnType = mt.typeRef(cls, #[m])
				]
			]
		])

		mt.allClasses.filter[abstractable].forEach[cls |
			mt.generateInterface(cls, acceptor)
		]

		if (mt.isImported)
			mt.allEnums.forEach[enu |
				mt.generateEnum(enu, acceptor)
			]

		task.stop
	}
}
