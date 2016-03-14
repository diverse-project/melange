package fr.inria.diverse.melange.builder

import fr.inria.diverse.melange.metamodel.melange.Inheritance
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * Builder for the {@link Inheritance} operator.
 */
class InheritanceBuilder extends LanguageOperatorBuilder<Inheritance> {
	new(Inheritance op, ModelTypingSpaceBuilder root) {
		super(op, root)
	}

	/**
	 * Points {@code AbstractBuilder#model} to the {@link EPackage} derived
	 * from the build of the {@link Language} pointed by the {@link Inheritance}
	 * operator.
	 */
	override make() {
		if (targetModel !== null) {
			model = EcoreUtil::copy(targetModel)
		}
	}
}
