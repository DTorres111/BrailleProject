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
	int i = 0;
	ArrayList<String> message = new ArrayList<String>();
	JButton ok = new JButton("OK");
	JButton okie = new JButton("OK");
	JButton oki = new JButton("OK");
	JTextField d = new JTextField(10);
	JTextArea log = new JTextArea(10, 10);
	JMenuItem item1 = new JMenuItem("Save");
	JTextField e = new JTextField(10);

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
		JButton voice = new JButton("Voice");
		JButton sound = new JButton("Sound");
		JButton reorder = new JButton("Reorder");
		JButton edit = new JButton("Edit");
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

		// panel for log

		log.setLineWrap(true);
		log.setEditable(false);
		JScrollPane scrollV = new JScrollPane(log);
		scrollV.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.add(scrollV);
		frame.add(panel, BorderLayout.SOUTH);

		// for (int i = 0; i < message.length; i++) {
		// message[i] = "";
		// }

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

		// buttons action listener

		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int num = i + 1;
				message.add("Message " + num + ": " + text.getText());
				log.setText(String.join("\n", message));
				i++;
			}

		});

		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1 = new JFrame();
				frame1.setVisible(true);
				JPanel panel3 = new JPanel();
				JLabel h = new JLabel("Enter the number followed by the question/message");

				panel3.add(h);
				panel3.add(d);
				panel3.add(ok);
				frame1.add(panel3);
			}
		});

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String as = d.getText();
				int a = Integer.parseInt(as) - 1;
				message.remove(a);

			}
		});

		question.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = i + 1;
				message.add("Question " + num + ": " + text.getText());
				log.setText(String.join("\n", message));
				i++;

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

		JFrame frame1 = new JFrame();
		frame1.setVisible(true);
		JPanel panel3 = new JPanel(new GridBagLayout());
		JLabel h = new JLabel("Enter the first number followed by the question/message you want to swap");
		JLabel i = new JLabel("Enter the second number followed by the question/message you want to swap");
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
		frame1.add(panel3);

	}

	public void okie() {
		String a = d.getText();
		String b = e.getText();
		int c = Integer.parseInt(a) - 1;
		int d = Integer.parseInt(b) - 1;
		String e = message.get(c);
		String f = message.get(d);
		message.set(c, f);
		message.set(d, e);
	}

	public void edit() {
		JFrame frame1 = new JFrame();
		frame1.setVisible(true);
		JPanel panel3 = new JPanel(new GridBagLayout());
		JLabel h = new JLabel("Enter the number followed by the question/message you want to edit");
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
		frame1.add(panel3);
	}

	public void oki() {
		String b = e.getText();
		int c = Integer.parseInt(b) - 1;
		String f = message.get(c);
		char e = f.charAt(0);
		if (e == 'M') {
			int num = c + 1;
			String a = "Message " + num + ": " + d.getText();
			message.set(c, a);
		} else if (e == 'Q') {
			int num = i + 1;
			String a = "Question " + num + ": " + d.getText();
			message.set(c, a);
		}

	}

}