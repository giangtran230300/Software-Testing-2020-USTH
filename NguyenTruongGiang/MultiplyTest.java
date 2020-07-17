import org.junit.Test;
import static org.junit.Assert.assertEquals;

class Math{
    // If input is bigger than 0 return 1
    // else return 0
    public static int multiply(int a, int b){
        return a*b;
    }
}

public class MultiplyTest{
    @Test
    public static void Test_Multiply()
    {
        assertEquals(Math.multiply(4, 5), 20);
        assertEquals(Math.multiply(2, 5), 10);
        assertEquals(Math.multiply(6, 6), 36);
    }
    public static void main(String[] args) {
        Test_Multiply();
    }
}