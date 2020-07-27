public class CheckItExpand
{
  public static boolean checkItExpand(boolean a, boolean b, boolean c)
    {
        boolean ans = Boolean.parseBoolean(null);
        // Node 1
        if (a) // Node 2
        {
            if (b) ans = true; // Node 3
            else ans = false; // Node 4

            if (c) ans = true; // Node 5
            else ans = false; // Node 6
        } // Node 7
        else ans = false;
        return ans;
    }

  public static void main(String[] args) {
    boolean []inArr = new boolean [argv.length];
    if (argv.length != 3)
    {
       System.out.println ("Usage: java checkItExpand v1 v2 v3");
       return;
    }

    for (int i = 0; i< argv.length; i++)
    {
       inArr [i] = Boolean.parseBoolean(argv[i]);
    }

    checkItExpand (inArr[0], inArr[1], inArr[2]);
  }
}
