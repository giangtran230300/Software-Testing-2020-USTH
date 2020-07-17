package test;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith(value = Parameterized.class)
public class TestMin {
    public String a;
    public String b;
    public String c;
    public String expected;

    public TestMin(String a, String b, String c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameters
    public static Iterable<Object[]> parameters() {
        return Arrays.asList(new Object[][] {{"hello", "welcome", "hi", "hello"}, {"me", "you", "he", "he"}, {"rainy", "sunny", "windy", "rainy"}});
    }

    @Test
    public void Test() {
        LinkedList d = new LinkedList();
        d.add(a);
        d.add(b);
        d.add(c);
        assertEquals(expected, Min.min(d));
    }
}
