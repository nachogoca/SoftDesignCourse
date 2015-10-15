package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Menudo;

public class MenudoStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String type, String meat) {
        Pozole pozole = new Menudo();
        return pozole;
    }
}
