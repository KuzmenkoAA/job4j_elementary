package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return  value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToDollar(float value) {
        return value * 0.95F;
    }

    public static float dollarToEuro(float value) {
        return value * 1.04F;
    }

    public static void main(String[] args) {

        float euro = Converter.rubleToEuro(140);
        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are " + euro + " euro. Test result: " + passed1);

        float dollar = Converter.rubleToDollar(180);
        float in2 = 180;
        float expected2 = 3;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are " + dollar + " dollar.Test result: " + passed2);

        float conversion1 = Converter.euroToDollar(100);
        float in3 = 100;
        float expected3 = 95;
        float out3 = Converter.euroToDollar(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("140 euro are " + conversion1 + " dollar. Test result " + passed3);

        float conversion2 = Converter.dollarToEuro(100);
        float in4 = 100;
        float expected4 = 104;
        float out4 = Converter.dollarToEuro(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("140 dollar are " + conversion2 + " euro. Test result: " + passed4);
    }
}