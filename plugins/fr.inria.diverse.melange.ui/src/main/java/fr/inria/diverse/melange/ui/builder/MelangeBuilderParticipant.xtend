package fr.inria.diverse.melange.ui.builder

import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import org.apache.log4j.Logger
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.xtext.builder.IXtextBuilderParticipant

class MelangeBuilderParticipant implements IXtextBuilderParticipant
{
	private static final Logger log = Logger.getLogger(MelangeBuilderParticipant)

	override build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
//		log.debug('''MelangeBuild «context.builtProject.name» [«context.buildType»]«»''')
//
//		context.deltas.forEach[delta |
//			if (delta.uri.fileExtension == "melange") {
//				val res = context.resourceSet.resources.findFirst[URI == delta.uri]
//				val space = res.contents.head as ModelTypingSpace
//				
//				space.elements.filter(Metamodel).forEach[
//					// Generating runtime project, interface, etc.
//				]
//			}
//		]
	}
}
