package Exercícios.aula5;

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("""
                Digite as três notas do aluno:
                Nota 1: """);
        double n1 = input.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = input.nextDouble();

        System.out.print("Nota 3: ");
        double n3 = input.nextDouble();

        double media = calcularMedia(n1, n2, n3);
        System.out.println("A média do aluno é: " + media);
    }

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }
}