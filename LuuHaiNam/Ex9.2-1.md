9.2-1,

1, The statement will always be reached. A test will infect if the variables have different values. The infection propagate if we skip the body of the if statement
R: True
I : A "not Equal to" B
P: "Negation symbol" (B < A) "identical to" (A >= B)

2, The statement will always be reacheed. A test will infect if the entire predicate give a different result. The infection will always propagate
R: True
I: (B < A) "not equal to" (B > A) "identical to" A "not equal to" B
P: True

3, The statement will always be reached. A test will infect if the variables have different values. The mutant is equivalent. Propagation is not relevant for and equivalent mutant.
R: True
I: A "not equal to" minVal "identical to" False -> equivalent
P: N/A

4, The statement is reached if the predicate is true. A Bomb() mutant raises an immediate runtime exception, so it always infect. Likewise, Bomb() mutants always propagate
R: B < A
I: True
P: True

5, The statement is reached if the predicate is true. A test will infect if the variables have different values. Since minVal has been given a different value, the infection will always propagate
R: B < A
I: A "not equal to" B
P: True

6,The statement is reached if the predicate is true. A failonZero() mutant raises an immediate runtime exception if the expression is zero. failonZero() mutants always propagate.
R: B < A
I: B = A
P: True