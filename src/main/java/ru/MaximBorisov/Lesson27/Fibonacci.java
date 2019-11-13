package ru.MaximBorisov.Lesson27;

public class Fibonacci {
    public long[] fibnacciIterate(int n) {
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                result[i] = i;
             } else {
                result[i] = result[i - 2] + result[i - 1];
            }
        }
        return result;
    }

    public long[] fibnacciRecurs(int n) {
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            result[i] = getFib(i);
        }
        return result;
    }

    private int getFib(int n) {
        if (n < 2) {
            return n;
        }
        return getFib(n - 2) + getFib(n - 1);
    }
}
