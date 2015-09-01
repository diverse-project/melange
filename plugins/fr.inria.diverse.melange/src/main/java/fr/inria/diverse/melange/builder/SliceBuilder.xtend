package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Slice
import org.eclipse.emf.ecore.util.EcoreUtil
import fr.inria.diverse.melange.lib.slicing.ecore.StrictEcore
import java.util.List
import java.util.ArrayList
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EClass

class SliceBuilder extends LanguageOperatorBuilder{
	
	@Inject extension RenamerHelper
	
	new(Slice op, ModelTypingSpaceBuilder root){
		this.source = op
		this.root = root
	}
	
	override make() {
		if(targetModel != null){
			val op = source as Slice
			val sliceBase = EcoreUtil::copy(targetModel)
			
			val roots = getClasses(sliceBase, op.roots)
			val slicer = new StrictEcore(roots,sliceBase,false,"ecore",false)
			slicer.slice
			
			model = slicer.getclonedElts.filter(EPackage).filter[eContainer===null].head
			model.applyRenaming(op.mappingRules)
		}
		
		return new ArrayList //TODO: manage slice error here?
	}
	
	/**
	 * Search in {@link rootPackage} for EClass named as in {@link classes}
	 */
	private def List<EModelElement> getClasses(EPackage rootPackage, List<String> classes){
		//TODO: manage sub packages
		val res = new ArrayList<EModelElement>()
		
		rootPackage.EClassifiers.filter(EClass).forEach[cl|
			if(classes.contains(cl.name)) res.add(cl)
		]
		
		return res
	}
	
}