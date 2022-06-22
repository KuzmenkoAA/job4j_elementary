package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double rsl1 = Point.distance(2, 4, 4, 8);
        System.out.println("result (2, 4) to (4, 8) " + rsl1);
        double rsl2 = Point.distance(2, 1, 9, 6);
        System.out.println("result (2, 0) to (4, 8) " + rsl2);
        double rsl3 = Point.distance(6, 10, 18, 21);
        System.out.println("result (6, 10) to (18, 21) " + rsl3);
    }
}
