package mx.iteso.factory;

import mx.iteso.factory.stores.AllPozolesStore;
import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import mx.iteso.factory.toppings.Cebolla;
import mx.iteso.factory.toppings.Limon;

public class PozoleMain {
    public static void main (String[] args) {
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore menuderia = new MenudoStore();

        Pozole pozole = verdeStore.orderPozole("Pozole Verde","pollo");
        System.out.println("First order is: "+ pozole.getName());
        System.out.println();

        pozole = rojoStore.orderPozole("Pozole Rojo","pollo");
        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();

        pozole = menuderia.orderPozole("Menudo","pierna");
        System.out.println("Third order is: "+ pozole.getName());
        System.out.println();

        // All pozole store
        PozoleStore allPozoleStore = new AllPozolesStore();
        pozole = allPozoleStore.orderPozole("Pozole Blanco", "pierna");
        System.out.println("Fourth order is: "+ pozole.getName());
        System.out.println();


        // Pozole with cebolla decorator
        System.out.println("Decorated pozole");
        Pozole decoratedPozole = allPozoleStore.orderPozole("Pozole Blanco","nothing");
        decoratedPozole = new Cebolla(decoratedPozole);
        decoratedPozole = new Limon(decoratedPozole);
        System.out.println("Name: " + decoratedPozole.getName());
        System.out.println("Broth: " + decoratedPozole.broth);
        System.out.println("Toppings: " + decoratedPozole.toppings);

    }
}