package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;

/**
 * Created by Nacho on 08/10/2015.
 */
public class AllPozolesStore extends PozoleStore{
    private MenudoStore menudoStore;
    private PozoleBlancoStore pozoleBlancoStore;
    private PozoleRojoStore pozoleRojoStore;
    private PozoleVerdeStore pozoleVerdeStore;
    private PozolilloStore pozolilloStore;

    public AllPozolesStore()
    {
        menudoStore = new MenudoStore();
        pozoleBlancoStore = new PozoleBlancoStore();
        pozoleRojoStore = new PozoleRojoStore();
        pozoleVerdeStore = new PozoleVerdeStore();
        pozolilloStore = new PozolilloStore();
    }

    protected Pozole createPozole(String type, String meat) {
        if (type.equals("Menudo"))
            return menudoStore.createPozole("Menudo",meat);
        else if (type.equals("Pozole Blanco"))
            return pozoleBlancoStore.createPozole("Pozole Blanco", meat);
        else if (type.equals("Pozole Rojo"))
            return pozoleRojoStore.createPozole("Pozole Rojo", meat);
        else if (type.equals("Pozole Verde"))
            return pozoleVerdeStore.createPozole("Pozole Verde",meat);
        else if (type.equals("Pozolillo"))
            return pozolilloStore.createPozole("Pozolillo",meat);
        else
            return null;
    }

}
