# Section 8.2
----------------
## Exercise  1

f = abc' + a'bc'

### a
Note: a,b horizontal; c vertical

(a)
- For f:

||00|01|11|10|
|---|---|---|---|---|
|0||1|1||
|1|||||

- For f':

||00|01|11|10|
|---|---|---|---|---|
|0|1|||1|
|1|1|1|1|1|

(b)

f = bc'
f' = b' + c

(c)
For IC, we will be using the nonredudantprime implicant representations.

So in turn, we will have 3 implicants {bc', b', c} in f and f'.

-> Test set {xTF,xFT} satisfy IC


### b
Note: a,b horizontal; c vertical

f = a'b'c'd' + abcd

(a)
For f:

||00|01|11|10|
|---|---|---|---|---|
|00|1||||
|01|||||
|11|||1||
|10||||||

For f':

||00|01|11|10|
|---|---|---|---|---|
|00||1|1|1|
|01|1|1|1|1|
|11|1|1||1|
|10|1|1|1|1|

(b)
f = a'b'c'd' + abcd
f' = ab' + bc' + cd' + a'd

(c)

We shall have 6 implicants:
- a'b'c'd'
- abcd
- bc'
- cd'
- a'd

Test set:
{FFFF,TTTT,TFTF,FTFT} satisfies IC

