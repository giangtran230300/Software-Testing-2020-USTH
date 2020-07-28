import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_PatternIndex {
    @Test
    public void test_patterIndex_found()
    {
        assertEquals(PatternIndex.patternIndex("hello", "ell"), 1);
    }
    @Test
    public void test_patternIndex_emptyString()
    {
        assertEquals(PatternIndex.patternIndex("hello", ""), -1); // Only this fails
        assertEquals(PatternIndex.patternIndex("", "ell"), -1);

    }
    @Test
    public void test_patternIndex_notFound()
    {
        assertEquals(PatternIndex.patternIndex("hello", "hellooo"), -1);
    }
}
