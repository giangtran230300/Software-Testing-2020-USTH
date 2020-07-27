Provide reachability conditions, infection conditions, propagation
conditions, and test case values to kill mutants 2, 4, 5, and 6 in
Figure 9.1.

(2)

R: true

I: (B < A) != (B > A) => A != B

P: true

Test case: A = 1; B = 2

(3)

R: true

I: A != minVal

P: none

Test case: A = 3; B = 1

(4)

R: B < A

I: true

P: true

Test case: A = 9; B = 6

(5)

R: B < A

I: A != B

P: true

Test case: A = 5; B = 4

(6)

R: B < A

I: B = A

P: true

Test case: A = 5; B = 5