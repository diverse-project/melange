package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.IFactory
import fr.inria.diverse.melange.lib.IMetamodel
import fr.inria.diverse.melange.lib.IModelType
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import java.io.IOException
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.internal.Stopwatches
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * This class manages generation of Java interfaces for a Model Type.
 */
class ModelTypeInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension EcoreExtensions
	@Inject extension MelangeTypesBuilder
	@Inject extension EnumInferrer
	@Inject extension MetaclassInterfaceInferrer

	/**
	 * Creates:<br>
 	 * - A Java interface for {@link mt}<br>
 	 * - An abstract factory to create each Object type of {@link mt}<br>
 	 * - Java interfaces for each Object type
 	 * 
	 * @param mt Model type
	 * @param acceptor
	 * @param builder
	 */
	def void generateInterfaces(ModelType mt, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		val task = Stopwatches.forTask("generate model types")
		task.start

		acceptor.accept(mt.toInterface(mt.fullyQualifiedName.toString)[
			superTypes += IModelType.typeRef

			members += mt.toMethod("getContents", EList.typeRef(EObject.typeRef))[
				^abstract = true
			]

			members += mt.toMethod("getFactory", mt.factoryName.typeRef)[
				^abstract = true
			]

			members += mt.toMethod("save", Void::TYPE.typeRef)[
				^abstract = true
				parameters += mt.toParameter("uri", String.typeRef)
				exceptions += IOException.typeRef
			]
		])

		acceptor.accept(mt.toInterface(mt.factoryName)[
			superTypes += IFactory.typeRef

			mt.allClasses.filter[instantiable].forEach[cls |
				members += mt.toMethod("create" + cls.name, null)[m |
					m.^abstract = true

					cls.ETypeParameters.forEach[t |
						m.typeParameters += TypesFactory.eINSTANCE.createJvmTypeParameter => [it.name = t.name]
					]
				] => [m |
					m.returnType = mt.typeRef(cls, #[m])
				]
			]
		])

		mt.allClasses.filter[abstractable].forEach[cls |
			mt.generateInterface(cls, acceptor, builder)
		]

		//if (mt.isImported)
			mt.allEnums.forEach[enu |
				mt.generateEnum(enu, acceptor, builder)
			]
			
		/**
		 * Implementation of the ModelType interface
		 */
		acceptor.accept(mt.toClass(mt.fullyQualifiedName.toString+"Impl")[
			superTypes += mt.fullyQualifiedName.toString.typeRef

			members += mt.toField("language", IMetamodel.typeRef)

			members += mt.toConstructor[
				parameters += mt.toParameter("language", IMetamodel.typeRef)
				body = '''
					this.language = language;
				'''
			]
			
			members += mt.toMethod("getContents", EList.typeRef(EObject.typeRef))[
				body = '''
					EList<EObject> res = new org.eclipse.emf.common.util.BasicEList<EObject>();
					for(EObject obj : language.getResource().getContents()){
						Object adapter = fr.inria.diverse.melange.jvmmodel.DynamicAdapter.newInstance(obj,language,this);
						res.add( (EObject) adapter);
					}
					return res;
				'''
			]

			members += mt.toMethod("getFactory", mt.factoryName.typeRef)[
				body = '''
					throw new UnsupportedOperationException("");
				'''
			]

			members += mt.toMethod("save", Void::TYPE.typeRef)[
				parameters += mt.toParameter("uri", String.typeRef)
				exceptions += IOException.typeRef
				body = '''
					throw new UnsupportedOperationException("");
				'''
			]
		])

		task.stop
	}
}
