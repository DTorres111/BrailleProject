package eecs2311.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import eecs2311.simulator.Simulator;
import player.audio.Voice;
import player.audio.Sound;


public class Player {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan=new Scanner(new File("PlayerFile.txt"));
		Voice voice = new Voice("kevin16");
		
		voice.say(scan.nextLine());
		Sound.playSound(scan.nextLine());
		Simulator sim = new Simulator(5, 3);

		sim.displayString("dog");
		
		sim.getCell(3).displayCharacter('z');
		sim.getCell(4).raiseOnePin(3);

		sim.getButton(0).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Button 0 got pressed.");
			}
		});
	}

}