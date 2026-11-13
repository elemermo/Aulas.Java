package Exercícios.Aula1;

import java.util.Scanner;
public class Exercício5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== NOTAS DAS SUAS PROVAS: =====");
        System.out.println("Digite a nota da primeira nota: ");
        int pp = scanner.nextInt();
        System.out.println("");
        System.out.println("Digite a nota da sua segunda prova: ");
        int sp = scanner.nextInt();
        System.out.println("");
        System.out.println("Digite a nota da sua terceira prova: ");
        int tp = scanner.nextInt();

        int soma = (pp + sp + tp) / 3;

        System.out.println("===== MÉDIA DAS SUA PROVAS: =====");
        System.out.println("A méida das Três provas foi de: " + soma);
    }

}