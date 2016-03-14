package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Merge
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * Builder for the {@link Merge} operator.
 */
class MergeBuilder extends LanguageOperatorBuilder<Merge> {
	@Inject extension RenamerHelper

	new(Merge op, ModelTypingSpaceBuilder root) {
		super(op, root)
	}

	/**
	 * Copy the {@link EPackage} built from the {@link Language} pointed by
	 * the current {@link Merge} operator and apply the associated renaming rules.
	 */
	override make() {
		if (targetModel !== null) {
			model = EcoreUtil::copy(targetModel)
			model.applyRenaming(source.mappingRules)
		}
	}
}
