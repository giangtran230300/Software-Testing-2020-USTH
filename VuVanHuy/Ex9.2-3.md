a,
If x is null or the empty array, for example : x = null or [], then the mutant is never reached

b,
Any input with all zeroes will reach but not infect. 
Example :x = [0] or [0, 0]

c, 
Any input with nonzero entries, but with a sum of zero, is fine.
Examples: x = [1, -1] or [1, -3, 2]

d,
Any input with a nonzero sum works
Example : x = [1, 2, 3]