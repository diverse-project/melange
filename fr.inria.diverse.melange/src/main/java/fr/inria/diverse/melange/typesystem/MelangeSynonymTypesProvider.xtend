package fr.inria.diverse.melange.typesystem

import com.google.inject.Inject

import org.eclipse.xtext.xbase.typesystem.computation.SynonymTypesProvider

import org.eclipse.xtext.xbase.typesystem.conformance.ConformanceHint

import org.eclipse.xtext.xbase.typesystem.references.ITypeReferenceOwner
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference
import org.eclipse.xtext.xbase.typesystem.references.ParameterizedTypeReference
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Extends Xbase with modeltype-specific type synonyms
 * 
 * For any type mm referring to a concrete metamodel, with
 * its implemented types mt_0..mt_n:
 *     - announce a synonym from mm to mt_i
 * 
 * For any type mt subtype of mt':
 *     - announce a synonym from mt to mt'
 */
class MelangeSynonymTypesProvider extends SynonymTypesProvider
{
	@Inject extension IQualifiedNameProvider
	@Inject MelangeTypesRegistry typesRegistry

	override collectCustomSynonymTypes(LightweightTypeReference type, Acceptor acceptor) {
		typesRegistry.getImplementations(type.identifier).forEach[mt |
			announceModelType(type.owner, mt.fullyQualifiedName.toString, acceptor)
		]

		typesRegistry.getSubtypings(type.identifier).forEach[mt |
			announceModelType(type.owner, mt.fullyQualifiedName.toString, acceptor)
		]

		return super.collectCustomSynonymTypes(type, acceptor)
	}

	protected def boolean announceModelType(ITypeReferenceOwner owner, String targetName, Acceptor acceptor) {
		val synonym = owner.services.typeReferences.findDeclaredType(targetName, owner.contextResourceSet)

		return
			if (synonym !== null)
				announceSynonym(new ParameterizedTypeReference(owner, synonym), ConformanceHint.CHECKED, acceptor)
			else
				true
	}
}
