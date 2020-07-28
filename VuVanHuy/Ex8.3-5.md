a.  The code to transform checkIt() to checkItExpand() :

public static void checkItExpand (boolean a, boolean b, boolean c)
{
  if (a)
        {
          if (b)
          {
            System.out.println ("1: P is true");
          }
          else if (c)
          { // !b
             System.out.println ("2: P is true");
          }
          else
          { // !b and !c
             System.out.println ("3: P isn't true");
          }
         }
         else
         { // !a
            System.out.println ("4: P isn't true");
         }
}

b.  If we number the truth table in the usual way, we have : 
GACC pairs for clause a are {1,2,3} x {5,6,7}
GACC pair for clause b is (2, 4).
GACC pair for clause c is (3,4)
So, a GACC test set T1 for checkIt() needs to have test {2,3,4} and one of {5,6,7}
For edge coverage for checkItExpand(), we need Txx and Fxx for clause a, TFx and TTx for clause b, and TFT and TFF for clause c
=> We could pick test set T2 = {1,3,4,8}, which have Edge Coverage on checkItExpand()

c,Code Run both T1 and T2 on both checkIt() and checkItExpand()

publick class check
{
  public static void checkIt (boolean a, boolean b, boolean c)
  {
     if (a && (b || c))
     {
        System.out.println ("1: P is true");
     }
     else
     {
        System.out.println ("3: P isnt' true");
     }
   }

public static void checkItExpand (boolean a, boolean b, boolean c)
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
       System.out.println ("3: P isn't true");
     }
   }
   else
   {
      System.out.println ("4: isn't true");
   }
}

public static void main (String[] args)
{
    boolean a = true;
    boolean b = true;
    boolean c = true;
    for (int i = 0; i < 2; i ++)
    {
      for (int j = 0; j < 2; j++)
       {
         for (int k = 0; k < 2; k++)
          {
            System.out.println (a + " " + b + " " + c);
            System.out.print ("checkIt(): " );
            checkIt(a, b, c);
            System.out.print ("checkItExpand(): ");
            checkItExpand(a, b, c);
            c = !c;
          }
          b = !b;
       }
       a = !a;
    }
}
}