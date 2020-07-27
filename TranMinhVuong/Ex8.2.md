(i) ab!c + !ab!c  = b !c

f
ab/c  00 01 11 10
0	  f	 t  t  f	
1	  f  f  f  f  

!f = !b c 

ab/c 00 01 11 10
0	 f   f  f  f
1    t   f  f  t

Implicant (b!c)
Test set satisfies IC ( tt,ff,tf,ft)
No valid UTP

ENF (!bc): Test = (b = 1 c = 0) expected true 
TND (!b!c) Test =  (b = 1 c = 0) expected true
TOF (b) Test = (b = 1 c = 1) expected false
LNF (!b!c) Test = (b =1 c = 0) expected true 
LRF (ab) Test = (a = 1 b = 1 c = 1) expected false 
LOF (b) Test (b = 1 c = 1) expected false 
ORF+ (b + !c) Test (b = 1 c = 1) expected false 
ORF* (ab!c!ab!c) Test (a = 1 b = 1 c = 0) expected true 

