package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int val = (i + 1) * (j + 1);
                array[i][j] = array[i][j] + val;
            }
        }
        return array;
    }
}
