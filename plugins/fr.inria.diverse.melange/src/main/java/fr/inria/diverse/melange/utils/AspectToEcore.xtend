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
package fr.inria.diverse.melange.utils

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.lib.EcoreExtensions
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.xtext.common.types.JvmCustomAnnotationValue
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmEnumerationType
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.XStringLiteral
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

/**
 * Infers the minimal Ecore file (an {@link EPackage}) corresponding to the
 * "modeling intention" of a K3 aspect. For example, from the following aspect:
 * 
 * <code>
 * \@Aspect(className = A)
 * class AspectA {
 *     public int foo
 *     def void bar() {}
 * }
 * </code>
 * 
 * it will infer a new {@link EPackage} containing an {@link EClass} {@code A}
 * with an {@link EAttribute} {@code foo} and an {@link EOperation} {@code foo}.
 */
// FIXME: Duplicated code etc. this is so ugly
// NOTE: due to https://github.com/diverse-project/melange/issues/123
// the methods may not have been fully processed by K3 annotation processor
// we need to be more clever when looking at method parameters, switch due to that will be 
// commented with a "see #123"
class AspectToEcore
{
	@Inject extension AspectExtensions
	@Inject extension EcoreExtensions
	@Inject extension TypeReferencesHelper
	@Inject JvmTypeReferenceBuilder.Factory typeRefBuilderFactory

	static final String CONTAINMENT_ANNOTATION_FQN =
		"fr.inria.diverse.melange.annotation.Containment"
	static final String UNIQUE_ANNOTATION_FQN =
		"fr.inria.diverse.melange.annotation.Unique"
	static final String OPPOSITE_ANNOTATION_FQN =
		"fr.inria.diverse.melange.annotation.Opposite"
	static final List<String> K3_PREFIXES =
		#["_privk3", "super_"]
	public static final String PROP_NAME = "AspectProperties"
	
	/**
	 * Analyzes the aspect {@code aspect}, woven on the {@link EClass}
	 * {@code baseCls} contained in the {@link EPackage} {@code basePkg}, and
	 * returns the corresponding {@link EPackage} describing its modeling intention.
	 */
	def EPackage inferEcoreFragment(
		JvmDeclaredType aspect,
		EClass baseCls,
		Set<EPackage> basePkgs
	) {
		//val typeRefBuilder = typeRefBuilderFactory.create(aspect.eResource.resourceSet)
		
		// FIXME: should check aspPkg == basePkg?
		val aspPkg = 
			if(baseCls !== null)
				baseCls.copyPackage 
			else
				EcoreFactory.eINSTANCE.createEPackage => [
					name = basePkgs.head.name
					nsPrefix = basePkgs.head.nsPrefix
					nsURI = basePkgs.head.nsURI
				]
		val aspTopPkg = aspPkg.rootPackage

		// Create the new aspCls in which we will create aspect's features
		val aspCls = EcoreFactory.eINSTANCE.createEClass => [cls |
			cls.name =
				if (baseCls !== null)
					baseCls.name
				else
					aspect.simpleName
			cls.^abstract =
				if (baseCls !== null)
					baseCls.^abstract
				else
					aspect.^abstract
			cls.^interface =
				if (baseCls !== null)
					baseCls.^interface
				else
					false // No @Aspect on interface anyway

			if (baseCls === null) {
				// The aspect inserts a new meta-class, mark it
				cls.addAspectAnnotation

				if (aspect.extendedClass !== null
					&& aspect.extendedClass.simpleName != "Object")
					// Also reflect its supertypes in the inferred EPackage
					cls.ESuperTypes += aspTopPkg.getOrCreateClass(
						aspect.extendedClass.qualifiedName)
			}
		]

		aspPkg.EClassifiers += aspCls

		// infer the fields of the given aspect class
		inferAspectFieldsEcoreFragment(aspect, aspCls, basePkgs, aspTopPkg)
		
		// infers the methods of the given aspect class
		inferAspectMethodsEcoreFragment(aspect, aspCls, baseCls, aspPkg, basePkgs, aspTopPkg)

		return aspTopPkg
	}
	
	
	/**
	 * infers the fields to be added in the ecore fragment
	 */
	private def void inferAspectFieldsEcoreFragment(
		JvmDeclaredType aspect,
		EClass aspCls,
		Set<EPackage> basePkgs,
		EPackage aspTopPkg
	) {
		
		// "aspects" without @Aspect may have declared fields,
		// so we parse them too
		aspect.declaredFields
		.filter[
			   visibility == JvmVisibility.PUBLIC
			&& !^static
		]
		.forEach[field |
			val fieldType = field.type
			val upperB = if (fieldType.isList) -1 else 1
			val realType =
				if (fieldType.isList)
					fieldType.containedElementsType
				else
					fieldType.type

			val find =
				if (realType.qualifiedName == aspCls.uniqueId)
					aspCls
				else
					basePkgs.findClass(realType.qualifiedName)

			// If we find a corresponding EClass, then it's a EReference
			if (find !== null)
				aspCls.EStructuralFeatures +=
					EcoreFactory.eINSTANCE.createEReference => [
						name = field.simpleName
						EType = aspTopPkg.getOrCreateClass(find.toQualifiedName)
						upperBound = upperB
						containment = field.isContainment
						addAspectAnnotation
						unique = field.isUnique
					]
			// Otherwise, it's an EAttribute to an external type
			else
				aspCls.EStructuralFeatures +=
					EcoreFactory.eINSTANCE.createEAttribute => [
						name = field.simpleName
						EType =
							if (realType instanceof JvmEnumerationType)
								// FIXME: Ok for now, but we should also check
								//         literals values
								aspTopPkg.getOrCreateEnum(realType.simpleName,
									realType.literals.map[simpleName])
							else
								aspTopPkg.getOrCreateDataType(realType.simpleName,
									realType.qualifiedName)
						upperBound = upperB
						addAspectAnnotation
						unique = field.isUnique
					]
		]
	}
	
