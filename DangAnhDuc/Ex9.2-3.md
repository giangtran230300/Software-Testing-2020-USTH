# Chapter 9 - Section 2 - Exercise 3

## (a) If possible, find test inputs that do not reach the mutant.
If x is null or the empty array(x = null or []), then the mutant is never reached.

## (b) If possible, find test inputs that satisfy reachability but not infection for the mutant.
Any input with all zeroes will reach but not infect. 
Examples are: x = [0] or [0, 0]

## (c) If possible, find test inputs that satisfy infection, but not propagation for the mutant.
Any input with nonzero entries, but with a sum of zero, is fine.
Examples are: x = [1, -1] or [1, -3, 2].

## (d) If possible, find test inputs that strongly kill the mutants.
Any input with a nonzero sum works. 
An example is: x = [1, 2, 3].