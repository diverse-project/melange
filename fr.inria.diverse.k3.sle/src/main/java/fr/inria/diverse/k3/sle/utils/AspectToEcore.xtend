package fr.inria.diverse.k3.sle.utils

import fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport

import org.eclipse.emf.ecore.EcoreFactory

import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator

import static extension fr.inria.diverse.k3.sle.lib.EcoreExtensions.*

import java.util.Collection

class AspectToEcore
{
	/**
	 * Try to infer the "modeling intention" of the aspect aspImport
	 * and put its features into a newly created EPackage
	 */
	static def inferEcoreFragment(AspectImport aspImport) {
		val aspect = aspImport.aspectRef.type as JvmDeclaredType
		val baseCls = aspImport.aspectedClass
		val basePkg = baseCls.EPackage

		val aspPkg = EcoreFactory.eINSTANCE.createEPackage => [
			// These are anyway not really used
			name = aspect.simpleName.toLowerCase
			nsPrefix = name
			nsURI = "http://" + name
		]

		// FIXME: Copy other EClass properties?
		val aspCls = EcoreFactory.eINSTANCE.createEClass => [cls |
			cls.name = baseCls.name
			cls.^abstract = baseCls.^abstract
			cls.^interface = baseCls.^interface
		]

		aspPkg.EClassifiers += aspCls

		aspect.declaredOperations
		.filter[
			// FIXME: Hard-coded strings
			   !simpleName.startsWith("_privk3")
			&& !simpleName.startsWith("super_")
			&& !annotations.exists[annotation.simpleName == "OverrideAspectMethod"]
			&& visibility == JvmVisibility.PUBLIC
		]
		.forEach[op |
			val featureName = findFeatureNameFor(aspect, op)

			// If we can't infer a feature name, it's obviously really an operation
			if (featureName === null) {
				val retCls = basePkg.findClassifier(op.returnType.simpleName)

				if (!aspCls.EOperations.exists[name == op.simpleName]) {
					aspCls.EOperations += EcoreFactory.eINSTANCE.createEOperation => [
						name = op.simpleName
						op.parameters.forEach[p, i |
							// Skip first generic _self argument
							if (i > 0) {
								val attrCls = basePkg.findClassifier(p.parameterType.simpleName)

								EParameters += EcoreFactory.eINSTANCE.createEParameter => [pp |
									pp.name = p.simpleName
									pp.EType =
										if (attrCls !== null) aspPkg.getOrCreateClass(p.parameterType.simpleName)
										else aspPkg.getOrCreateDataType(p.parameterType.simpleName, p.parameterType.qualifiedName)
								]
							}
						]

						if (op.returnType.simpleName != "void" && op.returnType.simpleName !== "null")
							EType =
								if (retCls !== null) aspPkg.getOrCreateClass(op.returnType.simpleName)
								else aspPkg.getOrCreateDataType(op.returnType.simpleName, op.returnType.qualifiedName)

						EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
					]
				}
			} else if (!aspCls.EStructuralFeatures.exists[name == featureName]) {
				val retType =
					if (op.simpleName.startsWith("get") || op.parameters.size == 1)
						op.returnType.type
					else
						op.parameters.get(1).parameterType.type
				val upperB = if (Collection.isAssignableFrom(retType.class)) -1 else 1
				val realType =
					if (
						   Collection.isAssignableFrom(retType.class)
						&& retType instanceof JvmTypeParameterDeclarator
					)
						(retType as JvmTypeParameterDeclarator).typeParameters.head
					else
						retType

				val find = basePkg.findClassifier(realType.simpleName)
				if (find !== null) {
					// Create EReference
					aspCls.EStructuralFeatures += EcoreFactory.eINSTANCE.createEReference => [
						name = featureName
						EType = aspPkg.getOrCreateClass(find.name)
						upperBound = upperB
						EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
					]
				} else {
					aspCls.EStructuralFeatures += EcoreFactory.eINSTANCE.createEAttribute => [
						name = featureName
						EType = aspPkg.getOrCreateDataType(realType.simpleName, realType.qualifiedName)
						upperBound = upperB
						EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
					]
				}
			}
		]

		aspImport.ecoreFragment = aspPkg
	}

	static def findFeatureNameFor(JvmDeclaredType type, JvmOperation op) {
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
			op.simpleName.substring(3, op.simpleName.length).toFirstLower
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
			op.simpleName
		else null
	}
}
