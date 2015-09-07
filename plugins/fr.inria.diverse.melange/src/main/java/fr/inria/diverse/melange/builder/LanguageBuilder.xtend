package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import com.google.inject.Injector
import fr.inria.diverse.melange.algebra.EmfCompareAlgebra
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.Operator
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.metamodel.melange.Weave
import fr.inria.diverse.melange.utils.ErrorHelper
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil

class LanguageBuilder extends AbstractBuilder {
	@Inject EmfCompareAlgebra algebra
	@Inject ErrorHelper errorHelper
	@Inject Injector injector
	@Inject extension EcoreExtensions
	ModelTypingSpaceBuilder root
	Language source
	boolean isBuilding = false
	List<OperatorBuilder<? extends Operator>> builders

	new(Language l, ModelTypingSpaceBuilder root) {
		this.source = l
		this.root = root
	}

	override preBuild() {
		super.preBuild
		isBuilding = true
	}

	override postBuild() {
		isBuilding = false

		errors.forEach[e |
			errorHelper.addError(e.location, e.message)
		]
	}

	override make() {
		/*
		 * Aspect operators are built at the end since we need to retrieve the aspected
		 * EClass to infer the ecore fragment 
		 */
		val otherOperators = source.operators.filter[!(it instanceof Weave)].toList
		val aspectOperators = source.operators.filter(Weave).map[it as Operator].toList

		builders = newArrayList
		builders.addAll(createBuilders(otherOperators))
		builders.addAll(createBuilders(aspectOperators))
		builders.forEach[builder |
			builder.build()
			errors.addAll(builder.errors)
		]

		val EPackage base = EcoreUtil::copy(builders.head.model)
		builders.drop(1).forEach[builder |
			errors.addAll(base.merge(builder.model))
		]

		if (base === null) {
			errors.add(new BuilderError("Can't build " + source.name, source))
		}

		model = base
	}

	/*
	 * Add @merged into @base (-> both can be null)
	 */
	def List<BuilderError> merge(EPackage base, EPackage merged) {
		// TODO: Custom merge
		algebra.merge(merged, base)

		return newArrayList // TODO: manage merge errors
	}

	def List<OperatorBuilder<? extends Operator>> createBuilders(List<Operator> operators) {
		val res = newArrayList

		operators.forEach [ op |
			val builder = switch op {
				Inheritance: new InheritanceBuilder(op, root)
				Merge: new MergeBuilder(op, root)
				Slice: new SliceBuilder(op, root)
				Import: new ImportBuilder(op)
				Weave: new WeaveBuilder(op, this)
			}
			res.add(builder)
			injector.injectMembers(builder)
		]

		return res
	}

	def boolean isBuilding() {
		return isBuilding
	}

	def Language getSource() {
		return source
	}

	/**
	 * Search in builder for an EClass {@link simpleName}
	 */
	def EClass findClass(String simpleName) {
		for (builder : builders) {
			val pack = builder.model
			val candidate = pack?.allClasses.findFirst[name == simpleName]
			if(candidate !== null) return candidate
		}
		return null
	}

	def void debug() {
		println(source.name)
		builders.forEach [
			println("	" + it)
			it.model.allClasses.forEach [ cl |
				println("	" + cl.name)
				cl.EAllAttributes.forEach[println("		" + it.name + " : " + it.EType?.name)]
				cl.EAllReferences.forEach[println("		" + it.name + " : " + it.EType?.name)]
				cl.EAllOperations.forEach[println("		" + it.name + " : " + it.EType?.name)]
			]
		]
	}

	def WeaveBuilder findBuilder(Weave w) {
		return builders.filter(WeaveBuilder).findFirst[it.source === w]
	}
}
