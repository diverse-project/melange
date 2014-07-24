package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.ASTHelper
import fr.inria.diverse.k3.sle.ast.MetamodelExtensions
import fr.inria.diverse.k3.sle.ast.ModelTypeExtensions
import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.lib.EObjectAdapter
import fr.inria.diverse.k3.sle.lib.EcoreExtensions
import fr.inria.diverse.k3.sle.lib.GenericAdapter

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel

import fr.inria.diverse.k3.sle.utils.AspectToEcore

import java.util.ArrayList
import java.util.List

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.EMap

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.TypesFactory

import org.eclipse.xtext.naming.IQualifiedNameProvider

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class MetamodelJvmModelInferrer
{
	@Inject extension JvmModelInferrerHelper
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension ASTHelper
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension MetamodelExtensions
	@Inject extension EcoreExtensions
	@Inject extension AspectToEcore

	def boolean +=(EList<JvmMember> members, JvmOperation m) {
		if (!members.filter(JvmOperation).exists[overrides(m)])
			members += (m as JvmMember)

		false
	}

	def generateAdapters(Metamodel mm, IJvmDeclaredTypeAcceptor acceptor) {
		// TODO: Test when the subtype has more classes than the supertype and vice-versa
		mm.^implements.forEach[superType |
			superType.allClasses.filter[abstractable].forEach[cls |
				val mmCls = mm.allClasses.findFirst[name == cls.name]

				acceptor.accept(mm.toClass(mm.adapterNameFor(superType, cls)))
				.initializeLater[
					superTypes += mm.newTypeRef(GenericAdapter, mm.newTypeRef(mm.getFqnFor(mmCls)))
					superTypes += mm.newTypeRef(superType.interfaceNameFor(cls))

					// TODO: Generic super types
					cls.EGenericSuperTypes.forEach[sup |]

					// TODO: Type parameters
					cls.ETypeParameters.forEach[p |

					]

					members += mm.toField("adaptee",  mm.newTypeRef(mm.getFqnFor(mmCls)))
					members += mm.toGetter("adaptee", mm.newTypeRef(mm.getFqnFor(mmCls)))
					members += mm.toSetter("adaptee", mm.newTypeRef(mm.getFqnFor(mmCls)))

					cls.EAllAttributes.filter[!isAspectSpecific].forEach[attr |
						val baseType = if (attr.EAttributeType !== null) superType.newTypeRef(attr.EAttributeType) else superType.newTypeRef(attr.EType)
						val realType = if (attr.many) attr.newTypeRef(List, baseType) else baseType
						val getterName = if (!mm.isUml(attr.EContainingClass)) attr.getterName else attr.umlGetterName
						val setterName = attr.setterName

						// FIXME: Attributes can point to EClasses, so it's not that simple
						members += attr.toMethod(getterName, realType)[
							body = '''
							return adaptee.«getterName»() ;
							'''
						]

						if (attr.needsSetter) {
							members += attr.toMethod(setterName, attr.newTypeRef(Void.TYPE))[
								parameters += attr.toParameter("o", baseType)
								body = '''
								adaptee.«setterName»(o) ;
								'''
							]
						}

						if (attr.unsettable)
							members += attr.toUnsetter(attr.name)
					]

					cls.EAllReferences.filter[!isAspectSpecific].forEach[ref |
						val mmRef = mmCls.EAllReferences.findFirst[name == ref.name]
						val baseType = superType.newTypeRef(ref.EReferenceType)
						val realType = if (ref.many) ref.newTypeRef(List, baseType) else baseType
						val intfName = superType.interfaceNameFor(ref.EReferenceType)
						val adapName = mm.adapterNameFor(superType, ref.EReferenceType)
						val getterName = if (!mm.isUml(ref.EContainingClass)) ref.getterName else ref.umlGetterName
						val setterName = ref.setterName

						if (ref.isEMFMapDetails) // Special case: EMF Map$Entry
							members += ref.toMethod("getDetails", ref.newTypeRef(EMap, ref.newTypeRef(String), ref.newTypeRef(String)))[
								body = '''return adaptee.getDetails() ;'''
							]
						else
							members += ref.toMethod(getterName, realType)[
								body = '''
								«IF ref.many»
								return new fr.inria.diverse.k3.sle.lib.ListAdapter<
									«intfName»,
									«mm.getFqnFor(mmRef.EReferenceType)»
									>(adaptee.«getterName»(), «adapName».class
								) ;
								«ELSE»
								«adapName» adap = new «adapName»() ;
								adap.setAdaptee(adaptee.«getterName»()) ;
								return adap ;
								«ENDIF»
								'''
							]

						if (ref.needsSetter) {
							members += ref.toMethod(setterName, ref.newTypeRef(Void.TYPE))[
								parameters += ref.toParameter("o", realType)

								body = '''
								«adapName» wrap = («adapName») o ;
								adaptee.«setterName»(wrap.getAdaptee()) ;
								'''
							]
						}

						if (ref.unsettable)
							members += ref.toUnsetter(ref.name)
					]

					cls.EAllOperations.filter[!isAspectSpecific].forEach[op |
						val baseType = if (op.EType !== null) superType.newTypeRef(op.EType) else op.newTypeRef(Void.TYPE)
						val realType = if (op.many) op.newTypeRef(List, baseType) else baseType
						val opName = if (!mm.isUml(op.EContainingClass)) op.name else op.formatUmlOperationName

						members += op.toMethod(opName, realType)[
							val paramsList = new StringBuilder

							op.EParameters.forEach[p, i |
								val pType =
								if (p.EGenericType !== null && p.EGenericType.ETypeArguments.size > 0) {
									val typeArgs = new ArrayList<JvmTypeReference>

									p.EGenericType.ETypeArguments.forEach[
										if (EClassifier !== null)
											typeArgs += superType.newTypeRef(EClassifier)
										else
											typeArgs += TypesFactory.eINSTANCE.createJvmWildcardTypeReference
									]

									op.newTypeRef(superType.newTypeRef(p.EGenericType?.EClassifier).type.qualifiedName, typeArgs)
								} else
									superType.newTypeRef(p.EType)

								parameters += op.toParameter(p.name, pType)

								paramsList.append('''
									«IF i > 0», «ENDIF»
									«IF p.EType instanceof EClass && mm.hasAdapterFor(superType, p.EType)»
									((«mm.adapterNameFor(superType, p.EType as EClass)») «p.name»).getAdaptee()
									«ELSE»
									«p.name»
									«ENDIF»
								''')
							]

							// TODO: Manage type parameters
							op.ETypeParameters.forEach[t |]

							// TODO: Manage exceptions
							op.EExceptions.forEach[e |
								exceptions += op.newTypeRef(if (e.instanceClass !== null) e.instanceClass.name else e.instanceTypeName)
							]

							// TODO: Manage generic exceptions
							op.EGenericExceptions.forEach[e |]

							body = '''
							«IF op.EType instanceof EClass && mm.hasAdapterFor(superType, cls)»
								«IF op.many»
								return new fr.inria.diverse.k3.sle.lib.ListAdapter<
									«superType.interfaceNameFor(op.EType as EClass)»,
									«mm.getFqnFor(op.EType)»
									>(adaptee.«opName»(«paramsList»), «mm.adapterNameFor(superType, op.EType as EClass)».class
								) ;
								«ELSE»
								«mm.adapterNameFor(superType, op.EType as EClass)» adap = new «mm.adapterNameFor(superType, op.EType as EClass)»() ;
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

					mm.allAspects.filter[aspectedClass.name == cls.name]
					.forEach[aspect |
						val asp = aspect.aspectRef.type as JvmDeclaredType
						val inherited = mm.inheritanceRelation?.superMetamodel !== null && mm.inheritanceRelation.superMetamodel.aspects.exists[aspectRef.type.qualifiedName == asp.qualifiedName]
						val superMM = mm.inheritanceRelation?.superMetamodel

						asp.declaredOperations
						.filter[op |
							   !op.simpleName.startsWith("_privk3")
							&& !op.simpleName.startsWith("super_")
							//&& op.parameters.head?.name == "_self"
							&& !members.exists[opp | opp.simpleName == op.simpleName] // FIXME
						]
						.forEach[op |
							val paramsList = new StringBuilder
							val featureName = asp.findFeatureNameFor(op)
							val mtCls = superType.findClassifier(op.returnType.simpleName)
							val retType =
								if (op.returnType.simpleName == "void")
									mm.newTypeRef(Void.TYPE)
								else if (mtCls !== null)
									superType.newTypeRef(mtCls)
								else
									mm.newTypeRef(op.returnType.qualifiedName)

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
								members += mm.toMethod(op.simpleName, retType)[
									op.parameters.drop(if (op.parameters.head?.simpleName == "_self") 1 else 0).forEach[p |
										val pCls = superType.findClassifier(p.parameterType.simpleName)
										val pType =
											if (pCls !== null)
												superType.newTypeRef(pCls)
											else
												mm.newTypeRef(p.parameterType.qualifiedName)

										parameters += mm.toParameter(p.name, pType)
									]

									body = '''
										«IF inherited»
										«mm.adapterNameFor(superMM, cls)» clsAdaptee = new «mm.adapterNameFor(superMM, cls)»() ;
										clsAdaptee.setAdaptee(adaptee) ;
										«IF retType.type.simpleName != "void" && retType.type.simpleName != "null"»
										«superMM.adapterNameFor(superType, retType.type.simpleName)» adap = new «superMM.adapterNameFor(superType, retType.type.simpleName)»() ;
										adap.setAdaptee(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
										return adap ;
										«ELSE»
										«asp.qualifiedName».«op.simpleName»(«paramsList») ;
										«ENDIF»
										«ELSEIF mm.hasAdapterFor(superType, retType?.type?.simpleName)»
										«mm.adapterNameFor(superType, retType.type.simpleName)» adap = new «mm.adapterNameFor(superType, retType.type.simpleName)»() ;
										adap.setAdaptee(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
										return adap ;
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
									members += mm.toMethod(opName, retType)[
										op.parameters.drop(1).forEach[p |
											val pCls = superType.findClassifier(p.parameterType.simpleName)
											val pType =
												if (pCls !== null)
													superType.newTypeRef(pCls)
												else
													mm.newTypeRef(p.parameterType.qualifiedName)

											parameters += mm.toParameter(p.name, pType)
										]
										body = '''
											«IF inherited»
											«mm.adapterNameFor(superMM, cls)» clsAdaptee = new «mm.adapterNameFor(superMM, cls)»() ;
											clsAdaptee.setAdaptee(adaptee) ;
											«IF retType.type.simpleName != "void"»
											«superMM.adapterNameFor(superType, retType.type.simpleName)» adap = new «superMM.adapterNameFor(superType, retType.type.simpleName)»() ;
											adap.setAdaptee(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
											return adap ;
											«ELSE»
											«asp.qualifiedName».«op.simpleName»(«paramsList») ;
											«ENDIF»
											«ELSEIF mm.hasAdapterFor(superType, retType.type.simpleName)»
											«mm.adapterNameFor(superType, retType.type.simpleName)» adap = new «mm.adapterNameFor(superType, retType.type.simpleName)»() ;
											adap.setAdaptee(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
											return adap ;
											«ELSEIF retType.type.simpleName != "void"»
											return «asp.qualifiedName».«op.simpleName»(«paramsList») ;
											«ELSE»
											«asp.qualifiedName».«op.simpleName»(«paramsList») ;
											«ENDIF»
										'''
									]
								} else {
									members += mm.toMethod(opName, retType)[
										op.parameters.drop(1).forEach[p |
											val pCls = superType.findClassifier(p.parameterType.simpleName)
											val pType =
												if (pCls !== null)
													superType.newTypeRef(pCls)
												else
													mm.newTypeRef(p.parameterType.qualifiedName)

											parameters += mm.toParameter(p.name, pType)
										]
										body = '''
											«IF inherited»
											«mm.adapterNameFor(superMM, cls)» clsAdaptee = new «mm.adapterNameFor(superMM, cls)»() ;
											clsAdaptee.setAdaptee(adaptee) ;
											«IF retType.type.simpleName != "void"»
											«IF mm.hasAdapterFor(superType, retType.type.simpleName)»
											«superMM.adapterNameFor(superType, retType.type.simpleName)» adap = new «superMM.adapterNameFor(superType, retType.type.simpleName)»() ;
											adap.setAdaptee(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
											return adap ;
											«ELSE»
											return «asp.qualifiedName».«op.simpleName»(«paramsList») ;
											«ENDIF»
											«ELSE»
											«asp.qualifiedName».«op.simpleName»(«paramsList») ;
											«ENDIF»
											«ELSEIF mm.hasAdapterFor(superType, retType.type.simpleName)»
											«mm.adapterNameFor(superType, retType.type.simpleName)» adap = new «mm.adapterNameFor(superType, retType.type.simpleName)»() ;
											adap.setAdaptee(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
											return adap ;
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
			]

			acceptor.accept(mm.toClass(mm.factoryAdapterNameFor(superType)))
			.initializeLater[
				superTypes += mm.newTypeRef(superType.factoryName)

				mm.pkgs.forEach[pkg |
					members += mm.toField(pkg.nsPrefix + "Adaptee", mm.newTypeRef(mm.getFactoryFqnFor(pkg)))[
						initializer = '''«mm.getFactoryFqnFor(pkg)».eINSTANCE'''
					]
				]

				superType.allClasses.filter[instantiable].forEach[cls |
					members += mm.toMethod("create" + cls.name, mm.newTypeRef(superType.interfaceNameFor(cls)))[
						val associatedPkg = mm.pkgs.findFirst[EClassifiers.exists[name == cls.name]]

						body = '''
							«mm.adapterNameFor(superType, cls)» adap = new «mm.adapterNameFor(superType, cls)»() ;
							adap.setAdaptee(«associatedPkg.nsPrefix»Adaptee.create«cls.name»()) ;
							return adap ;
						'''
					]
				]
			]

			acceptor.accept(mm.toClass(mm.adapterNameFor(superType)))
			.initializeLater[
				superTypes += mm.newTypeRef(GenericAdapter, mm.newTypeRef(Resource))
				superTypes += mm.newTypeRef(superType.fullyQualifiedName.toString)

				members += mm.toField("adaptee",  mm.newTypeRef(Resource))
				members += mm.toGetter("adaptee", mm.newTypeRef(Resource))
				members += mm.toSetter("adaptee", mm.newTypeRef(Resource))

				members += mm.toMethod("getContents", mm.newTypeRef(List, mm.newTypeRef(Object)))[
					body = '''
						java.util.List<java.lang.Object> ret = new java.util.ArrayList<java.lang.Object>() ;

						for (org.eclipse.emf.ecore.EObject o : adaptee.getContents()) {
						«FOR r : mm.allClasses.filter[name != "EObject" && mm.hasAdapterFor(superType, it) && instantiable && abstractable].sortByClassInheritance»
							if (o instanceof «mm.getFqnFor(r)») {
								«mm.getFqnFor(r)» wrap = («mm.getFqnFor(r)») o ;
								«mm.adapterNameFor(superType, r)» adap = new «mm.adapterNameFor(superType, r)»() ;
								adap.setAdaptee(wrap) ;
								ret.add(adap) ;
							} else
						«ENDFOR» ret.add(o) ;
						}

						return ret ;
					'''
				]

				members += mm.toMethod("getFactory", mm.newTypeRef(superType.factoryName))[
					body = '''
						return new «mm.factoryAdapterNameFor(superType)»() ;
					'''
				]
			]
		]

		if (mm.hasSuperMetamodel) {
			val superMM = mm.inheritanceRelation.superMetamodel

			superMM.allClasses.forEach[cls |
				val inCls = mm.allClasses.findFirst[name == cls.name]

				acceptor.accept(mm.toClass(mm.adapterNameFor(superMM, cls)))
				.initializeLater[
					superTypes += mm.newTypeRef(superMM.getFqnFor(cls))
					superTypes += mm.newTypeRef(EObjectAdapter, mm.newTypeRef(mm.getFqnFor(inCls)))

					members += mm.toField("adaptee",  mm.newTypeRef(mm.getFqnFor(cls)))
					members += mm.toGetter("adaptee", mm.newTypeRef(mm.getFqnFor(cls)))
					members += mm.toSetter("adaptee", mm.newTypeRef(mm.getFqnFor(cls)))

					cls.EAllAttributes.forEach[attr |
						val baseType =
							if (attr.EAttributeType?.instanceClass !== null)
								mm.newTypeRef(attr.EAttributeType.instanceClass.name)
							else if (attr.EAttributeType !== null && attr.EAttributeType instanceof EEnum)
								mm.newTypeRef(attr.EAttributeType.name)
							else
								mm.newTypeRef(superMM.getFqnFor(inCls))

						val returnType = if (attr.many) mm.newTypeRef(List, baseType) else baseType

						members += attr.toMethod(attr.getterName, returnType)[
							body = '''return adaptee.«attr.getterName»() ;'''
						]

						if (!attr.many && attr.changeable)
							members += attr.toMethod(attr.setterName, mm.newTypeRef(Void::TYPE))[
								parameters += attr.toParameter("o", baseType)
								body = '''adaptee.«attr.setterName»(o) ;'''
							]
					]

					cls.EAllReferences.forEach[ref |
						val inRef = inCls.EAllReferences.findFirst[it.name == ref.name]
						val adapName = mm.adapterNameFor(superMM, ref.EReferenceType)
						val baseType =
							if (ref.EReferenceType.instanceClass === null)
								mm.newTypeRef(superMM.getFqnFor(ref.EReferenceType))
							else
								mm.newTypeRef(ref.EReferenceType.instanceClass.name)

						if (ref.many)
							members += ref.toMethod(ref.getterName, mm.newTypeRef(EList, baseType))[
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
							members += ref.toMethod(ref.getterName, baseType)[
									body = '''
										«adapName» adap = new «adapName»() ;
										adap.setAdaptee(adaptee.«ref.getterName»()) ;
										return adap ;
									'''
								]

							if (ref.changeable)
								members += ref.toMethod(ref.setterName, mm.newTypeRef(Void::TYPE))[
										parameters += ref.toParameter("o", mm.newTypeRef(superMM.getFqnFor(ref.EReferenceType)))
										body = '''
											«adapName» wrap = («adapName») o ;
											adaptee.«ref.setterName»(wrap.getAdaptee()) ;
										'''
									]
						}
					]
				]
			]
		}

		acceptor.accept(mm.toClass(mm.fullyQualifiedName.normalize.toString))
		.initializeLater[]
	}
}
