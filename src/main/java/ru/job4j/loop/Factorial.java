package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int i;
        int result = 1;
        for (i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
