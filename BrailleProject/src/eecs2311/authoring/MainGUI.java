package eecs2311.authoring;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridLayout;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainGUI {

	protected JFrame frame;

	/**
	 * Create the application.
	 */
	public MainGUI() {

		frame = new JFrame();
		frame.setResizable(false);
		frame.setSize(600,600);
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewFile = new JMenuItem("New File");
		mnFile.add(mntmNewFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnRun = new JMenu("Run");
		menuBar.add(mnRun);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		

		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel);
		panel.setPreferredSize(new Dimension(500, 500));
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JButton btnViewAndEdit = new JButton("View and Edit File");
		btnViewAndEdit.setBounds(187, 44, 187, 29);
		panel_1.add(btnViewAndEdit);
		
		btnViewAndEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ViewAndEdit nc= new ViewAndEdit();
			}
		});
		
		JButton btnAddToFile = new JButton("Add to File");
		btnAddToFile.setBounds(221, 119, 115, 29);
		panel_1.add(btnAddToFile);
		
		JButton btnRunFile = new JButton("Save File\r\n");
		btnRunFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRunFile.setBounds(221, 199, 115, 29);
		panel_1.add(btnRunFile);
		
	}
	
}
