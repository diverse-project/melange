/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import com.google.inject.Injector
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.lib.EcoreMerger
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Operator
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.metamodel.melange.Weave
import fr.inria.diverse.melange.utils.ErrorHelper
import java.util.List
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.Set
import fr.inria.diverse.melange.lib.EcoreExtensions
import org.eclipse.emf.ecore.EClass

/**
 * General builder for a {@link Language}.
 */
class LanguageBuilder extends AbstractBuilder {
	@Inject ErrorHelper errorHelper
	@Inject Injector injector
	@Inject extension AspectExtensions
	@Inject extension LanguageExtensions
	@Inject extension EcoreExtensions
	@Inject EcoreMerger ecoreMerger
	/**
	 * The {@link ModelTypingSpaceBuilder} that builds the {@link ModelTypingSpace}
	 * to which the {@link Language} belongs.
	 */
	ModelTypingSpaceBuilder root
	/**
	 * The {@link Language} being built by this builder.
	 */
	Language source
	/**
	 * Whether the language is currently being processed or not.
	 */
	boolean isBuilding = false
	/**
	 * The list of all {@link OperatorBuilder} being used to build this
	 * {@link Language}.
	 */
	List<OperatorBuilder<? extends Operator>> builders

	new(Language l, ModelTypingSpaceBuilder root) {
		super()
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
		
		if(source.isGeneratedByMelange)
			model.forEach[nsURI = source.externalPackageUri+name+"/"]
		
		bindOppositeReferences
	}

	override make() {
		if (source.operators.empty)
			return;

		/*
		 * Aspect operators are built at the end since we need to retrieve the aspected
		 * EClass to infer the ecore fragment 
		 */
		val otherOperators = source.operators.filter[!(it instanceof Weave)].toList
		val aspectOperators =
			source.operators
			.filter(Weave)
			.filter[aspectWildcardImport === null]
			.sortWith[wA, wB |
				if (wA.aspectTypeRef?.aspectAnnotationValue !== null) 1 else -1
			]
			.map[it as Operator]
			.toList

		builders = newArrayList
		builders.addAll(createBuilders(otherOperators))
		builders.forEach[builder |
			builder.build()
			errors.addAll(builder.errors)
		]

		model = EcoreUtil::copyAll(builders.head.model).toSet
		builders.drop(1).forEach[builder |
			errors.addAll(model.merge(builder.model, builder.source))
		]

		val weaveBuilders = createBuilders(aspectOperators)
		weaveBuilders.forEach[builder |
			builder.build()
			errors.addAll(builder.errors)
			errors.addAll(model.merge(builder.model, builder.source))
		]
		builders.addAll(weaveBuilders)

		if (model === null || model.isEmpty) {
			errors.add(new BuilderError("Can't build " + source.name, source))
		}
	}

	/**
	 * Merges the {@link EPackage}s {@code merged} into the {@link EPackage}s
	 * {@code base}. Conflicts that may arise during the merge are returned as
	 * {@link BuilderError}s.
	 * 
	 * @see EcoreMerger#merge 
	 */
	def List<BuilderError> merge(Set<EPackage> base, Set<EPackage> merged, Operator context) {
		if(merged !== null)
			ecoreMerger.merge(base, merged)

		return ecoreMerger.conflicts.map[
			new BuilderError(it.toString, context)
		]
	}

	/**
	 * Returns the list of {@link OperatorBuilder} used to build the different
	 * {@link Operator} of {@code operators}.
	 */
	def List<OperatorBuilder<? extends Operator>> createBuilders(List<Operator> operators) {
		val res = newArrayList

		operators.forEach [ op |
			val builder = switch op {
				Inheritance: new InheritanceBuilder(op, root)
				Merge: new MergeBuilder(op, root)
				Slice: new SliceBuilder(op, root)
				Import: new ImportBuilder(op)
				Weave: new WeaveBuilder(op, model)
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

	def WeaveBuilder findBuilder(Weave w) {
		return builders.filter(WeaveBuilder).findFirst[it.source === w]
	}
	
	/**
	 * Return the list of Operators' builder
	 */
	def List<OperatorBuilder<? extends Operator>> getSubBuilders(){
		return builders
	}
	
	private def bindOppositeReferences() {
		val allClasses = model.map[allClasses]
			.flatten
			.toSet
		
		val allOpposites = allClasses
			.map[EAllReferences]
			.flatten
			.filter[EAnnotations.exists[it.source == "opposite"]]
			
		allOpposites.forEach[ref |
			val annot = ref.EAnnotations.findFirst[it.source == "opposite"]
			val opRefName = annot.details.get("value")
			if(ref.EType instanceof EClass){
				val opRef = (ref.EType as EClass).EAllReferences.findFirst[name == opRefName]
				//TODO: should check opRef is tagged @Opposite
				if(opRef !== null && opRef.EOpposite === null){
					ref.EOpposite = opRef
					opRef.EOpposite = ref
				}
			}
			ref.EAnnotations.remove(annot)
		]
	}
}
