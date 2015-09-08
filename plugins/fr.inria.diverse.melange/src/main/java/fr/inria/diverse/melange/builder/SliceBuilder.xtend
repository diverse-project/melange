package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.slicing.ecore.StrictEcore
import fr.inria.diverse.melange.metamodel.melange.Slice
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil

class SliceBuilder extends LanguageOperatorBuilder<Slice> {
	@Inject extension RenamerHelper

	new(Slice op, ModelTypingSpaceBuilder root) {
		super(op, root)
	}

	override make() {
		if (targetModel !== null) {
			val sliceBase = EcoreUtil::copy(targetModel)
			val roots = getClasses(sliceBase, source.roots)
			val slicer = new StrictEcore(roots, sliceBase, false, "ecore", false, true)

			slicer.slice

			model = slicer.getclonedElts.filter(EPackage).filter[eContainer === null].head
			model.applyRenaming(source.mappingRules)
		}

		// TODO: manage slice & renaming errors
	}

	/**
	 * Search in {@link rootPackage} for EClass named as in {@link classes}
	 */
	private def List<EModelElement> getClasses(EPackage rootPackage, List<String> classes) {
		// TODO: manage sub packages
		val res = new ArrayList<EModelElement>()

		rootPackage.EClassifiers.filter(EClass).forEach [ cl |
			if(classes.contains(cl.name)) res.add(cl)
		]

		return res
	}
}
