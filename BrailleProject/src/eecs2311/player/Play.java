package eecs2311.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JButton;

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

	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	public Play(Simulator sim, int cells, int buttons){
		this.sim=sim;
		this.cells=cells;
		this.buttons=buttons;
	}
	
	/**
	 * Goes through the ArrayList, extracts the commands and calls the command method.
	 * @param list is the ArrayList containing every line from the PlayerFile.txt without empty lines.
	 * @param location is the location in the ArrayList from which to play the lines.
	 */
	//location implementation will be added later when I do the loops.
	public void scenario(ArrayList<String> list, int location){
		
		//scanner object for each line string
		Scanner p;
		String command;
		
			//iterating through the list
		
			for(int i=location;i<list.size();i++){
			
			//extracting the command from the current line string (each command has ':')
			p=new Scanner(list.get(i)).useDelimiter(":");
			command=p.next();
			
			if(command.equals("Location")&&location==0){
				map.put(i+1, Integer.parseInt(p.next()));
				System.out.println(map.get(i+1));
			}
			
			command(command,p,i);
			}
	}
	
	private  void command(String command,Scanner p, int i){
		try{
			//System.out.println("command: "+(i+1));
			//calls the appropriate methods for each command
			if(command.equals("message")){
				Voice voice = new Voice("kevin");
				voice.say(p.next());
				voice=null;
		        }
				else if(command.equals("audio")){
		        	//Sound.playSound(p.next());
		        	//allows sound to play for full duration before next sound/voice
		        	//sleep((int)Sound.duration/1000);
					
		        //SETSTRING	
		        }else if(command.equals("setString")){
		        	sim.displayString(p.next());
		        //CLEARCELLS	
		        }else if(command.equals("clearCells")){
		        	sim.clearAllCells();
		        //QUESTION
		        }else if(command.equals("question")){
					
		        	int ans=Integer.parseInt(p.next());
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
		        	
		        }
			}catch(Exception e){System.out.println("there was a problem in the format of command: "+(i+1));}
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
	public void playFrom(int location){
		
	}

	public void sleep(int time){
		try{
			Thread.sleep(time);
		}catch(Exception e){System.out.println("thread was interrupted");}
	}
}