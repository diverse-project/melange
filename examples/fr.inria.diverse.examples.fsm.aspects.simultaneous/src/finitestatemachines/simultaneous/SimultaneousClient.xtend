package finitestatemachines.simultaneous

import FSM.interfaces.Interpreter
import java.util.Scanner

class SimultaneousClient {

	def public static void main(String[] args){
		println("Welcome to the interpreter for state machines a la Kermeta \n\n")
		print("Input: ")
		
		var Scanner in = new Scanner(System.in)
		var String expression = in.nextLine
		
		var Interpreter _interpreter = new SimultaneousInterpreter();
		_interpreter.execute("simultaneous-case.xmi", expression)
	}	
}