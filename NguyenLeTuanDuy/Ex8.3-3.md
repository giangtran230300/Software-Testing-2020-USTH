### Nguyen Le Tuan Duy - BI9-082

# Homework 8 - Section 8.3
## Exercise 3

Clauses:  
- a: curTemp < dTemp - thresholdDiff    
- b: Override  
- c: curTemp < overTemp - thresholdDiff  
- d: timeSinceLastRun > minLag  

Truth table

| Row | a | b | c | d | P | Pa | Pb | Pd | Pd |
|-----|---|---|---|---|---|---------------|---------------|---------------|---------------|
| 1   | T | T | T | T | T |               |               |               | T             |
| 2   | T | T | T |   |   |               |               |               | T             |
| 3   | T | T |   | T | T | T             |               |               | T             |
| 4   | T | T |   |   |   |               |               |               | T             |
| 5   | T | T | T | T | T | T             |               |               |               |
| 6   | T | T |   |   |   |               |               |               | T             |
| 7   | T |   |   | T | T | T             |               |               | T             |
| 8   | T |   |   |   |   |               |               |               | T             |
| 9   |   | T | T | T | T |               | T             | T             | T             |
| 10  |   | T | T |   |   |               |               |               | T             |
| 11  |   | T |   | T |   | T             |               | T             |               |
| 12  |   | T |   |   |   |               |               |               |               |
| 13  |   |   | T | T |   | T             | T             |               |               |
| 14  |   |   | T |   |   |               |               |               |               |
| 15  |   |   |   | T |   | T             |               |               |               |
| 16  |   |   |   |   |   |               |               |               |               |

- pa = (-b || -c) && d  
- pb = -a && c && d  
- pc = -a && b && d  
- pd = a || (b && c)