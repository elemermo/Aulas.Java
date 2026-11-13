package Exercícios.aula5;

import java.util.Scanner;

public class Exercício3 {
    public static void main(){
        Scanner input = new Scanner(System.in);

        System.out.printf("""
                        Digite o número que você deseja dobrar:
                            numero desejado: """);

        int numero = input.nextInt();


        int soma = imprimirDobro(numero);
        System.out.println("Dobro do número escolhido: "+soma);

    }

    public static int imprimirDobro(int numero){

        return numero + numero;
    }
}

