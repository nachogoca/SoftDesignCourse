package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

public class PozoleVerdeStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String type, String meat) {
        if (meat.equals("pollo"))
            return new PozoleVerdePollo();
        else if (meat.equals("cachete") )
            return new PozoleVerdeCachete();
        else if (meat.equals("oreja"))
            return new PozoleVerdeOreja();
        else if (meat.equals("pierna") )
            return new PozoleVerdePierna();
        else if (meat.equals("trompa"))
            return new PozoleVerdeTrompa();
        else return null;
    }
}
