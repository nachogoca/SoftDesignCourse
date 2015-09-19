package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.LightHit;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class CrystalBall extends Ball {
    public CrystalBall(){
        bounceBehavior = new Crash();
        deflateBehavior = new NotDeflatable();
        hitBehavior = new LightHit();
        type = "Crystal Ball";
    }
}
