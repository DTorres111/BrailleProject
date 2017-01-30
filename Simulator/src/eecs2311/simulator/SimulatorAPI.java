package eecs2311.simulator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimulatorAPI extends Simulator{
	private int btns;

	
	public SimulatorAPI(int buttons, int pins){
		super(buttons,pins);
		this.btns=buttons;
	}
	
	public void setLetter(char letter){	
		switch(letter)
		{
		case 'a': case 'A':
			setPin(1);
			break;
		
		case 'b':case 'B':
			setPin(1);
			setPin(3);
			
			break;
		case 'c': case 'C':
			setPin(1);
			setPin(2);
			
			break;
		case 'd':case 'D':
			setPin(1);
			setPin(2);
			setPin(4);
			break;
		case 'e': case 'E':
			setPin(1);
			setPin(4);
			
			break;
		case 'f': case 'F':
			setPin(1);
			setPin(2);
			setPin(3);
			break;
		case 'g': case 'G':
			setPin(1);
			setPin(2);
			setPin(3);
			setPin(4);
			break;
		case 'h': case 'H':
			setPin(1);
			setPin(3);
			setPin(4);
			break;
		case 'i': case 'I':
			setPin(2);
			setPin(3);
			break;
		case 'j': case 'J':
			setPin(2);
			setPin(3);
			setPin(4);
			break;
		case 'k': case 'K':
			setPin(1);
			setPin(5);
			
			break;
		case 'l': case 'L':
			setPin(1);
			setPin(3);
			setPin(5);
			break;
		case 'm': case 'M':
			setPin(1);
			setPin(2);
			setPin(5);
			break;
		case 'n': case 'N':
			setPin(1);
			setPin(2);
			setPin(4);
			setPin(5);
			break;
		case 'o': case 'O':
			setPin(1);
			setPin(4);
			setPin(5);
			break;
		case 'p': case 'P':
			setPin(1);
			setPin(2);
			setPin(3);
			setPin(5);
			break;
		case 'q': case 'Q':
			setPin(1);
			setPin(2);
			setPin(3);
			setPin(4);
			setPin(5);
			break;
		case 'r': case 'R':
			setPin(1);
			setPin(3);
			setPin(4);
			setPin(5);
			break;
		case 's': case 'S':
			setPin(2);
			setPin(3);
			setPin(5);
			break;
		case 't': case 'T':
			setPin(2);
			setPin(3);
			setPin(4);
			setPin(5);
			break;
		case 'u': case 'U':
			setPin(1);
			setPin(4);
			setPin(5);
			break;
		case 'v': case 'V':
			setPin(1);
			setPin(3);
			setPin(5);
			setPin(6);
			break;
		case 'w':case 'W':
			setPin(2);
			setPin(3);
			setPin(4);
			setPin(6);
			break;
		case 'x': case 'X':
			setPin(1);
			setPin(2);
			setPin(5);
			setPin(6);
			break;
		case 'y': case 'Y':
			setPin(1);
			setPin(2);
			setPin(4);
			setPin(5);
			setPin(6);
			break;
		case 'z': case 'Z':
			setPin(1);
			setPin(4);
			setPin(5);
			setPin(6);
			break;
			
		}
		
			
	}
	
	
	public void setPin(int pinNumbr){
		
		if(getPinArray()[pinNumbr-1].getBackground()==Color.RED){
			getPinArray()[pinNumbr-1].setBackground(Color.GREEN);
			}
		else{
				getPinArray()[pinNumbr-1].setBackground(Color.RED);
				
			}
		
	}
	
	
	
	
	public void resetPins(){
		for(int i=0;i<getPinArray().length;i++){
			getPinArray()[i].setBackground(Color.RED);	
		}	
	}
		
	
	
	public void enableButton(int btnNumber)
		{
			getButtonArray()[btnNumber-1].setEnabled(true);
		}
	
	
	
	public void disableButton(int btnNumber)
		{
			getButtonArray()[btnNumber-1].setEnabled(false);
		}
	
	
	
	public void enableAll()
		{
			for(int x=0;x<numberOfButtons; x++)
			{
				getButtonArray()[x].setEnabled(true);
			}
		}
	
	
	public void disableAll()
		{
			for(int x=0;x<numberOfButtons; x++)
			{
				getButtonArray()[x].setEnabled(false);
			}
		}
	
	
	
	public int getButtonEvent()
		{
			return getX();
		}
	
}
	