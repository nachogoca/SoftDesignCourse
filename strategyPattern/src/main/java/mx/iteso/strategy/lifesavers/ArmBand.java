package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalFloat;

public class ArmBand extends Lifesaver {
    public ArmBand() {
        type = "Arm band";
        deflateBehavior = new Deflatable();
        floatBehavior = new NormalFloat();
    }
}
