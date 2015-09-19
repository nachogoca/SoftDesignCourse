package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FloatBehavior;

/**
 * Created by Nacho on 17/09/2015.
 */
public abstract class Lifesaver {

    public DeflateBehavior deflateBehavior;
    public FloatBehavior floatBehavior;

    public String type;
    public String performInflate() {
        return deflateBehavior.inflate();
    }
    public String performeDeflate() {
        return deflateBehavior.deflate();
    }
    public String performFloat() {
        return floatBehavior.floatt();
    }
    public String display() {
        return "I'm a " + type;
    }



}
