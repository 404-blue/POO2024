package exerciciosDoAluno2_4;

import java.util.Scanner;

public class Atv03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1, valor2, valor3, soma;

        System.out.println("Digite o primeiro valor:");
        valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        valor2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor:");
        valor3 = scanner.nextInt();

        if (valor1 > valor3 && valor2 > valor3) {
            soma = valor1 + valor2;
        } else if (valor1 > valor2 && valor3 > valor2) {
            soma = valor1 + valor3;
        } else {
            soma = valor2 + valor3;
        }

        System.out.println("Resultado da soma dos dois maiores: " + soma);

        scanner.close();
    }
}