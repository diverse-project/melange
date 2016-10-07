package fr.inria.diverse.melange.utils

import com.google.common.collect.HashMultimap
import com.google.common.collect.SetMultimap
import com.google.inject.Inject
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.PackageBinding
import java.util.List
import java.util.Set
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation

class RenamingRuleManager{
	
	extension AspectExtensions aspectExtension
	
	var List<PackageBinding> sourceBinding  
	val List<Pair<String,String>> classRules = newArrayList
	val List<Pair<String,String>> packageRules = newArrayList
	val List<Pair<String,String>> propertiesRules = newArrayList
	val SetMultimap<String,Pair<String,String>> propertiesAspectRules = HashMultimap.create
	
	new(List<PackageBinding> renamingRules, List<Aspect> aspects,AspectExtensions aspectExtension){
		this.aspectExtension = aspectExtension
		storeRenamingRules(renamingRules)
		storeRenamedAspectProperties(aspects)
	}
	
	/**
	 * Store renaming rules as pairs of String and group them by: <br>
	 * - Packages renaming <br>
	 * - Class renaming <br>
	 * - Property renaming
	 * 
	 */
	def void storeRenamingRules(List<PackageBinding> renamingRules){
		if(renamingRules !== null){
			sourceBinding = renamingRules
			renamingRules.forEach[packRule |
				packageRules += packRule.from -> packRule.to
				packRule.classes.forEach[classRule |
					classRules += packRule.from+"."+classRule.from -> packRule.to+"."+classRule.to
					classRule.properties.forEach[propRule|
						propertiesRules += packRule.from+"."+classRule.from+"."+propRule.from -> packRule.to+"."+classRule.to+"."+propRule.to
					]
				]
			]
		}
	}
	
	/**
	 * Search properties defined in Aspect and find matching renaming rules.
	 * Store the selected rules and group them by Aspect.
	 * 
	 * @return AspectName -> (package.sourceClass.property, package.targetClass.property)
	 */
	def void storeRenamedAspectProperties(List<Aspect> aspects){
		
		aspects.filter[hasAspectAnnotation].forEach[asp |
			val targetClass = asp.targetedClassFqn
			
			val type = asp.aspectTypeRef.type as JvmGenericType
			type.members.filter(JvmOperation).forEach[op |
				val name = op.simpleName
				
				val rule = propertiesRules.findFirst[rule | rule.key == targetClass+"."+name]
				if(rule !== null){
					propertiesAspectRules.put(type.simpleName, rule)
				}
			]
		]
	}
	
	/**
	 * Return a renaming rule for the package {@link packageName}.
	 * Return null if none.<br>
	 * 
	 * @return sourcePackage -> targetPackage
	 */
	def Pair<String,String> getPackageRule(String packageName){
		return packageRules.findFirst[key == packageName]
	}
	
	/**
	 * Return a renaming rule for the class {@link qualifiedClassName}.
	 * Return null if none.<br>
	 * 
	 * @return sourcePackage.sourceClass -> targetPackage.targetClass
	 */
	def Pair<String,String> getClassRule(String qualifiedClassName){
		return classRules.findFirst[key == qualifiedClassName]
	} 
	
	/**
	 * Return a renaming rule for the property {@link qualifiedPropertyName}.
	 * Return null if none.<br>
	 * 
	 * @return sourcePackage.sourceClass.sourceProperty -> targetPackage.targetClass.targetProperty
	 */
	def Pair<String,String> getPropertyRule(String qualifiedPropertyName){
		return propertiesRules.findFirst[key == qualifiedPropertyName]
	}
	
	/**
	 * Return renaming rules for properties defined in {@link aspectName}.
	 * Return null if none.
	 */
	def Set<Pair<String,String>> getRulesForAspect(String aspectName){
		return propertiesAspectRules.get(aspectName)
	}
	
	def List<Pair<String, String>> getAllPackageRules(){
		return packageRules
	}
	
	def List<Pair<String, String>> getAllClassRules(){
		return classRules
	}
	
	def List<Pair<String, String>> getAllPropertyRules(){
		return propertiesRules
	}
}