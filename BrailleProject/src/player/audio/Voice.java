package player.audio;

import com.sun.speech.freetts.VoiceManager;

public class Voice {

	private String name;  //the name of the voice that we want to use
	
	private com.sun.speech.freetts.Voice voice; //create an empty instance of the voice class within sun.speech
	
	public Voice(String name){
		this.name = name;
		this.voice = VoiceManager.getInstance().getVoice(this.name); //gets the voice corresponding to the "name" variable
		this.voice.allocate();
	}
	
	public void say(String something){
		
		this.voice.speak(something);
		
	}	
}