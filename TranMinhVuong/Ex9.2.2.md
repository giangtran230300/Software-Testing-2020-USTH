a) Line 5 will always be reached as there is nothing before it that prevents it from being reached minus ClassCastException
b) As the array wrongly starts at 1 instead of zero,as long as line 5 is reached it will get infected
c) If the value is not at numbers[0] then it would not propagate
d) Any array with at least 1 values and the first value equals to the value in the parameters
findVal(numbers[],1)
numbers[] = {1,2}