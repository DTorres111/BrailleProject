package eecs2311.player;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import eecs2311.simulator.Simulator;


public class Player {

	public static void main(String[] args) throws FileNotFoundException {
		
	     Simulator sim ;
		 int cells;
		 int buttons;
		 
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
		
			
		//getting cells and buttons from first line
		Scanner scanner = new Scanner(list.get(0));
		Scanner x = scanner.useDelimiter("\'");
		x.next();
		cells = Integer.parseInt(x.next());
		x.next();
		buttons = Integer.parseInt(x.next());
		scanner.close();
		
		//plays list of instructions after first line
		sim = new Simulator(cells,buttons);
		
	Play play = new Play(sim);
	play.scenario(list,"");
		
		scan.close();
	}
}