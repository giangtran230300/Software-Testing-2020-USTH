1. Use predicates (i) through (iv) to answer the following questions.

i. f = abc¯+ ¯abc¯

ii. f = ¯a¯bc¯¯d + abcd

iii. f = ab + a¯bc + ¯a¯bc

iv. f = ¯ac¯¯d + ¯cd + bcd

a) Draw the Karnaugh maps for f and ¯f.

b) Find the nonredundant prime implicant representation for f and ¯f.

c) Give a test set that satisfies Implicant Coverage (IC) for f.

d) Give a test set that satisfies Multiple Unique True Points (MUTP) for f.

e) Give a test set that satisfies Corresponding Unique True Point and Near False Point
Pair Coverage (CUTPNFP) for f.

f) Give a test set that satisfies Multiple Near False Points (MNFP) for f.

g) Give a test set that is guaranteed to detect all faults in figure 8.2.

Answer:
i. f = abc¯+ ¯abc¯
a) Karnaugh map for f

|c\a, b|00|01|11|10|
|---|---|---|---|---|
|0||1|1||
|1|||||

Karnaugh map for -f

|c\a, b|00|01|11|10|
|---|---|---|---|---|
|0|1|||1|
|1|1|1|1|1|

    
b) Nonredundant prime implicant representation for f:

f = bc¯

Nonredundant prime implicant representation for ¯f:

¯f = ¯b + c

Note that f is a function of b and c only; a is irrelevant.

c) For IC we choose the nonredundant prime implicant representations. 
Other choices are possible, of course. 
This leaves three implicants {bc, ¯¯b, c} in f and ¯f collectively. 
Test set {xT F, xF T} satisfies IC. 
Note that the second test, which is not a unique true point, satisfies both ¯b and c.

ii. f = ¯a¯bc¯¯d + abcd

b) Nonredundant prime implicant representation for f (Note: as given):

f = ¯a¯bc¯¯d + abcd

Nonredundant prime implicant representation for ¯f:

¯f = a¯b + bc¯+ c¯d + ¯ad

c) For IC we choose the nonredundant prime implicant representations. 
Other choices are possible, of course. 
This leaves six implicants {a¯¯bc¯¯d, abcd, a¯b, bc, c ¯¯d, ad¯ } in f and ¯f collectively. 
Test set {F F F F, T T T T, T F T F, F T F T} satisfies IC. 
Note that the third and fourth tests, which are not unique true points, each satisfy two implicants.
