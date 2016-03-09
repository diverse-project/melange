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

class AspectExtensions {
	@Inject extension IQualifiedNameConverter
	@Inject extension NamingHelper
	@Inject extension ModelingElementExtensions

	def boolean getIsComplete(Aspect asp) {
		return
			asp.aspectTypeRef?.type !== null
			&& asp.aspectTypeRef.type instanceof JvmDeclaredType
//			&& asp.aspectAnnotationValue !== null
	}

	def boolean hasAspectAnnotation(Aspect asp) {
		val t = (asp.aspectTypeRef.type as JvmDeclaredType)
		// TODO: Remove hard-stringed dependency
		val aspAnn = t?.annotations.findFirst[annotation?.qualifiedName == "fr.inria.diverse.k3.al.annotationprocessor.Aspect"]
		return aspAnn !== null 
	}

	def String getAspectAnnotationValue(JvmTypeReference asp) {
		if (!(asp.type instanceof JvmDeclaredType))
			return null
		return (asp.type as JvmDeclaredType)?.aspectAnnotationValue
	}
	
	def String getAspectedClassFqName(Aspect asp) {
		return (asp.aspectTypeRef.type as JvmDeclaredType)?.getAspectedClassFqName
	}

	def String getAspectAnnotationValue(JvmDeclaredType t) {
		// TODO: Remove hard-stringed dependency
		val aspAnn = t.annotations.findFirst[annotation?.qualifiedName == "fr.inria.diverse.k3.al.annotationprocessor.Aspect"]
		val aspClassName = aspAnn?.values?.findFirst[valueName == "className"]
		val aspVal = switch aspClassName {
			JvmTypeAnnotationValue: aspClassName.values?.head?.simpleName
			JvmCustomAnnotationValue: (aspClassName.values?.head as XAbstractFeatureCall)?.feature?.simpleName
			default: null
		}

		// Xtext 2.8+
		if (aspVal !== null && aspVal.matches("<implicit:.*?>")) {
			return aspVal.substring(aspVal.lastIndexOf(".") + 1, aspVal.length - 1)
		}

		if (aspVal !== null && aspVal.contains("."))
			return aspVal.substring(aspVal.lastIndexOf(".") + 1, aspVal.length)

		return aspVal
	}
	
	def String getAspectedClassFqName(JvmDeclaredType t){
		val aspAnn = t.annotations.findFirst[annotation?.qualifiedName == "fr.inria.diverse.k3.al.annotationprocessor.Aspect"]
		val aspClassName = aspAnn?.values?.findFirst[valueName == "className"]
		val aspVal = switch aspClassName {
			JvmTypeAnnotationValue: aspClassName.values?.head?.qualifiedName
			JvmCustomAnnotationValue: (aspClassName.values?.head as XAbstractFeatureCall)?.feature?.qualifiedName
			default: null
		}
		return aspVal
	}

	def String getAspectAnnotationValueType(JvmDeclaredType t) {
		val aspAnn = t.annotations.findFirst[annotation?.qualifiedName == "fr.inria.diverse.k3.al.annotationprocessor.Aspect"]
		val aspClassName = aspAnn?.values?.findFirst[valueName == "className"]
		val aspVal = switch aspClassName {
			JvmTypeAnnotationValue: aspClassName.values?.head?.qualifiedName
			JvmCustomAnnotationValue: {
				val feature = aspClassName.values?.head as XAbstractFeatureCall
				feature.feature.qualifiedName
			}
		}

		return aspVal
	}

	def QualifiedName getTargetedNamespace(JvmTypeReference aspectTypeRef) {
		val aavt = (aspectTypeRef.type as JvmDeclaredType).aspectAnnotationValueType
		return
			if (aavt !== null)
				aavt.toQualifiedName.skipLast(1)
			else
				QualifiedName::create
	}

	def boolean isDefinedOver(JvmTypeReference aspectTypeRef, Metamodel mm) {
		return mm.allGenPkgs.map[packageNamespace].exists[ns |
			ns == aspectTypeRef.targetedNamespace.toString
		]
	}

	// FIXME: We should check that the original mm is a super-type of mm
	// Hard to find the metamodel declaration or the corresponding Ecore file
	// in the workspace...
	def boolean canBeCopiedFor(JvmTypeReference aspectTypeRef, Metamodel mm) {
		// FIXME:
		return true
	}
}
