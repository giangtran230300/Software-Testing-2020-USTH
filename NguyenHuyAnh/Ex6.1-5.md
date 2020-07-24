- One good solution is to amend the specification to explicitly reject empty patterns with theexception mechanism:
@throws IllegalArgumentException if pattern is empty

- For the implementation to match, it needs an explicit check for an empty pattern, along withan explicit throws clause:
if (patternLen == 0) throw new IllegalArgumentException("PatternIndex.patternIndex");

- Finally a test case should be added to 'PatternIndexTest.java' that calls 'patternIndex()' with an empty pattern and looks for this exception.

- As a forward pointer, the 'patternIndex()' method is subject to significant scrutiny in thegraph testing chapter. Yet the resulting tests don’t uncover this anomaly.
