package Exerícios.Aula2;
import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Recebe o valor das vendas
        System.out.print("Digite o valor total das vendas do funcionário: R$ ");
        double valorVendas = scanner.nextDouble();

        double percentualComissao = 0.0;

        // 2. Define o percentual com base nas regras do exercício
        if (valorVendas < 1000.0) {
            percentualComissao = 0.05;  // Menor que R$1000 -> 5%
        } else if (valorVendas <= 5000.0) {
            percentualComissao = 0.10;  // Entre R$1000 e R$5000 -> 10%
        } else {
            percentualComissao = 0.15;  // Superior a R$5000 -> 15%
        }

        // 3. Calcula o valor final da comissão
        double valorComissao = valorVendas * percentualComissao;

        // 4. Exibe os resultados formatados
        System.out.printf("Total de Vendas: R$ %.2f\n", valorVendas);
        System.out.printf("Percentual de Comissão: %.0f%%\n", (percentualComissao * 100));
        System.out.printf("Valor da Comissão a receber: R$ %.2f\n", valorComissao);

        scanner.close();
    }
}
