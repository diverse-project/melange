package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.MetamodelExtensions
import fr.inria.diverse.k3.sle.ast.ModelTypeExtensions
import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.lib.EcoreExtensions

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.xtext.naming.IQualifiedNameProvider

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class MetamodelInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension MetamodelExtensions
	@Inject extension EcoreExtensions
	@Inject extension MetamodelAdapterInferrer
	@Inject extension MetaclassAdapterInferrer
	@Inject extension InheritanceAdapterInferrer

	def void generateAdapters(Metamodel mm, IJvmDeclaredTypeAcceptor acceptor) {
		val task = Stopwatches.forTask('''MetamodelInferrer.generateAdapters(«mm.name»)''')
		task.start

		acceptor.accept(mm.toClass(mm.fullyQualifiedName.normalize.toString))
		.initializeLater[
			members += mm.toField("resource",  mm.newTypeRef(Resource))
			members += mm.toGetter("resource", mm.newTypeRef(Resource))
			members += mm.toSetter("resource", mm.newTypeRef(Resource))

			mm.^implements.forEach[mt |
				val adapName = mm.adapterNameFor(mt)

				members += mm.toMethod("to" + mt.name, mm.newTypeRef(mt.fullyQualifiedName.toString))[
					body = '''
						«adapName» adaptee = new «adapName»() ;
						adaptee.setAdaptee(resource) ;
						return adaptee ;
					'''
				]

				members += mm.toMethod("load", mm.newTypeRef(mm.fullyQualifiedName.normalize.toString))[
					^static = true
					parameters += mm.toParameter("uri", mm.newTypeRef(String))

					body = '''
						org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl() ;
						Resource res = rs.getResource(org.eclipse.emf.common.util.URI.createURI(uri), true) ;
						«mm.name» mm = new «mm.name»() ;
						mm.setResource(res) ;
						return mm ;
					'''
				]
			]
		]

		// TODO: Test when the subtype has more classes than the supertype and vice-versa
		mm.^implements.forEach[mt |
			mm.generateAdapter(mt, acceptor)

			mt.allClasses.filter[abstractable].forEach[cls |
				mm.generateAdapter(mt, cls, acceptor)
			]
		]

		if (mm.hasSuperMetamodel)
			mm.generateAdapters(mm.inheritanceRelation.superMetamodel, acceptor)

		task.stop
	}
}
