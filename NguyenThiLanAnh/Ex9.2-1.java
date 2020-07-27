int Min (int A, int B) {
    int minVal;
    minVal = A;
//Δ1
    minVal = B;
    if (B < A)
//Δ2
    if (B > A)
//Δ3
    if (B < minVal) {
        minVal = B;
//Δ4
        Bomb();
//Δ5
        minVal = A;
//Δ6
        minVal = failOnZero (B);
    }
    return (minVal);
}