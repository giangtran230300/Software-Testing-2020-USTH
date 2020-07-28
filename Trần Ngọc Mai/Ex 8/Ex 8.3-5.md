# Ex 8.3-5: #

(a)
```java
public static void checkItExpand (boolean a, boolean b, boolean c) 
    		{ 
    			if (a) // has a
    				{ 
    				if (b) // has b
    				{ 
    				System.out.println ("P is true"); 
    				} 
    				else if (c) //or has c
    				{ 
    				System.out.println ("P is true"); 
    				} 
    				else //not b or c
    				{ 
    				System.out.println ("P isn’t true"); 
    				} 
    			} 
    			else // not a
    			{ 
    			System.out.println ("P isn’t true"); 
    			} 
		} 
```
