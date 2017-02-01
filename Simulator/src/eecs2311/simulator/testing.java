package eecs2311.simulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Button;
import java.awt.Font;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.CardLayout;

public class testing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testing window = new testing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel cell_panel = new JPanel();
		
		JPanel button_panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(cell_panel, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
				.addComponent(button_panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(cell_panel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_panel, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
		);
		cell_panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel pin_panel1 = new JPanel();
		pin_panel1.setBorder(new LineBorder(new Color(0, 0, 0)));
		pin_panel1.setBackground(Color.YELLOW);
		cell_panel.add(pin_panel1);
		pin_panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Button button = new Button("    ");
		button.setFont(new Font("Dialog", Font.PLAIN, 10));
		pin_panel1.add(button);
		
		Button button_1 = new Button("    ");
		button_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		pin_panel1.add(button_1);
		
		JPanel pin_panel2 = new JPanel();
		pin_panel2.setBorder(new LineBorder(new Color(0, 0, 0)));
		pin_panel2.setBackground(Color.YELLOW);
		cell_panel.add(pin_panel2);
		
		JPanel pin_panel3 = new JPanel();
		pin_panel3.setBackground(Color.YELLOW);
		pin_panel3.setBorder(new LineBorder(new Color(0, 0, 0)));
		cell_panel.add(pin_panel3);
		
		JPanel panel = new JPanel();
		cell_panel.add(panel);
		
		JPanel panel_1 = new JPanel();
		cell_panel.add(panel_1);
		frame.getContentPane().setLayout(groupLayout);
	}
}
