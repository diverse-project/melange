package fr.inria.diverse.k3.sle.jvmmodel

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.K3sleFactory

import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.JvmDeclaredType

import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

import org.eclipse.xtext.naming.IQualifiedNameProvider

import fr.inria.diverse.k3.sle.lib.GenericAdapter
import fr.inria.diverse.k3.sle.lib.IModelType
import fr.inria.diverse.k3.sle.lib.IFactory
import fr.inria.diverse.k3.sle.lib.EObjectAdapter

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.EMap

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EStructuralFeature

import org.eclipse.emf.ecore.resource.Resource

import java.util.ArrayList
import java.util.List

import com.google.inject.Inject

import static extension fr.inria.diverse.k3.sle.ast.ASTHelper.*
import static extension fr.inria.diverse.k3.sle.ast.NamingHelper.*
import static extension fr.inria.diverse.k3.sle.ast.ModelTypeExtensions.*
import static extension fr.inria.diverse.k3.sle.ast.MetamodelExtensions.*
import static extension fr.inria.diverse.k3.sle.lib.EcoreExtensions.*

class K3SLEJvmModelInferrer extends AbstractModelInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider

	ModelTypingSpace root
	boolean isUnderGeneration = false

	def dispatch infer(ModelTypingSpace typingSpace, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		root = typingSpace

		if (root.isValid) {
			try {
				isUnderGeneration = true

				val newMTs = new ArrayList<ModelType>
				for (mm : root.metamodels) {
					val newMT = K3sleFactory.eINSTANCE.createModelType => [
						name = mm.exactTypeRef
					]

					if (!root.modelTypes.exists[name == newMT.name])
						newMTs += newMT
				}

				root.elements += newMTs
				root.metamodels.forEach[mm |
					mm.exactType = root.modelTypes.findFirst[name == mm.exactTypeRef]
				]

				root.completeAST
				root.inferTypingRelations
				//root.printDebug
				//if (!isPreIndexingPhase)
				//	root.saveAs("platform:/resource/Output/AST.xmi")
				//}

				root.modelTypes.forEach[generateInterfaces(acceptor)]
				root.metamodels.forEach[generateAdapters(acceptor)]
				root.transformations.forEach[generateTransformation(acceptor)]
			} catch (Exception e) {
				e.printStackTrace
			} finally {
				isUnderGeneration = false
			}
		}
	}

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
				cls.ESuperTypes.forEach[sup | superTypes += mt.newTypeRef(mt.interfaceNameFor(sup))]
				// TODO: Generic super types
				cls.EGenericSuperTypes.forEach[sup |]

				// TODO: Type parameters
				cls.ETypeParameters.forEach[p |

				]

				cls.EAttributes.filter[!derived].forEach[attr |
					val baseType = if (attr.EAttributeType !== null) mt.newTypeRef(attr.EAttributeType) else mt.newTypeRef(attr.EType)
					val realType = if (attr.many) attr.newTypeRef(List, baseType) else baseType

					members += if (!mt.isUml(cls)) attr.toGetterSignature(attr.name, realType) else attr.toUmlGetterSignature(attr.name, realType)

					if (attr.needsSetter)
						members += attr.toSetterSignature(attr.name, realType)
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
							&& op.parameters.head?.name == "_self"
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
							op.parameters.drop(1).forEach[p, i |
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
										«ELSEIF mm.hasAdapterFor(superType, retType?.type?.simpleName)»
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

				members += mm.toField("adaptee", mm.newTypeRef(mm.getFactoryFqn))[
					initializer = '''«mm.getFactoryFqn».eINSTANCE'''
				]

				superType.allClasses.filter[instantiable].forEach[cls |
					members += mm.toMethod("create" + cls.name, mm.newTypeRef(superType.interfaceNameFor(cls)))[
						body = '''
							«mm.adapterNameFor(superType, cls)» adap = new «mm.adapterNameFor(superType, cls)»() ;
							adap.setAdaptee(adaptee.create«cls.name»()) ;
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
						«ENDFOR» {}
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

	/*--- Naming helpers ---*/
	def getFactoryName(ModelType mt) {
		mt.fullyQualifiedName.append(mt.name + "Factory").normalize.toString
	}

	def interfaceNameFor(ModelType mt, EClass cls) {
		if (cls === null)
			return ""

		mt.fullyQualifiedName.append(cls.name).normalize.toString
	}

	def adapterNameFor(Metamodel mm, ModelType mt, EClass cls) {
		mm.adapterNameFor(mt, cls.name)
	}

	def adapterNameFor(Metamodel mm, ModelType mt, String name) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).append(name + "Adapter").normalize.toString
	}

	def adapterNameFor(Metamodel mm, ModelType mt) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).append(mm.name + "Adapter").normalize.toString
	}

	def adapterNameFor(Metamodel mm, Metamodel superMM, EClass cls) {
		mm.fullyQualifiedName.append("adapters").append(superMM.name).append(cls.name + "Adapter").normalize.toString
	}

	def factoryAdapterNameFor(Metamodel mm, ModelType mt) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).append(mt.name + "FactoryAdapter").normalize.toString
	}

	def getClassName(Transformation t) {
		t.fullyQualifiedName.skipLast(1).toLowerCase.append(t.name)
	}

	/*--- Type references helpers ---*/
	def newTypeRef(ModelType ctx, EClassifier cls) {
		// TODO: Handle generics
		switch (cls) {
			case null: ctx.newTypeRef(Object) //throw new TypeReferenceException("Cannot create type reference for null type")
			EClass:
				if (cls.abstractable)
					ctx.newTypeRef(ctx.interfaceNameFor(cls))
				else if (cls.instanceClass !== null)
					ctx.newTypeRef(cls.instanceClass.name)
				else if (cls.instanceTypeName !== null)
					ctx.newTypeRef(cls.instanceTypeName)
				else throw new TypeReferenceException("Cannot find type reference for class " + cls)
			EEnum:
				if (ctx.isExtracted)
					ctx.newTypeRef(ctx.extracted.getFqnFor(cls))
				else throw new TypeReferenceException("A model type cannot explicitly define an enumeration: " + cls)
			EDataType:
				if (cls.instanceClass !== null)
					ctx.newTypeRef(cls.instanceClass.name)
				else if (cls.instanceTypeName !== null)
					ctx.newTypeRef(cls.instanceTypeName)
				else throw new TypeReferenceException("EDataType should declare its instance class/type name: " + cls)
		}
	}

	/*--- Getters/setters helpers ---*/
	def toGetterSignature(EStructuralFeature f, String name, JvmTypeReference type) {
		val g =	f.toGetter(name, type)
		g.removeExistingBody

		if (#["java.lang.Boolean", "boolean"].contains(type.qualifiedName))
			g.simpleName = g.simpleName.replaceFirst("get", "is")

		return g
	}

	def toUmlGetterSignature(EStructuralFeature f, String name, JvmTypeReference type) {
		val g =	f.toGetter(name, type)
		g.removeExistingBody

		if (
			   g.simpleName.startsWith("isIs")
			&& Character.isUpperCase(g.simpleName.charAt(4))
			&& #["java.lang.Boolean", "boolean"].contains(type.qualifiedName)
		)
			g.simpleName = g.simpleName.replaceFirst("is", "").toFirstLower

		return g
	}

	def toSetterSignature(EStructuralFeature f, String name, JvmTypeReference type) {
		val s = f.toSetter(name, type)
		s.removeExistingBody

		return s
	}
}

class TypeReferenceException extends Exception {
	new(String msg) {
		super(msg)
	}
}
