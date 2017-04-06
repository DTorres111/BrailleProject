package enamel;


import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;

/**
 * A Sound Recorder program in Java Swing.
 * @author www.codejava.net
 *
 */
public class Record extends JFrame implements ActionListener {

	private JButton buttonRecord = new JButton("Record");
	
	private JLabel labelRecordTime = new JLabel("Record Time: 00:00:00");

	private SoundPlay recorder = new SoundPlay();

	private Thread playbackThread;
	private Timer timer;

	private boolean isRecording = false;
	private boolean isPlaying = false;
	
	private JFrame fileNameFrame;
	private JTextField fileName;
	JButton btnOkRecord = new JButton("OK");


	private String saveFilePath;

	// Icons used for buttons
	private ImageIcon iconRecord = new ImageIcon(getClass().getResource(
			"/Record.gif"));
	private ImageIcon iconStop = new ImageIcon(getClass().getResource(
			"/Stop.gif"));
	private ImageIcon iconPlay = new ImageIcon(getClass().getResource(
			"/Play.gif"));

	public Record() {
		super("Swing Sound Recorder");
		setLayout(new FlowLayout());

		buttonRecord.setFont(new Font("Sans", Font.BOLD, 14));
		buttonRecord.setIcon(iconRecord);
		
		labelRecordTime.setFont(new Font("Sans", Font.BOLD, 12));

		add(buttonRecord);
		add(labelRecordTime);
		

		buttonRecord.addActionListener(this);
	
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	/**
	 * Handle click events on the buttons.
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		JButton button = (JButton) event.getSource();
		if (button == buttonRecord) {
			if (!isRecording) {
				startRecording();
			} else {
				stopRecording();
			}

		} 
	}

	/**
	 * Start recording sound, the time will count up.
	 */
	private void startRecording() {
		Thread recordThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					isRecording = true;
					buttonRecord.setText("Stop");
					buttonRecord.setIcon(iconStop);
					
					recorder.start();

				} catch (LineUnavailableException ex) {
					JOptionPane.showMessageDialog(Record.this,
							"Error", "Could not start recording sound!",
							JOptionPane.ERROR_MESSAGE);
					ex.printStackTrace();
				}
			}
		});
		recordThread.start();
		timer = new Timer(labelRecordTime);
		timer.start();
	}

	/**
	 * Stop recording and save the sound into a WAV file
	 */
	private void stopRecording() {
		isRecording = false;
		try {
			timer.cancel();
			buttonRecord.setText("Record");
			buttonRecord.setIcon(iconRecord);
			
			setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

			recorder.stop();

			setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

			saveFile();

		} catch (IOException ex) {
			JOptionPane.showMessageDialog(Record.this, "Error",
					"Error stopping sound recording!",
					JOptionPane.ERROR_MESSAGE);
			ex.printStackTrace();
		}
	}


	/**
	 * Save the recorded sound into a WAV file.
	 */
	
	
	private void saveFile(){
		
		
		fileNameFrame = new JFrame();
		fileNameFrame.setVisible(true);
		fileNameFrame.setBounds(100, 100, 630, 135);
		fileNameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fileNameFrame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		fileNameFrame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblEnterLineNumber = new JLabel("Enter the name of the file: ");
		lblEnterLineNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblEnterLineNumber.setBounds(42, 16, 198, 32);
		panel.add(lblEnterLineNumber);
		
		fileName = new JTextField();
		fileName.setBounds(290, 19, 137, 26);
		panel.add(fileName);
		fileName.setColumns(10);
		
		btnOkRecord.setBounds(457, 18, 82, 29);
		panel.add(btnOkRecord);
		
		
		
		
		
		btnOkRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String name=fileName.getText();
				if (!name.toLowerCase().endsWith(".wav")) {
					name += ".wav";
				}
				
				File newfile= new File("Audio Files//"+name);
				
				
				
				try {
					recorder.save(newfile);
					JOptionPane.showMessageDialog(Record.this,
							"Saved recorded sound to:\n" + "Audio Files Folder");
					
					
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(Record.this, "Error",
							"Error saving to sound file!",
							JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
				
			}
		});
		
		
	
		
		
		
	}
	
	

	


	

	/**
	 * launch the program
	 */
	/*public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Record().setVisible(true);
			}
		});
	}
*/
}

