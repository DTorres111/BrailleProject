package eecs2311.authoring;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;

import player.audio.JavaSoundRecorder;
import player.audio.Sound;
import player.audio.Voice;

public class AuthoringApp {

	
	
    public static void main(String[] args) {
    	
		MainGUI window = new MainGUI();
		window.frame.setVisible(true);
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
		File file=new File("RecordAudio.wav");

        final JavaSoundRecorder recorder = new JavaSoundRecorder(file);
 
        // creates a new thread that waits for a specified
        // of time before stopping
        Thread stopper = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                recorder.finish();
            }
        });
 
        stopper.start();
 
        // start recording
        recorder.start();

    }
    
}
