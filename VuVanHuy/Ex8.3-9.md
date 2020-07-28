The "Quadratic.java" program in chapter 7 have 1 predicate and 1 clause.

The test can deal with a>0, a<0, a=0; b>0, b<0, b=0; c>0, c<0, c=0

 About :
+ public void testPositiveRoots() : it will covers a>0, b<0, c>0, 2 small positive roots
+ public void testNegativeRoots() : it will covers b>0, c<0, 2 small negative roots
+ public void testOppositeSignRoots() : it will covers a<0, one root positive, other root negative
+ public void testOneZeroRoot() : it will cover c = 0, one root zero, other root nonzero
+ public void testOneRoot() : it will cover one nonzero root
+ public void testBothZeroRoots() : it will cover b = 0, both roots zero