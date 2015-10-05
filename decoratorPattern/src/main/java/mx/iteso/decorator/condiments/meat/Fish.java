package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.errors.InvalidTacoSize;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Nacho on 01/10/2015.
 */
public class Fish extends CondimentsDecorator {
    Taco taco;
    private HashMap<String, Double> condimentCost;

    public Fish(Taco taco) throws InvalidTacoSize {
        this.taco = taco;
        this.size = taco.getSize();
        if(!hasValidSize())
            throw new InvalidTacoSize("No puede haber tacos de pescado tamaño " + this.size);
        setCost();
    }

    private void setCost() {
        condimentCost = new HashMap<String, Double>();
        condimentCost.put(Taco.MINI,Math.PI + 1.5);
        condimentCost.put(Taco.REGULAR,Math.PI + 2.0);
        condimentCost.put(Taco.MEGA,Math.PI + 2.5);
    }
    private boolean hasValidSize(){
        ArrayList<String> validSizes = new ArrayList<String>();
        validSizes.add(REGULAR);
        validSizes.add(MEGA);

        return validSizes.contains(this.size);
    }
    @Override
    public String getDescription() {
        return taco.getDescription() + "de pescado";
    }

    @Override
    public double cost() {
        return taco.cost() + condimentCost.get(this.size);
    }
}
