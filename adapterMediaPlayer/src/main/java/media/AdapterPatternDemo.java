package media;

import media.advancedMediaImpl.Mp4Player;
import media.advancedMediaImpl.VlcPlayer;
import media.mediaPlayerImpl.AudioPlayer;

/**
 * Created by Nacho on 05/11/2015.
 */
public class AdapterPatternDemo {
    public static void main(String[] args)
    {
        AdvanceMediaPlayer advanceMediaPlayer = new Mp4Player();
        MediaAdapter mediaAdapter = new MediaAdapter(advanceMediaPlayer);
        AudioPlayer audioPlayer = new AudioPlayer(mediaAdapter);

        audioPlayer.play("[MP3] La cucaracha");
        audioPlayer.play("[MP4] La cucaracha");
        audioPlayer.play("[VLC] La cucaracha");

        advanceMediaPlayer = new VlcPlayer();
        mediaAdapter = new MediaAdapter(advanceMediaPlayer);
        audioPlayer = new AudioPlayer(mediaAdapter);

        audioPlayer.play("[MP3] Los Tucanes De Tijuana - Soy Parrandero");
        audioPlayer.play("[MP4] Los Tucanes De Tijuana - Soy Parrandero");
        audioPlayer.play("[VLC] Los Tucanes De Tijuana - Soy Parrandero");

    }
}
