// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// JUnit for Calc.java

import org.junit.*;
import static org.junit.Assert.*;

public class CalcTest
{
    @Test //Test case for addition
    public void testAdd()
    {
        assertTrue ("Addition incorrect", 20 == Calc.add (15, 5));
    }

    @Test  //Test case for subtraction
    public void testSubtract()
    {
        assertTrue("Subtraction incorrect", 10 == Calc.subtract(15, 5));
    }

    @Test //Test case for multiplication
    public void testMultiply()
    {
        assertTrue ("Multiplication incorrect", 75 == Calc.multiply(15, 5));
    }

    @Test //Test case for division
    public void testDivide()
    {
        assertTrue ("Division incorrect", 3 == Calc.divide (15, 5));
    }
}
