# Section 8.1
----------------
## Exercise  1

There are 4 clauses:
- f<= g
- X > 0
- M
- e < d + c

## Exercise  2

There are 4 clauses:
- G
- m > a
- s <= o + n
- U

## Exercise  3

((type = wireless) and ((price > 100) or (amount > 20))) and (( type=non-wireless) and (price>50))

## Exercise  6

```
type(x) = type(y) = 'int'
type(done) = 'bool'
type(list) = 'list of strings'
type(str) = 'string'
p = (x < y or done) and list.container(str)

```

Clause coverage:

x < y = true
x > y = flase
done = true
done = false
list.container(str) = true
list.container(str) = false

For the test value:

x=3, y=4
x=4, y=3
done = true
done = false
['a','b','c'].contain('a')
['a','b','c'].contain('d')