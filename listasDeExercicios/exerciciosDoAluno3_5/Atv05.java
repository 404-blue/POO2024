package exerciciosDoAluno3_5;

import java.util.Scanner;

public class Atv05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "° valor:");
            int valores = scanner.nextInt();

            total = total + valores;
        }

        float media = total / 10;

        System.out.printf("Media: %.2f\n", media);

        scanner.close();
    }
}