### Nguyen Le Tuan Duy - BI9-082

# Homework 7 - Section 7.4
## Exercise 3

#### Program code
```java
public class TrashAndTakeOut
   {
   
   public static void trash (int x)    
   {                         
      int m, n;                 
   
      m = 0;                    
      if (x > 0)               
         m = 4;                
      if (x > 5)              
         n = 3*m;              
      else                     
         n = 4*m;             
      int o = takeOut (m, n);
      System.out.println ("o is: " + o);  
   }
   
   
   public static int takeOut (int a, int b) 
   {
      int d, e; 
   
      d = 42*a; 
      if (a > 0) 
         e = 2*b+d; 
      else 
         e = b+d; 
      return (e); 
   } 
   
   
   public static void main (String []argv)
   {  // Driver method for trashAndTakeOut
      // Read an integer from standard input, call trashAndTakeOut()
      if (argv.length ->= 1)
      {
         System.out.println ("Usage: java TrashAndTakeOut v1");
         return;
      }
   
      int x = 0;
      try
      {
         x = Integer.parseInt (argv[0]);
      }
      catch (NumberFormatException e)
      {
         System.out.println ("Entry must be an integer, using 1.");
         x = 1;
      }
   
      trash (x);
   }
}
```
#### Answer


(a)

 Call sites: Line 12

(b)
 Pairs:

- (trash, m, 5) - (takeOut, a, 19)
- (trash, m, 7) - (takeOut, a, 19)
- (trash, n, 9) - (takeOut, b, 21)
- (trash, n, 11) - (takeOut, b, 21)
- (trash, n, 9) - (takeOut, b, 23)
- (trash, n, 11) - (takeOut, b, 23)

(c)
Tests:

- trash(-1)
- trash(3)
- trash(10)