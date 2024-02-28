package exerciciosDoAluno2_4;

import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner scanner = new scanner (System.in);

        int valor1, valor2, valor3, soma;

        System.out.println("Primeiro valor");
        valor1 = scanner.nextDouble();

        System.out.println("Segundo valor:");
        valor2 = scanner.nextDouble();

        System.out.println("Terceiro valor:");
        valor3 = scanner.nextDouble();

        if (valor1 > valor2 && valor2 > valor3) {
            soma = valor1 + valor2
        }else if (valor2 > valor1 && valor1 > valor3) {
            
        }

        scanner.close();
    }
}
