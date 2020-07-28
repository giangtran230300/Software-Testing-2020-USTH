Ex 8.1-3

Write the predicate (only the predicate) to represent the requirement: \List all the wireless mice that either retail for more than 100 or for which the store has more than 20 items.Also list non-wireless mice that retail for more than 50."

The predicate describing whether to list a given mouse is:

(((mouseType = wireless) ^ ((retail > 100) \/ (stock > 20)))\/ ((¬ mouseType = wireless) ^ (retail > 50))