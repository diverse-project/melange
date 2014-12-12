package fr.inria.diverse.melange.ui.outline

import fr.inria.diverse.melange.metamodel.melange.Transformation

import org.eclipse.emf.codegen.ecore.genmodel.GenModel

import org.eclipse.xtext.common.types.JvmTypeReference

import org.eclipse.xtext.ui.editor.outline.IOutlineNode

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider

class MelangeOutlineTreeProvider extends DefaultOutlineTreeProvider
{
	def boolean _isLeaf(Transformation t) {
		return true
	}

    def void _createNode(IOutlineNode parentNode, JvmTypeReference ref) {
		// Nope
    }

    def void _createNode(IOutlineNode parentNode, GenModel gm) {
		// Nope
    }
}
