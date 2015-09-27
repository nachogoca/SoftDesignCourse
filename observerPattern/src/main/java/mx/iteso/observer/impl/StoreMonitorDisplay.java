package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorer;
import mx.iteso.observer.Subject;

import java.util.ArrayList;

public class StoreMonitorDisplay implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private Subject scoresData;
    private ArrayList<Scorer> scorers;

    public StoreMonitorDisplay(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    public String display() {
        String display = "[MONITOR]Latest score is:";
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
        this.scorers = scorers;
        //display();
    }

}
