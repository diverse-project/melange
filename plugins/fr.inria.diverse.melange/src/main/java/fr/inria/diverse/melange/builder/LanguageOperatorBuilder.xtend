package fr.inria.diverse.melange.builder

import fr.inria.diverse.melange.metamodel.melange.LanguageOperator
import org.eclipse.emf.ecore.EPackage

abstract class LanguageOperatorBuilder<T extends LanguageOperator> extends OperatorBuilder<T> {
	protected EPackage targetModel
	protected ModelTypingSpaceBuilder root

	override preBuild() {
		super.preBuild

		val langBuilder = root.getBuilder(source.targetLanguage)

		if (langBuilder.isBuilding) {
			errors.add(
				new Error(
					'''Cyclic dependency between «source.targetLanguage.name» and «source.owningLanguage.name»''',
					source)
			)
		}

		targetModel = langBuilder.model
		if (targetModel === null && langBuilder.errors.isEmpty) {
			langBuilder.build()

			if (!langBuilder.errors.isEmpty) {
				errors.add(
					new Error('''Language «source.targetLanguage.name» has errors in its definition''', source)
				)
			}

			targetModel = langBuilder.model
		}
	}
}
