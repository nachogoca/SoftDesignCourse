package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.HeavyHit;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class GolfBall extends Ball {
    public GolfBall(){
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new NotDeflatable();
        hitBehavior = new HeavyHit();
        type = "Golf Ball";
    }
}
