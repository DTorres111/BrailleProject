package eecs2311.simulator;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Simulator extends JFrame{

	private JFrame frame;
	private JButton pinArray[][];
	private JButton btnArray[];
	public int numberOfButtons;
	private int numberOfCells, numberOfPins;
	
	
	
	/**
	 * Create the application.
	 */
	public Simulator(int buttons, int pins, int cells) {
		initialize(buttons, pins, cells);
		numberOfButtons=buttons;
		numberOfPins=pins;
		numberOfCells= cells;
	}

	public JFrame getFrame(){
		return frame;
	}
	public JButton[] getButtonArray(){
		return btnArray;
	}
	public JButton[][] getPinArray(){
		return pinArray;
	}
	public int getNumberOfButtons()
	{
		return numberOfButtons;
	}
	
	public int getNumberOfCells()
	{
		return numberOfCells;
	}

	public int getNumberOfPins()
	{
		return numberOfPins;
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int buttons, int pins, int cells) {
		System.out.printf("Cells: %d\n", cells);
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
		if(pins<=10&&cells<=8){
		pinArray= new JButton[cells][pins];
		}else{
		pinArray= new JButton[8][10];
		}
		
		frame = new JFrame("Brille Device Simulator");
		frame.getContentPane().setBackground(new Color(150,164,228));
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1025, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * Panels.
		 */
		
		JPanel cell_panel= new JPanel();
		cell_panel.setBackground(new Color(150,164,228));
		cell_panel.setLayout(new GridLayout(1, 0, 0, 0));

	    JPanel button_panel = new JPanel();	    
	    button_panel.setBackground(new Color(45,89,135));
	    button_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	    
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(button_panel, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(cell_panel, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(3)
					.addComponent(cell_panel, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(button_panel, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addGap(1))
		);
		
		JPanel pin_panel;
		
		
		if(cells==1)
		{
			for(int i=0;i<=3;i++)
			{
			  pin_panel = new JPanel();
			  pin_panel.setBackground(new Color(150,164,228));
			  cell_panel.add(pin_panel);
			}
		}
		
		if(cells==2)
		{
			for(int i=0;i<=2;i++)
			{
			  pin_panel = new JPanel();
			  pin_panel.setBackground(new Color(150,164,228));
			  cell_panel.add(pin_panel);
			}
		}
		if(cells==3)
		{
			for(int w=0;w<=2;w++)
			{
			  pin_panel = new JPanel();
			  pin_panel.setBackground(new Color(150,164,228));
			  cell_panel.add(pin_panel);
			}
		}
		
		for(int i=0;i<cells;i++){
			
			/**
			 * Creates Cells.
			 */
		
		    pin_panel = new JPanel();
			pin_panel.setBackground(new Color(150,164,228));
			pin_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			//pin_panel.setLayout(new GridLayout(4,2,0,0));
			//pin_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			cell_panel.add(pin_panel);
			
			
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
			    pinArray[i][p]=pin;
					}
				}
		}
		
		if(cells==1)
		{
			for(int w=0;w<=3;w++)
			{
			  pin_panel = new JPanel();
			  pin_panel.setBackground(new Color(150,164,228));
			  cell_panel.add(pin_panel);
			}
		}
		
		if(cells==2)
		{
			for(int w=0;w<=2;w++)
			{
			  pin_panel = new JPanel();
			  pin_panel.setBackground(new Color(150,164,228));
			  cell_panel.add(pin_panel);
			}
		}
	
		if(cells==3)
		{
			for(int w=0;w<=2;w++)
			{
			  pin_panel = new JPanel();
			  pin_panel.setBackground(new Color(150,164,228));
			  cell_panel.add(pin_panel);
			}
		}
		/**
		 * Creates Buttons.
		 */
		for(int b=0;b<buttons;b++){
	    if(b<15){
		JButton btn = new JButton("Button "+ (b+1));
		btn.setFont(new Font("Arial", Font.BOLD, 9));
		btn.setForeground(Color.WHITE);
		btn.setBackground(Color.BLACK);
		btn.setPreferredSize(new Dimension(110,40));
		button_panel.add(btn);
		btnArray[b]=btn;
		frame.getContentPane().setLayout(groupLayout);
	    }
			}
		}

}