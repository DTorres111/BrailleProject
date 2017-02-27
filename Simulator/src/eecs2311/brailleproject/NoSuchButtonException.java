package eecs2311.simulator;

public class NoSuchButtonException extends Exception {
	
	private static final long serialVersionUID = 2L;
	
	/**
	 * Gets exception message when a button does not exist.
	 * @return the message displayed when there is a NoSuchButtonException.
	 */
	@Override
	public String getMessage() {
	
		return "This button does not exist";
	}
}