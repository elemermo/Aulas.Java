package Exerícios.Aula2;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorOriginal = scanner.nextDouble();
        double valorFinal = valorOriginal;
        double percentualDesconto = 0.0;

        if (valorOriginal > 100) {
            percentualDesconto = 0.10; // 10% de desconto
        }else {
            percentualDesconto = 0.0;  // Sem desconto
        }

        double valorDesconto = valorOriginal * percentualDesconto;
        valorFinal = valorOriginal - valorDesconto;

        System.out.printf("Valor original: R$ %.2f\n ", valorOriginal);
        System.out.printf("Desconto aplicado: %.0f%%\n", (percentualDesconto * 100));
        System.out.printf("Valor com desconto: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}
