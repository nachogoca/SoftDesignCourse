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

    public String play(String song) {
          if (song.startsWith("[MP3]")) {
              String s ="Playing " + song + " with audio player.";
              System.out.println(s);
              return s;
          } else
          {
              return mediaAdapter.play(song);
          }
    }
}
