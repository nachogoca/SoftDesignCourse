package mx.iteso.factory;

public abstract class PozoleStore {

    public Pozole orderPozole(String type, String meat){
        Pozole pozole;

        pozole = createPozole(type,meat);

        pozole.prepare();
        pozole.serve();

        return pozole;
    }

    protected abstract Pozole createPozole(String type,String meat);
}