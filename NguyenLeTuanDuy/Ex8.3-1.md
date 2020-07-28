### Nguyen Le Tuan Duy - BI9-082

# Homework 8 - Section 8.3
## Exercise 1

Clauses:  
- a: curTemp < dTemp - thresholdDiff    
- b: Override  
- c: curTemp < overTemp - thresholdDiff  
- d: timeSinceLastRun > minLag  

Predicates:
- p1: ((curTemp < dTemp - thresholdDiff) || (override && curTemp < overTemp - thresholdDiff)) && (timeSinceLastRun > minLag)
- p2: override 