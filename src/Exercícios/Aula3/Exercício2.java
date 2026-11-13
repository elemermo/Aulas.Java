package Exercícios.Aula3;

public class Exercício2 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;

        while (i <= 100) {
            // Verifica se o número é par
            if (i % 2 == 0) {
                soma += i; // Forma correta (equivalente a: soma = soma + i)
            }
            i++; // Incrementa o contador
        }

        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
