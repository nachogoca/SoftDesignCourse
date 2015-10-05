package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

import java.util.ArrayList;
import java.util.HashMap;

public class TacoNormal extends Taco{
    private HashMap<String, Double> tacoCost;
    
    public TacoNormal(String size){
        setSize(size);
        super.description = "Taco normal";
        setCost();
    }

    private void setCost() {
        tacoCost = new HashMap<String, Double>();
        tacoCost.put(Taco.MINI,8.0);
        tacoCost.put(Taco.REGULAR, 10.0);
        tacoCost.put(Taco.MEGA, 12.0);
    }

    protected void setSize(String size) {
        super.size = size;
    }

    @Override
    public double cost() {
        return tacoCost.get(this.size);
    }
}
