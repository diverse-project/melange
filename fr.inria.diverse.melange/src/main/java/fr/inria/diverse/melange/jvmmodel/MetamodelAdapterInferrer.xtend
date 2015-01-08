package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.NamingHelper

import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.ResourceAdapter

import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType

import org.eclipse.xtext.common.types.TypesFactory

import org.eclipse.xtext.naming.IQualifiedNameProvider

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject

class MetamodelAdapterInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension MetamodelExtensions
	@Inject extension EcoreExtensions
	@Inject extension MelangeTypesBuilder
	@Inject extension ModelingElementExtensions

	def void generateAdapter(Metamodel mm, ModelType superType, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		val task = Stopwatches.forTask("generate metamodel adapters")
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
			superTypes += ResourceAdapter.typeRef
			superTypes += superType.fullyQualifiedName.toString.typeRef

			members += mm.toField("adaptersFactory", mm.getAdaptersFactoryNameFor(superType).typeRef)[
				initializer = '''«mm.getAdaptersFactoryNameFor(superType)».getInstance()'''
			]

			members += mm.toMethod("getContents", EList.typeRef(EObject.typeRef))[
				body = '''
						org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> ret = new org.eclipse.emf.ecore.util.BasicInternalEList<org.eclipse.emf.ecore.EObject>(org.eclipse.emf.ecore.EObject.class) ;

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