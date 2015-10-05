package mx.iteso.sd.unittest;

import static org.junit.Assert.*;
import org. junit.Before;
import org.junit.Test;

public class CalculatorTest
{
    private Calculator calc;

    @Before
    public void setUp() throws Exception
    {
        calc = new Calculator(4);
    }

    @Test
    public void testAdd()
    {
        calc.add(5);
        assertEquals(9, calc.getCurrentVal(), 0);
    }

    @Test
    public void testSubstract()
    {
        calc.substract(5);
        assertEquals(-1, calc.getCurrentVal(), 0);
    }

    @Test
    public void testMultiply()
    {
        calc.multiply(7);
        assertEquals(28, calc.getCurrentVal(), 0);
    }

    @Test
    public void testDivide()
    {
        calc.divide(2);
        assertEquals(2, calc.getCurrentVal(), 0);
    }

    @Test(expected=java.lang.ArithmeticException.class)
    public void testDivideByZero()
    {
        calc.divide(0.0);
    }

}
