package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

import java.util.HashMap;

public class Quesadilla extends Taco {
    private HashMap<String, Double> tacoCost;
    
    public Quesadilla(String size)
    {
        setSize(size);
        super.description = "Quesadilla";
        setCost();
    }

    private void setCost() {
        tacoCost = new HashMap<String, Double>();
        tacoCost.put(Taco.MINI,12.0);
        tacoCost.put(Taco.REGULAR, 14.0);
        tacoCost.put(Taco.MEGA, 16.0);
    }
    protected void setSize(String size) {
        super.size = size;
    }

    @Override
    public double cost() {
        return tacoCost.get(this.size);
    }
}
