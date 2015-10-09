package fr.inria.diverse.melange.adapters

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.common.util.EList
import java.lang.reflect.InvocationTargetException
import org.eclipse.emf.common.notify.Notification

abstract class MockAdapter<E> implements EObject, GenericAdapter<E>{
	
	protected E adaptee

	override getAdaptee() { return adaptee }
	override setAdaptee(E a) { adaptee = a }
	
	override eAllContents() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eClass() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eContainer() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eContainingFeature() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eContainmentFeature() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eContents() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eCrossReferences() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eGet(EStructuralFeature feature) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eGet(EStructuralFeature feature, boolean resolve) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eIsProxy() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eIsSet(EStructuralFeature feature) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eResource() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eSet(EStructuralFeature feature, Object newValue) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eUnset(EStructuralFeature feature) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eAdapters() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eDeliver() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eNotify(Notification notification) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eSetDeliver(boolean deliver) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}