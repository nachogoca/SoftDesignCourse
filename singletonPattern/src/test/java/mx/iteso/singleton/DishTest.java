package mx.iteso.singleton;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 28/10/2015.
 */
public class DishTest {
    private static final float PRICE_TEST = 3.14159f;
    private static final String DESCRIPTION_TEST = "Fleisch";
    private static final String WAITER_TEST = "Kellner";
    private static final String NAME_TEST = "Name";

    Dish dish;
    @Before
    public void setUp()
    {
        dish = new Dish();
    }

    @Test
    public void priceTest()
    {
        dish.setPrice(PRICE_TEST);
        assertEquals(PRICE_TEST, dish.getPrice());
    }

    @Test
    public void descriptionTest()
    {
        dish.setDescription(DESCRIPTION_TEST);
        assertEquals(DESCRIPTION_TEST, dish.getDescription());
    }

    @Test
    public void waiterTest()
    {
        dish.setWaiter(WAITER_TEST);
        assertEquals(WAITER_TEST, dish.getWaiter());
    }

    @Test
    public void nameTest()
    {
        dish.setName(NAME_TEST);
        assertEquals(NAME_TEST, dish.getName());
    }
}
