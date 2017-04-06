package enamel;

/*
import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class AddToFile {

	protected JFrame frame;
	JTextField e = new JTextField(10);
	JTextField d = new JTextField(10);
	JFrame frame3;
	int call;
	JButton btnButtons = new JButton("Number of Buttons");
	JButton btnCells = new JButton("Number of Cells");
	JButton btnString = new JButton("Set String");
	JButton btnChar = new JButton("Set Char");
	JButton btnMessage = new JButton("Add Message");
	JButton btnQuestion = new JButton("Add Question");
	JButton btnReorder = new JButton("Reorder scenario");
	JMenuItem newFile = new JMenuItem("New");
	JMenuItem openFile = new JMenuItem("Open");
	JMenuItem playFile = new JMenuItem("Play");
	JButton btnSound = new JButton("Add Sound");
	JButton btnEdit = new JButton("Edit scenario");
	JButton btnDelete = new JButton("Delete line");
	JButton btnSetChoices = new JButton("Set Choice Buttons");
	JButton btnRepeat = new JButton("Repeat Section");
	JButton btnChoicesScenrio = new JButton("Choice Action");
	JButton btnPause = new JButton("Pause");
	
	JButton btnResetButtons = new JButton("Reset Buttons");
	JButton btnClearAll = new JButton("Clear All");
	JButton btnSkip = new JButton("skip");
	JButton btnRecord = new JButton("Record");
	JButton btnAddLabel = new JButton("Add  Label");
	JButton btnGetUserInput = new JButton("Get User Input");
	JMenuItem saveFile = new JMenuItem("Save");
	
	private JTextField input;
	// Array to store inputs
	ArrayList<String> message = new ArrayList<String>();

	// Frame for scenario file
	JFrame realFileFrame = new JFrame();
	JTextArea sce = new JTextArea(10, 10);
	ArrayList<String> result = new ArrayList<String>();
	// text area to show progress to user
	JTextArea log = new JTextArea();

	// Frame and textfield for delete
	protected JFrame deleteFrame;
	private JTextField delTextField;
	JButton btnOk = new JButton("OK");

	// Set String Pane
	protected JFrame Stringframe;
	private JTextField stringTextField;
	JButton btnOk1 = new JButton("OK");

	// Set Char Pane
	protected JFrame charFrame;
	private final JLabel charLabel = new JLabel("Enter Cell number on which you want to add letter: ");
	private final JTextField charTextField = new JTextField();
	private final JButton btnOKAddChar = new JButton("OK");
	private final JLabel letterLabel = new JLabel("Enter Letter");
	private JTextField letterText;

	// frame for cells
	protected JFrame cellsFrame;
	private JTextField cells;

	JButton btnOkCells = new JButton("OK");

	// frame for buttons

	protected JFrame buttonsFrame;
	private JTextField buttons;

	JButton btnOkbuttons = new JButton("OK");

	// REORDER FRAME

	protected JFrame reordeFrame;
	private JTextField line1;
	private JTextField line2;
	JButton btnOkReorder = new JButton("OK");
	int reorderL1;
	int reorderL2;

	// frame for message
	protected JFrame messageFrame;
	private JTextField message1;
	JButton btnOkmessage = new JButton("OK");

	// frame for question
	protected  JFrame questionFrame;
	private JTextField question;
	JButton btnOkquestion = new JButton("OK");

	// frame for pause
	protected  JFrame pauseFrame;
	private JTextField pause1;
	JButton btnOkpause = new JButton("OK");

	// frame for repeate
	protected  JFrame repeatFrame;
	JButton btnOkrepeat = new JButton("Start Repeat");
	private final JButton btnStopRepeat = new JButton("Stop Repeat");

	// Frame for Skip
	protected  JFrame skipFrame;
	private JTextField skip;
	private JTextField skipButton;
	JButton btnOkSkip = new JButton("Ok");

	// Frame to ask button for stop

	protected JFrame stopRepeatFrame;
	private final JLabel stopButton = new JLabel("Enter Button required to Stop Repeat: ");
	private final JTextField stopTextField = new JTextField();
	private final JButton btnOKStopRepeat = new JButton("OK");

	// fram to add label
	protected  JFrame labelFrame;
	private final JLabel lableButton = new JLabel("Enter Label Where You Want To Jump On Specific Button Click: ");
	private final JTextField lableTextField = new JTextField();
	private final JButton btnOKAddLabel = new JButton("OK");
	
	
	//play frame
	protected JFrame playFrame;
	private final JButton btnOKplay = new JButton("OK");
	private final JLabel playLabel = new JLabel("Enter File name to play");
	private JTextField playText;

	////////////////////////

	int lineNumber;
	String msgToDel;
	int delIndex;
	String[] delArray;


	 

	public AddToFile() {
		initialize();
	}


	private void initialize() {

		////////////////////////////////////////// MAIN
		////////////////////////////////////////// FRAME/////////////////////////////////////////////////////
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 1600, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		menuBar.add(menu);
		
		menu.add(newFile);
		menu.add(saveFile);
		menu.add(openFile);
		menu.add(playFile);
		frame.setJMenuBar(menuBar);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);

		panel.setPreferredSize(new Dimension(200, 100));
		panel.setLayout(null);

		
		btnCells.setBounds(5, 14, 148, 29);
		panel.add(btnCells);

	
		btnButtons.setBounds(5, 61, 148, 29);
		panel.add(btnButtons);

	
		
		
		btnString.setBounds(160, 16, 114, 29);
		panel.add(btnString);

		
		btnChar.setBounds(160, 61, 104, 29);
		panel.add(btnChar);

		
		btnMessage.setBounds(282, 16, 148, 29);
		panel.add(btnMessage);

		
		btnQuestion.setBounds(270, 61, 138, 29);
		panel.add(btnQuestion);

	
		btnSound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSound.setBounds(565, 16, 137, 29);
		panel.add(btnSound);

		
		btnReorder.setBounds(434, 16, 128, 29);
		panel.add(btnReorder);

		
		btnEdit.setBounds(1350, 61, 128, 29);
		panel.add(btnEdit);

		
		btnDelete.setBounds(565, 61, 128, 29);
		panel.add(btnDelete);

		
		btnRepeat.setBounds(708, 61, 153, 29);
		panel.add(btnRepeat);

		
		btnSetChoices.setBounds(1230, 16, 175, 29);
		panel.add(btnSetChoices);

		
		btnChoicesScenrio.setBounds(1062, 16, 153, 29);
		panel.add(btnChoicesScenrio);

		JComboBox comboBox = new JComboBox<String>();
		comboBox.addItem("Select Voice");
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.setBounds(708, 17, 122, 26);
		panel.add(comboBox);

		
		btnPause.setBounds(1157, 61, 80, 29);
		panel.add(btnPause);

		
		
		btnResetButtons.setBounds(913, 16, 134, 29);
		panel.add(btnResetButtons);

		
		btnClearAll.setBounds(876, 61, 104, 29);
		panel.add(btnClearAll);

	
		btnSkip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSkip.setBounds(838, 16, 68, 29);
		panel.add(btnSkip);

		
		btnRecord.setBounds(1252, 61, 88, 29);
		panel.add(btnRecord);

		
		btnAddLabel.setBounds(423, 61, 127, 29);
		panel.add(btnAddLabel);

		
		btnGetUserInput.setBounds(991, 61, 153, 29);
		panel.add(btnGetUserInput);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		panel_1.add(log, BorderLayout.CENTER);
		log.setLineWrap(true);
		log.setEditable(false);

		log.setBounds(5, 35, 800, 330);

		JScrollPane scrollBar = new JScrollPane(log);
		scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		TextLineNumber tln = new TextLineNumber(log);
		scrollBar.setRowHeaderView(tln);
		panel_1.add(scrollBar, BorderLayout.EAST);
		frame.getContentPane().add(scrollBar);

		///////////////////////////////////////// SCENARIO FILE
		///////////////////////////////////////// FRAME/////////////////////////////////

		realFileFrame.setVisible(true);

		sce.setLineWrap(true);
		sce.setEditable(false);
		JScrollPane scroll = new JScrollPane(sce);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		TextLineNumber tlne = new TextLineNumber(sce);
		scroll.setRowHeaderView(tlne);
		realFileFrame.add(scroll);
		sce.setText(String.join("\n", result));

		//////////////////////////// ACTION TO ADD
		//////////////////////////// CELLS///////////////////////////

		btnCells.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cellsFrame = new JFrame();
				cellsFrame.setVisible(true);
				cellsFrame.setBounds(100, 100, 566, 135);
				cellsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				cellsFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				cellsFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter Number of Cells: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(42, 16, 198, 32);
				panel.add(lblEnterLineNumber);

				cells = new JTextField();
				cells.setBounds(255, 19, 82, 26);
				panel.add(cells);
				cells.setColumns(10);

				btnOkCells.setBounds(370, 18, 59, 29);
				panel.add(btnOkCells);
			}
		});

		btnOkCells.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("cells: " + cells.getText());
				result.add("Cells " + cells.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				cellsFrame.dispose();

			}
		});

		//////////////////////////// ACTION TO ADD
		//////////////////////////// BUTTONS///////////////////////////

		btnButtons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonsFrame = new JFrame();
				buttonsFrame.setVisible(true);
				buttonsFrame.setBounds(100, 100, 566, 135);
				buttonsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				buttonsFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				buttonsFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter Number of Buttons: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(42, 16, 198, 32);
				panel.add(lblEnterLineNumber);

				buttons = new JTextField();
				buttons.setBounds(255, 19, 82, 26);
				panel.add(buttons);
				buttons.setColumns(10);

				btnOkbuttons.setBounds(370, 18, 59, 29);
				panel.add(btnOkbuttons);
			}
		});

		btnOkbuttons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("Buttons: " + buttons.getText());
				result.add("Buttons " + buttons.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				buttonsFrame.dispose();

			}
		});

		////////// Action listeners for menu items////////////////////////

		saveFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveAs();
			}
		});

		openFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openButton();
			}
		});

		newFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NEW();
			}
		});
		
		
		
.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				playFrame= new JFrame();
				playFrame.setVisible(true);
				playFrame.setBounds(100, 100, 566, 161);
				playFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				playFrame.getContentPane().setLayout(new BorderLayout(0, 0));
				
				JPanel panel = new JPanel();
				playFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);
				btnOKplay.setBackground(SystemColor.activeCaption);
				btnOKplay.setBounds(454, 50, 53, 29);
				
				panel.add(btnOKplay);
				playLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
				playLabel.setBounds(15, 33, 210, 20);
				
				panel.add(playLabel);
				
				playText = new JTextField();
				playText.setBounds(267, 30, 146, 26);
				panel.add(playText);
				playText.setColumns(10);
			
			}
		});
		
		
		
			btnOKplay.addActionListener(new ActionListener()
					{
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					SoundPlayer s = new SoundPlayer();
			        s.setScenarioFile("SampleScenarios/"+playText.getText());
				
					}
					});
			
			
		// Message Action Listener

		btnMessage.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				messageFrame = new JFrame();
				messageFrame.setVisible(true);

				messageFrame.setBounds(100, 100, 566, 135);

				messageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				messageFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				messageFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter Message: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(42, 16, 198, 32);
				panel.add(lblEnterLineNumber);

				message1 = new JTextField();
				message1.setBounds(255, 19, 82, 26);
				panel.add(message1);
				message1.setColumns(10);

				btnOkmessage.setBounds(370, 18, 59, 29);
				panel.add(btnOkmessage);

			}

		});

		btnOkmessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("Message: " + message1.getText());
				result.add(message1.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				messageFrame.dispose();

			}
		});

		//////////////////// QUESTION ACTION
		//////////////////// LISTENER/////////////////////////////

		// Message Action Listener

		btnQuestion.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				questionFrame = new JFrame();
				questionFrame.setVisible(true);

				questionFrame.setBounds(100, 100, 566, 135);

				questionFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				questionFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				questionFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter Question: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(42, 16, 198, 32);
				panel.add(lblEnterLineNumber);

				question = new JTextField();
				question.setBounds(255, 19, 82, 26);
				panel.add(question);
				question.setColumns(10);

				btnOkquestion.setBounds(370, 18, 59, 29);
				panel.add(btnOkquestion);

			}

		});

		btnOkquestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("Question: " + question.getText());
				result.add(question.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n" + result));
				questionFrame.dispose();

			}
		});

		//////////////////// PAUSE ACTION LISTENER/////////////////////////////

		// pauseAction Listener

		btnPause.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				pauseFrame = new JFrame();
				pauseFrame.setVisible(true);

				pauseFrame.setBounds(100, 100, 566, 135);

				pauseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				pauseFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				pauseFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter Time for Pause: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(42, 16, 198, 32);
				panel.add(lblEnterLineNumber);

				pause1 = new JTextField();
				pause1.setBounds(255, 19, 82, 26);
				panel.add(pause1);
				pause1.setColumns(10);

				btnOkpause.setBounds(370, 18, 59, 29);
				panel.add(btnOkpause);

			}

		});

		btnOkpause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("Pause: " + pause1.getText());
				result.add("/~pause:" + pause1.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				pauseFrame.dispose();

			}
		});

		// delete action listener

		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/////////////////////// FRAME FOR CONFIRMING
				/////////////////////// DELETION////////////////////////////

				deleteFrame = new JFrame();
				deleteFrame.setVisible(true);
				deleteFrame.setBounds(100, 100, 609, 171);
				deleteFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				deleteFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				deleteFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter Line Number To Delete: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(50, 45, 237, 32);
				panel.add(lblEnterLineNumber);

				delTextField = new JTextField();
				delTextField.setBounds(302, 48, 146, 26);
				panel.add(delTextField);
				delTextField.setColumns(10);

				btnOk.setBackground(SystemColor.activeCaption);
				btnOk.setBounds(472, 47, 86, 29);
				panel.add(btnOk);

			}
		});

		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call=1;
				String as = delTextField.getText();
				String bs = lineNumber(as);
				if (bs.equals("true")) {
					lineNumber = Integer.parseInt(as) - 1;
					msgToDel = message.get(lineNumber);
					delIndex = deletionIndex();
					delArray = msgToDel.split(" ", 2);
					char one = msgToDel.charAt(0);
					if (one == 'M' || one == 'Q') {
						scenario2();
						message.remove(lineNumber);
					} else if (one == 'S') {
						deleteString();
					} else if (one == 's') {
						deleteSound();
					} else if (one == 'V') {
						deleteVoice();
					}

					deleteFrame.dispose();
					displayLog();
				}

			}
		});

		//// SOund Action Listener///////
		btnSound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundbutton();
			}
		});

		// Voice Action Listener/////////////
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = (String) comboBox.getSelectedItem();

				message.add("Voice: " + comboBox.getSelectedItem());
				result.add("/~set-voice:" + comboBox.getSelectedItem());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));

			}
		});

		///////////////////////// USER INPUT
		///////////////////////// ACTIONLISTENER/////////////////////////

		btnGetUserInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("Wait for user input here");
				result.add("/~user-input");
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));

			}
		});

		////////////// ///Action listener to set string///////////////////////

		btnString.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Stringframe = new JFrame();
				Stringframe.setVisible(true);
				Stringframe.setBounds(100, 100, 609, 171);
				Stringframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				Stringframe.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				Stringframe.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter String to set: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(50, 45, 237, 32);
				panel.add(lblEnterLineNumber);

				stringTextField = new JTextField();
				stringTextField.setBounds(302, 48, 146, 26);
				panel.add(stringTextField);
				stringTextField.setColumns(10);

				btnOk1.setBackground(SystemColor.activeCaption);
				btnOk1.setBounds(472, 47, 86, 29);
				panel.add(btnOk1);

			}
		});

		btnOk1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("String: " + stringTextField.getText());
				result.add("/~disp-string:" + stringTextField.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				Stringframe.dispose();

			}
		});

		////////////// ///Action listener to set Char///////////////////////

		btnChar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				charTextField.setBounds(433, 14, 74, 26);
				charTextField.setColumns(10);
				charFrame = new JFrame();
				charFrame.setVisible(true);
				charFrame.setBounds(100, 100, 566, 161);
				charFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				charFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				charFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);
				charLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
				charLabel.setBounds(15, 16, 394, 22);


				panel.add(charLabel);

				panel.add(charTextField);
				btnOKAddChar.setBackground(SystemColor.activeCaption);
				btnOKAddChar.setBounds(454, 50, 53, 29);

				panel.add(btnOKAddChar);
				letterLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
				letterLabel.setBounds(15, 54, 110, 20);

				panel.add(letterLabel);

				letterText = new JTextField();
				letterText.setBounds(155, 54, 60, 26);
				panel.add(letterText);
				letterText.setColumns(10);

			}
		});

		btnOKAddChar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("Char: " + letterText.getText() + " Cell: " + charTextField.getText());
				String a = "/~disp-cell-char:" + charTextField.getText() + " " + letterText.getText();
				result.add(a);
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				charFrame.dispose();

			}
		});

		///////////////////// ACTOION LISTENER TO ADD
		///////////////////// SOUND///////////////////////

		btnSound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser("Audio Files");
				int ret = fileChooser.showOpenDialog(null);
				if (ret == JFileChooser.APPROVE_OPTION) {
					File f = fileChooser.getSelectedFile();
					try {

						message.add("Sound to Play: " + f.getName());
						String a = ("/~sound:" + f.getName());
						result.add(a);
						log.setText(String.join("\n", message));
						sce.setText(String.join("\n", result));

					} catch (Exception ee) {
						System.out.println("cant read");
					}
				}

			}
		});

		///////////////////// ACTOION LISTENER TO RESET
		///////////////////// BUTTONS///////////////////////

		btnResetButtons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("Reset all the buttons");
				result.add("/~reset-buttons");
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));

			}
		});

		///////////////////// ACTOION LISTENER TO CLEAR
		///////////////////// ALL///////////////////////

		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("clear All the Braille Cells");
				result.add("/~disp-clearAll");
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));

			}
		});

		//////////////////////// ACTION LISTENER TO ADD LABEL/////////////////

		btnAddLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lableTextField.setBounds(246, 54, 116, 26);
				lableTextField.setColumns(10);
				labelFrame = new JFrame();
				labelFrame.setVisible(true);
				labelFrame.setBounds(100, 100, 566, 161);
				labelFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				labelFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				labelFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);
				lableButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
				lableButton.setBounds(15, 16, 514, 22);

				panel.add(lableButton);

				panel.add(lableTextField);
				btnOKAddLabel.setBounds(402, 54, 53, 29);

				panel.add(btnOKAddLabel);

			}
		});

		//////////////// ACTION LISTENER TO ADD LABLE OK
		//////////////// BUTTON//////////////////////

		btnOKAddLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("Label to jump on request: " + lableTextField.getText());
				result.add("/~" + lableTextField.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				labelFrame.dispose();

			}
		});

		///////////////////// ACTOION LISTENER TO SKIP///////////////////////

		btnSkip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skipFrame = new JFrame();
				skipFrame.setVisible(true);
				skipFrame.setBounds(100, 100, 566, 241);
				skipFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				skipFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				skipFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblSkipTo = new JLabel("Skip To");
				lblSkipTo.setBounds(71, 105, 69, 20);
				panel.add(lblSkipTo);

				JLabel lblButtonForSkip = new JLabel("Button For Skip");
				lblButtonForSkip.setBounds(71, 51, 135, 20);
				panel.add(lblButtonForSkip);

				skip = new JTextField();
				skip.setBounds(221, 48, 146, 26);
				panel.add(skip);
				skip.setColumns(10);

				skipButton = new JTextField();
				skipButton.setBounds(221, 102, 146, 26);
				panel.add(skipButton);
				skipButton.setColumns(10);

				btnOkSkip.setBackground(SystemColor.activeCaption);
				btnOkSkip.setBounds(447, 16, 82, 29);
				panel.add(btnOkSkip);

			}
		});

		//////////////////////// ACTIONLISTENER TO
		//////////////////////// REPEAT////////////////////////

		btnRepeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repeatFrame = new JFrame();
				repeatFrame.setVisible(true);
				repeatFrame.setBounds(100, 100, 566, 241);
				repeatFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				repeatFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				repeatFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				btnOkrepeat.setBackground(SystemColor.activeCaption);
				btnOkrepeat.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});

				btnOkrepeat.setBounds(225, 16, 125, 29);
				panel.add(btnOkrepeat);
				btnStopRepeat.setBackground(SystemColor.activeCaption);
				btnStopRepeat.setBounds(225, 85, 125, 29);

				panel.add(btnStopRepeat);

			}
		});

		/////////////////////// IF SELECT TO START
		/////////////////////// REPEAT////////////////////////
		btnOkrepeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("Repeat From here");
				result.add("/~repeat");
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				repeatFrame.dispose();

			}
		});

		/////////////////////// IF SELECT TO STOP REPEAT////////////////////////
		btnStopRepeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("End Repeat here");
				result.add("/~endrepeat");
				stopTextField.setBounds(330, 35, 86, 26);
				stopTextField.setColumns(10);
				stopRepeatFrame = new JFrame();
				stopRepeatFrame.setVisible(true);
				stopRepeatFrame.setBounds(100, 100, 566, 161);
				stopRepeatFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				stopRepeatFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				stopRepeatFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);
				stopButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
				stopButton.setBounds(15, 37, 300, 22);

				btnOKStopRepeat.setBounds(443, 34, 53, 29);

				panel.add(stopButton);
				panel.add(stopTextField);
				panel.add(stopTextField);
				panel.add(btnOKStopRepeat);

			}
		});

		////////////// WHEN PRESS THE BUTTON TO ADD STOP BUTTON FOR
		////////////// REPEAT/////////////////

		btnOKStopRepeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.add("");
				int a = Integer.parseInt(stopTextField.getText()) - 1;
				String b = Integer.toString(a);
				result.add("/~repeat-button:" + b);
				message.add("correct Button for repeat: " + stopTextField.getText());

				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				repeatFrame.dispose();
				stopRepeatFrame.dispose();
			}
		});

		///////////////////// ACTOION LISTENER TO CONFIRM
		///////////////////// SKIP///////////////////////

		btnOkSkip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add(" Skip to " + skip.getText() + " if button " + skipButton.getText() + " Clciked");
				result.add("//~skip-button:" + skipButton.getText() + skip.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
			}
		});

		///////////////////// ACTOION LISTENER TO REORDER///////////////////////

		btnReorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reorder();
			}
		});

		btnOkReorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reorderConfirm();
			}
		});

		// RECORD/////////////

		btnRecord.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
		 Record rc= new Record();
		 }
		 });

		//////////////////////////////////// Action Listener for Set
		//////////////////////////////////// Choices/////////////////////////

		btnChoicesScenrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choice();
			}
		});

		/////////////////////////////////// Action Listner for edit scnario
		/////////////////////////////////// button//////////////
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edit();
			}
		});
		
		btnSetChoices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choices();
			}
		});

	}

	///////////// Code to save File///////////////////////

	public void saveAs()  {
		FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Text File", "txt");
		final JFileChooser saveAsFileChooser = new JFileChooser();
		saveAsFileChooser.setApproveButtonText("Save");
		saveAsFileChooser.setFileFilter(extensionFilter);
		int actionDialog = saveAsFileChooser.showOpenDialog(log);
		if (actionDialog != JFileChooser.APPROVE_OPTION) {
			return;
		}

		// !! File fileName = new File(SaveAs.getSelectedFile() + ".txt");
		
		File file = saveAsFileChooser.getSelectedFile();
		if (!file.getName().endsWith(".txt")) {
			file = new File(file.getAbsolutePath() + ".txt");
			
			
			BufferedWriter outFile1 = null;
			File newfile= new File("SampleScenarios//"+file.getName());
			
			try {
				outFile1 = new BufferedWriter(new FileWriter(newfile));
			
			sce.write(outFile1);}
			catch (IOException ex1) {
				ex1.printStackTrace();
			}
		}

		BufferedWriter outFile = null;
		try {
			outFile = new BufferedWriter(new FileWriter(file));

			log.write(outFile);
			

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (outFile != null) {
				try {
					outFile.close();
				} catch (IOException e) {
				}
			}
		}
	}

	
	
	
	///////////////////////////// CODE TO OPEN NEW
	///////////////////////////// FILE////////////////////////////////

	public void openButton() {
		call=1;
		JFileChooser fileChooser = new JFileChooser();
		int ret = fileChooser.showOpenDialog(null);
		if (ret == JFileChooser.APPROVE_OPTION) {
			File f = fileChooser.getSelectedFile();
			try {
				FileReader r = new FileReader(f);
				log.read(r, "");

			} catch (Exception ee) {
				System.out.println("cant read");
			}
		}
	}

	///////////////////////////////// CODE TO CREATE NEW
	///////////////////////////////// FILE/////////////////////////////////////
	public void NEW() {

		call=1;
		int selectedOption = JOptionPane.showConfirmDialog(null, "Do you wanna close the window?", "Choose",
				JOptionPane.YES_NO_OPTION);
		if (selectedOption == JOptionPane.YES_OPTION) {
			message.clear();
			log.setText("");
		}

	}

	//////////////////////////////// GET INDEX OF LINE TO DELETE FORM
	//////////////////////////////// ARRAY/////////////////////////////

	public int deletionIndex() {
		int i = 1;

		for (int start = 0; start < lineNumber; start++) {
			if (message.get(start).equals(msgToDel)) {
				i++;
			}
		}
		return i;
	}

	/////////////////////////////////////// Delete//////////////////////////////////

	public void scenario2() {

		String res = delArray[1];
		int a = 0;

		if (delIndex - 1 == 0) {

			int b = result.indexOf(delArray[1]);
			result.remove(b);
		} else {

			for (int i = 0; delIndex != a; i++) {
				if (result.get(i).equals(res)) {
					a++;
					if (a == delIndex) {
						result.remove(i);
					}
				}

			}
		}

	}

	///////////////////////// SOUND//////////////////////////////
	public void soundbutton() {
		message.add("sound added");
		result.add("/~sound:");
	}

	///////////////////////////////// RE ORDER METHOD
	///////////////////////////////// ///////////////////////////////////

	public void reorder() {

		reordeFrame = new JFrame();
		reordeFrame.setVisible(true);
		reordeFrame.setBounds(100, 100, 629, 204);
		reordeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		reordeFrame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		reordeFrame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblEnterLineNumber = new JLabel("Enter Line number to swap: ");
		lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblEnterLineNumber.setBounds(42, 16, 198, 32);
		panel.add(lblEnterLineNumber);

		line1 = new JTextField();
		line1.setBounds(330, 19, 97, 26);
		panel.add(line1);
		line1.setColumns(10);

		btnOkReorder.setBounds(510, 18, 82, 29);
		panel.add(btnOkReorder);

		JLabel lblEnterLineNumber_1 = new JLabel("Enter line number to swap with");
		lblEnterLineNumber_1.setBounds(42, 82, 229, 20);
		panel.add(lblEnterLineNumber_1);

		line2 = new JTextField();
		line2.setBounds(330, 79, 97, 26);
		panel.add(line2);
		line2.setColumns(10);

	}

	public void reorderConfirm() {
		String ist = line1.getText();
		String sec = line2.getText();
		reorderL1 = Integer.parseInt(ist) - 1;
		reorderL2 = Integer.parseInt(sec) - 1;
		String msg1 = message.get(reorderL1);
		String msg2 = message.get(reorderL2);
		getLine1();
		getLine2();
		replaceL1andL2();
		message.set(reorderL1, msg2);
		message.set(reorderL2, msg1);
		reordeFrame.dispose();
		displayLog();

	}

	public int getLine1() {
		int i = 1;

		for (int start = 0; start < reorderL1; start++) {

			if (message.get(start).equals(message.get(reorderL1))) {
				i++;
			}
		}
		return i;
	}

	public int getLine2() {
		int i = 1;
		for (int start = 0; start < reorderL2; start++) {

			if (message.get(start).equals(message.get(reorderL2))) {
				i++;
			}
		}
		return i;
	}

	public void replaceL1andL2() {
		int a = getLine1();
		int b = getLine2();
		String c = message.get(reorderL1);
		String d = message.get(reorderL1);
		String[] e = c.split(" ", 2);
		String[] f = d.split(" ", 2);
		int x = 0;
		int alpha = 0;
		int beta = 0;
		int aaa = 0;
		if (a - 1 == 0 && b - 1 == 0) {
			int g = result.indexOf(e[1]);
			int h = result.indexOf(f[1]);
			result.set(g, f[1]);
			result.set(h, e[1]);
		}

		else if (a - 1 == 0 && b - 1 != 0) {
			for (int i = 0; b != x; i++) {

				if (result.get(i).equals(f[1])) {
					x++;
					if (x == b) {
						int hh = result.indexOf(e[1]);
						result.set(hh, f[1]);
						result.set(i, e[1]);
					}
				}
			}
		}

		else if (a - 1 != 0 && b - 1 == 0) {
			for (int i = 0; a != x; i++) {

				if (result.get(i).equals(e[1])) {
					x++;
					if (x == a) {
						int hh = result.indexOf(f[1]);
						result.set(hh, e[1]);
						result.set(i, f[1]);
					}
				}
			}
		} else {
			for (int i = 0; a != x; i++) {

				if (result.get(i).equals(e[1])) {
					x++;
					if (x == a) {
						alpha = i;
					}
				}

			}

			for (int i = 0; b != aaa; i++) {

				if (result.get(i).equals(f[1])) {
					aaa++;
					if (x == b) {
						beta = i;
					}
				}

			}
			result.set(alpha, f[1]);
			result.set(beta, e[1]);
			System.out.println(alpha + "/n" + beta);
		}
	}

	public void displayLog() {
		log.setText(String.join("\n", message));

	}

	public void displaySce() {

		sce.setText(String.join("\n", message));
	}

	///////////////////////////////////////////// METHOD TO SET
	////////////////////////;///////////////////// CHOICES////////////////////////////////

	public void choices() {
		call=1;
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel(new GridBagLayout());
		JTextField d = new JTextField(10);
		JLabel e = new JLabel("Button for correct choice:");
		JTextField f = new JTextField(10);
		JLabel g = new JLabel("Button for wrong choice:");
		JButton ok = new JButton("OK");
		GridBagConstraints gg = new GridBagConstraints();
		gg.weightx = 0;
		gg.gridx = 1;
		gg.gridy = 1;
		panel.add(d, gg);

		gg.gridx = 0;
		gg.gridy = 1;
		panel.add(e, gg);

		gg.gridx = 0;
		gg.gridy = 0;
		panel.add(f, gg);

		gg.gridx = 1;
		gg.gridy = 0;
		panel.add(g, gg);

		gg.gridx = 2;
		gg.gridy = 1;
		panel.add(ok, gg);

		frame.add(panel);

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("Button " + d.getText() + " set as correct option.");
				message.add("Button " + f.getText() + " set as incorrect option.");
				int a = Integer.parseInt(d.getText()) - 1;
				int b = Integer.parseInt(f.getText()) - 1;
				String c = Integer.toString(a);
				String d = Integer.toString(b);
				result.add("/~skip-button:" + c + " ONEE");
				result.add("/~skip-button:" + d + " TWOO");
				result.add("/~user-input");
				result.add("");
			}
		});

	}

	public String lineNumber(String b) {
		int a = message.size();
		int c = Integer.parseInt(b);
		String ab;
		if (c <= a) {
			ab = "true";
			return ab;
		} else {
			ab = "false";
			return ab;
		}

	}

	// methods for all the delete types
	public void deleteString() {
		int number = deletionIndex();
		String res = delArray[1];
		int c = 0;
		if (number - 1 == 0) {
			int b = result.indexOf("/~disp-string:" + res);
			result.remove(b);
			message.remove(lineNumber);

		} else {

			for (int i = 0; number != c; i++) {

				if (result.get(i).equals("/~disp-string:" + res)) {
					c++;
					if (c == number) {
						result.remove(i);
						message.remove(lineNumber);
					}
				}

			}
		}
	}

	public void deleteVoice() {
		int number = deletionIndex();
		String res = delArray[1];
		int c = 0;
		if (number - 1 == 0) {
			int b = result.indexOf("/~set-voice:" + res);
			result.remove(b);
			message.remove(lineNumber);

		} else {

			for (int i = 0; number != c; i++) {

				if (result.get(i).equals("/~set-voice:" + res)) {
					c++;
					if (c == number) {
						result.remove(i);
						message.remove(lineNumber);
					}
				}

			}
		}
	}

	public void deleteSound() {
		int number = deletionIndex();
		String res = delArray[1];
		int c = 0;
		if (number - 1 == 0) {
			int b = result.indexOf("/~sound:" + res);
			result.remove(b);
			message.remove(lineNumber);

		} else {

			for (int i = 0; number != c; i++) {

				if (result.get(i).equals("/~sound:" + res)) {
					c++;
					if (c == number) {
						result.remove(i);
						message.remove(lineNumber);
					}
				}

			}
		}
	}

	// methods for edit button

	public void editVoice() {
		if (d.getText().equals("1") || d.getText().equals("2") || d.getText().equals("3") || d.getText().equals("4")) {
			int number = scenario3();
			int e = 0;
			String w = message.get(lineNumber);
			String[] y = w.split(" ", 2);
			if (number - 1 == 0) {
				int num = result.indexOf("/~set-voice:" + y[1]);
				result.set(num, "/~set-voice:" + d.getText());
				message.set(lineNumber, "Voice: " + d.getText());
			} else {
				for (int i = 0; number != e; i++) {
					if (result.get(i).equals("/~set-voice:" + y[1])) {
						e++;
						if (e == number) {
							result.set(i, "/~set-voice:" + d.getText());
							message.set(lineNumber, "Voice: " + d.getText());
						}
					}
				}
			}
		}

	}

	public void editSound() {
		
	
				JFileChooser fileChooser = new JFileChooser("Audio Files");
				int ret = fileChooser.showOpenDialog(null);
				if (ret == JFileChooser.APPROVE_OPTION) {
					File f = fileChooser.getSelectedFile();
					try {

						
						
						
						
						int number = scenario3();
						int e = 0;
						String w = message.get(lineNumber);
						String[] y = w.split(" ", 2);
						if (number - 1 == 0) {
							int num = result.indexOf("/~sound:" + y[1]);
								
								
								
							// here I want you to add the file name that the user selected above
							// eg:result.set(num,"/~sound:"+the filename of sound the user
							// added)
							result.set(num, "/~sound:" + f.getName());
							// here I want you to add the file name that the user selected above
							// eg:message.set(c,"sound: "+the filename of sound the user added)
							message.set(lineNumber, "sound: " + f.getName());
							// just replace d.getText() with the filename user is selecting
						} else {
							for (int i = 0; number != e; i++) {
								if (result.get(i).equals("/~sound:" + y[1])) {
									e++;
									if (e == number) {
										// here I want you to add the file name that the user
										// selected above eg:result.set(num,"/~sound:"+the
										// filename of sound the user added)
										result.set(i, "/~sound:" + f.getName());
										// here I want you to add the file name that the user
										// selected above eg:message.set(c,"sound: "+the
										// filename of sound the user added)
										message.set(lineNumber, "sound: " + f.getName());
									}
								}
							}
						}
						
						
				/*		message.add("Sound to Play: " + f.getName());
						String a = ("/~sound:" + f.getName());
						result.add(a);
						log.setText(String.join("\n", message));
						sce.setText(String.join("\n", result));

					} catch (Exception ee) {
						System.out.println("cant read");
					}
				}

		
		
		// here I want you to call the sound gui frame that comes when we press
		// the sound button
		// from that box the user will select the new sound he wants to add in
		// place of the current one
		// in this part basically we are not reading anything from the textfield
		// so the user can type anything in the message bar dosent matter once
		// it realises that the line the user wants to edit is actually a sound
		// file it will open the sound dialouge box once the user clicks ok on
		// the edit JFrame cause we cant make the user type the sound file name
		// as he might make mistake or maybe don't even remember
		

	}

	public void editString() {
		int number = scenario3();
		int e = 0;
		String w = message.get(lineNumber);
		String[] y = w.split(" ", 2);
		if (number - 1 == 0) {
			int num = result.indexOf("/~disp-string:" + y[1]);
			result.set(num, "/~disp-string:" + d.getText());
			message.set(lineNumber, "String: " + d.getText());
		} else {
			for (int i = 0; number != e; i++) {
				if (result.get(i).equals("/~disp-string:" + y[1])) {
					e++;
					if (e == number) {
						result.set(i, "/~disp-string:" + d.getText());
						message.set(lineNumber, "String: " + d.getText());
					}
				}
			}
		}

	}

	public int scenario3() {
		int i = 1;

		for (int start = 0; start < lineNumber; start++) {

			if (message.get(start).equals(message.get(lineNumber))) {
				i++;
			}
		}
		return i;
	}

	public void scenario4() {
		int number = scenario3();
		int e = 0;
		String w = message.get(lineNumber);
		String[] y = w.split(" ", 2);
		if (number - 1 == 0) {
			int b = result.indexOf(y[1]);
			result.set(b, d.getText());
		} else {
			for (int i = 0; number != e; i++) {

				if (result.get(i).equals(y[1])) {
					e++;
					if (e == number) {
						result.set(i, d.getText());
					}
				}

			}
		}
	}

	//////// edit method called in the edit button action listner

	public void edit() {

		frame3 = new JFrame();
		frame3.setVisible(true);
		JPanel panel3 = new JPanel(new GridBagLayout());
		JLabel h = new JLabel("Enter the line number of the question/message you want to edit");
		JLabel i = new JLabel("Enter the question/message");
		JButton oki = new JButton("ok");
		GridBagConstraints gg = new GridBagConstraints();

		gg.weightx = 0;
		gg.gridx = 0;
		gg.gridy = 0;
		panel3.add(h, gg);

		gg.gridx = 0;
		gg.gridy = 1;
		panel3.add(i, gg);

		gg.gridx = 1;
		gg.gridy = 0;
		panel3.add(e, gg);

		gg.gridx = 1;
		gg.gridy = 1;
		panel3.add(d, gg);

		gg.gridx = 3;
		gg.gridy = 2;
		panel3.add(oki, gg);
		frame3.add(panel3);

		oki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oki();
			}
		});

	}

	public void oki() {
		String b = e.getText();
		String dcc = lineNumber(b);
		if (dcc.equals("true")) {
			lineNumber = Integer.parseInt(b) - 1;
			String f = message.get(lineNumber);
			char one = f.charAt(0);

			if (one == 'M' || one == 'Q') {
				scenario3();
				scenario4();
				char e = f.charAt(0);

				if (e == 'M') {
					String a = "Message: " + d.getText();
					message.set(lineNumber, a);
				} else if (e == 'Q') {
					String a = "Question: " + d.getText();
					message.set(lineNumber, a);
				} else if (e == 'S') {
					String a = "String: " + d.getText();
					message.set(lineNumber, a);
				}
			} else if (one == 'S') {
				editString();
			} else if (one == 's') {
				editSound();
			} else if (one == 'V') {
				editVoice();
			}

			frame3.dispose();
			frame.setVisible(true);
			displayLog();

		}

	}
	
	// methods for the set choice button action listner
	public void choice() {
		call=1;
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel(new GridBagLayout());
		JLabel e = new JLabel(
				"Type in al the details for the correct/incorrect scenario. Be sure to make no mistake as this part cannot be edited later.");
		JLabel a = new JLabel("Scenario for correct option");
		JLabel g = new JLabel("Button for correct option(Just type in button number):");
		JTextField h = new JTextField(10);
		JLabel c = new JLabel("Add sound by pressing sound button");
		JLabel d = new JLabel("Type any message here:");
		JTextField f = new JTextField(10);
		JLabel b = new JLabel("Scenario for incorrect option");
		JLabel i = new JLabel("Button for incorrect option(Just type in button number):");
		JTextField j = new JTextField(10);
		JLabel k = new JLabel("Add sound by pressing sound button");
		JLabel l = new JLabel("Type any message here:");
		JTextField m = new JTextField(10);
		JButton ok = new JButton("Ok");

		GridBagConstraints gg = new GridBagConstraints();

		gg.weightx = 0;

		gg.gridx = 0;
		gg.gridy = 10;
		panel.add(e, gg);

		gg.gridx = 0;
		gg.gridy = 9;
		panel.add(a, gg);

		gg.gridx = 0;
		gg.gridy = 8;
		panel.add(g, gg);

		gg.gridx = 1;
		gg.gridy = 8;
		panel.add(h, gg);

		gg.gridx = 0;
		gg.gridy = 7;
		panel.add(c, gg);

		gg.gridx = 1;
		gg.gridy = 7;
	//	panel.add(sound, gg);  again make a new sound button and add action listner to it

		gg.gridx = 0;
		gg.gridy = 6;
		panel.add(d, gg);

		gg.gridx = 1;
		gg.gridy = 6;
		panel.add(f, gg);

		gg.gridx = 0;
		gg.gridy = 5;
		panel.add(b, gg);

		gg.gridx = 0;
		gg.gridy = 4;
		panel.add(i, gg);

		gg.gridx = 1;
		gg.gridy = 4;
		panel.add(j, gg);

		gg.gridx = 0;
		gg.gridy = 3;
		panel.add(k, gg);

		gg.gridx = 1;
		gg.gridy = 3;
		//panel.add(sound, gg); please make a new sound button for this part and then an action listner which will open the sound window

		gg.gridx = 0;
		gg.gridy = 2;
		panel.add(l, gg);

		gg.gridx = 1;
		gg.gridy = 2;
		panel.add(m, gg);

		gg.gridx = 0;
		gg.gridy = 1;
		panel.add(ok, gg);

		frame.add(panel);

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("Correct scenario added.");
				message.add("sound: ");
				message.add("Message: " + f.getText());
				if (h.getText().equals("1")) {
					result.add("/~ONEE");
					result.add("/~sound:");
					result.add(f.getText());
					//result.add("/~skip:NEXTT");
					//result.add("");
				} else if (h.getText().equals("2")) {
					result.add("/~TWOO");
					result.add("/~sound:");
					result.add(f.getText());
					//result.add("/~skip:NEXTT");
					//result.add("");
				}

				message.add("Incorrect scenario added.");
				message.add("sound: ");
				message.add("Message: " + m.getText());
				
				
				if (j.getText().equals("2")) {
					result.add("/~TWOO");
					result.add("/~sound:");
					result.add(m.getText());
					result.add("/~skip:NEXTT");
				} else if (j.getText().equals("1")) {
					result.add("/~ONEE");    
					result.add("/~sound:");
					result.add(m.getText());
				//	result.add("/~skip:NEXTT");
				}

			//	result.add("");
			//	result.add("/~NEXTT");
			//	result.add("");
			//	result.add("/~disp-clearALL");
			//	result.add("/~reset-buttons");
				displayLog();
				
			}
		});
		
	}
	
	
}*/


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import enamel.SoundPlayer;

