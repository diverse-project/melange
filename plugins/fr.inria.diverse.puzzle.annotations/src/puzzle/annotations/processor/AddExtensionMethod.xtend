package puzzle.annotations.processor

import org.eclipse.xtend.lib.macro.AbstractMethodProcessor
import org.eclipse.xtend.lib.macro.Active

@Active(AddExtensionMethodProcessor)
annotation AddExtensionMethod {}

class AddExtensionMethodProcessor extends AbstractMethodProcessor {}