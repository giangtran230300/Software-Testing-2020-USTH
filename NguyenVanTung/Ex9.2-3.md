Answer questions (a) through (d) for the mutant on line 6 in the
method sum().

(a) If possible, find test inputs that do not reach the mutant.

(b) If possible, find test inputs that satisfy reachability but not
infection for the mutant.

(c) If possible, find test inputs that satisfy infection, but not
propagation for the mutant.

(d) If possible, find test inputs that strongly kill the mutants.

(a) When x is null or an empty array, x = null || x = []

(b) Input with array of zeroes will be reachable but not infected nor mutated, x = [0, 0, 0]

(c) Any input with array of non-zero, but the sum equals zero, x = [3, -3]

(d) Any input with a non-zero sum (also array excluding zeroes), x = [4, 2, 1]