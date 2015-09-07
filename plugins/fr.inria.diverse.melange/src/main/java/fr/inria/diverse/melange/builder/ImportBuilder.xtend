package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.metamodel.melange.Import
import java.util.ArrayList

class ImportBuilder extends OperatorBuilder{
	
	@Inject ModelUtils modelUtils
	@Inject extension RenamerHelper
	
	new(Import op){
		this.source = op
	}
	
	override make() {
		val op = source as Import
		model = modelUtils.loadPkg(op.ecoreUri)
		model.applyRenaming(op.mappingRules)
		
		//TODO: manage load & renaming errors
	}
	
}