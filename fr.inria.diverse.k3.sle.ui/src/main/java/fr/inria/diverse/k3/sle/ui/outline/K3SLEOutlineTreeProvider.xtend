package fr.inria.diverse.k3.sle.ui.outline

import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

import org.eclipse.emf.codegen.ecore.genmodel.GenModel

import org.eclipse.xtext.common.types.JvmTypeReference

import org.eclipse.xtext.ui.editor.outline.IOutlineNode

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider

class K3SLEOutlineTreeProvider extends DefaultOutlineTreeProvider
{
	def _isLeaf(Transformation t) {
		true
	}

    def _createNode(IOutlineNode parentNode, JvmTypeReference ref) {
		// Nope
    }

    def _createNode(IOutlineNode parentNode, GenModel gm) {
		// Nope
    }
}
