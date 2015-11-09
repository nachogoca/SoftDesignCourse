import media.AdvanceMediaPlayer;
import media.MediaAdapter;
import media.advancedMediaImpl.Mp4Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Juan on 08/11/2015.
 */
public class MediaAdapterTest {
    Mp4Player mp4Player;
    MediaAdapter adapter;
    @Before
    public void setUp(){
        mp4Player = mock(Mp4Player.class);
        adapter = new MediaAdapter(mp4Player);
    }
    @Test
    public void playTest(){
        String songMP3 = "[MP4] La cucaracha";
        String songVLC = "[VLC] La cucaracha";
        when(mp4Player.playMp4(songMP3)).thenReturn("Playing " + songMP3 + " with MP4 player.");
        when(mp4Player.playVlc(songVLC)).thenReturn("Playing " + songVLC + " with MP4 player.");
        assertEquals(adapter.play(songMP3), "Playing " + songMP3 + " with MP4 player.");
        assertEquals(adapter.play(songVLC), "Playing " + songVLC + " with MP4 player.");
    }

}
