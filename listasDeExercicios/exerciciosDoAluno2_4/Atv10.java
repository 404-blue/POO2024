package exerciciosDoAluno2_4;

import java.util.Scanner;

public class Atv10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            valores[i] = scanner.nextInt();
        }

        if (valores[0] > valores[1]) {
            System.out.println("O primeiro valor eh maior.");
        } else if (valores[0] < valores[1]) {
            System.out.println("O segundo valor eh maior.");
        } else {
            System.out.println("Eles sao iguais.");
        }

        scanner.close();
    }
}