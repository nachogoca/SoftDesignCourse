package media.advancedMediaImpl;

import media.AdvanceMediaPlayer;

/**
 * Created by Nacho on 05/11/2015.
 */
public class VlcPlayer implements AdvanceMediaPlayer{
    public String playVlc(String song) {
        String s = "Playing " + song + " with VLC player.";
        System.out.println(s);
        return s;
    }

    public String playMp4(String song) {
        String s = "Playing " + song + " with VLC player.";
        System.out.println(s);
        return s;
    }
}
