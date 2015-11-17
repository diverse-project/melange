package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.melange.adapters.ResourceAdapter
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.MappingExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelType
import java.io.IOException
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.impl.EFactoryImpl
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.internal.Stopwatches
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * This class manages the generation of the Java code  that bind a Metamodel 
 * to its Model type
 */
class LanguageAdapterInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension EcoreExtensions
	@Inject extension MelangeTypesBuilder
	@Inject extension ModelingElementExtensions
	@Inject extension MappingExtensions
	@Inject extension JvmAnnotationReferenceBuilder.Factory jvmAnnotationReferenceBuilderFactory
	extension JvmAnnotationReferenceBuilder jvmAnnotationReferenceBuilder

	/**
	 * Creates a concrete factory for Object type of {@link superType} &
	 * creates a Java class for {@link mm} which implements {@link superType}
	 * 
	 * @param mm
	 * @param superType Model type implemented by {@link mm}
	 * @param acceptor
	 * @param builder
	 */
	def void generateAdapter(Language l, ModelType superType, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		jvmAnnotationReferenceBuilder = jvmAnnotationReferenceBuilderFactory.create(l.eResource.resourceSet)
		val task = Stopwatches.forTask("generate metamodel adapters")
		task.start
		val mapping = l.mappings.findFirst[to == superType]

		acceptor.accept(l.toClass(l.syntax.factoryAdapterNameFor(superType)))
		[
			superTypes += superType.factoryName.typeRef
			superTypes += EFactoryImpl.typeRef

			members += l.toField("adaptersFactory", l.syntax.getAdaptersFactoryNameFor(superType).typeRef)[
				initializer = '''«l.syntax.getAdaptersFactoryNameFor(superType)».getInstance()'''
			]

			l.syntax.pkgs.forEach[pkg |
				members += l.toField(pkg.name + "Adaptee", l.syntax.getFactoryFqnFor(pkg).typeRef)[
					initializer = '''«l.syntax.getFactoryFqnFor(pkg)».eINSTANCE'''
				]
			]

			superType.allClasses.filter[instantiable].forEach[cls |
				val newCreate = l.toMethod("create" + cls.name, null)[m |
					m.annotations += Override.annotationRef

					val associatedPkg = l.syntax.pkgs.findFirst[EClassifiers.exists[mapping.namesMatch(it, cls)]]
					val associatedCls = mapping?.rules?.findFirst[to == cls.name]?.from ?: cls.name

					cls.ETypeParameters.forEach[t |
						m.typeParameters += TypesFactory.eINSTANCE.createJvmTypeParameter => [it.name = t.name]
					]

					// FIXME: Second parameter (Resource) shouldn't be null
					m.body = '''
							return adaptersFactory.create«l.syntax.simpleAdapterNameFor(superType, cls)»(«associatedPkg.name»Adaptee.create«associatedCls»(), null) ;
						'''
				]

				newCreate.returnType = superType.typeRef(cls, #[newCreate])
				members += newCreate
			]

			members += l.toMethod("get" + superType.packageName, superType.packageFqn.typeRef)[
				body = '''
					return «superType.packageFqn».eINSTANCE;
				'''
			]
		]

		acceptor.accept(l.toClass(l.syntax.adapterNameFor(superType)))
		[
			superTypes += ResourceAdapter.typeRef
			superTypes += superType.fullyQualifiedName.toString.typeRef

			members += l.toConstructor[
				body = '''
					super(«l.syntax.getAdaptersFactoryNameFor(superType)».getInstance()) ;
				'''
			]

			members += l.toMethod("getFactory", superType.factoryName.typeRef)[
				annotations += Override.annotationRef

				body = '''
						return new «l.syntax.factoryAdapterNameFor(superType)»() ;
					'''
			]

			members += l.toMethod("save", Void::TYPE.typeRef)[
				annotations += Override.annotationRef
				parameters += l.toParameter("uri", String.typeRef)

				body = '''
					this.adaptee.setURI(«URI».createURI(uri));
					this.adaptee.save(null);
				'''

				exceptions += IOException.typeRef
			]
		]

		task.stop
	}
}