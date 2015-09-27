package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorer;
import mx.iteso.observer.Subject;

import java.util.ArrayList;

/**
 * Created by Nacho on 24/09/2015.
 */
public class MobileApp implements Observer, Displayable {

    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private Subject scoresData;
    private ArrayList<Scorer> scorers;

    public MobileApp(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
        this.scorers = new ArrayList<Scorer>();
    }

    public void stopNotifications()
    {
        scoresData.removeObserver(this);
        scoresData = null;
    }

    public String display() {
        String display = "[MOBILE APP]Latest score is:";
        display += (homeTeam + " (HOME) " + homeGoals + " - "
                + awayTeam + " (AWAY) " + awayGoals);

        if (homeGoals + awayGoals < 1) return display;

        display += "\nScorers:";

        for(Scorer scorer : scorers)
        {
            display += ("\nName : " + scorer.getName() +
                    "\nNumber : " + scorer.getNumber() +
                    "\nPosition : " + scorer.getPosition() +
                    "\nTeam : " + scorer.getTeam());
        }
        return display;
    }

    public void update(String home, String away, int homeGoals, int awayGoals, ArrayList<Scorer> scorers) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.scorers = new ArrayList<Scorer>(scorers); // If scorers is assigned to this.scorers it wouldn't be able to stop getting notifications
        //display();
    }


}
