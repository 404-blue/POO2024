package exerciciosDoAluno2_4;

import java.util.Scanner;

public class Atv02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1, valor2, valor3;

        System.out.println("Primeiro valor:");
        valor1 = scanner.nextInt();

        System.out.println("Segundo valor:");
        valor2 = scanner.nextInt();

        System.out.println("Terceiro valor:");
        valor3 = scanner.nextInt();

        System.out.println("Maior valor:");

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println(valor1);
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println(valor2);
        } else {
            System.out.println(valor3);
        }

        scanner.close();
    }
}