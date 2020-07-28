In Section 8.1.6, we introduced the example p = (a ∨ b) ∧ c, and
provided expanded versions of the clauses using program variables.
We then gave specific values to satisfy PC. We also gave truth values
to satisfy CC. Find values for the program variables given to satisfy
CC; that is, refine the abstract tests into concrete test values.

p = (x < y v done) ∧ list.contain(str)

Concrete test values:

* x = 1, y = 3 -> true
* x = 3, y = 1 -> false
* done = true
* done = false
* ["w33", "are", "wld"].contains("w33") -> true
* ["w33", "are", "wld"].contains("no") -> false
