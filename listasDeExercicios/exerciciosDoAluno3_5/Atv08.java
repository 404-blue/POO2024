package exerciciosDoAluno3_5;

import java.util.Scanner;

public class Atv08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "° numero:");
            int soma = scanner.nextInt();

            total = total + soma;
        }

        System.out.println("Soma: " + total);

        scanner.close(); 
    }
}