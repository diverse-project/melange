package fr.inria.diverse.melange.ui.labeling

import com.google.inject.Inject

import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.Transformation
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

import org.eclipse.xtext.common.types.JvmDeclaredType

class MelangeLabelProvider extends org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider
{
	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate)
	}

	def String image(ModelTypingSpace root) {
		return"melange.png"
	}

	def String image(Metamodel mm) {
		return "metamodel.png"
	}

	def String image(ModelType mt) {
		return "modeltype.png"
	}

	def String image(Transformation t) {
		return "transformation.png"
	}

	def String text(Aspect asp) {
		return
			if (asp.aspectTypeRef.type instanceof JvmDeclaredType) {
				'''«asp.aspectTypeRef.type.simpleName» @ «asp.aspectedClass?.name ?: "Unbinded target"»'''.toString
			} else "Unbinded aspect"
	}

	def String image(Aspect asp) {
		return "aspect.png"
	}

	def String text(ModelType mt) {
		return '''«mt.name»«FOR t : mt.subtypingRelations BEFORE ' \u25C1 ' SEPARATOR ', '»«t.superType.name»«ENDFOR»'''.toString
	}

	def String text(Metamodel mm) {
		return '''«mm.name»«FOR t : mm.inheritanceRelation BEFORE '\u25C0' SEPARATOR ', '»«t.superMetamodel.name»«ENDFOR»«FOR t : mm.implements BEFORE ' \u25C1 ' SEPARATOR ', '»«t.name»«ENDFOR»'''.toString
	}
}
