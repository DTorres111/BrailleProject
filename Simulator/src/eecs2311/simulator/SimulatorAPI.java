package eecs2311.simulator;

public class SimulatorAPI extends Simulator{

	public SimulatorAPI(int buttons, int pins){
		super(buttons,pins);
	}
	
	public void setLetter(char letter){	
		if(letter=='a'){
		setPin(2);
		setPin(3);
		setPin(4);
		}
	}
	public void resetPins(){
		for(int i=0;i<getPinArray().length;i++){
		}	
	}
	
	}