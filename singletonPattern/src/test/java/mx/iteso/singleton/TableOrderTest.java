package mx.iteso.singleton;

import mx.iteso.singleton.tables.Table1;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertSame;

/**
 * Created by Nacho on 28/10/2015.
 */
public class TableOrderTest {
    private TableOrder tableOrder;
    private Drink drink;
    private Dish dish;

    @Before
    public void setUp() {
        tableOrder = Table1.getInstance();
        drink = new Drink();
        dish = new Dish();

        drink.setName("Name");
        drink.setWaiter("Kellner");
        drink.setPrice(3.14f);

        dish.setName("Name");
        dish.setWaiter("Kellner");
        dish.setPrice(3.14f);

    }

    @Test
    public void addDrinkTest() {
        tableOrder.addDrink(drink);
        assertEquals(1, tableOrder.drinks.size());
        assertSame(drink, tableOrder.drinks.get(0));
    }

    @Test
    public void clearDrinksTest() {
        tableOrder.addDrink(drink);
        tableOrder.clearDrinks();
        assertEquals(0, tableOrder.drinks.size());
    }

    @Test
    public void addDishTest() {
        tableOrder.addDish(dish);
        assertEquals(1, tableOrder.dishes.size());
        assertSame(dish, tableOrder.dishes.get(0));
    }

    @Test
    public void clearDishesTest() {
        tableOrder.addDish(dish);
        tableOrder.clearDishes();
        assertEquals(0, tableOrder.dishes.size());
    }

    @Test
    public void printCheckTest()
    {
        tableOrder.printCheck();
        // Nothing to test here.
    }

}
