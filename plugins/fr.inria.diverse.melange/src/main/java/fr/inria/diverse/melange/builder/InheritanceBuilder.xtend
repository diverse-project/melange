package fr.inria.diverse.melange.builder

import fr.inria.diverse.melange.metamodel.melange.Inheritance
import org.eclipse.emf.ecore.util.EcoreUtil

class InheritanceBuilder extends LanguageOperatorBuilder<Inheritance> {
	new(Inheritance op, ModelTypingSpaceBuilder root) {
		this.source = op
		this.root = root
	}

	override make() {
		if (targetModel !== null) {
			model = EcoreUtil::copy(targetModel)
		}
	}
}
