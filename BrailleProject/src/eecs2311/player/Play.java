package eecs2311.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import eecs2311.simulator.Simulator;
import player.audio.Sound;
import player.audio.Voice;

public class Play {

	Simulator sim;
	public ActionListener action;
	public int cells;
	public int buttons;
	private boolean flag=false;
	public int buttonPushed;
	private ArrayList<String> list;
	private int counter=0;
	public File log;
	private PrintStream printLog;
	private int testing=0;


	//hashmap with int location (key), int command#
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	private Scanner scanner;
	
	/**
	 * Sets the variables and creates log file.
	 * @param sim the simulator object that is playing the scenario.
	 * @param cells number of cells initialized.
	 * @param buttons number of buttons initialized.
	 * @param list the list of command lines, without any empty spaces.
	 * @throws FileNotFoundException if the log file was not found
	 */
	public Play(Simulator sim, int cells, int buttons, ArrayList<String> list) throws FileNotFoundException{
		this.sim=sim;
		this.cells=cells;
		this.buttons=buttons;
		this.list=list;
		
		//creating log file
		try {

		     log = new File("logs.txt");

		      if (log.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }

	  	} catch (IOException ex) {
		      ex.printStackTrace();
	  	}
		
     printLog = new PrintStream(log);
	}
	
	/**
	 * Goes through the ArrayList, extracts the commands and calls the command method.
	 * @param list is the ArrayList containing every line from the PlayerFile.txt without empty lines.
	 * @param location is the location in the ArrayList from which to play the lines.
	 */
	
	public void scenario(int location){
		
	
		//scanner object for each line string
		Scanner p;
		String command;
		
			
		/*
		 * Filling HashMap with the Locations.
		 * This will only be done once.
		 * The keys are the Locations numbers, the values are the command line numbers.
		 */
		int key,value;
		if(counter==0){
		
			//iterates through the list
		for(int i=1; i<list.size(); i++){
			scanner=new Scanner(list.get(i));
			p=scanner.useDelimiter(":");
			//gets the command
			command=p.next();
			
			if(command.equals("Location")){
			//stores the location number as key
			key=Integer.parseInt(p.next());
			//the value is the index in the list+1.
			value=i+1;
			//initialize the variable testing to 0
			testing=0;
			
			//fills map with keys and values
			map.put(key, value);
				
			//testing:
				System.out.println("key: "+key+", value: "+value);
			}
		 }
		}
		counter=1;
		   //going through the list
			for(int i=location;i<list.size();i++){

			scanner = new Scanner(list.get(i));
			p=scanner.useDelimiter(":");
			command=p.next();
			testing=0; // set testing to 0
			//Retrieves the command and sends it to the command method with the scanner object of each line
			//and the current index of the list as parameters.
			command(command,p,i);
			}
	}
	
