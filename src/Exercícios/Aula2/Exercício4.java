package Exercícios.Aula2;
import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor total das vendas do funcionário: R$ ");
        double valorVendas = scanner.nextDouble();

        double percentualComissao = 0.0;

        if (valorVendas < 1000.0) {
            percentualComissao = 0.05;
        } else if (valorVendas <= 5000.0) {
            percentualComissao = 0.10;
        } else {
            percentualComissao = 0.15;
        }

        double valorComissao = valorVendas * percentualComissao;

        System.out.printf("Total de Vendas: R$ %.2f\n", valorVendas);
        System.out.printf("Percentual de Comissão: %.0f%%\n", (percentualComissao * 100));
        System.out.printf("Valor da Comissão a receber: R$ %.2f\n", valorComissao);

        scanner.close();
    }
}
