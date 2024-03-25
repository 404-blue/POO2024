package exerciciosDoAluno3_5;

import java.util.Scanner;

public class Atv09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "° numero:");
            int soma = scanner.nextInt();

            if (soma < 40) {
                total = total + soma;
            }
        }

        System.out.println("Soma: " + total);

        scanner.close();
    }
}