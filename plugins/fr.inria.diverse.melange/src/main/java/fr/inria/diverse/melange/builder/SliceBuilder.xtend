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
	 * Copy the {@link EPackage} built from the {@link Language} pointed by
	 * the current {@link Slice} operator, slice it according to the slicing
	 * criterion and apply the renaming rules.
	 */
	override make() {
		if (targetModel !== null) {
			val sliceBase = EcoreUtil::copy(targetModel)
			val roots = getClasses(sliceBase, source.roots)
			val slicer = new StrictEcore(roots, sliceBase, false, "ecore", false, true)

			slicer.slice

			model = slicer.getclonedElts.filter(EPackage).filter[eContainer === null].head
			model.applyRenaming(source.mappingRules)
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
