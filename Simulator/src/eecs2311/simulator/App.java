package eecs2311.simulator;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class App {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimulatorAPI window = new SimulatorAPI(20,20);
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	}


