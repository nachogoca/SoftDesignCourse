package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.errors.InvalidTacoSize;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Nacho on 01/10/2015.
 */
public class Volcan extends Taco {
    private HashMap<String, Double> tacoCost;
    
    public Volcan(String size) throws InvalidTacoSize {
        setSize(size);
        super.description= "Volcán";
        setCost();
    }

    private void setCost() {
        tacoCost = new HashMap<String, Double>();
        tacoCost.put(Taco.REGULAR, 18.0); // Only regular volcanoes!
    }
    private boolean hasValidSize(){
        ArrayList<String> validSizes = new ArrayList<String>();
        validSizes.add(REGULAR);
        return validSizes.contains(this.size);
    }
    protected void setSize(String size) throws InvalidTacoSize {
        super.size = size;
        if(!hasValidSize())
            throw new InvalidTacoSize("Volcán no puede ser de tamaño " + this.size);
    }
    public double cost() { return tacoCost.get(this.size); }
}
