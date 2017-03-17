package game.frontend;


import javafx.scene.media.AudioClip;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casy
 */

public class Sound {
    private final AudioClip sound;
		private final String son;
		public Sound( String Soun){
			this.son=Soun;
	sound = new AudioClip(Sound.class.getResource(son).toExternalForm());
    sound.play();
			}

    Sound() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	public void stopSound(){
      sound.stop();
    
    
}
}
