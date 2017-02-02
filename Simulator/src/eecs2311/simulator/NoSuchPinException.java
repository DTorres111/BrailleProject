package eecs2311.simulator;

public class NoSuchPinException extends Exception {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
	
		return "This pin does not exist";
	}

}
