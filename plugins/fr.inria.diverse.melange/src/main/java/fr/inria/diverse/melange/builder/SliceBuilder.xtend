package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.slicing.ecore.StrictEcore
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.Slice
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * Builder for the {@link Slice} operator.
 */
class SliceBuilder extends LanguageOperatorBuilder<Slice> {
	@Inject extension RenamerHelper

	new(Slice op, ModelTypingSpaceBuilder root) {
		super(op, root)
	}

	/**
	 * Copy the set of {@link EPackage} built from the {@link Language} pointed by
	 * the current {@link Slice} operator, slice it according to the slicing
	 * criterion and apply the renaming rules.
	 */
	override make() {
		if (!targetModel.isEmpty) {
			val sliceBase = EcoreUtil::copyAll(targetModel).toSet
			val roots = sliceBase.map[getClasses(it, source.roots)].flatten.toList
			val slicer = new StrictEcore(roots, sliceBase.head, false, "ecore", false, true)

			slicer.slice

			model = slicer.getclonedElts.filter(EPackage).filter[eContainer === null].toSet
			model.forEach[applyRenaming(source.mappingRules)]
		}
	}

	/**
	 * Search in {@code rootPackage} for {@link EClass}es named as in {@code classes}
	 */
	private def List<EModelElement> getClasses(EPackage rootPackage, List<String> classes) {
		// TODO: manage sub packages
		val res = newArrayList

		rootPackage.EClassifiers
		.filter(EClass)
		.forEach[cl |
			if (classes.contains(cl.name))
				res.add(cl)
		]

		return res
	}
}
