package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.ModelingElement
import fr.inria.diverse.melange.metamodel.melange.Transformation
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import java.util.List
import com.google.common.collect.SetMultimap
import com.google.common.collect.HashMultimap

/**
 * A collection of utilities around naming conventions in Melange
 * (generated code, adapters, UML specificities, etc.)
 */
class NamingHelper
{
	@Inject extension ModelingElementExtensions
	@Inject extension EcoreExtensions
	@Inject extension IQualifiedNameProvider
	@Inject extension IQualifiedNameConverter

	/**
	 * Returns the namespace corresponding to the first {@link EPackage}
	 * in the {@link ModelingElement} {@code m}.
	 */
	def String getRootPackageNamespace(ModelingElement m) {
		return
			m.allGenPkgs
			.head
			.packageNamespace
	}
	
	/**
	 * Return the list of packages from {@link m} associated with their java qualified name
	 */
	def SetMultimap<String,String> getRootPackageNamespaces(ModelingElement m){
		val SetMultimap<String, String> res = HashMultimap.create
		m.allGenPkgs.forEach[
			val syntaxPackage = getEcorePackage.uniqueId
			val javaPackage = packageNamespace
			res.put(syntaxPackage,javaPackage)
		]
		return res
	}

	/**
	 * Returns the (simple) name of the class generated for the first
	 * {@link EPackage} of {@code m}.
	 */
	def String getRootPackageName(ModelingElement m) {
		return
			m.allGenPkgs
			.head
			.packageInterfaceName
	}

	/**
	 * Returns the fully qualified name of the class generated for the first
	 * {@link EPackage} of {@code m}.
	 */
	def String getRootPackageFqn(ModelingElement m) {
		return
			m.allGenPkgs
			.head
			.qualifiedPackageInterfaceName
	}

	/**
	 * Returns the namespace corresponding to the {@link EPackage} pointed
	 * by the {@link GenPackage} {@code gp}.
	 */
	def String getPackageNamespace(GenPackage gp) {
		return
			gp.qualifiedPackageInterfaceName
			.toQualifiedName
			.skipLast(1)
			.toString
	}

	/**
	 * Returns the fully qualified name of the {@link EFactory} generated
	 * for the first {@link EPackage} of {@code m}.
	 */
	def String getRootFactoryFqn(ModelingElement m) {
		return
			m.allGenPkgs
			.head
			.qualifiedFactoryInterfaceName
	}

	/**
	 * Returns the fully qualified name of the {@link EFactory} generated
	 * for the {@link EPackage} {@code pkg}.
	 */
	def String getFactoryFqnFor(ModelingElement m, EPackage pkg) {
		return
			m.getGenPkgFor(pkg)
			.qualifiedFactoryInterfaceName
	}

	/**
	 * Returns the (Java) fully qualified name of the {@link EPackage}
	 * {@code pkg}.
	 */
	def String getFqnFor(ModelingElement m, EPackage pkg) {
		return
			m.getGenPkgFor(pkg)
			.qualifiedPackageInterfaceName
	}

	/**
	 * Returns the (Java) fully qualified name of the {@link EClassifier}
	 * {@code cls}.
	 */
	def String getFqnFor(ModelingElement m, EClassifier cls) {
		return
			switch (cls) {
				EClass:    m.getGenClsFor(cls).qualifiedInterfaceName
				EDataType: m.getGenDataTypeFor(cls).qualifiedInstanceClassName
			}
	}

//	def String getFqnFor(Metamodel mm, ModelType mt, EClassifier cls) {
//		val mapping = mm.owningLanguage.mappings.findFirst[to == mt]
//		val mappingName = mapping?.rules?.findFirst[to == cls.name]?.from
//		val realName = mappingName ?: cls.name
//
//		return
//			if (cls instanceof EClass || cls instanceof EEnum)
//				mm.getGenPackageFor(mm.pkgs.findFirst[EClassifiers.exists[name == realName]])
//				  .getFqnFor(realName)
//			else
//				cls.instanceClass?.name ?: cls.instanceClassName
//	}

	/**
	 * Returns the fully qualified name of the generated factory that creates
	 * adapters from the {@link Metamodel} {@code mm} to the {@link ModelType}
	 * {@code mt}.
	 */
	def String getAdaptersFactoryNameFor(Metamodel mm, ModelType mt) {
		return
			mm.owningLanguage
			.fullyQualifiedName
			.append("adapters")
			.append(mt.fullyQualifiedName.lastSegment)
			.toLowerCase
			.append(mt.name + "AdaptersFactory")
			.normalize
			.toString
	}

	/**
	 * @deprecated
	 */
	def String getMappersFactoryNameFor(Metamodel sourceModel, ModelType targetMT) {
		return
			sourceModel.owningLanguage
			.fullyQualifiedName
			.append("mappers")
			.append(targetMT.fullyQualifiedName.lastSegment)
			.toLowerCase
			.append(targetMT.name + "MappersFactory")
			.normalize
			.toString
	}

