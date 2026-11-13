package Exercícios.Aula3;

import java.util.Scanner;

public class Exerxício3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = input.nextInt();

       int fatorial = 1;

       for (int tab = 1; tab <= numero; tab++) {
           fatorial *= tab;

           System.out.println("Numero: "+numero+" fatorial: "+fatorial);
       }
    }
}
