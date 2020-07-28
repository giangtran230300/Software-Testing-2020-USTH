import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class PatternIndexTest
{
   @Test public void Empty_PatternIndex
   {
      assertEquals(" Empty PatternIndex", PatternIndex.patternIndex("", "hot"), -1);
   }

   @Test public void Find_PatternIndex
   {
      assertEquals("Found PatternIndex", PatternIndex.patternIndex("Supa hot fire", "hot"), 16);
   }

   @Test public void notFound() 
   {
      assertEquals("Not found", PatternIndex.patternIndex("Supa hot fire", "fires"), -1);
   }
}