	/**
	 * Returns the fully qualified name of the adapter class generated between
	 * {@code mm} and {@code mt} for the {@link EClass} {@code cls}.
	 */
	def String adapterNameFor(Metamodel mm, ModelType mt, EClass cls) {
		return mm.adapterNameFor(mt, cls.fullyQualifiedName.toString)
	}

	/**
	 * Returns the fully qualified name of the adapter class generated between
	 * {@code mm} and {@code mt} for the type named {@code name}.
	 */
	def String adapterNameFor(Metamodel mm, ModelType mt, String name) {
		return
			mm.owningLanguage
			.fullyQualifiedName
			.append("adapters")
			.append(mt.fullyQualifiedName.lastSegment)
			.toLowerCase
			.append(name + "Adapter")
			.normalize
			.toString
	}

	/**
	 * Returns the fully qualified name of the in-the-large adapter class
	 * generated between {@code mm} and {@code mt}.
	 */
	def String adapterNameFor(Metamodel mm, ModelType mt) {
		return
			mm.owningLanguage
			.fullyQualifiedName
			.append("adapters")
			.append(mt.fullyQualifiedName.lastSegment)
			.toLowerCase
			.append(mm.owningLanguage.name + "Adapter")
			.normalize
			.toString
	}

	/**
	 * @deprecated
	 */
	def String mapperNameFor(Metamodel sourceModel, ModelType targetMT) {
		return
			sourceModel.fullyQualifiedName
			.append("mappers")
			.append(targetMT.fullyQualifiedName.lastSegment)
			.toLowerCase
			.append(sourceModel.owningLanguage.name + "Adapter")
			.normalize
			.toString
	}

	/**
	 * @deprecated
	 */
	def String adapterNameFor(Metamodel mm, Metamodel superMM, EClass cls) {
		return
			mm.owningLanguage
			.fullyQualifiedName
			.append("adapters")
			.append(superMM.owningLanguage.name)
			.toLowerCase
			.append(cls.name + "Adapter")
			.normalize
			.toString
	}

	/**
	 * @deprecated
	 */
	def String mapperNameFor(Metamodel sourceModel, ModelType targetMT, EClass targetClass) {
		return
			sourceModel.owningLanguage
			.fullyQualifiedName
			.append("mappers")
			.append(targetMT.fullyQualifiedName.lastSegment)
			.toLowerCase
			.append(targetClass.name + "Mapper")
			.normalize
			.toString
	}

	/**
	 * @deprecated
	 */
	def String simpleMapperNameFor(Metamodel sourceModel, ModelType targetMT, EClass targetClass) {
		return targetClass.name + "Mapper"
	}

	/**
	 * Returns the (simple) name of the adapter class generated for the
	 * {@link EClass} {@code cls} between {@code mm} and {@code mt}.
	 */
	def String simpleAdapterNameFor(Metamodel mm, ModelType mt, EClass cls) {
		return mm.simpleAdapterNameFor(mt, cls.name)
	}

	/**
	 * Returns the (simple) name of the adapter class generated for the
	 * type named {@code name} between {@code mm} and {@code mt}.
	 */
	def String simpleAdapterNameFor(Metamodel mm, ModelType mt, String name) {
		return
			mm.adapterNameFor(mt, name)
			.toQualifiedName
			.lastSegment
			.toString
	}

	/**
	 * Returns the fully qualified name of the adapter class generated for the
	 * {@link EFactory} between {@code mm} and {@code mt}.
	 */
	def String factoryAdapterNameFor(GenPackage pkg, Metamodel mm, ModelType mt) {
		return
			mm.owningLanguage
			.fullyQualifiedName
			.append("adapters")
			.append(mt.fullyQualifiedName.lastSegment)
			.append(pkg.getEcorePackage.fullyQualifiedName)
			.toLowerCase
			.append(pkg.factoryInterfaceName + "Adapter")
			.normalize
			.toString
	}

	/**
	 * Returns the name of the Java class generated for the {@link Transformation}
	 * {@code t}.
	 */
	def String getClassName(Transformation t) {
		return
			t.fullyQualifiedName
			.skipLast(1)
			.toLowerCase
			.append(t.name)
			.toString
	}

	/**
	 * Returns the name of the StandaloneSetup class generated for the project
	 * defined by the {@link ModelTypingspace} {@code root}.
	 */
	def String getStandaloneSetupClassName(ModelTypingSpace root) {
		return
			root.fullyQualifiedName
			.append("StandaloneSetup")
			.toString
	}

	/**
	 * Returns the name of the Java getter associated to the
	 * {@link EStructuralFeature} {@code f}.
	 */
	def String getGetterName(EStructuralFeature f) {
		return
			switch (f) {
				case f.EContainingClass.EPackage.isUml:
					f.umlGetterName
				EAttribute:
					if (f.EAttributeType.instanceClassName == "boolean" && !f.many)
						'''is«f.name.toFirstUpper»'''
					else
						'''get«f.name.toFirstUpper»'''
				EReference:
					'''get«f.name.toFirstUpper»'''
			}
	}

