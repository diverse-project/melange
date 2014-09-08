package fr.inria.diverse.k3.sle.ast

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import fr.inria.diverse.k3.sle.metamodel.k3sle.XbaseTransformation

import org.eclipse.xtext.common.types.JvmDeclaredType

class ASTValidator
{
	@Inject extension ASTHelper

	def dispatch boolean isValid(ModelTypingSpace root) {
		return
			   !root.name.empty
			&& !root.metamodels.exists[mm | root.metamodels.exists[mm_ | mm != mm_ && mm.name == mm_.name]]
			&& !root.modelTypes.exists[mt | root.modelTypes.exists[mt_ | mt != mt_ && mt.name == mt_.name]]
			&& !root.transformations.exists[t | root.transformations.exists[t_ | t != t_ && t.name == t_.name]]
			&& root.elements.forall[isValid]
	}

	def dispatch boolean isValid(Metamodel mm) {
		return
			   mm !== null
			&& !mm.name.empty
			&& (mm.inheritanceRelation !== null || mm.ecoreUri !== null)
			&& mm.aspects.forall[it !== null && aspectTypeRef?.type instanceof JvmDeclaredType && aspectedClass !== null]
			&& !mm.exactTypeName.empty
			&& mm.exactType !== null
			&& mm.^implements.forall[it !== null]
			&& mm.genmodels.forall[it !== null]
			&& mm.pkgs.forall[it !== null]
	}

	def dispatch boolean isValid(ModelType mt) {
		return
			   mt !== null
			&& !mt.name.empty
			&& (mt.ecoreUri !== null
				|| mt.extracted !== null)
			&& mt.subtypingRelations.forall[it !== null]
			&& mt.pkgs.forall[it !== null]
	}

	def dispatch boolean isValid(XbaseTransformation t) {
		return
			   t !== null
			&& !t.name.empty
			&& t.parameters.forall[it !== null]
			&& t.body !== null
	}

//	def dispatch boolean isValid(KomprenSlicer t) {
//		// TODO: Slicer validation
//		return true
//	}
}
