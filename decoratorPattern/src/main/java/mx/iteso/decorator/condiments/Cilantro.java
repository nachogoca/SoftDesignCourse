package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.errors.InvalidTacoSize;

public class Cilantro extends CondimentsDecorator {
    Taco taco;

    public Cilantro (Taco taco){
        this.taco = taco;
        this.size = taco.getSize();
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con cilantro";
    }

    @Override
    public double cost() {
        return 0 + taco.cost(); // No extra cost
    }
}
