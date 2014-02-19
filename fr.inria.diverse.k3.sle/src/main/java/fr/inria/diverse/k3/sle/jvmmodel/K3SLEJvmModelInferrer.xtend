package fr.inria.diverse.k3.sle.jvmmodel

import fr.inria.diverse.k3.sle.metamodel.k3sle.MegamodelRoot
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

import fr.inria.diverse.k3.sle.metamodel.k3sle.K3sleFactory

import fr.inria.diverse.k3.sle.lib.GenericAdapter
import fr.inria.diverse.k3.sle.lib.IModelType
import fr.inria.diverse.k3.sle.lib.EObjectAdapter
import fr.inria.diverse.k3.sle.lib.IFactory

import org.eclipse.emf.common.util.EList

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.TypesFactory

import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

import java.util.List

import static extension fr.inria.diverse.k3.sle.jvmmodel.K3SLEJvmModelInferrerHelper.*

import com.google.inject.Inject

class K3SLEJvmModelInferrer extends AbstractModelInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider

	MegamodelRoot mgmRoot
	//static final val MODEL_FILE = "platform:/resource/Output/model/output.xmi"

	def dispatch void infer(MegamodelRoot root, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		mgmRoot = root

		if (!isPreIndexingPhase) {
			// First pass: infer pkg for each structure, then build the typing hierarchy
			root.elements.filter(Metamodel).filter[isValid].forEach[buildPkg]
			root.elements.filter(ModelType).filter[isValid].forEach[buildPkg]
			buildSubtypingHierarchy

			// Second pass: generate code
			root.elements.filter(ModelType).filter[isValid].forEach[generateInterfaces(acceptor)]
			root.elements.filter(Metamodel).filter[isValid].forEach[generateAdapters(acceptor)]
			root.elements.filter(Transformation).filter[isValid].forEach[generateTransformation(acceptor, isPreIndexingPhase)]

			//root.serializeAs(MODEL_FILE)
		}
	}

	def dispatch buildPkg(Metamodel mm) {
		val pkg = mm.inferredPkg
		pkg.weaveAspects(mm)

		mm.pkg = pkg
		mm.genmodel = mm.inferredGenModel
	}

	def dispatch buildPkg(ModelType mt) {
		mt.pkg = mt.inferredPkg
	}

	def void generateAdapters(Metamodel mm, IJvmDeclaredTypeAcceptor acceptor) {
		val pkg = mm.pkg

		mm.^implements.forEach[mt |
			val superType = mt
			val superPkg  = mt.pkg

			superPkg.EClassifiers.filter(EClass).filter[instanceTypeName === null].forEach[cls |
				val inCls = pkg.EClassifiers.filter(EClass).findFirst[it.name == cls.name]

				acceptor.accept(mm.toClass(mm.adapterNameFor(superType, inCls.name)))
				.initializeLater[
					superTypes += mm.newTypeRef(GenericAdapter, newTypeRef(mm.getFqnFor(inCls)))
					superTypes += mm.newTypeRef(superType.interfaceNameFor(inCls.name))

					members += mm.toConstructor[
						parameters += mm.toParameter("adaptee", mm.newTypeRef(mm.getFqnFor(inCls)))
						body = '''super(adaptee) ;'''
					]

					cls.EAllAttributes.forEach[attr |
						val baseType =
							if (attr.EAttributeType?.instanceClass !== null)
								mm.newTypeRef(attr.EAttributeType.instanceClass.name)
							else if (attr.EAttributeType !== null && attr.EAttributeType instanceof EEnum)
								mm.newTypeRef(attr.EAttributeType.name)
							else
								mm.newTypeRef(superType.interfaceNameFor(attr.EType.name))

						val returnType = if (attr.many) mm.newTypeRef(List, baseType) else	baseType

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
						val intName = superType.interfaceNameFor(ref.EReferenceType.name)
						val adapName = mm.adapterNameFor(superType, ref.EReferenceType.name)
						val baseType =
							if (ref.EReferenceType.instanceClass === null)
								mm.newTypeRef(intName)
							else
								mm.newTypeRef(ref.EReferenceType.instanceClass.name)

						if (ref.many)
							members += ref.toMethod(ref.getterName, mm.newTypeRef(List, baseType))[
								body = '''
									«IF ref.EReferenceType.instanceClass !== null»
									return adaptee.«ref.getterName»() ;
									«ELSE»
									return new fr.inria.diverse.k3.sle.lib.ListAdapter<
										«intName»,
										«mm.getFqnFor(inRef.EReferenceType)»
										>(adaptee.«ref.getterName»(), «adapName».class
									) ;
									«ENDIF»
								'''
							]
						else {
							members += ref.toMethod(ref.getterName, baseType)[
								body = '''return new «adapName»(adaptee.«ref.getterName»()) ;'''
							]

							if (ref.changeable)
								members += ref.toMethod(ref.setterName, mm.newTypeRef(Void::TYPE))[
									parameters += ref.toParameter("o", mm.newTypeRef(intName))
									body = '''
										«adapName» wrap = («adapName») o ;
										adaptee.«ref.setterName»(wrap.getAdaptee()) ;
									'''
								]
						}
					]

					mm.aspects
					.filter[cls.aspectizedBy(it)]
					.forEach[asp |
						(asp.aspectRef.type as JvmGenericType).declaredOperations
						.filter[op | !op.simpleName.startsWith("priv") && !op.simpleName.startsWith("super_")]
						.filter[op | !members.exists[opp | opp.simpleName == op.simpleName]]
						.forEach[op |
							members += mm.toMethod(op.simpleName, mm.newTypeRef(op.returnType.qualifiedName))[
								val other = pkg.EClassifiers.filter(EClass).findFirst[ccls | ccls.name == op.returnType.simpleName]
								val paramsList = new StringBuilder

								if (other !== null)
									returnType = mm.newTypeRef(superType.interfaceNameFor(other.name))

								op.parameters.forEach[p, i |
									if (i > 0) {
										val otherr = pkg.EClassifiers.filter(EClass).findFirst[ccls | ccls.name == p.parameterType.simpleName]

										if (otherr !== null) {
											paramsList.append(''', ((«mm.adapterNameFor(superType, otherr.name)») «p.simpleName»).getAdaptee() ''')
											parameters += mm.toParameter(p.simpleName, mm.newTypeRef(superType.interfaceNameFor(otherr.name)))
										} else {
											paramsList.append(''', «p.simpleName» ''')
											parameters += mm.toParameter(p.simpleName, p.parameterType)
										}
									}
								]

								body = '''
									«IF other !== null»
									return new «mm.adapterNameFor(superType, other.name)»(«asp.aspectRef.type.fullyQualifiedName».«op.simpleName»(adaptee«paramsList»)) ;
									«ELSE»
									«IF returnType.simpleName != "void"»return «ENDIF»«asp.aspectRef.type.fullyQualifiedName».«op.simpleName»(adaptee«paramsList») ;
									«ENDIF»
								'''
							]
						]
					]

					if (mm.inheritanceRelation?.superMetamodel !== null) {
						// !!!
						val superMM = mm.inheritanceRelation.superMetamodel

						superMM.aspects
						.filter[cls.aspectizedBy(it)]
						.forEach[asp |
							(asp.aspectRef.type as JvmGenericType).declaredOperations
							.filter[op | !op.simpleName.startsWith("priv") && !op.simpleName.startsWith("super_")]
							.filter[op | !members.exists[opp | opp.simpleName == op.simpleName]]
							.forEach[op |
								members += mm.toMethod(op.simpleName, mm.newTypeRef(op.returnType.qualifiedName))[
									val other = pkg.EClassifiers.filter(EClass).findFirst[ccls | ccls.name == op.returnType.simpleName]
									val paramsList = new StringBuilder

									if (other !== null)
										returnType = mm.newTypeRef(superType.interfaceNameFor(other.name))

									op.parameters.forEach[p, i |
										if (i > 0) {
											val otherr = pkg.EClassifiers.filter(EClass).findFirst[ccls | ccls.name == p.parameterType.simpleName]

											if (otherr !== null) {
												paramsList.append(''', ((«mm.adapterNameFor(superType, otherr.name)») «p.simpleName»).getAdaptee() ''')
												parameters += mm.toParameter(p.simpleName, mm.newTypeRef(superType.interfaceNameFor(otherr.name)))
											} else {
												paramsList.append(''', «p.simpleName» ''')
												parameters += mm.toParameter(p.simpleName, p.parameterType)
											}
										}
									]

									body = '''
										«IF other !== null»
										return new «superMM.adapterNameFor(superType, other.name)»(
											«asp.aspectRef.type.fullyQualifiedName».«op.simpleName»(
												new «mm.adapterNameFor(superMM, cls.name)»(adaptee)«paramsList»
											)
										) ;
										«ELSE»
										«IF returnType.simpleName != "void"»return «ENDIF»«asp.aspectRef.type.fullyQualifiedName».«op.simpleName»(
											new «mm.adapterNameFor(superMM, cls.name)»(adaptee)«paramsList»
										) ;
										«ENDIF»
									'''
								]
							]
						]
					}
				]
			]

			acceptor.accept(mm.toClass(mm.factoryAdapterNameFor(superType)))
			.initializeLater[
				superTypes += mm.newTypeRef(superType.factoryName)

				members += mm.toField("adaptee", mm.newTypeRef(mm.getFactoryFqn))[
					initializer = '''«mm.getFactoryFqn».eINSTANCE'''
				]

				superPkg.EClassifiers.filter(EClass).filter[!^abstract && !^interface && instanceClass === null].forEach[cls |
					members += mm.toMethod("create" + cls.name, mm.newTypeRef(superType.interfaceNameFor(cls.name)))[
						body = '''
							return new «mm.adapterNameFor(superType, cls.name)»(adaptee.create«cls.name»()) ;
						'''
					]
				]
			]

			acceptor.accept(mm.toClass(mm.adapterNameFor(superType)))
			.initializeLater[
				superTypes += mm.newTypeRef(GenericAdapter, newTypeRef(Resource))
				superTypes += mm.newTypeRef(superType.fullyQualifiedName.toString)

				members += mm.toConstructor[
					parameters += mm.toParameter("a", mm.newTypeRef(Resource))

					body = '''
						super(a) ;
					'''
				]

				members += mm.toMethod("getContents", mm.newTypeRef(List, newTypeRef(Object)))[
					body = '''
						java.util.List<java.lang.Object> ret = new java.util.ArrayList<java.lang.Object>() ;

						for (org.eclipse.emf.ecore.EObject o : adaptee.getContents()) {
						«FOR r : pkg.EClassifiers.filter(EClass).filter[mm.hasAdapterFor(superType, it) && instanceTypeName === null].sortByClassInheritance»
							if (o instanceof «mm.getFqnFor(r)») {
								«mm.getFqnFor(r)» wrap = («mm.getFqnFor(r)») o ;
								ret.add(new «mm.adapterNameFor(mt, r.name)»(wrap)) ;
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

		acceptor.accept(mm.toClass(mm.fullyQualifiedName.normalize.toString))
		.initializeLater[]

		if (mm.inheritanceRelation?.superMetamodel !== null) {
			val superMM = mm.inheritanceRelation.superMetamodel
			val superPkg = superMM.pkg

			superPkg.EClassifiers.filter(EClass).filter[instanceTypeName === null].forEach[cls |
				val inCls = pkg.EClassifiers.filter(EClass).findFirst[name == cls.name]

				acceptor.accept(mm.toClass(mm.adapterNameFor(superMM, cls.name)))
				.initializeLater[
					superTypes += mm.newTypeRef(mm.getFqnFor(cls))
					superTypes += mm.newTypeRef(EObjectAdapter, mm.newTypeRef(inCls.fullyQualifiedName.toString))

					members += mm.toConstructor[
							parameters += mm.toParameter("adaptee", mm.newTypeRef(mm.getFqnFor(inCls)))
							body = '''super(adaptee) ;'''
						]

					cls.EAllAttributes.forEach[attr |
						val baseType =
							if (attr.EAttributeType?.instanceClass !== null)
								mm.newTypeRef(attr.EAttributeType.instanceClass.name)
							else if (attr.EAttributeType !== null && attr.EAttributeType instanceof EEnum)
								mm.newTypeRef(attr.EAttributeType.name)
							else
								mm.newTypeRef(mm.getFqnFor(inCls))

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
						val inRef = inCls.EReferences.findFirst[it.name == ref.name]
						val adapName = mm.adapterNameFor(superMM, ref.EReferenceType.name)
						val baseType =
							if (ref.EReferenceType.instanceClass === null)
								mm.newTypeRef(mm.getFqnFor(ref.EReferenceType))
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
									body = '''return new «adapName»(adaptee.«ref.getterName»()) ;'''
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
	}

	def void generateInterfaces(ModelType mt, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(mt.toInterface(mt.fullyQualifiedName.normalize.toString, []))
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

			mt.pkg.EClassifiers.filter(EClass).filter[!^abstract && !^interface && instanceClass === null].forEach[cls |
				members += mt.toMethod("create" + cls.name, mt.newTypeRef(mt.interfaceNameFor(cls.name)))[
					^abstract = true
				]
			]
		]

		mt.pkg.EClassifiers.filter(EClass).filter[instanceTypeName === null].forEach[cls |
			acceptor.accept(cls.toInterface(mt.interfaceNameFor(cls.name), []))
			.initializeLater[
				cls.ESuperTypes.forEach[sup |
					superTypes += mt.newTypeRef(mt.interfaceNameFor(sup.name))
				]

				cls.EAttributes.forEach[attr |
					val baseType =
						if (attr.EAttributeType?.instanceClass !== null)
							mt.newTypeRef(attr.EAttributeType.instanceClass.name)
						else if (attr.EAttributeType !== null && attr.EAttributeType instanceof EEnum)
							mt.newTypeRef(attr.EAttributeType.name)
						else
							mt.newTypeRef(mt.interfaceNameFor(attr.EType.name))

					val returnType = if (attr.many)	mt.newTypeRef(List, baseType) else	baseType

					members += attr.toGetterSignature(attr.name, returnType)

					if (!attr.many && attr.changeable)
						members += attr.toSetterSignature(attr.name, returnType)
				]

				cls.EReferences.forEach[ref |
					val baseType =
						if (ref.EReferenceType.instanceClass === null)
							mt.newTypeRef(mt.interfaceNameFor(ref.EReferenceType.name))
						else
							mt.newTypeRef(ref.EReferenceType.instanceClass.name)

					if (ref.many) {
						members += ref.toGetterSignature(ref.name, mt.newTypeRef(typeof(List), baseType))
					} else {
						members += ref.toGetterSignature(ref.name, baseType)

						if (ref.changeable)
							members += ref.toSetterSignature(ref.name, baseType)
					}
				]

				if (mt.extracted !== null) {
					mt.extracted.aspects
					.filter[cls.aspectizedBy(it)]
					.forEach[asp |
						(asp.aspectRef.type as JvmGenericType).declaredOperations
						.filter[op | !op.simpleName.startsWith("priv") && !op.simpleName.startsWith("super_")]
						.filter[op | !members.exists[opp | opp.simpleName == op.simpleName]]
						.forEach[op |
							members += mt.toMethod(op.simpleName, mt.newTypeRef(op.returnType.qualifiedName))[
								val other = mt.pkg.EClassifiers.filter(EClass).findFirst[ccls | ccls.name == op.returnType.simpleName]

								if (other !== null)
									returnType = mt.newTypeRef(mt.interfaceNameFor(other.name))

								op.parameters.forEach[p, i |
									if (i > 0) {
										val otherr = mt.pkg.EClassifiers.filter(EClass).findFirst[ccls | ccls.name == p.parameterType.simpleName]

										if (otherr !== null)
											parameters += mt.toParameter(p.simpleName, mt.newTypeRef(mt.interfaceNameFor(otherr.name)))
										else
											parameters += mt.toParameter(p.simpleName, p.parameterType)
									}
								]

								^abstract = true
							]
						]
					]
				}
			]
		]
	}

	def void generateTransformation(Transformation transfo, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(transfo.toClass(transfo.fullyQualifiedName.toString))
		.initializeLater[
			// !!!
			val returnType = transfo.returnTypeRef ?: transfo.newTypeRef(Void::TYPE)

			members += transfo.toMethod("call", returnType)[
				transfo.parameters.forEach[p |
					parameters += transfo.toParameter(p.name, p.parameterType)
				]
				body = transfo.body
				^static = true
			]

			if (transfo.main) {
				members += transfo.toMethod("main", transfo.newTypeRef(Void::TYPE))[
					parameters += transfo.toParameter("args", transfo.newTypeRef(typeof(String)).addArrayTypeDimension)

					body = '''
						«FOR mm : mgmRoot.elements.filter(Metamodel).filter[pkg !== null]»
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
					^static = true
				]
			}
		]
	}

	def buildSubtypingHierarchy() {
		mgmRoot.elements.filter(ModelType)
		.filterNull
		.forEach[mt1 |
			mgmRoot.elements.filter(ModelType)
			.filterNull
			.filter[mt2 | mt2 !== mt1 && mt1.pkg.subtypeOf(mt2.pkg)]
			.forEach[mt2 |
				mt1.subtypingRelations += K3sleFactory.eINSTANCE.createSubtyping => [
					subType = mt1
					superType = mt2
				]
			]

			mgmRoot.elements.filter(Metamodel)
			.filter[mm | mm.pkg.subtypeOf(mt1.pkg)]
			.forEach[mm |
				mm.^implements += mt1
			]
		]
	}

	def toGetterSignature(EObject o, String name, JvmTypeReference type) {
		val g = o.toGetter(name, type)
		g.removeExistingBody

		if (#["java.lang.Boolean", "boolean"].contains(type.qualifiedName))
			g.simpleName = g.simpleName.replaceFirst("get", "is")

		return g
	}

	def toSetterSignature(EObject o, String name, JvmTypeReference type) {
		val s = o.toSetter(name, type)
		s.removeExistingBody

		return s
	}

	def adapterNameFor(Metamodel mm, ModelType mt, String cls) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).append(cls + "Adapter").normalize.toString
	}

	def adapterNameFor(Metamodel mm, ModelType mt) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).append(mm.name + "Adapter").normalize.toString
	}

	def adapterNameFor(Metamodel mm, Metamodel superMM, String cls) {
		mm.fullyQualifiedName.append("adapters").append(superMM.name).append(cls + "Adapter").normalize.toString
	}

	def factoryNameFor(Metamodel mm, ModelType mt, String cls) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).append(cls + "AdapterFactory").normalize.toString
	}

	def factoryAdapterNameFor(Metamodel mm, ModelType mt) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).append(mt.name + "FactoryAdapter").normalize.toString
	}

	def interfaceNameFor(ModelType mt, String cls) {
		mt.fullyQualifiedName.append(cls).normalize.toString
	}

	def factoryName(ModelType mt) {
		mt.fullyQualifiedName.append(mt.name + "Factory").normalize.toString
	}
}

