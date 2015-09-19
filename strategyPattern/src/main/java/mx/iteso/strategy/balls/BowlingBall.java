package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.HeavyHit;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class BowlingBall extends Ball {
    public BowlingBall() {
        bounceBehavior =  new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        hitBehavior = new HeavyHit();
        type = "Bowling Ball";
    }
}
