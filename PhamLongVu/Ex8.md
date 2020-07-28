8.1-1.
There are four: f <= g, X > 0, M, and e < d + c
8.1-3. There is: 
((mouseT ype = wireless) ∧ ((retail > 100) ∨ (stock > 20)))∨ 
8.1.6. 
p = (a v b) ^ c

type(x) = type(y) = 'int'
type(done) = 'bool'
type(list) = 'list of strings'
type(str) = 'string'

p = (x < y v done) ^ list.contain(str)
TR Clause coverage:

x < y = true
x < y = false
done = true
done = false
list.contain(str) = true
list.contain(str) = false
Test value

x = 3, y = 4
x = 4, y = 3
done = true
done = false
['a', 'b', 'c'].contain('a')
['a', 'b', 'c'].contain('d')
8.2.1.
a)
Karnaugh map for f

c\a, b	00 1	11	1
0		1	1	
1				
Karnaugh map for -f

c\a, b	00	01	11	10
0	1			1
1	1	1	1	1
b) Nonredundant prime implicant representation for f:
f = bc¯	f = bc¯
Nonredundant prime implicant representation for ¯f:	Nonredundant prime implicant representation for ¯f:
¯f = ¯b + c	¯f = ¯b + c
Note that f is a function of b and c only; a is irrelevant.	Note that f is a function of b and c only; a is irrelevant.
c) For IC we choose the nonredundant prime implicant representations. Other choices are possible, of course. This leaves three implicants {bc, ¯¯b, c} in f and ¯f collectively. Test set {xT F, xF T} satisfies IC.
