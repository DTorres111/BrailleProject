package Authoring;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Frame {

	private JFrame frame;
	ArrayList<String> message = new ArrayList<String>();
	JButton ok = new JButton("OK");
	JButton okie = new JButton("OK");
	JButton oki = new JButton("OK");
	JTextField d = new JTextField(10);
	JTextArea log = new JTextArea(10, 10);
	JMenuItem item1 = new JMenuItem("Save");
	JTextField e = new JTextField(10);
	JButton yes = new JButton("Yes");
	JButton no = new JButton("No");
	JFrame frame1 = new JFrame();
	JFrame frame2 = new JFrame();
	JFrame frame3 = new JFrame();
	JFrame frame4 = new JFrame();
	int a;
	String z;
	int number;
	String[] arr;
	int c;
	int q;
	int t;
	JButton sound;

	// for the scenario file
	JFrame frames = new JFrame();
	JTextArea sce = new JTextArea(10, 10);
	ArrayList<String> result = new ArrayList<String>();

	public Frame() {
		// frame

		frame = new JFrame();
		frame.setVisible(true);

		// panel for messages
		JPanel panel = new JPanel(new GridBagLayout());
		JTextField text = new JTextField(10);
		JLabel label = new JLabel("Type Text Here:");
		JButton button = new JButton("Message");
		JButton delete = new JButton("Delete");
		JButton question = new JButton("Question");
		sound = new JButton("Sound");
		JButton voice = new JButton("Voice");
		JButton reorder = new JButton("Reorder");
		JButton edit = new JButton("Edit");
		JButton repeat = new JButton("Repeat");
		JButton charsetting = new JButton("Char BCELL");
		JButton stringsetting = new JButton("String BCELL");
		JButton choices = new JButton("Set choices");
		JButton choice = new JButton("Choice Scenario");

		GridBagConstraints gg = new GridBagConstraints();
		// gg.fill = GridBagConstraints.HORIZONTAL;
		gg.weightx = 0;
		gg.gridx = 1;
		gg.gridy = 1;
		panel.add(text, gg);

		gg.gridx = 0;
		gg.gridy = 1;
		panel.add(label, gg);

		gg.gridx = 1;
		gg.gridy = 0;
		panel.add(button, gg);

		gg.gridx = 0;
		gg.gridy = 0;
		panel.add(delete, gg);

		gg.gridx = 3;
		gg.gridy = 0;
		panel.add(sound, gg);

		gg.gridx = 4;
		gg.gridy = 0;
		panel.add(question, gg);

		gg.gridx = 5;
		gg.gridy = 0;
		panel.add(voice, gg);

		gg.gridx = 6;
		gg.gridy = 0;
		panel.add(reorder, gg);

		gg.gridx = 7;
		gg.gridy = 0;
		panel.add(edit, gg);

		gg.gridx = 8;
		gg.gridy = 0;
		panel.add(repeat, gg);

		gg.gridx = 9;
		gg.gridy = 0;
		panel.add(charsetting, gg);

		gg.gridx = 10;
		gg.gridy = 0;
		panel.add(stringsetting, gg);

		gg.gridx = 11;
		gg.gridy = 0;
		panel.add(choices, gg);

		gg.gridx = 12;
		gg.gridy = 0;
		panel.add(choice, gg);

		// panel for log

		log.setLineWrap(true);
		log.setEditable(false);
		JScrollPane scrollV = new JScrollPane(log);
		scrollV.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		TextLineNumber tln = new TextLineNumber(log);
		scrollV.setRowHeaderView(tln);
		frame.add(scrollV);
		frame.add(panel, BorderLayout.SOUTH);

		// menubar

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		menuBar.add(menu);
		JMenuItem item = new JMenuItem("New");
		JMenuItem item2 = new JMenuItem("Open");
		JMenuItem item3 = new JMenuItem("Play");
		menu.add(item);
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		frame.setJMenuBar(menuBar);

		// scenario Frame

		frames.setVisible(true);

		sce.setLineWrap(true);
		sce.setEditable(false);
		JScrollPane scroll = new JScrollPane(sce);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		TextLineNumber tlne = new TextLineNumber(sce);
		scroll.setRowHeaderView(tlne);
		frames.add(scroll);

		result.add("Cell");
		result.add("Button");
		sce.setText(String.join("\n", result));

		// buttons action listener

		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				message.add("Message: " + text.getText());
				result.add(text.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));

			}

		});

		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame1.setVisible(true);
				JPanel panel3 = new JPanel();
				JLabel h = new JLabel("Enter the line number of the question/message");
				panel3.add(h);
				panel3.add(d);
				panel3.add(ok);
				frame1.add(panel3);

			}
		});

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String as = d.getText();
				a = Integer.parseInt(as) - 1;
				z = message.get(a);
				number = scenario();
				arr = z.split(" ", 2);
				scenario2();
				message.remove(a);
				frame1.dispose();
				frame.setVisible(true);

			}
		});

		question.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				message.add("Question: " + text.getText());
				result.add(text.getText());
				log.setText(String.join("\n", message));
				sce.setText(String.join("\n", result));
			}
		});

		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveAs();
			}
		});

		item2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openButton();
			}
		});

		reorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reorder();
			}
		});

		okie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				okie();
			}
		});

		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edit();
			}
		});

		oki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oki();
			}
		});

		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NEW();
			}
		});

		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yes();
			}
		});

		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				no();
			}
		});

		repeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repeat();
			}
		});

		sound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundbutton();
			}
		});

		voice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				voicebutton();
			}
		});

		charsetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				voicebutton();
			}
		});

		stringsetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stringsetting();
			}
		});

		choices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choices();
			}
		});

		choice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choice();
			}
		});

	}

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

	public int getCategoryPos(String category) {
		return message.indexOf(category);
	}

	public void reorder() {

		frame4.setVisible(true);
		JPanel panel3 = new JPanel(new GridBagLayout());
		JLabel h = new JLabel("Enter the line number of the question/message you want to swap");
		JLabel i = new JLabel("Enter the line number of the question/message you want to swap");
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
		gg.weightx = 0;
		gg.gridx = 1;
		gg.gridy = 1;
		panel3.add(d, gg);
		gg.weightx = 0;
		gg.gridx = 3;
		gg.gridy = 2;
		panel3.add(okie, gg);
		frame4.add(panel3);

	}

	public void okie() {
		String a = d.getText();
		String b = e.getText();
		q = Integer.parseInt(a) - 1;
		t = Integer.parseInt(b) - 1;
		String e = message.get(q);
		String f = message.get(t);
		scenario5();
		scenario6();
		scenario7();
		message.set(q, f);
		message.set(t, e);
		frame4.dispose();
		frame.setVisible(true);
	}

	public void edit() {

		frame3.setVisible(true);
		JPanel panel3 = new JPanel(new GridBagLayout());
		JLabel h = new JLabel("Enter the line number of the question/message you want to edit");
		JLabel i = new JLabel("Enter the question/message");
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
	}

	public void oki() {
		String b = e.getText();
		c = Integer.parseInt(b) - 1;
		String f = message.get(c);
		scenario3();
		scenario4();
		char e = f.charAt(0);
		if (e == 'M') {
			String a = "Message: " + d.getText();
			message.set(c, a);
		} else if (e == 'Q') {
			String a = "Question: " + d.getText();
			message.set(c, a);
		}

		frame3.dispose();
		frame.setVisible(true);

	}

	public void NEW() {

		frame2.setVisible(true);
		JPanel panel3 = new JPanel();
		JLabel h = new JLabel("Are you sure you want a new file? All unsaved data will be lost.");

		panel3.add(h);
		panel3.add(yes);
		panel3.add(no);
		frame2.add(panel3);

	}

	public void yes() {
		message.clear();
		frame2.dispose();
		frame.setVisible(true);
	}

	public void no() {
		frame2.dispose();
		frame.setVisible(true);
	}

	public int scenario() {
		int i = 1;

		for (int start = 0; start < a; start++) {

			if (message.get(start).equals(z)) {
				i++;
			}
		}
		return i;
	}

	public void scenario2() {

		String res = arr[1];
		int a = 0;
		if (number - 1 == 0) {
			int b = result.indexOf(arr[1]);
			result.remove(b);

		} else {

			for (int i = 0; number != a; i++) {

				if (result.get(i).equals(res)) {
					a++;
					if (a == number) {
						result.remove(i);
					}
				}

			}
		}

	}

	public int scenario3() {
		int i = 1;

		for (int start = 0; start < c; start++) {

			if (message.get(start).equals(message.get(c))) {
				i++;
			}
		}
		return i;
	}

	public void scenario4() {
		int number = scenario3();
		int e = 0;
		String w = message.get(c);
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

	public int scenario5() {
		int i = 1;

		for (int start = 0; start < q; start++) {

			if (message.get(start).equals(message.get(q))) {
				i++;
			}
		}
		return i;
	}

	public int scenario6() {
		int i = 1;

		for (int start = 0; start < t; start++) {

			if (message.get(start).equals(message.get(t))) {
				i++;
			}
		}
		return i;
	}

	public void scenario7() {
		int a = scenario5();
		int b = scenario6();
		String c = message.get(q);
		String d = message.get(t);
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

	public void repeat() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JButton srepeat = new JButton("Start Repeat");
		JButton strepeat = new JButton("Stop Repeat");
		
		
		panel.add(srepeat);
		panel.add(strepeat);
		frame.add(panel);

		srepeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start();
			}
		});

		strepeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stop();
			}
		});

	}

	public void start() {
		message.add("Repeat Started");
		result.add("/~repeat");
	}

	public void stop() {
		message.add("Repeat Stopped");
		result.add("/~endrepeat");
		result.add("");
		JFrame frame=new JFrame();
		frame.setVisible(true);
		JPanel panel=new JPanel();
		JLabel label=new JLabel("Button for repeat(Not button 1 or 2):");
	    JTextField text=new JTextField(10);
	    JButton ok=new JButton("ok");
	    panel.add(label);
	    panel.add(text);
	    panel.add(ok);
	    frame.add(panel);
	    ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.add("");
				int a=Integer.parseInt(text.getText())-1;
				String b=Integer.toString(a);
				result.add("/~repeat-button:"+b);
			}
		});
		
	}

	public void soundbutton() {
		message.add("Sound added");
		result.add("/~sound:");
	}

	public void voicebutton() {
		message.add("Voice added");
		result.add("/~set-voice:");
	}

	public void stringsetting() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JTextField d = new JTextField(10);
		JLabel e = new JLabel("Type text here to be set on Braille cell:");
		JButton ok = new JButton("OK");
		panel.add(ok);
		panel.add(d);
		panel.add(e);
		frame.add(panel);

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.add(d.getText());
				result.add("/~disp-string:" + d.getText());
			}
		});
	}

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

	public void choice() {
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
		panel.add(sound, gg);

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
		panel.add(sound, gg);

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
				message.add("Correct scenario added.\n  Sound added \n  Message: " + f.getText());
				if (h.getText().equals("1")) {
					result.add("/~ONEE");
					result.add("/~sound:");
					result.add(f.getText());
					result.add("/~skip:NEXTT");
					result.add("");
				} else if (h.getText().equals("2")) {
					result.add("/~TWOO");
					result.add("/~sound:");
					result.add(f.getText());
					result.add("/~skip:NEXTT");
					result.add("");
				}

				message.add("Incorrect scenario added.\n  Sound added \n  Message: " + m.getText());
					if (j.getText().equals("2")) {
						result.add("/~TWOO");
						result.add("/~sound:");
						result.add(m.getText());
						result.add("/~skip:NEXTT");
					} else if (j.getText().equals("1")) {
						result.add("/~ONEE");
						result.add("/~sound:");
						result.add(m.getText());
						result.add("/~skip:NEXTT");
					}
                
				 result.add("");	
                 result.add("/~NEXTT");
                 result.add("");
                 result.add("/~disp-clearALL");
                 result.add("/~reset-buttons");
			}
		});

	}

}