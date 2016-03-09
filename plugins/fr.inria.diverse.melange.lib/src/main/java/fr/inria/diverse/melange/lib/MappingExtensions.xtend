package fr.inria.diverse.melange.lib

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Mapping
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EStructuralFeature

class MappingExtensions
{
	@Inject extension EcoreExtensions

	def boolean namesMatch(Mapping m, ENamedElement e1, ENamedElement e2) {
		return
			if (e1 === null || e2 === null)
				false
			else if (e1.uniqueId == e2.uniqueId)
				true
			else if (m !== null) {
				if (e1 instanceof EClass && e2 instanceof EClass)
					m.rules.exists[from == e1.name && to == e2.name]
				else if (e1 instanceof EStructuralFeature && e2 instanceof EStructuralFeature)
					m.rules.exists[r |
						r.from == (e1 as EStructuralFeature).EContainingClass.name
						&& r.to == (e2 as EStructuralFeature).EContainingClass.name
						&& r.properties.exists[p | p.from == e1.name && p.to == e2.name]
					]
				else false
			} else false
	}

	def EStructuralFeature findCorrespondingFeature(Mapping mapping, EClass cls, EStructuralFeature f) {
		val mappingCls = mapping?.rules?.filter[
			from == cls.name || cls.EAllSuperTypes.map[name].contains(from)
		]
		val mappingFeature = mappingCls?.map[properties]?.flatten?.findFirst[to == f.name]
		return cls.EAllStructuralFeatures.findFirst[name == mappingFeature?.from ?: f.name]
	}
}
