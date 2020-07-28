package hello;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.*;

@RunWith(Parameterized.class)
public class CheckItTest {
    public boolean a, b, c, p;

    public CheckItTest(boolean a, boolean b, boolean c, boolean p) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.p = p;
    }

    @Parameters
    public static Collection<Boolean[]> parameters() {
        return Arrays.asList(new Boolean[][]{
                {true, true, false, true},
                {false, true, false, false},
                {true, false, false, false},
                {true, false, true, true},
                {false, false, false, false}});
    }

    @Test
    public void testCheckIt() {
        assertEquals(p, CheckIt.checkIt(a, b, c));
    }

    @Test
    public void testCheckItExpand() {
        assertEquals(p, CheckIt.checkItExpand(a, b, c));
    }
}
