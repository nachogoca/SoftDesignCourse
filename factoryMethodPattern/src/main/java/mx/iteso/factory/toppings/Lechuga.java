package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.Topping;

/**
 * Created by Nacho on 13/10/2015.
 */
public class Lechuga extends Topping {
    Pozole pozole;

    public Lechuga(Pozole pozole)
    {
        this.pozole = pozole;
        this.name = pozole.getName() + getDescription();
        this.broth = pozole.broth;

        pozole.toppings.add("Lechuga");
        this.toppings = pozole.toppings;
    }

    @Override
    public String getDescription() {
        return " with lechuga";
    }
}
