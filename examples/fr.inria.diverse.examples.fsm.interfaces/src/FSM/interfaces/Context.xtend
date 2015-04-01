package FSM.interfaces

import java.util.ArrayList
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList

class Context {

	public String chain
	public ArrayList<EList<String>> events

	new (String chain){
		this.chain = chain
		var String noBrackets = chain.substring(1,chain.length-1)
		var String[] eventGroups = noBrackets.split(";")
		events = new ArrayList<EList<String>>()
		
		for(String eventGroup : eventGroups){
			var String[] _event = eventGroup.split(",")
			var internalArray = new BasicEList<String>()
			
			for(String event : _event){
				internalArray.add(event)
			}
			events.add(internalArray)
		}
	}
	
	//TODO: Move this from here!
	def static stateWorking(int workingTime) {
		var initialTime = System.currentTimeMillis
		var finish = false
		while(!finish){
			var now = System.currentTimeMillis
			if((now - initialTime)>=workingTime)
				finish = true
		}
	}
}
