Section 6.4

Ex 6-1:

I actually don't get what I need to do in this exercise. If I need to add the tests listed in the tables, but not provided in the book, here are the test.

       // Test 1 of next(): testNext_BaseCase(): C1-T, C2-T, C5-T
       @Test public void testNext_BaseCase()
       {
      assertEquals ("cat", itr.next());
       }
       
       // Test 2 of next(): testNext_C1(): C1-F, C2-F, C5-T
       @Test(expected=NoSuchElementException.class)
       public void testNext_C1()
       {
      itr.next(); itr.next();// consume the cat and the dog
      itr.next();// now empty
       }
       
       // Test 3 of next(): testNext_C2(): C1-T, C2-F, C5-T
       @Test public void testNext_C2()
       {
      list = new ArrayList<String>();
      list.add (null);
      itr = list.iterator();
      assertNull (itr.next());
       }
       
       // Test 4 of next(): testNext_C5(): C1-T, C2-F, C5-F
       @Test(expected=ConcurrentModificationException.class)
       public void testNext_C5()  
       {
      list.add ("elephant");
      itr.next();  
       }

     // Test 1 of remove(): testRemove_BaseCase(): C1-T, C2-T, C3-T, C4-T, C5-T
       @Test public void testRemove_BaseCase()
       {
      itr.next();
      itr.remove();
      assertFalse (list.contains ("cat"));
       }
       
       // Test 2 of remove(): testRemove_C1(): C1-F, C2-F, C3-T, C4-T, C5-T
       @Test public void testRemove_C1()
       {
      itr.next(); itr.next();// consume the cat and the dog
      itr.remove();  // remove dog from list.
      assertFalse (list.contains ("dog"));
       }
       
       // Test 3 of remove(): testRemove_C2(): C1-T, C2-F, C3-T, C4-T, C5-T
       @Test public void testRemove_C2()
       {
      list.add (null);
      list.add ("elephant");
      itr = list.iterator();
      itr.next(); itr.next();// consume the cat and the dog
      itr.next();// consume null; iterator not empty
      itr.remove();  // remove null from list
      assertFalse (list.contains (null));
       }


