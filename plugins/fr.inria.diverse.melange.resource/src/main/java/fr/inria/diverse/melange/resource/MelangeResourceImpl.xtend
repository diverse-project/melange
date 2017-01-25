package fr.inria.diverse.melange.resource

import fr.inria.diverse.melange.adapters.EObjectAdapter
import fr.inria.diverse.melange.resource.loader.DozerLoader
import org.eclipse.emf.common.util.AbstractTreeIterator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtend.lib.annotations.Delegate
import fr.inria.diverse.melange.resource.MelangeRegistry.LanguageDescriptor
import org.eclipse.emf.common.notify.Notification
import fr.inria.diverse.melange.resource.loader.ModelCopier
import org.eclipse.emf.common.notify.impl.AdapterImpl
import fr.inria.diverse.melange.adapters.ResourceAdapter
import org.eclipse.core.runtime.Platform
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Language
import java.util.Set
import java.util.HashSet

/**
 * This class wraps a resource and shift the types of the contained
 * EObjects to get instances of a ModelType's classes
 */
class MelangeResourceImpl implements MelangeResource
{
	@Delegate Resource.Internal wrappedResource
	String expectedMt
	String expectedLang
	URI melangeUri
	Resource contentResource
	
	new(URI uri) {
		// FIXME: Retrieve the currently-used one
		val rs = new ResourceSetImpl
		val query = uri.query
		val SEPARATOR = "&|;"
		val pairs = query?.split(SEPARATOR)
		
		expectedMt = pairs?.findFirst[startsWith("mt=")]?.substring(3)
		expectedLang = pairs?.findFirst[startsWith("lang=")]?.substring(5)

		melangeUri = uri
		wrappedResource = rs.getResource(MelangeResourceUtils.melangeToFallbackURI(uri), true) as Resource.Internal
	}

	override Resource getWrappedResource() {
		return wrappedResource
	}

	/**
	 * Return the content of the wrapped resource.
	 * If expectedMt and/or expectedLang are set, the EObjects are contained in an internal resource.
	 */
	override getContents() throws RuntimeException {
		if(contentResource === null)
			doAdapt()
		return contentResource.contents
	}

	override getAllContents() {
		return
			new AbstractTreeIterator<EObject>(this, false) {
				override getChildren(Object object) {
					return
						if (object instanceof Resource)
							object.contents.iterator
						else if (object instanceof EObject)
							object.eContents.iterator
				}
			}
	}

	override getEObject(String uriFragment) {
		return contentResource.getEObject(uriFragment)
	}

	override getURIFragment(EObject o) {
		return
			if (o instanceof EObjectAdapter<?>)
				wrappedResource.getURIFragment(o.adaptee)
			else null
	}

	override getURI() {
		return melangeUri
	}
	
	/**
	 * Return a ResourceAdapter exposing {@link modelType} interfaces and
	 * delegating to {@link adaptedResource} 
	 */
	private def Resource adaptResourceToMT(Resource adaptedResource, String modelType){
		val actualLanguage = adaptedResource.language
		
		val adapterCls = actualLanguage.getAdapterFor(modelType)
		if (adapterCls !== null) {
			try {
				return adapterCls.newInstance => [
					adaptee = adaptedResource
					parent = this
					URI = org.eclipse.emf.common.util.URI.createURI("modelAsAdapted")
					
					// Emf Adapters on the ResourceAdapter can catch
					// Notifications from the adaptee 
					val proxyAdapter = new AdapterImpl(){
						public Resource notifiedRes
						override notifyChanged(Notification msg) {
							notifiedRes?.eAdapters?.forEach[notifyChanged(msg)]
						}
					}
					proxyAdapter.notifiedRes = this
					adaptee.eAdapters.add(proxyAdapter);
				]
			} catch (InstantiationException e) {
				throw new MelangeResourceException('''Cannot instantiate adapter type «adapterCls»''', e)
			} catch (IllegalAccessException e) {
				throw new MelangeResourceException('''Cannot access adapter type «adapterCls»''', e)
			}
		}

		throw new MelangeResourceException('''No adapter class registered for <«actualLanguage.identifier», «modelType»>''')
	}
	
