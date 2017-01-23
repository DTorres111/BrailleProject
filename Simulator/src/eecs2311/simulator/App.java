package eecs2311.simulator;
import javax.swing.JFrame;
public class App {

	public static void main(String[] args) {
	
			//creates frame
				Simulator project=new Simulator();
				project.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				project.setSize(1000,1000);
				project.setVisible(true);
			}	
	}


