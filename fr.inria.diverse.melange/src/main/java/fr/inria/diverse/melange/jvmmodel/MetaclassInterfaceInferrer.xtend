package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.NamingHelper

import fr.inria.diverse.melange.lib.EcoreExtensions

import fr.inria.diverse.melange.metamodel.melange.ModelType

import org.eclipse.emf.common.util.EMap

import org.eclipse.emf.ecore.EClass

import org.eclipse.xtext.common.types.TypesFactory

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

class MetaclassInterfaceInferrer
{
	@Inject extension JvmModelInferrerHelper
	@Inject extension JvmTypesBuilder
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension EcoreExtensions
	@Inject extension MelangeTypesBuilder

	def void generateInterface(ModelType mt, EClass cls, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		val task = Stopwatches.forTask("generate metaclass interfaces")
		task.start

		acceptor.accept(mt.toInterface(mt.interfaceNameFor(cls))[intf |
			cls.ETypeParameters.forEach[p |
				intf.typeParameters += TypesFactory::eINSTANCE.createJvmTypeParameter => [name = p.name]
			]

			cls.EGenericSuperTypes.forEach[sup |
				intf.superTypes += mt.interfaceNameFor(sup.EClassifier as EClass).typeRef(
					sup.ETypeArguments.map[arg | mt.typeRef(arg, #[intf])]
				)
			]

			cls.EAttributes.filter[!derived].forEach[attr |
				val attrType = mt.typeRef(attr, #[intf])

				intf.members += if (!mt.isUml(cls)) attr.toGetterSignature(attr.name, attrType) else attr.toUmlGetterSignature(attr.name, attrType)

				if (attr.needsSetter)
					intf.members += attr.toSetterSignature(attr.name, attrType)

				if (attr.needsUnsetter)
					intf.members += attr.toUnsetterSignature(attr.name)

				if (attr.needsUnsetterChecker)
					intf.members += attr.toUnsetterCheckSignature(attr.name)
			]

			cls.EReferences.filter[!derived].forEach[ref |
				val refType = mt.typeRef(ref, #[intf])
				val refName = if (!mt.isUml(cls)) ref.name else ref.formatUmlReferenceName

				if (ref.isEMFMapDetails) // Special case: EMF Map$Entry
					intf.members += ref.toMethod("getDetails", EMap.typeRef(String.typeRef, String.typeRef))[^abstract = true]
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
									typeReference = mt.typeRef(b, #[m, intf])
								]
							} else if (b.ETypeParameter !== null) {
								tp.constraints += TypesFactory.eINSTANCE.createJvmUpperBound => [
									typeReference = createTypeParameterReference(#[m, intf], b.ETypeParameter.name)
								]
							}
						]
					]

					op.EParameters.forEach[p |
						m.parameters += op.toParameter(p.name, mt.typeRef(p, #[m, intf]))
					]

					op.EExceptions.forEach[e |
						m.exceptions += mt.typeRef(e, #[m, intf])
					]

					// TODO: Manage generic exceptions
					op.EGenericExceptions.forEach[e |]
				] => [m |
					m.returnType = mt.typeRef(op, #[m, intf])
				]
			]
		])

		task.stop
	}
}