import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class AddToFile extends JFrame {

	protected JFrame frame;
	// variables added by usman
	JTextField e = new JTextField(10);
	JTextField d = new JTextField(10);
	JFrame frame3;
	String choicecorrect="";
	String choicewrong="";

	private JTextField input;
	// Array to store inputs
	ArrayList<String> message = new ArrayList<String>();

	// Frame for scenario file
	JFrame realFileFrame = new JFrame();
	JTextArea sce = new JTextArea(10, 10);
	ArrayList<String> result = new ArrayList<String>();
	// text area to show progress to user
	JTextArea log = new JTextArea();

	// Frame and textfield for delete
	private JFrame deleteFrame;
	private JTextField delTextField;
	JButton btnOk = new JButton("OK");

	// Set String Pane
	private JFrame Stringframe;
	private JTextField stringTextField;
	JButton btnOk1 = new JButton("OK");

	// Set Char Pane
	private JFrame charFrame;
	private final JLabel charLabel = new JLabel("Enter Cell number on which you want to add letter: ");
	private final JTextField charTextField = new JTextField();
	private final JButton btnOKAddChar = new JButton("OK");
	private final JLabel letterLabel = new JLabel("Enter Letter");
	private JTextField letterText;

	// frame for cells
	private JFrame cellsFrame;
	private JTextField cells;

	JButton btnOkCells = new JButton("OK");

	// frame for buttons

	private JFrame buttonsFrame;
	private JTextField buttons;

	JButton btnOkbuttons = new JButton("OK");

	// REORDER FRAME

	private JFrame reordeFrame;
	private JTextField line1;
	private JTextField line2;
	JButton btnOkReorder = new JButton("OK");
	int reorderL1;
	int reorderL2;

	// frame for message
	private JFrame messageFrame;
	private JTextField message1;
	JButton btnOkmessage = new JButton("OK");

	// frame for question
	private JFrame questionFrame;
	private JTextField question;
	JButton btnOkquestion = new JButton("OK");

	// frame for pause
	private JFrame pauseFrame;
	private JTextField pause1;
	JButton btnOkpause = new JButton("OK");

	// frame for repeate
	private JFrame repeatFrame;
	JButton btnOkrepeat = new JButton("Start Repeat");
	private final JButton btnStopRepeat = new JButton("Stop Repeat");

	// Frame for Skip
	private JFrame skipFrame;
	private JTextField skip;
	private JTextField skipButton;
	JButton btnOkSkip = new JButton("Ok");

	// Frame to ask button for stop

	private JFrame stopRepeatFrame;
	private final JLabel stopButton = new JLabel("Enter Button required to Stop Repeat: ");
	private final JTextField stopTextField = new JTextField();
	private final JButton btnOKStopRepeat = new JButton("OK");

	// fram to add label
	private JFrame labelFrame;
	private final JLabel lableButton = new JLabel("Enter Label Where You Want To Jump On Specific Button Click: ");
	private final JTextField lableTextField = new JTextField();
	private final JButton btnOKAddLabel = new JButton("OK");
	
	
	//play frame
		protected JFrame playFrame;
		private final JButton btnOKplay = new JButton("OK");
		private final JLabel playLabel = new JLabel("Enter File name to play");
		private JTextField playText;

	////////////////////////

	int lineNumber;
	String msgToDel;
	int delIndex;
	String[] delArray;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { AddToFile window = new
	 * AddToFile(); window.frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the application.
	 */
	public AddToFile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		////////////////////////////////////////// MAIN
		////////////////////////////////////////// FRAME/////////////////////////////////////////////////////
		frame = new JFrame();
		frame.setBounds(100, 100, 1600, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JMenuItem saveFile = new JMenuItem("Save");
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		menuBar.add(menu);
		JMenuItem newFile = new JMenuItem("New");
		JMenuItem openFile = new JMenuItem("Open");
		JMenuItem playFile = new JMenuItem("Play");
		menu.add(newFile);
		menu.add(saveFile);
		menu.add(openFile);
		menu.add(playFile);
		frame.setJMenuBar(menuBar);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);

		panel.setPreferredSize(new Dimension(200, 100));
		panel.setLayout(null);

		JButton btnCells = new JButton("Number of Cells");
		btnCells.setBounds(5, 14, 148, 29);
		panel.add(btnCells);

		JButton btnButtons = new JButton("Number of Buttons");
		btnButtons.setBounds(5, 61, 148, 29);
		panel.add(btnButtons);

		JButton btnString = new JButton("Set String");
		btnString.setBounds(160, 16, 114, 29);
		panel.add(btnString);

		JButton btnChar = new JButton("Set Char");
		btnChar.setBounds(160, 61, 104, 29);
		panel.add(btnChar);

		JButton btnMessage = new JButton("Add Message");
		btnMessage.setBounds(282, 16, 148, 29);
		panel.add(btnMessage);

		JButton btnQuestion = new JButton("Add Question");
		btnQuestion.setBounds(270, 61, 138, 29);
		panel.add(btnQuestion);

		JButton btnSound = new JButton("Add Sound");
	
		btnSound.setBounds(565, 16, 137, 29);
		panel.add(btnSound);

		JButton btnReorder = new JButton("Reorder scenario");
		btnReorder.setBounds(434, 16, 128, 29);
		panel.add(btnReorder);

		JButton btnEdit = new JButton("Edit scenario");
		btnEdit.setBounds(1350, 61, 128, 29);
		panel.add(btnEdit);

		JButton btnDelete = new JButton("Delete line");
		btnDelete.setBounds(565, 61, 128, 29);
		panel.add(btnDelete);

		JButton btnRepeat = new JButton("Repeat Section");
		btnRepeat.setBounds(708, 61, 153, 29);
		panel.add(btnRepeat);

		JButton btnSetChoices = new JButton("Set Choice Buttons");
		btnSetChoices.setBounds(1230, 16, 175, 29);
		panel.add(btnSetChoices);

		JButton btnChoicesScenrio = new JButton("Choice Action");
		btnChoicesScenrio.setBounds(1062, 16, 153, 29);
		panel.add(btnChoicesScenrio);

		JComboBox comboBox = new JComboBox<String>();
		comboBox.addItem("Select Voice");
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.setBounds(708, 17, 122, 26);
		panel.add(comboBox);

		JButton btnPause = new JButton("Pause");
		btnPause.setBounds(1157, 61, 80, 29);
		panel.add(btnPause);

		JButton btnResetButtons = new JButton("Reset Buttons");
		btnResetButtons.setBounds(913, 16, 134, 29);
		panel.add(btnResetButtons);

		JButton btnClearAll = new JButton("Clear All");
		btnClearAll.setBounds(876, 61, 104, 29);
		panel.add(btnClearAll);

		JButton btnSkip = new JButton("skip");
		btnSkip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSkip.setBounds(838, 16, 68, 29);
		panel.add(btnSkip);

		JButton btnRecord = new JButton("Record");
		btnRecord.setBounds(1252, 61, 88, 29);
		panel.add(btnRecord);

		JButton btnAddLabel = new JButton("Add  Label");
		btnAddLabel.setBounds(423, 61, 127, 29);
		panel.add(btnAddLabel);

		JButton btnGetUserInput = new JButton("Get User Input");
		btnGetUserInput.setBounds(991, 61, 153, 29);
		panel.add(btnGetUserInput);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		panel_1.add(log, BorderLayout.CENTER);
		log.setLineWrap(true);
		log.setEditable(false);

		log.setBounds(5, 35, 800, 330);

		JScrollPane scrollBar = new JScrollPane(log);
		scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		TextLineNumber tln = new TextLineNumber(log);
		scrollBar.setRowHeaderView(tln);
		panel_1.add(scrollBar, BorderLayout.EAST);
		frame.getContentPane().add(scrollBar);

		///////////////////////////////////////// SCENARIO FILE
		///////////////////////////////////////// FRAME/////////////////////////////////

		realFileFrame.setVisible(true);

		sce.setLineWrap(true);
		sce.setEditable(false);
		JScrollPane scroll = new JScrollPane(sce);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		TextLineNumber tlne = new TextLineNumber(sce);
		scroll.setRowHeaderView(tlne);
		realFileFrame.add(scroll);
		sce.setText(String.join("\n", result));

		//////////////////////////// ACTION TO ADD
		//////////////////////////// CELLS///////////////////////////

		btnCells.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cellsFrame = new JFrame();
				cellsFrame.setVisible(true);
				cellsFrame.setBounds(100, 100, 566, 135);
				cellsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				cellsFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				cellsFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter Number of Cells: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(42, 16, 198, 32);
				panel.add(lblEnterLineNumber);

				cells = new JTextField();
				cells.setBounds(255, 19, 82, 26);
				panel.add(cells);
				cells.setColumns(10);

				btnOkCells.setBounds(370, 18, 59, 29);
				panel.add(btnOkCells);
			}
		});

		btnOkCells.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("cells: " + cells.getText());
				result.add("Cells:" + cells.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				cellsFrame.dispose();

			}
		});

		//////////////////////////// ACTION TO ADD
		//////////////////////////// BUTTONS///////////////////////////

		btnButtons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonsFrame = new JFrame();
				buttonsFrame.setVisible(true);
				buttonsFrame.setBounds(100, 100, 566, 135);
				buttonsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				buttonsFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				buttonsFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter Number of Buttons: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(42, 16, 198, 32);
				panel.add(lblEnterLineNumber);

				buttons = new JTextField();
				buttons.setBounds(255, 19, 82, 26);
				panel.add(buttons);
				buttons.setColumns(10);

				btnOkbuttons.setBounds(370, 18, 59, 29);
				panel.add(btnOkbuttons);
			}
		});

		btnOkbuttons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("Buttons: " + buttons.getText());
				result.add("Buttons:" + buttons.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				buttonsFrame.dispose();

			}
		});

		////////// Action listeners for menu items////////////////////////

		saveFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveAs();
			}
		});

		openFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openButton();
			}
		});

		newFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NEW();
			}
		});

		
		playFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				playFrame= new JFrame();
				playFrame.setVisible(true);
				playFrame.setBounds(100, 100, 566, 161);
				playFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				playFrame.getContentPane().setLayout(new BorderLayout(0, 0));
				
				JPanel panel = new JPanel();
				playFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);
				btnOKplay.setBackground(SystemColor.activeCaption);
				btnOKplay.setBounds(454, 50, 53, 29);
				
				panel.add(btnOKplay);
				playLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
				playLabel.setBounds(15, 33, 210, 20);
				
				panel.add(playLabel);
				
				playText = new JTextField();
				playText.setBounds(267, 30, 146, 26);
				panel.add(playText);
				playText.setColumns(10);
			
			}
		});
		
		
		
			btnOKplay.addActionListener(new ActionListener()
					{
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					SoundPlayer s = new SoundPlayer();
			        s.setScenarioFile("SampleScenarios/"+playText.getText());
				
					}
					});
		
		// Message Action Listener

		btnMessage.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				messageFrame = new JFrame();
				messageFrame.setVisible(true);

				messageFrame.setBounds(100, 100, 566, 135);

				messageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				messageFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				messageFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter Message: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(42, 16, 198, 32);
				panel.add(lblEnterLineNumber);

				message1 = new JTextField();
				message1.setBounds(255, 19, 82, 26);
				panel.add(message1);
				message1.setColumns(10);

				btnOkmessage.setBounds(370, 18, 59, 29);
				panel.add(btnOkmessage);

			}

		});

		btnOkmessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("Message: " + message1.getText());
				result.add(message1.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				messageFrame.dispose();

			}
		});

		//////////////////// QUESTION ACTION
		//////////////////// LISTENER/////////////////////////////

		// Message Action Listener

		btnQuestion.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				questionFrame = new JFrame();
				questionFrame.setVisible(true);

				questionFrame.setBounds(100, 100, 566, 135);

				questionFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				questionFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				questionFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter Question: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(42, 16, 198, 32);
				panel.add(lblEnterLineNumber);

				question = new JTextField();
				question.setBounds(255, 19, 82, 26);
				panel.add(question);
				question.setColumns(10);

				btnOkquestion.setBounds(370, 18, 59, 29);
				panel.add(btnOkquestion);

			}

		});

		btnOkquestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("Question: " + question.getText());
				result.add(question.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n" + result));
				questionFrame.dispose();

			}
		});

		//////////////////// PAUSE ACTION LISTENER/////////////////////////////

		// pauseAction Listener

		btnPause.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				pauseFrame = new JFrame();
				pauseFrame.setVisible(true);

				pauseFrame.setBounds(100, 100, 566, 135);

				pauseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				pauseFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				pauseFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter Time for Pause: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(42, 16, 198, 32);
				panel.add(lblEnterLineNumber);

				pause1 = new JTextField();
				pause1.setBounds(255, 19, 82, 26);
				panel.add(pause1);
				pause1.setColumns(10);

				btnOkpause.setBounds(370, 18, 59, 29);
				panel.add(btnOkpause);

			}

		});

		btnOkpause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("Pause: " + pause1.getText());
				result.add("/~pause:" + pause1.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				pauseFrame.dispose();

			}
		});

		// delete action listener

		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/////////////////////// FRAME FOR CONFIRMING
				/////////////////////// DELETION////////////////////////////

				deleteFrame = new JFrame();
				deleteFrame.setVisible(true);
				deleteFrame.setBounds(100, 100, 609, 171);
				deleteFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				deleteFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				deleteFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter Line Number To Delete: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(50, 45, 237, 32);
				panel.add(lblEnterLineNumber);

				delTextField = new JTextField();
				delTextField.setBounds(302, 48, 146, 26);
				panel.add(delTextField);
				delTextField.setColumns(10);

				btnOk.setBackground(SystemColor.activeCaption);
				btnOk.setBounds(472, 47, 86, 29);
				panel.add(btnOk);

			}
		});

		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String as = delTextField.getText();
				String bs = lineNumber(as);
				if (bs.equals("true")) {
					lineNumber = Integer.parseInt(as) - 1;
					msgToDel = message.get(lineNumber);
					delIndex = deletionIndex();
					delArray = msgToDel.split(" ", 2);
					char one = msgToDel.charAt(0);
					if (one == 'M' || one == 'Q') {
						scenario2();
						message.remove(lineNumber);
					} else if (one == 'S') {
						deleteString();
					} else if (one == 's') {
						deleteSound();
					} else if (one == 'V') {
						deleteVoice();
					} else if (one=='C'){
						deleteChar();
					}

					deleteFrame.dispose();
					displayLog();
				}

			}
		});

	

		// Voice Action Listener/////////////
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = (String) comboBox.getSelectedItem();

				message.add("Voice: " + comboBox.getSelectedItem());
				result.add("/~set-voice:" + comboBox.getSelectedItem());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));

			}
		});

		///////////////////////// USER INPUT
		///////////////////////// ACTIONLISTENER/////////////////////////

		btnGetUserInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("Wait for user input here");
				result.add("/~user-input");
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));

			}
		});

		////////////// ///Action listener to set string///////////////////////

		btnString.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Stringframe = new JFrame();
				Stringframe.setVisible(true);
				Stringframe.setBounds(100, 100, 609, 171);
				Stringframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				Stringframe.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				Stringframe.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblEnterLineNumber = new JLabel("Enter String to set: ");
				lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				lblEnterLineNumber.setBounds(50, 45, 237, 32);
				panel.add(lblEnterLineNumber);

				stringTextField = new JTextField();
				stringTextField.setBounds(302, 48, 146, 26);
				panel.add(stringTextField);
				stringTextField.setColumns(10);

				btnOk1.setBackground(SystemColor.activeCaption);
				btnOk1.setBounds(472, 47, 86, 29);
				panel.add(btnOk1);

			}
		});

		btnOk1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("String: " + stringTextField.getText());
				result.add("/~disp-string:" + stringTextField.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				Stringframe.dispose();

			}
		});

		////////////// ///Action listener to set Char///////////////////////

		btnChar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				charTextField.setBounds(433, 14, 74, 26);
				charTextField.setColumns(10);
				charFrame = new JFrame();
				charFrame.setVisible(true);
				charFrame.setBounds(100, 100, 566, 161);
				charFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				charFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				charFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);
				charLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
				charLabel.setBounds(15, 16, 394, 22);

				panel.add(charLabel);

				panel.add(charTextField);
				btnOKAddChar.setBackground(SystemColor.activeCaption);
				btnOKAddChar.setBounds(454, 50, 53, 29);

				panel.add(btnOKAddChar);
				letterLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
				letterLabel.setBounds(15, 54, 110, 20);

				panel.add(letterLabel);

				letterText = new JTextField();
				letterText.setBounds(155, 54, 60, 26);
				panel.add(letterText);
				letterText.setColumns(10);

			}
		});

		btnOKAddChar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("Char: " + letterText.getText() + " Cell: " + charTextField.getText());
				String a = "/~disp-cell-char:" + charTextField.getText() + " " + letterText.getText();
				result.add(a);
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				charFrame.dispose();

			}
		});

		///////////////////// ACTOION LISTENER TO ADD
		///////////////////// SOUND///////////////////////

		btnSound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser("SampleScenarios/AudioFiles");
				int ret = fileChooser.showOpenDialog(null);
				if (ret == JFileChooser.APPROVE_OPTION) {
					File f = fileChooser.getSelectedFile();
					try {

						message.add("Sound: " + f.getName());
						String a = ("/~sound:" + f.getName());
						result.add(a);
						log.setText(String.join("\n", message));
						sce.setText(String.join("\n", result));

					} catch (Exception ee) {
						System.out.println("cant read");
					}
				}

			}
		});

		///////////////////// ACTOION LISTENER TO RESET
		///////////////////// BUTTONS///////////////////////

		btnResetButtons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("Reset all the buttons");
				result.add("/~reset-buttons");
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));

			}
		});

		///////////////////// ACTOION LISTENER TO CLEAR
		///////////////////// ALL///////////////////////

		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("clear All the Braille Cells");
				result.add("/~disp-clearAll");
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));

			}
		});

		//////////////////////// ACTION LISTENER TO ADD LABEL/////////////////

		btnAddLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lableTextField.setBounds(246, 54, 116, 26);
				lableTextField.setColumns(10);
				labelFrame = new JFrame();
				labelFrame.setVisible(true);
				labelFrame.setBounds(100, 100, 566, 161);
				labelFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				labelFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				labelFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);
				lableButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
				lableButton.setBounds(15, 16, 514, 22);

				panel.add(lableButton);

				panel.add(lableTextField);
				btnOKAddLabel.setBounds(402, 54, 53, 29);

				panel.add(btnOKAddLabel);

			}
		});

		//////////////// ACTION LISTENER TO ADD LABLE OK
		//////////////// BUTTON//////////////////////

		btnOKAddLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("Label to jump on request: " + lableTextField.getText());
				result.add("/~" + lableTextField.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				labelFrame.dispose();

			}
		});

		///////////////////// ACTOION LISTENER TO SKIP///////////////////////

		btnSkip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skipFrame = new JFrame();
				skipFrame.setVisible(true);
				skipFrame.setBounds(100, 100, 566, 241);
				skipFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				skipFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				skipFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				JLabel lblSkipTo = new JLabel("Skip To");
				lblSkipTo.setBounds(71, 105, 69, 20);
				panel.add(lblSkipTo);

				JLabel lblButtonForSkip = new JLabel("Button For Skip");
				lblButtonForSkip.setBounds(71, 51, 135, 20);
				panel.add(lblButtonForSkip);

				skip = new JTextField();
				skip.setBounds(221, 48, 146, 26);
				panel.add(skip);
				skip.setColumns(10);

				skipButton = new JTextField();
				skipButton.setBounds(221, 102, 146, 26);
				panel.add(skipButton);
				skipButton.setColumns(10);

				btnOkSkip.setBackground(SystemColor.activeCaption);
				btnOkSkip.setBounds(447, 16, 82, 29);
				panel.add(btnOkSkip);

			}
		});

		//////////////////////// ACTIONLISTENER TO
		//////////////////////// REPEAT////////////////////////

		btnRepeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repeatFrame = new JFrame();
				repeatFrame.setVisible(true);
				repeatFrame.setBounds(100, 100, 566, 241);
				repeatFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				repeatFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				repeatFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);

				btnOkrepeat.setBackground(SystemColor.activeCaption);
				btnOkrepeat.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});

				btnOkrepeat.setBounds(225, 16, 125, 29);
				panel.add(btnOkrepeat);
				btnStopRepeat.setBackground(SystemColor.activeCaption);
				btnStopRepeat.setBounds(225, 85, 125, 29);

				panel.add(btnStopRepeat);

			}
		});

		/////////////////////// IF SELECT TO START
		/////////////////////// REPEAT////////////////////////
		btnOkrepeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("Repeat From here");
				result.add("/~repeat");
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				repeatFrame.dispose();

			}
		});

		/////////////////////// IF SELECT TO STOP REPEAT////////////////////////
		btnStopRepeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("End Repeat here");
				result.add("/~endrepeat");
				stopTextField.setBounds(330, 35, 86, 26);
				stopTextField.setColumns(10);
				stopRepeatFrame = new JFrame();
				stopRepeatFrame.setVisible(true);
				stopRepeatFrame.setBounds(100, 100, 566, 161);
				stopRepeatFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				stopRepeatFrame.getContentPane().setLayout(new BorderLayout(0, 0));

				JPanel panel = new JPanel();
				stopRepeatFrame.getContentPane().add(panel, BorderLayout.CENTER);
				panel.setLayout(null);
				stopButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
				stopButton.setBounds(15, 37, 300, 22);

				btnOKStopRepeat.setBounds(443, 34, 53, 29);

				panel.add(stopButton);
				panel.add(stopTextField);
				panel.add(stopTextField);
				panel.add(btnOKStopRepeat);

			}
		});

		////////////// WHEN PRESS THE BUTTON TO ADD STOP BUTTON FOR
		////////////// REPEAT/////////////////

		btnOKStopRepeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.add("");
				int a = Integer.parseInt(stopTextField.getText()) - 1;
				String b = Integer.toString(a);
				result.add("/~repeat-button:" + b);
				message.add("correct Button for repeat: " + stopTextField.getText());

				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
				repeatFrame.dispose();
				stopRepeatFrame.dispose();
			}
		});

		///////////////////// ACTOION LISTENER TO CONFIRM
		///////////////////// SKIP///////////////////////

		btnOkSkip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add(" Skip to " + skip.getText() + " if button " + skipButton.getText() + " Clciked");
				result.add("//~skip-button:" + skipButton.getText() + skip.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
			}
		});



		// RECORD/////////////

		 btnRecord.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
		 Record rc= new Record();
		}
		 });

		//////////////////////////////////// Action Listener for Set
		//////////////////////////////////// Choices/////////////////////////

		btnChoicesScenrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choice();
			}
		});

		/////////////////////////////////// Action Listner for edit scnario
		/////////////////////////////////// button//////////////
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edit();
			}
		});

		btnSetChoices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choices();
			}
		});

	}

	///////////// Code to save File///////////////////////

	public void saveAs() {
		FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Text File", "txt");
		final JFileChooser saveAsFileChooser = new JFileChooser();
		saveAsFileChooser.setApproveButtonText("Save");
		saveAsFileChooser.setFileFilter(extensionFilter);
		int actionDialog = saveAsFileChooser.showOpenDialog(log);
		if (actionDialog != JFileChooser.APPROVE_OPTION) {
			return;
		}

		// !! File fileName = new File(SaveAs.getSelectedFile() + ".txt");
		File file = saveAsFileChooser.getSelectedFile();
		if (!file.getName().endsWith(".txt")) {
			file = new File(file.getAbsolutePath() + ".txt");
		}

		BufferedWriter outFile = null;
		try {
			outFile = new BufferedWriter(new FileWriter(file));

			log.write(outFile);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (outFile != null) {
				try {
					outFile.close();
				} catch (IOException e) {
				}
			}
		}
	}

	///////////////////////////// CODE TO OPEN NEW
	///////////////////////////// FILE////////////////////////////////

	public void openButton() {
		JFileChooser fileChooser = new JFileChooser();
		int ret = fileChooser.showOpenDialog(null);
		if (ret == JFileChooser.APPROVE_OPTION) {
			File f = fileChooser.getSelectedFile();
			try {
				FileReader r = new FileReader(f);
				log.read(r, "");

			} catch (Exception ee) {
				System.out.println("cant read");
			}
		}
	}

	///////////////////////////////// CODE TO CREATE NEW
	///////////////////////////////// FILE/////////////////////////////////////
	public void NEW() {

		int selectedOption = JOptionPane.showConfirmDialog(null, "Do you wanna close the window?", "Choose",
				JOptionPane.YES_NO_OPTION);
		if (selectedOption == JOptionPane.YES_OPTION) {
			message.clear();
			log.setText("");
		}

	}

	//////////////////////////////// GET INDEX OF LINE TO DELETE FORM
	//////////////////////////////// ARRAY/////////////////////////////

	public int deletionIndex() {
		int i = 1;

		for (int start = 0; start < lineNumber; start++) {
			if (message.get(start).equals(msgToDel)) {
				i++;
			}
		}
		return i;
	}

	/////////////////////////////////////// Delete//////////////////////////////////

	public void scenario2() {

		String res = delArray[1];
		int a = 0;

		if (delIndex - 1 == 0) {

			int b = result.indexOf(delArray[1]);
			result.remove(b);
		} else {

			for (int i = 0; delIndex != a; i++) {
				if (result.get(i).equals(res)) {
					a++;
					if (a == delIndex) {
						result.remove(i);
					}
				}

			}
		}

	}

	///////////////////////// SOUND//////////////////////////////
	public void soundbutton() {
		message.add("sound added");
		result.add("/~sound:");
	}

	/*
	public int getLine1() {
		int i = 1;

		for (int start = 0; start < reorderL1; start++) {

			if (message.get(start).equals(message.get(reorderL1))) {
				i++;
			}
		}
		return i;
	}

	public int getLine2() {
		int i = 1;
		for (int start = 0; start < reorderL2; start++) {

			if (message.get(start).equals(message.get(reorderL2))) {
				i++;
			}
		}
		return i;
	}

	public void replaceL1andL2() {
		int a = getLine1();
		int b = getLine2();
		String c = message.get(reorderL1);
		String d = message.get(reorderL1);
		String[] e = c.split(" ", 2);
		String[] f = d.split(" ", 2);
		int x = 0;
		int alpha = 0;
		int beta = 0;
		int aaa = 0;
		if (a - 1 == 0 && b - 1 == 0) {
			int g = result.indexOf(e[1]);
			int h = result.indexOf(f[1]);
			result.set(g, f[1]);
			result.set(h, e[1]);
		}

		else if (a - 1 == 0 && b - 1 != 0) {
			for (int i = 0; b != x; i++) {

				if (result.get(i).equals(f[1])) {
					x++;
					if (x == b) {
						int hh = result.indexOf(e[1]);
						result.set(hh, f[1]);
						result.set(i, e[1]);
					}
				}
			}
		}

		else if (a - 1 != 0 && b - 1 == 0) {
			for (int i = 0; a != x; i++) {

				if (result.get(i).equals(e[1])) {
					x++;
					if (x == a) {
						int hh = result.indexOf(f[1]);
						result.set(hh, e[1]);
						result.set(i, f[1]);
					}
				}
			}
		} else {
			for (int i = 0; a != x; i++) {

				if (result.get(i).equals(e[1])) {
					x++;
					if (x == a) {
						alpha = i;
					}
				}

			}

			for (int i = 0; b != aaa; i++) {

				if (result.get(i).equals(f[1])) {
					aaa++;
					if (x == b) {
						beta = i;
					}
				}

			}
			result.set(alpha, f[1]);
			result.set(beta, e[1]);
			System.out.println(alpha + "/n" + beta);
		}
	}
*/
	public void displayLog() {
		log.setText(String.join("\n", message));

	}

	public void displaySce() {

		sce.setText(String.join("\n", message));
	}

	///////////////////////////////////////////// METHOD TO SET
	///////////////////////////////////////////// CHOICES////////////////////////////////

	public void choices() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel(new GridBagLayout());
		JTextField d = new JTextField(10);
		JLabel e = new JLabel("Button for correct choice:");
		JTextField f = new JTextField(10);
		JLabel g = new JLabel("Button for wrong choice:");
		JButton ok = new JButton("OK");
		GridBagConstraints gg = new GridBagConstraints();
		gg.weightx = 0;
		gg.gridx = 1;
		gg.gridy = 1;
		panel.add(d, gg);

		gg.gridx = 0;
		gg.gridy = 1;
		panel.add(e, gg);

		gg.gridx = 0;
		gg.gridy = 0;
		panel.add(f, gg);

		gg.gridx = 1;
		gg.gridy = 0;
		panel.add(g, gg);

		gg.gridx = 2;
		gg.gridy = 1;
		panel.add(ok, gg);

		frame.add(panel);

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add("Button " + d.getText() + " set as correct option.");
				message.add("Button " + f.getText() + " set as incorrect option.");
				choicecorrect=d.getText();
				choicewrong=f.getText();
				int a = Integer.parseInt(d.getText()) - 1;
				int b = Integer.parseInt(f.getText()) - 1;
				String c = Integer.toString(a);
				String d = Integer.toString(b);
				result.add("/~skip-button:" + c + " ONEE");
				result.add("/~skip-button:" + d + " TWOO");
				result.add("/~user-input");
				result.add("");
			}
		});

	}

	public String lineNumber(String b) {
		int a = message.size();
		int c = Integer.parseInt(b);
		String ab;
		if (c <= a) {
			ab = "true";
			return ab;
		} else {
			ab = "false";
			return ab;
		}

	}

	// methods for all the delete types
	public void deleteChar() {
		int number = deletionIndex();
		String a = message.get(lineNumber);
		char b = a.charAt(6);
		char d = a.charAt(14);
		int c = 0;
		if (number - 1 == 0) {
			int e = result.indexOf("/~disp-cell-char:" + Character.toString(d) + " " + Character.toString(b));
			result.remove(e);
			message.remove(lineNumber);
		} else {
			for (int i = 0; number != c; i++) {

				if (result.get(i).equals("/~disp-cell-char:" + Character.toString(d) + " " + Character.toString(b))) {
					c++;
					if (c == number) {
						result.remove(i);
						message.remove(lineNumber);
					}
				}

			}
		}
	}

	public void deleteString() {
		int number = deletionIndex();
		String res = delArray[1];
		int c = 0;
		if (number - 1 == 0) {
			int b = result.indexOf("/~disp-string:" + res);
			result.remove(b);
			message.remove(lineNumber);

		} else {

			for (int i = 0; number != c; i++) {

				if (result.get(i).equals("/~disp-string:" + res)) {
					c++;
					if (c == number) {
						result.remove(i);
						message.remove(lineNumber);
					}
				}

			}
		}
	}

	public void deleteVoice() {
		int number = deletionIndex();
		String res = delArray[1];
		int c = 0;
		if (number - 1 == 0) {
			int b = result.indexOf("/~set-voice:" + res);
			result.remove(b);
			message.remove(lineNumber);

		} else {

			for (int i = 0; number != c; i++) {

				if (result.get(i).equals("/~set-voice:" + res)) {
					c++;
					if (c == number) {
						result.remove(i);
						message.remove(lineNumber);
					}
				}

			}
		}
	}

	public void deleteSound() {
		int number = deletionIndex();
		String res = delArray[1];
		int c = 0;
		if (number - 1 == 0) {
			int b = result.indexOf("/~sound:" + res);
			result.remove(b);
			message.remove(lineNumber);

		} else {

			for (int i = 0; number != c; i++) {

				if (result.get(i).equals("/~sound:" + res)) {
					c++;
					if (c == number) {
						result.remove(i);
						message.remove(lineNumber);
					}
				}

			}
		}
	}

	// methods for edit button

	public void editVoice() {
		if (d.getText().equals("1") || d.getText().equals("2") || d.getText().equals("3") || d.getText().equals("4")) {
			int number = scenario3();
			int e = 0;
			String w = message.get(lineNumber);
			String[] y = w.split(" ", 2);
			if (number - 1 == 0) {
				int num = result.indexOf("/~set-voice:" + y[1]);
				result.set(num, "/~set-voice:" + d.getText());
				message.set(lineNumber, "Voice: " + d.getText());
			} else {
				for (int i = 0; number != e; i++) {
					if (result.get(i).equals("/~set-voice:" + y[1])) {
						e++;
						if (e == number) {
							result.set(i, "/~set-voice:" + d.getText());
							message.set(lineNumber, "Voice: " + d.getText());
						}
					}
				}
			}
		}

	}

	public void editSound() {
		
		// here I want you to call the sound gui frame that comes when we press
		// the sound button
		// from that box the user will select the new sound he wants to add in
		// place of the current one
		// in this part basically we are not reading anything from the textfield
		// so the user can type anything in the message bar dosent matter once
		// it realises that the line the user wants to edit is actually a sound
		// file it will open the sound dialouge box once the user clicks ok on
		// the edit JFrame cause we cant make the user type the sound file name
		// as he might make mistake or maybe don't even remember
		
		
		int number = scenario3();
		int e = 0;
		String w = message.get(lineNumber);
		String[] y = w.split(" ", 2);
	    
		if (number - 1 == 0) {
			int num = result.indexOf("/~sound:" + y[1]);
			// here I want you to add the file name that the user selected above
			// eg:result.set(num,"/~sound:"+the filename of sound the user
			// added)
			
			result.set(num, "/~sound:" + d.getText());
			// here I want you to add the file name that the user selected above
			// eg:message.set(c,"sound: "+the filename of sound the user added)
			message.set(lineNumber, "sound: " + d.getText());
			// just replace d.getText() with the filename user is selecting
		} else {
			for (int i = 0; number != e; i++) {
				if (result.get(i).equals("/~sound:" + y[1])) {
					e++;
					if (e == number) {
						// here I want you to add the file name that the user
						// selected above eg:result.set(num,"/~sound:"+the
						// filename of sound the user added)
						result.set(i, "/~sound:" + d.getText());
						// here I want you to add the file name that the user
						// selected above eg:message.set(c,"sound: "+the
						// filename of sound the user added)
						message.set(lineNumber, "sound: " + d.getText());
					}
				}
			}
		}
	}

	public void editChar() {
		int number = scenario3();
		int e = 0;
		String w = message.get(lineNumber);
		char a = w.charAt(6);
		char b = w.charAt(14);
		if (number - 1 == 0) {
			int num = result.indexOf("/~disp-cell-char:" + Character.toString(b) + " " + Character.toString(a));
			result.set(num, "/~disp-cell-char:" + Character.toString(b) + " " + d.getText());
			message.set(lineNumber, "Char: " + d.getText() + " Cell: " + Character.toString(b));
		} else {
			for (int i = 0; number != e; i++) {
				if (result.get(i).equals("/~disp-cell-char:" + Character.toString(b) + " " + Character.toString(a)))
					;
				e++;
				if (e == number) {
					result.set(i, "/~disp-cell-char:" + Character.toString(b) + " " + d.getText());
					message.set(lineNumber, "Char: " + d.getText() + " Cell: " + Character.toString(b));
				}
			}
		}
	}

	public void editString() {
		int number = scenario3();
		int e = 0;
		String w = message.get(lineNumber);
		String[] y = w.split(" ", 2);
		if (number - 1 == 0) {
			int num = result.indexOf("/~disp-string:" + y[1]);
			result.set(num, "/~disp-string:" + d.getText());
			message.set(lineNumber, "String: " + d.getText());
		} else {
			for (int i = 0; number != e; i++) {
				if (result.get(i).equals("/~disp-string:" + y[1])) {
					e++;
					if (e == number) {
						result.set(i, "/~disp-string:" + d.getText());
						message.set(lineNumber, "String: " + d.getText());
					}
				}
			}
		}

	}

	public int scenario3() {
		int i = 1;

		for (int start = 0; start < lineNumber; start++) {

			if (message.get(start).equals(message.get(lineNumber))) {
				i++;
			}
		}
		return i;
	}

	public void scenario4() {
		int number = scenario3();
		int e = 0;
		String w = message.get(lineNumber);
		String[] y = w.split(" ", 2);
		if (number - 1 == 0) {
			int b = result.indexOf(y[1]);
			result.set(b, d.getText());
		} else {
			for (int i = 0; number != e; i++) {

				if (result.get(i).equals(y[1])) {
					e++;
					if (e == number) {
						result.set(i, d.getText());
					}
				}

			}
		}
	}

	//////// edit method called in the edit button action listner

	public void edit() {

		frame3 = new JFrame();
		frame3.setVisible(true);
		JPanel panel3 = new JPanel(new GridBagLayout());
		JLabel h = new JLabel("Enter the line number of the question/message you want to edit");
		JLabel i = new JLabel("Enter the question/message");
		JButton oki = new JButton("ok");
		GridBagConstraints gg = new GridBagConstraints();

		gg.weightx = 0;
		gg.gridx = 0;
		gg.gridy = 0;
		panel3.add(h, gg);

		gg.gridx = 0;
		gg.gridy = 1;
		panel3.add(i, gg);

		gg.gridx = 1;
		gg.gridy = 0;
		panel3.add(e, gg);

		gg.gridx = 1;
		gg.gridy = 1;
		panel3.add(d, gg);

		gg.gridx = 3;
		gg.gridy = 2;
		panel3.add(oki, gg);
		frame3.add(panel3);

		oki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oki();
			}
		});

	}

	public void oki() {
		String b = e.getText();
		String dcc = lineNumber(b);
		if (dcc.equals("true")) {
			lineNumber = Integer.parseInt(b) - 1;
			String f = message.get(lineNumber);
			char one = f.charAt(0);

			if (one == 'M' || one == 'Q') {
				scenario3();
				scenario4();
				char e = f.charAt(0);

				if (e == 'M') {
					String a = "Message: " + d.getText();
					message.set(lineNumber, a);
				} else if (e == 'Q') {
					String a = "Question: " + d.getText();
					message.set(lineNumber, a);
				} else if (e == 'S') {
					String a = "String: " + d.getText();
					message.set(lineNumber, a);
				}
			} else if (one == 'S') {
				editString();
			} else if (one == 's') {
				editSound();
			} else if (one == 'V') {
				editVoice();
			} else if (one == 'C') {
				editChar();
			}

			frame3.dispose();
			frame.setVisible(true);
			displayLog();

		}

	}

	// methods for the set choice button action listner
	public void choice() {
		JFrame frame = new JFrame();
		frame.setVisible(true);

		
		
		frame.pack();
		JPanel panel = new JPanel(new GridBagLayout());
		JLabel e = new JLabel(
				"Type in al the details for the correct/incorrect scenario. Be sure to make no mistake as this part cannot be edited later.");
		JLabel a = new JLabel("Scenario for correct option");
	
		
		String correct;
		String inco;
		JLabel c = new JLabel("Add sound by pressing sound button");
		JLabel d = new JLabel("Type any message here:");
		JTextField f = new JTextField(10);
		JLabel b = new JLabel("Scenario for incorrect option");
		
		
		JLabel k = new JLabel("Add sound by pressing sound button");
		JLabel l = new JLabel("Type any message here:");
		JTextField m = new JTextField(10);
		JButton ok = new JButton("Ok");
		
		
	

		GridBagConstraints gg = new GridBagConstraints();

		gg.weightx = 0;

		gg.gridx = 0;
		gg.gridy = 10;
		panel.add(e, gg);

		gg.gridx = 0;
		gg.gridy = 9;
		panel.add(a, gg);

		
		gg.gridx = 0;
		gg.gridy = 7;
		panel.add(c, gg);

		gg.gridx = 1;
		gg.gridy = 7;
		
	
		gg.gridx = 0;
		gg.gridy = 6;
		panel.add(d, gg);

		gg.gridx = 1;
		gg.gridy = 6;
		panel.add(f, gg);

		gg.gridx = 0;
		gg.gridy = 5;
		panel.add(b, gg);

		

		gg.gridx = 0;
		gg.gridy = 3;
		panel.add(k, gg);

		gg.gridx = 1;
		gg.gridy = 3;
		

		gg.gridx = 0;
		gg.gridy = 2;
		panel.add(l, gg);

		gg.gridx = 1;
		gg.gridy = 2;
		panel.add(m, gg);

		gg.gridx = 0;
		gg.gridy = 1;
		panel.add(ok, gg);

		frame.add(panel);

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(choicecorrect.equals("")&&choicewrong.equals("")){
					JFrame frame=new JFrame();
					frame.setVisible(true);
					JPanel panel=new JPanel();
					JLabel label=new JLabel("The buttons for correct and incorrect scenarios are not yet added. Please add the buttons using set choice first");
					JButton ok=new JButton("ok");
					panel.add(label);
					panel.add(ok);
					frame.add(panel);
					ok.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frame.dispose();
							
						}
					});
				}else{
					message.add("Correct scenario added.");
					message.add("sound: "+"correct.wav");
					message.add("Message: " + f.getText());
					if (choicecorrect.equals("1")) {
						result.add("/~ONEE");
						result.add("/~sound:"+"correct.wav");
						result.add(f.getText());
						// result.add("/~skip:NEXTT");
						// result.add("");
					} else if (choicecorrect.equals("2")) {
						result.add("/~TWOO");
						result.add("/~sound:"+"correct.wav");
						result.add(f.getText());
						// result.add("/~skip:NEXTT");
						// result.add("");
					}

					message.add("Incorrect scenario added.");
					message.add("sound: "+"wrong.wav");
					message.add("Message: " + m.getText());

					if (choicewrong.equals("2")) {
						result.add("/~TWOO");
						result.add("/~sound:"+"wrong.wav");
						result.add(m.getText());
						result.add("/~skip:NEXTT");
					} else if (choicewrong.equals("1")) {
						result.add("/~ONEE");
						result.add("/~sound:"+"wrong.wav");
						result.add(m.getText());
						// result.add("/~skip:NEXTT");
					}

					displayLog();
				}
				

			}
			
		});

	}
	
	public void SOUND(){
		JFileChooser fileChooser = new JFileChooser("Audio Files");
		int ret = fileChooser.showOpenDialog(null);
		if (ret == JFileChooser.APPROVE_OPTION) {
			File f = fileChooser.getSelectedFile();
			try {

				message.add("Sound to Play: " + f.getName());
				String a = ("/~sound:" + f.getName());
				result.add(a);
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));

			} catch (Exception ee) {
				System.out.println("cant read");
			}
		}
	}

}