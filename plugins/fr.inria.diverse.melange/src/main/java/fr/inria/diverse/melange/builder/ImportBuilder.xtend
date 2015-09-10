package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.metamodel.melange.Import

class ImportBuilder extends OperatorBuilder<Import> {
	@Inject ModelUtils modelUtils
	@Inject extension RenamerHelper

	new(Import source) {
		super(source)
	}

	override make() {
		val op = source
		model = modelUtils.loadPkg(op.ecoreUri)
		model.applyRenaming(op.mappingRules)
		// TODO: manage load & renaming errors
	}
}
