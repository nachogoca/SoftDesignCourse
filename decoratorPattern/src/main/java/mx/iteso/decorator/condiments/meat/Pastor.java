package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.errors.InvalidTacoSize;

import java.util.HashMap;

public class Pastor extends CondimentsDecorator {
    Taco taco;
    private HashMap<String, Double> condimentCost;

    public Pastor (Taco taco){
        this.taco = taco;
        this.size = taco.getSize();
        setCost();
    }

    private void setCost() {
        condimentCost = new HashMap<String, Double>();
        condimentCost.put(Taco.MINI,1.5);
        condimentCost.put(Taco.REGULAR, 2.0);
        condimentCost.put(Taco.MEGA, 2.5);
    }
    @Override
    public String getDescription() {
        return taco.getDescription() + " de pastor";
    }

    @Override
    public double cost() {
        return taco.cost() + condimentCost.get(this.size);
    }

}
