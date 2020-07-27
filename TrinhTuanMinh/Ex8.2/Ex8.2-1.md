8.2-1,

     -   - -
i, abc + abc

a, Karnaugh map for f
              
cd\ab      00    01   11   10
0           1     1
1

                 -
Karnaugh map for f:

cd/ab      00    01   11   10
0           1               1
1           1     1    1    1

b, Nonredundant prime implicant representation for f:

     -
f = bc

                                                -
Nonredundant prime implicant representation for f :

-   -
f = b + c

                -  -
c,Implicants { bc, b, c }

Test set : { xTF, xFT}

Final minimized Test Set: {xFT}

d, 
     -   - -
f: abc + abc

MUTP = { xTF, xFF, xTT}

e, 

     -   - -
f: abc + abc

CUTPNFP = {xTF, xFF, xTT}

        ---- 
ii, f = abcd + abcd

a, Karnaugh map for f 

cd/ab   00   01   11   10
00       1
01 
11                 1
10
                 -
Karnaugh map for f :

cd/ab   00   01   11   10
00            1    1   1  
01       1    1    1   1
11       1    1        1
10       1    1    1   1

b, nonredudant prime implicant representation for f:
    ----
f = abcd + abcd
                                                -
nonredundant prime implicant representation for f :
-    -    -    -   -
f = ab + bc + cd + ad
                    ----         -   -   -  -
c, Six implicant : {abcd, abcd, ab, bc, cd, ad} 
Test set {FFFF, TTTT, TFTF, FTFT}

Final minimized test : {TFTF, FTFT}

d, UTPC = {FFFF, TTTT, TTFF, TTFF, TFFF, FFTT, FFTF}

e, CUTPNFP (10 test) 
+With FFFF we pair {TFFF, FTFF, FFTF, FFFT}
+With TTTT we pair {FTTT, TFTT, TTFT, TTTF}
               -    --
iii, f = ab + abc + abc

a, Karnaugh map for f : 
cd/ab   00   01    11    10
0                  1
1        1         1     1
                 -
Karnaugh map for f : 
cd/ab   00   01    11    10
0        1   1            1
1            1

b, nonredundant prime implicant representation for f :

f = ab + bc
                                                -
nonredundant prime implicant representation for f : 
-   -    --
f = ab + bc
                            -  -   -
c, We have 4 implicants {ab,bc,ab,bc }
Test set :{TTx, xFT, FTx, xFF } 
Final minimzed test : {TTx, xFT, FTx, xFF }

d,UTPC = {TTx, xFT, FTx, xFF }, because  IC test set above used nonredundant prime implicants and each test was a unique true point
 
e, We need to choose unique true points so that all variables that yield near false points are represented. 
To this end, unique true points {TTF,FFT} for f pair up with near false points {FTF,TFF} and {FFF,FTT} respectively.
        ---   -
iv, f = acd + cd + bcd

a, Karnuagh map for f :

cd/ab    00     01     11     10
00        T      T
01        T      T      T      T
11               T      T
10
                 -
Karnaugh map for f :

cd/ab    00     01     11     10
00                      T      T
01 
11       T                     T
10       T      T       T      T
                                                      --   -
b, Nonredundant prime implicant representation for f: ac + cd bd
                                                -  -     -    -
Nonredundant prime implicant representation for f: bc + cd + ad

c,
                      --  -       -    -   -
We have 6 implicant :{ac, cd, bd, bc, cd, ad}

Test set: {F_F_,___FT,_T_T, _FT_, __TF, T___F}

Final minimized Test set: {FTFT, TFTF}

d, 
                       --
MUTP = { FTFF, FFFT -> ac 
                       -
         TFFT, FTFT -> cd

         TTFT, FTTT -> bd }

=> MUTP test set = {FTFF, FFFT, TFFT, FTFT, TTFT, FTTT}

e, 
              --
For implicant ac :
UTP, NFP pair:
-
a -> FFFF, TFFF
-
c -> FTFF, FTTF
              -
For implicant cd :
UTP NFP pair:
-
c -> TFFT, TFTT
-
d -> FTFT, FTFF

For implicant bd:
UTP, NFP pair :
-
b -> TTFT, TFFT
-
d -> FTFT, FTFF
Possible CUTPNFP Test set : {FFFF, FTFF, TFFT, TTFT, FTFT -> UTPs
                             TFFF, FTTF, TFTT, FTFF, TFFT -> NFPs }

f,
--   -
ac + cd + db
              --
For implicant ac
NFPs:
a -> TTFF, TFFT
-
c -> FTTF, FFTT
For implicant !cd:
NFPs:
-
c -> TFTT, FTTT
d -> TFFF, FTFF
For implicant bd:
NFPs:
b -> TFFT, FFTT
d -> TTFF, FTTF
MNFP Test Set = {TTFF, TFFT,FTTF, FFTT,TFTT, FTTT, TFFF, FTFF}.
g,
MUTP Test Set: {FTFF, FFFT, TFFT, FTFT, TTFT, FTTT}
CUTPNFP Test set: { FFFF, FTFF, TFFT, TTFT, FTFT -> UTPs
                    TFFF, FTTF, TFTT, FTFF, TFFT -> NFPs}
MNFP Test Set = {TTFF, TFFT,FTTF, FFTT,TFTT, FTTT, TFFF, FTFF }
Test set to detect all faults (MUMCUT):{FTFF, FFFT, TFFT, FTFT, TTFT, FTTT,FFFF,TFFF, FTTF, TFTT, TTFF, FFTT}