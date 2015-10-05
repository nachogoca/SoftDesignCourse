package mx.iteso.decorator;

public abstract class Taco {
    public String description = "Any Taco";

    public String getSize() {
        return size;
    }
    protected String size = REGULAR;

    public final static String MINI = "Mini";
    public final static String REGULAR = "Regular";
    public final static String MEGA = "Mega";

    public String getDescription(){
        return description + ", tamaño " + size + ", ";
    }
    public abstract double cost();

}
