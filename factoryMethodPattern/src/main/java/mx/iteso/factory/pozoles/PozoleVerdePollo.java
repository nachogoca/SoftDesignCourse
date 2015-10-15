package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

public class PozoleVerdePollo extends Pozole {
    public PozoleVerdePollo() {
        name = "Pozole Verde con Pollo";
        broth = "Caldo Verde";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}