package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;

import java.util.*;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Vector<Ball> myBallVector = new Vector<Ball>();

        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        
        Ball crystal = new CrystalBall();
        TennisBall tennis = new TennisBall();
        BowlingBall bowling = new BowlingBall();
        BeachBall beach  = new BeachBall();
        GolfBall golf = new GolfBall();

        myBallVector.add(soccer);
        myBallVector.add(base);
        myBallVector.add(american);
        myBallVector.add(crystal);
        myBallVector.add(tennis);
        myBallVector.add(bowling);
        myBallVector.add(beach);
        myBallVector.add(golf);

        for(Ball ball : myBallVector)
        {
            System.out.println(ball);
        }

    }
}
