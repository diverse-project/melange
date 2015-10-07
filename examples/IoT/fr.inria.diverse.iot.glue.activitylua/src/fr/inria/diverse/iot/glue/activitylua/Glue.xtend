package fr.inria.diverse.iot.glue.activitylua

import activitydiagram.OpaqueAction
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import org.xtext.activitydiagram.semantics.ActivityNodeAspect
import org.xtext.activitydiagram.semantics.Context
import org.xtext.lua.lua.Block
import org.xtext.lua.semantics.Environment

import static extension org.xtext.lua.semantics.BlockAspect.*

@Aspect(className = OpaqueAction)
class OpaqueActionAspect extends ActivityNodeAspect {
	@Containment
	public Block lua

	def void execute(Context c) {
		val env = new Environment
		env.putVariable("context", c)
		_self.lua.execute(env)
		_self.sendOffers(_self.takeOfferdTokens)
	}
}
