package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 24/09/2015.
 */
public class MobileAppTest {
    private MobileApp mobileApp;
    private ScoresData scoresData;
    private ArrayList<Scorer> scorers;

    @Before
    public void setUp() {
        scoresData = new ScoresData();
        mobileApp = new MobileApp(scoresData);

        scorers = new ArrayList<Scorer>();
    }

    @Test
    public void testUpdate() {
        mobileApp.update("homeTeam", "awayTeam", 1, 0, scorers);
        //Nothing to assert or verify for now
    }

    @Test
    public void testDisplay() {
        scoresData.setScore("home", "away", 0, 0);
        scoresData.addScorer(new Scorer("Player", 9, "Mid", "home"));

        assertEquals("[MOBILE APP]Latest score is:home (HOME) 1 - away (AWAY) 0\nScorers:\nName : Player\n" +
                "Number : 9\n" +
                "Position : Mid\n" +
                "Team : home", mobileApp.display());

    }

    @Test
    public void testStopNotification()
    {
        ScoresData scoresDataNotification = new ScoresData();
        MobileApp mobileAppNotification = new MobileApp(scoresDataNotification);

        scoresDataNotification.setScore("home", "away", 0, 0);
        scoresDataNotification.addScorer(new Scorer("Player", 9, "Mid", "home"));
        mobileAppNotification.stopNotifications();

        scoresDataNotification.addScorer(new Scorer("Player2", 4, "Mid", "away"));

        // Only get information from the first goal.
        assertEquals("[MOBILE APP]Latest score is:home (HOME) 1 - away (AWAY) 0\nScorers:\nName : Player\n" +
                "Number : 9\n" +
                "Position : Mid\n" +
                "Team : home", mobileAppNotification.display());

    }
}
