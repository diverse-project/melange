/**
 */
package fr.inria.diverse.iot2.iot2.iot2.util;

import fr.inria.diverse.iot2.iot2.iot2.Iot2Package;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Iot2XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iot2XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Iot2Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Iot2ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Iot2ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Iot2ResourceFactoryImpl());
		}
		return registrations;
	}

} //Iot2XMLProcessor
