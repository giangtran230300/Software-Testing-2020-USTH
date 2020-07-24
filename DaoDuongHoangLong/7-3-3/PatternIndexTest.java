// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 7, page 141; chapter 9, page 256
// JUnit tests for PatternIndex.java 

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class PatternIndexTest
{
   @Test (expected = NullPointerException.class)
   public void nullSubject() 
   {
      PatternIndex.patternIndex(null, "cat");
   }

   @Test (expected = NullPointerException.class)
   public void nullPattern() 
   {
      PatternIndex.patternIndex("cat", null);
   }

   @Test public void emptySubject() 
   {
      assertEquals("Empty subject", PatternIndex.patternIndex("", "cat"), -1);
   }

   @Test public void happyPath() 
   {
      assertEquals("Happy path", PatternIndex.patternIndex("The quick brown fox jumped", "fox"), 16);
   }

   @Test public void notFoun() 
   {
      assertEquals("Not found", PatternIndex.patternIndex("The quick brown fox jumped", "foxes"), -1);
   }
}