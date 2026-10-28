package Exerícios.Aula1;

import java.util.Scanner;

public class Exercicio2 {
    void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        double valorHora = 7.50;
        System.out.println("===== Digite seus dados trabalisticos: =====");
        System.out.println("Digite suas horas trabalhadas: ");
        double horas = scanner.nextDouble();


        double soma = valorHora * horas;

        System.out.println("===== Valor por hora trabalhada: =====");
        System.out.println("Valor Final "+ soma);


    }
}
