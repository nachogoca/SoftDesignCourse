package advanceMediaImplTest;

import media.advancedMediaImpl.Mp4Player;
import media.advancedMediaImpl.VlcPlayer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 08/11/2015.
 */
public class VlcPlayerTest {
    VlcPlayer vlc = new VlcPlayer();
    @Test
    public void playVlcTest() {
        String song = "[VLC] La cucaracha";
        assertEquals(vlc.playVlc(song), "Playing " + song + " with VLC player.");
    }



    @Test
    public void playMp4Test() {
        String song = "[MP3] La cucaracha";
        assertEquals(vlc.playMp4(song),"Playing " + song + " with VLC player.");

    }
}
