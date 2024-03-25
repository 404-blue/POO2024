package exerciciosDoAluno3_5;

import java.util.Scanner;

public class Atv02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;

        do {
            System.out.println("Digite um valor:");
            valor = scanner.nextInt();
        } while (valor <= 0);

        for (int i = 0; i <= valor; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}