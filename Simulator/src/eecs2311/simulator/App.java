package eecs2311.simulator;

public class App {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int count=0;
		
					SimulatorAPI window = new SimulatorAPI(6,8,5);
					window.getFrame().setVisible(true);
					
				//	window.setLetter('z');
				/*	System.out.println("If you think this is letter a, click Button 1. If you think it is z, click Button 2.");
					window.disableAll();
					window.enableButton(1);
					window.enableButton(2);
								
					while(window.getX()==0){
						try{
						Thread.sleep(1);
						}catch(InterruptedException ex){}
					}
				
					if(window.getX()==2){
						System.out.println("Good Job!");
					}else{
						System.out.println("Sorry that is incorrect, try again.");
						count++;
					}
					
					if(count!=0){
					while(window.getX()==1){
						try{
						Thread.sleep(1);
						}catch(InterruptedException ex){}
					}
					
					if(window.getX()==2){
						System.out.println("Good Job!");
					}else{
						System.out.println("Sorry that is incorrect.");
					}
				}
				*/
					//window.setWord("cat");
					//window.setLetter('d', 4);
					
		
					window.setLetter('s', 1);
					window.setLetter('o', 2);
					window.setLetter('s', 30);
					window.setPin(9, 0);
					window.enableButton(10);
			
	}
}