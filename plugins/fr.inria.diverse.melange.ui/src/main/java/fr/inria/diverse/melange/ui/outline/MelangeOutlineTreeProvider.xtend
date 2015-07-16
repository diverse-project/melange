package fr.inria.diverse.melange.ui.outline

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
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

	def void _createNode(IOutlineNode parentNode, Metamodel mm) {
		// Nope
	}

	def void _createNode(IOutlineNode parentNode, ModelType mt) {
		val mNode = createEObjectNode(parentNode, mt)

		mt.pkgs.forEach[pkg |
			val pkgNode = createEObjectNode(mNode, pkg, imageDispatcher.invoke(pkg), textDispatcher.invoke(pkg),
				isLeafDispatcher.invoke(pkg))

			pkg.EClassifiers.forEach[cls |
				createEObjectNode(pkgNode, cls, imageDispatcher.invoke(cls), textDispatcher.invoke(cls),
					isLeafDispatcher.invoke(cls))
			]
		]
	}

	def void _createNode(IOutlineNode parentNode, Language l) {
		val mNode = createEObjectNode(parentNode, l)

		l.syntax.pkgs.forEach[pkg |
			val pkgNode = createEObjectNode(mNode, pkg, imageDispatcher.invoke(pkg), textDispatcher.invoke(pkg),
				isLeafDispatcher.invoke(pkg))

			pkg.EClassifiers.forEach[cls |
				createEObjectNode(pkgNode, cls, imageDispatcher.invoke(cls), textDispatcher.invoke(cls),
					isLeafDispatcher.invoke(cls))
			]
		]

		l.semantics.aspects.forEach[asp |
			createEObjectNode(mNode, asp, imageDispatcher.invoke(asp), textDispatcher.invoke(asp),
				isLeafDispatcher.invoke(asp))
		]
	}
}
