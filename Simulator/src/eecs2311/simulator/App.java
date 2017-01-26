package eecs2311.simulator;

import java.awt.EventQueue;

public class App {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
		//	public void run() {
			//	try {
					SimulatorAPI window = new SimulatorAPI(5,8);
					window.getFrame().setVisible(true);
					window.setLetter('a');
					window.resetPins();				
			//	} catch (Exception e) {
			//		e.printStackTrace();
			//	}
		//	}
	//	});
	}
}