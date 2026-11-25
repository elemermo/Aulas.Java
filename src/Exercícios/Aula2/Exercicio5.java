package Exercícios.Aula2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor da hora normal: ");
        double valorHoraNormal = scanner.nextDouble();

        if (horasTrabalhadas > 40) {
            double horasExtras = horasTrabalhadas - 40;
            double valorHoraExtra = valorHoraNormal * 1.5;
            double totalPagarExtras = horasExtras * valorHoraExtra;
            System.out.println("O funcionário fez horas extras.");
            System.out.printf("Valor a ser pago pelas horas extras: %.2f%n", totalPagarExtras);
        } else {
            System.out.println("O funcionário não fez horas extras.");
        }

        scanner.close();
    }
}
