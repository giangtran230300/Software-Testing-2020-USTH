package com.company;

import com.company.MyClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MyClass tester = new MyClass(); // MyClass is tested

        // assert statements
        assertEquals(0, tester.add(0, 10), "0 * 10 must be 0");
        assertEquals(0, tester.add(10, 0), "10 * 0 must be 0");
        assertEquals(0, tester.add(0, 0), "0 * 0 must be 0");
    }
}