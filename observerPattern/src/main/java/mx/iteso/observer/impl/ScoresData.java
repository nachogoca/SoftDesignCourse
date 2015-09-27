package mx.iteso.observer.impl;

import mx.iteso.observer.*;
import org.mockito.internal.matchers.Null;

import java.util.ArrayList;

public class ScoresData implements Subject {
    private ArrayList<Observer> observers;
    private int homeGoals;
    private int awayGoals;
    private String homeTeam;
    private String awayTeam;
    private ArrayList<Scorer> scorers;


    public ScoresData(){
        observers = new ArrayList<Observer>();
        scorers = new ArrayList<Scorer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.homeTeam, this.awayTeam, this.homeGoals, this.awayGoals, this.scorers);
        }
    }

    public void newScore(){
        notifyObservers();
    }

    public void setScore( String homeTeam, String awayTeam, int homeGoals, int awayGoals){
        this.homeTeam = homeTeam;
        this.awayTeam =  awayTeam;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        newScore();
    }

    public void addScorer(Scorer scorer)
    {
        scorers.add(scorer);
        if(scorer.getTeam().equals(this.homeTeam))
        {
            setScore(this.homeTeam, this.awayTeam, homeGoals + 1, awayGoals );
        }
        else
        {
            setScore(this.homeTeam, this.awayTeam, homeGoals, awayGoals + 1 );
        }

    }
}
