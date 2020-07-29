(a)

(1): start

(6): end

Graph:

(1) --> (2)

(2) --> (3)

(3) --> (4)

(3) --> (5)

(4) --> (5)

(5) --> (2)

(2) --> (6)

(6) --> (1)


(b) 

D-U Pairs : [1,3], [1,6], [3,3], [3,6]

D-U Paths : [1,2,6], [1,2,3], [3,5,2,3], [3,5,2,6], [3,4,5,2,3], [3,4,5,2,6]

(c)
A test path p tours subpath q if q is a subpath of p

Test Path:

+ t1 = [1,2,6]

+ t2 = [1,2,3,4,5,2,6]

+ t3 = [1,2,3,5,2,3,4,5,2,6]

+ t4 = [1,2,3,5,2,6]

D-U Paths toured:

+ [1,2,6]

+ [1,2,3], [1,2,6], [3,5,2,6], [3,4,5,2,3], [3,4,5,2,6]

+ [1,2,3], [1,2,6], [3,5,2,3], [3,5,2,6], [3,4,5,2,6]

+ [1,2,3], [1,2,6], [3,5,2,6]


(d)

t2=[1,2,3,4,5,2,3,5,2,6]

This satisfies all defs by touring at least one path for at least one use for each def

(Path toured: [1,2,3], [3,5,2,6])


(e)

t1 = [1,2,6]

t2 = [1,2,3,4,5,2,3,5,2,6]

These two together satisfy all uses coverage by touring at least one path for each def-use pair.

(Paths toured: [1,2,3], [1,2,6], [3,4,5,2,3], [3,5,2,6])


(f)

t1 = [1,2,6]

t2 = [1,2,3,4,5,2,3,5,2,6]

t3 = [1,2,3,5,2,3,4,5,2,6]

These test paths satisfy DU-paths coverage with respect to x.
