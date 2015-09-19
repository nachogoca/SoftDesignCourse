package mx.iteso.sd.unittest;

public class Calculator
{
    private double currentVal;

    public Calculator(double value)
    {
        currentVal = value;
    }

    public void add(double value)
    {
        currentVal += value;
    }

    public void substract(double value)
    {
        currentVal -= value;
    }

    public void multiply(double value)
    {
        currentVal *= value;
    }

    public void divide(double value)
    {
        if (value == 0.0)
        {
            throw new java.lang.ArithmeticException("Can't divide by zero!");
        }

        currentVal /= value;
    }


    public double getCurrentVal()
    {
        return currentVal;
    }
}