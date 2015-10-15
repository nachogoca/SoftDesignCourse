package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

public class Menudo extends Pozole {
    public Menudo() {
        name = "Menudo";
        broth = "Caldo Rojo";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }

    @Override
    public String serve() {
        String toServe = "Serving xtra hot in special menudo plate...";
        System.out.println(toServe);
        return toServe;
    }
}
