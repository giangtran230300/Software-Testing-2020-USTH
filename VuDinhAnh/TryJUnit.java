import org.junit.Test;
import static org.junit.Assert.assertEquals;

class Mathology
{
    // If input is bigger than 0 return 1
    // else return 0
    public static int to_binary(float a)
    {
        if (a > 0.0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

public class TryJUnit
{
    @Test
    public static void Test_to_binary()
    {
        assertEquals(Mathology.to_binary(5.6f), 1);
        assertEquals(Mathology.to_binary(-5.6f), 0);
        assertEquals(Mathology.to_binary(0), 0);
    }
    public static void main(String[] args) {
        Test_to_binary();
    }
}
