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

class MappersInferrer{
	
	@Inject extension JvmTypesBuilder
	@Inject extension ModelTypeExtensions
	@Inject extension ASTHelper
	@Inject extension MetaclassMapperInferrer
	@Inject extension NamingHelper
	@Inject extension EcoreExtensions
	
	def void generateMappers(Mapping mapping, ModelTypingSpace root, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder){
		val task = Stopwatches.forTask("generate mapping")
		task.start
		
		val sourceMT = root.modelTypes.findFirst[name == mapping.from]
		val targetMT = root.modelTypes.findFirst[name == mapping.to]
		
		//Generate Mapper Factory
		generateMapperFactory(mapping,sourceMT,targetMT,acceptor,builder)
		
		//Generate all Mapper classes
		mapping.rules.forEach[classMapping | classMapping.generateMapper(sourceMT, targetMT, acceptor, builder)]
		
		task.stop
	}
	
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
}