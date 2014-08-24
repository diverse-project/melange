package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.ModelTypeExtensions
import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.lib.EcoreExtensions
import fr.inria.diverse.k3.sle.lib.IFactory
import fr.inria.diverse.k3.sle.lib.IModelType

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType

import java.util.List

import org.eclipse.emf.common.util.EMap

import org.eclipse.emf.ecore.EClass

import org.eclipse.xtext.common.types.TypesFactory

import org.eclipse.xtext.naming.IQualifiedNameProvider

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class ModelTypeInferrer
{
	@Inject extension JvmModelInferrerHelper
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension EcoreExtensions
	@Inject extension K3SLETypesBuilder

	def void generateInterfaces(ModelType mt, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(mt.toInterface(mt.fullyQualifiedName.toString)[
			superTypes += mt.newTypeRef(IModelType)

			members += mt.toMethod("getContents", mt.newTypeRef(List, mt.newTypeRef(Object)))[
				^abstract = true
			]

			members += mt.toMethod("getFactory", mt.newTypeRef(mt.factoryName))[
				^abstract = true
			]
		])

		acceptor.accept(mt.toInterface(mt.factoryName)[
			superTypes += mt.newTypeRef(IFactory)

			mt.allClasses.filter[instantiable].forEach[cls |
				members += mt.toMethod("create" + cls.name, null)[m |
					m.^abstract = true

					cls.ETypeParameters.forEach[t |
						m.typeParameters += TypesFactory.eINSTANCE.createJvmTypeParameter => [it.name = t.name]
					]
				] => [m |
					m.returnType = mt.newTypeRef(cls, #[m])
				]
			]
		])

		mt.allClasses.filter[abstractable].forEach[cls |
			acceptor.accept(mt.toInterface(mt.interfaceNameFor(cls))[intf |
				cls.ETypeParameters.forEach[p |
					intf.typeParameters += TypesFactory::eINSTANCE.createJvmTypeParameter => [name = p.name]
				]

				cls.EGenericSuperTypes.forEach[sup |
					intf.superTypes += mt.newTypeRef(
						mt.interfaceNameFor(sup.EClassifier as EClass),
						sup.ETypeArguments.map[arg | mt.newTypeRef(arg, #[intf])]
					)
				]

				cls.EAttributes.filter[!derived].forEach[attr |
					val attrType = mt.newTypeRef(attr, #[intf])

					intf.members += if (!mt.isUml(cls)) attr.toGetterSignature(attr.name, attrType) else attr.toUmlGetterSignature(attr.name, attrType)

					if (attr.needsSetter)
						intf.members += attr.toSetterSignature(attr.name, attrType)

					if (attr.needsUnsetter)
						intf.members += attr.toUnsetterSignature(attr.name)

					if (attr.needsUnsetterChecker)
						intf.members += attr.toUnsetterCheckSignature(attr.name)
				]

				cls.EReferences.filter[!derived].forEach[ref |
					val refType = mt.newTypeRef(ref, #[intf])
					val refName = if (!mt.isUml(cls)) ref.name else ref.formatUmlReferenceName

					if (ref.isEMFMapDetails) // Special case: EMF Map$Entry
						intf.members += ref.toMethod("getDetails", ref.newTypeRef(EMap, ref.newTypeRef(String), ref.newTypeRef(String)))[^abstract = true]
					else
						intf.members += if (!mt.isUml(cls)) ref.toGetterSignature(refName, refType) else ref.toUmlGetterSignature(refName, refType)

					if (ref.needsSetter)
						intf.members += ref.toSetterSignature(refName, refType)

					if (ref.needsUnsetter)
						intf.members += ref.toUnsetterSignature(refName)

					if (ref.needsUnsetterChecker)
						intf.members += ref.toUnsetterCheckSignature(refName)
				]

				cls.EOperations.forEach[op |
					val opName = if (!mt.isUml(cls)) op.name else op.formatUmlOperationName

					intf.members += op.toMethod(opName, null)[m |
						op.ETypeParameters.forEach[t |
							m.typeParameters += TypesFactory.eINSTANCE.createJvmTypeParameter => [tp |
								tp.name = t.name
							]
						]

						op.ETypeParameters.forEach[t |
							t.EBounds
							.forEach[b |
								val tp = m.typeParameters.findFirst[name == t.name]

								if (b.EClassifier !== null) {
									tp.constraints += TypesFactory.eINSTANCE.createJvmUpperBound => [
										typeReference = mt.newTypeRef(b, #[m, intf])
									]
								} else if (b.ETypeParameter !== null) {
									tp.constraints += TypesFactory.eINSTANCE.createJvmUpperBound => [
										typeReference = createTypeParameterReference(#[m, intf], b.ETypeParameter.name)
									]
								}
							]
						]

						op.EParameters.forEach[p |
							m.parameters += op.toParameter(p.name, mt.newTypeRef(p, #[m, intf]))
						]

						op.EExceptions.forEach[e |
							m.exceptions += mt.newTypeRef(e, #[m, intf])
						]

						// TODO: Manage generic exceptions
						op.EGenericExceptions.forEach[e |]
					] => [m |
						m.returnType = mt.newTypeRef(op, #[m, intf])
					]
				]
			])
		]
	}
}
