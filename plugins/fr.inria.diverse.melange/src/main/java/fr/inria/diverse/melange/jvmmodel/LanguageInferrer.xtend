package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.lib.IMetamodel
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.internal.Stopwatches
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * Generates the Java runtime support for each {@link Language}.
 */
class LanguageInferrer
{
	@Inject extension ASTHelper
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
	@Inject extension LanguageAdapterInferrer

	/**
	 * Generates a Java class whose name is the fully qualified name of the
	 * {@link Language} {@code l} that encapsulates a {@link Resource} and
	 * provides basic load/save capabilities around this {@link Resource}.
	 * 
	 * @see IMetamodel
	 */
	def void generateAdapters(
		Language l,
		ModelTypingSpace root,
		IJvmDeclaredTypeAcceptor acceptor,
		extension JvmTypeReferenceBuilder builder
	) {
		val task = Stopwatches.forTask("generate metamodels")
		task.start

		acceptor.accept(l.toClass(l.fullyQualifiedName.toString))
		[
			// Implement the IMetamodel interface (omg, so ugly!)
			superTypes += IMetamodel.typeRef

			// Hold a reference to the underlying EMF#Resource
			members += l.toField("resource",  Resource.typeRef)
			members += l.toGetter("resource", Resource.typeRef)
			members += l.toSetter("resource", Resource.typeRef)

			members += l.toMethod("load", l.fullyQualifiedName.toString.typeRef)[
				^static = true
				parameters += l.toParameter("uri", String.typeRef)

				body = '''
					«ResourceSet» rs = new «ResourceSetImpl»();
					«Resource» res = rs.getResource(«URI».createURI(uri), true);
					«l.name» mm = new «l.name»();
					mm.setResource(res);
					return mm ;
				'''
			]

			// For each implemented model type, generate a to$MTName() method
			// that encapsulates the current resource in the appropriate
			// adapter for MT
			l.^implements.forEach[mt |
				val mtFqn = mt.fullyQualifiedName.toString
				val adapName = l.syntax.adapterNameFor(mt)

				members += l.toMethod('''to«mt.name»''', mtFqn.typeRef)[
					body = '''
						«adapName» adaptee = new «adapName»() ;
						adaptee.setAdaptee(resource);
						return adaptee;
					'''
				]
			]

			// Similarly, generate a to$LangName method for each
			// defined mapping
			// TODO: Check that it is actually used somewhere, as I don't
			//        think we're generating mappers anymore
			root.mappings.filter[from == l.name].forEach[bind |
				val mt = root.languages.findFirst[bind.to == name].exactType
				val mtFqn= mt.fullyQualifiedName.toString
				val adapName = l.syntax.mapperNameFor(mt)

				members += l.toMethod('''to«mt.name»''', mtFqn.typeRef)[
					body = '''
						«adapName» adapter = new «adapName»();
						adapter.setAdaptee(resource);
						return adapter;
					'''
				]
			]
		]

		// Delegates the generation of Java adapters to LanguageAdapterInferrer
		// for each implemented model type
		l.^implements.forEach[mt |
			l.generateAdapter(mt, acceptor, builder)
		]

		task.stop
	}
}
