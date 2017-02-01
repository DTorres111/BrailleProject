package eecs2311.simulator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimulatorAPI extends Simulator{
	TheHandler handler=new TheHandler();
	private int x=0;

	public int getX()
	{
		return x;
	}
	
	public SimulatorAPI(int buttons, int pins, int cells){
      super(buttons,pins,cells);
		for(int i=0;i<buttons;i++){
		getButtonArray()[i].addActionListener(handler);
		}
	}
	
	/*
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
	*/
	
	/*
	public void setPin(int pinNumbr){
		
		if(getPinArray()[pinNumbr-1].getBackground()==Color.RED){
			getPinArray()[pinNumbr-1].setBackground(Color.GREEN);
			}
		else{
				getPinArray()[pinNumbr-1].setBackground(Color.RED);
				
			}
		
	}
	*/
	
	/*
	
	public void resetPins(){
		for(int i=0;i<getPinArray().length;i++){
			getPinArray()[i].setBackground(Color.RED);	
		}	
	}
	*/	
	
	
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
	
	public class TheHandler implements ActionListener{

		public void actionPerformed(ActionEvent event){
			if(event.getSource()==getButtonArray()[0]){
				x=1;
				System.out.println("Button 1 pressed");
			
			}else if(event.getSource()==getButtonArray()[1]){
				x=2;
				System.out.println("Button 2 pressed");
		
			}else if(event.getSource()==getButtonArray()[2]){
				x=3;
				System.out.println("Button 3 pressed");
		
			}else if(event.getSource()==getButtonArray()[3]){
				x=4;
				System.out.println("Button 4 pressed");
	
			}else if(event.getSource()==getButtonArray()[4]){
				x=5;
				System.out.println("Button 5 pressed");
			}else if(event.getSource()==getButtonArray()[5]){
				x=6;
				System.out.println("Button 6 pressed");
			}else if(event.getSource()==getButtonArray()[6]){
				x=7;
				System.out.println("Button 7 pressed");
			}else if(event.getSource()==getButtonArray()[7]){
				x=8;
				System.out.println("Button 8 pressed");
			}else if(event.getSource()==getButtonArray()[8]){
				x=9;
				System.out.println("Button 9 pressed");
			}else if(event.getSource()==getButtonArray()[9]){
				x=10;
				System.out.println("Button 10 pressed");
			}else if(event.getSource()==getButtonArray()[10]){
				x=11;
				System.out.println("Button 11 pressed");
			}else if(event.getSource()==getButtonArray()[11]){
				x=12;
				System.out.println("Button 12 pressed");
			}else if(event.getSource()==getButtonArray()[12]){
				x=13;
				System.out.println("Button 13 pressed");
			}else if(event.getSource()==getButtonArray()[13]){
				x=14;
				System.out.println("Button 14 pressed");
			}else if(event.getSource()==getButtonArray()[14]){
				x=15;
				System.out.println("Button 15 pressed");
			}
		}
	}
}
	