	/**
	 * infers the methods to be added in the ecore fragment
	 */
	private def void inferAspectMethodsEcoreFragment(
		JvmDeclaredType aspect,
		EClass aspCls,
		EClass baseCls,
		EPackage aspPkg,
		Set<EPackage> basePkgs,
		EPackage aspTopPkg
	) {
		val typeRefBuilder = typeRefBuilderFactory.create(aspect.eResource.resourceSet)
		// Parses all the interesting public operations in the aspect
		aspect.declaredOperations
		.filter[
			!isK3Specific
			&& visibility == JvmVisibility.PUBLIC
		]
		.forEach[op |
			val featureName = findFeatureNameFor(aspect, op, typeRefBuilder)

			// If we can't infer a feature name, it's obviously really an operation
			if (featureName === null) {
				inferAspectMethodsEcoreFragmentFromOperation(
							aspect, aspCls, 
							baseCls, 
							aspPkg, basePkgs, aspTopPkg,
							op)
			} else if (!aspCls.EStructuralFeatures.exists[name == featureName]) {
				//the operation has been identified has implementing a Structural feature
			 	// create this feature if it doesn't exists yet in the class
				inferAspectStructuralFeaturesEcoreFragmentFromOperation(
							aspect, aspCls, 
							baseCls, 
							aspPkg, basePkgs, aspTopPkg,
							featureName,
							op)
			}
		]
	}
	
	private def void inferAspectMethodsEcoreFragmentFromOperation(
		JvmDeclaredType aspect,
		EClass aspCls,
		EClass baseCls,
		EPackage aspPkg,
		Set<EPackage> basePkgs,
		EPackage aspTopPkg,
		JvmOperation op
	) {
		val upperB = if (op.returnType.isList) -1 else 1
		val realType =
			if (op.returnType.isList)
				op.returnType.containedElementsType
			else
				op.returnType.type

		val retCls =
			if (realType.qualifiedName == aspCls.uniqueId)
				aspCls
			else
				basePkgs.findClass(realType.qualifiedName)
		if (!aspCls.EOperations.exists[name == op.simpleName]) {
			aspCls.EOperations +=
				EcoreFactory.eINSTANCE.createEOperation => [
					name = op.simpleName
					op.parameters.forEach[p, i |
						// Skip first generic _self argument
						// only if @Aspect annotation present
						if (!aspect.hasAspectAnnotation || i > 0) {
							val pType = p.parameterType.type
							val upperBP = if (p.parameterType.isList) -1 else 1
							val realTypeP =
								if (p.parameterType.isList)
									p.parameterType.containedElementsType
								else
									pType

							val attrCls =
								if (realTypeP.qualifiedName == aspCls.uniqueId)
									aspCls
								else
									basePkgs.findClass(realTypeP.qualifiedName)

							EParameters +=
								EcoreFactory.eINSTANCE.createEParameter => [pp |
									pp.name = p.simpleName
									pp.upperBound = upperBP
									pp.EType =
										if (attrCls !== null)
											aspTopPkg.getOrCreateClass(attrCls.uniqueId)
										else if (realTypeP instanceof JvmEnumerationType)
											// FIXME: Ok for now, but we should also check literals values
											aspTopPkg.getOrCreateEnum(realTypeP.simpleName,
												realTypeP.literals.map[simpleName])
										else
											aspTopPkg.getOrCreateDataType(realTypeP.simpleName,
												realTypeP.qualifiedName)
								]
						}
					]

				if (op.returnType.simpleName != "void" && op.returnType.simpleName !== "null") {
					upperBound = upperB
					EType =
						if (retCls !== null)
							aspTopPkg.getOrCreateClass(retCls.uniqueId)
						else if (realType instanceof JvmEnumerationType)
							// FIXME: Ok for now, but we should also check literals values
							aspTopPkg.getOrCreateEnum(realType.simpleName,
								realType.literals.map[simpleName])
						else
							aspTopPkg.getOrCreateDataType(realType.simpleName,
								realType.qualifiedName)
				}
				addAspectAnnotation
			]
		}
	}
	
