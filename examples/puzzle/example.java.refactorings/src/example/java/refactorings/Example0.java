package example.java.refactorings;

import puzzle.annotations.processor.OverrideRequiredAspectMethod;

public class Example0 {
	
	private void _original(){
		
	}
	
	@OverrideRequiredAspectMethod
	public void hola(int o){
		System.out.println("Flag 1");
		_original();
		System.out.println("Flag 2");
	}
}
