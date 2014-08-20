package fr.inria.diverse.k3.sle.ui.outline

import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation
import org.eclipse.xtext.common.types.JvmTypeReference
import fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.emf.codegen.ecore.genmodel.GenModel

class K3SLEOutlineTreeProvider extends org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
{
	def _isLeaf(Transformation t) {
		true
	}

    def _createNode(IOutlineNode parentNode, EcoreImport imp) {
		// Nope
    }

    def _createNode(IOutlineNode parentNode, JvmTypeReference ref) {
		// Nope
    }

    def _createNode(IOutlineNode parentNode, GenModel gm) {
		// Nope
    }
}
