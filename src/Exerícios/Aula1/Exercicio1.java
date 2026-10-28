package Exerícios.Aula1;

import java.util.Scanner;

public class Exercicio1 {
    void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Digite seus dados: ======");
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Agora digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("===== Seus dados: =====");
        System.out.println("");
        System.out.println("Seu nome é " + nome +", e você tem "+idade+" anos!");

        scanner.close();
    }
}