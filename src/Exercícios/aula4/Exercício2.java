package Exercícios.aula4;
import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetor = {"a", "b", "f", "x", "z", "m"};

        System.out.print("Digite uma letra para buscar: ");
        String letraBuscada = scanner.next();

        boolean encontrada = false;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i].equalsIgnoreCase(letraBuscada)) {
                System.out.println("A letra '" + letraBuscada + "' foi encontrada na posição " + i + " do vetor.");
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("A letra '" + letraBuscada + "' não está presente no vetor.");
        }

        scanner.close();
    }
}
