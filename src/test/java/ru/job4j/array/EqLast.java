package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        int tempLeft = left[left.length - 1];
        int tempRight = right[right.length - 1];
        if (tempLeft == tempRight) {
            return true;
        }
        return false;
    }
}
