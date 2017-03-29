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
	String[] message = new String[10];
	JButton ok = new JButton("OK");
	JTextField d = new JTextField(100);
	JTextArea log = new JTextArea(10, 10);
	JMenuItem item1 = new JMenuItem("Save");

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

		// panel for log

		log.setLineWrap(true);
		log.setEditable(false);
		JScrollPane scrollV = new JScrollPane(log);
		scrollV.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.add(scrollV);
		frame.add(panel, BorderLayout.SOUTH);

		for (int i = 0; i < message.length; i++) {
			message[i] = "";
		}

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
				message[i] = "Message " + num + ": " + text.getText();
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
				message[a] = null;

			}
		});

		question.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = i + 1;
				message[i] = "Question " + num + ": " + text.getText();
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
}
