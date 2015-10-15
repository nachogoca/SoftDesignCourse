package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.PozoleBlancoPierna;
import mx.iteso.factory.pozoles.PozoleBlancoVacio;

/**
 * Created by Nacho on 08/10/2015.
 */
public class PozoleBlancoStore extends PozoleStore {
    @Override
    protected Pozole createPozole(String type, String meat) {
        if(meat.equals("pierna"))
            return new PozoleBlancoPierna();
        else if(meat.equals("nothing"))
            return new PozoleBlancoVacio();
        return null;
    }
}
