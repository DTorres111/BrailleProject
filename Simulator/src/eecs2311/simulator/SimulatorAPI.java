package eecs2311.simulator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimulatorAPI extends Simulator{
	TheHandler handler=new TheHandler();
	private int x=0;
	private int j=0;
    private int pins;
    private int cells;
    private int buttons;
    
    /**
     * Gets variable x.
     * @return indication of which button was pressed.
     */
	public int getX()
	{
		return x;
	}
	
    /**
     * Constructs a new SimulatorAPI object.
     * @param buttons is the number of buttons to be shown on the window.
     * @param pins is the number of pins to be shown on the window.
     * @param cells is the number of cells (set of pins) to be shown on the window.
     */
	public SimulatorAPI(int buttons, int pins, int cells){
      super(buttons,pins,cells);
      
      if(buttons<=15){
      this.buttons=buttons;
      }else{
      this.buttons=15;  
      }
      if(pins<=10){
      this.pins=pins;
      }else{
      this.pins=10;
      }
      if(cells<=8){
      this.cells=cells;
      }else{
          this.cells=8;
          }
      /*
       * Handling events for buttons.
       * Max # of buttons is 15.
       */
      if(buttons<=15){
		for(int i=0;i<buttons;i++){
		getButtonArray()[i].addActionListener(handler);
		}}else{
			for(int i=0;i<15;i++){
				getButtonArray()[i].addActionListener(handler);
			}
		}
	}
	
	
	//SETTING A LETTER
	
	
    /**
     * Sets a combination of pins at a particular cell to represent a letter.
     * @param letter is the character to be set at the desired cell.
     * @param cell is the number of the cell at which to set the letter.
     */
	public void setLetter(char letter, int cell){	
		try{
		if(cell<=cells&&cell>0){
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
		}else{
			throw(new NoSuchCellException()); 
		  }
		}catch(NoSuchCellException ex){
			System.out.println(ex.getMessage()+": cell("+cell+").");
		}
	}
	
	
	
	
	// SETTING A WORD
    /**
     * Sets a combination of pins at a each cell to represent a word.
     * @param word is the word string to be displayed.
     */
	public void setWord(String word)
	{
		if(word.length()>cells)
		{
			System.out.println("Sorry! This word is too long to display");
		}
		else
			for(int i=0;i<word.length();i++)
			{
				
				setLetter(word.charAt(i),++j);
				
				
			}
		j=0;
	}
	
	
	// SETTING PINS
    /**
     * Sets a particular pin at a particular cell to green if it was red or red if it was green.
     * @param pinNumbr is the number of the pin to set. 
     * @param cellNumber is the number of the cell in which the desired pin is. 
     */
	public void setPin(int pinNumbr, int cellNumber){
		try{
	if(pinNumbr<=pins&&pinNumbr>0&&cellNumber<=cells&&cellNumber>0){
		if(getPinArray()[cellNumber-1][pinNumbr-1].getBackground()==Color.RED){
			getPinArray()[cellNumber-1][pinNumbr-1].setBackground(Color.GREEN);
			}
		else{
				getPinArray()[cellNumber-1][pinNumbr-1].setBackground(Color.RED);
				
			}
		}else{
			throw(new NoSuchPinException());
		}
		}catch(NoSuchPinException ex){
			System.out.println(ex.getMessage()+": pin("+pinNumbr+"), cell("+cellNumber+").");
		}
	}
	
	
	
	// RESET ALL PINS
	/**
	 * Makes the color of every pin red.
	 */
	public void resetPins(){
		
		for(int j=0; j<cells;j++)
		{
		for(int i=0;i<pins;i++){
			getPinArray()[j][i].setBackground(Color.RED);	
		}	
		}
	}
		
	
	/**
	 * Enables a button to be pressed/clicked.
	 * @param btnNumber is the number of the button to be enabled.
	 */
	public void enableButton(int btnNumber)
		{
		try{
		if(btnNumber<=pins&&btnNumber>0){
			getButtonArray()[btnNumber-1].setEnabled(true);
		}else throw(new NoSuchButtonException());
		}
		catch(NoSuchButtonException ex){
			System.out.println(ex.getMessage()+": button("+btnNumber+")");
		}
	}
	
	
	/**
	 * Disables a button so it cannot be pressed/clicked.
	 * @param btnNumber is the number of the button to be disabled.
	 */
	public void disableButton(int btnNumber)
		{
		try{
		if(btnNumber<=buttons&&btnNumber>0){
			getButtonArray()[btnNumber-1].setEnabled(false);
		}else throw(new NoSuchButtonException());
		}
		catch(NoSuchButtonException ex){
			System.out.println(ex.getMessage()+": button("+btnNumber+")");
		}
		}
	
	
	/**
	 * Enables every button.
	 */
	public void enableAll()
		{
		
			for(int x=0;x<buttons; x++)
			{
				getButtonArray()[x].setEnabled(true);
			}
		}
	
	
	/**
	 * Disables every button.
	 */
	public void disableAll()
		{
			for(int x=0;x<buttons; x++)
			{
				getButtonArray()[x].setEnabled(false);
			}
		}
	
	
	public class TheHandler implements ActionListener{

		/**
		 * Catches and handles events from pressing/clicking buttons.
		 * Prints which button was pressed to the console.
		 * @param event is the button event to be handled.
		 */
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