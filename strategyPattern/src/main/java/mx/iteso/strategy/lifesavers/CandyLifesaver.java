package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalFloat;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotFloat;

public class CandyLifesaver extends Lifesaver {
    public CandyLifesaver()
    {
        type = "Candy Lifesaver";
        deflateBehavior = new NotDeflatable();
        floatBehavior = new NotFloat();
    }


}
