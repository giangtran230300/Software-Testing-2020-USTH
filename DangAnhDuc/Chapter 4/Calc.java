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

    static public int sub (int a, int b)
    {
        return a - b;
    }

    static public int mult(int a, int b)
    {
        return a * b;
    }

    static public float divide (float a, float b)
    {
        if (b == 0){
            throw new ArithmeticException ("Can't divide by 0");
        }
        else
            return a / b;
    }
}