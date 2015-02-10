package finitestatemachines.rtc

import java.util.ArrayList

class Context {

	public String chain
	public ArrayList<ArrayList<String>> events

	new (String chain){
		this.chain = chain
		var String noBrackets = chain.substring(1,chain.length-1)
		var String[] eventGroups = noBrackets.split(";")
		events = new ArrayList<ArrayList<String>>()
		
		for(String eventGroup : eventGroups){
			var String[] _event = eventGroup.split(",")
			var ArrayList<String> internalArray = new ArrayList<String>()
			
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
