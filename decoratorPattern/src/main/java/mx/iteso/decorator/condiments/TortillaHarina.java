package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.errors.InvalidTacoSize;

public class TortillaHarina extends CondimentsDecorator {
    Taco taco;

    public TortillaHarina(Taco taco){
        this.taco = taco;
        this.size = taco.getSize();
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " en tortilla de harina";
    }

    @Override
    public double cost() {
        return 4 + taco.cost();
    }
}
