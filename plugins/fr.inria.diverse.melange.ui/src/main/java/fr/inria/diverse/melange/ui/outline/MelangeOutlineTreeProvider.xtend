package fr.inria.diverse.melange.ui.outline

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelingElement
import fr.inria.diverse.melange.metamodel.melange.Transformation
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider

class MelangeOutlineTreeProvider extends DefaultOutlineTreeProvider
{
	@Inject extension ModelingElementExtensions

	def boolean _isLeaf(Transformation t) {
		return true
	}

    def void _createNode(IOutlineNode parentNode, JvmTypeReference ref) {
		// Nope
    }

    def void _createNode(IOutlineNode parentNode, GenModel gm) {
		// Nope
    }

	def void _createNode(IOutlineNode parentNode, ModelingElement m) {
		val mNode = createEObjectNode(parentNode, m)

		if (m instanceof Language) {
			m.semantics.aspects.forEach[asp |
				createEObjectNode(mNode, asp, imageDispatcher.invoke(asp), textDispatcher.invoke(asp),
					isLeafDispatcher.invoke(asp))
			]
		}

		m.pkgs.forEach[pkg |
			val pkgNode = createEObjectNode(mNode, pkg, imageDispatcher.invoke(pkg), textDispatcher.invoke(pkg),
				isLeafDispatcher.invoke(pkg))

			pkg.EClassifiers.forEach[cls |
				createEObjectNode(pkgNode, cls, imageDispatcher.invoke(cls), textDispatcher.invoke(cls),
					isLeafDispatcher.invoke(cls))
			]
		]
	}
}
