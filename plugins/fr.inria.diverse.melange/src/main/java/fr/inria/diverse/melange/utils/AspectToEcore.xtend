package fr.inria.diverse.melange.utils

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Language
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmEnumerationType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.List

/**
 * This class creates an EPackage corresponding to an aspect.
 */
// FIXME: Duplicated code etc. this is so ugly
class AspectToEcore
{
	@Inject extension EcoreExtensions
	@Inject extension TypeReferencesHelper
	@Inject extension ModelingElementExtensions
	
	/**
	 * Try to infer the "modeling intention" of the aspect aspImport
	 * and put its features into a newly created EPackage
	 */
	def EPackage inferEcoreFragment(JvmDeclaredType aspect, EClass baseCls, EPackage basePkg) {
		val hasAnnotation = aspect.annotations.exists[annotation.qualifiedName == "fr.inria.diverse.k3.al.annotationprocessor.Aspect"]

		val aspPkg = 
			if(baseCls !== null){
				baseCls.copyPackage //FIXME: should check aspPkg == basePkg ?
			} 
			else{
				EcoreFactory.eINSTANCE.createEPackage => [
					name = basePkg.name
					nsPrefix = basePkg.nsPrefix
					nsURI = basePkg.nsURI
				]
			}
			
		//the top package
		var tmpPack = aspPkg
		while(tmpPack.ESuperPackage !== null){
			tmpPack = tmpPack.ESuperPackage
		}
		val aspTopPkg = tmpPack 
		
		val aspCls = EcoreFactory.eINSTANCE.createEClass => [cls |
			cls.name = if (baseCls !== null) baseCls.name else aspect.simpleName
			cls.^abstract = if (baseCls !== null) baseCls.^abstract else aspect.^abstract
			cls.^interface = if (baseCls !== null) baseCls.^interface else false

			if (baseCls === null) {
				cls.EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]

				if (aspect.extendedClass !== null && aspect.extendedClass.simpleName != "Object")
					cls.ESuperTypes += aspTopPkg.getOrCreateClass(aspect.extendedClass.qualifiedName)
			}
		]

		aspPkg.EClassifiers += aspCls

		/*
		 * "aspects" without @Aspect may have declared fields
		 */
		aspect.declaredFields
		.filter[visibility == JvmVisibility.PUBLIC]
		.forEach[field |
			val fieldType = field.type
			val upperB = if (fieldType.isList) -1 else 1
			val realType =
				if (fieldType.isList)
					(fieldType as JvmParameterizedTypeReference).arguments.head.type
				else
					fieldType.type

			val find = if (realType.simpleName == aspCls.name) aspCls else basePkg.findClass(realType.simpleName)
			if (find !== null) {
				// Create EReference
				aspCls.EStructuralFeatures += EcoreFactory.eINSTANCE.createEReference => [
					name = field.simpleName
					EType = aspTopPkg.getOrCreateClass(find.toQualifiedName)
					upperBound = upperB
					containment = field.annotations.exists[annotation.qualifiedName == "fr.inria.diverse.k3.al.annotationprocessor.Containment"]
					EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
				]
			} else {
				aspCls.EStructuralFeatures += EcoreFactory.eINSTANCE.createEAttribute => [
					name = field.simpleName
					EType =
						if (realType instanceof JvmEnumerationType)
							// FIXME: Ok for now, but we should also check literals values
							aspTopPkg.getOrCreateEnum(realType.simpleName, realType.literals.map[simpleName])
						else
							aspTopPkg.getOrCreateDataType(realType.simpleName, realType.qualifiedName)
					upperBound = upperB
					EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
				]
			}
		]

