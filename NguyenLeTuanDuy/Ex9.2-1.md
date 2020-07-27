### Nguyen Le Tuan Duy - BI9-082

# Homework 9 - Section 9.2
## Exercise 1

Mutant 2
- R: Yes  
- I: Yes if the predicate gives a different result.  
- P: The infection will force another path => Yes

Mutant 4
- R: Yes if ( B < A ).  
- I: Bomb() will infect.
- P: True, Bomb() will propagate.

Mutant 5
- R: Yes if ( B < A ) 
- I: Yes if A != B.
- P: minVal got another value, then it will propagate.

Mutant 6
- R: Yes if ( B < A ) 
- I: if B = 0.
- P: fail -> propagate.