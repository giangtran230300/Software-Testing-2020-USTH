Ex9.2-2
Answer questions (a) through (d) for the mutant on line 5 in the methodfindVal().

a)If possible, find test inputs that donot reachthe mutant.
b)If possible, find test inputs that satisfy reachability butnot infectionfor the mutant.
c)If possible, find test inputs that satisfy reachability and infection, butnot propagationfor the mutant.
d)If possible, find test inputs that stronglykillthe mutants.

a)findVal:The mutant is always reached
b)findVal:Infection  always  occurs,because i always has the wrong value after initialization in the loop.
c)findVal:As long as the last occurrence of val isn’t at numbers[0], the correct output isreturned.
