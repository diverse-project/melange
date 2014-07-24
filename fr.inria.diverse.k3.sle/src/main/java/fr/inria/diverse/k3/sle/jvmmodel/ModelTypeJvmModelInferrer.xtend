package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.ModelTypeExtensions
import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.lib.EcoreExtensions
import fr.inria.diverse.k3.sle.lib.IFactory
import fr.inria.diverse.k3.sle.lib.IModelType

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType

import java.util.ArrayList
import java.util.List

import org.eclipse.emf.common.util.EMap

import org.eclipse.emf.ecore.EClass

import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.TypesFactory

import org.eclipse.xtext.common.types.util.TypeReferences

import org.eclipse.xtext.naming.IQualifiedNameProvider

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class ModelTypeJvmModelInferrer
{
	@Inject extension JvmModelInferrerHelper
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension EcoreExtensions
	@Inject TypeReferences typeReferences

	def generateInterfaces(ModelType mt, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(mt.toInterface(mt.fullyQualifiedName.toString, []))
		.initializeLater[
			superTypes += mt.newTypeRef(IModelType)

			members += mt.toMethod("getContents", mt.newTypeRef(List, mt.newTypeRef(Object)))[
				^abstract = true
			]

			members += mt.toMethod("getFactory", mt.newTypeRef(mt.factoryName))[
				^abstract = true
			]
		]

		acceptor.accept(mt.toInterface(mt.factoryName, []))
		.initializeLater[
			superTypes += mt.newTypeRef(IFactory)

			mt.allClasses.filter[instantiable].forEach[cls |
				members += mt.toMethod("create" + cls.name, mt.newTypeRef(mt.interfaceNameFor(cls)))[
					^abstract = true
				]
			]
		]

		mt.allClasses.filter[abstractable].forEach[cls |
			acceptor.accept(mt.toInterface(mt.interfaceNameFor(cls), []))
			.initializeLater[
				// FIXME: Type bounds, and so on...
				cls.EGenericSuperTypes.forEach[sup |
					if (sup.EClassifier instanceof EClass) {
						typeParameters += sup.EClassifier.ETypeParameters.map[
							TypesFactory::eINSTANCE.createJvmTypeParameter => [p | p.name = name]
						]
						superTypes += mt.newTypeRef(mt.interfaceNameFor(sup.EClassifier as EClass),	typeParameters.map[t | typeReferences.createTypeRef(t).cloneWithProxies])
					}
				]

				// TODO: Type parameters
				cls.ETypeParameters.forEach[p |
					typeParameters += TypesFactory::eINSTANCE.createJvmTypeParameter => [name = p.name]
				]

				cls.EAttributes.filter[!derived].forEach[attr |
					val baseType = if (attr.EAttributeType !== null) mt.newTypeRef(attr.EAttributeType) else mt.newTypeRef(attr.EType)
					val realType = if (attr.many) attr.newTypeRef(List, baseType) else baseType

					members += if (!mt.isUml(cls)) attr.toGetterSignature(attr.name, realType) else attr.toUmlGetterSignature(attr.name, realType)

					if (attr.needsSetter)
						members += attr.toSetterSignature(attr.name, realType)

					if (attr.unsettable)
						members += attr.toUnsetterSignature(attr.name)
				]

				cls.EReferences.filter[!derived].forEach[ref |
					val baseType = mt.newTypeRef(ref.EReferenceType)
					val realType = if (ref.many) ref.newTypeRef(List, baseType) else baseType
					val refName = if (!mt.isUml(cls)) ref.name else ref.formatUmlReferenceName

					if (ref.isEMFMapDetails) // Special case: EMF Map$Entry
						members += ref.toMethod("getDetails", ref.newTypeRef(EMap, ref.newTypeRef(String), ref.newTypeRef(String)))[^abstract = true]
					else
						members += if (!mt.isUml(cls)) ref.toGetterSignature(refName, realType) else ref.toUmlGetterSignature(refName, realType)

					if (ref.needsSetter)
						members += ref.toSetterSignature(refName, realType)

					if (ref.unsettable)
						members += ref.toUnsetterSignature(refName)
				]

				cls.EOperations.forEach[op |
					val baseType = if (op.EType !== null) mt.newTypeRef(op.EType) else op.newTypeRef(Void.TYPE)
					val realType = if (op.many) op.newTypeRef(List, baseType) else baseType
					val opName = if (!mt.isUml(cls)) op.name else op.formatUmlOperationName

					members += op.toMethod(opName, realType)[
						op.EParameters.forEach[p |
							val pType =
								if (p.EGenericType !== null && p.EGenericType.ETypeArguments.size > 0) {
									val typeArgs = new ArrayList<JvmTypeReference>

									p.EGenericType.ETypeArguments.forEach[
										if (EClassifier !== null)
											typeArgs += mt.newTypeRef(EClassifier)
										else
											typeArgs += TypesFactory.eINSTANCE.createJvmWildcardTypeReference
									]

									op.newTypeRef(mt.newTypeRef(p.EGenericType?.EClassifier).type.qualifiedName, typeArgs)
								} else
									mt.newTypeRef(p.EType)

							parameters += op.toParameter(p.name, pType)
						]

						// TODO: Manage type parameters
						op.ETypeParameters.forEach[t |]

						// TODO: Manage exceptions
						op.EExceptions.forEach[e |
							exceptions += op.newTypeRef(if (e.instanceClass !== null) e.instanceClass.name else e.instanceTypeName)
						]

						// TODO: Manage generic exceptions
						op.EGenericExceptions.forEach[e |]
					]
				]
			]
		]
	}
}
