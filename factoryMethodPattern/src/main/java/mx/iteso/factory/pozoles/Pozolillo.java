package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Nacho on 08/10/2015.
 */
public class Pozolillo extends Pozole {
    public Pozolillo()
    {
        name = "Pozolillo";
        broth = "Caldo rojo";
        toppings.add("Elotitos");
        toppings.add("Mucho limón");
    }

    @Override
    public String serve() {
        String toServe = "Serving a pozolillo to a jalisquillo";
        System.out.println(toServe);
        return toServe;
    }
}
