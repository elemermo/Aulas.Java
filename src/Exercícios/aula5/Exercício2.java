package Exercícios.aula5;

import java.util.Scanner;

public class Exercício2 {
    public static void main(){
        Scanner input = new Scanner(System.in);

        System.out.printf("""
                        Digite dois números:
                            numero 1:
                        """);
        int numero1 = input.nextInt();

        System.out.printf("""
                            numero 2:
                        """);
        int numero2 = input.nextInt();

        int soma = imprimirSoma(numero1, numero2);
        System.out.println("Soma dos numeros : "+soma);

    }

    public static int imprimirSoma(int numero1, int numero2){

        return numero1 + numero2;
    }
}