	/**
	 * Gets the command from the list (which contains the file) and executes it.
	 * Extract method could be used here, but the team did not have enough time to adjust the code to further changes.
	 * @param command is the first string of every line in the file, contained in the ArrayList, that decides what to execute.
	 * @param p is the Scanner object that reads a line with ':' as delimiter.
	 * @param i is the current index in the ArrayList
	 */
	private  void command(String command,Scanner p, int i){
		try{
			//testing:
			System.out.println("command: "+(i+1));
			
			//does the appropriate action for each command
			//MESSAGE
			if(command.equals("message")){
				//creates new voice object to say the message.
				testing=1;
				Voice voice = new Voice("kevin");
				voice.say(p.next());
				voice=null;
		        }
				//AUDIO
				else if(command.equals("audio")){
					testing=2;
		        	Sound.playSound(p.next());
		        	//allows sound to play for full duration before next sound/voice
		        	sleep((int)Sound.duration/1000);
					
					
		        //SETSTRING	
		        }else if(command.equals("setString")){
		        	testing=3;
		        	sim.displayString(p.next());
		        //CLEARCELLS	
		        }else if(command.equals("clearCells")){
		        	sim.clearAllCells();
		        	testing=4;
		        //QUESTION
		        }else if(command.equals("question")){
					//extracts the correct button number that should be pushed.
		        	testing=5;
		        	int ans=Integer.parseInt(p.next());
		        	
		        	//if this happens, the log is updated.
		        	if(ans>buttons){
		        		throw new Exception();
		        	}
		        	//message to say if the user presses the correct or incorrect buttons.
		        	String correct=p.next();
		        	String incorrect=p.next();
	
		        	
		        	Voice voice = new Voice("kevin");
		        	//calls question method to get input from user.
		        	question();
		        	//allows user to press a button before continuing.
		        	while(flag==false){
		        		sleep(500);
		        	}
   
		        	//if the user presses the correct button, it says the correct message.
		        	//any other button says the incorrect message.
					try{
					if(ans==buttonPushed){
						
						voice.say(correct);	
					
					  }
					else{
						voice.say(incorrect);	
											
					 }
					voice=null;
					
					}catch(Exception e){}
	        	
					//resets the buttons.
		        	flag=false;
		        	
		        	for(int x=0;x<buttons;x++){
		        		sim.getButton(x).removeActionListener(action);
		        		}
		        	
		        	//GOTO
		        }else if(command.equals("goto")){
		        	testing =6;
		        	int keepPlaying;
		        	//extracts the location # and the button to press (choice) to go to that location.
		        	int location=Integer.parseInt(p.next());
		        	int choice=Integer.parseInt(p.next());
		        	
		        	//updates the log if something is wrong with the line.
		        	if(choice>buttons){
		        		throw new Exception();
		        	}
		        	//testing:
		        	System.out.println("goto, location:"+location+", choice: "+choice);
		        	
		        	//calls method playFrom, stores its return value in keepPlaying
		            keepPlaying=playFrom(location,choice);		        	
		       
		            //exits program if keepPlaying is 0 or the command line reads exit.
		            if(keepPlaying==0){
		            	System.exit(0);
		            }
		           
		        }else if(command.equals("exit")){
		        	testing=7;
		        	System.exit(0);
		        }
			}catch(Exception e){
						
				Voice error = new Voice("kevin");
				
				//Warns user there was an error and updates the error log file.
					error.say("Something was wrong with the program, please give the device an adult such as your teacher");
					error.say("so that they may fx it.");
					
					error=null;
				
					  printLog.println("There was a problem in the format of command: "+(i+1));
				      System.out.println("there was a problem in the format of command: "+(i+1));}
		}
	
	/**
	 * Creates the ActionListener object to get user input.
	 * sets the flag to true if a button was pushed, and stores the number of the button in
	 * the variable buttonPushed.
	 * Adds all the buttons to the ActionListener.
	 */
	private void question(){
		
			action=new ActionListener(){
				
			@Override
			public void actionPerformed(ActionEvent arg0) {
					
				for(int i=0;i<buttons;i++){
					if(arg0.getSource()==sim.getButton(i))
						buttonPushed=i;
				}
				flag=true;
		   }			
		};
		
		for(int i=0;i<buttons;i++){
		sim.getButton(i).addActionListener(action);
		}	
		
	}
	
	/**
	 * This method calls scenario at a specific command line(contained in a HashMap with the Location # as the key).
	 * @param location is the number of the Location command which is they key in the HashMap. This key
	 * addresses a command line that specifies where to play the scenario from.
	 * @param choice is the button that should be pushed to play from the specified location.
	 * any other button pushed will continue the same scenario.
	 * @return 1 to continue playing from last location or 0 to stop playing previous scenario
	 */
	public int playFrom(int location, int choice){
		
		question();
		
		//allows user to press a button before continuing. 
		while(flag==false){
    		sleep(500);
    	}
		if(choice==buttonPushed){
			System.out.println("Playing from Location "+location+", command: "+map.get(location));
			
			//stops program if played from the end (this can be used to quit program).
			if(map.get(location)==list.size()){
				System.exit(0);
			}
			
			
			 //Resets the buttons for the new scenario to play, return 0 means stopping the previous scenario.
			
			flag=false;
			for(int x=0;x<buttons;x++){
	    		sim.getButton(x).removeActionListener(action);
	    		}
			
			//plays the scenario from the location.
			scenario(map.get(location));
			return 0;
		}
		
		//if no new scenario will be played, the buttons are reset and 1 is returned.
		flag=false;
		
		for(int x=0;x<buttons;x++){
    		sim.getButton(x).removeActionListener(action);
    		}
		return 1;	
	}
	
	
	/**
	 * @return testing variable
	 * it used for testing purposes.
	 */
	public int getTesting()
	{
		return testing;
	}
	
	

	/**
	 * @param time is the amount in milliseconds for Thread to sleep
	 */
	public void sleep(int time){
		try{
			Thread.sleep(time);
		}catch(Exception e){System.out.println("thread was interrupted");}
	}
}