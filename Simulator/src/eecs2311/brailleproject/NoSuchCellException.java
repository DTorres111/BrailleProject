package eecs2311.simulator;

public class NoSuchCellException extends Exception {

	private static final long serialVersionUID = 3L;
	
	/**
	 * Gets exception message when a cell does not exist.
	 * @return the message displayed when there is a NoSuchCellException.
	 */
	@Override
	public String getMessage() {
	
		return "This cell does not exist";
	}

}
