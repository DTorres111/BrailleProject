package eecs2311.simulator;

public class NoSuchCellException extends Exception {

	private static final long serialVersionUID = 3L;
	
	@Override
	public String getMessage() {
	
		return "This cell does not exist";
	}

}
