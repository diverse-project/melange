package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.melange.adapters.AdaptersFactory
import fr.inria.diverse.melange.adapters.EObjectAdapter
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.IMetamodel
import fr.inria.diverse.melange.lib.MappingExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.internal.Stopwatches
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * This class manages generation of Java classes that implements a Metamodel.
 */
class LanguageInferrer
{
	@Inject extension ASTHelper
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
	@Inject extension MetamodelExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension LanguageExtensions
	@Inject extension EcoreExtensions
	@Inject extension MappingExtensions
	@Inject extension LanguageAdapterInferrer
	@Inject extension MetaclassAdapterInferrer

	/**
	 * Creates:
	 * - A Java class for {@link mm}
	 * - A Java class for each Model type in {@link mm}
	 * - A concrete factory for each Model type
	 * - A factory to create adapters for each Model type
	 * - Adapters for each Object type in Model types
	 * 
	 * @param mm
	 * @param acceptor
	 * @param builder
	 */
	def void generateAdapters(Language l, ModelTypingSpace root, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		val task = Stopwatches.forTask("generate metamodels")
		task.start

		acceptor.accept(l.toClass(l.fullyQualifiedName.normalize.toString))
		[
			superTypes += IMetamodel.typeRef

			members += l.toField("resource",  Resource.typeRef)
			members += l.toGetter("resource", Resource.typeRef)
			members += l.toSetter("resource", Resource.typeRef)

			members += l.toMethod("load", l.fullyQualifiedName.normalize.toString.typeRef)[
				^static = true
				parameters += l.toParameter("uri", String.typeRef)

				body = '''
					org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl() ;
					Resource res = rs.getResource(org.eclipse.emf.common.util.URI.createURI(uri), true) ;
					«l.name» mm = new «l.name»() ;
					mm.setResource(res) ;
					return mm ;
				'''
			]

			l.^implements.forEach[mt |
				val adapName = l.syntax.adapterNameFor(mt)

				members += l.toMethod("to" + mt.name, mt.fullyQualifiedName.toString.typeRef)[
					body = '''
						«adapName» adaptee = new «adapName»() ;
						adaptee.setAdaptee(resource) ;
						return adaptee ;
					'''
				]
			]
			
			root.mappings.filter[from == l.name].forEach[ bind |
				val mt = root.languages.findFirst[bind.to == name].exactType
				val adapName = l.syntax.mapperNameFor(mt)

				members += l.toMethod("to" + mt.name, mt.fullyQualifiedName.toString.typeRef)[
					body = '''
						«adapName» adapter = new «adapName»() ;
						adapter.setAdaptee(resource) ;
						return adapter ;
					'''
				]
			]
		]

		// TODO: Test when the subtype has more classes than the supertype and vice-versa
		l.^implements.forEach[mt |
			val mapping = l.mappings.findFirst[to == mt]
			l.generateAdapter(mt, acceptor, builder)

			mt.allClasses.filter[abstractable].forEach[cls |
				l.syntax.generateAdapter(mt, cls, acceptor, builder)
			]

			val adapFactName = l.syntax.getAdaptersFactoryNameFor(mt)
			acceptor.accept(l.toClass(adapFactName))
			[
				superTypes += AdaptersFactory.typeRef

				members += l.toField("instance", adapFactName.typeRef)[static = true]
				
				members += l.toField("register" , "java.util.WeakHashMap".typeRef(EObject.typeRef,EObjectAdapter.typeRef))
				
				members += l.toConstructor[
					body = '''
						register = new WeakHashMap();
					'''
				]

				members += l.toMethod("getInstance", adapFactName.typeRef)[
					static = true
					body = '''
						if (instance == null) {
							instance = new «adapFactName»() ;
						}
						return instance ;
					'''
				]

				members += l.toMethod("createAdapter", EObjectAdapter.typeRef)[
					parameters += l.toParameter("o", EObject.typeRef)

					body = '''
						EObjectAdapter res = register.get(o);
						if(res != null){
							 return res;
						}
						else{
							«FOR cls : mt.allClasses.filter[l.hasAdapterFor(mt, it) && instantiable && abstractable].sortByClassInheritance»
							if (o instanceof «l.syntax.getFqnFor(cls)»){
								res = create«cls.name»Adapter((«l.syntax.getFqnFor(cls)») o) ;
								register.put(o,res);
								return res;
							}
							«ENDFOR»
						}

						return null ;
					'''
				]

				mt.allClasses.filter[abstractable].forEach[cls |
					val adapName = l.syntax.adapterNameFor(mt, cls)
					val mmCls = l.syntax.allClasses.findFirst[mapping.namesMatch(it, cls)]

					members += l.toMethod('''create«cls.name»Adapter''', adapName.typeRef)[
						parameters += l.toParameter("adaptee", l.syntax.getFqnFor(mmCls).typeRef)

						body = '''
							«adapName» adap = new «adapName»() ;
							adap.setAdaptee(adaptee) ;
							return adap ;
						'''
					]
				]
			]
		]

		//if (l.hasSuperMetamodel)
		//	l.generateAdapters(l.inheritanceRelation.superMetamodel, acceptor, builder)

		task.stop
	}
}
