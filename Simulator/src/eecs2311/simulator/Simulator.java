package eecs2311.simulator;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Simulator extends JFrame{
 
	//initialize buttons
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;	
	private JButton button5;
    private JLabel image1;
	//constructor
	public Simulator(){
	//title of frame
	super("Starting Out With Some Buttons");
	setLayout(new FlowLayout());
	
	//adds buttons to frame
	button1=new JButton("1");
	button1.setBackground(Color.WHITE);
	button1.setForeground(Color.BLACK);
	button1.setFont(new Font("Arial", Font.PLAIN, 100));
	add(button1);

	button2=new JButton("2");
	button2.setBackground(Color.WHITE);
	button2.setForeground(Color.BLACK);
	button2.setFont(new Font("Arial", Font.PLAIN, 100));
	add(button2);

	button3=new JButton("3");
	button3.setBackground(Color.WHITE);
	button3.setForeground(Color.BLACK);
	button3.setFont(new Font("Arial", Font.PLAIN, 100));
	add(button3);

	button4= new JButton("4");
	button4.setBackground(Color.WHITE);
	button4.setForeground(Color.BLACK);
	button4.setFont(new Font("Arial", Font.PLAIN, 100));
	add(button4);

	button5= new JButton("5");
	button5.setBackground(Color.WHITE);
	button5.setForeground(Color.BLACK);
	button5.setFont(new Font("Arial", Font.PLAIN, 100));
	add(button5);
	
	image1=new JLabel(new ImageIcon("C:\\Users\\dany4\\Pictures\\JavaPalLogo.jpg"));
	add(image1);
	
            }
}	

