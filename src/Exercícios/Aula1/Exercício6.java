package Exercícios.Aula1;


import java.util.Scanner;

public class Exercício6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== CALCULADORA DO ASAFE: =====");

        System.out.println(" == 1. SOMA              ==");
        System.out.println(" == 2. SUBTRAÇÃO         ==");
        System.out.println(" == 3. MULTIPLICAÇÃO     ==");
        System.out.println(" == 4. DIVISÃO           ==");

        System.out.println(" == Me fale um número para te encaminhar para a operação desejada: ");
        int nu = scanner.nextInt();

        switch (nu){

            case 1:

                System.out.println("== SOMA DE DOIS NÚMEROS: ==");
                System.out.println("");
                System.out.println("== Me fale o primeiro número (inteiro): ");
                int n1 = scanner.nextInt();
                System.out.println("== Me fale o segundo número (inteiro): ");
                int n2 = scanner.nextInt();

                int soma = n1 + n2;

                System.out.println("====     RESULTADO:     ====");
                System.out.println("Resultado da soma: "+ soma);
                break;

            case 2:

                System.out.println("== SUBTRAÇÃO DE DOIS NÚMEROS: ==");
                System.out.println("");
                System.out.println("== Me fale o primeiro número (inteiro): ");
                int sub1 = scanner.nextInt();
                System.out.println("== Me fale o segundo número (inteiro): ");
                int sub2 = scanner.nextInt();

                int subtracao = sub1 - sub2;

                System.out.println("====     RESULTADO:     ====");
                System.out.println("Resultado da soma: "+ subtracao);
                break;

            case 3:

                System.out.println("== MULTIPLICAÇÃO DE DOIS NÚMEROS: ==");
                System.out.println("");
                System.out.println("== Me fale o primeiro número para multiplicar (inteiro): ");
                int mult1 = scanner.nextInt();
                System.out.println("== Me fale o segundo número para multiplicar (inteiro): ");
                int mult2 = scanner.nextInt();

                int mult = mult1 * mult2;

                System.out.println("====     RESULTADO:     ====");
                System.out.println("Resultado da soma: "+ mult);
                break;

            case 4:

                System.out.println("== DIVISÃO DE DOIS NÚMEROS: ==");
                System.out.println("");
                System.out.println("== Me fale o primeiro número para ser dividido (inteiro): ");
                int div1 = scanner.nextInt();
                System.out.println("== Me fale o segundo número para ser o divisor (inteiro): ");
                int div2 = scanner.nextInt();

                int div = div1 / div2;

                System.out.println("====     RESULTADO:     ====");
                System.out.println("Resultado da soma: "+ div);
                break;
        }
    }
}
