package fr.inria.diverse.melange.experimental

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.slicing.ecore.StrictEcore
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil
import fr.inria.diverse.melange.metamodel.melange.CustomLanguageOperator
import fr.inria.diverse.melange.builder.LanguageOperatorBuilder
import fr.inria.diverse.melange.builder.ModelTypingSpaceBuilder
import fr.inria.diverse.melange.builder.RenamerHelper

abstract class CustomBuilder extends LanguageOperatorBuilder<CustomLanguageOperator> {
	
	protected AbstractParser parser
	
	new(CustomLanguageOperator op, ModelTypingSpaceBuilder root) {
		super(op, root)
	}
	
	override preBuild() {
		super.preBuild()
		parser.doParse()
	}
	
	def String getKeyword()
	
}

class Slice2Builder extends CustomBuilder {
	@Inject extension RenamerHelper
	

	new(CustomLanguageOperator op, ModelTypingSpaceBuilder root) {
		super(op, root)
		parser = new Slice2Parser(op)
	}

	override make() {
		if (targetModel !== null) {
			val sliceParser = parser as Slice2Parser
			val sliceBase = EcoreUtil::copy(targetModel)
			val roots = getClasses(sliceBase, sliceParser.roots)
			val slicer = new StrictEcore(roots, sliceBase, sliceParser.isLowerTypes, "ecore", sliceParser.isCard1, true)

			slicer.slice

			model = slicer.getclonedElts.filter(EPackage).filter[eContainer === null].head
			//FIXME: refactor mappingRules in LanguageOperator
//			model.applyRenaming(source.mappingRules)
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
	
	override getKeyword() {
		return "slice2"
	}
	
}
