package test;

public class Calc {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
       if (b == 0) {
           throw new ArithmeticException("Cannot divided by zero!");
       }
       else {
           return a / b;
       }
    }
}
