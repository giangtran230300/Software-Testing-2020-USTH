package test;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestCalc {
    @Test
    public void TestAdd() {
        assertEquals(-20, Calc.add(-30, 10));
    }

    @Test
    public void TestSubtract() {
        assertEquals(-100, Calc.subtract(299, 399));
    }

    @Test
    public void TestMultiply() {
        assertEquals(210, Calc.multiply(5, 42));
    }

    @Test
    public void TestDivide() {
        assertEquals(33, Calc.divide(100, 3));
    }

    @Test (expected = ArithmeticException.class)
    public void TestDividedByZero() {
        Calc.divide(10, 0);
    }
    
}
