a. Draw graph

b.
* Nonredundant prime implicant representation for f:
  * f=  *abcd* + abcd
* Nonredundant prime implicant representation for ̄f: ̄
  * f= ab + bc + cd + ad
  
c. We have 4 implicants {ab,bc,ab,bc }
Test set :{TTx, xFT, FTx, xFF } 
Final minimzed test : {TTx, xFT, FTx, xFF }

d. UTPC = {TTx, xFT, FTx, xFF }, because  IC test set above used nonredundant prime implicants and each test was a unique true point

e. We need to choose unique true points so that all variables that yield near false points are represented. 
To this end, unique true points {TTF,FFT} for f pair up with near false points {FTF,TFF} and {FFF,FTT} respectively.