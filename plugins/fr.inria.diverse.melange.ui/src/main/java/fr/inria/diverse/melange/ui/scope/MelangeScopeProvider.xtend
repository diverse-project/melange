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
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

class MelangeScopeProvider extends AbstractDeclarativeScopeProvider{

    @Inject extension ModelingElementExtensions

    def dispatch IScope getScope(Language language, EReference ref){
        if (ref.featureID == MelangePackage.LANGUAGE__OPERATORS) {
        	val owning = language.name
            val basic = super.getScope(language, ref).allElements
            val filtered = basic.filter[!it.name.toString.contains(owning)]
			val eobjList = newArrayList()
            filtered.forEach[eobjList.add(it.EObjectOrProxy)]

            return Scopes::scopeFor(eobjList)
        }
        return super.getScope(language, ref)
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

			return Scopes.scopeFor(candidates)
        }
        return super.getScope(slice, ref)
    }

    def dispatch IScope getScope(Merge merge, EReference ref){
    	if(ref.featureID == MelangePackage.MERGE__MERGED_LANGUAGE) {
    		val owning = merge.owningLanguage
			val basic = super.getScope(owning, ref).allElements
    		val filtered = basic.filter[!it.name.toString.contains(owning.name)]
			val eobjList = newArrayList()
            filtered.forEach[eobjList.add(it.EObjectOrProxy)]

            return Scopes::scopeFor(eobjList)
    	}
    	else if (ref.featureID == MelangePackage.MERGE__MAPPING_RULES) {
            val candidates = merge.mergedLanguage.syntax.pkgs

            return  Scopes::scopeFor(candidates)
        }
        return super.getScope(merge, ref)
    }

	def dispatch IScope getScope(Import imp, EReference ref){
		if (ref.featureID == MelangePackage.IMPORT__MAPPING_RULES) {

			//FIXME: "complete it later using some cache mechanism."

            return  super.getScope(imp as EObject, ref)
        }
        return super.getScope(imp, ref)
	}

    def dispatch IScope getScope(PackageBinding pkg, EReference ref) {
    	if (ref.featureID == MelangePackage.PACKAGE_BINDING__FROM) {
    		val candidates = newArrayList()
    		candidates.addAll(pkg.from.EClassifiers)

	       return Scopes::scopeFor(candidates)
    	}
    	return super.getScope(pkg, ref)
    }

    def dispatch IScope getScope(ClassBinding clazz, EReference ref) {
    	if (ref.featureID == MelangePackage.CLASS_BINDING__PROPERTIES) {
    		val candidates = newArrayList()
    		if (clazz.from instanceof EClass) {
    			candidates.addAll((clazz.from as EClass).EStructuralFeatures)
    		}
			val scope = Scopes::scopeFor(candidates)

    		return scope
    	}
    	return super.getScope(clazz, ref)
    }
}