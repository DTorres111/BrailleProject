package eecs2311.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import eecs2311.simulator.Simulator;
import player.audio.Sound;
import player.audio.Voice;

public class Play {

	Simulator sim;
	public static ActionListener action;
	int counter=0;
	int counter1=0;
	/*
	public void setActionListener(int ans, String correct, String incorrect){
		this.action = new ActionListener
	}*/
	public Play(Simulator sim){
		this.sim=sim;
	}
	
	/**
	 * Goes through the ArrayList, extracts the commands and calls the method
	 * designated for each command.
	 * @param list is the ArrayList containing every line from the PlayerFile.txt without empty lines.
	 * @param location is the location in the ArrayList from which to play the lines.
	 */
	//location implementation will be added later when I do the loops.
	public void scenario(ArrayList<String> list, String location){
		
		//scanner object for each line string
		Scanner p;
		String command;
		
			//iterating through the list
		
			for(int i=1;i<list.size();i++){
			
			//extracting the command from the current line string (each command has ':')
			p=new Scanner(list.get(i)).useDelimiter(":");
			command=p.next();
			command(command,p,i);
			}
	}
	private  void command(String command,Scanner p, int i){
		try{
			//calls the appropriate methods for each command
			if(command.equals("message")){
				counter++;
				Voice voice = new Voice("kevin");
				voice.say(p.next());
				sleep(1500);
				
		        }
				else if(command.equals("audio")){
		        	//Sound.playSound(p.next());
		        	//allows sound to play for full duration before next sound/voice
		        	//sleep((int)Sound.duration/1000);
		        	
		        }else if(command.equals("setString")){
		        	sim.displayString(p.next());
		        	
		        }else if(command.equals("clearCells")){
		        	sim.clearAllCells();
		        
		        }else if(command.equals("question")){
		        	counter1++;
		        	question(Integer.parseInt(p.next()),p.next(),p.next());
		        }
			}catch(Exception e){System.out.println("there was a problem in the format of command: "+i+1);}
			}
	
	private void question(int ans, String correct, String incorrect) 
		
	{
			action=new ActionListener(){
			Voice voice = new Voice("kevin");
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(ans);
				if(arg0.getSource()==sim.getButton(0)){
					if(ans==0)
						voice.say(correct);
					else
						voice.say(incorrect);
				}else if(arg0.getSource()==sim.getButton(1)){
					if(ans==1)
						voice.say(correct);
					else
						voice.say(incorrect);
				}
			}
			
			
		};
		
		sim.getButton(1).addActionListener(action);
		sim.getButton(0).addActionListener(action);
		if(counter1>1)   //I assume that first question will always be for instructions
		sleep(5000);
		else  // for first question the counter will be zero. And it will sleep according to length of the instructions. 
			sleep(correct.length()*80);
		
		if(counter>1)
		{
		sim.getButton(1).removeActionListener(action);
		sim.getButton(0).removeActionListener(action);
		}
		
	}


	public void sleep(int time){
		try{
			Thread.sleep(time);
		}catch(Exception e){}
	}
}
