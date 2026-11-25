package Exercícios.Aula3;


import java.util.Scanner;

public class Exercícios4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int contadorDivisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contadorDivisores++;
            }
        }
        if (contadorDivisores == 2) {
            System.out.println("O número " + numero + " é primo!");
        } else {
            System.out.println("O número " + numero + " NÃO é primo.");
        }

        scanner.close();
    }
}

