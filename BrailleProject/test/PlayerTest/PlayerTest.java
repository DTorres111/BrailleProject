package PlayerTest;

import static org.junit.Assert.*;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eecs2311.player.Play;
import eecs2311.simulator.Simulator;
import eecs2311.simulator.SimulatorAPI;

/**
 * This is the testing class of our player app. It's package name is PlayerTest.
 * Purpose if this testing class is to make sure that our player app is working corectly.
 * First, it test all the commands separately.
 * I can only check one command at a time because it creates new object at start of every test case. Hence,
 * it only checks the first command.
 * It not possible to do unit testing of everything that's why we also did system testing to get whole file tested.
 * 
 * @author TEAM 5
 *
 */

 

public class PlayerTest {

	
	private Simulator window;
	private Scanner scanner;
	private Play app;
	int cells=3;
	int buttons=5;
	ArrayList<String> list = new ArrayList<String>();
	
	
	@Before
	public void setUp() throws Exception {
		list.add("");
		list.add("message:Hello there");	 // Use to test message command
		//list.add("question:3:You got it right!: I am sorry but that is incorrect."); // Use to test question command
		//list.add("clearCells"); // Use to check clearCells command
		//list.add("exit"); // Use to check exit command
		//list.add("setString:a"); // Use to check setString command
		//list.add("Location:2"); // Use to test Location command
		//list.add("audio:clap.wav"); // Use to test audio command
		//list.add("goto:2:2"); // Use to test goto command
		//list.add("question:8:You got it right!: I am sorry but that is incorrect."); // Use to test that is 
		// our code printing the error in log file? and is it giving the message to the visually-impaired kid?
		 
		window = new Simulator(cells, buttons);  // Show  that we can initialize simulator with desired number of cells and buttons.
		app =new Play(window, cells, buttons, list); //  Show that we can call player method by passing arguments
		
		app.scenario(1); // Show that we can call scenario method
		
		
	}
	
	
	
	/*
	 *This  test case is use to test that whether our program writes to file in case of error, or not
	 *Ir reads the file and check that is is empty in case of error? If it is not empty then our code is working. 
	 */
	@Test
	public void testLog() {
		
		String i=null;
		int tester=0;
		try{
	        Scanner sc = new Scanner(app.log);

	        while (sc.hasNextLine()) {
	            i = sc.nextLine();
	            System.out.println(i);
	        }
	        sc.close();
	    if(i!=null)
	    {
	    	tester=1;
	    }}
		catch (IOException ex) {
		      ex.printStackTrace();
	  	}
	
	    assertEquals(1,tester);
	}


	
	////////////////////////THESE ALL TEST CASES SHOW THAT WE CAN TOKENIZE THE STRINGS IN FILE /////////////////////
	////////////////////////WE CAN GET THE COMMANDS. ALSO, WE CAN GET THE STRING AFTER COMMAND./////////////////////

	
	/*
	 * This method is used to test the message command. If our app recognize that this command has been given, it 
	 * change the variable testing to 1, and therefore; pass the test case.
	 */
	
	@Test
	public void testGettingMessageCommand() {
		System.out.println(app.getTesting());
		assertEquals(1, app.getTesting());
	}

	
	
	/*
	 * This method is used to test the audio command. If our app recognize that this command has been given, it 
	 * change the variable testing to 2, and therefore; pass the test case.
	 */
	@Test
	public void testGettingAudioCommand() {
		System.out.println(app.getTesting());
		assertEquals(2, app.getTesting());
	}

	
	/*
	 * This method is used to test the clearCells command. If our app recognize that this command has been given, it 
	 * change the variable testing to 4, and therefore; pass the test case.
	 */
	
	@Test
	public void testGettingClearCellsCommand() {
		System.out.println(app.getTesting());
		assertEquals(4, app.getTesting());
	}
	
	
	/*
	 * This method is used to test the goto command. If our app recognize that this command has been given, it 
	 * change the variable testing to 6, and therefore; pass the test case.
	 */
	
	@Test
	public void testGettingGotoCommand() {
		System.out.println(app.getTesting());
		assertEquals(6, app.getTesting());
	}

	
	
	/*
	 * This method is used to test the exit command. If our app recognize that this command has been given, it 
	 * change the variable testing to 7, and therefore; pass the test case.
	 */
	
	@Test
	public void testGettingExitCommand() {
		System.out.println(app.getTesting());
		assertEquals(7, app.getTesting());
	}

	
	
	/*
	 * This method is used to test the 	question command. If our app recognize that this command has been given, it 
	 * change the variable testing to 5, and therefore; pass the test case.
	 */
	
	@Test
	public void testGettingQuestionCommand() {
		System.out.println(app.getTesting());
		assertEquals(5, app.getTesting());
	}
	
	/*
	 * This method is used to test the setString command. If our app recognize that this command has been given, it 
	 * change the variable testing to 3, and therefore; pass the test case.
	 */

	@Test
	public void testSetStringCommand() {
		System.out.println(app.getTesting());
		assertEquals(3, app.getTesting());
	}

	/*
	 * This method is used to test the location command. If our app recognize that this command has been given, it 
	 * change the variable testing to 0, and therefore; pass the test case.
	 */
	@Test
	public void testLocationCommand() {
		System.out.println(app.getTesting());
		assertEquals(0, app.getTesting());
	}

	
	
	
	////////////////////TEST THAT HASH MAP STORES NUMBER OF COMMAND "LOCATION" AND THEIR LINE NUMBER"///////////
	
	
	
	/*
	 * It checks that the location command is stored in has map or not. It also checks its line number and location number. 
	 */
	@Test
	public void testHashMap() {
		
		int j=0;
	
		
	///////////////////// HELP//////////////////////////
		
		
	}

	
	
	/////////////////////////TEST THAT THE QUESTION RESPOND DENPENDING ON THE ARGUMENT OF USER//////////////
	
	
	
	@Test
	public void testQuestionResponse() {
		
		assertEquals(3,app.buttonPushed);
		
	}
}