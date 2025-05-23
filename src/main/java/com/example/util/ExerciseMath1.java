package com.example.util;

public class ExerciseMath1 {
    public static int factorial(int n) {
        if (n <= 0) throw new IllegalArgumentException("0以下は不正です");
        if (n >= 13) throw new IllegalArgumentException("13以上の値は不正です");
        if (n == 1) return 1;
        return Math.multiplyExact(n, factorial(n - 1));
    }
}
