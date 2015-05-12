package fr.inria.diverse.melange.utils

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmEnumerationType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmVisibility

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
	def EPackage inferEcoreFragment(Aspect aspImport, Metamodel mm) {
		val aspect = aspImport.aspectTypeRef.type as JvmDeclaredType
		val baseCls = aspImport.aspectedClass
		val basePkg = baseCls?.EPackage ?: mm.pkgs.head

		val aspPkg = EcoreFactory.eINSTANCE.createEPackage => [
			name = basePkg.name
			nsPrefix = basePkg.nsPrefix
			nsURI = basePkg.nsURI
		]

		val aspCls = EcoreFactory.eINSTANCE.createEClass => [cls |
			cls.name = if (baseCls !== null) baseCls.name else aspect.simpleName
			cls.^abstract = if (baseCls !== null) baseCls.^abstract else aspect.^abstract
			cls.^interface = if (baseCls !== null) baseCls.^interface else false

			if (baseCls === null) {
				cls.EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]

				if (aspect.extendedClass !== null && aspect.extendedClass.simpleName != "Object")
					cls.ESuperTypes += aspPkg.getOrCreateClass(aspect.extendedClass.simpleName)
			}
		]

		aspPkg.EClassifiers += aspCls

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
				val upperB = if (op.returnType.isCollection) -1 else 1
				val realType =
					if (op.returnType.isCollection)
						(op.returnType as JvmParameterizedTypeReference).arguments.head.type
					else
						op.returnType.type
				val retCls = if (realType.simpleName == aspCls.name) aspCls else basePkg.findClass(realType.simpleName)

				if (!aspCls.EOperations.exists[name == op.simpleName]) {
					aspCls.EOperations += EcoreFactory.eINSTANCE.createEOperation => [
						name = op.simpleName
						op.parameters.forEach[p, i |
							// Skip first generic _self argument
							if (i > 0) {
								val pType = p.parameterType.type
								val upperBP = if (p.parameterType.isCollection) -1 else 1
								val realTypeP =
									if (p.parameterType.isCollection)
										(p.parameterType as JvmParameterizedTypeReference).arguments.head.type
									else
										pType
								val attrCls = if (realTypeP.simpleName == aspCls.name) aspCls else basePkg.findClass(realTypeP.simpleName)

								EParameters += EcoreFactory.eINSTANCE.createEParameter => [pp |
									pp.name = p.simpleName
									pp.upperBound = upperBP
									pp.EType =
										if (attrCls !== null)
											aspPkg.getOrCreateClass(realTypeP.simpleName)
										else if (realTypeP instanceof JvmEnumerationType)
											// FIXME: Ok for now, but we should also check literals values
											aspPkg.getOrCreateEnum(realTypeP.simpleName, realTypeP.literals.map[simpleName])
										else
											aspPkg.getOrCreateDataType(realTypeP.simpleName, realTypeP.qualifiedName)
								]
							}
						]

						if (op.returnType.simpleName != "void" && op.returnType.simpleName !== "null") {
							upperBound = upperB
							EType =
								if (retCls !== null)
									aspPkg.getOrCreateClass(realType.simpleName)
								else if (realType instanceof JvmEnumerationType)
									// FIXME: Ok for now, but we should also check literals values
									aspPkg.getOrCreateEnum(realType.simpleName, realType.literals.map[simpleName])
								else
									aspPkg.getOrCreateDataType(realType.simpleName, realType.qualifiedName)
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
				val upperB = if (op.returnType.isCollection) -1 else 1
				val realType =
					if (op.returnType.isCollection)
						(retType as JvmParameterizedTypeReference).arguments.head.type
					else
						retType.type
				val find = if (realType.simpleName == aspCls.name) aspCls else basePkg.findClass(realType.simpleName)
				if (find !== null) {
					// Create EReference
					aspCls.EStructuralFeatures += EcoreFactory.eINSTANCE.createEReference => [
						name = featureName
						EType = aspPkg.getOrCreateClass(find.name)
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
								aspPkg.getOrCreateEnum(realType.simpleName, realType.literals.map[simpleName])
							else
								aspPkg.getOrCreateDataType(realType.simpleName, realType.qualifiedName)
						upperBound = upperB
						EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
					]
				}
			}
		]

		return aspPkg
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
}
