a, graph

use this graph tool http://www.cs.gmu.edu/~offutt/softwaretest/
in graph edges you enter :
1 2
1 7
2 3
2 4
3 2
4 5
4 6
5 6
6 1

initial nodes : 1

final nodes: 7

https://cs.gmu.edu:8443/offutt/coverage/GraphCoverage

b,test requirements for edge-pair coverage
   {[(1,2),(2,3)], [(1,2),(2,4)], [(2,4),(4,5)],[(2,4),(4,6)], [(4,5),(5,6)], [(4,6),(6,1)], [(5,6),(6,1)], [(6,1),(1,7)], [(2,3),(3,2)], [(3,2),(2,3)], [(3,2),(2,4)], [(6,1),(1,2)]}

c, Does the given set of test paths satisfy edge-pair coverage?
t0 = [1, 2, 4, 5, 6, 1, 7] 
t1 = [1, 2, 3, 2, 4, 6, 1, 7]
No tour for the following edge pair:
[(6,1),(1,2)] and  [(3,2),(2,3)].

d, Consider the simple path [3, 2, 4, 5, 6] and test path [1, 2, 3, 2, 4, 6, 1, 2, 4, 5, 6, 1, 7]. Does the test path tour the simple path directly? With a sidetrip? If so, identify the sidetrip.
No, the test path does not tour the simple path directly.  The test path does tour the simple path with a sidetrip.  The sidetrip is [4,6,1,2,4].

e, node coverage, edge coverage, and prime path coverage
 node coverage: [1] [2] [7] [3] [4] [5] [6]

 edge coverage: [1,2] [1,7] [2,3] [2,4] [3,2] [4,5] [4,6] [5,6] [6,1]

 ppc: {3,2,4,5,6,1,7}
{1,2,4,5,6,1}
{2,4,5,6,1,2}
{3,2,4,6,1,7}
{4,5,6,1,2,4}
{4,5,6,1,2,3}
{5,6,1,2,4,5}
{6,1,2,4,5,6}
{1,2,4,6,1}
{2,4,6,1,2}
{4,6,1,2,4}
{4,6,1,2,3}
{6,1,2,4,6}
{2,3,2}
{3,2,3}

f,List test paths from the given set that achieve Node Coverage but not Edge Coverage
on the graph.
{1,2,3,2,4,5,6,1,7}  doesn’t cover {4,6}

g, List test paths from the given set that achieve Edge Coverage but not Prime Path
Coverage on the graph.
{1,2,3,2,4,5,6,1,7}
{1,2,4,6,1,7}