	/**
	 * the operation has been identified has implementing a Structural feature
	 * create this feature if it doesn't exists yet in the class
	 */
	private def void inferAspectStructuralFeaturesEcoreFragmentFromOperation(
		JvmDeclaredType aspect,
		EClass aspCls,
		EClass baseCls,
		EPackage aspPkg,
		Set<EPackage> basePkgs,
		EPackage aspTopPkg,
		String featureName,
		JvmOperation op
	) {
		val retType =
			if (op.simpleName.startsWith("get") || op.parameters.size == 1)
				op.returnType
			else
				op.parameters.get(1).parameterType
		val upperB = if (op.returnType.isList) -1 else 1
		val realType =
			if (op.returnType.isList)
				retType.containedElementsType
			else
				retType.type
				
		val find =
			if (realType.qualifiedName == aspCls.uniqueId)
				aspCls
			else
				basePkgs.findClass(realType.qualifiedName)
		if (find !== null)
			// Create EReference
			aspCls.EStructuralFeatures +=
				EcoreFactory.eINSTANCE.createEReference => [
					name = featureName
					EType = aspTopPkg.getOrCreateClass(find.toQualifiedName)
					upperBound = upperB
					containment = op.isContainment
					addAspectAnnotation
					unique = op.isUnique
					if(op.isOpposite){
						addOppositeAnnotation(op.getOppositeValue)
					}
				]
		else
			aspCls.EStructuralFeatures +=
				EcoreFactory.eINSTANCE.createEAttribute => [
					name = featureName
					EType =
						if (realType instanceof JvmEnumerationType)
							// FIXME: Ok for now, but we should also check literals values
							aspTopPkg.getOrCreateEnum(realType.simpleName,
								realType.literals.map[simpleName])
						else
							aspTopPkg.getOrCreateDataType(realType.simpleName,
								realType.qualifiedName)
					upperBound = upperB
					addAspectAnnotation
					if(op.isContainment)
						addContainmentAnnotation
					unique = op.isUnique
					]
	}
	
	/**
	 * For the getter or setter {@code op} in {@code type}, infers the
	 * corresponding feature name (eg. getXyz()/setXyz() associated to the
	 * "xyz" feature).
	 * 
	 * @param type The {@link JvmDeclaredType} of an aspect.
	 * @param op   A {@link JvmOperation} of {@code type}.
	 * @return the corresponding feature name, or null if it cannot be determined.
	 */
	def String findFeatureNameFor(JvmDeclaredType type, JvmOperation op, JvmTypeReferenceBuilder typeRefBuilder) {
		// @Aspect case 1
		// ie. int getX() / void setX(int)
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
		// eg. int x() / void x(int)
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
		else if(op.isGetter(typeRefBuilder))
			return op.simpleName
		// No @Aspect (plain Java)
		// we expect something in the line of getX() / setX()
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
	 * Checks whether the given field is annotated with @Containment
	 */
	private def boolean isContainment(JvmMember field) {
		return
			field.annotations.exists[
				annotation.qualifiedName == CONTAINMENT_ANNOTATION_FQN
			]
	}
	
	/**
	 * Checks whether the given field is annotated with @Unique or @Containment or @Opposite
	 */
	private def boolean isUnique(JvmMember field) {
		return
			field.isContainment
			|| field.isOpposite
			|| field.annotations.exists[
				annotation.qualifiedName == UNIQUE_ANNOTATION_FQN
			]
	}
	
	/**
	 * Checks whether the given field is annotated with @Opposite
	 */
	private def boolean isOpposite(JvmMember field) {
		return
			field.isContainment
			|| field.annotations.exists[
				annotation.qualifiedName == OPPOSITE_ANNOTATION_FQN
			]
	}
	
	/**
	 * Return the 'value' parameter of the annotation @Opposite
	 * or null if none
	 */
	private def String getOppositeValue(JvmMember field) {
		val annot = field.annotations.findFirst[annotation.qualifiedName == OPPOSITE_ANNOTATION_FQN]
		val annotVal = annot?.values?.findFirst[valueName=="value"]
		if(annotVal instanceof JvmCustomAnnotationValue){
			val opRef = (annotVal as JvmCustomAnnotationValue).values.head as XStringLiteral
			return opRef?.value
		}
		null
	}

	/**
	 * Checks whether the given operation is some obscure K3 code or not
	 */
	private def boolean isK3Specific(JvmOperation op) {
		return K3_PREFIXES.exists[p | op.simpleName.startsWith(p)]
	}

	/**
	 * Create a copy of the hierarchy of sub-packages containing {@link baseCls}
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
	
	/**
	 * Return true if {@link op} is an Aspect generated getter for final field 
	 */
	private def boolean isGetter(JvmOperation op, JvmTypeReferenceBuilder typeRefBuilder) {
		try {
			if( op.parameters.size == 1 ){
				val eclass = op.parameters.get(0).parameterType.simpleName
				val className = op.declaringType.qualifiedName
				val aspectProperties = typeRefBuilder.typeRef(className + eclass + PROP_NAME)
				val type = aspectProperties.type as JvmGenericType
				
				return type.members.filter(JvmField).exists[simpleName == op.simpleName && isFinal]
			}
		}
		catch(Exception e){
			//Do nothing :)
			//TODO: log
		}
		
		false
	}
}
