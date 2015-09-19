package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.internal.matchers.Any;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TacitKnowledgePrinterTest {

    private TacitKnowledgePrinter tacitKnowledgePrinter;
    private Printer printer;

    @Before
    public void setUp()
    {
        printer = mock(Printer.class);
        tacitKnowledgePrinter = new TacitKnowledgePrinter(printer);
    }


    //Test printNumbers with a limit of 10
    //Verify print being called 10 times
    @Test
    public void printTenTimesTest() {

        int testNumber = 10;
        tacitKnowledgePrinter.printNumbers(testNumber);
        verify(printer, times(testNumber)).print(anyString());
    }

    //Verify expected result
    @Test
    public void printTest() {
        int numberTest = 10;
        assertEquals(tacitKnowledgePrinter.printNumbers(numberTest),"12Tacit4KnowledgeTacit78TacitKnowledge");
    }

    //Test printNumbers with a limit of 0
    //Verify Exception
    @Test(expected = RuntimeException.class)
    public void invalidLimitTest()
    {
        int numberTest = 0;
        tacitKnowledgePrinter.printNumbers(numberTest);
    }
    @Test
    public void calculate15resultTest() {
        assertEquals(tacitKnowledgePrinter.calculate(15),"TacitKnowledge");
    }

    //What else can we test?
        //What should we verify?


}
