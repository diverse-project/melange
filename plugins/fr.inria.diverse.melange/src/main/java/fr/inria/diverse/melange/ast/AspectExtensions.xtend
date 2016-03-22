package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import org.eclipse.xtext.common.types.JvmCustomAnnotationValue
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.xbase.XAbstractFeatureCall

/**
 * A collection of utilities around language {@link Aspect}s,
 * and the associated {@link JvmTypeReference}s.
 */
class AspectExtensions {
	@Inject extension IQualifiedNameConverter
	@Inject extension LanguageExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension NamingHelper

	public static final String ASPECT_ANNOTATION_FQN =
		"fr.inria.diverse.k3.al.annotationprocessor.Aspect"
	public static final String ASPECT_ANNOTATION_PARAMETER =
		"className"

	/**
	 * Checks whether the given {@link Aspect} {@code asp} can be resolved
	 * and processed as a JvmDeclaredType
	 */
	def boolean isValid(Aspect asp) {
		return
			   asp.aspectTypeRef?.type !== null
			&& asp.aspectTypeRef.type instanceof JvmDeclaredType
	}

	/**
	 * Checks whether the given aspect {@code asp} has an @Aspect annotation
	 */
	def boolean hasAspectAnnotation(Aspect asp) {
		return
			if (asp.isValid)
				asp.asJvmType.hasAspectAnnotation
			else
				false
	}

	/**
	 * Checks whether the given JVM type {@code aspType} has an @Aspect annotation
	 */
	def boolean hasAspectAnnotation(JvmDeclaredType aspType) {
		return
			aspType.annotations.exists[
				annotation.qualifiedName == ASPECT_ANNOTATION_FQN
			]
	}

	/**
	 * Returns the fully qualified name of the class on which the aspect
	 * pointed by the given {@link JvmTypeReference} {@code typeRef} is woven
	 * (ie. the value of its 'className=' annotation parameter), or null
	 * if it cannot be retrieved
	 */
	def String getAspectAnnotationValue(JvmTypeReference typeRef) {
		if (typeRef?.type === null
			|| !(typeRef.type instanceof JvmDeclaredType))
			return null

		return
			(typeRef.type as JvmDeclaredType).extractAspectAnnotationValue?.toString
	}

	/**
	 * Returns the simple name of the class on which the aspect
	 * pointed by the given {@link JvmTypeReference} {@code typeRef} is woven
	 * (ie. the value of its 'className=' annotation parameter), or null
	 * if it cannot be retrieved
	 */
	def String getSimpleAspectAnnotationValue(JvmTypeReference typeRef) {
		if (typeRef?.type === null
			|| !(typeRef.type instanceof JvmDeclaredType))
			return null

		return
			(typeRef.type as JvmDeclaredType)
			.extractAspectAnnotationValue?.lastSegment?.toString
	}

	/**
	 * Returns the fully qualified name of the class on which the aspect
	 * {@code asp} is woven (ie. the value of its 'className=' annotation
	 * parameter), or null if it cannot be retrieved
	 */
	def String getTargetedClassFqn(Aspect asp) {
		return
			if (asp.isValid)
				asp.asJvmType.extractAspectAnnotationValue.toString
	}

	/**
	 * Checks whether the aspect pointed by the {@code aspectTypeRef} reference
	 * is defined over the namespace defined by the {@code mm} {@link Metamodel}
	 */
	def boolean isDefinedOver(JvmTypeReference aspectTypeRef, Metamodel mm) {
		return mm.allGenPkgs.map[packageNamespace].exists[ns |
			ns == aspectTypeRef.targetedNamespace.toString
		]
	}

	/**
	 * Checks whether the given {@code aspectTypeRef} aspect reference can be
	 * copied for the {@code mm} {@link Metamodel}
	 */
	def boolean canBeCopiedFor(JvmTypeReference aspectTypeRef, Metamodel mm) {
		// FIXME: not implemented
		return true
	}

	/**
	 * Tries to replace the {@link JvmTypeReference} {@code asp} points to with
	 * a new {@link JvmTypeReference} pointing to its new qualified name in
	 * the runtime project of its containing language.
	 */
	def void tryUpdateAspect(Aspect asp) {
		var language = asp.owningLanguage
		val newRef = language.getCopiedAspectRefFor(asp.aspectTypeRef.simpleName)

		if (newRef !== null)
			asp.aspectTypeRef = newRef
	}

	/**
	 * Returns the qualified name of the base package of the class on which
	 * the aspect pointed by the {@link JvmTypeReference} {@code aspectTypeRef}
	 * reference points, or an empty {@link QualifiedName}
	 */
	private def QualifiedName getTargetedNamespace(JvmTypeReference aspectTypeRef) {
		val aavt = (aspectTypeRef.type as JvmDeclaredType).extractAspectAnnotationValue

		return
			if (aavt !== null)
				aavt.skipLast(1)
			else
				QualifiedName::create
	}

	/**
	 * Sorts the {@code aspects} list by overriding priority, ie. if an aspect
	 * A potentially overrides an aspect B, it will be earlier in the list.
	 */
	def Iterable<Aspect> sortByOverridingPriority(Iterable<Aspect> aspects) {
		return aspects.sortWith[aspA, aspB |
			val clsA = aspA.aspectedClass
			val clsB = aspB.aspectedClass

			if (clsA.EAllSuperTypes.contains(clsB))
				return -1
			else if (clsB.EAllSuperTypes.contains(clsA))
				return 1
			else return 0
		]
	}

	/**
	 * Returns the underlying {@link JvmDeclaredType} corresponding to
	 * the aspect {@code asp} or null if it cannot be determined
	 */
	private def JvmDeclaredType asJvmType(Aspect asp) {
		return
			if (asp.isValid)
				asp.aspectTypeRef.type as JvmDeclaredType
	}

	/**
	 * Parses the given {@link JvmDeclaredType} {@code t} to extract the value
	 * of its {@code className} annotation parameter in the form of a
	 * {@link QualifiedName}
	 */
	private def QualifiedName extractAspectAnnotationValue(JvmDeclaredType t) {
		val aspAnn = t.annotations.findFirst[
			annotation?.qualifiedName == ASPECT_ANNOTATION_FQN]
		val aspClassName = aspAnn?.values?.findFirst[
			valueName == ASPECT_ANNOTATION_PARAMETER]
		val aspVal = switch aspClassName {
			JvmTypeAnnotationValue:
				aspClassName.values?.head?.qualifiedName
			JvmCustomAnnotationValue: {
				val feature = aspClassName.values?.head as XAbstractFeatureCall
				feature.feature.qualifiedName
			}
		}

		return aspVal?.toQualifiedName
	}
}
