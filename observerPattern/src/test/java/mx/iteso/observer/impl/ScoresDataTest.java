package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class ScoresDataTest {
    ScoresData scoresData;
    Observer observer;
    ArrayList<Scorer> scorers;

    @Before
    public void setUp() {
        scoresData = new ScoresData();
        observer = mock(Observer.class);

        scorers = new ArrayList<Scorer>();
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testRegisterAndRemoveObserver() {
        scoresData.registerObserver(observer);
        scoresData.removeObserver(observer);
        scoresData.removeObserver(observer);
    }

    @Test
    public void testSetScore() {
        scoresData.registerObserver(observer);
        scoresData.registerObserver(observer);
        scoresData.setScore("testTeam", "testTeam2", 1, 0);

        verify(observer, times(2)).update("testTeam", "testTeam2", 1, 0, scorers);
    }

    @Test
    public void testAddScorerHomeTeam(){
        Scorer scorer = new Scorer("Lewandowski", 9, "Forward", "Bayern");
        scorers.add(scorer);
        scoresData.setScore("Bayern", "testTeam2", 0, 0);

        scoresData.registerObserver(observer);
        scoresData.addScorer(scorer);

        verify(observer, times(1)).update("Bayern", "testTeam2", 1, 0, scorers);
    }

    @Test
    public void testAddScorerHomeAndAwayTeam(){
        scoresData.setScore("Bayern", "OtherTeam", 0, 0);

        scorers.add(new Scorer("Player", 9, "Forward", "OtherTeam"));
        scorers.add(new Scorer("Lewandowski", 9, "Forward", "Bayern"));
        scorers.add(new Scorer("Lewandowski", 9, "Forward", "Bayern"));

        scoresData.registerObserver(observer);

        for(Scorer sc : scorers)
        {
            scoresData.addScorer(sc);
        }

        verify(observer, times(1)).update("Bayern", "OtherTeam", 0, 1, scorers);
        verify(observer, times(1)).update("Bayern", "OtherTeam", 1, 1, scorers);
        verify(observer, times(1)).update("Bayern", "OtherTeam", 2, 1, scorers);
    }

}
