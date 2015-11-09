package advanceMediaImplTest;

import media.advancedMediaImpl.Mp4Player;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by Juan on 08/11/2015.
 */
public class Mp4PlayerTest {
    Mp4Player mp4 = new Mp4Player();
    @Test
    public void playVlcTest() {
        String song = "[VLC] La cucaracha";
        assertEquals(mp4.playVlc(song), "Playing " + song + " with MP4 player.");
    }



    @Test
    public void playMp4Test() {
        String song = "[MP3] La cucaracha";
        assertEquals(mp4.playMp4(song), "Playing " + song + " with MP4 player.");
    }
}
