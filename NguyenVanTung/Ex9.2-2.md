Answer questions (a) through (d) for the mutant on line 5 in the
method findVal().

(a) If possible, find test inputs that do not reach the mutant.

(b) If possible, find test inputs that satisfy reachability but not
infection for the mutant.

(c) If possible, find test inputs that satisfy infection, but not
propagation for the mutant.

(d) If possible, find test inputs that strongly kill the mutants.

(a) The mutant is always reached, even val is null

(b) Infection always occur, even val is null

(c) Last index of val isn't in numbers[0]

Test: findVal([3, 1, 1], 1)

(d) Any input with val in numbers[0]

Test: findVal([6, 9], 6)