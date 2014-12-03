package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.MetamodelExtensions
import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.lib.EObjectAdapter
import fr.inria.diverse.k3.sle.lib.EcoreExtensions

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel

import org.eclipse.emf.common.util.EList

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum

import org.eclipse.xtext.common.types.TypesFactory

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

class InheritanceAdapterInferrer
{
	@Inject extension JvmModelInferrerHelper
	@Inject extension JvmTypesBuilder
	@Inject extension NamingHelper
	@Inject extension MetamodelExtensions
	@Inject extension EcoreExtensions
	@Inject extension K3SLETypesBuilder

	def void generateAdapters(Metamodel mm, Metamodel superMM, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		val task = Stopwatches.forTask("generate inheritance adapters")
		task.start

		superMM.allClasses.forEach[cls |
			val inCls = mm.allClasses.findFirst[name == cls.name]

			acceptor.accept(mm.toClass(mm.adapterNameFor(superMM, cls)))
			[jvmCls |
				jvmCls.superTypes += superMM.getFqnFor(cls).typeRef
				jvmCls.superTypes += EObjectAdapter.typeRef(mm.typeRef(inCls, #[jvmCls]))

				jvmCls.members += mm.toField("adaptee",  mm.typeRef(cls, #[jvmCls]))
				jvmCls.members += mm.toGetter("adaptee", mm.typeRef(cls, #[jvmCls]))
				jvmCls.members += mm.toSetter("adaptee", mm.typeRef(cls, #[jvmCls]))

				cls.EAllAttributes.forEach[attr |
					val baseType =
						if (attr.EAttributeType?.instanceClass !== null)
							attr.EAttributeType.instanceClass.name.typeRef
						else if (attr.EAttributeType !== null && attr.EAttributeType instanceof EEnum)
							superMM.getFqnFor(attr.EAttributeType).typeRef
						else
							superMM.getFqnFor(inCls).typeRef

					val returnType = if (attr.many) EList.typeRef(baseType) else baseType

					jvmCls.members += attr.toMethod(attr.getterName, returnType)[
						body = '''return adaptee.«attr.getterName»() ;'''
					]

					if (attr.needsSetter)
						jvmCls.members += attr.toMethod(attr.setterName,Void::TYPE.typeRef)[
							parameters += attr.toParameter("o", baseType)
							body = '''adaptee.«attr.setterName»(o) ;'''
						]

					if (attr.needsUnsetter)
						jvmCls.members += attr.toUnsetter(attr.name)

					if (attr.needsUnsetterChecker)
						jvmCls.members += attr.toUnsetterCheck(attr.name)
				]

				cls.EAllReferences.forEach[ref |
					val inRef = inCls.EAllReferences.findFirst[it.name == ref.name]
					val adapName = mm.adapterNameFor(superMM, ref.EReferenceType)
					val baseType =
						if (ref.EReferenceType.instanceClass === null)
							superMM.getFqnFor(ref.EReferenceType).typeRef
						else
							ref.EReferenceType.instanceClass.name.typeRef

					if (ref.many)
						jvmCls.members += ref.toMethod(ref.getterName, EList.typeRef(baseType))[
							body = '''
								«IF ref.EReferenceType.instanceClass !== null»
								return adaptee.«ref.getterName»() ;
								«ELSE»
								return new fr.inria.diverse.k3.sle.lib.EListAdapter<
									«superMM.getFqnFor(ref.EReferenceType)»,
									«mm.getFqnFor(inRef.EReferenceType)»
									>(adaptee.«ref.getterName»(), «adapName».class
								) ;
								«ENDIF»
							'''
						]
					else {
						jvmCls.members += ref.toMethod(ref.getterName, baseType)[
								body = '''
									«adapName» adap = new «adapName»() ;
									adap.setAdaptee(adaptee.«ref.getterName»()) ;
									return adap ;
								'''
							]

						if (ref.needsSetter)
							jvmCls.members += ref.toMethod(ref.setterName, Void::TYPE.typeRef)[
									parameters += ref.toParameter("o", superMM.getFqnFor(ref.EReferenceType).typeRef)
									body = '''
										adaptee.«ref.setterName»(((«adapName») o).getAdaptee()) ;
									'''
								]

						if (ref.needsUnsetter)
							jvmCls.members += ref.toUnsetter(ref.name)

						if (ref.needsUnsetterChecker)
							jvmCls.members += ref.toUnsetterCheck(ref.name)
					}
				]

				cls.EAllOperations.filter[!isAspectSpecific].forEach[op |
					val baseType = if (op.EType !== null) superMM.getFqnFor(op.EType).typeRef else Void::TYPE.typeRef
					val realType = if (op.many) EList.typeRef(baseType) else baseType
					val opName = if (!mm.isUml(op.EContainingClass)) op.name else op.formatUmlOperationName

					jvmCls.members += op.toMethod(opName, realType)[
						val paramsList = new StringBuilder

						op.EParameters.forEach[p, i |
							val pType =
							if (p.EGenericType !== null && p.EGenericType.ETypeArguments.size > 0)
								superMM.getFqnFor(p.EGenericType?.EClassifier).typeRef(
									p.EGenericType.ETypeArguments.map[
										if (EClassifier !== null)
											superMM.getFqnFor(EClassifier).typeRef
										else
											TypesFactory.eINSTANCE.createJvmWildcardTypeReference
									]
								)
							else
								mm.typeRef(superMM, p.EType)

							parameters += op.toParameter(p.name, pType)

							paramsList.append('''
								«IF i > 0», «ENDIF»
								«IF p.EType instanceof EClass»
								((«mm.adapterNameFor(superMM, p.EType as EClass)») «p.name»).getAdaptee()
								«ELSE»
								«p.name»
								«ENDIF»
							''')
						]

						// TODO: Manage type parameters
						op.ETypeParameters.forEach[t |]

						// TODO: Manage exceptions
						op.EExceptions.forEach[e |
							exceptions += typeRef(if (e.instanceClass !== null) e.instanceClass.name else e.instanceTypeName)
						]

						// TODO: Manage generic exceptions
						op.EGenericExceptions.forEach[e |]

						body = '''
						«IF op.EType instanceof EClass»
							«IF op.many»
							return new fr.inria.diverse.k3.sle.lib.EListAdapter<
								«superMM.getFqnFor(op.EType)»,
								«mm.getFqnFor(op.EType)»
								>(adaptee.«opName»(«paramsList»), «mm.adapterNameFor(superMM, op.EType as EClass)».class
							) ;
							«ELSE»
							«mm.adapterNameFor(superMM, op.EType as EClass)» adap = new «mm.adapterNameFor(superMM, op.EType as EClass)»() ;
							adap.setAdaptee(adaptee.«opName»(«paramsList»)) ;
							return adap ;
							«ENDIF»
						«ELSEIF op.EType !== null»
						return adaptee.«opName»(«paramsList») ;
						«ELSE»
						adaptee.«opName»(«paramsList») ;
						«ENDIF»
						'''
					]
				]
			]
		]

		task.stop
	}
}
