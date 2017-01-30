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
					SimulatorAPI window = new SimulatorAPI(6,8);
					window.getFrame().setVisible(true);
				//  window.disablebutton(2);
					window.setLetter('z');
				//	window.setPin(7);
				//	System.out.println(window.getPinArray()[4].getBackground());
				//	window.setPin(5);
				//	System.out.println(window.getPinArray()[4].getBackground());
				//	window.resetPins();				
			//	} catch (Exception e) {
			//		e.printStackTrace();
			//	}
		//	}
	//	});
	}
}