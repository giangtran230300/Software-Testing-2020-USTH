### Nguyen Le Tuan Duy - BI9-082

# Homework 8 - Section 8.3
## Exercise 55

(a)

```java
public static void checkItExpand (boolean a, boolean b, boolean c){
	if(a){
		if(b){
			System.out.println ("1: P is true");
		}
		else if(c){
			System.out.println ("2: P is true");
		}
		else{
			System.out.println ("3: P is not true");
		}
	}
	else{
		System.out.println ("4: P is not true");
	}
}
```
(b)

T1 for *CheckIt.java*
Test set:  
- t1: {true, true, true} 
- t2: {true, true, false}
- t3: {true, false, true}
- t4: {false, true, true}
- t5: {false, true, false}
- t6: {false, false, true} 


T2 for *CheckItExpand.java*
Test set:  
- t1: {Fxx}
- t2: {TTx}
- t3: {TFT}
- t4: {TFF}