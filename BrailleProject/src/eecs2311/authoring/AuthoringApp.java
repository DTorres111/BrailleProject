package eecs2311.authoring;

import player.audio.JavaSoundRecorder;
import player.audio.Sound;
import player.audio.Voice;

public class AuthoringApp {

    public static void main(String[] args) {
        final JavaSoundRecorder recorder = new JavaSoundRecorder(10000);
 
        // creates a new thread that waits for a specified
        // of time before stopping
        Thread stopper = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(recorder.getRecordTime());
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
