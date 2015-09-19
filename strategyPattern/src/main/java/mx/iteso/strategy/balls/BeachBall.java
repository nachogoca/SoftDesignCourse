package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.LightHit;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public class BeachBall extends Ball {
    public BeachBall(){
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new Deflatable();
        hitBehavior = new LightHit();
        type = "Beach Ball";
    }
}
