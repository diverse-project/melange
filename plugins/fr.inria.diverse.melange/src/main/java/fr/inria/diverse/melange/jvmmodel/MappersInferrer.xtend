package fr.inria.diverse.melange.jvmmodel

import fr.inria.diverse.melange.metamodel.melange.Mapping
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.util.internal.Stopwatches
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.ast.ASTHelper
import com.google.inject.Inject
import fr.inria.diverse.melange.ast.NamingHelper
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import fr.inria.diverse.melange.adapters.AdaptersFactory
import org.eclipse.emf.ecore.EObject
import fr.inria.diverse.melange.adapters.EObjectAdapter
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.lib.EcoreExtensions
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.common.types.JvmMember
import fr.inria.diverse.melange.adapters.ResourceAdapter
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder
import java.io.IOException
import org.eclipse.xtext.naming.IQualifiedNameProvider

class MappersInferrer{
	
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension ModelTypeExtensions
	@Inject extension ASTHelper
	@Inject extension MetaclassMapperInferrer
	@Inject extension NamingHelper
	@Inject extension JvmAnnotationReferenceBuilder$Factory jvmAnnotationReferenceBuilderFactory
	extension JvmAnnotationReferenceBuilder jvmAnnotationReferenceBuilder
	
	def void generateMappers(Mapping mapping, ModelTypingSpace root, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder){
		val task = Stopwatches.forTask("generate mapping")
		task.start
		
		val sourceMT = root.modelTypes.findFirst[name == mapping.from]
		val targetMT = root.modelTypes.findFirst[name == mapping.to]
		
		//Generate Mapper Factory
		generateMapperFactory(mapping,sourceMT,targetMT,acceptor,builder)
		
		//Generate ModelType implementation for targetMT
		generateModelTypeMapper(sourceMT,targetMT,acceptor,builder)
		
		//Generate all Mapper classes
		mapping.rules.forEach[classMapping | classMapping.generateMapper(sourceMT, targetMT, acceptor, builder)]
		
		task.stop
	}
	
	/**
	 * Generate a factory that create Mapper objects.
	 * These Mapper objects adapt {@link sourceMT} objects to {@link targetMT} objects
	 */
	def void generateMapperFactory(Mapping mapping, ModelType sourceMT, ModelType targetMT, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder){
		val adapFactName = sourceMT.getMappersFactoryNameFor(targetMT)
		acceptor.accept(sourceMT.toClass(adapFactName))
		[
			superTypes += AdaptersFactory.typeRef

			members += sourceMT.toField("instance", adapFactName.typeRef)[static = true]

			members += sourceMT.toMethod("getInstance", adapFactName.typeRef)[
				static = true
				body = '''
					if (instance == null) {
						instance = new «adapFactName»() ;
					}
					return instance ;
				'''
			]

			members += sourceMT.toMethod("createAdapter", EObjectAdapter.typeRef)[
				parameters += sourceMT.toParameter("o", EObject.typeRef)

				body = '''
					«FOR classMapping : mapping.rules»
					if (o instanceof «sourceMT.getFqnFor(sourceMT.allClasses.findFirst[name == classMapping.from])»)
						return create«targetMT.allClasses.findFirst[name == classMapping.to].name»Mapper((«sourceMT.getFqnFor(sourceMT.allClasses.findFirst[name == classMapping.from])») o) ;
					«ENDFOR»
					return null;
				'''
			]
			
			mapping.rules.forEach[classMapping | 
				val sourceClass = sourceMT.allClasses.findFirst[name == classMapping.from]
				val targetClass = targetMT.allClasses.findFirst[name == classMapping.to]
				members += generateCreateMapper(sourceClass,targetClass,sourceMT,targetMT,builder)
			]
		]
	}
	
	/**
	 * Return a method that creates a Mapper object.
	 */
	def JvmMember generateCreateMapper(EClass sourceClass, EClass targetClass, ModelType sourceMT, ModelType targetMT, extension JvmTypeReferenceBuilder builder){
		val adapName = sourceMT.mapperNameFor(targetMT, targetClass)
		
		sourceMT.toMethod('''create«targetClass.name»Mapper''', adapName.typeRef)[
			parameters += sourceMT.toParameter("adaptee", sourceMT.getFqnFor(sourceClass).typeRef)

			body = '''
				«adapName» adap = new «adapName»() ;
				adap.setAdaptee(adaptee) ;
				return adap ;
			'''
		]
	}
	
	/**
	 * Generate a concrete implementation class for {@link targetMT} interface to adapt {@link sourceMT}
	 */
	def void generateModelTypeMapper(ModelType sourceMT, ModelType targetMT, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder){
		
		acceptor.accept(targetMT.toClass(sourceMT.mapperNameFor(targetMT)))
		[
			superTypes += ResourceAdapter.typeRef
			superTypes += targetMT.fullyQualifiedName.toString.typeRef

			members += targetMT.toConstructor[
				body = '''
					super(«sourceMT.getMappersFactoryNameFor(targetMT)».getInstance()) ;
				'''
			]
			
			//FIXME
			members += targetMT.toMethod("getFactory", targetMT.factoryName.typeRef)[
//				annotations += Override.annotationRef

				body = '''
						return null;
					'''
			]

//			members += targetMT.toMethod("getFactory", superType.factoryName.typeRef)[
//				annotations += Override.annotationRef
//
//				body = '''
//						return new «mm.factoryAdapterNameFor(superType)»() ;
//					'''
//			]

			members += targetMT.toMethod("save", Void::TYPE.typeRef)[
//				annotations += Override.annotationRef
				parameters += targetMT.toParameter("uri", String.typeRef)

				body = '''
					this.adaptee.setURI(org.eclipse.emf.common.util.URI.createURI(uri));
					this.adaptee.save(null);
				'''

				exceptions += IOException.typeRef
			]
		]
	}
	
	def void generateConverter(Iterable<Mapping> mappings, ModelTypingSpace root, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder){
		
		acceptor.accept(root.toClass(root.name + ".Converter"))
		[
			mappings.forEach[mapping |
				val sourceMT = root.modelTypes.findFirst[name == mapping.from]
				val targetMT = root.modelTypes.findFirst[name == mapping.to]
				
				members += root.toMethod("to"+targetMT.name, targetMT.fullyQualifiedName.toString.typeRef)[
					^static = true
					parameters += root.toParameter("sourceMT", sourceMT.fullyQualifiedName.toString.typeRef)
					
					val mapperClassName = sourceMT.mapperNameFor(targetMT)
					//FIXME: the cast to ResourceAdapter is a workaround
					body = '''
						«mapperClassName» adapter = new «mapperClassName»() ;
						adapter.setAdaptee((fr.inria.diverse.melange.adapters.ResourceAdapter)sourceMT) ;
						return adapter ;
					'''
				]
			]
		]
	}
}