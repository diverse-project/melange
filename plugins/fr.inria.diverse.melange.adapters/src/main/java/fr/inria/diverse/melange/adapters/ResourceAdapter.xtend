package fr.inria.diverse.melange.adapters

import org.eclipse.emf.common.util.AbstractTreeIterator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.BasicInternalEList
import org.eclipse.xtend.lib.annotations.Delegate

/**
 * Uses the appropriate {@link AdaptersFactory} to handle creation of
 * {@link EObject} from a {@link Resource} using the appropriate adapters.
 */
abstract class ResourceAdapter implements GenericAdapter<Resource>, Resource
{
	@Delegate protected Resource adaptee
	protected AdaptersFactory adaptersFactory

	new(AdaptersFactory factory) {
		adaptersFactory = factory
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
			ret += adaptersFactory.createAdapter(o) ?: o
		]

		return ret
	}

	override getAllContents() {
		return new AbstractTreeIterator<EObject>(this, false) {
			override getChildren(Object object) {
				return
					if (object == ResourceAdapter.this)
						ResourceAdapter.this.contents.iterator
					else
						(object as EObject).eContents.iterator
			}
		}
	}

	override getEObject(String uriFragment) {
		return adaptersFactory.createAdapter(adaptee.getEObject(uriFragment))
	}

	override toString() {
		return '''Adap<«class.name»>(«adaptee»)'''
	}
}
