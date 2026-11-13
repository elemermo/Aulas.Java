package Exercícios.Aula2;

import java.util.Scanner;
public class Exercício1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade < 18){
            System.out.println("Acesso nagado!");
        }else{
            System.out.println("Acesso permitido!");
        }
    }
}
