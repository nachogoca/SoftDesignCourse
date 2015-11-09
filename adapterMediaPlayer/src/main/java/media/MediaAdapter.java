package media;

import media.advancedMediaImpl.VlcPlayer;

/**
 * Created by Nacho on 05/11/2015.
 */
public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter (AdvanceMediaPlayer advanceMediaPlayer)
    {
        this.advanceMediaPlayer = advanceMediaPlayer;
    }

    public String play(String song) {
        if (song.startsWith("[MP4]")) {
            return advanceMediaPlayer.playMp4(song);
        } else if (song.startsWith("[VLC]")) {
            return advanceMediaPlayer.playVlc(song);
        }

        return "Invalid format.";
    }
}
