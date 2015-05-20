package core.semantics.impl

import fr.inria.triskell.k3.Aspect

import FSMCore.StateMachine
import FSMCore.Vertex

import java.util.LinkedList
import java.util.ArrayList
import FSMCore.InitialState
import FSMCore.Transition
import java.io.InputStreamReader
import java.io.BufferedReader
import org.eclipse.emf.common.util.EList

import static extension core.semantics.impl.TransitionAspect.*
import static extension core.semantics.impl.InitialStateAspect.*
import static extension core.semantics.impl.StateMachineAspect.*

class StateMachineAspect {

	def public void _eval(){
		println("Hola Mundo")
	}
}