package Ex3.Ex3_8;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class MinTest {


    @Test
    public void testMinNumbers() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(64);
        nums.add(300);
        nums.add(30);
        nums.add(63);
        Integer ans = 30;
        assertEquals(ans, Min.min(nums));
    }

    @Test
    public void testMinStrings() {
        ArrayList<String> strs = new ArrayList<>();
        strs.add("A");
        strs.add("D");
        strs.add("G");
        strs.add("N");
        String ans = "A";
        assertEquals(ans, Min.min(strs));
    }

}
