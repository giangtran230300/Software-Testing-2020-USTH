8.1-6,

- The example p = (a V b) ^ c

=>p = ((a>b) V C) ^ y(x)

- We have Clause coverage :

+ (a > b) = true and false
+ C = true and false
+ y(x) = true and false 

So, we will have 2 tests :
+ ((a = 5, b = 4), (C = true),y(x) = true) 
+ ((a = 5, b = 6), (C = false),y(x) = false)