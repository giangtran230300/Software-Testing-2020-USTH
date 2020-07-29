a) Give tests to satisfy the Each Choice criterion

Four tests are needed

| V1 | V2 | Operation |
| -- | -- | --------- |
| -2 | -2 |     +     |
|  0 |  0 |     -     |
|  2 |  2 |     x     |
|  2 |  2 |     /     |

b) Give test to satisfy the base choice criterion

Eight tests are needed

| V1 | V2 | Operation |
| -- | -- | --------- |
|  2 |  2 |     +     |
| -2 |  2 |     +     |
|  0 |  2 |     +     |
|  2 | -2 |     +     |
|  2 |  0 |     +     |
|  2 |  2 |     -     |
|  2 |  2 |     x     |
|  2 |  2 |     /     |

c) How many tests are needed to satisfy the All Combinations criterion?  (Do not list all the tests!)

3*3*4 = 36 tests

d) Give tests to satisfy the Pair-Wise Coverage criterion.

Since each test can accommodate 3 pairs, at least 11 tests are needed.  The best solution involves one extra test, for a total of 12 tests:
| V1 | V2 | Operation |
| -- | -- | --------- |
|  2 | -2 |     +     |
| -2 |  0 |     -     |
| -2 |  2 |     x     |
|  2 | -2 |     /     |
|  2 |  0 |     +     |
|  0 |  2 |     -     |
|  0 | -2 |     x     |
|  0 |  0 |     /     |
|  0 |  2 |     +     |
|  2 | -2 |    -      |
|  2 |  0 |     x     |
| -2 |  2 |     /     |
