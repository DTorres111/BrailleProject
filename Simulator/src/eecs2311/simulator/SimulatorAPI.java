package eecs2311.simulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimulatorAPI extends Simulator{
	private int btns;
	
	public SimulatorAPI(int buttons, int pins){
		super(buttons,pins);
		this.btns=buttons;
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