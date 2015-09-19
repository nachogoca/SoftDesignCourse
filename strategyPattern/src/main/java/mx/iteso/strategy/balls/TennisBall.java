package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NormalHit;

public class TennisBall extends Ball {
    public TennisBall(){
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        hitBehavior = new NormalHit();
        type = "Tennis Ball";
    }
}
