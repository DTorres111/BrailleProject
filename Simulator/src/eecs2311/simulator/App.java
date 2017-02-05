package eecs2311.simulator;

public class App {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int count=0;
		
					SimulatorAPI window = new SimulatorAPI(6,8,5);
					window.getFrame().setVisible(true);
					
					window.setLetter('a', 1);
					window.setLetter('o', 2);
					window.setLetter('s', 3);
					window.setPin(8, 8);
					window.enableButton(6);
			
	}
}