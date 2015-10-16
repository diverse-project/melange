package fr.inria.diverse.melange.utils

import com.google.common.collect.HashMultimap
import com.google.common.collect.SetMultimap
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.PackageBinding
import java.util.List
import java.util.Set
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation

class RenamingRuleManager{
	
	extension AspectExtensions aspectExtension
	
	val List<Pair<String,String>> classRules = newArrayList
	val List<Pair<String,String>> packageRules = newArrayList
	val List<Pair<String,String>> propertiesRules = newArrayList
	val SetMultimap<String,Pair<String,String>> propertiesAspectRules = HashMultimap.create
	
	var String originalRootName
	var String newRootName
	
	new(List<PackageBinding> renamingRules, List<Aspect> aspects, String newRootName, AspectExtensions aspectExtension){
		this.aspectExtension = aspectExtension
		storeRootName(renamingRules, newRootName)
		storeRenamingRules(renamingRules,newRootName)
		storeRenamedAspectProperties(aspects)
	}
	
	/**
	 * Store renaming rules as pairs of String and group them by: <br>
	 * - Packages renaming <br>
	 * - Class renaming <br>
	 * - Property renaming
	 * 
	 * @param newRootName Name of the renamed root package with its genmodel prefix. This
	 * parameter is needed to take in account the namespace of the generated Language and
	 * because the root is renamed by AspectCopier. 
	 */
	def void storeRenamingRules(List<PackageBinding> renamingRules, String newRootName){
		if(renamingRules != null){
			renamingRules.forEach[packRule |
				val packFrom = packRule.from.renameRoot(newRootName)
				val packTo = packRule.to.renameRoot(newRootName)
				packageRules += packFrom -> packTo
				packRule.classes.forEach[classRule |
					classRules += packFrom+"."+classRule.from -> packTo+"."+classRule.to
					classRule.properties.forEach[propRule|
						propertiesRules += packFrom+"."+classRule.from+"."+propRule.from -> packTo+"."+classRule.to+"."+propRule.to
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
			val targetClass = asp.aspectedClassFqName
			
			val type = asp.aspectTypeRef.type as JvmGenericType
			type.members.filter(JvmOperation).forEach[op |
				val name = op.simpleName
				
				val rule = propertiesRules.findFirst[rule | rule.key == targetClass+"."+name]
				if(rule != null){
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
		val packName = packageName.applyRootRenaming
		return packageRules.findFirst[key == packName]
	}
	
	/**
	 * Return a renaming rule for the class {@link qualifiedClassName}.
	 * Return null if none.<br>
	 * 
	 * @return sourcePackage.sourceClass -> targetPackage.targetClass
	 */
	def Pair<String,String> getClassRule(String qualifiedClassName){
		val className = qualifiedClassName?.applyRootRenaming
		return classRules.findFirst[key == className]
	} 
	
	/**
	 * Return a renaming rule for the property {@link qualifiedPropertyName}.
	 * Return null if none.<br>
	 * 
	 * @return sourcePackage.sourceClass.sourceProperty -> targetPackage.targetClass.targetProperty
	 */
	def Pair<String,String> getPropertyRule(String qualifiedPropertyName){
		val propertyName = qualifiedPropertyName.applyRootRenaming
		return propertiesRules.findFirst[key == propertyName]
	}
	
	/**
	 * Return renaming rules for properties defined in {@link aspectName}.
	 * Return null if none.
	 */
	def Set<Pair<String,String>> getRulesForAspect(String aspectName){
		return propertiesAspectRules.get(aspectName)
	}
	
	def getAllPackageRules(){
		return packageRules
	}
	
	def getAllClassRules(){
		return classRules
	}
	
	def getAllPropertyRules(){
		return propertiesRules
	}
	
	/**
	 * Replace the first segment of {@link pack} with {@link renamedRootPack}
	 */
	def String renameRoot(String pack, String renamedRootPack){
		val rootEndIndex = pack.indexOf(".")
		if(rootEndIndex != -1){
			return renamedRootPack + pack.substring(rootEndIndex)
		}
		else{
			return renamedRootPack
		}
	}
	
	/**
	 * Replace the begin of {@link qualifiedName} with the new root name
	 * if it start with the old root name.
	 */
	def String applyRootRenaming(String qualifiedName){
		return 
			if(originalRootName != null &&
				qualifiedName.indexOf(originalRootName) != -1 &&
				qualifiedName.charAt(qualifiedName.indexOf(originalRootName) + originalRootName.length).toString == "."
			){
				//prefix.originalRootName.postfix
				val postfix = qualifiedName.substring(qualifiedName.indexOf(originalRootName) + originalRootName.length)
				newRootName+postfix
			}
			else{
				qualifiedName
			}
	}
	
	def void storeRootName(List<PackageBinding> renamingRules, String rootName){
		val onePack = renamingRules.head?.from
		if(onePack != null){
			originalRootName = if(onePack.indexOf(".") != -1){
				onePack.substring(0,onePack.indexOf("."))
			}
			else{
				onePack
			}
		}
		newRootName = rootName
	}
}