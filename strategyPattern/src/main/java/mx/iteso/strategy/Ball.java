package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.HitBehavior;

public abstract class Ball {

    public BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public HitBehavior hitBehavior;

    public String type;

    public Ball() {
    }

    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() { return deflateBehavior.deflate(); }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String performHit(){return hitBehavior.hit();}

    public void setBounceBehavior(BounceBehavior behavior)
    {
        this.bounceBehavior = behavior;
    }

    public void setDeflateBehavior(DeflateBehavior behavior)
    {
        this.deflateBehavior = behavior;
    }

    public void setHitBehavior(HitBehavior behavior){this.hitBehavior = behavior;}

    @Override
    public String toString()
    {
        return roll()+ "\n" + performBounce() + "\n" + performDeflate() + "\n" + performInflate() + "\n" + performHit() + "\n";
    }
}