		aspect.declaredOperations
		.filter[
			// FIXME: Hard-coded strings
			   !simpleName.startsWith("_privk3")
			&& !simpleName.startsWith("super_")
//			&& !annotations.exists[annotation.simpleName == "OverrideAspectMethod"]
			&& visibility == JvmVisibility.PUBLIC
		]
		.forEach[op |
			val featureName = findFeatureNameFor(aspect, op)

			// If we can't infer a feature name, it's obviously really an operation
			if (featureName === null) {
				val upperB = if (op.returnType.isList) -1 else 1
				val realType =
					if (op.returnType.isList)
						(op.returnType as JvmParameterizedTypeReference).arguments.head.type
					else
						op.returnType.type

				val retCls = if (realType.simpleName == aspCls.name) aspCls else basePkg.findClass(realType.simpleName)
				if (!aspCls.EOperations.exists[name == op.simpleName]) {
					aspCls.EOperations += EcoreFactory.eINSTANCE.createEOperation => [
						name = op.simpleName
						op.parameters.forEach[p, i |
							// Skip first generic _self argument
							// only if @Aspect annotation present
							if (!hasAnnotation || i > 0) {
								val pType = p.parameterType.type
								val upperBP = if (p.parameterType.isList) -1 else 1
								val realTypeP =
									if (p.parameterType.isList)
										(p.parameterType as JvmParameterizedTypeReference).arguments.head.type
									else
										pType

								val attrCls = if (realTypeP.simpleName == aspCls.name) aspCls else basePkg.findClass(realTypeP.simpleName)
								EParameters += EcoreFactory.eINSTANCE.createEParameter => [pp |
									pp.name = p.simpleName
									pp.upperBound = upperBP
									pp.EType =
										if (attrCls !== null)
											aspTopPkg.getOrCreateClass(realTypeP.qualifiedName)
										else if (realTypeP instanceof JvmEnumerationType)
											// FIXME: Ok for now, but we should also check literals values
											aspTopPkg.getOrCreateEnum(realTypeP.simpleName, realTypeP.literals.map[simpleName])
										else
											aspTopPkg.getOrCreateDataType(realTypeP.simpleName, realTypeP.qualifiedName)
								]
							}
						]

						if (op.returnType.simpleName != "void" && op.returnType.simpleName !== "null") {
							upperBound = upperB
							EType =
								if (retCls !== null)
									aspTopPkg.getOrCreateClass(realType.qualifiedName)
								else if (realType instanceof JvmEnumerationType)
									// FIXME: Ok for now, but we should also check literals values
									aspTopPkg.getOrCreateEnum(realType.simpleName, realType.literals.map[simpleName])
								else
									aspTopPkg.getOrCreateDataType(realType.simpleName, realType.qualifiedName)
						}
						EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
					]
				}
			} else if (!aspCls.EStructuralFeatures.exists[name == featureName]) {
				val retType =
					if (op.simpleName.startsWith("get") || op.parameters.size == 1)
						op.returnType
					else
						op.parameters.get(1).parameterType
				val upperB = if (op.returnType.isList) -1 else 1
				val realType =
					if (op.returnType.isList)
						(retType as JvmParameterizedTypeReference).arguments.head.type
					else
						retType.type

				val find = if (realType.simpleName == aspCls.name) aspCls else basePkg.findClass(realType.simpleName)
				if (find !== null) {
					// Create EReference
					aspCls.EStructuralFeatures += EcoreFactory.eINSTANCE.createEReference => [
						name = featureName
						EType = aspTopPkg.getOrCreateClass(find.toQualifiedName)
						upperBound = upperB
						containment = op.annotations.exists[annotation.qualifiedName == "fr.inria.diverse.k3.al.annotationprocessor.Containment"]
						EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
					]
				} else {
					aspCls.EStructuralFeatures += EcoreFactory.eINSTANCE.createEAttribute => [
						name = featureName
						EType =
							if (realType instanceof JvmEnumerationType)
								// FIXME: Ok for now, but we should also check literals values
								aspTopPkg.getOrCreateEnum(realType.simpleName, realType.literals.map[simpleName])
							else
								aspTopPkg.getOrCreateDataType(realType.simpleName, realType.qualifiedName)
						upperBound = upperB
						EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
					]
				}
			}
		]
		
