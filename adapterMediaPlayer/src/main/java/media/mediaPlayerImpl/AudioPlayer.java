package media.mediaPlayerImpl;

import media.MediaAdapter;
import media.MediaPlayer;

/**
 * Created by Nacho on 05/11/2015.
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    public AudioPlayer(MediaAdapter mediaAdapter) {
        this.mediaAdapter = mediaAdapter;
    }

    public void setMediaAdapter(MediaAdapter mediaAdapter){
        this.mediaAdapter = mediaAdapter;
    }

    public void play(String song) {
          if (song.startsWith("[MP3]")) {
              System.out.println("Playing " + song + " with audio player.");
          } else
          {
              mediaAdapter.play(song);
          }
    }
}
