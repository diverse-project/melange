package fr.inria.diverse.melange.ui.scope

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.metamodel.melange.ClassBinding
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.PackageBinding
import fr.inria.diverse.melange.metamodel.melange.Slice
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider

class MelangeScopeProvider extends AbstractDeclarativeScopeProvider{

    @Inject extension ModelingElementExtensions
    @Inject XtextResourceSetProvider rsProvider
    @Inject IQualifiedNameProvider prov

    def dispatch IScope getScope(EObject context, EReference reference) {
        return super.getScope(context, reference)
    }

    def dispatch IScope getScope(Language language, EReference ref){
        if (ref.featureID == MelangePackage.LANGUAGE__OPERATORS) {
        	val owning = language.name
            val basic = super.getScope((language as EObject), ref).allElements
            val filtered = basic.filter[!it.name.toString.contains(owning)]
            val scope = new SimpleScope(IScope.NULLSCOPE, filtered)

            return scope
        }
        return super.getScope(language as EObject, ref)
    }

    def dispatch IScope getScope(Slice slice, EReference ref){
        if (ref.featureID == MelangePackage.SLICE__ROOTS) {
            val candidates = slice.slicedLanguage.syntax.pkgs
            					.map[EClassifiers]
            					.flatten
            val  scope = Scopes.scopeFor(candidates)

            return scope
        }
        else if (ref.featureID == MelangePackage.SLICE__MAPPING_RULES){
        	val candidates = slice.slicedLanguage.syntax.pkgs
        	val scope = Scopes.scopeFor(candidates)

        	return scope
        }
        return super.getScope(slice as EObject, ref)
    }

    def dispatch IScope getScope(Merge merge, EReference ref){
    	if(ref.featureID == MelangePackage.MERGE__MERGED_LANGUAGE) {
    		val owning = merge.owningLanguage
    		val basic = super.getScope((owning) as EObject, ref).allElements
    		val filtered = basic.filter[!it.name.toString.contains(owning.name)]
    		val scope = new SimpleScope(IScope.NULLSCOPE, filtered)
    		return scope
    	}
    	else if (ref.featureID == MelangePackage.MERGE__MAPPING_RULES) {
            val candidates = merge.mergedLanguage.syntax.pkgs
            val scope = Scopes.scopeFor(candidates)
            return  scope
        }
        return super.getScope(merge as EObject, ref)
    }

	def dispatch IScope getScope(Import imp, EReference ref){
		if (ref.featureID == MelangePackage.IMPORT__MAPPING_RULES) {
            val genmodelURI = imp.ecoreUri
			println("On dit ouiche lorraine ")

            return  super.getScope(imp as EObject, ref)
        }
        return super.getScope(imp as EObject, ref)
	}

    def dispatch IScope getScope(PackageBinding pkg, EReference ref) {
    	println("Ice is nice!")
    	if (ref.featureID == MelangePackage.PACKAGE_BINDING__FROM) {
    		println("It's already icy and over")
    		val candidates = newArrayList()
    		candidates.addAll(pkg.from.EClassifiers)
    		// I don't know how the melange error's detection work but this
    		// little trick is needed for now
//    		candidates.forEach[it.name = pkg.from.name+"."+it.name]
	       	val  scope = Scopes.scopeFor(candidates)
	       return scope
    	}
    	return super.getScope(pkg as EObject, ref)
    }

    def dispatch IScope getScope(ClassBinding clazz, EReference ref) {
    	println("PHILIPPE")
    	if (ref.featureID == MelangePackage.CLASS_BINDING__PROPERTIES) {
    		println("JE SAIS OU TU TE CACHES")
    		val candidates = newArrayList()
    		candidates.addAll(clazz.from.EStructuralFeatures)
    		//Same as above. You need to provide fully-qualified names
//    		candidates.forEach[it.name = clazz.from.name+"."+it.name]
			println(prov.getFullyQualifiedName(clazz.from))
    		val scope = Scopes.scopeFor(candidates)
    		return scope
    	}
    	return super.getScope(clazz as EObject, ref)
    }
}