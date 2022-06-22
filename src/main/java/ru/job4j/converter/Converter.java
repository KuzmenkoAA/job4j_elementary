package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 0.95F;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 1.04F;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        float conversion1 = Converter.euroToDollar(140);
        System.out.println("140 euro are " + conversion1 + " dollar.");
        float conversion2 = Converter.dollarToEuro(140);
        System.out.println("140 dollar are " + conversion2 + " euro.");
    }
}