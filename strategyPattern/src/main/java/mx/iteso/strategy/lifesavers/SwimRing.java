package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.FloatBehavior;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalFloat;

public class SwimRing extends Lifesaver {
    public SwimRing() {
        type = "Swim ring";
        deflateBehavior = new Deflatable();
        floatBehavior = new NormalFloat();
    }
}