	/**
	 * Returns the name of the Java getter associated to the
	 * {@link JvmOperation} {@code op}.
	 */
	def String getGetterName(JvmOperation op) {
		return
			if (op.returnType.type.simpleName == "boolean")
				'''is«op.simpleName.toFirstUpper»'''
			else
				'''get«op.simpleName.toFirstUpper»'''
	}

	/**
	 * Returns the name of the Java getter associated to the
	 * {@link EStructuralFeature} {@code f}, taking into account the
	 * specialized naming conventions of UML.
	 */
	def String getUmlGetterName(EStructuralFeature f) {
		return
			switch (f) {
				EAttribute:
					if (f.EAttributeType.instanceClassName == "boolean")
						if (f.name.startsWith("is") && Character::isUpperCase(f.name.charAt(2)))
							'''«f.formatUmlFeatureName»'''
						else if (f.many)
							'''get«f.formatUmlFeatureName.toFirstUpper»'''
						else
							'''is«f.formatUmlFeatureName.toFirstUpper»'''
					else
						'''get«f.formatUmlFeatureName.toFirstUpper»'''
				EReference:
					'''get«f.formatUmlFeatureName.toFirstUpper»'''
			}
	}

	/**
	 * Returns the name of the Java setter associated to the
	 * {@link EStructuralFeature} {@code f}, taking into account the
	 * specialized naming conventions of UML.
	 */
	def String getUmlSetterName(EStructuralFeature f) {
		return '''set«f.formatUmlFeatureName.toFirstUpper»'''
	}

	/**
	 * Returns the name of the Java setter associated to the
	 * {@link EStructuralFeature} {@code f}.
	 */
	def String getSetterName(EStructuralFeature f) {
		return
			if (f.EContainingClass.EPackage.isUml)
				f.umlSetterName
			else
				'''set«f.name.toFirstUpper»'''
	}

	/**
	 * Returns the name of the Java getter associated to the
	 * {@link JvmOperation} {@code op}.
	 */
	def String getSetterName(JvmOperation op) {
		return '''set«op.simpleName.toFirstUpper»'''
	}

	/**
	 * Returns the name of the Java unsetter ({@code eUnset()}) associated to
	 * the {@link EStructuralFeature} {@code f}.
	 */
	def String getUnsetterName(EStructuralFeature f) {
		return
			if (f.EContainingClass.EPackage.isUml)
				'''unset«f.formatUmlFeatureName.toFirstUpper»'''
			else
				'''unset«f.name.toFirstUpper»'''
	}

	/**
	 * Returns the name of the Java unsetter check ({@code eIsSet()})
	 * associated to the {@link EStructuralFeature} {@code f}.
	 */
	def String getUnsetterCheckName(EStructuralFeature f) {
		return
			if (f.EContainingClass.EPackage.isUml)
				'''isSet«f.formatUmlFeatureName.toFirstUpper»'''
			else
				'''isSet«f.name.toFirstUpper»'''
	}

	/**
	 * Returns the name of the Java operation corresponding to the
	 * {@link EOperation} {@code op}, taking into account UML naming conventions.
	 */
	def String formatUmlOperationName(EOperation op) {
		val opName = op.name.toCamelCase

		if (op.EParameters.head?.EType?.name == "EDiagnosticChain") {
			return '''validate«opName.toFirstUpper»'''
		}

		return opName
	}

	/**
	 * Returns the name of the Java operation corresponding to the
	 * {@link EStructuralFeature} {@code f}, taking into account UML naming
	 * conventions.
	 */
	def String formatUmlFeatureName(EStructuralFeature f) {
		return
			if (f.name == "class")
				"class_"
			else if (f.many) {
				if (f.name.endsWith("es"))
					'''«f.name»es'''
				else if (f.name.endsWith("y") && !f.name.endsWith("By"))
					'''«f.name.substring(0, f.name.length - 1)»ies'''
				else if (f.name.endsWith("ex"))
					'''«f.name.substring(0, f.name.length - 2)»ices'''
				else if (f.name.endsWith("ss"))
					'''«f.name»es'''
				else if (!f.name.endsWith("Data"))
					'''«f.name»s'''
				else
					f.name
			} else
				f.name
	}

	/**
	 * Wololo, wololo wololo.
	 */
	def String toCamelCase(String s) {
		val parts = s.split("_")
		val res = new StringBuilder

		parts.forEach[p, i |
			res.append(if (i == 0) p else p.toFirstUpper)
		]

		return res.toString
	}

	/**
	 * Wololo, wololo wololo.
	 */
	private def String normalize(QualifiedName name) {
		val res = new StringBuilder

		res.append(name.skipLast(1).segments.map[toLowerCase].join("."))
		res.append("." + name.lastSegment/*.toFirstUpper*/)

		return res.toString
	}
}
