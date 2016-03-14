package fr.inria.diverse.melange.builder

import com.google.common.collect.HashBasedTable
import com.google.inject.Inject
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.PackageBinding
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcoreFactory

/**
 * Utilities related to renaming facilities associated to {@link Operator}s.
 */
class RenamerHelper {
	@Inject extension EcoreExtensions

	/**
	 * Apply the renaming rules of {@code mappingRules} to the {@link EPackage}s,
	 * {@link EClassifier}s and {@link EStructuralFeature}s of {@code modelRoot}.
	 */
	def void applyRenaming(EPackage modelRoot, List<PackageBinding> mappingRules) {
		if (mappingRules.empty)
			return;

		mappingRules.forEach[packageRule |
			val sourcePkg =
				if(modelRoot.name == packageRule.from)
					modelRoot
				else
					modelRoot.findSubPackage(packageRule.from
						.substring(packageRule.from.indexOf(".") + 1))

			packageRule.classes.forEach[classRule |
				sourcePkg.EClassifiers
				.filter(EClass)
				.filter[name == classRule.from]
				.forEach[cls |
					// Change name for properties
					classRule.properties.forEach[propertyRule |
						val EStructuralFeature target =
							cls.EReferences.findFirst[name == propertyRule.from]
							?: cls.EAttributes.findFirst[name == propertyRule.from]

						if(target !== null)
							target.name = propertyRule.to
					]

					cls.name = classRule.to
				]
			]
		]

		// Build new package hierarchy
		val oldRootName = modelRoot.name
		val renamedPackages = newHashSet
		val targetedPackages = newHashSet

		mappingRules.forEach[packageRule |
			val oldPackages = packageRule.from.split("\\.")
			val newPackages = packageRule.to.split("\\.")

			// Register source packages
			var current = modelRoot
			for (var int i = 1; i < oldPackages.size; i++) {
				val packName = oldPackages.get(i)
				current = current.ESubpackages.findFirst[name == packName]
			}
			renamedPackages.add(current)

			// Register targeted packages & create new packages
			current = modelRoot
			targetedPackages.add(current)
			for (var int i = 1; i < newPackages.size; i++) {
				val packName = newPackages.get(i)
				var nextCurrent = current.ESubpackages.findFirst[name == packName]
				if (nextCurrent === null) {
					nextCurrent = EcoreFactory.eINSTANCE.createEPackage
					nextCurrent.name = packName
					nextCurrent.nsPrefix = packName
					nextCurrent.nsURI = current.nsURI + packName + "/"
					current.ESubpackages.add(nextCurrent)
				}
				current = nextCurrent
				targetedPackages.add(current)
			}

			if (newPackages.head != modelRoot.name)
				modelRoot.name = newPackages.head
		]

		// Register classes to be moved
		val movedClasses = HashBasedTable.create
		val movedPackages = HashBasedTable.create
		mappingRules.forEach[packageRule |
			val sourcePkg =
				if(oldRootName == packageRule.from)
					modelRoot
				else
					modelRoot.findSubPackage(packageRule.from
						.substring(packageRule.from.indexOf(".") + 1))

			val targetPack =
				if(modelRoot.name == packageRule.to)
					modelRoot
				else
					modelRoot.findSubPackage(packageRule.to
						.substring(packageRule.to.indexOf(".") + 1))

			if (sourcePkg != targetPack) {
				val classes = newArrayList
				movedClasses.put(sourcePkg, targetPack, classes)

				val subPackages = newArrayList
				subPackages.removeAll(targetedPackages)
				subPackages.removeAll(renamedPackages)
				movedPackages.put(sourcePkg, targetPack, subPackages)
			}
		]

		// Move classes
		movedClasses.cellSet.forEach[cell |
			val sourcePkg = cell.rowKey
			val targetPack = cell.columnKey
			val classes = cell.value
			targetPack.EClassifiers.addAll(classes)
			sourcePkg.EClassifiers.remove(classes)

		]

		// Move subpackages
		movedPackages.cellSet.forEach[cell |
			val sourcePkg = cell.rowKey
			val targetPack = cell.columnKey
			val subPackages = cell.value
			targetPack.ESubpackages.addAll(subPackages)
			sourcePkg.ESubpackages.remove(subPackages)

			// Delete renamed packages
			if (!targetedPackages.contains(sourcePkg))
				sourcePkg.ESuperPackage.ESubpackages.remove(sourcePkg)
		]
	}
}
