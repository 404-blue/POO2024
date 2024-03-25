package exerciciosDoAluno3_5;

import java.util.Scanner;

public class Atv07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        System.out.println("Digite um numero inteiro e positivo:");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            total = total + i;
        }

        System.out.println("Total: " + total);

        scanner.close();
    }
}