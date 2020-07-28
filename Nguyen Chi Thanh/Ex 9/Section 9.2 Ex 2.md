2. Answer questions (a) through (d) for the mutant on line 5 in the method findVal().

a) If possible, find test inputs that do not reach the mutant.

Answer:

findVal: The mutant is always reached, even if x = null.

b) If possible, find test inputs that satisfy reachability but not infection for the mutant.

Answer:

findVal: Infection always occurs, even if x = null, because i always has the wrong value after initialization in the loop.

c) If possible, find test inputs that satisfy reachability and infection, but not propagation for the mutant.

Answer:

findVal: As long as the last occurrence of val isn’t at numbers[0], the correct output is returned. Examples are: (numbers, val) = ([1, 1], 1) or ([-1, 1], 1) or (null, 0).

d) If possible, find test inputs that strongly kill the mutants.

Answer:

findVal: Any input with val only in numbers[0] works. An example is: (numbers, val) = ([1, 0], 1)
