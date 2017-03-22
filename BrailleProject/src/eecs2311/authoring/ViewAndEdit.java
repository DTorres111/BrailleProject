package eecs2311.authoring;

/*import java.awt.EventQueue;

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

public class ShowFile implements ActionListener{

	private JFrame frame;
	JTextArea textArea = new JTextArea();
	
	/**
	 * Create the application.
	 
	
	public ShowFile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 
	private void initialize() {
		frame = new JFrame();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel, BorderLayout.WEST);
		frame.setSize(600,600);
		panel.setPreferredSize(new Dimension(150, 200));
		panel.setLayout(null);
		
		JButton viewFile = new JButton("View File");
		viewFile.setBounds(15, 34, 115, 29);
		panel.add(viewFile);
		
		JButton changeOrder = new JButton("Reorder");
		changeOrder.setBounds(15, 94, 115, 29);
		panel.add(changeOrder);
		
		JButton edit = new JButton("Remove");
		edit.setBounds(15, 156, 115, 29);
		panel.add(edit);
		
		JButton exit = new JButton("Exit");
		exit.setBounds(15, 228, 115, 29);
		panel.add(exit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
	
		textArea.setBackground(Color.PINK);
		panel_2.add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		panel_2.add(scrollBar, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.PINK);
		frame.getContentPane().add(panel_3, BorderLayout.SOUTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JFileChooser fileChooser= new JFileChooser();
		int ret= fileChooser.showOpenDialog(null);
		if(ret==JFileChooser.APPROVE_OPTION)
		{
			File f=fileChooser.getSelectedFile();
			try
			{
				FileReader r= new FileReader(f);
				textArea.read(r,"");
				
			}
			catch(Exception ee)
			{
				System.out.println("cant read");
			}
		}

		
	}
	
}
*/


import javax.swing.JFrame;
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
import java.awt.event.AdjustmentListener;
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
import javax.swing.JScrollPane;
public class ViewAndEdit extends JFrame{
	
	private JFrame frame;
	JTextArea textArea = new JTextArea();
	public ViewAndEdit(){
		

		
		frame = new JFrame();
		frame.setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel, BorderLayout.WEST);
		frame.setSize(600,600);
		frame.setLocation(600,200);
		panel.setPreferredSize(new Dimension(150, 200));
		panel.setLayout(null);
		
		JButton viewFile = new JButton("View File");
		viewFile.setBounds(15, 34, 115, 29);
		panel.add(viewFile);
		
		JButton changeOrder = new JButton("Reorder");
		changeOrder.setBounds(15, 94, 115, 29);
		panel.add(changeOrder);
		
		JButton edit = new JButton("Remove");
		edit.setBounds(15, 156, 115, 29);
		panel.add(edit);
		
		JButton exit = new JButton("Exit");
		exit.setBounds(15, 228, 115, 29);
		panel.add(exit);
		
		JButton save = new JButton("Save");
		save.setBounds(15, 300, 115, 29);
		panel.add(save);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
	
		textArea.setBackground(Color.PINK);
		textArea.setEditable(false);
		panel_2.add(textArea);
		
		JScrollPane scrollBar = new JScrollPane(textArea);
		panel_2.add(scrollBar);
		

		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.PINK);
		frame.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		viewFile.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				JFileChooser fileChooser= new JFileChooser();
				int ret= fileChooser.showOpenDialog(null);
				if(ret==JFileChooser.APPROVE_OPTION)
				{
					File f=fileChooser.getSelectedFile();
					try
					{
						FileReader r= new FileReader(f);
						textArea.read(r,"");
						
					}
					catch(Exception ee)
					{
						System.out.println("cant read");
					}
				}
			}
		});
		
		
	}
	
	
	

}
