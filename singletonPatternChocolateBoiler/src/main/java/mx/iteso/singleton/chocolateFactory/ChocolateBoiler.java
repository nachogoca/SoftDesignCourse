package mx.iteso.singleton.chocolateFactory;

/**
 * Created by Nacho on 29/10/2015.
 */
public class ChocolateBoiler {
    private volatile boolean empty; // Synchronized variable :)
    private volatile boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    private static class SingletonHolder {
        public static final ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
    }

    public static ChocolateBoiler getInstance() {
        return SingletonHolder.chocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }

    public void reset()
    {
        empty = true;
        boiled = false;
    }

}