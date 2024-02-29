package exerciciosDoAluno2_4;

import java.util.Scanner;
import java.util.Arrays;

public class Atv04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1, valor2, valor3;

        System.out.println("Digite o primeiro valor:");
        valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        valor2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor:");
        valor3 = scanner.nextInt();

        int[] valores = { valor1, valor2, valor3 };

        Arrays.sort(valores);

        System.out.println("Valores em ordem crescente:");
        for (int valor : valores) {
            System.out.println(valor);
        }

        scanner.close();

    }
}