package mx.iteso.decorator.errors;

/**
 * Created by Nacho on 04/10/2015.
 */
public class InvalidTacoSize extends Exception {
    public InvalidTacoSize(String message) {
        super(message);
    }
}