		return aspTopPkg
	}
	
	/**
	 * If {@link op} is a getter or a setter return the name of the corresponding feature.
	 * Otherwise return null
	 * 
	 * @param type Aspect where {@link op} is defined
	 * @param op Method defined in {@link type}
	 */
	def String findFeatureNameFor(JvmDeclaredType type, JvmOperation op) {
		// @Aspect case 1
		if (
			(  op.simpleName.startsWith("get")
			&& Character.isUpperCase(op.simpleName.charAt(3))
			&& op.parameters.size == 1
			&& op.returnType.simpleName != "void"
			&& type.declaredOperations.exists[opp |
				   opp.simpleName == op.simpleName.replaceFirst("get", "set")
				&& opp.parameters.get(1).parameterType.qualifiedName == op.returnType.qualifiedName
				&& opp.returnType.simpleName == "void"
			])
		||	(  op.simpleName.startsWith("set")
			&& Character.isUpperCase(op.simpleName.charAt(3))
			&& op.parameters.size == 2
			&& op.returnType.simpleName == "void"
			&& type.declaredOperations.exists[opp |
				   opp.simpleName == op.simpleName.replaceFirst("set", "get")
				&& opp.returnType.qualifiedName == op.parameters.get(1).parameterType.qualifiedName
			])
		)
			return op.simpleName.substring(3, op.simpleName.length).toFirstLower
		// @Aspect case 2
		else if (
			type.declaredOperations.exists[opp |
				   opp !== op
				&& opp.simpleName == op.simpleName
				&& ((
					   op.parameters.size == 1
					&& op.returnType.simpleName != "void"
					&& opp.parameters.size == 2
					&& opp.returnType.simpleName == "void"
					&& op.returnType.qualifiedName == opp.parameters.get(1).parameterType.qualifiedName
				) || (
					opp.parameters.size == 1
					&& opp.returnType.simpleName != "void"
					&& op.parameters.size == 2
					&& op.returnType.simpleName == "void"
					&& op.parameters.get(1).parameterType.qualifiedName == opp.returnType.qualifiedName
				))
			]
		)
			return op.simpleName
		// No @Aspect
		else if (
			(  op.simpleName.startsWith("get")
			&& Character.isUpperCase(op.simpleName.charAt(3))
			&& op.parameters.size == 0
			&& op.returnType.simpleName != "void"
			&& type.declaredOperations.exists[opp |
				   opp.simpleName == op.simpleName.replaceFirst("get", "set")
				&& opp.parameters.size == 1
				&& opp.parameters.get(0).parameterType.qualifiedName == op.returnType.qualifiedName
				&& opp.returnType.simpleName == "void"
			])
		||	(  op.simpleName.startsWith("set")
			&& Character.isUpperCase(op.simpleName.charAt(3))
			&& op.parameters.size == 1
			&& op.returnType.simpleName == "void"
			&& type.declaredOperations.exists[opp |
				   opp.simpleName == op.simpleName.replaceFirst("set", "get")
				&& opp.parameters.size == 0
				&& opp.returnType.qualifiedName == op.parameters.get(0).parameterType.qualifiedName
			])
		)
			return op.simpleName.substring(3, op.simpleName.length).toFirstLower
		else return null
	}
	
	/**
	 * Create a copy of the hierachy of sub-packages containing {@link baseCls}
	 * Return the deepest package
	 */
	private def EPackage copyPackage(EClass baseCls){
		
		var EPackage res = null
		
		var currentPkg = baseCls.EPackage
		var EPackage last = null
		while(currentPkg !== null){
			val pkgCopy = EcoreFactory.eINSTANCE.createEPackage
			pkgCopy.name = currentPkg.name
			pkgCopy.nsPrefix = currentPkg.nsPrefix
			pkgCopy.nsURI = currentPkg.nsURI
			if(last !== null){
				pkgCopy.ESubpackages += last 
			}
			else{
				res = pkgCopy
			}
			last = pkgCopy
			currentPkg = currentPkg.ESuperPackage
		}
		
		return res
	}
	
	private def String toQualifiedName(EClass clazz){
		val List<String> res = newArrayList
		res.add(clazz.name)
		
		var pack = clazz.EPackage
		while(pack !== null){
			res.add(pack.name)
			pack = pack.ESuperPackage
		}
		
		return res.reverse.join(".")
	}
}
