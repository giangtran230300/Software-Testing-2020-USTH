Ex8.3.5
Answer the following questions for the method check It () below:
public static void checkIt (boolean a, boolean b, boolean c)
	{if (a && (b || c))
	{
		System.out.println ("P is true");
	}
	else
	{
		System.out.println ("P isn’t true");
	}
}

a)  Transform checkIt() to checkItExpand(), a method where each if statement tests exactly one boolean variable.
Instrument checkItExpand() to record which edges aretraversed.(“print” statements are fine for this.)

b)  Derive a GACC test setT1forcheckIt(). 
Derive an Edge Coverage test set T2 for checkItExpand().
Build T2 so that it doesnotsatisfy GACC on the predicate inc heckIt().

a)public static void checkItExpand (boolean a, boolean b, boolean c)
{
  if (a)
  {
    if (b)
    {
      System.out.println ("1: P is true");
    }
    else if (c)
    {
      System.out.println ("2: P is true");
    }
    else
    {
      System.out.println ("3: P isn’t true");
    }
  }
  else
  {
    System.out.println ("4: P isn’t true");
  }
}  











