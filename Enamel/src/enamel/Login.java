package enamel;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	protected JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 498, 299);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterUsernameAnd = new JLabel("Enter Username and Password to Continue");
		lblEnterUsernameAnd.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblEnterUsernameAnd.setBounds(15, 16, 476, 20);
		frame.getContentPane().add(lblEnterUsernameAnd);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblUsername.setBackground(Color.PINK);
		lblUsername.setBounds(15, 67, 101, 20);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblPassword.setBounds(15, 118, 135, 20);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(146, 116, 175, 26);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(147, 65, 174, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEnter.setBackground(SystemColor.activeCaption);
		btnEnter.setBounds(185, 175, 101, 29);
		frame.getContentPane().add(btnEnter);
		
		
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			    String userName = textField.getText();
			    String userPassword = passwordField.getText();
			        if(userName.equals("EECS2311") && userPassword.equals("team5"))
			        {
			          JOptionPane.showMessageDialog(null,"Login successful!","Message",JOptionPane.INFORMATION_MESSAGE); 
			          AddToFile main= new AddToFile(); 
			          frame.dispose();
			        }
			        else 
			        {
			           JOptionPane.showMessageDialog(null,"Invalid username and password","Message",JOptionPane.ERROR_MESSAGE); 
			           textField.setText("");
			           passwordField.setText("");                       
			        }  
			       
				
			}
		});
			
	  
	}
}
