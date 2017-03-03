package eecs2311.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import eecs2311.simulator.Simulator;
import player.audio.Voice;
import player.audio.Sound;

public class Player {

	public Simulator sim ;
	

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan=new Scanner(new File("PlayerFile.txt"));
		ArrayList<String> list = new ArrayList<String>();
		
		
		//filling ArrayList with lines of file
		String temp;
		while(scan.hasNextLine()){
			//removing blank lines
			temp=scan.nextLine();
			if(!temp.equals(""))
			list.add(temp);
		}
		
		int cells;
		int buttons;
		
		//getting cells and buttons from first line
		Scanner scanner = new Scanner(list.get(0));
		Scanner x = scanner.useDelimiter("\'");
		x.next();
		cells = Integer.parseInt(x.next());
		x.next();
		buttons = Integer.parseInt(x.next());
		scanner.close();
		
		//plays list of instructions after first line
		Simulator sim = new Simulator(cells,buttons);
		play(list,"",sim);
		
		scan.close();
	}
	
	/**
	 * Goes through the ArrayList, extracts the commands and calls the method
	 * designated for each command.
	 * @param list is the ArrayList containing every line from the PlayerFile.txt without empty lines.
	 * @param location is the location in the ArrayList from which to play the lines.
	 */
	//location implementation will be added later when I do the loops.
	private static void play(ArrayList<String> list, String location, Simulator sim){
		
		//scanner object for each line string
		Scanner p;
		String command;
		
			//iterating through the list
			for(int i=1;i<list.size();i++){
			
			//extracting the command from the current line string (each command has ':')
			p=new Scanner(list.get(i)).useDelimiter(":");
			command=p.next();
			
			try{
			//calls the appropriate methods for each command
			if(command.equals("message_voice")){
				message(p.next(),Integer.parseInt(p.next()));		
				
		        }else if(command.equals("audio")){
		        	Sound.playSound(p.next());
		        	//allows sound to play for full duration before next sound/voice
		        	sleep((int)Sound.duration/1000);
		        	
		        }else if(command.equals("setString")){
		        	setString(p.next(),sim);
		        	
		        }else if(command.equals("clearCells")){
		        	sim.clearAllCells();
		        
		        }else if(command.equals("question")){
		        	question(Integer.parseInt(p.next()),p.next(),p.next(), sim);
		        }
			}catch(Exception e){System.out.println("there was a problem in the format of command: "+i+1);}
			}
	}
	
	private static void question(int ans, String correct, String incorrect, Simulator sim) {
		
		ActionListener action=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==sim.getButton(0)){
					if(ans==0)
						message(correct,1);
					else
						message(incorrect,1);
				}else if(arg0.getSource()==sim.getButton(1)){
					if(ans==1)
						message(correct,1);
					else
						message(incorrect,1);
				}
			}
		};
		sim.getButton(0).addActionListener(action);
		sim.getButton(1).addActionListener(action);
		
		sleep(5000);
	}

	private static void setString(String string, Simulator sim) {

		sim.displayString(string);
			
	}
	

	/**
	 * Converts text (line) to speech using the voice specified.
	 * @param line is the line to speak, right after the message_voice command
	 * @param voice is either 1 for kevin or any other number for kevin16 
	 */
	private static void message(String line, int voice){
		//new voice object that can have 'kevin' or 'kevin16' voice
		Voice captain;
		
		if(voice==1)
			captain=new Voice("kevin");
		else
			captain=new Voice("kevin16");
		
		captain.say(line);
	}
	
	public static void sleep(int time){
		try{
			Thread.sleep(time);
		}catch(Exception e){}
	}
	
}