package media.advancedMediaImpl;

import media.AdvanceMediaPlayer;

/**
 * Created by Nacho on 05/11/2015.
 */
public class VlcPlayer implements AdvanceMediaPlayer{
    public void playVlc(String song) {
        System.out.println("Playing " + song + " with VLC player.");
    }

    public void playMp4(String song) {
        System.out.println("Playing " + song + " with VLC player.");
    }
}
