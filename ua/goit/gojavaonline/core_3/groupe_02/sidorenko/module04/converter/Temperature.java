package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module04.converter;

public class Temperature {

    public static double convertToCelsius(double F) {
        return (F - 32) * 5/9;
    }

    public static double convertToFahrenheit(double C) {
        return (C * 9/5) + 32;
    }

    private Temperature(){}

    public static void main(String[] args) {
        double C = -5;
        double F = Temperature.convertToFahrenheit(C);
        System.out.println(String.format("%.2f ºC = %.2f ºF", C, F));

        C = Temperature.convertToCelsius(F);
        System.out.println(String.format("%.2f ºF = %.2f ºC", F, C));

        C = 0;
        F = Temperature.convertToFahrenheit(C);
        System.out.println(String.format("%.2f ºC = %.2f ºF", C, F));

        C = Temperature.convertToCelsius(F);
        System.out.println(String.format("%.2f ºF = %.2f ºC", F, C));

        C = 24.5;
        F = Temperature.convertToFahrenheit(C);
        System.out.println(String.format("%.2f ºC = %.2f ºF", C, F));

        C = Temperature.convertToCelsius(F);
        System.out.println(String.format("%.2f ºF = %.2f ºC", F, C));
    }

}

