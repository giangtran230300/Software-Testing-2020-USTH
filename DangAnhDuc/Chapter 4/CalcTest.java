// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// JUnit for Calc.java

import org.junit.*;
import static org.junit.Assert.*;

public class CalcTest
{
    @Test
    public void testAdd()
    {
        assertTrue ("Calc sum incorrect", 5 == Calc.add (2, 3));
    }

    @Test
    public void testSub(){
        assertTrue("The difference is incorrect", 20 == Calc.sub(50,30));
    }

    @Test
    public void testMult(){
        assertTrue("Product is wrong", 15 == Calc.mult(3,5));
    }

    @Test
    public void testDivide(){
        assertTrue("Result is wrong", 9 == Calc.divide(99,11));
    }

    @Test (expected = ArithmeticException.class)
    public void testDevideByZero(){
        Calc.divide(53,0);
    }

    @Test
    public void testDivideFloat(){
        assertTrue("Result is wrong", 5.5 == Calc.divide(11,2));
    }
}