(a) Draw the Karnaugh maps for f and f.

(b) Find the nonredundant prime implicant representation for f and
f.

(c) Give a test set that satisfies Implicant Coverage (IC) for f.

(d) Give a test set that satisfies Multiple Unique True Points
(MUTP) for f.

(e) Give a test set that satisfies Corresponding Unique True Point
and Near False Point Pair Coverage (CUTPNFP) for f.

(f) Give a test set that satisfies Multiple Near False Points (MNFP)
for f.

(g) Give a test set that is guaranteed to detect all faults in Figure
8.2.

i. f = abc' + a'bc'

(a) f

|a/bc|00  |01  |11  |10  |
|:---|:---|:---|:---|:---|
|0   |0   |1   |1   |0   |
|1   |0   |0   |0   |0   |

f'

|a/bc|00  |01  |11  |10  |
|:---|:---|:---|:---|:---|
|0   |1   |0   |0   |1   |
|1   |1   |1   |1   |1   |

(b) f = bc'; f' = b' + c

(c) Input f = b & !c

(d)

10 - UTP for term b!c

(e)

10 - UTP for term b!c  
00 - NFP for literal b in term b!c  
11 - NFP for literal c in term b!c  

b & !c | !b & !c  

b & !c | b & c

(f) 

00 - NFP for literal b in term b!c  
11 - NFP for literal c in term b!c

b & !c | !b & !c  

b & !c | b & c  

ii. f = a'b'c'd' + abcd

(a) f

|ab/cd|00  |01  |11  |10  |
|:----|:---|:---|:---|:---|
|00   |1   |0   |0   |0   |
|01   |0   |0   |0   |0   |
|11   |0   |0   |1   |0   |
|10   |0   |0   |0   |0   |

f'

|ab/cd|00  |01  |11  |10  |
|:----|:---|:---|:---|:---|
|00   |0   |1   |1   |1   |
|01   |1   |1   |1   |1   |
|11   |1   |1   |0   |1   |
|10   |1   |1   |1   |1   |


(b) f = abc'; f' = a' + b' + c

(c) Input f = b & !c

(d)

100 - UTP for term b!c!d

(e)

100 - UTP for term ab!c  
010 - NFP for literal b in term a!b!c  
110 - NFP for literal c in term b!cd  

b & !c | !b & !c  

b & !c | b & c

(f) 

001 - NFP for literal b in term b!cd  
011 - NFP for literal c in term ab!c

!a & b & c | a & b & !c  

!a & b & c | b & !c & d  

iii. f = ab + ab'c + a'b'c

(a) f

|c/ab|00  |01  |11  |10  |
|:---|:---|:---|:---|:---|
|0   |0   |0   |1   |0   |
|1   |0   |0   |1   |1   |

f'

|a/bc|00  |01  |11  |10  |
|:---|:---|:---|:---|:---|
|0   |1   |1   |0   |1   |
|1   |1   |1   |0   |0   |

(b) f = ab'c; f' = a' + b + c'

(c) Input f = !a & b & !c

(d)

10 - UTP for term b!c

(e)

01 - UTP for term b!c  
10 - NFP for literal b in term !b!c  
11 - NFP for literal c in term b!c  

b & !c | !b & !c  

b & !c | b & c

(f) 

00 - NFP for literal b in term b!c  
11 - NFP for literal c in term b!c

b & !c | !b & !c  

!b & c | b & !c  

iv. f = a'c'd' + c'd + bcd

(a) f

|ab/cd|00  |01  |11  |10  |
|:----|:---|:---|:---|:---|
|00   |0   |0   |0   |1   |
|01   |1   |0   |0   |0   |
|11   |0   |0   |0   |0   |
|10   |0   |0   |1   |0   |

f'

|ab/cd|00  |01  |11  |10  |
|:----|:---|:---|:---|:---|
|00   |1   |1   |1   |0   |
|01   |0   |1   |1   |1   |
|11   |1   |1   |1   |1   |
|10   |1   |1   |0   |1   |

(b) f = abc'd'; f' = a' + b' + c + d

(c) Input f = !a & !b & c & d

(d)

010 - UTP for term !bc!d

(e)

001 - UTP for term !a!bc  
100 - NFP for literal b in term a!b!c  
101 - NFP for literal c in term ab!c  

a & b & !c | a & !b & !c  

!a & b & !c | a & b & c

(f) 

001 - NFP for literal b in term b!c!d  
110 - NFP for literal c in term b!cd

b & !c & d | !b & !c & d 

b & !c & !d | b & c & !d  

