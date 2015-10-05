package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.errors.InvalidTacoSize;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Nacho on 01/10/2015.
 */
public class Shrimp extends CondimentsDecorator{
    Taco taco;
    private HashMap<String, Double> condimentCost;

    public Shrimp(Taco taco) throws InvalidTacoSize
    {
        this.taco = taco;
        this.size = taco.getSize();

        if(!hasValidSize())
            throw new InvalidTacoSize("No puede haber tacos de camaron tamaño " + this.size);
        setCost();
    }

    private void setCost() {
        condimentCost = new HashMap<String, Double>();
        condimentCost.put(Taco.MINI,Math.E);
        condimentCost.put(Taco.REGULAR, 2 * Math.E);
        condimentCost.put(Taco.MEGA, 3 * Math.E);
    }
    private boolean hasValidSize(){
        ArrayList<String> validSizes = new ArrayList<String>();
        validSizes.add(REGULAR);
        validSizes.add(MEGA);

        return validSizes.contains(this.size);
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + "de camaron";
    }

    @Override
    public double cost() {
        return taco.cost() + condimentCost.get(this.size);
    }
}
