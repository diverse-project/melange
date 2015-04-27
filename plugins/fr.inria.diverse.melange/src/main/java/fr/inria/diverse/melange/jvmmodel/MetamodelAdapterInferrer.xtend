package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.melange.adapters.ResourceAdapter
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import java.io.IOException
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
class MetamodelAdapterInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension EcoreExtensions
	@Inject extension MelangeTypesBuilder
	@Inject extension ModelingElementExtensions
	@Inject extension JvmAnnotationReferenceBuilder$Factory jvmAnnotationReferenceBuilderFactory
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
	def void generateAdapter(Metamodel mm, ModelType superType, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		jvmAnnotationReferenceBuilder = jvmAnnotationReferenceBuilderFactory.create(mm.eResource.resourceSet)
		val task = Stopwatches.forTask("generate metamodel adapters")
		task.start

		acceptor.accept(mm.toClass(mm.factoryAdapterNameFor(superType)))
		[
			superTypes += superType.factoryName.typeRef

			members += mm.toField("adaptersFactory", mm.getAdaptersFactoryNameFor(superType).typeRef)[
				initializer = '''«mm.getAdaptersFactoryNameFor(superType)».getInstance()'''
			]

			mm.pkgs.forEach[pkg |
				members += mm.toField(pkg.name + "Adaptee", mm.getFactoryFqnFor(pkg).typeRef)[
					initializer = '''«mm.getFactoryFqnFor(pkg)».eINSTANCE'''
				]
			]

			superType.allClasses.filter[instantiable].forEach[cls |
				val newCreate = mm.toMethod("create" + cls.name, null)[m |
					m.annotations += Override.annotationRef

					val associatedPkg = mm.pkgs.findFirst[EClassifiers.exists[name == cls.name]]

					cls.ETypeParameters.forEach[t |
						m.typeParameters += TypesFactory.eINSTANCE.createJvmTypeParameter => [it.name = t.name]
					]

					m.body = '''
							return adaptersFactory.create«mm.simpleAdapterNameFor(superType, cls)»(«associatedPkg.name»Adaptee.create«cls.name»()) ;
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

			members += mm.toConstructor[
				body = '''
					super(«mm.getAdaptersFactoryNameFor(superType)».getInstance()) ;
				'''
			]

			members += mm.toMethod("getFactory", superType.factoryName.typeRef)[
				annotations += Override.annotationRef

				body = '''
						return new «mm.factoryAdapterNameFor(superType)»() ;
					'''
			]

			members += mm.toMethod("save", Void::TYPE.typeRef)[
				annotations += Override.annotationRef
				parameters += mm.toParameter("uri", String.typeRef)

				body = '''
					this.adaptee.setURI(org.eclipse.emf.common.util.URI.createURI(uri));
					this.adaptee.save(null);
				'''

				exceptions += IOException.typeRef
			]
		]

		task.stop
	}
}