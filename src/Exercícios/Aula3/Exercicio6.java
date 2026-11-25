package Exercícios.Aula3;

public class Exercicio6 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int contador = 0;

        while (contador < 10) {
            System.out.println(a);
            int proximo = a + b;
            a = b;
            b = proximo;
            contador++;
        }
    }
}
