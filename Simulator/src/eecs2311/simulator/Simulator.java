package eecs2311.simulator;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;

public class Simulator extends JFrame{

	private JFrame frame;
	private JButton pinArray[];
	private JButton btnArray[];

	/**
	 * Create the application.
	 */
	public Simulator(int buttons, int pins) {
		initialize(buttons, pins);
	}

	public JFrame getFrame(){
		return frame;
	}
	public JButton[] getButtonArray(){
		return btnArray;
	}
	public JButton[] getPinArray(){
		return pinArray;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int buttons, int pins) {
		
	/**
	 * Setting size of arrays appropriately.
	 * Max btnArray size is 15 elements.
	 * Max pinArray size is 10 elements.
	 */
		if(buttons<=15){
		btnArray= new JButton[buttons];}
		else{
			btnArray= new JButton[15];
		}
		if(pins<=10){
		pinArray= new JButton[pins];
		}else{
		pinArray= new JButton[10];
		}
		
		frame = new JFrame("Brille Device Simulator");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * Panels.
		 */
		JPanel pin_panel = new JPanel();
		pin_panel.setBackground(Color.LIGHT_GRAY);
	    JPanel button_panel = new JPanel();
	    button_panel.setBackground(Color.CYAN);
	    
		pin_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	    button_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(button_panel, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(170)
							.addComponent(pin_panel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(3)
					.addComponent(pin_panel, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(button_panel, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addGap(1))
		);
		TheHandler handler=new TheHandler();
		
		/**
		 * Creates Pins.
		 */
		for(int p=0; p<pins ;p++){
			if(p<10){
		JButton pin = new JButton("");
		pin.setEnabled(false);
		pin.setBackground(Color.RED);
		pin.setForeground(Color.RED);
		pin.setText(" ");
		pin_panel.add(pin);
		pinArray[p]=pin;
			}
		}
		
		/**
		 * Creates Buttons.
		 * Handles Events.
		 */
		for(int b=0;b<buttons;b++){
	    if(b<15){
		JButton btn = new JButton("Button "+ (b+1));
		btn.setFont(new Font("Arial", Font.BOLD, 9));
		btn.setForeground(Color.WHITE);
		btn.setBackground(Color.BLACK);
		button_panel.add(btn);
		btnArray[b]=btn;
		frame.getContentPane().setLayout(groupLayout);
		btn.addActionListener(handler);
	    }
			}
		}
	public void setPin(int pinNumbr){
		if(pinArray[pinNumbr-1].getBackground()==Color.RED){
		pinArray[pinNumbr-1].setBackground(Color.GREEN);
		}else{
		pinArray[pinNumbr-1].setBackground(Color.RED);	
		}
	}
	
	public class TheHandler implements ActionListener{

		public void actionPerformed(ActionEvent event){
			if(event.getSource()==btnArray[0]){
				System.out.println("Button 1 pressed");
			}
		}
	}
}