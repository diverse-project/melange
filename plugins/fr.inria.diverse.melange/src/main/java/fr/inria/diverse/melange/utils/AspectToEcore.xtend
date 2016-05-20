package fr.inria.diverse.melange.utils

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.lib.EcoreExtensions
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmEnumerationType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.JvmMember
import java.util.Set

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
class AspectToEcore
{
	@Inject extension AspectExtensions
	@Inject extension EcoreExtensions
	@Inject extension TypeReferencesHelper

	static final String CONTAINMENT_ANNOTATION_FQN =
		"fr.inria.diverse.k3.al.annotationprocessor.Containment"
	static final List<String> K3_PREFIXES =
		#["_privk3", "super_"]
	
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
					]
		]

		// Parses all the interesting public operations in the aspect
		aspect.declaredOperations
		.filter[
			!isK3Specific
			&& visibility == JvmVisibility.PUBLIC
		]
		.forEach[op |
			val featureName = findFeatureNameFor(aspect, op)

			// If we can't infer a feature name, it's obviously really an operation
			if (featureName === null) {
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
			} else if (!aspCls.EStructuralFeatures.exists[name == featureName]) {
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
						]
			}
		]
		
		return aspTopPkg
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
	def String findFeatureNameFor(JvmDeclaredType type, JvmOperation op) {
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
	 * Checks whether the given operation is some obscure K3 code or not
	 */
	private def boolean isK3Specific(JvmOperation op) {
		return K3_PREFIXES.exists[p | op.simpleName.startsWith(p)]
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
