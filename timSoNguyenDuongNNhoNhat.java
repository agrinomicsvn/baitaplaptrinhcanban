public static int findSmallestN() {
    int sum = 0;
    int n = 0;

    while (sum <= 10000) {
        n = n + 1;
        sum = sum + n;
    }

    return n;
}
