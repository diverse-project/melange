package fr.inria.diverse.k3.sle.ui.labeling

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace

import org.eclipse.xtext.common.types.JvmDeclaredType

class K3SLELabelProvider extends org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider
{
	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate)
	}

	def image(ModelTypingSpace root) {
		"k3.png"
	}

	def image(Metamodel mm) {
		"metamodel.png"
	}

	def image(ModelType mt) {
		"modeltype.png"
	}

	def image(Transformation t) {
		"transformation.png"
	}

	def text(AspectImport asp) {
		if (asp.aspectRef.type instanceof JvmDeclaredType) {
			'''«asp.aspectRef.type.simpleName»@«asp.aspectedClass?.name ?: "Unbinded target"»'''.toString
		} else "Unbinded aspect"
	}

	def image(AspectImport asp) {
		"aspect.png"
	}
}
