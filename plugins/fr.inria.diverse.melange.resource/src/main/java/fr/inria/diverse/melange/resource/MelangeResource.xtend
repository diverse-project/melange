package fr.inria.diverse.melange.resource

import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

/**
 * An EMF resource to load model of Melange Language and to cast
 * it to Melange ModelType
 */
interface MelangeResource extends Resource.Internal {

	/**
	 * Return the original Resource
	 */
	def Resource getWrappedResource()

	/**
	 * Return the Language ID currently used
	 */
	def String getLanguage()

	/**
	 * Return the ModelType ID currently used
	 */
	def String getModelType()

	/**
	 * Cast the Resource to a ModelType. <br>
	 * getContent() will return instances of EClass defined in {@link modelTypeID}
	 * 
	 * @param modelTypeID can be null to remove the adaptation
	 */
	def void upcast(String modelTypeID)

	/**
	 * Cast to a Language inheriting from the wrapped Resource's Language
	 * 
	 * @param languageID can be null to remove the adaptation
	 */
	def void extendAs(String languageID)

	/**
	 * Returns the mapping from the wrapped resource elements to the melange resource elements.
	 */
	def Map<EObject, EObject> getModelsMapping()

}
