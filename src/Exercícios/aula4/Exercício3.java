package Exercícios.aula4;
import java.util.Scanner;

public class Exercício3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Criando o vetor de 8 posições booleanas
        boolean[] vetor = new boolean[3];
        int contadorTrue = 0;

        // 2. Pedindo os 8 valores ao usuário
        System.out.println("Digite 'true' ou 'false' para cada uma das 8 posições:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextBoolean();

            // 3. Verificando se o valor digitado é true
            if (vetor[i]) {
                contadorTrue++; // Equivale a: contadorTrue = contadorTrue + 1;
            }
        }

        // 4. Exibindo o resultado
        System.out.println("\nQuantidade de valores 'true' inseridos: " + contadorTrue);

        scanner.close();
    }
}
