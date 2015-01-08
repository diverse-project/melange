package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.NamingHelper

import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.EObjectAdapter

import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType

import fr.inria.diverse.melange.utils.AspectToEcore

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.EMap

import org.eclipse.emf.ecore.EClass

import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.TypesFactory

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

class MetaclassAdapterInferrer
{
	@Inject extension JvmModelInferrerHelper
	@Inject extension JvmTypesBuilder
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension MetamodelExtensions
	@Inject extension EcoreExtensions
	@Inject extension AspectToEcore
	@Inject extension MelangeTypesBuilder

	def void generateAdapter(Metamodel mm, ModelType superType, EClass cls, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		val task = Stopwatches.forTask("generate metaclass adapters")
		task.start

		val mmCls = mm.allClasses.findFirst[name == cls.name]

		acceptor.accept(mm.toClass(mm.adapterNameFor(superType, cls)))
		[jvmCls |
			cls.ETypeParameters.forEach[p |
				jvmCls.typeParameters += TypesFactory::eINSTANCE.createJvmTypeParameter => [name = p.name]
			]

			jvmCls.superTypes += EObjectAdapter.typeRef(mm.typeRef(mmCls, #[jvmCls]))
			jvmCls.superTypes += superType.typeRef(cls, #[jvmCls])

			// TODO: Generic super types
			cls.EGenericSuperTypes.forEach[sup |]

			// TODO: Type parameters
			cls.ETypeParameters.forEach[p |]

			jvmCls.members += mm.toField("adaptersFactory", mm.getAdaptersFactoryNameFor(superType).typeRef)[
				initializer = '''«mm.getAdaptersFactoryNameFor(superType)».getInstance()'''
			]

			cls.EAllAttributes.filter[!isAspectSpecific].forEach[attr |
				val attrType = superType.typeRef(attr, #[jvmCls])
				val getterName = if (!mm.isUml(attr.EContainingClass)) attr.getterName else attr.umlGetterName
				val setterName = attr.setterName

				jvmCls.members += mm.toMethod(getterName, attrType)[
					body = '''
						return adaptee.«getterName»() ;
					'''
				]

				if (attr.needsSetter) {
					jvmCls.members += mm.toMethod(setterName, Void::TYPE.typeRef)[
						parameters += mm.toParameter("o", attrType)
						body = '''
							adaptee.«setterName»(o) ;
						'''
					]
				}

				if (attr.needsUnsetter)
					jvmCls.members += mm.toUnsetter(attr.name)

				if (attr.needsUnsetterChecker)
					jvmCls.members += mm.toUnsetterCheck(attr.name)
			]

			cls.EAllReferences.filter[!isAspectSpecific].forEach[ref |
				val refType = superType.typeRef(ref, #[jvmCls])
				val adapName = mm.adapterNameFor(superType, ref.EReferenceType)
				val getterName = if (!mm.isUml(ref.EContainingClass)) ref.getterName else ref.umlGetterName
				val setterName = ref.setterName

				if (ref.isEMFMapDetails) // Special case: EMF Map$Entry
					jvmCls.members += mm.toMethod("getDetails", EMap.typeRef(String.typeRef, String.typeRef))[
						body = '''return adaptee.getDetails() ;'''
					]
				else
					jvmCls.members += mm.toMethod(getterName, refType)[
						body = '''
							«IF ref.many»
								return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.«getterName»(), «adapName».class) ;
							«ELSE»
								return adaptersFactory.create«mm.simpleAdapterNameFor(superType, ref.EReferenceType)»(adaptee.«getterName»()) ;
							«ENDIF»
						'''
					]

				if (ref.needsSetter) {
					jvmCls.members += mm.toMethod(setterName, Void::TYPE.typeRef)[
						parameters += mm.toParameter("o", refType)

						body = '''
							adaptee.«setterName»(((«adapName») o).getAdaptee()) ;
						'''
					]
				}

				if (ref.needsUnsetter)
					jvmCls.members += mm.toUnsetter(ref.name)

				if (ref.needsUnsetterChecker)
					jvmCls.members += mm.toUnsetterCheck(ref.name)
			]

			cls.EAllOperations.sortByOverridingPriority.filter[!isAspectSpecific]
			.forEach[op |
				val opName = if (!mm.isUml(op.EContainingClass)) op.name else op.formatUmlOperationName

				val newOp = mm.toMethod(opName, null)[m |
					val paramsList = new StringBuilder

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
									typeReference = superType.typeRef(b, #[m, jvmCls])
								]
							} else if (b.ETypeParameter !== null) {
								tp.constraints += TypesFactory.eINSTANCE.createJvmUpperBound => [
									typeReference = createTypeParameterReference(#[m, jvmCls], b.ETypeParameter.name)
								]
							}
						]
					]

					op.EParameters.forEach[p, i |
						val pType = superType.typeRef(p, #[m, jvmCls])

						m.parameters += mm.toParameter(p.name, pType)

						paramsList.append('''
							«IF i > 0», «ENDIF»
							«IF p.EType instanceof EClass && mm.hasAdapterFor(superType, p.EType)»
							((«mm.adapterNameFor(superType, p.EType as EClass)») «p.name»).getAdaptee()
							«ELSE»
							«p.name»
							«ENDIF»
						''')
					]

					// TODO: Manage exceptions
					op.EExceptions.forEach[e |
						m.exceptions += typeRef(if (e.instanceClass !== null) e.instanceClass.name else e.instanceTypeName)
					]

					// TODO: Manage generic exceptions
					op.EGenericExceptions.forEach[e |]

					m.body = '''
						«IF op.EType instanceof EClass && mm.hasAdapterFor(superType, cls)»
							«IF op.many»
								return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.«opName»(«paramsList»), «mm.adapterNameFor(superType, op.EType as EClass)».class) ;
							«ELSE»
								return adaptersFactory.create«mm.simpleAdapterNameFor(superType, op.EType as EClass)»(adaptee.«opName»(«paramsList»)) ;
							«ENDIF»
						«ELSEIF op.EType !== null»
							return adaptee.«opName»(«paramsList») ;
						«ELSE»
							adaptee.«opName»(«paramsList») ;
						«ENDIF»
					'''
				]

				newOp.returnType = superType.typeRef(op, #[newOp, jvmCls])
				jvmCls.members += newOp
			]

			mm.allAspects.filter[aspectedClass.name == cls.name]
			.forEach[aspect |
				val asp = aspect.aspectTypeRef.type as JvmDeclaredType
				// FIXME: This should be checked in the recursive hierarchy
				val superMM = mm.inheritanceRelation?.superMetamodel
				val inherited = superMM !== null && superMM.aspects.exists[aspectTypeRef.type.qualifiedName == asp.qualifiedName]

				asp.declaredOperations
				.filter[op |
					   !op.simpleName.startsWith("_privk3")
					&& !op.simpleName.startsWith("super_")
					//&& op.parameters.head?.name == "_self"
					&& !jvmCls.members.exists[opp | opp.simpleName == op.simpleName] // FIXME
				]
				.forEach[op |
					val paramsList = new StringBuilder
					val featureName = asp.findFeatureNameFor(op)
					val mtCls = superType.findClassifier(op.returnType.simpleName)
					val retType =
						if (op.returnType.simpleName == "void")
							typeRef(Void.TYPE)
						else if (mtCls !== null)
							superType.typeRef(mtCls, #[jvmCls])
						else
							typeRef(op.returnType.qualifiedName)

					paramsList.append('''«IF inherited»clsAdaptee«ELSE»adaptee«ENDIF»''')
					op.parameters.drop(if (op.parameters.head?.simpleName == "_self") 1 else 0).forEach[p, i |
						paramsList.append('''
							«IF inherited && superMM.hasAdapterFor(superType, p.parameterType.simpleName)»
								, ((«superMM.adapterNameFor(superType, p.parameterType.simpleName)») «p.name»).getAdaptee()
							«ELSEIF mm.hasAdapterFor(superType, p.parameterType.simpleName)»
								, ((«mm.adapterNameFor(superType, p.parameterType.simpleName)») «p.name»).getAdaptee()
							«ELSE»
								, «p.name»
							«ENDIF»
						''')
					]

					if (featureName === null) {
						jvmCls.members += mm.toMethod(op.simpleName, retType)[
							op.parameters.drop(if (op.parameters.head?.simpleName == "_self") 1 else 0).forEach[p |
								val pCls = superType.findClassifier(p.parameterType.simpleName)
								val pType =
									if (pCls !== null)
										superType.typeRef(pCls, #[jvmCls])
									else
										typeRef(p.parameterType.qualifiedName)

								parameters += mm.toParameter(p.name, pType)
							]

							body = '''
								«IF inherited»
									«mm.adapterNameFor(superMM, cls)» clsAdaptee = new «mm.adapterNameFor(superMM, cls)»() ;
									clsAdaptee.setAdaptee(adaptee) ;
									«IF retType.type.simpleName != "void" && retType.type.simpleName != "null"»
										return adaptersFactory.create«superMM.simpleAdapterNameFor(superType, retType.type.simpleName)»(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
									«ELSE»
										«asp.qualifiedName».«op.simpleName»(«paramsList») ;
									«ENDIF»
								«ELSEIF mm.hasAdapterFor(superType, retType?.type?.simpleName)»
									return adaptersFactory.create«mm.simpleAdapterNameFor(superType, retType.type.simpleName)»(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
								«ELSEIF retType.type.simpleName != "void" && retType.type.simpleName != "null"»
									return «asp.qualifiedName».«op.simpleName»(«paramsList») ;
								«ELSE»
									«asp.qualifiedName».«op.simpleName»(«paramsList») ;
								«ENDIF»
							'''
						]
					} else {
						val find = mm.findClass(retType.simpleName)
						val opName = if (op.parameters.size == 1) op.getterName else op.setterName

						if (find !== null) {
							jvmCls.members += mm.toMethod(opName, retType)[
								op.parameters.drop(1).forEach[p |
									val pCls = superType.findClassifier(p.parameterType.simpleName)
									val pType =
										if (pCls !== null)
											superType.typeRef(pCls, #[jvmCls])
										else
											typeRef(p.parameterType.qualifiedName)

									parameters += mm.toParameter(p.name, pType)
								]
								body = '''
									«IF inherited»
										«mm.adapterNameFor(superMM, cls)» clsAdaptee = new «mm.adapterNameFor(superMM, cls)»() ;
										clsAdaptee.setAdaptee(adaptee) ;
										«IF retType.type.simpleName != "void"»
											return adaptersFactory.create«superMM.simpleAdapterNameFor(superType, retType.type.simpleName)»(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
										«ELSE»
											«asp.qualifiedName».«op.simpleName»(«paramsList») ;
										«ENDIF»
									«ELSEIF mm.hasAdapterFor(superType, retType.type.simpleName)»
										return adaptersFactory.create«mm.simpleAdapterNameFor(superType, retType.type.simpleName)»(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
									«ELSEIF retType.type.simpleName != "void"»
										return «asp.qualifiedName».«op.simpleName»(«paramsList») ;
									«ELSE»
										«asp.qualifiedName».«op.simpleName»(«paramsList») ;
									«ENDIF»
								'''
							]
						} else {
							jvmCls.members += mm.toMethod(opName, retType)[
								op.parameters.drop(1).forEach[p |
									val pCls = superType.findClassifier(p.parameterType.simpleName)
									val pType =
										if (pCls !== null)
											superType.typeRef(pCls, #[jvmCls])
										else
											typeRef(p.parameterType.qualifiedName)

									parameters += mm.toParameter(p.name, pType)
								]
								body = '''
									«IF inherited»
										«mm.adapterNameFor(superMM, cls)» clsAdaptee = new «mm.adapterNameFor(superMM, cls)»() ;
										clsAdaptee.setAdaptee(adaptee) ;
										«IF retType.type.simpleName != "void"»
											«IF mm.hasAdapterFor(superType, retType.type.simpleName)»
												return adaptersFactory.create«superMM.simpleAdapterNameFor(superType, retType.type.simpleName)»(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
											«ELSE»
												return «asp.qualifiedName».«op.simpleName»(«paramsList») ;
											«ENDIF»
										«ELSE»
											«asp.qualifiedName».«op.simpleName»(«paramsList») ;
										«ENDIF»
									«ELSEIF mm.hasAdapterFor(superType, retType.type.simpleName)»
										return adaptersFactory.create«mm.simpleAdapterNameFor(superType, retType.type.simpleName)»(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
										«ELSEIF retType.type.simpleName != "void"»
											return «asp.qualifiedName».«op.simpleName»(«paramsList») ;
									«ELSE»
										«asp.qualifiedName».«op.simpleName»(«paramsList») ;
									«ENDIF»
								'''
							]
						}
					}
				]
			]
		]

		task.stop
	}

	def boolean +=(EList<JvmMember> members, JvmOperation m) {
		if (!members.filter(JvmOperation).exists[overrides(m)])
			members += (m as JvmMember)

		return false
	}
}
