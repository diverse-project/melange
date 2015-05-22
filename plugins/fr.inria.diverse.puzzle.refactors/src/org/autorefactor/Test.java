package org.autorefactor;

public class Test {

	 public static final String EXAMPLE_TEST = "   hh     StateAspect.evalState(((State) _target_2), context);";
	
	public static void main(String[] args) {
		
	    String pattern = "(.*)(StateAspect.evalState\\()(.*)";
	    boolean updated = EXAMPLE_TEST.matches(pattern);
	    System.out.println(updated);
	}

}
