### Nguyen Le Tuan Duy - BI9-082

# Homework 9 - Section 9.2
## Exercise 22

#### Program code
```java
public static int findVal(int numbers[], int val)       
   {                                                       
      int findVal = -1;                                    
                                                        
      for (int i=0; i<numbers.length; i++)         // mutant        
      // for (int i=(0+1); i<numbers.length; i++)  
         if (numbers [i] == val)                         
            findVal = i;                                  
         return (findVal);                                    
   }
```

(a)
The mutant is always reached.

(b)
The infection will always happen due to the fact that variable i got wrong value

(c)
([3, 0, 1, 2], 1)

(d)
([1, 2, 3], 1)