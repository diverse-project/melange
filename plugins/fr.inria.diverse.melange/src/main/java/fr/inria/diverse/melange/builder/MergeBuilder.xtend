package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Merge
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.ArrayList

class MergeBuilder extends LanguageOperatorBuilder{
	
	@Inject extension RenamerHelper
	
	new(Merge op, ModelTypingSpaceBuilder root){
		this.source = op
		this.root = root
	}
	
	override make() {
		if(targetModel !== null){
			val op = source as Merge
			model = EcoreUtil::copy(targetModel)
			model.applyRenaming(op.mappingRules)
		}
		//TODO: manage renaming errors
	}
	
}