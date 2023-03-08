package org.goit;

public class SumCalculator {

    public int sum(int n) {

        if (n <= 0) {
            throw new IllegalArgumentException("n must not be zero or less!");
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
