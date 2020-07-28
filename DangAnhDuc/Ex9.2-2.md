# Chapter 9 - Section 2 - Exercise 2

## (a) If possible, find test inputs that do not reach the mutant.
The mutant is always reached, even if x = null.

## (b) If possible, find test inputs that satisfy reachability but not infection for the mutant.
Infection always occurs, even if x = null, since *i* always has the wrong value after initialization in the loop

## (c) If possible, find test inputs that satisfy infection, but not propagation for the mutant.
As long as the last occurrence of val isn’t at numbers[0], the correct output is returned. 
Examples are: (numbers, val) = ([1, 1], 1) or ([-1, 1], 1) or (null, 0).

## (d) If possible, find test inputs that strongly kill the mutants.
Any input with val only in numbers[0] works. An example is: (numbers, val) = ([0, 1], 0)