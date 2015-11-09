package media.advancedMediaImpl;

import media.AdvanceMediaPlayer;

/**
 * Created by Nacho on 05/11/2015.
 */
public class Mp4Player implements AdvanceMediaPlayer {
    public String playVlc(String song) {
        String s =  "Playing " + song + " with MP4 player.";
        System.out.println(s);
        return s;
    }

    public String playMp4(String song) {
        String s = "Playing " + song + " with MP4 player.";
        System.out.println(s);
        return s;
    }
}
