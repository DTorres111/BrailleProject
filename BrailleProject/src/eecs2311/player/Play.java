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
	private File log;
	private PrintStream printLog;


	//hashmap with int location (key), int command#
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	private Scanner scanner;
	
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
	//location implementation will be added later when I do the loops.
	public void scenario(int location){
		
	
		//scanner object for each line string
		Scanner p;
		String command;
		
			
		//filling HashMap with locations
		int key,value;
		if(counter==0){
		for(int i=1; i<list.size(); i++){
			scanner=new Scanner(list.get(i));
			p=scanner.useDelimiter(":");
			command=p.next();
			
			if(command.equals("Location")){
			key=Integer.parseInt(p.next());
			value=i+1;
			
				map.put(key, value);
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
			
			command(command,p,i);
			}
	}
	
	private  void command(String command,Scanner p, int i){
		try{
			System.out.println("command: "+(i+1));
			//calls the appropriate methods for each command
			if(command.equals("message")){
				Voice voice = new Voice("kevin");
				voice.say(p.next());
				voice=null;
		        }
				else if(command.equals("audio")){
					/*
		        	Sound.playSound(p.next());
		        	//allows sound to play for full duration before next sound/voice
		        	sleep((int)Sound.duration/1000);
					*/
					
		        //SETSTRING	
		        }else if(command.equals("setString")){
		        	sim.displayString(p.next());
		        //CLEARCELLS	
		        }else if(command.equals("clearCells")){
		        	sim.clearAllCells();
		        //QUESTION
		        }else if(command.equals("question")){
					
		        	int ans=Integer.parseInt(p.next());
		        	
		        	if(ans>buttons){
		        		throw new Exception();
		        	}
		        	String correct=p.next();
		        	String incorrect=p.next();
	
		        	
		        	Voice voice = new Voice("kevin");
		        	question();

		        	while(flag==false){
		        		sleep(500);
		        	}
   
					try{
					if(ans==buttonPushed){
						
						voice.say(correct);	
					
					  }
					else{
						voice.say(incorrect);	
											
					 }
					voice=null;
					
					}catch(Exception e){}
	        	
		        	flag=false;
		        	
		        	for(int x=0;x<buttons;x++){
		        		sim.getButton(x).removeActionListener(action);
		        		}
		        	//GOTO********************************************
		        }else if(command.equals("goto")){
		        	int keepPlaying;
		        	int location=Integer.parseInt(p.next());
		        	int choice=Integer.parseInt(p.next());
		        	System.out.println("goto, location:"+location+", choice: "+choice);
		            keepPlaying=playFrom(location,choice);		        	
		       
		            if(keepPlaying==0){
		            	System.exit(0);
		            }
		        }else if(command.equals("exit")){
		        	System.exit(0);
		        }
			}catch(Exception e){
						
				Voice error = new Voice("kevin");
				
					error.say("Something was wrong with the program, please give the device an adult such as your teacher");
					error.say("so that they may fx it.");
					
					error=null;
				
					  printLog.println("There was a problem in the format of command: "+(i+1));
				      System.out.println("there was a problem in the format of command: "+(i+1));}
		}
	
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
	
	//************************************************
	public int playFrom(int location, int choice){
		
		question();
		
		while(flag==false){
    		sleep(500);
    	}
		if(choice==buttonPushed){
			System.out.println("Playing from Location "+location+", command: "+map.get(location));
			
			//stops program if played from the end (this can be used to quit program).
			if(map.get(location)==list.size()){
				System.exit(0);
			}
			
			flag=false;
			
			for(int x=0;x<buttons;x++){
	    		sim.getButton(x).removeActionListener(action);
	    		}
			
			scenario(map.get(location));
			return 0;
		}
		
		flag=false;
		
		for(int x=0;x<buttons;x++){
    		sim.getButton(x).removeActionListener(action);
    		}
		return 1;	
	}

	public void sleep(int time){
		try{
			Thread.sleep(time);
		}catch(Exception e){System.out.println("thread was interrupted");}
	}
}