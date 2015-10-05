package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.errors.InvalidTacoSize;

import java.util.HashMap;

public class Queso extends CondimentsDecorator {
    Taco taco;
    private HashMap<String, Double> condimentCost;

    public Queso(Taco taco){
        this.taco = taco;
        this.size = taco.getSize();
        setCost();
    }

    private void setCost() {
        condimentCost = new HashMap<String, Double>();
        condimentCost.put(Taco.MINI,2.0);
        condimentCost.put(Taco.REGULAR, 3.0);
        condimentCost.put(Taco.MEGA, 4.0);
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        return taco.cost() + condimentCost.get(this.size);
    }
}
