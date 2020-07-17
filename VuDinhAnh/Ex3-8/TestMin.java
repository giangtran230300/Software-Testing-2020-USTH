import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestMin {
    public ArrayList<Integer> al;
    public int min_expect;

    public TestMin (ArrayList<Integer> al, int min_expect)
    {
        this.al = al;
        this.min_expect = min_expect;
    }

    @Parameters
    public static Collection<Object[]> parameters ()
    {
        return Arrays.asList(new Object[][] {{new ArrayList<Integer>(Arrays.asList(1,2,3)), 1},
                                             {new ArrayList<Integer>(Arrays.asList(2,3,4)), 2}});
    }

    @Test
    public void test_min()
    {
        assertTrue(Min.min(al) == min_expect);
    }
}