	/**
	 * Return a resource in the namespace of {@link language}
	 */
	private def Resource adaptResourceToLang(Resource adaptedResource, String language){
		val actualLanguage = adaptedResource.language
		val expectedLanguage = MelangeRegistry.INSTANCE.getLanguageByIdentifier(language)

		if (expectedLanguage === null)
			throw new MelangeResourceException("Cannot find a registered language with URI " + language)

		val actualMt = MelangeRegistry.INSTANCE.getModelTypeByIdentifier(actualLanguage.exactType)
		val expectedMt = MelangeRegistry.INSTANCE.getModelTypeByIdentifier(expectedLanguage.exactType)

		if (actualMt.identifier == expectedMt.identifier) {
			val xmofURI = getXmofURI(language)
			if(xmofURI !== null){
				val actualPkg = EPackage.Registry.INSTANCE.getEPackage(actualLanguage.uri)
				val expectedPkg = loadXmofMM(xmofURI)
				
				val copier = new ModelCopier(#[actualPkg].toSet,expectedPkg,true)
				return copier.clone(adaptedResource)
			}
			else{
				// Nothing to do
				return adaptedResource
			}
		}
		else if (actualMt.superTypes.contains(expectedMt.identifier)) {
			// Upcast
			return adaptedResource
		}
		else if (expectedMt.superTypes.contains(actualMt.identifier)) {
			// Downcast
			val xmofURI = getXmofURI(language)
			val actualPkg = EPackage.Registry.INSTANCE.getEPackage(actualLanguage.uri)
			val expectedPkg =
				if(xmofURI !== null)
					loadXmofMM(xmofURI)
				else
					#[EPackage.Registry.INSTANCE.getEPackage(expectedLanguage.uri)].toSet
			
			val copier = new ModelCopier(#[actualPkg].toSet,expectedPkg, xmofURI!==null)
			return copier.clone(adaptedResource)
		}
		else
			// No typing hierarchy found
			throw new MelangeResourceException('''«actualMt.identifier» cannot be transtyped to «expectedMt.identifier»''')
	}
	
	private def Set<EPackage> loadXmofMM(String targetXmofURI) {
		val expectedPkg = new HashSet<EPackage>()
		val uri = org.eclipse.emf.common.util.URI.createURI(targetXmofURI.replaceFirst("platform:/resource","platform:/plugin"), true)
		val xmofRes = (new ResourceSetImpl).getResource(uri, true)
		val expectedPkgCandidate = xmofRes.contents.filter(EPackage).toSet
		expectedPkgCandidate.forEach[pkg |
			val p = EPackage.Registry.INSTANCE.getEPackage(pkg.nsURI)
			if(p === null){
				EPackage.Registry.INSTANCE.put(pkg.nsURI,pkg)
				expectedPkg.add(pkg)
			}
			else
				expectedPkg.add(p)
		]
		return expectedPkg
	}
	
	private def LanguageDescriptor getLanguage(Resource resource){
		val objs = resource.getContents()

		val actualPkgUri = objs.head.eClass.EPackage.nsURI
		val actualLanguage = MelangeRegistry.INSTANCE.getLanguageByUri(actualPkgUri)

		if (actualLanguage === null)
			throw new MelangeResourceException("Cannot find a registered language with URI " + actualPkgUri)
			
		return actualLanguage
	}
	
	/**
	 * Return the xmofURI of {@link languageID} or null if we can't 
	 * find a Melange file declaring a Language named {@link languageID}
	 * with an xmofURI
	 */
	private def String getXmofURI(String languageID) {
		val language = Platform.extensionRegistry
			.getConfigurationElementsFor("fr.inria.diverse.melange.language")
			.findFirst[c|
				c.getAttribute("id") == languageID
			]
			
		if(language !== null){
			val melangeBundle = Platform.getBundle(language.contributor.name)
			val urls = melangeBundle.findEntries("/","*.melange",true)
			if(urls.hasMoreElements){
				val melangeFilePath = urls.nextElement.file
				urls.nextElement.file
				val rs = new ResourceSetImpl
				val uri = org.eclipse.emf.common.util.URI.createURI("platform:/plugin/"+language.contributor.name+"/"+melangeFilePath)  
				val res = rs.getResource(uri, true) as Resource.Internal
				val root = res.contents.head as ModelTypingSpace
				val lang = root.elements.filter(Language).findFirst[languageID.endsWith("."+name)]
				
				if(lang !== null)
					return lang.xmof
			}
		}
		
		return null
	}

	/**
	 * Create a ResourceAdapter for expectedMt or/and copy the wrapped resource for expectedLang
	 */
	private def void doAdapt() {
		contentResource = wrappedResource
		
		if (!wrappedResource.getContents().empty && !(expectedMt == null && expectedLang == null)) {
		
			// 1 - Convert Language to Language
			if (expectedLang !== null) {
				contentResource = contentResource.adaptResourceToLang(expectedLang)
			}
				
			// 2 - Adapt Language to ModelType
			if (expectedMt !== null) {
				contentResource = contentResource.adaptResourceToMT(expectedMt)
			}
		
		}
		
		this.resourceSet.resources.add(contentResource)
	}

	override void upcast(String modelTypeID) {
		expectedMt = modelTypeID
		doAdapt()
	}

	override void extendAs(String languageID) {
		expectedLang = languageID
		doAdapt()
	}

	override String getModelType() {
		return expectedMt
	}

	override String getLanguage() {
		return expectedLang
	}
	
	override eAdapters() {
		if(contentResource === null)
			doAdapt()
			
		return contentResource.eAdapters
	}
	
	override eNotify(Notification notification) {
		if(contentResource === null)
			doAdapt()
			
		contentResource.eNotify(notification)
	}
}
