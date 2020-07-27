import org.junit.Test;
import static org.junit.Assert.*;

public class Test_CheckItExpand {
    public static boolean checkItExpand(boolean a, boolean b, boolean c)
    {
        boolean ans = Boolean.parseBoolean(null);
        if (a)
        {
            if (b) ans = true;
            else
            {
                if (c) ans = true;
                else ans = false;
            }
        }
        else ans = false;
        return ans;
    }

    @Test
    public void test_checkItExpand()
    {
        assertFalse(checkItExpand(false, Boolean.parseBoolean(null), Boolean.parseBoolean(null)));
        assertTrue(checkItExpand(true, true, Boolean.parseBoolean(null)));
        assertTrue(checkItExpand(true, false, true));
        assertFalse(checkItExpand(true, false, false));
    }
}
