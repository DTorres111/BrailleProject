package eecs2311.simulator;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.*;

public class Simulator extends JFrame{
 
	//initialize buttons
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;	
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
    private JLabel image1;
    private JFrame frame;
	//constructor
	public Simulator(){
	//title of frame
	super("Starting Out With Some Buttons");
	//setLayout(new FlowLayout());
	initialize();
	}
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simulator window = new Simulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/*
	//adds buttons to frame
	button1=new JButton("1");
	button1.setBackground(Color.WHITE);
	button1.setForeground(Color.BLACK);
	button1.setFont(new Font("Arial", Font.PLAIN, 50));
	add(button1);

	button2=new JButton("2");
	button2.setBackground(Color.WHITE);
	button2.setForeground(Color.BLACK);
	button2.setFont(new Font("Arial", Font.PLAIN, 50));
	add(button2);

	button3=new JButton("3");
	button3.setBackground(Color.WHITE);
	button3.setForeground(Color.BLACK);
	button3.setFont(new Font("Arial", Font.PLAIN, 50));
	add(button3);

	button4= new JButton("4");
	button4.setBackground(Color.WHITE);
	button4.setForeground(Color.BLACK);
	button4.setFont(new Font("Arial", Font.PLAIN, 50));
	add(button4);

	button5= new JButton("5");
	button5.setBackground(Color.WHITE);
	button5.setForeground(Color.BLACK);
	button5.setFont(new Font("Arial", Font.PLAIN, 50));
	add(button5);
	*/
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(332, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(26))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(65, Short.MAX_VALUE))
		);
	
	button1= new JButton("");
	button1.setBackground(Color.RED);
	button1.setForeground(Color.BLACK);
	button1.setFont(new Font("Arial", Font.PLAIN, 5));
	//button5.setOpaque(false);
	//button5.setFocusPainted(false);
	button1.setBorderPainted(false);
	button1.setPreferredSize(new Dimension(20, 20));
	//button5.setContentAreaFilled(false);
	button1.setEnabled(false);
	panel_1.add(button1);
	
	
	
	button2= new JButton("");
	button2.setBackground(Color.RED);
	button2.setForeground(Color.BLACK);
	button2.setFont(new Font("Arial", Font.PLAIN, 5));
	//button5.setOpaque(false);
	//button5.setFocusPainted(false);
	button2.setBorderPainted(false);
	button2.setPreferredSize(new Dimension(20, 20));
	//button5.setContentAreaFilled(false);
	button2.setEnabled(false);
	panel_1.add(button2);
	
	
	button3= new JButton("");
	button3.setBackground(Color.RED);
	button3.setForeground(Color.BLACK);
	button3.setFont(new Font("Arial", Font.PLAIN, 5));
	//button5.setOpaque(false);
	//button5.setFocusPainted(false);
	button3.setBorderPainted(false);
	button3.setPreferredSize(new Dimension(20, 20));
	//button5.setContentAreaFilled(false);
	button3.setEnabled(false);
	panel_1.add(button3);
	
	
	
	button4= new JButton("");
	button4.setBackground(Color.RED);
	button4.setForeground(Color.BLACK);
	button4.setFont(new Font("Arial", Font.PLAIN, 5));
	//button5.setOpaque(false);
	//button5.setFocusPainted(false);
	button4.setBorderPainted(false);
	button4.setPreferredSize(new Dimension(20, 20));
	//button5.setContentAreaFilled(false);
	button4.setEnabled(false);
	panel_1.add(button4);
	
	
	button5= new JButton("");
	button5.setBackground(Color.RED);
	button5.setForeground(Color.BLACK);
	button5.setFont(new Font("Arial", Font.PLAIN, 5));
	//button5.setOpaque(false);
	//button5.setFocusPainted(false);
	button5.setBorderPainted(false);
	button5.setPreferredSize(new Dimension(20, 20));
	button5.setEnabled(false);
	//button5.setContentAreaFilled(false);
	panel_1.add(button5);
	
	button6 = new JButton("");
	button6.setBackground(Color.RED);
	button6.setForeground(Color.BLACK);
	button6.setFont(new Font("Arial", Font.PLAIN, 5));
	//button5.setOpaque(false);
	//button5.setFocusPainted(false);
	button6.setBorderPainted(false);
	button6.setPreferredSize(new Dimension(20, 20));
	button6.setEnabled(false);
	//button5.setContentAreaFilled(false);
	panel_1.add(button6);
	
	button7 = new JButton("");
	button7.setBackground(Color.RED);
	button7.setForeground(Color.BLACK);
	button7.setFont(new Font("Arial", Font.PLAIN, 5));
	//button5.setOpaque(false);
	//button5.setFocusPainted(false);
	button7.setBorderPainted(false);
	button7.setPreferredSize(new Dimension(20, 20));
	button7.setEnabled(false);
	//button5.setContentAreaFilled(false);
	panel_1.add(button7);
	
	button8 = new JButton("");
	button8.setBackground(Color.RED);
	button8.setForeground(Color.BLACK);
	button8.setFont(new Font("Arial", Font.PLAIN, 5));
	//button5.setOpaque(false);
	//button5.setFocusPainted(false);
	button8.setBorderPainted(false);
	button8.setPreferredSize(new Dimension(20, 20));
	button8.setEnabled(false);
	//button5.setContentAreaFilled(false);
	panel_1.add(button8);
	frame.getContentPane().setLayout(groupLayout);

	}
}