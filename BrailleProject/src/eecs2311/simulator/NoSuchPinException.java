package eecs2311.simulator;

public class NoSuchPinException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Gets exception message when a pin does not exist.
	 * @return the message displayed when there is a NoSuchPinException.
	 */
	@Override
	public String getMessage() {
	
		return "This pin does not exist";
	}

}
