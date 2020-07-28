### Nguyen Le Tuan Duy - BI9-082

# Homework 7 - Section 7.4
## Exercise 3

#### Program code
```
public static void f1 (int x, int y)
{
if (x < y) { f2 (y); } else { f3 (y); };
}
public static void f2 (int a)
{
if (a % 2 == 0) { f3 (2*a); };
}
public static void f3 (int b)
{
if (b > 0) { f4(); } else { f5(); };
}
public static void f4() {... f6()....}
public static void f5() {... f6()....}
public static void f6() {...}
```

#### Test inputs:
- t1 = f1 (0, 0)
- t2 = f1 (1, 1)
- t3 = f1 (0, 1)
- t4 = f1 (3, 2)
- t5 = f1 (3, 4)

#### Answer


(a)

(b)
- t1 ~ p1 [f1, f3, f5, f6]
- t2 ~ p2 [f1, f3, f4, f6]
- t3 ~ p3 [f1, f2]
- t4 ~ p4 [f1, f3, f4, f6]
- t5 ~ p5 [f1, f2, f3, f4, f6]

(c) Let t6 = f5 (42)

Minimal test set: {t5, t6}

(d) Minimal test set: {t1, t5}

(e) Prime paths:
- [f1, f2, f3, f4, f6] Covered by t5
- [f1, f2, f3, f5, f6]
- [f1, f3, f4, f6] Covered by t4
- [f1, f3, f5, f6] Covered by t1