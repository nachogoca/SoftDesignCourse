package media.advancedMediaImpl;

import media.AdvanceMediaPlayer;

/**
 * Created by Nacho on 05/11/2015.
 */
public class Mp4Player implements AdvanceMediaPlayer {
    public void playVlc(String song) {
        System.out.println("Playing " + song + " with MP4 player.");
    }

    public void playMp4(String song) {
        System.out.println("Playing " + song + " with MP4 player.");
    }
}
