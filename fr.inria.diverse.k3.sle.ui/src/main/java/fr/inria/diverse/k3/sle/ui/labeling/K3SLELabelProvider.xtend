package fr.inria.diverse.k3.sle.ui.labeling

import com.google.inject.Inject
import fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport
import org.eclipse.xtext.common.types.JvmDeclaredType

/**
 * Provides labels for a EObjects.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class K3SLELabelProvider extends org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider
{
	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate)
	}

	def text(AspectImport asp) {
		if (asp.aspectRef instanceof JvmDeclaredType) {
			asp.aspectRef.simpleName + " -> " + asp.aspectedClass.name ?: "Unknown target"
		} else "Unknown aspect"
	}

	def image(AspectImport asp) {
		"aspect.png"
	}
}
