package Exercícios.aula5;

import java.util.Scanner;

public class Exercício4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                Digite quantos Graus Fahrenheit está no momento:
                Graus Fahrenheit: """);

        double gf = scanner.nextDouble();

        double gc = convercaoGc(gf);

        System.out.println("Temperatura em Graus Celsius: " + gc + "°C");

    }

    public static double convercaoGc(double gf) {
        return (gf - 32) * 5.0 / 9.0;
    }
}