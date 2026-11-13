package Exercícios.aula4;
import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Criando e preenchendo o vetor de Strings com 6 caracteres
        String[] vetor = {"a", "b", "f", "x", "z", "m"};

        // 2. Pedindo a letra ao usuário
        System.out.print("Digite uma letra para buscar: ");
        String letraBuscada = scanner.next();

        boolean encontrada = false;

        // 3. Percorrendo o vetor
        for (int i = 0; i < vetor.length; i++) {
            // Usa .equalsIgnoreCase() para ignorar diferença entre maiúsculas e minúsculas
            if (vetor[i].equalsIgnoreCase(letraBuscada)) {
                System.out.println("A letra '" + letraBuscada + "' foi encontrada na posição " + i + " do vetor.");
                encontrada = true;
                break; // Para a busca assim que encontrar a primeira ocorrência
            }
        }

        // 4. Caso a letra não tenha sido encontrada
        if (!encontrada) {
            System.out.println("A letra '" + letraBuscada + "' não está presente no vetor.");
        }

        scanner.close();
    }
}
