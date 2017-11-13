/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.melange.adapters.AdaptersFactory
import fr.inria.diverse.melange.adapters.EObjectAdapter
import fr.inria.diverse.melange.adapters.ResourceAdapter
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.MappingExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.Mapping
import fr.inria.diverse.melange.metamodel.melange.ModelType
import java.io.IOException
import java.util.Set
import java.util.WeakHashMap
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EFactory
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.impl.EFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.util.internal.Stopwatches
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Generates the in-the-large artifacts between a {@link Language} and a
 * {@link ModelType} it implements, and then delegates the generation of
 * in-the-small adapters for each implemented meta-class to
 * {@link MetaclassAdapterInferrer}.
 * 
 * @see NamingHelper#factoryAdapterNameFor
 * @see NamingHelper#adapterNameFor
 */
class LanguageAdapterInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
	@Inject extension EcoreExtensions
	@Inject extension MelangeTypesBuilder
	@Inject extension ModelingElementExtensions
	@Inject extension MappingExtensions
	@Inject extension MetaclassAdapterInferrer
	@Inject extension LanguageExtensions
	@Inject extension JvmAnnotationReferenceBuilder.Factory jvmAnnRefBuilderFact
	extension JvmAnnotationReferenceBuilder jvmAnnRefBuilder
	extension JvmTypeReferenceBuilder typeRefBuilder
	IJvmDeclaredTypeAcceptor acceptor
	Mapping mapping

	/**
	 * @see #generateLanguageAdapter
	 * @see #generateFactoryAdapter
	 * @see #generateAdaptersFactory
	 */
	def void generateAdapter(
		Language l,
		ModelType superType,
		IJvmDeclaredTypeAcceptor acc,
		extension JvmTypeReferenceBuilder builder
	) {
		val task = Stopwatches.forTask("generate metamodel adapters")
		task.start

		jvmAnnRefBuilder = jvmAnnRefBuilderFact.create(l.eResource.resourceSet)
		acceptor = acc
		typeRefBuilder = builder
		mapping = l.mappings.findFirst[to == superType]

		generateLanguageAdapter(l, superType)
		generateFactoryAdapters(l, superType)
		generateAdaptersFactory(l, superType)

		// Delegate the generation of adapters for each meta-class
		// to MetaclassAdapterInferrer
		superType.allClasses.filter[abstractable].forEach[cls |
			l.syntax.generateAdapter(superType, cls, acceptor, builder)
		]

		task.stop
	}

	/**
	 * Generates an adapter around a EMF#Resource for the {@code l -> mt} pair.
	 * 
	 * @see ResourceAdapter
	 * @see NamingHelper#adapterNameFor
	 */
	private def void generateLanguageAdapter(Language l, ModelType mt) {
		acceptor.accept(l.toClass(l.syntax.adapterNameFor(mt)))
		[
			superTypes += ResourceAdapter.typeRef
			superTypes += mt.fullyQualifiedName.toString.typeRef

			members += l.toConstructor[
				body = '''
					super(«l.syntax.getAdaptersFactoryNameFor(mt)».getInstance());
				'''
			]

			val excluded = mt.genmodels.map[usedGenPackages].flatten.toList
			mt.allGenPkgs
			.filter[genPkg|!excluded.contains(genPkg)]
			.forEach[genPkg|
				members += l.toMethod("get"+genPkg.factoryName, genPkg.qualifiedFactoryInterfaceName.typeRef)[
					annotations += Override.annotationRef
	
					body = '''
							return new «genPkg.factoryAdapterNameFor(l.syntax,mt)»();
						'''
				]
			]
			
			members += l.toMethod("getFactories", Set.typeRef)[
				annotations += Override.annotationRef

				body = '''
						java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
						«FOR genPkg : mt.allGenPkgs.filter[genPkg|!excluded.contains(genPkg)]»
							res.add(get«genPkg.factoryName»());
						«ENDFOR»
						return res;
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
	}

	private def void generateFactoryAdapters(Language l, ModelType mt) {
		val excluded = mt.genmodels.map[usedGenPackages].flatten.toList
		mt.allGenPkgs
		.filter[genPkg|!excluded.contains(genPkg)]
		.forEach[genPkg|
			genPkg.generateFactoryAdapter(l,mt)
		]
	}

	/**
	 * Generates a factory adapter that implements the abstract factory of
	 * {@code mt}, delegates elements creation to the factory of {@code l},
	 * and encapsulate the newly created elements in the appropriate adapters.
	 * 
	 * @see NamingHelper#factoryAdapterNameFor
	 * @see EFactory
	 */
	private def void generateFactoryAdapter(GenPackage genPkg, Language l, ModelType mt) {
		acceptor.accept(l.toClass(genPkg.factoryAdapterNameFor(l.syntax,mt)))
		[
			val adaptersFactoryFqn = l.syntax.getAdaptersFactoryNameFor(mt)

			// Implement the factory of superType and the generic EFactory type
			superTypes += genPkg.qualifiedFactoryInterfaceName.typeRef
			superTypes += EFactoryImpl.typeRef

			// Point to the generated factory of adapters
			members += l.toField("adaptersFactory", adaptersFactoryFqn.typeRef)[
				initializer = '''«adaptersFactoryFqn».getInstance()'''
			]

			// Point to each of the EFactory of l, as we will use them to
			// delegate elements creation
			val pkgFactoryFqn = l.syntax.getFactoryFqnFor(genPkg.getEcorePackage)
			members += l.toField('''«genPkg.getEcorePackage.name»Adaptee''', pkgFactoryFqn.typeRef)[
					initializer = '''«pkgFactoryFqn».eINSTANCE'''
				]

			// Generate a dedicated create$MetaclassName method for each
			// meta-class of interest in mt's current package
			genPkg.getEcorePackage
			.EClassifiers
			.filter(EClass)
			.filter[instantiable]
			.forEach[cls|
				val newCreate = l.toMethod("create" + cls.name, null)[m |
					m.annotations += Override.annotationRef

					val associatedPkg =
						l.syntax.pkgs
						.findFirst[
							EClassifiers.exists[mapping.namesMatch(it, cls)]
						]
					val associatedCls =
						mapping?.rules
						?.findFirst[to == cls.name]
						?.from ?: cls.name

					cls.ETypeParameters.forEach[t |
						m.typeParameters +=
							TypesFactory.eINSTANCE.createJvmTypeParameter => [
								name = t.name
							]
					]

					// FIXME: Second parameter (Resource) shouldn't be null
					m.body = '''
						return adaptersFactory.create«
						»«l.syntax.simpleAdapterNameFor(mt, cls)»«
						»(«associatedPkg.name»Adaptee.create«associatedCls»(), null);
					'''
				]

				newCreate.returnType = mt.typeRef(cls, #[newCreate])
				members += newCreate
			]

			// The getEPackage() method on the generated Language adapter should
			// always point to the EPackage of the model type it implements, so
			// that reflective calls only see what is available on the interface
			members += l.toMethod("getEPackage", EPackage.typeRef)[
				annotations += Override.annotationRef

				body = '''
					return get«genPkg.packageInterfaceName»();
				'''
			]

			// Essentially the same thing as getEPackage()
			members += l.toMethod("get" + genPkg.packageInterfaceName, genPkg.qualifiedPackageInterfaceName.typeRef)[
				body = '''
					return «genPkg.qualifiedPackageInterfaceName».eINSTANCE;
				'''
			]
		]
	}

	/**
	 * Generates a factory of adapters between {@code l} and {@code mt}.
	 * 
	 * @see NamingHelper#getAdaptersFactoryNameFor
	 */
	private def void generateAdaptersFactory(Language l, ModelType mt) {
		val adapFactName = l.syntax.getAdaptersFactoryNameFor(mt)
		acceptor.accept(l.toClass(adapFactName))
		[
			// Implements the AdaptersFactory interface
			superTypes += AdaptersFactory.typeRef

			// Dummy singleton pattern
			members += l.toField("instance", adapFactName.typeRef)[
				static = true
			]

			members += l.toMethod("getInstance", adapFactName.typeRef)[
				static = true
				body = '''
					if (instance == null) {
						instance = new «adapFactName»();
					}
					return instance;
				'''
			]

			// Keep trace of the generated adapters in a WeakHashMap
			// so that there is at most one adapter for each model element
			// at any time
			members += l.toField("register",
				WeakHashMap.typeRef(EObject.typeRef,EObjectAdapter.typeRef))

			members += l.toConstructor[
				body = '''
					register = new «WeakHashMap»();
				'''
			]

			// Implementation of AdaptersFactory#createAdapter
			// Delegates adapters creation to the dedicated create$AdapterName
			// methods using a dispatch pattern following the inheritance
			// hierarchy between meta-classes of the model type.
			members += l.toMethod("createAdapter", EObjectAdapter.typeRef)[
				parameters += l.toParameter("o", EObject.typeRef)
				parameters += l.toParameter("res", Resource.typeRef)

				val orderedCls =
					mt.allClasses
					.filter[
						   l.hasAdapterFor(mt, it)
						&& instantiable
						&& abstractable
					]
					.sortByClassInheritance

				body = '''
					«FOR cls : orderedCls»
					«val clsFqn = l.syntax.getFqnFor(cls)»
					if (o instanceof «clsFqn»){
						return create«cls.name»Adapter((«clsFqn») o, res);
					}
					«ENDFOR»

					return null;
				'''
			]

			// Generate dedicated adapter factory methods for each meta-class.
			// First, try to retrieve the adapter from the WeakHashMap to avoid
			// duplicates; otherwise create a new one and put it in the Map.
			mt.allClasses.filter[abstractable].forEach[cls |
				val adapName = l.syntax.adapterNameFor(mt, cls)
				val mmCls = l.syntax.allClasses.findFirst[mapping.namesMatch(it, cls)]

				members += l.toMethod('''create«cls.name»Adapter''', adapName.typeRef)[
					parameters += l.toParameter("adaptee", l.syntax.getFqnFor(mmCls).typeRef)
					parameters += l.toParameter("res", Resource.typeRef)

					body = '''
						if (adaptee == null)
							return null;
						«EObjectAdapter» adapter = register.get(adaptee);
						if(adapter != null)
							 return («adapName») adapter;
						else {
							adapter = new «adapName»();
							adapter.setAdaptee(adaptee);
							adapter.setResource(res);
							register.put(adaptee, adapter);
							return («adapName») adapter;
						}
					'''
				]
			]
		]
	}
}