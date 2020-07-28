b,Give the path in the graph followed by each test.
 t1: [f1, f3, f5, f6]
 t2: [f1, f3, f4, f6]
 t3: [f1, f2]
 t4: [f1, f3, f4, f6]
 t5: [f1, f2, f3, f4, f6]

c, Find a minimal test set that achieves Node Coverage
Three possibilities: {t1, t2, t3}, {t1, t3, t4}, or {t1, t5}.

d, Find a minimal test set that achieves Edge Coverage.
One possibility: {t1, t5}

e, Give the prime paths in the graph. Which prime path is not covered by any of the tests
above?
There are 4 prime paths: { [f1, f2, f3, f4, f6], [f1, f2, f3, f5, f6], [f1,
f3, f4, f6], [f1, f3, f5, f6] }. The second of these paths is not covered by the
given test paths.