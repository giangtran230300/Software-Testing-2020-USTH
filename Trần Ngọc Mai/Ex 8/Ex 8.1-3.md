# Ex 8.1-3: #

The requirement: “List all the wireless mice that either retail for more than $100 or for which the store has more than 20 items. Also list non-wireless mice that retail for more than $50.”

The predicate: 

((Type = wireless) ∧ ((retail > 100) ∨ (stock > 20)))∨(¬(Type = wireless) ∧ (retail > 50))