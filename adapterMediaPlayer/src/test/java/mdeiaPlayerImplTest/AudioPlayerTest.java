package mdeiaPlayerImplTest;

import javafx.beans.binding.When;
import media.AdvanceMediaPlayer;
import media.MediaAdapter;
import media.advancedMediaImpl.Mp4Player;
import org.junit.Before;
import media.mediaPlayerImpl.AudioPlayer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

/**
 * Created by Juan on 08/11/2015.
 */
public class AudioPlayerTest {
    AudioPlayer audioPlayer;
    MediaAdapter adapter;
    @Before
    public void setUp(){
        adapter = mock(MediaAdapter.class);
        audioPlayer = new AudioPlayer(adapter);
    }
    @Test
    public void playTestMp3() {
        String song = "[MP3] La cucaracha";
        when(adapter.play(song)).thenReturn("Playing " + song + " with audio player.");
        assertEquals(audioPlayer.play(song),"Playing " + song + " with audio player.");
    }
    @Test
    public void playTestVlc() {
        String song = "[VLC] La cucaracha";
        when(adapter.play(song)).thenReturn("Playing " + song + " with audio player.");
        assertEquals(audioPlayer.play(song),"Playing " + song + " with audio player.");
    }

}
