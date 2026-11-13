package Exercícios.Aula2;

import java.util.Scanner;

public class Eercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== SETORES DO MERCADO: =====");
        System.out.println("");
        System.out.println("== .1 Elêtronicos  ==");
        System.out.println("== .2 Alimentos    ==");
        System.out.println("== .3 Vestuarios    ==");

        System.out.println("== Digite qual setor você gostaria de ir: ");
        int setor = scanner.nextInt();

        switch (setor) {

            case 1:
                System.out.println("===== Elêtronicos  =====");
                System.out.println("== Notboock: R$ 3.500.00");
                System.out.println("== Mouse: R$ 550.00");
                System.out.println("== Celular: R$ 2.350.00");
                System.out.println("== Tablet: R$ 1.699.00");

            case 2:
                System.out.println("===== Alimentos  =====");
                System.out.println("== Arroz: R$ 39.99");
                System.out.println("== Feijão: R$ 24.99");
                System.out.println("== macarrão: R$ 15.00");
                System.out.println("== Biscoito Trakinas: R$ 2.99");

            case 3:
                System.out.println("===== Vestuarios  =====");
                System.out.println("== camisa: R$ 39.99");
                System.out.println("== Short: R$ 29.99");
                System.out.println("== Boné: R$ 29.99");
                System.out.println("== 2 Pares de meia: R$ 15.00");

            default:
                System.out.println("Opção inexistente!");

            break;
        }
    }
}
