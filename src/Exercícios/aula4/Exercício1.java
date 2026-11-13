package Exercícios.aula4;

public class Exercício1 {
    public static void main(String[] args) {
        // Declara e inicializa o vetor com 5 números inteiros
        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;

        // Percorre o vetor somando os elementos
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i]; // Equivalente a: soma = soma + numeros[i];
        }

        // Exibe o resultado
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
