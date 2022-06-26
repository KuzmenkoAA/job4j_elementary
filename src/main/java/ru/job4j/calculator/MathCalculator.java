package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
import static ru.job4j.math.MathFunction.division;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double summa(double first, double second) {
        return sumAndMultiply(first, second) + differenceAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivision(40, 20));
        System.out.println("Результат расчета равен: " + summa(60, 10));
    }

}