package fr.inria.diverse.melange.adapters

/**
 * Common interface for all adapters (either for objects or lists).
 * Simply allow to dynamically set/get the generic adaptee object.
 */
interface GenericAdapter<E>
{
	def E getAdaptee()
	def void setAdaptee(E a)
}
