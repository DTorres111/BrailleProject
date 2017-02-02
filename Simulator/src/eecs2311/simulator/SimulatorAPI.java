package eecs2311.simulator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimulatorAPI extends Simulator{
	TheHandler handler=new TheHandler();
	private int x=0;
	private int j=0;

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
	
	
	//SETTING A LETTER
	
	
	public void setLetter(char letter, int cell){	
		switch(letter)
		{
		case 'a': 
			setPin(1,cell);
			break;
		
		case 'b':
			setPin(1,cell);
			setPin(3,cell);
			
			break;
		case 'c': 
			setPin(1,cell);
			setPin(2,cell);
			
			break;
		case 'd':
			setPin(1,cell);
			setPin(2,cell);
			setPin(4,cell);
			break;
		case 'e': 
			setPin(1,cell);
			setPin(4,cell);
			
			break;
		case 'f': 
			setPin(1,cell);
			setPin(2,cell);
			setPin(3,cell);
			break;
		case 'g': 
			setPin(1,cell);
			setPin(2,cell);
			setPin(3,cell);
			setPin(4,cell);
			break;
		case 'h': 
			setPin(1,cell);
			setPin(3,cell);
			setPin(4,cell);
			break;
		case 'i': 
			setPin(2,cell);
			setPin(3,cell);
			break;
		case 'j': 
			setPin(2,cell);
			setPin(3,cell);
			setPin(4,cell);
			break;
		case 'k':
			setPin(1,cell);
			setPin(5,cell);
			
			break;
		case 'l': 
			setPin(1,cell);
			setPin(3,cell);
			setPin(5,cell);
			break;
		case 'm':
			setPin(1,cell);
			setPin(2,cell);
			setPin(5,cell);
			break;
		case 'n': 
			setPin(1,cell);
			setPin(2,cell);
			setPin(4,cell);
			setPin(5,cell);
			break;
		case 'o': 
			setPin(1,cell);
			setPin(4,cell);
			setPin(5,cell);
			break;
		case 'p':
			setPin(1,cell);
			setPin(2,cell);
			setPin(3,cell);
			setPin(5,cell);
			break;
		case 'q': 
			setPin(1,cell);
			setPin(2,cell);
			setPin(3,cell);
			setPin(4,cell);
			setPin(5,cell);
			break;
		case 'r': 
			setPin(1,cell);
			setPin(3,cell);
			setPin(4,cell);
			setPin(5,cell);
			break;
		case 's': 
			setPin(2,cell);
			setPin(3,cell);
			setPin(5,cell);
			break;
		case 't': 
			setPin(2,cell);
			setPin(3,cell);
			setPin(4,cell);
			setPin(5,cell);
			break;
		case 'u': 
			setPin(1,cell);
			setPin(4,cell);
			setPin(5,cell);
			break;
		case 'v': 
			setPin(1,cell);
			setPin(3,cell);
			setPin(5,cell);
			setPin(6,cell);
			break;
		case 'w':
			setPin(2,cell);
			setPin(3,cell);
			setPin(4,cell);
			setPin(6,cell);
			break;
		case 'x': 
			setPin(1,cell);
			setPin(2,cell);
			setPin(5,cell);
			setPin(6,cell);
			break;
		case 'y':
			setPin(1,cell);
			setPin(2,cell);
			setPin(4,cell);
			setPin(5,cell);
			setPin(6,cell);
			break;
		case 'z': 
			setPin(1,cell);
			setPin(4,cell);
			setPin(5,cell);
			setPin(6,cell);
			break;
			
		}		
	}
	
	
	
	
	// SETTING A WORD
	
	public void setWord(String word)
	{
		if(word.length()>getNumberOfCells())
		{
			System.out.println("Sorry! This word is too long to display");
		}
		else
			for(int i=0;i<word.length();i++)
			{
				
				setLetter(word.charAt(i),++j);
				
				
			}
	}
	
	
	// SETTING PINS
	
	public void setPin(int pinNumbr, int cellNumber){
		
		System.out.println(pinNumbr+" "+cellNumber);
		if(getPinArray()[cellNumber-1][pinNumbr-1].getBackground()==Color.RED){
			getPinArray()[cellNumber-1][pinNumbr-1].setBackground(Color.GREEN);
			}
		else{
				getPinArray()[cellNumber-1][pinNumbr-1].setBackground(Color.RED);
				
			}
		
	}
	
	
	// RESET ALL PINS
	
	public void resetPins(){
		
		for(int j=0; j<getNumberOfCells();j++)
		{
		for(int i=0;i<getNumberOfPins();i++){
			getPinArray()[j][i].setBackground(Color.RED);	
		}	
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
			for(int x=0;x<getNumberOfButtons(); x++)
			{
				getButtonArray()[x].setEnabled(true);
			}
		}
	
	
	
	public void disableAll()
		{
			for(int x=0;x<getNumberOfButtons(); x++)
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
	