package fr.inria.diverse.melange.adapters

import org.eclipse.emf.common.util.AbstractTreeIterator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.emf.ecore.util.BasicInternalEList

/**
 * Uses the appropriate {@link AdaptersFactory} to handle creation of
 * {@link EObject} from a {@link Resource} using the appropriate adapters.
 */
abstract class ResourceAdapter extends ResourceImpl implements GenericAdapter<Resource>, Resource
{
	protected Resource adaptee
	protected Resource parent
	protected AdaptersFactory adaptersFactory

	new(AdaptersFactory factory) {
		adaptersFactory = factory
		parent = parent
	}

	def void setParent(Resource p) {
		parent = p
	}

	override getAdaptee() {
		return adaptee
	}

	override setAdaptee(Resource a) {
		adaptee = a
	}

	override getContents() {
		val ret = new BasicInternalEList<EObject>(EObject) ;

		adaptee.contents.forEach[o |
			ret += adaptersFactory.createAdapter(o, parent) ?: o
		]

		return ret
	}

	override getAllContents() {
		return new AbstractTreeIterator<EObject>(this, false) {
			override getChildren(Object object) {
				return
					if (object == ResourceAdapter.this)
						ResourceAdapter.this.getContents.iterator
					else
						(object as EObject).eContents.iterator
			}
		}
	}

	override getEObject(String uriFragment) {
		return adaptersFactory.createAdapter(adaptee.getEObject(uriFragment), parent)
	}

	override toString() {
		return '''Adap<«class.name»>(«adaptee»)'''
	}
}
