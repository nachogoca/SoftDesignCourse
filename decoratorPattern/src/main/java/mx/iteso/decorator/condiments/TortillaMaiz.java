package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.errors.InvalidTacoSize;

public class TortillaMaiz extends CondimentsDecorator {
    Taco taco;

    public TortillaMaiz (Taco taco){
        this.taco = taco;
        this.size = taco.getSize();
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " en tortilla de maiz";
    }

    @Override
    public double cost() {
        return taco.cost();
    }
}
