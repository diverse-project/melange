package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.EcoreExtensions
import org.eclipse.emf.ecore.EPackage
import fr.inria.diverse.melange.metamodel.melange.PackageBinding
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EStructuralFeature
import java.util.HashSet
import com.google.common.collect.HashBasedTable
import java.util.ArrayList
import org.eclipse.emf.ecore.EcoreFactory

class RenamerHelper{
	
	@Inject extension EcoreExtensions
	
	/**
	 * Renames packages, classes & features from {@link model} according to the rules from {@link mappingRules}
	 */
	def void applyRenaming(EPackage modelRoot, List<PackageBinding> mappingRules){
		if (mappingRules.empty)
			return;

		mappingRules.forEach[ packageRule |
			val sourcePack = if(modelRoot.name == packageRule.from) modelRoot else modelRoot.findSubPackage(packageRule.from.substring(packageRule.from.indexOf(".")+1))
			packageRule.classes.forEach[classRule |
				sourcePack.EClassifiers.filter(EClass).filter[name == classRule.from].forEach[ clazz |
					
					//Change name for properties
					classRule.properties.forEach[propertyRule |
						var EStructuralFeature target = clazz.EReferences.findFirst[name == propertyRule.from]
						if(target == null) target = clazz.EAttributes.findFirst[name == propertyRule.from]
						
						if(target != null) target.name = propertyRule.to
					]
					
					//Change name for classes
					clazz.name = classRule.to
				]
			]
		]
		
		//Build new package hierachy
		val oldRootName = modelRoot.name
		val renamedPackages = new HashSet<EPackage>() 
		val targetedPackages = new HashSet<EPackage>()
		mappingRules.forEach[ packageRule |
			val oldPackages = packageRule.from.split("\\.")
			val newPackages = packageRule.to.split("\\.")

			//Register source packages
			var current = modelRoot
			for(var int i = 1; i < oldPackages.size; i++){
				val packName = oldPackages.get(i)
				current = current.ESubpackages.findFirst[name == packName]
			}
			renamedPackages.add(current)
			
			//Register targeted packages & Creates new packages
			current = modelRoot
			targetedPackages.add(current)
			for(var int i = 1; i < newPackages.size; i++){
				val packName = newPackages.get(i)
				var nextCurrent = current.ESubpackages.findFirst[name == packName]
				if(nextCurrent == null){
					nextCurrent = EcoreFactory.eINSTANCE.createEPackage
					nextCurrent.name = packName
					nextCurrent.nsPrefix = packName
					nextCurrent.nsURI = current.nsURI+packName+"/"
					current.ESubpackages.add(nextCurrent)
				}
				current = nextCurrent
				targetedPackages.add(current)
			}
			
			if(newPackages.head != modelRoot.name){
				modelRoot.name = newPackages.head
			}
		]
		
		//Register classes to be moved
		val movedClasses = HashBasedTable.create
		val movedPackages = HashBasedTable.create
		mappingRules.forEach[ packageRule |
			val sourcePack = if(oldRootName == packageRule.from) modelRoot else modelRoot.findSubPackage(packageRule.from.substring(packageRule.from.indexOf(".")+1))
			val targetPack = if(modelRoot.name == packageRule.to) modelRoot else modelRoot.findSubPackage(packageRule.to.substring(packageRule.to.indexOf(".")+1))
			
			if(sourcePack != targetPack){
				val classes = new ArrayList(sourcePack.EClassifiers)
				movedClasses.put(sourcePack,targetPack,classes)
				
				val subPackages = new ArrayList(sourcePack.ESubpackages)
				subPackages.removeAll(targetedPackages)
				subPackages.removeAll(renamedPackages)
				movedPackages.put(sourcePack,targetPack,subPackages)
			}
		]
		
		//Move classes
		movedClasses.cellSet.forEach[cell |
			val sourcePack = cell.rowKey
			val targetPack = cell.columnKey
			val classes = cell.value
			targetPack.EClassifiers.addAll(classes)
			sourcePack.EClassifiers.remove(classes)
			
		]
		//Move subpackages
		movedPackages.cellSet.forEach[cell |
			val sourcePack = cell.rowKey
			val targetPack = cell.columnKey
			val subPackages = cell.value
			targetPack.ESubpackages.addAll(subPackages)
			sourcePack.ESubpackages.remove(subPackages)
			
			//Deleted renamed packages
			if(!targetedPackages.contains(sourcePack)){
				sourcePack.ESuperPackage.ESubpackages.remove(sourcePack)
			}
		]
		
	}
}