package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.MetamodelExtensions
import fr.inria.diverse.k3.sle.ast.ModelTypeExtensions
import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.lib.EcoreExtensions
import fr.inria.diverse.k3.sle.lib.GenericAdapter

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType

import java.util.List

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.xtext.common.types.TypesFactory

import org.eclipse.xtext.naming.IQualifiedNameProvider

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class MetamodelAdapterInferrer extends AbstractModelInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension MetamodelExtensions
	@Inject extension EcoreExtensions
	@Inject extension K3SLETypesBuilder

	def void generateAdapter(Metamodel mm, ModelType superType, IJvmDeclaredTypeAcceptor acceptor) {
		val task = Stopwatches.forTask('''MetamodelAdapterInferrer.generateAdapter(«mm.name», «superType.name»''')
		task.start

		acceptor.accept(mm.toClass(mm.factoryAdapterNameFor(superType)))
		[
			superTypes += superType.factoryName.typeRef

			members += mm.toField("adaptersFactory", mm.getAdaptersFactoryNameFor(superType).typeRef)[
				initializer = '''«mm.getAdaptersFactoryNameFor(superType)».getInstance()'''
			]

			mm.pkgs.forEach[pkg |
				members += mm.toField(pkg.nsPrefix + "Adaptee", mm.getFactoryFqnFor(pkg).typeRef)[
					initializer = '''«mm.getFactoryFqnFor(pkg)».eINSTANCE'''
				]
			]

			superType.allClasses.filter[instantiable].forEach[cls |
				val newCreate = mm.toMethod("create" + cls.name, null)[m |
					val associatedPkg = mm.pkgs.findFirst[EClassifiers.exists[name == cls.name]]

					cls.ETypeParameters.forEach[t |
						m.typeParameters += TypesFactory.eINSTANCE.createJvmTypeParameter => [it.name = t.name]
					]

					m.body = '''
							return adaptersFactory.create«mm.simpleAdapterNameFor(superType, cls)»(«associatedPkg.nsPrefix»Adaptee.create«cls.name»()) ;
						'''
				]

				newCreate.returnType = superType.typeRef(cls, #[newCreate])
				members += newCreate
			]
		]

		acceptor.accept(mm.toClass(mm.adapterNameFor(superType)))
		[
			superTypes += GenericAdapter.typeRef(Resource.typeRef)
			superTypes += superType.fullyQualifiedName.toString.typeRef

			members += mm.toField("adaptee",  Resource.typeRef)
			members += mm.toGetter("adaptee", Resource.typeRef)
			members += mm.toSetter("adaptee", Resource.typeRef)

			members += mm.toField("adaptersFactory", mm.getAdaptersFactoryNameFor(superType).typeRef)[
				initializer = '''«mm.getAdaptersFactoryNameFor(superType)».getInstance()'''
			]

			members += mm.toMethod("getContents", List.typeRef(Object.typeRef))[
				body = '''
						java.util.List<java.lang.Object> ret = new java.util.ArrayList<java.lang.Object>() ;

						for (org.eclipse.emf.ecore.EObject o : adaptee.getContents()) {
						«FOR r : mm.allClasses.filter[name != "EObject" && mm.hasAdapterFor(superType, it) && instantiable && abstractable].sortByClassInheritance»
							if (o instanceof «mm.getFqnFor(r)») {
								ret.add(adaptersFactory.create«mm.simpleAdapterNameFor(superType, r)»((«mm.getFqnFor(r)») o)) ;
							} else
						«ENDFOR» ret.add(o) ;
						}

						return ret ;
					'''
			]

			members += mm.toMethod("getFactory", superType.factoryName.typeRef)[
				body = '''
						return new «mm.factoryAdapterNameFor(superType)»() ;
					'''
			]

			members += mm.toMethod("save", Void::TYPE.typeRef)[
				parameters += mm.toParameter("uri", String.typeRef)

				body = '''
					this.adaptee.setURI(org.eclipse.emf.common.util.URI.createURI(uri));
					this.adaptee.save(null);
				'''

				exceptions += java.io.IOException.typeRef
			]
		]

		task.stop
	}
}