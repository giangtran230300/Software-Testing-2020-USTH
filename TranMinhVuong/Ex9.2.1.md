Mutant 2: B > A
Reachability Conditions: Always
Infection Conditions: B>A
Propagation Conditions:  B = A 
Test case value A = 4,B = 5 

Mutant 4: Bomb()
Reachability Conditions: B<minVal (which = A)
Infection Conditions: Run normally
Propagation Conditions: Runtime Error (Bomb())
Test case value A = 5,B = 4

Mutant 6 failonZero()
Reachability Conditions: B<minVal (which = A)
Infection Conditions: B = 0
Propagation Conditions:  Runtime Error
Test case value A = 4,B = 0

Mutant 5: minVal = A
Reachability Conditions: B < minVal (which = A)
Infection Conditions: minVal != A
Propagation Conditions:  minVal = A 
Test case value A = 4,B = 0

