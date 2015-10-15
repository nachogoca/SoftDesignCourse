package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Pozolillo;

/**
 * Created by Nacho on 08/10/2015.
 */
public class PozolilloStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String type, String meat) {
        return new Pozolillo();
    }
}
