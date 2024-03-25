package exerciciosDoAluno3_5;

import java.util.Scanner;

public class Atv04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor positivo:");
        int valor = scanner.nextInt();

        for (int i = valor; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}