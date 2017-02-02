package eecs2311.simulator;

public class NoSuchButtonException extends Exception {
	
	private static final long serialVersionUID = 2L;
	
	@Override
	public String getMessage() {
	
		return "This button does not exist";
	}
}
