package mx.iteso.singleton;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 28/10/2015.
 */
public class DrinkTest {
    private static final float PRICE_TEST = 3.14159f;
    private static final String DESCRIPTION_TEST = "Fleisch";
    private static final String WAITER_TEST = "Kellner";
    private static final String NAME_TEST = "Name";

    Drink drink;
    @Before
    public void setUp()
    {
        drink = new Drink();
    }

    @Test
    public void priceTest()
    {
        drink.setPrice(PRICE_TEST);
        assertEquals(PRICE_TEST, drink.getPrice());
    }

    @Test
    public void descriptionTest()
    {
        drink.setDescription(DESCRIPTION_TEST);
        assertEquals(DESCRIPTION_TEST, drink.getDescription());
    }

    @Test
    public void waiterTest()
    {
        drink.setWaiter(WAITER_TEST);
        assertEquals(WAITER_TEST, drink.getWaiter());
    }

    @Test
    public void nameTest()
    {
        drink.setName(NAME_TEST);
        assertEquals(NAME_TEST, drink.getName());
    }
}
