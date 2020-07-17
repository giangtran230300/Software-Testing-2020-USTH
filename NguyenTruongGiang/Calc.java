// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

public class Calc
{
    static public int add (int a, int b)
    {
        return a + b;
    }

    static public int subtract(int a, int b)
    {
        return a - b;
    }

    static public int multiply(int a, int b)
    {
        return a * b;
    }

    static public float divide(int a, int b)
    {
        if (b == 0){
            throw new ArithmeticException ("Can't divide by 0");
        }
        else
            return (float) a / b;
    }
}
