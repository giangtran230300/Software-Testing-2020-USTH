import org.junit.Test;
import static org.junit.Assert.*;

public class Test_CheckIt {
    public static boolean checkIt (boolean a, boolean b, boolean c)
    {
        if (a && (b || c))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Test
    public void test_checkIt()
    {
        assertTrue(checkIt(true, true, true));
        assertFalse(checkIt(false, true, true));
        assertTrue(checkIt(true, true, false));
        assertFalse(checkIt(false, true, false));
        assertTrue(checkIt(true, false, true));
        assertFalse(checkIt(false, false, true));
    }
}
