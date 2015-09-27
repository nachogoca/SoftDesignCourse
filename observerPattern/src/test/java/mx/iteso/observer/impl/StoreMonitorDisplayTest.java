package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;
    private ArrayList<Scorer> scorers;

    @Before
    public void setUp() {
        scoresData = new ScoresData();
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData);

        scorers = new ArrayList<Scorer>();
    }

    @Test
    public void testUpdate() {
        storeMonitorDisplay.update("homeTeam", "awayTeam", 1, 0, scorers);
        //Nothing to assert or verify for now
    }

    @Test
    public void testDisplay() {
        scoresData.setScore("home", "away", 0, 0);
        scoresData.addScorer(new Scorer("Player", 9, "Mid", "home"));

        assertEquals("[MONITOR]Latest score is:home (HOME) 1 - away (AWAY) 0\nScorers:Name : Player\n" +
                "Number : 9\n" +
                "Position : Mid\n" +
                "Team : home", storeMonitorDisplay.display());

    }

}
