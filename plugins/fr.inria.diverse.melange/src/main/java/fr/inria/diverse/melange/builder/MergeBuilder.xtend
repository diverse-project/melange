package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Merge
import org.eclipse.emf.ecore.util.EcoreUtil

class MergeBuilder extends LanguageOperatorBuilder<Merge> {
	@Inject extension RenamerHelper

	new(Merge op, ModelTypingSpaceBuilder root) {
		super(op, root)
	}

	override make() {
		if (targetModel !== null) {
			model = EcoreUtil::copy(targetModel)
			model.applyRenaming(source.mappingRules)
		}
		// TODO: manage renaming errors
	}
}
