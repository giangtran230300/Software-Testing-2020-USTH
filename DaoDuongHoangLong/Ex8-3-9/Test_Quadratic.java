import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Quadratic {
    @Test
    public void test_root()
    {
        assertTrue(Quadratic.Root(1, -8, 15));
        assertTrue(Quadratic.Root(1, -4, 4));
        assertFalse(Quadratic.Root(1, -1, 1));
    }
}
