package mx.iteso.decorator;

import mx.iteso.decorator.condiments.*;
import mx.iteso.decorator.condiments.meat.*;
import mx.iteso.decorator.errors.InvalidTacoSize;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Volcan;

public class TuTaco {
    public static void main(String[] args) {
        Taco taco = new TacoNormal(Taco.REGULAR);
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        taco = new TortillaMaiz(taco);
        taco = new Chorizo(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);

        System.out.println();
        System.out.println();
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        Taco taco2 = new TacoNormal(Taco.REGULAR);

        taco2 = new TortillaHarina(taco2);
        taco2 = new Lengua(taco2);
        taco2 = new Cilantro(taco2);

        System.out.println();
        System.out.println();
        System.out.println(taco2.getDescription());
        System.out.println("$" + taco2.cost() + " MXN");

        Taco taco3 = new Quesadilla(Taco.REGULAR);

        taco3 = new TortillaHarina(taco3);
        taco3 = new Pastor(taco3);
        taco3 = new Cebolla(taco3);

        System.out.println();
        System.out.println();
        System.out.println(taco3.getDescription());
        System.out.println("$" + taco3.cost() + " MXN");

        Taco taco4;
        try {
            taco4 = new Volcan(Taco.REGULAR);
            taco4 = new Bistec(taco4);
            taco4 = new Queso(taco4);
            taco4 = new Chorizo(taco4);

            System.out.println();
            System.out.println();
            System.out.println(taco4.getDescription());
            System.out.println("$" + taco4.cost() + " MXN");

        } catch (InvalidTacoSize invalidTacoSize) {
            invalidTacoSize.printStackTrace();
        }

        Taco taco5;
        try {
            taco5 = new TacoNormal(Taco.REGULAR);
            taco5 = new Queso(taco5);
            taco5 = new Fish(taco5);

            System.out.println();
            System.out.println();
            System.out.println(taco5.getDescription());
            System.out.println("$" + taco5.cost() + " MXN");

        } catch (InvalidTacoSize invalidTacoSize) {
            invalidTacoSize.printStackTrace();
        }


    }
}
