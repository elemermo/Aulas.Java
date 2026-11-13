package Exercícios.aula4;

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a sua "+ (i + 1) +" nota: ");
            notas[1] = scanner.nextDouble();

            soma += notas[1];
        }

        double media = soma / notas.length;

        System.out.println("sua média é: "+media);

        scanner.close();
    }
}
