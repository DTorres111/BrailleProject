package enamel;

import javax.swing.JFrame;


public class Authoring {

	/*public static void main(String[] args) {
		SoundPlayer s = new SoundPlayer();
        //s.setScenarioFile("/Users/bil/York/workspace/git/LaSSoftE/Enamel/SampleScenarios/Scenario_One.txt");
        s.setScenarioFile("SampleScenarios/Scenario_Two.txt");
	}
	*/
    public static void main(String[] args) {
    	
    	Login login = new Login();
		login.frame.setVisible(true);
		login.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	

    }
	
	
	

}
