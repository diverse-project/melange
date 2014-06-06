package fr.inria.diverse.k3.sle.ui.outline

import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

class K3SLEOutlineTreeProvider extends org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
{
	def _isLeaf(Transformation t) {
		true
	}
}
